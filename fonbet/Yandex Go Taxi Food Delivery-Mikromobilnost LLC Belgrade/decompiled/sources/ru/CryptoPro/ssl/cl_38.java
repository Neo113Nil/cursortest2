package ru.CryptoPro.ssl;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.ny61;
import java.io.IOException;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax._Gost28147_89_EncryptionSyntaxValues;
import ru.CryptoPro.JCP.ASN.GostR3411_94_DigestSyntax._GostR3411_94_DigestSyntaxValues;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS.TLSGostExtensionHashHMACSelect;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS.TLSGostExtensionHashHMACSelectClient;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS.TLSGostExtensionHashHMACSelectServer;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_TLS._Gost_CryptoPro_TLSValues;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
final class cl_38 extends cl_66 {
    public static final int a = 65000;
    public static final int b = 65000;
    public byte[] c;

    public static boolean a(cl_38 cl_38Var, boolean z) throws IOException {
        int i = cl_36.l.a;
        int i2 = cl_38Var.d.a;
        if (i != i2) {
            return false;
        }
        if (!z && i2 == 65000) {
            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(cl_38Var.c);
            TLSGostExtensionHashHMACSelectClient tLSGostExtensionHashHMACSelectClient = new TLSGostExtensionHashHMACSelectClient();
            try {
                tLSGostExtensionHashHMACSelectClient.decode(asn1BerDecodeBuffer);
                if (tLSGostExtensionHashHMACSelectClient.elements.length > 1) {
                    SSLLogger.fine("Warning! More than 1 element in TLSGostExtensionHashHMACSelectClient!");
                }
                if (!c(tLSGostExtensionHashHMACSelectClient.elements[0])) {
                    ny61.v("Invalid extension");
                    return false;
                }
            } catch (Asn1Exception e) {
                IOException iOException = new IOException("Invalid extension");
                iOException.initCause(e);
                throw iOException;
            }
        } else if (z && i2 == 65000) {
            Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(cl_38Var.c);
            TLSGostExtensionHashHMACSelectServer tLSGostExtensionHashHMACSelectServer = new TLSGostExtensionHashHMACSelectServer();
            try {
                tLSGostExtensionHashHMACSelectServer.decode(asn1BerDecodeBuffer2);
                if (!c(tLSGostExtensionHashHMACSelectServer)) {
                    ny61.v("Invalid extension");
                    return false;
                }
            } catch (Asn1Exception e2) {
                IOException iOException2 = new IOException("Invalid extension");
                iOException2.initCause(e2);
                throw iOException2;
            }
        } else {
            SSLLogger.fine("Skip extension with type: ", Integer.valueOf(i2));
        }
        return true;
    }

    public static boolean c(TLSGostExtensionHashHMACSelect tLSGostExtensionHashHMACSelect) {
        return Arrays.equals(tLSGostExtensionHashHMACSelect.hashAlgorithm.algorithm.value, _GostR3411_94_DigestSyntaxValues.id_GostR3411_94) && Arrays.equals(tLSGostExtensionHashHMACSelect.hmacAlgorithm.algorithm.value, _Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_MAC) && Arrays.equals(tLSGostExtensionHashHMACSelect.prfAlgorithm.algorithm.value, _Gost_CryptoPro_TLSValues.id_PRF_GostR3411_94) && tLSGostExtensionHashHMACSelect.hashAlgorithm.parameters == null && tLSGostExtensionHashHMACSelect.hmacAlgorithm.parameters == null && tLSGostExtensionHashHMACSelect.prfAlgorithm.parameters == null;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        byte[] bArr = this.c;
        return (bArr == null ? 0 : bArr.length) + 4;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        StringBuilder sb = new StringBuilder("Extension ");
        sb.append(this.d);
        sb.append(", ext_hash_and_mac_alg_select: ");
        byte[] bArr = this.c;
        sb.append(bArr.length == 0 ? "<empty>" : Arrays.toString(bArr));
        return sb.toString();
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        byte[] bArr = this.c;
        cl_62Var.e(bArr == null ? 0 : bArr.length);
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            cl_62Var.write(bArr2);
        }
    }

    public static cl_66 a() {
        TLSGostExtensionHashHMACSelectServer tLSGostExtensionHashHMACSelectServer = new TLSGostExtensionHashHMACSelectServer();
        tLSGostExtensionHashHMACSelectServer.hashAlgorithm = new AlgorithmIdentifier(_GostR3411_94_DigestSyntaxValues.id_GostR3411_94, (Asn1Type) null);
        tLSGostExtensionHashHMACSelectServer.hmacAlgorithm = new AlgorithmIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_MAC, (Asn1Type) null);
        tLSGostExtensionHashHMACSelectServer.prfAlgorithm = new AlgorithmIdentifier(_Gost_CryptoPro_TLSValues.id_PRF_GostR3411_94, (Asn1Type) null);
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        try {
            tLSGostExtensionHashHMACSelectServer.encode(asn1BerEncodeBuffer);
            byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
            cl_38 cl_38Var = new cl_38(cl_36.l);
            cl_38Var.c = null;
            cl_38Var.c = (byte[]) msgCopy.clone();
            return cl_38Var;
        } catch (Asn1Exception e) {
            RuntimeException runtimeException = new RuntimeException("Invalid extension");
            runtimeException.initCause(e);
            throw runtimeException;
        }
    }
}
