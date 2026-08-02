package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class rbg implements xbg {
    public final /* synthetic */ acg a;
    public final /* synthetic */ iyn b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ rbg(acg acgVar, iyn iynVar, boolean z) {
        this.a = acgVar;
        this.b = iynVar;
        this.c = z;
    }

    @Override // defpackage.xbg
    public final void a(paw pawVar) {
        acg acgVar = this.a;
        acgVar.a.H(acgVar.h, "setLoopPlayback", "setLoopPlayback = " + this.c, new Object[0]);
        pawVar.r(this.b);
    }
}
