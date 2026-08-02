package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n3n implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2i b;
    public final /* synthetic */ p7s c;
    public final /* synthetic */ l3n d;

    public /* synthetic */ n3n(x2i x2iVar, p7s p7sVar, l3n l3nVar, int i, int i2) {
        this.a = i2;
        this.b = x2iVar;
        this.c = p7sVar;
        this.d = l3nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                this.b.R(this.c, this.d, hq5Var, rvf.R(1));
                break;
            default:
                this.b.Q(this.c, this.d, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
