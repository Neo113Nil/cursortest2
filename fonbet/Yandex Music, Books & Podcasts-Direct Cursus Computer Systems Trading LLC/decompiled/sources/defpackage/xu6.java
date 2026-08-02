package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class xu6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kv6 b;

    public /* synthetic */ xu6(kv6 kv6Var, int i) {
        this.a = i;
        this.b = kv6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        kv6 kv6Var = this.b;
        switch (i) {
            case 0:
                return new g7q(kv6Var, kv6Var.a);
            case 1:
                b7q b7qVar = kv6Var.h;
                f6q f6qVar = f6q.None;
                return new ncl(b7qVar, kv6Var.g1());
            case 2:
                kv6Var.w = null;
                kv6Var.x = null;
                return Unit.a;
            default:
                return kv6Var.l.h().a;
        }
    }
}
