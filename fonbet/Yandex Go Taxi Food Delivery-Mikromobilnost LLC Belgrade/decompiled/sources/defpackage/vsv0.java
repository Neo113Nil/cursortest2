package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;
import org.brotli.dec.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vsv0 implements p8w {
    public static final vsv0 c = new vsv0();
    public final msb1[] a;
    public final String b;

    public vsv0() {
        msb1[] msb1VarArr = {msb1.A};
        this.a = msb1VarArr;
        ArrayList arrayList = new ArrayList(1);
        msb1VarArr[0].getClass();
        arrayList.add("br");
        this.b = a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62);
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        msb1[] msb1VarArr = this.a;
        if (msb1VarArr.length != 0) {
            zci0 zci0Var = (zci0) m8wVar;
            d5j0 d5j0Var = zci0Var.e;
            if (d5j0Var.c.a("Accept-Encoding") == null) {
                t4j0 b = d5j0Var.b();
                b.c.g("Accept-Encoding", this.b);
                kvj0 b2 = zci0Var.b(new d5j0(b));
                if (lvu.a(b2)) {
                    rvj0 rvj0Var = b2.z;
                    String a = b2.y.a("Content-Encoding");
                    msb1 msb1Var = null;
                    if (a == null) {
                        a = null;
                    }
                    if (a != null) {
                        int length = msb1VarArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            msb1 msb1Var2 = msb1VarArr[i];
                            msb1Var2.getClass();
                            if ("br".equalsIgnoreCase(a)) {
                                msb1Var = msb1Var2;
                                break;
                            }
                            i++;
                        }
                        if (msb1Var != null) {
                            jci0 jci0Var = new jci0(vng.H(new b(rvj0Var.source().p2())));
                            cvj0 c2 = b2.c();
                            c2.f.f("Content-Encoding");
                            c2.f.f("Content-Length");
                            qvj0 qvj0Var = rvj0.Companion;
                            wg10 contentType = rvj0Var.contentType();
                            qvj0Var.getClass();
                            c2.g = new pvj0(contentType, -1L, jci0Var);
                            return c2.a();
                        }
                    }
                }
                return b2;
            }
        }
        zci0 zci0Var2 = (zci0) m8wVar;
        return zci0Var2.b(zci0Var2.e);
    }
}
