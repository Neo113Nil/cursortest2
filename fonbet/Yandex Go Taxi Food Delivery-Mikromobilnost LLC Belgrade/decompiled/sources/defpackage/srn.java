package defpackage;

/* loaded from: classes13.dex */
public final class srn implements sy60 {
    public final /* synthetic */ int a;
    public final cms b;

    public /* synthetic */ srn(cms cmsVar, int i) {
        this.a = i;
        this.b = cmsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        cms cmsVar = this.b;
        switch (i) {
            case 0:
                ((sls) cmsVar).invoke();
                break;
            default:
                ((ivl0) cmsVar).invoke(Boolean.FALSE);
                break;
        }
    }
}
