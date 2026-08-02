package ru.yandex.taxi.superapp.shortcuts;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import com.yandex.go.shortcuts.dto.response.Screen;
import com.yandex.go.shortcuts.dto.response.d1;
import com.yandex.go.shortcuts.dto.response.q1;
import defpackage.d4s0;
import defpackage.e4s0;
import defpackage.f4s0;
import defpackage.g92;
import defpackage.ge6;
import defpackage.hzs;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mc6;
import defpackage.mvg;
import defpackage.nc6;
import defpackage.ny61;
import defpackage.q121;
import defpackage.tcc;
import defpackage.unr0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.waf0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.shortcuts.ScreensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1", f = "ScreensViewModelInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScreensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ e4s0 $fallbackViewModelFactory$inlined;
    final /* synthetic */ f4s0 $loadingViewModelFactory$inlined;
    final /* synthetic */ waf0 $screenType$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1(Continuation continuation, b bVar, e4s0 e4s0Var, f4s0 f4s0Var, waf0 waf0Var) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$fallbackViewModelFactory$inlined = e4s0Var;
        this.$loadingViewModelFactory$inlined = f4s0Var;
        this.$screenType$inlined = waf0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScreensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1 screensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1 = new ScreensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$fallbackViewModelFactory$inlined, this.$loadingViewModelFactory$inlined, this.$screenType$inlined);
        screensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        screensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return screensViewModelInteractor$getViewModelFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0191 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g92 g92Var;
        Object obj2;
        Object obj3;
        String str;
        ArrayList arrayList;
        nc6 nc6Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj4 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj5 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            hzs hzsVar = (hzs) obj4;
            if (jl40.l(hzsVar, hzs.h)) {
                b bVar = this.this$0;
                e4s0 e4s0Var = this.$fallbackViewModelFactory$inlined;
                bVar.getClass();
                jst.e.n("SC: Using shortcuts fallback");
                g92Var = new g92(2, e4s0Var.a());
            } else {
                boolean l = jl40.l(hzsVar, hzs.g);
                b bVar2 = this.this$0;
                if (l) {
                    f4s0 f4s0Var = this.$loadingViewModelFactory$inlined;
                    bVar2.getClass();
                    g92Var = new g92(2, f4s0Var.a());
                } else {
                    bVar2.getClass();
                    unr0.C(new Object[]{hzsVar.e}, 1, "SC: mapToModel mapToModelsResponse - models: %s", jst.e);
                    ProductsScreenResponse productsScreenResponse = hzsVar.b;
                    Layout layout = productsScreenResponse.e.a;
                    bVar2.e.getClass();
                    Screen screen = productsScreenResponse.e;
                    String str2 = screen.a.c;
                    List<d1> list = screen.d;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    for (d1 d1Var : list) {
                        if (d1Var instanceof ProductMode$Taxi.BottomScreenRoundButton) {
                            ProductMode$Taxi.BottomScreenRoundButton bottomScreenRoundButton = (ProductMode$Taxi.BottomScreenRoundButton) d1Var;
                            obj3 = obj5;
                            arrayList = arrayList2;
                            str = str2;
                            nc6Var = new ge6(bottomScreenRoundButton.e, bottomScreenRoundButton.d, bottomScreenRoundButton.a, bottomScreenRoundButton.b, str, bottomScreenRoundButton.c == ProductMode$Taxi.BottomItemAlign.LEFT ? 8388611 : 8388613);
                        } else {
                            obj3 = obj5;
                            str = str2;
                            arrayList = arrayList2;
                            if (d1Var instanceof ProductMode$Taxi.BottomScreenIconButton) {
                                ProductMode$Taxi.BottomScreenIconButton bottomScreenIconButton = (ProductMode$Taxi.BottomScreenIconButton) d1Var;
                                nc6Var = new mc6(bottomScreenIconButton.c == ProductMode$Taxi.BottomItemAlign.LEFT ? 8388611 : 8388613, bottomScreenIconButton.b, bottomScreenIconButton.e, bottomScreenIconButton.d, bottomScreenIconButton.a, str);
                                str = str;
                            } else {
                                if (!(d1Var instanceof q1)) {
                                    w511.b();
                                    return obj3;
                                }
                                nc6Var = q121.h;
                            }
                        }
                        arrayList.add(nc6Var);
                        arrayList2 = arrayList;
                        str2 = str;
                        obj5 = obj3;
                    }
                    Object obj6 = obj5;
                    d4s0 d4s0Var = new d4s0(layout, hzsVar.e, EmptyList.a, bVar2.d.b(productsScreenResponse), hzsVar.d, hzsVar.c, screen.f, null, arrayList2, false, 3712);
                    if (d4s0Var.d.isEmpty()) {
                        b bVar3 = this.this$0;
                        waf0 waf0Var = this.$screenType$inlined;
                        bVar3.getClass();
                        ProductsScreenType$Type a = waf0Var.a();
                        if (a == ProductsScreenType$Type.SCOOTERS_DISCOVERY || a == ProductsScreenType$Type.SCOOTERS_RIDE_FINISH_SCREEN || waf0Var.a() == ProductsScreenType$Type.CHARGERS_DISCOVERY) {
                            b bVar4 = this.this$0;
                            e4s0 e4s0Var2 = this.$fallbackViewModelFactory$inlined;
                            bVar4.getClass();
                            jst.e.n("SC: Using shortcuts fallback");
                            g92Var = new g92(2, e4s0Var2.a());
                            obj2 = obj6;
                            this.L$0 = obj2;
                            this.L$1 = obj2;
                            this.label = 1;
                            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    this.this$0.a.getClass();
                    g92Var = new g92(2, d4s0Var);
                    obj2 = obj6;
                    this.L$0 = obj2;
                    this.L$1 = obj2;
                    this.label = 1;
                    if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
                    }
                }
            }
            obj2 = null;
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.label = 1;
            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
