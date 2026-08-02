package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class epw {
    public static final /* synthetic */ s9f[] l;
    public final qfw a;
    public final es6 b;
    public final yiq c;
    public final mm6 d;
    public final jyr e;
    public final jyr f;
    public final z6n g;
    public final trw h;
    public final jyr i;
    public final xdr j;
    public final xdr k;

    static {
        opi opiVar = new opi(epw.class, "processorJob", "getProcessorJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        l = new s9f[]{opiVar};
    }

    public epw(diw diwVar, qfw qfwVar, es6 es6Var) {
        diwVar.getClass();
        qfwVar.getClass();
        this.a = qfwVar;
        this.b = es6Var;
        yiq yiqVar = new yiq();
        this.c = yiqVar;
        mm6 r = hld.r(yiqVar, dm6.b());
        this.d = r;
        this.e = diwVar.b(hag.I(zzp.class), true);
        this.f = diwVar.b(hag.I(mlw.class), true);
        this.g = new z6n(7);
        this.h = new trw(a(), new vow(this, 1), new q0v(18, this));
        this.i = btf.b(new hav(17, this, diwVar));
        xdr a = ydr.a(Boolean.FALSE);
        this.j = a;
        xdr a2 = ydr.a(null);
        this.k = a2;
        qqw qqwVar = qqw.b;
        ox6.B(new f9l(28, qfwVar.i(qqwVar)), r, new bpw(this, 0));
        ox6.B(zsd.b0(new l8v(qfwVar.i(qqwVar), this, 19)), r, new bpw(this, 1));
        ox6.B(new bca(a2, 18), r, new bpw(this, 2));
        ox6.B(new alc(a, new ow1(this, (Continuation) null, 11)), r, new bpw(this, 3));
        xdr xdrVar = b().f;
        b().getClass();
        ox6.B(new qk3(ox6.R(xdrVar, qmw.f), 10), r, new bpw(this, 4));
    }

    public static void c(epw epwVar, faq faqVar, boolean z, int i) {
        tnl tnlVar = tnl.b;
        if ((i & 1) != 0) {
            faqVar = (faq) epwVar.k.getValue();
        }
        if ((i & 2) != 0) {
            z = ((Boolean) epwVar.j.getValue()).booleanValue();
        }
        if ((i & 4) != 0) {
            tnlVar = faqVar == null ? tnl.a : tnl.d;
        }
        if (faqVar == null) {
            epwVar.getClass();
            return;
        }
        sqw sqwVar = (sqw) epwVar.a.F.getValue();
        pqw t = sqwVar != null ? s7g.t(sqwVar) : null;
        if (faqVar.equals(t != null ? t.b.b() : null)) {
            epwVar.b.Q(new gzk(faqVar, tnlVar, z, false));
        }
    }

    public final zzp a() {
        return (zzp) this.e.getValue();
    }

    public final rmw b() {
        return (rmw) this.i.getValue();
    }

    public final void d(long j) {
        qmw qmwVar = (qmw) b().f.getValue();
        qmwVar.getClass();
        qmw b = qmw.b(qmwVar, Long.valueOf(j), null, 6);
        b().a(b);
        e(new hav(19, b, this));
    }

    public final void e(Function0 function0) {
        zow zowVar = (zow) function0.invoke();
        trw trwVar = this.h;
        trwVar.getClass();
        zowVar.getClass();
        faq faqVar = (faq) trwVar.b.invoke();
        if (faqVar == null) {
            return;
        }
        trwVar.d.add(new rrw(zowVar, faqVar));
        rar y = x97.y(this.d, null, null, new r1w(this, null, 5), 3);
        this.g.setValue(this, l[0], y);
    }
}
