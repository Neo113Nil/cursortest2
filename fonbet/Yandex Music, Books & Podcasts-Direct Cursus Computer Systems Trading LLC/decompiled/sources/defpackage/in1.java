package defpackage;

import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class in1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;

    public /* synthetic */ in1(String str, Function0 function0, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = function0;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                on1.j(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            case 1:
                cb0.h(rvf.R(385), hq5Var, this.d, this.b, this.c);
                break;
            case 2:
                cb0.g(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
            default:
                t0.a(rvf.R(1), hq5Var, this.d, this.b, this.c);
                break;
        }
        return Unit.a;
    }
}
