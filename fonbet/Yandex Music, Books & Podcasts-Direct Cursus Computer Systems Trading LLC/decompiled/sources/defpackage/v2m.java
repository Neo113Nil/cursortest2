package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class v2m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cvl b;
    public final /* synthetic */ w2m c;

    public /* synthetic */ v2m(cvl cvlVar, w2m w2mVar, int i) {
        this.a = i;
        this.b = cvlVar;
        this.c = w2mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        is6 is6Var = (is6) obj;
        switch (this.a) {
            case 0:
                is6Var.getClass();
                return new lr6(this.b, (bnd) this.c.b.b);
            default:
                is6Var.getClass();
                return new m3m(this.b, this.c.a);
        }
    }
}
