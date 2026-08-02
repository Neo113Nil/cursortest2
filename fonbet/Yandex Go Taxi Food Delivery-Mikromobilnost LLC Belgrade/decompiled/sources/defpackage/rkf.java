package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rkf extends gjh {
    public final int B;
    public final qyl C;
    public final chr D;
    public final chr E;
    public final s1r F;

    public rkf(int i, qyl qylVar, oyl oylVar, cjh cjhVar, qgh qghVar, vkr vkrVar, chr chrVar, chr chrVar2, s1r s1rVar) {
        super((FragmentManager) chrVar.invoke(), i, qylVar, oylVar, cjhVar, qghVar, vkrVar);
        this.B = i;
        this.C = qylVar;
        this.D = chrVar;
        this.E = chrVar2;
        this.F = s1rVar;
    }

    @Override // defpackage.gjh, defpackage.o3l0, defpackage.nh5
    public final boolean backward(boolean z, Map map) {
        this.E.invoke();
        return true;
    }

    @Override // defpackage.gjh, defpackage.o3l0
    public final boolean forward(u1m u1mVar, ywl ywlVar, boolean z, Map map) {
        Object obj = map.get(FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE);
        Boolean bool = Boolean.TRUE;
        boolean l = jl40.l(obj, bool);
        boolean l2 = jl40.l(map.get(FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_CLEAR_STACK), bool);
        boolean z2 = (l || l2) ? false : true;
        s1r s1rVar = this.F;
        if (l2) {
            s1rVar.invoke(bool);
        } else if (l) {
            s1rVar.invoke(Boolean.FALSE);
        }
        FragmentManager fragmentManager = (FragmentManager) this.D.invoke();
        Fragment a = this.C.a(u1mVar, ywlVar, map);
        if (l2) {
            int K = fragmentManager.K();
            for (int i = 0; i < K; i++) {
                fragmentManager.V();
            }
        }
        a aVar = new a(fragmentManager);
        if (z) {
            aVar.i(qmg0.slide_in_left, qmg0.slide_out_to_left, qmg0.slide_in_right, qmg0.slide_out_to_right);
        }
        if (z2) {
            aVar.c(null);
        }
        aVar.h(this.B, a, null);
        aVar.l(true, true);
        fragmentManager.C();
        return true;
    }
}
