package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;

    public /* synthetic */ tm(Function0 function0, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = function0;
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
                ff7.a(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            case 1:
                c3x.d(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            case 2:
                xp3.h(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            case 3:
                bcx.m(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            case 4:
                v3g.g(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            case 5:
                v7g.e(rvf.R(385), hq5Var, this.d, this.b, this.c);
                break;
            default:
                u7g.w(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ tm(boolean z, Function0 function0, yci yciVar, int i, int i2) {
        this.a = i2;
        this.c = z;
        this.b = function0;
        this.d = yciVar;
    }
}
