package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class h76 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g76 b;
    public final /* synthetic */ tmb c;
    public final /* synthetic */ k76 d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ h76(g76 g76Var, tmb tmbVar, k76 k76Var, Function2 function2, int i) {
        this.a = i;
        this.b = g76Var;
        this.c = tmbVar;
        this.d = k76Var;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new g01(this.b, this.c, this.d, this.e);
            default:
                return new i76(this.b, this.c, this.d, this.e);
        }
    }
}
