package defpackage;

/* loaded from: classes5.dex */
public final class xn4 extends bt1 {
    public final /* synthetic */ sgr c;
    public final /* synthetic */ s2i d;
    public final /* synthetic */ osh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn4(osh oshVar, sgr sgrVar, s2i s2iVar) {
        super(1, ((zn4) oshVar.c).e);
        this.e = oshVar;
        this.c = sgrVar;
        this.d = s2iVar;
    }

    @Override // defpackage.bt1
    public final void b() {
        jkk.c();
        try {
            jkk.a();
            jee jeeVar = jkk.a;
            jeeVar.getClass();
            d();
            jeeVar.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        sgr sgrVar = this.c;
        s2i s2iVar = this.d;
        sgr sgrVar2 = (sgr) this.e.b;
        if (sgrVar2 != null) {
            s2iVar = new s2i();
            sgrVar = sgrVar2;
        }
        ((zn4) this.e.c).j = true;
        try {
            ((bg3) this.e.a).Q(sgrVar, s2iVar);
        } finally {
            ((zn4) this.e.c).h();
            ((zn4) this.e.c).d.D(sgrVar.g());
        }
    }
}
