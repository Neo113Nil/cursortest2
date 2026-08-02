package ru.CryptoPro.JCP.tools;

import defpackage.w511;
import java.security.PrivateKey;
import java.security.PublicKey;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;

/* loaded from: classes4.dex */
public class JCPKeyPair {
    public final PrivateKey a;
    public final PublicKey b;

    public JCPKeyPair(PublicKey publicKey, PrivateKey privateKey) {
        this.a = privateKey;
        this.b = publicKey;
    }

    public PrivateKey getPrivate() {
        return this.a;
    }

    public PublicKey getPublic() {
        return this.b;
    }

    public boolean match(String str) throws Exception {
        PrivateKey privateKey = this.a;
        if (privateKey instanceof InternalGostPrivateKey) {
            return ((PrivateKeyInterface) ((InternalGostPrivateKey) privateKey).getSpec()).match(this.b, str);
        }
        w511.s("Unknown private key format.");
        return false;
    }

    public boolean match() throws Exception {
        return match(null);
    }
}
