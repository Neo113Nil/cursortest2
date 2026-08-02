package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class s2k extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ o3k s;
    public final /* synthetic */ mm6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2k(o3k o3kVar, mm6 mm6Var, int i) {
        super(0);
        this.r = i;
        this.s = o3kVar;
        this.t = mm6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.r) {
            case 0:
                o3k o3kVar = this.s;
                if (o3kVar.c()) {
                    x97.y(this.t, null, null, new t2k(0, o3kVar, null), 3);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                o3k o3kVar2 = this.s;
                if (o3kVar2.d()) {
                    x97.y(this.t, null, null, new t2k(1, o3kVar2, null), 3);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 2:
                o3k o3kVar3 = this.s;
                if (o3kVar3.c()) {
                    x97.y(this.t, null, null, new t2k(0, o3kVar3, null), 3);
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                o3k o3kVar4 = this.s;
                if (o3kVar4.d()) {
                    x97.y(this.t, null, null, new t2k(1, o3kVar4, null), 3);
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
        }
    }
}
