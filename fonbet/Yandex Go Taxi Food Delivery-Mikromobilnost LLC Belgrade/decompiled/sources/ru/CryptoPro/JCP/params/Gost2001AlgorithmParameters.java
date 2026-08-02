package ru.CryptoPro.JCP.params;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.kbs;
import defpackage.ny61;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax.GostR3410_2001_PublicKeyParameters;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class Gost2001AlgorithmParameters extends AlgorithmParametersSpi {
    private Asn1Type a;

    public Asn1Type createParameters() {
        return new GostR3410_2001_PublicKeyParameters();
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (str == null || str.equals("ASN.1") || str.equalsIgnoreCase(JCP.CERTIFICATE_FACTORY_NAME)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        throw new InvalidParameterSpecException("engineGetParameterSpec(paramSpec) is unsupported for " + getParametersName());
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (str == null || str.equals("ASN.1") || str.equalsIgnoreCase(JCP.CERTIFICATE_FACTORY_NAME)) {
            engineInit(bArr);
        } else {
            ny61.v("Unknown format ".concat(str));
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return getParametersName() + " parameters";
    }

    public String getParametersName() {
        return "GOST R 34.10-2001";
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        try {
            this.a.encode(asn1BerEncodeBuffer);
            return asn1BerEncodeBuffer.getMsgCopy();
        } catch (Asn1Exception e) {
            kbs.r(e);
            return null;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        this.a = createParameters();
        try {
            this.a.decode(new Asn1BerDecodeBuffer(bArr));
        } catch (Asn1Exception e) {
            kbs.r(e);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        throw new InvalidParameterSpecException("engineInit(paramSpec) is unsupported for " + getParametersName());
    }
}
