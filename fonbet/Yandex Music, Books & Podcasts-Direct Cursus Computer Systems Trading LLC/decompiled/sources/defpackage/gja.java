package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class gja implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ gja(Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci f;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    Function0 function0 = this.b;
                    if (function0 != null) {
                        oq5Var.Z(1223647302);
                        a0g.q(function0, null, oq5Var, 0);
                    } else {
                        oq5Var.Z(1222262222);
                    }
                    oq5Var.p(false);
                    Function0 function02 = this.c;
                    if (function02 != null) {
                        oq5Var.Z(1223792568);
                        a0g.o(48, 4, 0L, oq5Var, a.a(vci.a, "toolbar_search_button"), function02);
                    } else {
                        oq5Var.Z(1222262222);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Function0 function03 = this.b;
                    if (function03 != null) {
                        oq5Var2.Z(2013920381);
                        a0g.q(function03, null, oq5Var2, 0);
                    } else {
                        oq5Var2.Z(2012438302);
                    }
                    oq5Var2.p(false);
                    Function0 function04 = this.c;
                    if (function04 != null) {
                        oq5Var2.Z(2014027889);
                        a0g.o(48, 4, 0L, oq5Var2, a.a(vci.a, "button_search"), function04);
                    } else {
                        oq5Var2.Z(2012438302);
                    }
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                yci yciVar = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar.getClass();
                oq5 oq5Var3 = (oq5) ((hq5) obj2);
                oq5Var3.Z(-1082570893);
                aqi o0 = szf.o0(this.b, oq5Var3);
                aqi o02 = szf.o0(this.c, oq5Var3);
                Unit unit = Unit.a;
                boolean f2 = oq5Var3.f(o02) | oq5Var3.f(o0);
                Object K = oq5Var3.K();
                if (f2 || K == gq5.a) {
                    K = new rlg(o02, o0, (Continuation) null, 8);
                    oq5Var3.k0(K);
                }
                f = yciVar.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K), 6));
                oq5Var3.p(false);
                return f;
            default:
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Function0 function05 = this.b;
                    if (function05 != null) {
                        oq5Var4.Z(-1552069974);
                        a0g.q(function05, null, oq5Var4, 0);
                    } else {
                        oq5Var4.Z(-1553351886);
                    }
                    oq5Var4.p(false);
                    a0g.o(48, 4, 0L, oq5Var4, a.a(vci.a, "collection_non_music_toolbar_search_button"), this.c);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
        }
    }
}
