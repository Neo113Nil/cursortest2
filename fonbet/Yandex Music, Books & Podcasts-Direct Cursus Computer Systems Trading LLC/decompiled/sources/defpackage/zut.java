package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class zut {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static rcf a(ncf ncfVar) {
        ocf p = rcf.p();
        int r = ncfVar.r();
        p.d();
        rcf.m((rcf) p.b, r);
        for (mcf mcfVar : ncfVar.q()) {
            pcf r2 = qcf.r();
            String r3 = mcfVar.q().r();
            r2.d();
            qcf.m((qcf) r2.b, r3);
            fbf t = mcfVar.t();
            r2.d();
            qcf.o((qcf) r2.b, t);
            oyj s = mcfVar.s();
            r2.d();
            qcf.n((qcf) r2.b, s);
            int r4 = mcfVar.r();
            r2.d();
            qcf.p((qcf) r2.b, r4);
            qcf qcfVar = (qcf) r2.b();
            p.d();
            rcf.n((rcf) p.b, qcfVar);
        }
        return (rcf) p.b();
    }
}
