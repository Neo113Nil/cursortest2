package ru.CryptoPro.JCP.Key;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class AbstractMasterSecret implements MasterSecretInterface {
    @Override // ru.CryptoPro.JCP.Key.MasterSecretInterface
    public abstract /* synthetic */ SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.MasterSecretInterface
    public abstract /* synthetic */ SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.MasterSecretInterface
    public abstract /* synthetic */ SecretKey calculateConnectionKey(byte[] bArr, byte[] bArr2, boolean z, byte[] bArr3, AlgorithmParameterSpec algorithmParameterSpec, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, boolean z4) throws NoSuchAlgorithmException, InvalidKeyException;

    @Override // ru.CryptoPro.JCP.Key.MasterSecretInterface
    public abstract /* synthetic */ byte[] computeFinished(byte[] bArr, byte[] bArr2) throws InvalidKeyException;

    @Override // java.security.Key
    public String getAlgorithm() {
        return null;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }
}
