package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.fillr.core.utilities.AppPreferenceStore;
import com.fillr.n;
import com.fillr.profile.ProfileDetailedViewFragment;
import com.squareup.cash.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public class FingerprintDialogFragment extends DialogFragment {
    public int mErrorTextColor;
    public ImageView mFingerprintIcon;
    public TextView mHelpMessageView;
    public int mNormalTextColor;
    public BiometricViewModel mViewModel;
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    public final Client.AnonymousClass7 mResetDialogRunnable = new Client.AnonymousClass7(this, 5);

    public abstract class Api21Impl {
        public static void startAnimation(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    public abstract class Api26Impl {
        public static int getColorErrorAttr() {
            return R.attr.colorError;
        }
    }

    public final int getThemedColorFor(int i) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (biometricViewModel.mIsFingerprintDialogCancelPending == null) {
            biometricViewModel.mIsFingerprintDialogCancelPending = new MutableLiveData();
        }
        BiometricViewModel.updateValue(biometricViewModel.mIsFingerprintDialogCancelPending, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
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
            if (biometricViewModel.mFingerprintDialogState == null) {
                biometricViewModel.mFingerprintDialogState = new MutableLiveData();
            }
            final int i = 0;
            biometricViewModel.mFingerprintDialogState.observe(this, new Observer(this) { // from class: androidx.biometric.FingerprintDialogFragment.3
                public final /* synthetic */ FingerprintDialogFragment this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
                
                    if (r4 == 1) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
                
                    if (r4 == 3) goto L28;
                 */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onChanged(Object obj) {
                    int i2 = i;
                    FingerprintDialogFragment fingerprintDialogFragment = this.this$0;
                    switch (i2) {
                        case 0:
                            Integer num = (Integer) obj;
                            Handler handler = fingerprintDialogFragment.mHandler;
                            Client.AnonymousClass7 anonymousClass7 = fingerprintDialogFragment.mResetDialogRunnable;
                            handler.removeCallbacks(anonymousClass7);
                            int intValue = num.intValue();
                            if (fingerprintDialogFragment.mFingerprintIcon != null) {
                                int i3 = fingerprintDialogFragment.mViewModel.mFingerprintDialogPreviousState;
                                Context context = fingerprintDialogFragment.getContext();
                                Drawable drawable = null;
                                if (context == null) {
                                    Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                                } else {
                                    int i4 = R.drawable.fingerprint_dialog_fp_icon;
                                    if (i3 != 0 || intValue != 1) {
                                        if (i3 != 1 || intValue != 2) {
                                            if (i3 == 2) {
                                            }
                                            if (i3 == 1) {
                                                break;
                                            }
                                        } else {
                                            i4 = 2131231500;
                                        }
                                    }
                                    drawable = context.getDrawable(i4);
                                }
                                if (drawable != null) {
                                    fingerprintDialogFragment.mFingerprintIcon.setImageDrawable(drawable);
                                    if ((i3 != 0 || intValue != 1) && ((i3 == 1 && intValue == 2) || (i3 == 2 && intValue == 1))) {
                                        Api21Impl.startAnimation(drawable);
                                    }
                                    fingerprintDialogFragment.mViewModel.mFingerprintDialogPreviousState = intValue;
                                }
                            }
                            int intValue2 = num.intValue();
                            TextView textView = fingerprintDialogFragment.mHelpMessageView;
                            if (textView != null) {
                                textView.setTextColor(intValue2 == 2 ? fingerprintDialogFragment.mErrorTextColor : fingerprintDialogFragment.mNormalTextColor);
                            }
                            handler.postDelayed(anonymousClass7, 2000L);
                            break;
                        default:
                            CharSequence charSequence = (CharSequence) obj;
                            Handler handler2 = fingerprintDialogFragment.mHandler;
                            Client.AnonymousClass7 anonymousClass72 = fingerprintDialogFragment.mResetDialogRunnable;
                            handler2.removeCallbacks(anonymousClass72);
                            TextView textView2 = fingerprintDialogFragment.mHelpMessageView;
                            if (textView2 != null) {
                                textView2.setText(charSequence);
                            }
                            handler2.postDelayed(anonymousClass72, 2000L);
                            break;
                    }
                }
            });
            BiometricViewModel biometricViewModel2 = this.mViewModel;
            if (biometricViewModel2.mFingerprintDialogHelpMessage == null) {
                biometricViewModel2.mFingerprintDialogHelpMessage = new MutableLiveData();
            }
            final int i2 = 1;
            biometricViewModel2.mFingerprintDialogHelpMessage.observe(this, new Observer(this) { // from class: androidx.biometric.FingerprintDialogFragment.3
                public final /* synthetic */ FingerprintDialogFragment this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
                
                    if (r4 == 1) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
                
                    if (r4 == 3) goto L28;
                 */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onChanged(Object obj) {
                    int i22 = i2;
                    FingerprintDialogFragment fingerprintDialogFragment = this.this$0;
                    switch (i22) {
                        case 0:
                            Integer num = (Integer) obj;
                            Handler handler = fingerprintDialogFragment.mHandler;
                            Client.AnonymousClass7 anonymousClass7 = fingerprintDialogFragment.mResetDialogRunnable;
                            handler.removeCallbacks(anonymousClass7);
                            int intValue = num.intValue();
                            if (fingerprintDialogFragment.mFingerprintIcon != null) {
                                int i3 = fingerprintDialogFragment.mViewModel.mFingerprintDialogPreviousState;
                                Context context = fingerprintDialogFragment.getContext();
                                Drawable drawable = null;
                                if (context == null) {
                                    Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                                } else {
                                    int i4 = R.drawable.fingerprint_dialog_fp_icon;
                                    if (i3 != 0 || intValue != 1) {
                                        if (i3 != 1 || intValue != 2) {
                                            if (i3 == 2) {
                                            }
                                            if (i3 == 1) {
                                                break;
                                            }
                                        } else {
                                            i4 = 2131231500;
                                        }
                                    }
                                    drawable = context.getDrawable(i4);
                                }
                                if (drawable != null) {
                                    fingerprintDialogFragment.mFingerprintIcon.setImageDrawable(drawable);
                                    if ((i3 != 0 || intValue != 1) && ((i3 == 1 && intValue == 2) || (i3 == 2 && intValue == 1))) {
                                        Api21Impl.startAnimation(drawable);
                                    }
                                    fingerprintDialogFragment.mViewModel.mFingerprintDialogPreviousState = intValue;
                                }
                            }
                            int intValue2 = num.intValue();
                            TextView textView = fingerprintDialogFragment.mHelpMessageView;
                            if (textView != null) {
                                textView.setTextColor(intValue2 == 2 ? fingerprintDialogFragment.mErrorTextColor : fingerprintDialogFragment.mNormalTextColor);
                            }
                            handler.postDelayed(anonymousClass7, 2000L);
                            break;
                        default:
                            CharSequence charSequence = (CharSequence) obj;
                            Handler handler2 = fingerprintDialogFragment.mHandler;
                            Client.AnonymousClass7 anonymousClass72 = fingerprintDialogFragment.mResetDialogRunnable;
                            handler2.removeCallbacks(anonymousClass72);
                            TextView textView2 = fingerprintDialogFragment.mHelpMessageView;
                            if (textView2 != null) {
                                textView2.setText(charSequence);
                            }
                            handler2.postDelayed(anonymousClass72, 2000L);
                            break;
                    }
                }
            });
        }
        this.mErrorTextColor = getThemedColorFor(Api26Impl.getColorErrorAttr());
        this.mNormalTextColor = getThemedColorFor(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        n nVar = this.mViewModel.mPromptInfo;
        CharSequence charSequence = null;
        builder.setTitle(nVar != null ? (CharSequence) nVar.a : null);
        View inflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        int i = 0;
        if (textView != null) {
            n nVar2 = this.mViewModel.mPromptInfo;
            CharSequence charSequence2 = nVar2 != null ? (CharSequence) nVar2.b : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence2);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            n nVar3 = this.mViewModel.mPromptInfo;
            CharSequence charSequence3 = nVar3 != null ? (CharSequence) nVar3.c : null;
            if (TextUtils.isEmpty(charSequence3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence3);
            }
        }
        this.mFingerprintIcon = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.mHelpMessageView = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.mPromptInfo != null ? 15 : 0)) {
            charSequence = getString(R.string.confirm_device_credential_password);
        } else {
            n nVar4 = this.mViewModel.mPromptInfo;
            if (nVar4 != null && (charSequence = (CharSequence) nVar4.d) == null) {
                charSequence = "";
            }
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, i);
        AlertController.AlertParams alertParams = builder.P;
        alertParams.mNegativeButtonText = charSequence;
        alertParams.mNegativeButtonListener = anonymousClass2;
        builder.setView(inflate);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BiometricViewModel biometricViewModel = this.mViewModel;
        biometricViewModel.mFingerprintDialogPreviousState = 0;
        biometricViewModel.setFingerprintDialogState(1);
        this.mViewModel.setFingerprintDialogHelpMessage(getString(R.string.fingerprint_dialog_touch_sensor));
    }

    /* renamed from: androidx.biometric.FingerprintDialogFragment$2, reason: invalid class name */
    public final class AnonymousClass2 implements DialogInterface.OnClickListener {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(BiometricViewModel biometricViewModel) {
            this.$r8$classId = 1;
            this.this$0 = new WeakReference(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences sharedPreferences;
            int i2 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i2) {
                case 0:
                    ((FingerprintDialogFragment) obj).mViewModel.setNegativeButtonPressPending(true);
                    break;
                case 1:
                    WeakReference weakReference = (WeakReference) obj;
                    if (weakReference.get() != null) {
                        ((BiometricViewModel) weakReference.get()).setNegativeButtonPressPending(true);
                        break;
                    }
                    break;
                default:
                    AppPreferenceStore appPreferenceStore = ((ProfileDetailedViewFragment) obj).mAppPreferenceStore;
                    if (appPreferenceStore != null && (sharedPreferences = appPreferenceStore.mPreferences) != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putBoolean("F_HAS_CREDIT_CARD_SECURITY_PROMPT", false);
                        edit.apply();
                        break;
                    }
                    break;
            }
        }

        public /* synthetic */ AnonymousClass2(Fragment fragment, int i) {
            this.$r8$classId = i;
            this.this$0 = fragment;
        }
    }
}
