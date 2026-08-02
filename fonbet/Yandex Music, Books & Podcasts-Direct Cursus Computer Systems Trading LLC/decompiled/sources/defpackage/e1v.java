package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e1v implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia0 b;

    public /* synthetic */ e1v(ia0 ia0Var, int i) {
        this.a = i;
        this.b = ia0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ia0 ia0Var = this.b;
                return new m8v((tf6) ia0Var.a, (frt) ia0Var.c);
            case 1:
                return (vdr) ((m8v) ((jyr) this.b.m).getValue()).k.getValue();
            case 2:
                return (frt) ((z2m) this.b.k).a.getValue();
            case 3:
                return (cc7) this.b.d;
            case 4:
                return (vdr) ((z2m) this.b.k).b.getValue();
            default:
                return (g0l) ((z2m) this.b.k).c.getValue();
        }
    }
}
