package ru.CryptoPro.JCP.Key;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public interface MasterSecretInterface extends SecretKey {
    SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, InvalidKeyException;

    SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, InvalidKeyException;

    SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, boolean z, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, boolean z4) throws NoSuchAlgorithmException, InvalidKeyException;

    byte[] computeFinished(byte[] bArr, byte[] bArr2) throws InvalidKeyException;
}
