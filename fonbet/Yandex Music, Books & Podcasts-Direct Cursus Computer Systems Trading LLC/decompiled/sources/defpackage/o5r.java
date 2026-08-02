package defpackage;

import com.yandex.music.screen.landing.api.header.ui.view.SpecialHeaderBackgroundView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o5r implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ SpecialHeaderBackgroundView b;

    public /* synthetic */ o5r(SpecialHeaderBackgroundView specialHeaderBackgroundView) {
        this.b = specialHeaderBackgroundView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        SpecialHeaderBackgroundView specialHeaderBackgroundView = this.b;
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = SpecialHeaderBackgroundView.k;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    o5g.h(specialHeaderBackgroundView.getState(), ((Boolean) specialHeaderBackgroundView.j.getValue()).booleanValue(), oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                num.getClass();
                int i3 = SpecialHeaderBackgroundView.k;
                specialHeaderBackgroundView.j(rvf.R(1), hq5Var);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o5r(SpecialHeaderBackgroundView specialHeaderBackgroundView, int i) {
        this.b = specialHeaderBackgroundView;
    }
}
