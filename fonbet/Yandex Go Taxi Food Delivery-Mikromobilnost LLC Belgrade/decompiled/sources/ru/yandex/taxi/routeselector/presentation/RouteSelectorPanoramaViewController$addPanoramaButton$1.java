package ru.yandex.taxi.routeselector.presentation;

import android.widget.FrameLayout;
import defpackage.a9y0;
import defpackage.d6z;
import defpackage.d82;
import defpackage.e8y0;
import defpackage.eg3;
import defpackage.fal0;
import defpackage.gal0;
import defpackage.hal0;
import defpackage.i8y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.qr31;
import defpackage.tb90;
import defpackage.tls;
import defpackage.tse;
import defpackage.u9l0;
import defpackage.ub90;
import defpackage.w511;
import defpackage.wls;
import defpackage.x9l0;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPanoramaViewController$addPanoramaButton$1", f = "RouteSelectorPanoramaViewController.kt", l = {70, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorPanoramaViewController$addPanoramaButton$1 extends SuspendLambda implements wls {
    final /* synthetic */ FloatButtonHolderLayout $attachFloatButtonLayoutHolder;
    final /* synthetic */ tls $movePinToGeoPointCallback;
    final /* synthetic */ x9l0 $params;
    final /* synthetic */ hal0 $state;
    final /* synthetic */ FrameLayout $tooltipContainer;
    Object L$0;
    int label;
    final /* synthetic */ u9l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPanoramaViewController$addPanoramaButton$1(u9l0 u9l0Var, FloatButtonHolderLayout floatButtonHolderLayout, hal0 hal0Var, x9l0 x9l0Var, FrameLayout frameLayout, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u9l0Var;
        this.$attachFloatButtonLayoutHolder = floatButtonHolderLayout;
        this.$state = hal0Var;
        this.$params = x9l0Var;
        this.$tooltipContainer = frameLayout;
        this.$movePinToGeoPointCallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteSelectorPanoramaViewController$addPanoramaButton$1(this.this$0, this.$attachFloatButtonLayoutHolder, this.$state, this.$params, this.$tooltipContainer, this.$movePinToGeoPointCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteSelectorPanoramaViewController$addPanoramaButton$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0031, code lost:
    
        if (r0 == r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        tb90 tb90Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            e8y0 e8y0Var = this.this$0.f;
            this.label = 1;
            b = e8y0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        ru.yandex.taxi.panorama.d dVar = (ru.yandex.taxi.panorama.d) b;
        u9l0 u9l0Var = this.this$0;
        FloatButtonHolderLayout floatButtonHolderLayout = this.$attachFloatButtonLayoutHolder;
        hal0 hal0Var = this.$state;
        x9l0 x9l0Var = this.$params;
        FrameLayout frameLayout = this.$tooltipContainer;
        tls tlsVar = this.$movePinToGeoPointCallback;
        this.L$0 = null;
        this.label = 2;
        u9l0Var.getClass();
        if (hal0Var instanceof fal0) {
            ub90 ub90Var = ((fal0) hal0Var).f;
            if (ub90Var instanceof tb90) {
                tb90Var = (tb90) ub90Var;
            }
        } else {
            if (!(hal0Var instanceof gal0)) {
                w511.b();
                return null;
            }
            ub90 ub90Var2 = ((gal0) hal0Var).a.q;
            if (ub90Var2 instanceof tb90) {
                tb90Var = (tb90) ub90Var2;
            }
        }
        if (tb90Var == null || !dVar.b) {
            tb90 tb90Var2 = tb90Var;
            i8y0 i8y0Var = u9l0Var.b;
            boolean z = dVar.b;
            Objects.toString(tb90Var2);
            i8y0Var.getClass();
            RotatableFloatButton rotatableFloatButton = u9l0Var.m;
            if (rotatableFloatButton != null) {
                rotatableFloatButton.setVisibilityAnimated(false);
            }
            qr31 qr31Var = u9l0Var.j;
            if (qr31Var != null) {
                qr31Var.a();
            }
        } else {
            String str = x9l0Var.b() ? "a" : "b";
            String concat = "clarify_point_".concat(str);
            if (dVar.e.contains(concat)) {
                if (u9l0Var.m == null) {
                    u9l0Var.m = eg3.e(floatButtonHolderLayout, new d82(1), d6z.Y(dVar, dVar.d));
                    u9l0Var.j = new qr31(frameLayout, u9l0Var.i);
                }
                ru.yandex.taxi.panorama.l lVar = u9l0Var.d;
                tb90 tb90Var3 = tb90Var;
                RotatableFloatButton rotatableFloatButton2 = u9l0Var.m;
                String str2 = dVar.j;
                a9y0 a9y0Var = (a9y0) u9l0Var.c.get();
                oep0 oep0Var = u9l0Var.h;
                if (tlsVar == null) {
                    tlsVar = u9l0Var.g.a;
                }
                obj2 = lVar.c(rotatableFloatButton2, str, tb90Var3, concat, dVar, str2, a9y0Var, oep0Var, tlsVar, this);
                return obj2 != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        obj2 = zy11Var;
        if (obj2 != coroutineSingletons) {
        }
    }
}
