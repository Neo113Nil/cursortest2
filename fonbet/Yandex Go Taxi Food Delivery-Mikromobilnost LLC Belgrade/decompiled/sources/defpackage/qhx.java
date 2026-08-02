package defpackage;

import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import java.security.PrivateKey;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.CAdES.envelope.EnvelopedOptions;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;

/* loaded from: classes4.dex */
public final class qhx extends ogi0 {
    public phx e;
    public w2 f;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
    @Override // defpackage.ogi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w40 b(jgi0 jgi0Var) {
        Asn1ObjectIdentifier asn1ObjectIdentifier;
        j2 j2Var;
        o2 o2Var;
        ar80 ar80Var;
        phx phxVar = this.e;
        mt61 mt61Var = (mt61) jgi0Var;
        xyu0 xyu0Var = null;
        try {
            AlgIdInterface algIdInterface = (AlgIdInterface) ((PrivateKeyInterface) ((InternalGostPrivateKey) ((PrivateKey) mt61Var.b)).getSpec()).getParams();
            AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) algIdInterface.getDecoded();
            try {
                if (algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256)) {
                    asn1ObjectIdentifier = new Asn1ObjectIdentifier(AlgIdSpec.OID_PARAMS_SIG_2012_256.value);
                } else {
                    if (algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                        asn1ObjectIdentifier = new Asn1ObjectIdentifier(AlgIdSpec.OID_PARAMS_SIG_2012_512.value);
                    }
                    Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                    algorithmIdentifier.encode(asn1BerEncodeBuffer);
                    j2Var = new j2(asn1BerEncodeBuffer.getMsgCopy());
                    i3 i3Var = (i3) j2Var.n();
                    j2Var.close();
                    xr1 m = xr1.m(i3Var);
                    yq80 yq80Var = phxVar.b;
                    o2Var = yq80Var.a;
                    if (o2Var instanceof s3) {
                        s3 s3Var = (s3) o2Var;
                        if (s3Var.l(1)) {
                            ar80Var = new ar80((i3) i3.b.Hg(s3Var, false));
                            if (ar80Var != null) {
                                mpf mpfVar = ar80Var.b;
                                zyu0 zyu0Var = new zyu0();
                                zyu0Var.b = mpfVar;
                                zyu0Var.a = m;
                                return new w40(new rr41((PrivateKey) mt61Var.b, this.b, this.c, zyu0Var, phxVar.c, this.f.a, (nr41) mt61Var.c, (EnvelopedOptions) mt61Var.w));
                            }
                            o2 o2Var2 = yq80Var.a;
                            p0x p0xVar = o2Var2 instanceof p0x ? (p0x) o2Var2 : null;
                            if (p0xVar == null) {
                                if (o2Var2 instanceof s3) {
                                    s3 s3Var2 = (s3) o2Var2;
                                    if (s3Var2.l(0)) {
                                        xyu0Var = xyu0.m((w2) w2.b.Hg(s3Var2, false));
                                    }
                                }
                                rza1.b(xyu0Var.a);
                            } else {
                                p0xVar.b.x();
                            }
                            throw new CMSException("No support for 'originator' as IssuerAndSerialNumber or SubjectKeyIdentifier");
                        }
                    }
                    ar80Var = null;
                    if (ar80Var != null) {
                    }
                }
                i3 i3Var2 = (i3) j2Var.n();
                j2Var.close();
                xr1 m2 = xr1.m(i3Var2);
                yq80 yq80Var2 = phxVar.b;
                o2Var = yq80Var2.a;
                if (o2Var instanceof s3) {
                }
                ar80Var = null;
                if (ar80Var != null) {
                }
            } catch (Throwable th) {
                j2Var.close();
                throw th;
            }
            algorithmIdentifier.algorithm = asn1ObjectIdentifier;
            Asn1BerEncodeBuffer asn1BerEncodeBuffer2 = new Asn1BerEncodeBuffer();
            algorithmIdentifier.encode(asn1BerEncodeBuffer2);
            j2Var = new j2(asn1BerEncodeBuffer2.getMsgCopy());
        } catch (Exception e) {
            ny61.n("Invalid recipient public key parameters", e);
            return null;
        }
    }
}
