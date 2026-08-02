package defpackage;

import java.math.BigInteger;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class ru61 extends kkh {
    public static final ArrayList z;
    public String b;
    public final String c;
    public final X509Certificate w;
    public boolean x;
    public Hashtable y;

    static {
        ArrayList arrayList = new ArrayList();
        z = arrayList;
        arrayList.add(j87.a);
    }

    public ru61(List list, xc3 xc3Var) {
        super(xc3Var);
        this.b = null;
        LinkedList linkedList = new LinkedList();
        this.y = new Hashtable();
        JCPLogger.fine("Initializing of CAdES-BES attribute table generator.");
        X509Certificate x509Certificate = (X509Certificate) list.get(0);
        this.w = x509Certificate;
        this.c = AlgorithmUtility.keyAlgToDigestOid(x509Certificate.getPublicKey().getAlgorithm());
        linkedList.addAll(list);
    }

    @Override // defpackage.kkh
    public final Hashtable a(Map map) {
        JCPLogger.fine("Creating of CAdES-BES attribute table.");
        Hashtable a = super.a(map);
        if (this.x) {
            Iterator it = z.iterator();
            while (it.hasNext()) {
                u2 u2Var = (u2) it.next();
                JCPLogger.fineFormat("Removing of the signed attribute {0} from countersignature:{1} ", u2Var, a.remove(u2Var));
            }
        }
        String str = this.c;
        JCPLogger.subEnter();
        X509Certificate x509Certificate = this.w;
        BigInteger serialNumber = x509Certificate.getSerialNumber();
        jc51 m = jc51.m(x509Certificate.getIssuerX500Principal().getEncoded());
        r0x r0xVar = new r0x(new gxs(new fxs(m)), serialNumber);
        JCPLogger.fineFormat("Certificate in signing-certificateV2: sn {0} issued by {1}", serialNumber.toString(16), m);
        try {
            byte[] calculateDigest = AdESUtility.calculateDigest(this.b, str, x509Certificate.getEncoded());
            xr1 xr1Var = new xr1(new u2(str));
            san sanVar = new san();
            sanVar.a = xr1Var;
            sanVar.b = rza1.b(calculateDigest);
            sanVar.c = r0xVar;
            u2 u2Var2 = b490.I3;
            ecs0 ecs0Var = new ecs0();
            ecs0Var.a = new jqf(new san[]{sanVar});
            vc3 vc3Var = new vc3(u2Var2, new lqf(ecs0Var));
            JCPLogger.fine("Add signed attribute signing-certificate v2: ", vc3Var.a.a);
            a.put(vc3Var.a, vc3Var);
            JCPLogger.subExit();
            this.y = CAdESUtility.copyHashTable(a);
            return a;
        } catch (CertificateEncodingException e) {
            yci0.r(e);
            return null;
        } catch (AdESException e2) {
            yci0.r(new CAdESException(e2, e2.getErrorCode()));
            return null;
        }
    }
}
