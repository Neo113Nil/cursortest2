package ru.CryptoPro.CAdES;

import defpackage.b490;
import defpackage.bcs0;
import defpackage.c06;
import defpackage.jw61;
import defpackage.nju0;
import defpackage.pv61;
import defpackage.u2;
import defpackage.v87;
import defpackage.xu61;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.signature.AdESSigner;
import ru.CryptoPro.AdES.tools.CACertsUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.verifier.GostDigestCalculatorProvider;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESSignature extends AbstractCAdESSignature {
    public CAdESSignature(InputStream inputStream, InputStream inputStream2, Integer num, boolean z, boolean z2) throws CAdESException {
        JCPLogger.subEnter();
        try {
            GostDigestCalculatorProvider gostDigestCalculatorProvider = new GostDigestCalculatorProvider(null, AdESSigner.PROVIDER, z);
            InputStream xu61Var = inputStream2 instanceof FileInputStream ? new xu61((FileInputStream) inputStream2) : inputStream2;
            v87 v87Var = xu61Var != null ? new v87(gostDigestCalculatorProvider, new c06(new u2(b490.o3.a), xu61Var, 0), inputStream) : new v87(gostDigestCalculatorProvider, null, inputStream);
            u2 u2Var = jw61.a;
            a(new pv61(v87Var), gostDigestCalculatorProvider, xu61Var != null, xu61Var, num, z, z2);
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new CAdESException("Opening file input stream failed.", e, IAdESException.ecInternal);
        } catch (CMSException e2) {
            throw new CAdESException("Reading input stream failed, DER encoded data is expected.", e2, IAdESException.ecInvalidSignatureEncodingFormat);
        }
    }

    public static boolean reloadCACerts() {
        return CACertsUtility.reload();
    }

    public static void replaceCertificatesAndCRLs(InputStream inputStream, nju0 nju0Var, nju0 nju0Var2, nju0 nju0Var3, OutputStream outputStream) throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Replacing certificate and crl store... %%%");
        if (inputStream == null) {
            throw new CAdESException(IAdESException.ecSignatureOutputStreamUndefined);
        }
        if (outputStream == null) {
            throw new CAdESException(IAdESException.ecSignatureOutputStreamUndefined);
        }
        try {
            v87.Wg(inputStream, nju0Var, nju0Var2, nju0Var3, outputStream);
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecReplacingSignatureCertificatesAndCRLsFailed);
        } catch (CMSException e2) {
            throw new CAdESException(e2, IAdESException.ecReplacingSignatureCertificatesAndCRLsFailed);
        }
    }

    public static void replaceSigners(InputStream inputStream, bcs0 bcs0Var, OutputStream outputStream) throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Replacing signer store... %%%");
        if (inputStream == null) {
            throw new CAdESException(IAdESException.ecSignatureOutputStreamUndefined);
        }
        if (outputStream == null) {
            throw new CAdESException(IAdESException.ecSignatureOutputStreamUndefined);
        }
        try {
            v87.Xg(inputStream, bcs0Var, outputStream);
            JCPLogger.fine("%%% Signer store has been replaced %%%");
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecReplacingSignatureSignersFailed);
        } catch (CMSException e2) {
            throw new CAdESException(e2, IAdESException.ecReplacingSignatureSignersFailed);
        }
    }

    public CAdESSignature(InputStream inputStream, InputStream inputStream2, Integer num) throws CAdESException {
        this(inputStream, inputStream2, num, false);
    }

    public CAdESSignature(InputStream inputStream, InputStream inputStream2, Integer num, boolean z) throws CAdESException {
        this(inputStream, inputStream2, num, z, false);
    }

    public CAdESSignature() throws CAdESException {
        this(false);
    }

    public CAdESSignature(boolean z) throws CAdESException {
        this(z, false);
    }

    public CAdESSignature(boolean z, boolean z2) throws CAdESException {
        a(null, null, z, null, CAdESParameters.CAdES_Unknown, z2, false);
    }

    public CAdESSignature(byte[] bArr, byte[] bArr2, Integer num) throws CAdESException {
        this(new ByteArrayInputStream(bArr), bArr2 != null ? new ByteArrayInputStream(bArr2) : null, num);
    }

    public CAdESSignature(byte[] bArr, byte[] bArr2, Integer num, boolean z) throws CAdESException {
        this((InputStream) new ByteArrayInputStream(bArr), (InputStream) (bArr2 != null ? new ByteArrayInputStream(bArr2) : null), num, z, false);
    }

    public CAdESSignature(byte[] bArr, byte[] bArr2, Integer num, boolean z, boolean z2) throws CAdESException {
        this(new ByteArrayInputStream(bArr), bArr2 != null ? new ByteArrayInputStream(bArr2) : null, num, z, z2);
    }
}
