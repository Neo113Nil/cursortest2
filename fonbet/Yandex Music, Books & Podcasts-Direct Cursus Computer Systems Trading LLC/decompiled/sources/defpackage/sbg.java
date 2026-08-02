package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class sbg implements xbg {
    public final /* synthetic */ int a;
    public final /* synthetic */ acg b;

    public /* synthetic */ sbg(acg acgVar, int i) {
        this.a = i;
        this.b = acgVar;
    }

    @Override // defpackage.xbg
    public final void a(paw pawVar) {
        switch (this.a) {
            case 0:
                acg acgVar = this.b;
                acgVar.a.H(acgVar.h, "pause", "Postponed pause", new Object[0]);
                pawVar.b();
                break;
            case 1:
                acg acgVar2 = this.b;
                acgVar2.a.H(acgVar2.h, "seekTo", "Postponed seekTo", new Object[0]);
                pawVar.s(0L);
                break;
            default:
                acg acgVar3 = this.b;
                acgVar3.a.H(acgVar3.h, "play", "Postponed play", new Object[0]);
                pawVar.d();
                break;
        }
    }
}
