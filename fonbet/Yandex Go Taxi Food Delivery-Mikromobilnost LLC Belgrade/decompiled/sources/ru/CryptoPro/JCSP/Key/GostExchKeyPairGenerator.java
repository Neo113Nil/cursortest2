package ru.CryptoPro.JCSP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import ru.CryptoPro.JCP.Key.InternalKeyPairGenerator;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptDhAllowedInterface;
import ru.CryptoPro.JCP.params.ExportableParameterInterface;
import ru.CryptoPro.JCP.params.MarkExportableParameterSpec;
import ru.CryptoPro.JCP.spec.X509PublicKeySpec;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.params.CopyRNDSpec;
import ru.CryptoPro.JCSP.params.PasswordParamsInterface;

/* loaded from: classes4.dex */
public abstract class GostExchKeyPairGenerator extends GostKeyPairGenerator {
    public GostExchKeyPairGenerator(String str) {
        super(new AlgIdSpec(AlgIdSpec.getDHDefault()), str);
        this.cryptDhAllowedForSignKey = true;
        this.exchange = true;
    }

    @Override // ru.CryptoPro.JCSP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        JCSPLogger.enter();
        boolean z = true;
        boolean z2 = false;
        if (algorithmParameterSpec instanceof ExportableParameterInterface) {
            this.exportable = false;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof MarkExportableParameterSpec) {
            this.exportable = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof PasswordParamsInterface) {
            this.passw = (PasswordParamsInterface) algorithmParameterSpec;
            this.userEnteredPassword = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof CryptDhAllowedInterface) {
            this.cryptDhAllowedForSignKey = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof CopyRNDSpec) {
            this.copyRnd = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof X509PublicKeySpec) {
            AlgIdInterface params = getParams((X509PublicKeySpec) algorithmParameterSpec, GostKeyPairGenerator.errorMessage1);
            InternalKeyPairGenerator.checkParams(params, GostKeyPairGenerator.errorMessage2, GostKeyPairGenerator.errorMessage3);
            checkAdSaveParams(params, this.exchange);
            z2 = true;
        }
        if (algorithmParameterSpec instanceof AlgIdInterface) {
            AlgIdInterface algIdInterface = (AlgIdInterface) algorithmParameterSpec;
            InternalKeyPairGenerator.checkParams(algIdInterface, GostKeyPairGenerator.errorMessage2, GostKeyPairGenerator.errorMessage3);
            checkAdSaveParams(algIdInterface, this.exchange);
        } else {
            z = z2;
        }
        if (z) {
            JCSPLogger.exit();
        } else {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(GostKeyPairGenerator.errorMessage2);
            JCSPLogger.warning(invalidAlgorithmParameterException);
            throw invalidAlgorithmParameterException;
        }
    }

    public GostExchKeyPairGenerator(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
        this.exchange = true;
    }
}
