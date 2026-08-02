package ru.CryptoPro.JCP.Key;

import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import ru.CryptoPro.JCP.params.CryptParamsInterface;

/* loaded from: classes4.dex */
public class KuznechikKExp15KeySpec extends MagmaKExp15KeySpec {
    public KuznechikKExp15KeySpec(SecretKeyInterface secretKeyInterface) throws InvalidKeyException, KeyManagementException {
        super(secretKeyInterface);
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKExp15KeySpec
    public final void a(SecretKeyInterface secretKeyInterface) {
        if (!this.x) {
            this.a = new KuznechikKeySpec(((KuznechikKExp15KeySpec) secretKeyInterface).a);
            return;
        }
        KuznechikKExp15KeySpec kuznechikKExp15KeySpec = (KuznechikKExp15KeySpec) secretKeyInterface;
        this.b = new KuznechikKeySpec(kuznechikKExp15KeySpec.b);
        this.c = new KuznechikKeySpec(kuznechikKExp15KeySpec.c);
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKExp15KeySpec
    public final void b(byte[] bArr, boolean z) {
        this.x = z;
        if (!z) {
            this.a = new KuznechikKeySpec(bArr, 0, 32, (CryptParamsInterface) null);
        } else {
            this.b = new KuznechikKeySpec(bArr, 32, 32, (CryptParamsInterface) null);
            this.c = new KuznechikKeySpec(bArr, 0, 32, (CryptParamsInterface) null);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.MagmaKExp15KeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new KuznechikKExp15KeySpec(this);
        } catch (Exception e) {
            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException(e.getMessage());
            cloneNotSupportedException.initCause(e);
            throw cloneNotSupportedException;
        }
    }

    public KuznechikKExp15KeySpec(byte[] bArr, boolean z) throws KeyManagementException {
        super(bArr, z);
    }
}
