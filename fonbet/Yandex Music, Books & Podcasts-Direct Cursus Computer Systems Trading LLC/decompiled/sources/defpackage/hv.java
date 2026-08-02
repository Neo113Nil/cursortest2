package defpackage;

import androidx.compose.ui.platform.a;
import com.yandex.passport.internal.ui.challenge.webview.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ hv(int i, int i2, String str, Function0 function0) {
        this.a = i2;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    swf.l(this.c, a.a(vci.a, "show_more"), this.b, null, oq5Var, 48, 8);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                on1.j(0, hq5Var, null, this.b, this.c);
            case 2:
                num.getClass();
                pvo.a(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                num.getClass();
                j.a(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hv(String str, Function0 function0, int i) {
        this.a = i;
        this.b = str;
        this.c = function0;
    }
}
