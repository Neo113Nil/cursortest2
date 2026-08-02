package defpackage;

import kotlin.collections.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class s511 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6u b;
    public final /* synthetic */ q511 c;

    public /* synthetic */ s511(n6u n6uVar, q511 q511Var, int i) {
        this.a = i;
        this.b = n6uVar;
        this.c = q511Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        q511 q511Var = this.c;
        n6u n6uVar = this.b;
        switch (i) {
            case 0:
                n6uVar.c.b(q511Var.b, n6uVar.b, b.f());
                break;
            default:
                n6uVar.c.b(q511Var.c, n6uVar.b, b.f());
                break;
        }
        return zy11Var;
    }
}
