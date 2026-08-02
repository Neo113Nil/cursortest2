package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class j93 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ j93(int i, Function0 function0, boolean z) {
        this.a = 3;
        this.b = z;
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
                    a0g.n(this.c, a.a(vci.a, "playback_button"), false, false, false, 0.0f, ild.C(1140597562, new xu0(2, this.b), oq5Var), oq5Var, 1572912, 60);
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
                oq5 oq5Var3 = (oq5) hq5Var;
                boolean z = this.b;
                boolean g = oq5Var3.g(z);
                Function0 function0 = this.c;
                boolean f = g | oq5Var3.f(function0);
                Object K = oq5Var3.K();
                if (f || K == gq5.a) {
                    K = new jcq(function0, z);
                    oq5Var3.k0(K);
                }
                ivf.o((jcq) K, function0, null, null, null, oq5Var3, 0, 28);
                break;
            case 2:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                oq5 oq5Var5 = (oq5) hq5Var;
                boolean z2 = this.b;
                boolean g2 = oq5Var5.g(z2);
                Function0 function02 = this.c;
                boolean f2 = g2 | oq5Var5.f(function02);
                Object K2 = oq5Var5.K();
                if (f2 || K2 == gq5.a) {
                    K2 = new vcq(function02, z2);
                    oq5Var5.k0(K2);
                }
                ivf.o((vcq) K2, function02, null, null, null, oq5Var5, 0, 28);
                break;
            default:
                num.getClass();
                gdg.a(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ j93(Function0 function0, boolean z) {
        this.a = 0;
        this.c = function0;
        this.b = z;
    }

    public /* synthetic */ j93(boolean z, Function0 function0, int i, byte b) {
        this.a = i;
        this.b = z;
        this.c = function0;
    }
}
