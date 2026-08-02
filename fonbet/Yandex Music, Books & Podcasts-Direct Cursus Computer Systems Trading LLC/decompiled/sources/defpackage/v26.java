package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class v26 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y26 b;
    public final /* synthetic */ d36 c;

    public /* synthetic */ v26(y26 y26Var, d36 d36Var, int i) {
        this.a = i;
        this.b = y26Var;
        this.c = d36Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.a(this.c.a);
                return Boolean.TRUE;
            default:
                this.b.a(this.c.a);
                return Unit.a;
        }
    }
}
