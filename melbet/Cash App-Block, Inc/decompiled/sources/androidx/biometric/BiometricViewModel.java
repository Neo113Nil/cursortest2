package androidx.biometric;

import android.os.Looper;
import androidx.biometric.FingerprintDialogFragment;
import androidx.camera.video.Recorder;
import androidx.credentials.CredentialManager$$ExternalSyntheticLambda0;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import com.google.android.gms.dynamite.zzb;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class BiometricViewModel extends ViewModel {
    public Recorder.AnonymousClass1 mAuthenticationCallbackProvider;
    public MutableLiveData mAuthenticationError;
    public MutableLiveData mAuthenticationHelpMessage;
    public MutableLiveData mAuthenticationResult;
    public Recorder.AnonymousClass4 mCancellationSignalProvider;
    public zzb mClientCallback;
    public CredentialManager$$ExternalSyntheticLambda0 mClientExecutor;
    public UnleashContext mCryptoObject;
    public MutableLiveData mFingerprintDialogHelpMessage;
    public int mFingerprintDialogPreviousState = 0;
    public MutableLiveData mFingerprintDialogState;
    public MutableLiveData mIsAuthenticationFailurePending;
    public boolean mIsAwaitingResult;
    public boolean mIsConfirmingDeviceCredential;
    public boolean mIsDelayingPrompt;
    public MutableLiveData mIsFingerprintDialogCancelPending;
    public boolean mIsIgnoringCancel;
    public MutableLiveData mIsNegativeButtonPressPending;
    public boolean mIsPromptShowing;
    public FingerprintDialogFragment.AnonymousClass2 mNegativeButtonListener;
    public n mPromptInfo;

    /* renamed from: androidx.biometric.BiometricViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends zzb {
    }

    public final class CallbackListener extends AuthenticationCallbackProvider$Listener {
        public final WeakReference mViewModelRef;

        public CallbackListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference(biometricViewModel);
        }
    }

    public static void updateValue(MutableLiveData mutableLiveData, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }

    public final void setAuthenticationError(BiometricErrorData biometricErrorData) {
        if (this.mAuthenticationError == null) {
            this.mAuthenticationError = new MutableLiveData();
        }
        updateValue(this.mAuthenticationError, biometricErrorData);
    }

    public final void setFingerprintDialogHelpMessage(CharSequence charSequence) {
        if (this.mFingerprintDialogHelpMessage == null) {
            this.mFingerprintDialogHelpMessage = new MutableLiveData();
        }
        updateValue(this.mFingerprintDialogHelpMessage, charSequence);
    }

    public final void setFingerprintDialogState(int i) {
        if (this.mFingerprintDialogState == null) {
            this.mFingerprintDialogState = new MutableLiveData();
        }
        updateValue(this.mFingerprintDialogState, Integer.valueOf(i));
    }

    public final void setNegativeButtonPressPending(boolean z) {
        if (this.mIsNegativeButtonPressPending == null) {
            this.mIsNegativeButtonPressPending = new MutableLiveData();
        }
        updateValue(this.mIsNegativeButtonPressPending, Boolean.valueOf(z));
    }
}
