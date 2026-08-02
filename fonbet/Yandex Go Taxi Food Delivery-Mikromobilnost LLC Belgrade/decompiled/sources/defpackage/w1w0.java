package defpackage;

import com.yandex.go.flex.main_screen.data.sticky.SectionUpdaterRepository;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.e;
import com.yandex.go.preload.g;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class w1w0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ w1w0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                int intValue = (int) (((Number) obj).intValue() * 1.5f);
                eVar.A.a(intValue, intValue);
                break;
            case 1:
                ocw0 ocw0Var = ((pcw0) obj).a;
                if (!jl40.l(ocw0Var, ncw0.a)) {
                    if (!jl40.l(ocw0Var, mcw0.a)) {
                        if (!(ocw0Var instanceof lcw0)) {
                            w511.b();
                            break;
                        } else {
                            pzt0 pzt0Var = eVar.p0;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            eVar.p0 = tje.N(eVar.Jg(), null, null, new SuperAppMainScreenPresenter$observeConnectivityRestored$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.T(eVar.S.c(), 1), null, eVar), 3);
                            r0 r0Var = ((g) eVar.b0).a.a;
                            Boolean bool = Boolean.TRUE;
                            r0Var.getClass();
                            r0Var.m(null, bool);
                            break;
                        }
                    } else {
                        pzt0 pzt0Var2 = eVar.p0;
                        if (pzt0Var2 != null) {
                            pzt0Var2.a(null);
                        }
                        r0 r0Var2 = ((g) eVar.b0).a.a;
                        Boolean bool2 = Boolean.TRUE;
                        r0Var2.getClass();
                        r0Var2.m(null, bool2);
                        break;
                    }
                }
                break;
            case 2:
                ((SectionUpdaterRepository) eVar.E).a(w4q0.d);
                break;
            default:
                ((k2w0) eVar.Dg()).scrollUp();
                break;
        }
        return zy11Var;
    }
}
