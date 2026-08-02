package ru.CryptoPro.JCSP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.UnrecoverableKeyException;
import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.InternalKeyPairGenerator;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.JCSPProvider2012Interface;

/* loaded from: classes4.dex */
public abstract class cl_1 extends GostKeyPairGenerator implements JCSPProvider2012Interface {
    public cl_1(String str) {
        super(str);
        this.exportable = false;
    }

    public static KeyPair a(boolean z, AlgIdInterface algIdInterface, int i, boolean z2, boolean z3) {
        KeyPair keyPair;
        AbstractKeySpec exchPrivateKeySpec;
        PublicKeySpec publicKeySpec;
        JCSPLogger.enter();
        try {
            InternalKeyPairGenerator.checkParams(algIdInterface, GostKeyPairGenerator.errorMessage2, GostKeyPairGenerator.errorMessage3);
            exchPrivateKeySpec = z ? new ExchPrivateKeySpec(algIdInterface, z2, true, true) : new PrivateKeySpec(algIdInterface, z2, z3, true);
            exchPrivateKeySpec.createEPH(i);
            publicKeySpec = (PublicKeySpec) exchPrivateKeySpec.generatePublic();
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | UnrecoverableKeyException | InvalidKeySpecException e) {
            GostKeyPairGenerator.throwEx(e);
            keyPair = null;
        }
        if (!publicKeySpec.checkPublic()) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
        }
        keyPair = new KeyPair(new GostPublicKey(publicKeySpec), z ? new GostExchPrivateKey(exchPrivateKeySpec) : new GostPrivateKey(exchPrivateKeySpec));
        JCSPLogger.exit();
        return keyPair;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        JCSPLogger.enter();
        KeyPair a = a(this.exchange, this.params, getAlgorithmIdentifier(), this.exportable, this.cryptDhAllowedForSignKey);
        JCSPLogger.exit();
        return a;
    }

    public abstract /* synthetic */ int getAlgorithmIdentifier();

    public cl_1(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
        this.exportable = false;
    }
}
