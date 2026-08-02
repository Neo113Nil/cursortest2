package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class wo1 {
    public final jyr a;
    public final jyr b;

    public wo1(final xo1 xo1Var) {
        final int i = 0;
        this.a = btf.b(new Function0() { // from class: vo1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new dp1(xo1Var.a);
                    default:
                        return new jp1((cc7) xo1Var.b.getValue());
                }
            }
        });
        final int i2 = 1;
        this.b = btf.b(new Function0() { // from class: vo1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new dp1(xo1Var.a);
                    default:
                        return new jp1((cc7) xo1Var.b.getValue());
                }
            }
        });
    }
}
