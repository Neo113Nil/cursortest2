package ru.CryptoPro.JCSP.params;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.ProvEnumAlgStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.CSPProv2012_256;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes4.dex */
public class AlgorithmParameterValidator extends AlgorithmParametersSpi {
    private int a;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        CSPProv2012_256 cSPProv2012_256 = new CSPProv2012_256();
        try {
            cSPProv2012_256.createWithoutContainer();
            int i = 1;
            while (true) {
                byte[] bArr = new byte[40];
                try {
                    cSPProv2012_256.getProvParam(1, bArr, new int[]{40}, i);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    ProvEnumAlgStructure provEnumAlgStructure = new ProvEnumAlgStructure();
                    provEnumAlgStructure.read(byteArrayInputStream);
                    if (provEnumAlgStructure.Algid.value == this.a) {
                        return provEnumAlgStructure.szName.value;
                    }
                    i = 0;
                } catch (MSException unused) {
                    return null;
                }
            }
        } catch (StructException e) {
            JCSPLogger.ignoredException(e);
            return null;
        } finally {
            cSPProv2012_256.releaseContext(5);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        throw new InvalidParameterSpecException("Unsupported method");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        throw new InvalidParameterSpecException("Unsupported method");
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        this.a = Array.getInt(bArr, 0);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        this.a = Array.getInt(bArr, 0);
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        return engineGetEncoded();
    }
}
