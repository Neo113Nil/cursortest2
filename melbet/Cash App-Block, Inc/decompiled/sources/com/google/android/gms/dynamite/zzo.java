package com.google.android.gms.dynamite;

import android.content.Context;
import android.os.Build;
import android.os.WorkSource;
import androidx.camera.camera2.pipe.CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.ui.text.input.OffsetMapping;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.crypto.tink.aead.internal.AesGcmJceUtil;
import com.google.crypto.tink.hybrid.internal.HpkeAead;
import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.mlkit.vision.text.internal.zzr;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import papa.InteractionTrace;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class zzo implements VectorizedDurationBasedAnimationSpec, DynamiteModule.VersionPolicy.IVersions, HpkeAead, OffsetMapping, InteractionTrace {
    public int zza;

    public zzo(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported key length: "));
        }
        this.zza = i;
    }

    public CurrentLocationRequest build() {
        return new CurrentLocationRequest(10000L, 0, this.zza, Long.MAX_VALUE, false, 0, new WorkSource(null), null);
    }

    @Override // papa.InteractionTrace
    public void endTrace() {
        SafeTrace.endAsyncSection("Tap Interaction", this.zza);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] getAeadId() {
        int i = this.zza;
        if (i == 16) {
            return HpkeUtil.AES_128_GCM_AEAD_ID;
        }
        if (i == 32) {
            return HpkeUtil.AES_256_GCM_AEAD_ID;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Could not determine HPKE AEAD ID");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.zza;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return 0;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public int getKeyLength() {
        return this.zza;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getValueFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return j < ((long) this.zza) * 1000000 ? animationVector : animationVector2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getVelocityFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return animationVector3;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] open(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != this.zza) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
        }
        if (!re$$ExternalSyntheticOutline0._isCompatible$1(2)) {
            a$$ExternalSyntheticBUOutline0.m$6("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        SecretKeySpec secretKey = AesGcmJceUtil.getSecretKey(bArr);
        if (bArr2.length != 12) {
            a$$ExternalSyntheticBUOutline0.m$6("iv is wrong size");
            return null;
        }
        if (bArr3.length < i + 16) {
            a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec params = AesGcmJceUtil.getParams(0, bArr2.length, bArr2);
        Cipher threadLocalCipher = AesGcmJceUtil.getThreadLocalCipher();
        threadLocalCipher.init(2, secretKey, params);
        if (bArr4.length != 0) {
            threadLocalCipher.updateAAD(bArr4);
        }
        return threadLocalCipher.doFinal(bArr3, i, bArr3.length - i);
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        if (i <= 3) {
            return i;
        }
        int i2 = i - this.zza;
        int i3 = (i2 / 3) + i2;
        return i2 % 3 == 0 ? i3 - 1 : i3;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public byte[] seal(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != this.zza) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
        }
        zzr zzrVar = new zzr(bArr);
        if (bArr2.length != 12) {
            a$$ExternalSyntheticBUOutline0.m$6("iv is wrong size");
            return null;
        }
        AlgorithmParameterSpec params = AesGcmJceUtil.getParams(0, bArr2.length, bArr2);
        Cipher threadLocalCipher = AesGcmJceUtil.getThreadLocalCipher();
        threadLocalCipher.init(1, (SecretKeySpec) zzrVar.zza, params);
        if (bArr4.length != 0) {
            threadLocalCipher.updateAAD(bArr4);
        }
        int outputSize = threadLocalCipher.getOutputSize(bArr3.length);
        if (outputSize > Integer.MAX_VALUE - i) {
            a$$ExternalSyntheticBUOutline0.m$6("plaintext too long");
            return null;
        }
        byte[] bArr5 = new byte[i + outputSize];
        if (threadLocalCipher.doFinal(bArr3, 0, bArr3.length, bArr5, i) == outputSize) {
            return bArr5;
        }
        a$$ExternalSyntheticBUOutline0.m$6("not enough data written");
        return null;
    }

    public void setPriority() {
        com.google.android.gms.location.zzo.zza(100);
        this.zza = 100;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        return i > 3 ? i - (i / 4) : i;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public int zza(Context context, String str, boolean z) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public int zzb(Context context, String str) {
        return this.zza;
    }

    public zzo(int i, CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior cameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior) {
        cameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior.getClass();
        this.zza = i;
    }

    public zzo(int i, boolean z) {
        switch (i) {
            case 10:
                this.zza = Build.VERSION.SDK_INT;
                break;
            default:
                this.zza = 102;
                break;
        }
    }

    public zzo(String str, CharSequence charSequence, int i) {
        str.getClass();
        charSequence.getClass();
        this.zza = i;
    }

    public /* synthetic */ zzo(byte b, int i) {
        this.zza = i;
    }
}
