package defpackage;

import com.yandex.go.zone.dto.objects.VerticalMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.preorder.summary.solid.l;

/* loaded from: classes6.dex */
public final /* synthetic */ class t6t0 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ t6t0(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                VerticalMode verticalMode = (VerticalMode) obj;
                ((m6t0) lVar.Dg()).Qa(verticalMode);
                VerticalMode verticalMode2 = VerticalMode.SELECTOR;
                hk31 hk31Var = lVar.b0;
                if (verticalMode != verticalMode2) {
                    hk31Var.a();
                    break;
                } else {
                    hk31Var.b();
                    break;
                }
            default:
                lVar.getClass();
                mi31 mi31Var = ((ik31) obj).b;
                lVar.M.a(mi31Var);
                lVar.R.a(mi31Var);
                qvz0 a = ((u49) lVar.T).a(mi31Var.a.S);
                if (a.a) {
                    ((m6t0) lVar.Dg()).t1(a.b);
                }
                lVar.t0.b(mi31Var.f);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, l.class, "onVerticalModeChange", "onVerticalModeChange(Lcom/yandex/go/zone/dto/objects/VerticalMode;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, l.class, "onTariffUpdated", "onTariffUpdated(Lru/yandex/taxi/tariffs/model/verticals/VerticalsSnapshot;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
