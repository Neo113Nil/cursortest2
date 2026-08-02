package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b7r implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7r b;

    public /* synthetic */ b7r(e7r e7rVar, int i) {
        this.a = i;
        this.b = e7rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (d8r) this.b.c.invoke();
            default:
                e7r e7rVar = this.b;
                hn5 hn5Var = e7rVar.a;
                ct8 G = e7rVar.a().G();
                G.b = new nq2(new zs8(2, e7rVar));
                return new gc8(new vb8(hn5Var, G.a(), hn5Var), null, 0, 6, null);
        }
    }
}
