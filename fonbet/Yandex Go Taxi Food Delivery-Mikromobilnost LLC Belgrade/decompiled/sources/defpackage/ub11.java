package defpackage;

import kotlin.collections.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class ub11 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6u b;
    public final /* synthetic */ sb11 c;

    public /* synthetic */ ub11(n6u n6uVar, sb11 sb11Var, int i) {
        this.a = i;
        this.b = n6uVar;
        this.c = sb11Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sb11 sb11Var = this.c;
        n6u n6uVar = this.b;
        switch (i) {
            case 0:
                n6uVar.c.b(sb11Var.b, n6uVar.b, b.f());
                break;
            default:
                n6uVar.c.b(sb11Var.c, n6uVar.b, b.f());
                break;
        }
        return zy11Var;
    }
}
