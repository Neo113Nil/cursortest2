package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.biometric.CryptoObjectUtils;
import androidx.lifecycle.MutableLiveData;
import com.fillr.n;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class AuthenticationCallbackProvider$Api28Impl {
    public static BiometricPrompt.AuthenticationCallback createCallback(final AuthenticationCallbackProvider$Listener authenticationCallbackProvider$Listener) {
        return new BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider$Api28Impl.1
            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                WeakReference weakReference = ((BiometricViewModel.CallbackListener) AuthenticationCallbackProvider$Listener.this).mViewModelRef;
                if (weakReference.get() == null || ((BiometricViewModel) weakReference.get()).mIsConfirmingDeviceCredential || !((BiometricViewModel) weakReference.get()).mIsAwaitingResult) {
                    return;
                }
                ((BiometricViewModel) weakReference.get()).setAuthenticationError(new BiometricErrorData(i, charSequence));
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                WeakReference weakReference = ((BiometricViewModel.CallbackListener) AuthenticationCallbackProvider$Listener.this).mViewModelRef;
                if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).mIsAwaitingResult) {
                    return;
                }
                BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
                if (biometricViewModel.mIsAuthenticationFailurePending == null) {
                    biometricViewModel.mIsAuthenticationFailurePending = new MutableLiveData();
                }
                BiometricViewModel.updateValue(biometricViewModel.mIsAuthenticationFailurePending, Boolean.TRUE);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                int i;
                BiometricPrompt.CryptoObject cryptoObject;
                if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null && CryptoObjectUtils.Api28Impl.getCipher(cryptoObject) == null && CryptoObjectUtils.Api28Impl.getSignature(cryptoObject) == null && CryptoObjectUtils.Api28Impl.getMac(cryptoObject) == null && Build.VERSION.SDK_INT >= 30) {
                    CryptoObjectUtils.Api30Impl.getIdentityCredential(cryptoObject);
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    if (authenticationResult != null) {
                        i = AuthenticationCallbackProvider$Api30Impl.getAuthenticationType(authenticationResult);
                    }
                    i = -1;
                } else {
                    if (i2 != 29) {
                        i = 2;
                    }
                    i = -1;
                }
                BiometricPrompt.AuthenticationResult authenticationResult2 = new BiometricPrompt.AuthenticationResult();
                WeakReference weakReference = ((BiometricViewModel.CallbackListener) AuthenticationCallbackProvider$Listener.this).mViewModelRef;
                if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).mIsAwaitingResult) {
                    return;
                }
                if (i == -1) {
                    n nVar = ((BiometricViewModel) weakReference.get()).mPromptInfo;
                    authenticationResult2 = new BiometricPrompt.AuthenticationResult();
                }
                BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
                if (biometricViewModel.mAuthenticationResult == null) {
                    biometricViewModel.mAuthenticationResult = new MutableLiveData();
                }
                BiometricViewModel.updateValue(biometricViewModel.mAuthenticationResult, authenticationResult2);
            }
        };
    }
}
