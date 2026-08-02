package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class p23 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ t23 s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p23(t23 t23Var, String str, int i) {
        super(0);
        this.r = i;
        this.s = t23Var;
        this.t = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                t28 t28Var = this.s.g;
                return yd5.I("check_binding_payment", t28Var.b, new s28(t28Var, new vi4(this.t), 0));
            case 1:
                t28 t28Var2 = this.s.g;
                return yd5.I("check_binding_payment", t28Var2.b, new s28(t28Var2, new vi4(this.t), 0));
            default:
                l9i l9iVar = this.s.f;
                return l9iVar.a.C(new j13(this.t, 4, false), vsf.v0, p1j.b);
        }
    }
}
