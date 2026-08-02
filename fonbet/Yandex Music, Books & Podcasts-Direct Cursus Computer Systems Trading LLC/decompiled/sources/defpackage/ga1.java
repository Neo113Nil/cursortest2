package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ga1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha1 b;

    public /* synthetic */ ga1(ha1 ha1Var, int i) {
        this.a = i;
        this.b = ha1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new d85(this.b.a.a());
            case 1:
                ha1 ha1Var = this.b;
                return new d85(ha1Var.d.a(((Boolean) ha1Var.f.getValue()).booleanValue(), false));
            default:
                return new d85(((d85) this.b.h.b.getValue()).a);
        }
    }
}
