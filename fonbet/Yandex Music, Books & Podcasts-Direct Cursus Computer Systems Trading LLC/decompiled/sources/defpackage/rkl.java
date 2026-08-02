package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class rkl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ na0 b;

    public /* synthetic */ rkl(na0 na0Var, int i) {
        this.a = i;
        this.b = na0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(zc4.D(this.b.e) > 0.0f);
            case 1:
                return Float.valueOf(zc4.D(this.b.e));
            case 2:
                return (lf3) this.b.e.h.getValue();
            case 3:
                return Boolean.valueOf(zc4.D(this.b.e) > 0.0f);
            default:
                return (lf3) this.b.e.h.getValue();
        }
    }
}
