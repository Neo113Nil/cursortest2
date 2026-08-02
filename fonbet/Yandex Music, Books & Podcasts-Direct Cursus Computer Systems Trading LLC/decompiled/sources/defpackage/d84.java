package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class d84 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h84 b;

    public /* synthetic */ d84(h84 h84Var, int i) {
        this.a = i;
        this.b = h84Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m64 m64Var = this.b.e;
                return Long.valueOf(m64Var.e == null ? 0L : m64Var.h);
            default:
                return Long.valueOf(this.b.A());
        }
    }
}
