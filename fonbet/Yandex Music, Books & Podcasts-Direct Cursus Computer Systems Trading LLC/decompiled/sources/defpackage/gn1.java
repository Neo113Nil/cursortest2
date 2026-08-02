package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class gn1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yci b;
    public final /* synthetic */ long c;

    public /* synthetic */ gn1(long j, yci yciVar, int i) {
        this.c = j;
        this.b = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                on1.k(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                xee.i(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gn1(yci yciVar, long j, int i) {
        this.b = yciVar;
        this.c = j;
    }
}
