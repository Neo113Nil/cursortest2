package defpackage;

/* loaded from: classes13.dex */
public final class vul0 implements sy60 {
    public final /* synthetic */ int a;
    public final cms b;

    public /* synthetic */ vul0(cms cmsVar, int i) {
        this.a = i;
        this.b = cmsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        cms cmsVar = this.b;
        switch (i) {
            case 0:
                ((ivl0) cmsVar).invoke(Boolean.FALSE);
                break;
            default:
                ((sls) cmsVar).invoke();
                break;
        }
    }
}
