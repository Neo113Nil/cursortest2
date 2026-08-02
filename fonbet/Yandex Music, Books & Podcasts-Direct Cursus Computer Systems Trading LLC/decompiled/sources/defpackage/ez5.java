package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ez5 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wv5 b;
    public final /* synthetic */ tz5 c;
    public final /* synthetic */ yci d;

    public /* synthetic */ ez5(wv5 wv5Var, tz5 tz5Var, yci yciVar) {
        this.b = wv5Var;
        this.c = tz5Var;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                xv.j(this.b, this.c, a.o(d.d(this.d, 1.0f), 16, 0.0f, 2), hq5Var, 8);
            default:
                num.getClass();
                xv.j(this.b, this.c, this.d, hq5Var, rvf.R(9));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ez5(wv5 wv5Var, tz5 tz5Var, yci yciVar, int i) {
        this.b = wv5Var;
        this.c = tz5Var;
        this.d = yciVar;
    }
}
