package defpackage;

/* loaded from: classes.dex */
public final class fnx implements knx {
    public final slx a;
    public final l3l b;

    public fnx(l3l l3lVar, slx slxVar) {
        euk eukVar = fmx.a;
        this.b = l3lVar;
        this.a = slxVar;
    }

    @Override // defpackage.knx
    public final void a(Object obj) {
        this.b.getClass();
        mnx mnxVar = ((jmx) obj).zzc;
        if (mnxVar.d) {
            mnxVar.d = false;
        }
        euk eukVar = fmx.a;
        throw ouj.g(obj);
    }

    @Override // defpackage.knx
    public final int b(jmx jmxVar) {
        jmxVar.zzc.getClass();
        return 506991;
    }

    @Override // defpackage.knx
    public final boolean c(jmx jmxVar, jmx jmxVar2) {
        return jmxVar.zzc.equals(jmxVar2.zzc);
    }

    @Override // defpackage.knx
    public final void d(Object obj, Object obj2) {
        lnx.n(obj, obj2);
    }

    @Override // defpackage.knx
    public final int e(slx slxVar) {
        mnx mnxVar = ((jmx) slxVar).zzc;
        int i = mnxVar.c;
        if (i != -1) {
            return i;
        }
        mnxVar.c = 0;
        return 0;
    }

    @Override // defpackage.knx
    public final boolean f(Object obj) {
        throw ouj.g(obj);
    }

    @Override // defpackage.knx
    public final void g(Object obj, hjp hjpVar) {
        throw ouj.g(obj);
    }

    @Override // defpackage.knx
    public final jmx l() {
        slx slxVar = this.a;
        if (slxVar instanceof jmx) {
            return (jmx) ((jmx) slxVar).i(4, null);
        }
        imx imxVar = (imx) ((jmx) slxVar).i(5, null);
        boolean h = imxVar.b.h();
        jmx jmxVar = imxVar.b;
        if (!h) {
            return jmxVar;
        }
        jmxVar.getClass();
        hnx.c.a(jmxVar.getClass()).a(jmxVar);
        jmxVar.e();
        return imxVar.b;
    }
}
