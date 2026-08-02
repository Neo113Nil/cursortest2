package defpackage;

/* loaded from: classes13.dex */
public final class wul0 implements sy60 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wul0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ivl0) obj).invoke(Boolean.FALSE);
                break;
            case 1:
                ((sls) obj).invoke();
                break;
            default:
                ((gzm0) obj).r(new qu(9));
                break;
        }
    }

    public final void n1() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ivl0) obj).invoke(Boolean.TRUE);
                break;
            case 1:
                ((sls) obj).invoke();
                break;
            default:
                ((gzm0) obj).r(new of11(3));
                break;
        }
    }
}
