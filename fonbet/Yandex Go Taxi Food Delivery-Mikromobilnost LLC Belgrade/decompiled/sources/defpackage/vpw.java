package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class vpw implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpw b;

    public /* synthetic */ vpw(wpw wpwVar, int i) {
        this.a = i;
        this.b = wpwVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        wpw wpwVar = this.b;
        switch (i) {
            case 0:
                i6r i6rVar = wpwVar.D;
                c0g c0gVar = (c0g) i6rVar;
                c0g c0gVar2 = (c0g) i6rVar;
                return new npw(c0gVar.w, (a980) c0gVar.z.p4.get(), c0gVar2.C2(), (hq70) c0gVar2.Rw.get(), new vpw(wpwVar, 1));
            default:
                wpwVar.r(new qu(9));
                return zy11.a;
        }
    }
}
