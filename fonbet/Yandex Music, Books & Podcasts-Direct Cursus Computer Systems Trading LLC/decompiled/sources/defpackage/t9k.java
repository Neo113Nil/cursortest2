package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t9k implements nin, tgm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t9k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tgm
    public final Object b(String str, Function1 function1, cg6 cg6Var) {
        switch (this.a) {
            case 0:
                return ((w9k) this.b).b(str, function1, cg6Var);
            default:
                return ((ahm) this.b).b(str, function1, cg6Var);
        }
    }

    @Override // defpackage.nin
    public final xjo d() {
        switch (this.a) {
            case 0:
                return ((w9k) this.b).b;
            default:
                return ((ahm) this.b).b;
        }
    }
}
