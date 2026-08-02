package defpackage;

/* loaded from: classes12.dex */
public final class uw20 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uw20(h55 h55Var, Object obj, int i) {
        this.a = i;
        this.b = h55Var;
        this.c = obj;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((ww20) h55Var).V((j2v) obj);
                break;
            default:
                ((y4c0) h55Var).r(new qu(9));
                ((gdl0) obj).d.execute();
                break;
        }
    }
}
