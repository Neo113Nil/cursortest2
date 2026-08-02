package androidx.biometric;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.biometric.FingerprintDialogFragment;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ListFuture;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.ExecutorDelivery$1;
import com.bugsnag.android.Client;
import com.fillr.n;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public class BiometricFragment extends Fragment {
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    public BiometricViewModel mViewModel;

    public abstract class Api29Impl {
        public static void setConfirmationRequired(BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        public static void setDeviceCredentialAllowed(BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    public abstract class Api30Impl {
        public static void setAllowedAuthenticators(BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    public final void cancelAuthentication(int i) {
        if (i == 3 || !this.mViewModel.mIsIgnoringCancel) {
            isUsingFingerprintDialog();
            BiometricViewModel biometricViewModel = this.mViewModel;
            if (biometricViewModel.mCancellationSignalProvider == null) {
                biometricViewModel.mCancellationSignalProvider = new Recorder.AnonymousClass4(2, false);
            }
            Recorder.AnonymousClass4 anonymousClass4 = biometricViewModel.mCancellationSignalProvider;
            CancellationSignal cancellationSignal = (CancellationSignal) anonymousClass4.val$audioErrorConsumer;
            if (cancellationSignal != null) {
                try {
                    CancellationSignalProvider$Api16Impl.cancel(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                anonymousClass4.val$audioErrorConsumer = null;
            }
            androidx.core.os.CancellationSignal cancellationSignal2 = (androidx.core.os.CancellationSignal) anonymousClass4.this$0;
            if (cancellationSignal2 != null) {
                try {
                    cancellationSignal2.cancel();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                anonymousClass4.this$0 = null;
            }
        }
    }

    public final void dismiss() {
        BiometricViewModel biometricViewModel = this.mViewModel;
        biometricViewModel.mIsPromptShowing = false;
        biometricViewModel.mIsPromptShowing = false;
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.findFragmentByTag("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    BackStackRecord backStackRecord = new BackStackRecord(parentFragmentManager);
                    backStackRecord.remove(fingerprintDialogFragment);
                    backStackRecord.commitInternal(true, true);
                }
            }
        }
        if (!this.mViewModel.mIsConfirmingDeviceCredential && isAdded()) {
            FragmentManager parentFragmentManager2 = getParentFragmentManager();
            parentFragmentManager2.getClass();
            BackStackRecord backStackRecord2 = new BackStackRecord(parentFragmentManager2);
            backStackRecord2.remove(this);
            backStackRecord2.commitInternal(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        BiometricViewModel biometricViewModel2 = this.mViewModel;
                        biometricViewModel2.mIsDelayingPrompt = true;
                        this.mHandler.postDelayed(new StopDelayingPromptRunnable(biometricViewModel2, 0), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void isUsingFingerprintDialog() {
        if (getActivity() == null || this.mViewModel.mCryptoObject == null) {
            return;
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.mViewModel.mIsConfirmingDeviceCredential = false;
            if (i2 == -1) {
                sendSuccessAndDismiss(new BiometricPrompt.AuthenticationResult());
            } else {
                sendErrorAndDismiss(10, getString(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        activity.getClass();
        ViewModelStore viewModelStore = activity.getViewModelStore();
        ViewModelProvider$Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
        CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BiometricViewModel.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        this.mViewModel = biometricViewModel;
        if (biometricViewModel.mAuthenticationResult == null) {
            biometricViewModel.mAuthenticationResult = new MutableLiveData();
        }
        final int i = 0;
        biometricViewModel.mAuthenticationResult.observe(this, new Observer(this) { // from class: androidx.biometric.BiometricFragment.1
            public final /* synthetic */ BiometricFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i2 = i;
                CharSequence charSequence = null;
                BiometricFragment biometricFragment = this.this$0;
                switch (i2) {
                    case 0:
                        BiometricPrompt.AuthenticationResult authenticationResult = (BiometricPrompt.AuthenticationResult) obj;
                        if (authenticationResult != null) {
                            biometricFragment.sendSuccessAndDismiss(authenticationResult);
                            BiometricViewModel biometricViewModel2 = biometricFragment.mViewModel;
                            if (biometricViewModel2.mAuthenticationResult == null) {
                                biometricViewModel2.mAuthenticationResult = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel2.mAuthenticationResult, null);
                            break;
                        }
                        break;
                    case 1:
                        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
                        if (biometricErrorData != null) {
                            int i3 = biometricErrorData.mErrorCode;
                            CharSequence charSequence2 = biometricErrorData.mErrorMessage;
                            switch (i3) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i3 = 8;
                                    break;
                            }
                            biometricFragment.getContext();
                            biometricFragment.isUsingFingerprintDialog();
                            if (charSequence2 == null) {
                                charSequence2 = biometricFragment.getString(R.string.default_error_msg) + " " + i3;
                            }
                            biometricFragment.sendErrorAndDismiss(i3, charSequence2);
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 2:
                        if (((CharSequence) obj) != null) {
                            biometricFragment.isUsingFingerprintDialog();
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.isUsingFingerprintDialog();
                            BiometricViewModel biometricViewModel3 = biometricFragment.mViewModel;
                            if (biometricViewModel3.mIsAwaitingResult) {
                                Executor executor = biometricViewModel3.mClientExecutor;
                                if (executor == null) {
                                    executor = new ExecutorDelivery$1(1);
                                }
                                executor.execute(new Client.AnonymousClass7(biometricFragment, 4));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            BiometricViewModel biometricViewModel4 = biometricFragment.mViewModel;
                            if (biometricViewModel4.mIsAuthenticationFailurePending == null) {
                                biometricViewModel4.mIsAuthenticationFailurePending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel4.mIsAuthenticationFailurePending, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            n nVar = biometricFragment.mViewModel.mPromptInfo;
                            if (nVar != null && (charSequence = (CharSequence) nVar.d) == null) {
                                charSequence = "";
                            }
                            if (charSequence == null) {
                                charSequence = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.sendErrorAndDismiss(13, charSequence);
                            biometricFragment.cancelAuthentication(2);
                            biometricFragment.mViewModel.setNegativeButtonPressPending(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.cancelAuthentication(1);
                            biometricFragment.dismiss();
                            BiometricViewModel biometricViewModel5 = biometricFragment.mViewModel;
                            if (biometricViewModel5.mIsFingerprintDialogCancelPending == null) {
                                biometricViewModel5.mIsFingerprintDialogCancelPending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel5.mIsFingerprintDialogCancelPending, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        BiometricViewModel biometricViewModel2 = this.mViewModel;
        if (biometricViewModel2.mAuthenticationError == null) {
            biometricViewModel2.mAuthenticationError = new MutableLiveData();
        }
        final int i2 = 1;
        biometricViewModel2.mAuthenticationError.observe(this, new Observer(this) { // from class: androidx.biometric.BiometricFragment.1
            public final /* synthetic */ BiometricFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i22 = i2;
                CharSequence charSequence = null;
                BiometricFragment biometricFragment = this.this$0;
                switch (i22) {
                    case 0:
                        BiometricPrompt.AuthenticationResult authenticationResult = (BiometricPrompt.AuthenticationResult) obj;
                        if (authenticationResult != null) {
                            biometricFragment.sendSuccessAndDismiss(authenticationResult);
                            BiometricViewModel biometricViewModel22 = biometricFragment.mViewModel;
                            if (biometricViewModel22.mAuthenticationResult == null) {
                                biometricViewModel22.mAuthenticationResult = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel22.mAuthenticationResult, null);
                            break;
                        }
                        break;
                    case 1:
                        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
                        if (biometricErrorData != null) {
                            int i3 = biometricErrorData.mErrorCode;
                            CharSequence charSequence2 = biometricErrorData.mErrorMessage;
                            switch (i3) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i3 = 8;
                                    break;
                            }
                            biometricFragment.getContext();
                            biometricFragment.isUsingFingerprintDialog();
                            if (charSequence2 == null) {
                                charSequence2 = biometricFragment.getString(R.string.default_error_msg) + " " + i3;
                            }
                            biometricFragment.sendErrorAndDismiss(i3, charSequence2);
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 2:
                        if (((CharSequence) obj) != null) {
                            biometricFragment.isUsingFingerprintDialog();
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.isUsingFingerprintDialog();
                            BiometricViewModel biometricViewModel3 = biometricFragment.mViewModel;
                            if (biometricViewModel3.mIsAwaitingResult) {
                                Executor executor = biometricViewModel3.mClientExecutor;
                                if (executor == null) {
                                    executor = new ExecutorDelivery$1(1);
                                }
                                executor.execute(new Client.AnonymousClass7(biometricFragment, 4));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            BiometricViewModel biometricViewModel4 = biometricFragment.mViewModel;
                            if (biometricViewModel4.mIsAuthenticationFailurePending == null) {
                                biometricViewModel4.mIsAuthenticationFailurePending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel4.mIsAuthenticationFailurePending, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            n nVar = biometricFragment.mViewModel.mPromptInfo;
                            if (nVar != null && (charSequence = (CharSequence) nVar.d) == null) {
                                charSequence = "";
                            }
                            if (charSequence == null) {
                                charSequence = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.sendErrorAndDismiss(13, charSequence);
                            biometricFragment.cancelAuthentication(2);
                            biometricFragment.mViewModel.setNegativeButtonPressPending(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.cancelAuthentication(1);
                            biometricFragment.dismiss();
                            BiometricViewModel biometricViewModel5 = biometricFragment.mViewModel;
                            if (biometricViewModel5.mIsFingerprintDialogCancelPending == null) {
                                biometricViewModel5.mIsFingerprintDialogCancelPending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel5.mIsFingerprintDialogCancelPending, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        BiometricViewModel biometricViewModel3 = this.mViewModel;
        if (biometricViewModel3.mAuthenticationHelpMessage == null) {
            biometricViewModel3.mAuthenticationHelpMessage = new MutableLiveData();
        }
        final int i3 = 2;
        biometricViewModel3.mAuthenticationHelpMessage.observe(this, new Observer(this) { // from class: androidx.biometric.BiometricFragment.1
            public final /* synthetic */ BiometricFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i22 = i3;
                CharSequence charSequence = null;
                BiometricFragment biometricFragment = this.this$0;
                switch (i22) {
                    case 0:
                        BiometricPrompt.AuthenticationResult authenticationResult = (BiometricPrompt.AuthenticationResult) obj;
                        if (authenticationResult != null) {
                            biometricFragment.sendSuccessAndDismiss(authenticationResult);
                            BiometricViewModel biometricViewModel22 = biometricFragment.mViewModel;
                            if (biometricViewModel22.mAuthenticationResult == null) {
                                biometricViewModel22.mAuthenticationResult = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel22.mAuthenticationResult, null);
                            break;
                        }
                        break;
                    case 1:
                        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
                        if (biometricErrorData != null) {
                            int i32 = biometricErrorData.mErrorCode;
                            CharSequence charSequence2 = biometricErrorData.mErrorMessage;
                            switch (i32) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i32 = 8;
                                    break;
                            }
                            biometricFragment.getContext();
                            biometricFragment.isUsingFingerprintDialog();
                            if (charSequence2 == null) {
                                charSequence2 = biometricFragment.getString(R.string.default_error_msg) + " " + i32;
                            }
                            biometricFragment.sendErrorAndDismiss(i32, charSequence2);
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 2:
                        if (((CharSequence) obj) != null) {
                            biometricFragment.isUsingFingerprintDialog();
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.isUsingFingerprintDialog();
                            BiometricViewModel biometricViewModel32 = biometricFragment.mViewModel;
                            if (biometricViewModel32.mIsAwaitingResult) {
                                Executor executor = biometricViewModel32.mClientExecutor;
                                if (executor == null) {
                                    executor = new ExecutorDelivery$1(1);
                                }
                                executor.execute(new Client.AnonymousClass7(biometricFragment, 4));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            BiometricViewModel biometricViewModel4 = biometricFragment.mViewModel;
                            if (biometricViewModel4.mIsAuthenticationFailurePending == null) {
                                biometricViewModel4.mIsAuthenticationFailurePending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel4.mIsAuthenticationFailurePending, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            n nVar = biometricFragment.mViewModel.mPromptInfo;
                            if (nVar != null && (charSequence = (CharSequence) nVar.d) == null) {
                                charSequence = "";
                            }
                            if (charSequence == null) {
                                charSequence = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.sendErrorAndDismiss(13, charSequence);
                            biometricFragment.cancelAuthentication(2);
                            biometricFragment.mViewModel.setNegativeButtonPressPending(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.cancelAuthentication(1);
                            biometricFragment.dismiss();
                            BiometricViewModel biometricViewModel5 = biometricFragment.mViewModel;
                            if (biometricViewModel5.mIsFingerprintDialogCancelPending == null) {
                                biometricViewModel5.mIsFingerprintDialogCancelPending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel5.mIsFingerprintDialogCancelPending, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        BiometricViewModel biometricViewModel4 = this.mViewModel;
        if (biometricViewModel4.mIsAuthenticationFailurePending == null) {
            biometricViewModel4.mIsAuthenticationFailurePending = new MutableLiveData();
        }
        final int i4 = 3;
        biometricViewModel4.mIsAuthenticationFailurePending.observe(this, new Observer(this) { // from class: androidx.biometric.BiometricFragment.1
            public final /* synthetic */ BiometricFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i22 = i4;
                CharSequence charSequence = null;
                BiometricFragment biometricFragment = this.this$0;
                switch (i22) {
                    case 0:
                        BiometricPrompt.AuthenticationResult authenticationResult = (BiometricPrompt.AuthenticationResult) obj;
                        if (authenticationResult != null) {
                            biometricFragment.sendSuccessAndDismiss(authenticationResult);
                            BiometricViewModel biometricViewModel22 = biometricFragment.mViewModel;
                            if (biometricViewModel22.mAuthenticationResult == null) {
                                biometricViewModel22.mAuthenticationResult = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel22.mAuthenticationResult, null);
                            break;
                        }
                        break;
                    case 1:
                        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
                        if (biometricErrorData != null) {
                            int i32 = biometricErrorData.mErrorCode;
                            CharSequence charSequence2 = biometricErrorData.mErrorMessage;
                            switch (i32) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i32 = 8;
                                    break;
                            }
                            biometricFragment.getContext();
                            biometricFragment.isUsingFingerprintDialog();
                            if (charSequence2 == null) {
                                charSequence2 = biometricFragment.getString(R.string.default_error_msg) + " " + i32;
                            }
                            biometricFragment.sendErrorAndDismiss(i32, charSequence2);
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 2:
                        if (((CharSequence) obj) != null) {
                            biometricFragment.isUsingFingerprintDialog();
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.isUsingFingerprintDialog();
                            BiometricViewModel biometricViewModel32 = biometricFragment.mViewModel;
                            if (biometricViewModel32.mIsAwaitingResult) {
                                Executor executor = biometricViewModel32.mClientExecutor;
                                if (executor == null) {
                                    executor = new ExecutorDelivery$1(1);
                                }
                                executor.execute(new Client.AnonymousClass7(biometricFragment, 4));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            BiometricViewModel biometricViewModel42 = biometricFragment.mViewModel;
                            if (biometricViewModel42.mIsAuthenticationFailurePending == null) {
                                biometricViewModel42.mIsAuthenticationFailurePending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel42.mIsAuthenticationFailurePending, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            n nVar = biometricFragment.mViewModel.mPromptInfo;
                            if (nVar != null && (charSequence = (CharSequence) nVar.d) == null) {
                                charSequence = "";
                            }
                            if (charSequence == null) {
                                charSequence = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.sendErrorAndDismiss(13, charSequence);
                            biometricFragment.cancelAuthentication(2);
                            biometricFragment.mViewModel.setNegativeButtonPressPending(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.cancelAuthentication(1);
                            biometricFragment.dismiss();
                            BiometricViewModel biometricViewModel5 = biometricFragment.mViewModel;
                            if (biometricViewModel5.mIsFingerprintDialogCancelPending == null) {
                                biometricViewModel5.mIsFingerprintDialogCancelPending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel5.mIsFingerprintDialogCancelPending, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        BiometricViewModel biometricViewModel5 = this.mViewModel;
        if (biometricViewModel5.mIsNegativeButtonPressPending == null) {
            biometricViewModel5.mIsNegativeButtonPressPending = new MutableLiveData();
        }
        final int i5 = 4;
        biometricViewModel5.mIsNegativeButtonPressPending.observe(this, new Observer(this) { // from class: androidx.biometric.BiometricFragment.1
            public final /* synthetic */ BiometricFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i22 = i5;
                CharSequence charSequence = null;
                BiometricFragment biometricFragment = this.this$0;
                switch (i22) {
                    case 0:
                        BiometricPrompt.AuthenticationResult authenticationResult = (BiometricPrompt.AuthenticationResult) obj;
                        if (authenticationResult != null) {
                            biometricFragment.sendSuccessAndDismiss(authenticationResult);
                            BiometricViewModel biometricViewModel22 = biometricFragment.mViewModel;
                            if (biometricViewModel22.mAuthenticationResult == null) {
                                biometricViewModel22.mAuthenticationResult = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel22.mAuthenticationResult, null);
                            break;
                        }
                        break;
                    case 1:
                        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
                        if (biometricErrorData != null) {
                            int i32 = biometricErrorData.mErrorCode;
                            CharSequence charSequence2 = biometricErrorData.mErrorMessage;
                            switch (i32) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i32 = 8;
                                    break;
                            }
                            biometricFragment.getContext();
                            biometricFragment.isUsingFingerprintDialog();
                            if (charSequence2 == null) {
                                charSequence2 = biometricFragment.getString(R.string.default_error_msg) + " " + i32;
                            }
                            biometricFragment.sendErrorAndDismiss(i32, charSequence2);
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 2:
                        if (((CharSequence) obj) != null) {
                            biometricFragment.isUsingFingerprintDialog();
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.isUsingFingerprintDialog();
                            BiometricViewModel biometricViewModel32 = biometricFragment.mViewModel;
                            if (biometricViewModel32.mIsAwaitingResult) {
                                Executor executor = biometricViewModel32.mClientExecutor;
                                if (executor == null) {
                                    executor = new ExecutorDelivery$1(1);
                                }
                                executor.execute(new Client.AnonymousClass7(biometricFragment, 4));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            BiometricViewModel biometricViewModel42 = biometricFragment.mViewModel;
                            if (biometricViewModel42.mIsAuthenticationFailurePending == null) {
                                biometricViewModel42.mIsAuthenticationFailurePending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel42.mIsAuthenticationFailurePending, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            n nVar = biometricFragment.mViewModel.mPromptInfo;
                            if (nVar != null && (charSequence = (CharSequence) nVar.d) == null) {
                                charSequence = "";
                            }
                            if (charSequence == null) {
                                charSequence = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.sendErrorAndDismiss(13, charSequence);
                            biometricFragment.cancelAuthentication(2);
                            biometricFragment.mViewModel.setNegativeButtonPressPending(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.cancelAuthentication(1);
                            biometricFragment.dismiss();
                            BiometricViewModel biometricViewModel52 = biometricFragment.mViewModel;
                            if (biometricViewModel52.mIsFingerprintDialogCancelPending == null) {
                                biometricViewModel52.mIsFingerprintDialogCancelPending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel52.mIsFingerprintDialogCancelPending, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        BiometricViewModel biometricViewModel6 = this.mViewModel;
        if (biometricViewModel6.mIsFingerprintDialogCancelPending == null) {
            biometricViewModel6.mIsFingerprintDialogCancelPending = new MutableLiveData();
        }
        final int i6 = 5;
        biometricViewModel6.mIsFingerprintDialogCancelPending.observe(this, new Observer(this) { // from class: androidx.biometric.BiometricFragment.1
            public final /* synthetic */ BiometricFragment this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i22 = i6;
                CharSequence charSequence = null;
                BiometricFragment biometricFragment = this.this$0;
                switch (i22) {
                    case 0:
                        BiometricPrompt.AuthenticationResult authenticationResult = (BiometricPrompt.AuthenticationResult) obj;
                        if (authenticationResult != null) {
                            biometricFragment.sendSuccessAndDismiss(authenticationResult);
                            BiometricViewModel biometricViewModel22 = biometricFragment.mViewModel;
                            if (biometricViewModel22.mAuthenticationResult == null) {
                                biometricViewModel22.mAuthenticationResult = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel22.mAuthenticationResult, null);
                            break;
                        }
                        break;
                    case 1:
                        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
                        if (biometricErrorData != null) {
                            int i32 = biometricErrorData.mErrorCode;
                            CharSequence charSequence2 = biometricErrorData.mErrorMessage;
                            switch (i32) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 6:
                                default:
                                    i32 = 8;
                                    break;
                            }
                            biometricFragment.getContext();
                            biometricFragment.isUsingFingerprintDialog();
                            if (charSequence2 == null) {
                                charSequence2 = biometricFragment.getString(R.string.default_error_msg) + " " + i32;
                            }
                            biometricFragment.sendErrorAndDismiss(i32, charSequence2);
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 2:
                        if (((CharSequence) obj) != null) {
                            biometricFragment.isUsingFingerprintDialog();
                            biometricFragment.mViewModel.setAuthenticationError(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.isUsingFingerprintDialog();
                            BiometricViewModel biometricViewModel32 = biometricFragment.mViewModel;
                            if (biometricViewModel32.mIsAwaitingResult) {
                                Executor executor = biometricViewModel32.mClientExecutor;
                                if (executor == null) {
                                    executor = new ExecutorDelivery$1(1);
                                }
                                executor.execute(new Client.AnonymousClass7(biometricFragment, 4));
                            } else {
                                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                            }
                            BiometricViewModel biometricViewModel42 = biometricFragment.mViewModel;
                            if (biometricViewModel42.mIsAuthenticationFailurePending == null) {
                                biometricViewModel42.mIsAuthenticationFailurePending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel42.mIsAuthenticationFailurePending, Boolean.FALSE);
                            break;
                        }
                        break;
                    case 4:
                        if (((Boolean) obj).booleanValue()) {
                            n nVar = biometricFragment.mViewModel.mPromptInfo;
                            if (nVar != null && (charSequence = (CharSequence) nVar.d) == null) {
                                charSequence = "";
                            }
                            if (charSequence == null) {
                                charSequence = biometricFragment.getString(R.string.default_error_msg);
                            }
                            biometricFragment.sendErrorAndDismiss(13, charSequence);
                            biometricFragment.cancelAuthentication(2);
                            biometricFragment.mViewModel.setNegativeButtonPressPending(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            biometricFragment.cancelAuthentication(1);
                            biometricFragment.dismiss();
                            BiometricViewModel biometricViewModel52 = biometricFragment.mViewModel;
                            if (biometricViewModel52.mIsFingerprintDialogCancelPending == null) {
                                biometricViewModel52.mIsFingerprintDialogCancelPending = new MutableLiveData();
                            }
                            BiometricViewModel.updateValue(biometricViewModel52.mIsFingerprintDialogCancelPending, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29) {
            if (AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.mPromptInfo != null ? 15 : 0)) {
                BiometricViewModel biometricViewModel = this.mViewModel;
                biometricViewModel.mIsIgnoringCancel = true;
                this.mHandler.postDelayed(new StopDelayingPromptRunnable(biometricViewModel, 2), 250L);
            }
        }
    }

    public final void sendErrorAndDismiss(int i, CharSequence charSequence) {
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (biometricViewModel.mIsConfirmingDeviceCredential) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (biometricViewModel.mIsAwaitingResult) {
            int i2 = 0;
            biometricViewModel.mIsAwaitingResult = false;
            Executor executor = biometricViewModel.mClientExecutor;
            if (executor == null) {
                executor = new ExecutorDelivery$1(1);
            }
            executor.execute(new AnonymousClass10(this, i, charSequence, i2));
        } else {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        }
        dismiss();
    }

    public final void sendSuccessAndDismiss(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (biometricViewModel.mIsAwaitingResult) {
            boolean z = false;
            biometricViewModel.mIsAwaitingResult = false;
            Executor executor = biometricViewModel.mClientExecutor;
            if (executor == null) {
                executor = new ExecutorDelivery$1(1);
            }
            executor.execute(new Client.AnonymousClass4(this, authenticationResult, z, 2));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        dismiss();
    }

    public final void showPromptForAuthentication() {
        if (this.mViewModel.mIsPromptShowing) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        BiometricViewModel biometricViewModel = this.mViewModel;
        biometricViewModel.mIsPromptShowing = true;
        biometricViewModel.mIsAwaitingResult = true;
        isUsingFingerprintDialog();
        BiometricPrompt.Builder createPromptBuilder = Api28Impl.createPromptBuilder(requireContext().getApplicationContext());
        n nVar = this.mViewModel.mPromptInfo;
        CharSequence charSequence = null;
        CharSequence charSequence2 = nVar != null ? (CharSequence) nVar.a : null;
        CharSequence charSequence3 = nVar != null ? (CharSequence) nVar.b : null;
        CharSequence charSequence4 = nVar != null ? (CharSequence) nVar.c : null;
        if (charSequence2 != null) {
            Api28Impl.setTitle(createPromptBuilder, charSequence2);
        }
        if (charSequence3 != null) {
            Api28Impl.setSubtitle(createPromptBuilder, charSequence3);
        }
        if (charSequence4 != null) {
            Api28Impl.setDescription(createPromptBuilder, charSequence4);
        }
        n nVar2 = this.mViewModel.mPromptInfo;
        if (nVar2 != null && (charSequence = (CharSequence) nVar2.d) == null) {
            charSequence = "";
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Executor executor = this.mViewModel.mClientExecutor;
            if (executor == null) {
                executor = new ExecutorDelivery$1(1);
            }
            BiometricViewModel biometricViewModel2 = this.mViewModel;
            if (biometricViewModel2.mNegativeButtonListener == null) {
                biometricViewModel2.mNegativeButtonListener = new FingerprintDialogFragment.AnonymousClass2(biometricViewModel2);
            }
            Api28Impl.setNegativeButton(createPromptBuilder, charSequence, executor, biometricViewModel2.mNegativeButtonListener);
        }
        n nVar3 = this.mViewModel.mPromptInfo;
        Api29Impl.setConfirmationRequired(createPromptBuilder, true);
        boolean z = false;
        int i = this.mViewModel.mPromptInfo != null ? 15 : 0;
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setAllowedAuthenticators(createPromptBuilder, i);
        } else {
            Api29Impl.setDeviceCredentialAllowed(createPromptBuilder, AuthenticatorUtils.isDeviceCredentialAllowed(i));
        }
        android.hardware.biometrics.BiometricPrompt buildPrompt = Api28Impl.buildPrompt(createPromptBuilder);
        Context context = getContext();
        BiometricPrompt.CryptoObject wrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(this.mViewModel.mCryptoObject);
        BiometricViewModel biometricViewModel3 = this.mViewModel;
        int i2 = 2;
        if (biometricViewModel3.mCancellationSignalProvider == null) {
            biometricViewModel3.mCancellationSignalProvider = new Recorder.AnonymousClass4(i2, z);
        }
        Recorder.AnonymousClass4 anonymousClass4 = biometricViewModel3.mCancellationSignalProvider;
        if (((CancellationSignal) anonymousClass4.val$audioErrorConsumer) == null) {
            anonymousClass4.val$audioErrorConsumer = CancellationSignalProvider$Api16Impl.create();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) anonymousClass4.val$audioErrorConsumer;
        PromptExecutor promptExecutor = new PromptExecutor();
        BiometricViewModel biometricViewModel4 = this.mViewModel;
        if (biometricViewModel4.mAuthenticationCallbackProvider == null) {
            biometricViewModel4.mAuthenticationCallbackProvider = new Recorder.AnonymousClass1(new BiometricViewModel.CallbackListener(biometricViewModel4), i2);
        }
        Recorder.AnonymousClass1 anonymousClass1 = biometricViewModel4.mAuthenticationCallbackProvider;
        if (((BiometricPrompt.AuthenticationCallback) anonymousClass1.val$videoEncoderSession) == null) {
            anonymousClass1.val$videoEncoderSession = AuthenticationCallbackProvider$Api28Impl.createCallback((BiometricViewModel.CallbackListener) anonymousClass1.this$0);
        }
        BiometricPrompt.AuthenticationCallback authenticationCallback = (BiometricPrompt.AuthenticationCallback) anonymousClass1.val$videoEncoderSession;
        try {
            if (wrapForBiometricPrompt == null) {
                Api28Impl.authenticate(buildPrompt, cancellationSignal, promptExecutor, authenticationCallback);
            } else {
                Api28Impl.authenticate(buildPrompt, wrapForBiometricPrompt, cancellationSignal, promptExecutor, authenticationCallback);
            }
        } catch (NullPointerException e) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
            sendErrorAndDismiss(1, context != null ? context.getString(R.string.default_error_msg) : "");
        }
    }

    public abstract class Api28Impl {
        public static void authenticate(android.hardware.biometrics.BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        public static android.hardware.biometrics.BiometricPrompt buildPrompt(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static BiometricPrompt.Builder createPromptBuilder(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void setDescription(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void setNegativeButton(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void setSubtitle(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void setTitle(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        public static void authenticate(android.hardware.biometrics.BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$10, reason: invalid class name */
    public final class AnonymousClass10 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;
        public final /* synthetic */ int val$errorCode;
        public final /* synthetic */ Object val$errorString;

        public AnonymousClass10(TextView textView, Typeface typeface, int i) {
            this.$r8$classId = 1;
            this.val$errorString = textView;
            this.this$0 = typeface;
            this.val$errorCode = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer;
            ArrayList arrayList;
            int decrementAndGet;
            int i = this.$r8$classId;
            int i2 = this.val$errorCode;
            Object obj = this.val$errorString;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    BiometricViewModel biometricViewModel = ((BiometricFragment) obj2).mViewModel;
                    if (biometricViewModel.mClientCallback == null) {
                        biometricViewModel.mClientCallback = new BiometricViewModel.AnonymousClass1();
                    }
                    biometricViewModel.mClientCallback.onAuthenticationError(i2, (CharSequence) obj);
                    return;
                case 1:
                    ((TextView) obj).setTypeface((Typeface) obj2, i2);
                    return;
                case 2:
                    ListFuture listFuture = (ListFuture) obj2;
                    ListenableFuture listenableFuture = (ListenableFuture) obj;
                    boolean z = listFuture.mAllMustSucceed;
                    AtomicInteger atomicInteger = listFuture.mRemaining;
                    ArrayList arrayList2 = listFuture.mValues;
                    if (listFuture.isDone() || arrayList2 == null) {
                        TransactorKt.checkState("Future was done before all dependencies completed", z);
                        return;
                    }
                    try {
                        try {
                            try {
                                try {
                                    TransactorKt.checkState("Tried to set value from future which is not done", listenableFuture.isDone());
                                    arrayList2.set(i2, Futures.getUninterruptibly(listenableFuture));
                                    decrementAndGet = atomicInteger.decrementAndGet();
                                    TransactorKt.checkState("Less than 0 remaining futures", decrementAndGet >= 0);
                                } catch (ExecutionException e) {
                                    if (z) {
                                        listFuture.mResultNotifier.setException(e.getCause());
                                    }
                                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                                    TransactorKt.checkState("Less than 0 remaining futures", decrementAndGet2 >= 0);
                                    if (decrementAndGet2 != 0) {
                                        return;
                                    }
                                    ArrayList arrayList3 = listFuture.mValues;
                                    if (arrayList3 != null) {
                                        callbackToFutureAdapter$Completer = listFuture.mResultNotifier;
                                        arrayList = new ArrayList(arrayList3);
                                    }
                                }
                            } catch (Error e2) {
                                listFuture.mResultNotifier.setException(e2);
                                int decrementAndGet3 = atomicInteger.decrementAndGet();
                                TransactorKt.checkState("Less than 0 remaining futures", decrementAndGet3 >= 0);
                                if (decrementAndGet3 != 0) {
                                    return;
                                }
                                ArrayList arrayList4 = listFuture.mValues;
                                if (arrayList4 != null) {
                                    callbackToFutureAdapter$Completer = listFuture.mResultNotifier;
                                    arrayList = new ArrayList(arrayList4);
                                }
                            }
                        } catch (CancellationException unused) {
                            if (z) {
                                listFuture.cancel(false);
                            }
                            int decrementAndGet4 = atomicInteger.decrementAndGet();
                            TransactorKt.checkState("Less than 0 remaining futures", decrementAndGet4 >= 0);
                            if (decrementAndGet4 != 0) {
                                return;
                            }
                            ArrayList arrayList5 = listFuture.mValues;
                            if (arrayList5 != null) {
                                callbackToFutureAdapter$Completer = listFuture.mResultNotifier;
                                arrayList = new ArrayList(arrayList5);
                            }
                        } catch (RuntimeException e3) {
                            if (z) {
                                listFuture.mResultNotifier.setException(e3);
                            }
                            int decrementAndGet5 = atomicInteger.decrementAndGet();
                            TransactorKt.checkState("Less than 0 remaining futures", decrementAndGet5 >= 0);
                            if (decrementAndGet5 != 0) {
                                return;
                            }
                            ArrayList arrayList6 = listFuture.mValues;
                            if (arrayList6 != null) {
                                callbackToFutureAdapter$Completer = listFuture.mResultNotifier;
                                arrayList = new ArrayList(arrayList6);
                            }
                        }
                        if (decrementAndGet == 0) {
                            ArrayList arrayList7 = listFuture.mValues;
                            if (arrayList7 != null) {
                                callbackToFutureAdapter$Completer = listFuture.mResultNotifier;
                                arrayList = new ArrayList(arrayList7);
                                callbackToFutureAdapter$Completer.set(arrayList);
                                return;
                            }
                            TransactorKt.checkState(null, listFuture.isDone());
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        int decrementAndGet6 = atomicInteger.decrementAndGet();
                        TransactorKt.checkState("Less than 0 remaining futures", decrementAndGet6 >= 0);
                        if (decrementAndGet6 == 0) {
                            ArrayList arrayList8 = listFuture.mValues;
                            if (arrayList8 != null) {
                                listFuture.mResultNotifier.set(new ArrayList(arrayList8));
                            } else {
                                TransactorKt.checkState(null, listFuture.isDone());
                            }
                        }
                        throw th;
                    }
                case 3:
                    ItemTouchHelper.AnonymousClass3 anonymousClass3 = (ItemTouchHelper.AnonymousClass3) obj;
                    RecyclerView.ViewHolder viewHolder = anonymousClass3.mViewHolder;
                    ItemTouchHelper itemTouchHelper = (ItemTouchHelper) obj2;
                    RecyclerView recyclerView = itemTouchHelper.mRecyclerView;
                    if (recyclerView == null || !recyclerView.mIsAttached || anonymousClass3.mOverridden || viewHolder.getAbsoluteAdapterPosition() == -1) {
                        return;
                    }
                    RecyclerView.ItemAnimator itemAnimator = itemTouchHelper.mRecyclerView.mItemAnimator;
                    if (itemAnimator == null || !itemAnimator.isRunning()) {
                        ArrayList arrayList9 = itemTouchHelper.mRecoverAnimations;
                        int size = arrayList9.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (((ItemTouchHelper.AnonymousClass3) arrayList9.get(i3)).mEnded) {
                            }
                        }
                        itemTouchHelper.mCallback.onSwiped(viewHolder, i2);
                        return;
                    }
                    itemTouchHelper.mRecyclerView.post(this);
                    return;
                case 4:
                    ((BottomSheetBehavior) obj2).startSettling((View) obj, i2, false);
                    return;
                default:
                    Toast.makeText((Context) obj2, (CharSequence) obj, i2).show();
                    return;
            }
        }

        public /* synthetic */ AnonymousClass10(Object obj, Object obj2, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = obj;
            this.val$errorString = obj2;
            this.val$errorCode = i;
        }

        public /* synthetic */ AnonymousClass10(Object obj, int i, Object obj2, int i2) {
            this.$r8$classId = i2;
            this.this$0 = obj;
            this.val$errorCode = i;
            this.val$errorString = obj2;
        }
    }

    public final class PromptExecutor implements Executor {
        public final /* synthetic */ int $r8$classId;
        public final Handler mPromptHandler;

        public PromptExecutor() {
            this.$r8$classId = 0;
            this.mPromptHandler = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            int i = this.$r8$classId;
            Handler handler = this.mPromptHandler;
            switch (i) {
                case 0:
                    handler.post(runnable);
                    return;
                default:
                    runnable.getClass();
                    if (handler.post(runnable)) {
                        return;
                    }
                    throw new RejectedExecutionException(handler + " is shutting down");
            }
        }

        public PromptExecutor(Handler handler) {
            this.$r8$classId = 1;
            handler.getClass();
            this.mPromptHandler = handler;
        }
    }

    public final class StopDelayingPromptRunnable implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final WeakReference mViewModelRef;

        public StopDelayingPromptRunnable(BiometricViewModel biometricViewModel, int i) {
            this.$r8$classId = i;
            switch (i) {
                case 2:
                    this.mViewModelRef = new WeakReference(biometricViewModel);
                    break;
                default:
                    this.mViewModelRef = new WeakReference(biometricViewModel);
                    break;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            WeakReference weakReference = this.mViewModelRef;
            switch (i) {
                case 0:
                    if (weakReference.get() != null) {
                        ((BiometricViewModel) weakReference.get()).mIsDelayingPrompt = false;
                        break;
                    }
                    break;
                case 1:
                    if (weakReference.get() != null) {
                        ((BiometricFragment) weakReference.get()).showPromptForAuthentication();
                        break;
                    }
                    break;
                default:
                    if (weakReference.get() != null) {
                        ((BiometricViewModel) weakReference.get()).mIsIgnoringCancel = false;
                        break;
                    }
                    break;
            }
        }

        public StopDelayingPromptRunnable(BiometricFragment biometricFragment) {
            this.$r8$classId = 1;
            this.mViewModelRef = new WeakReference(biometricFragment);
        }
    }
}
