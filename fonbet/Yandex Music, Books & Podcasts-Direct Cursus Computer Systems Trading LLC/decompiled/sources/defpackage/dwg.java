package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class dwg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ jzb c;

    public /* synthetic */ dwg(String str, jzb jzbVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = jzbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a0g.h(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                y7g.k(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
