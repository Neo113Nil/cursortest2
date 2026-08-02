package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class gb1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;

    public /* synthetic */ gb1(String str, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c3x.a(rvf.R(385), hq5Var, this.d, this.b, this.c);
                break;
            case 1:
                jhe.b(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            case 2:
                o2g.q(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            default:
                qgg.t(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
        }
        return Unit.a;
    }
}
