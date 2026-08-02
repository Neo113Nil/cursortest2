package defpackage;

/* loaded from: classes4.dex */
public final class j27 implements gfu {
    public final /* synthetic */ int a;
    public final g0c b;
    public final Object c;

    public j27(sdk sdkVar, g0c g0cVar) {
        this.a = 2;
        sdkVar.getClass();
        g0cVar.getClass();
        this.c = sdkVar;
        this.b = g0cVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        switch (this.a) {
            case 0:
                if (!cls.equals(upb.class)) {
                    xq0.q("Unknown view model");
                    break;
                } else {
                    break;
                }
            case 1:
                if (!cls.equals(fyf.class)) {
                    xq0.q("Unknown view model");
                    break;
                } else {
                    break;
                }
            default:
                if (!cls.equals(jqo.class)) {
                    xq0.q("Unknown view model");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    public /* synthetic */ j27(Object obj, g0c g0cVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = g0cVar;
    }
}
