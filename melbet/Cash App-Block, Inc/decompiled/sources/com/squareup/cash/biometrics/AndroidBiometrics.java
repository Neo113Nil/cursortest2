package com.squareup.cash.biometrics;

import android.app.Application;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.biometric.AuthenticatorUtils;
import androidx.biometric.BiometricManager$Api29Impl;
import androidx.biometric.BiometricManager$Api30Impl;
import androidx.biometric.CryptoObjectUtils;
import androidx.biometric.DeviceUtils;
import androidx.biometric.KeyguardUtils;
import com.google.android.gms.dynamite.zzh;
import com.google.android.play.integrity.internal.ax;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.wire.GrpcMethod;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.android.HandlerContext;

/* loaded from: classes.dex */
public final class AndroidBiometrics {
    public final GrpcMethod biometricManager;
    public final CoroutineContext uiDispatcher;

    public AndroidBiometrics(Application application, HandlerContext handlerContext) {
        handlerContext.getClass();
        this.uiDispatcher = handlerContext;
        ax axVar = new ax(application);
        GrpcMethod grpcMethod = new GrpcMethod();
        grpcMethod.path = axVar;
        grpcMethod.requestAdapter = BiometricManager$Api29Impl.create(axVar.a);
        grpcMethod.responseAdapter = Build.VERSION.SDK_INT <= 29 ? new zzh(4) : null;
        this.biometricManager = grpcMethod;
    }

    public final Biometrics$AuthenticationStatus getAuthenticationStatusForAuthenticator(int i) {
        BiometricPrompt.CryptoObject wrapForBiometricPrompt;
        GrpcMethod grpcMethod = this.biometricManager;
        BiometricManager biometricManager = (BiometricManager) grpcMethod.requestAdapter;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 1;
        if (i2 < 30) {
            ax axVar = (ax) grpcMethod.path;
            if (AuthenticatorUtils.isSupportedCombination(i)) {
                if (i != 0) {
                    Context context = axVar.a;
                    if (KeyguardUtils.getKeyguardManager(context) != null) {
                        int i4 = 0;
                        if (AuthenticatorUtils.isDeviceCredentialAllowed(i)) {
                            if (!KeyguardUtils.isDeviceSecuredWithCredential(context)) {
                                i3 = 11;
                            }
                            i3 = i4;
                        } else if (i2 != 29) {
                            i3 = grpcMethod.canAuthenticateWithFingerprint();
                        } else if (!AuthenticatorUtils.isWeakBiometricAllowed(i)) {
                            Method canAuthenticateWithCryptoMethod = BiometricManager$Api29Impl.getCanAuthenticateWithCryptoMethod();
                            if (canAuthenticateWithCryptoMethod != null && (wrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(CryptoObjectUtils.createFakeCryptoObject())) != null) {
                                try {
                                    Object invoke = canAuthenticateWithCryptoMethod.invoke(biometricManager, wrapForBiometricPrompt);
                                    if (invoke instanceof Integer) {
                                        i3 = ((Integer) invoke).intValue();
                                    } else {
                                        Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                                    }
                                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                                }
                            }
                            if (biometricManager == null) {
                                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                            } else {
                                i3 = BiometricManager$Api29Impl.canAuthenticate(biometricManager);
                            }
                            String str = Build.MODEL;
                            if (!DeviceUtils.canAssumeStrongBiometrics(context) && i3 == 0) {
                                if (!KeyguardUtils.isDeviceSecuredWithCredential(context)) {
                                    i4 = grpcMethod.canAuthenticateWithFingerprint();
                                } else if (grpcMethod.canAuthenticateWithFingerprint() != 0) {
                                    i4 = -1;
                                }
                                i3 = i4;
                            }
                        } else if (biometricManager == null) {
                            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                        } else {
                            i3 = BiometricManager$Api29Impl.canAuthenticate(biometricManager);
                        }
                    }
                }
                i3 = 12;
            } else {
                i3 = -2;
            }
        } else if (biometricManager == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        } else {
            i3 = BiometricManager$Api30Impl.canAuthenticate(biometricManager, i);
        }
        return i3 != 0 ? i3 != 11 ? i3 != 15 ? Biometrics$AuthenticationStatus.HardwareNotSupported.INSTANCE : Biometrics$AuthenticationStatus.OsUpdateRequired.INSTANCE : Biometrics$AuthenticationStatus.NoBiometricSignatures.INSTANCE : Biometrics$AuthenticationStatus.BiometricsEnrolled.INSTANCE;
    }
}
