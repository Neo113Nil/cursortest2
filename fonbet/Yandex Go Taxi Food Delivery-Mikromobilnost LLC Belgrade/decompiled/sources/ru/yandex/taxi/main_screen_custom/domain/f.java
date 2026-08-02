package ru.yandex.taxi.main_screen_custom.domain;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import com.yandex.go.shortcuts.impl.interactors.ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$1;
import com.yandex.go.shortcuts.impl.interactors.m;
import com.yandex.go.shortcuts.impl.interactors.w;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.dqf0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.s9f0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uaf0;
import defpackage.uyj;
import defpackage.vaf0;
import defpackage.waf0;
import defpackage.yaf0;
import java.util.Arrays;
import java.util.Optional;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class f {
    public final tt2 a;
    public final dqf0 b;
    public final a c;
    public final m d;
    public final w e;
    public final com.yandex.go.promocodes.referral.impl.data.c f;
    public final cyx g;

    public f(tt2 tt2Var, dqf0 dqf0Var, a aVar, m mVar, w wVar, com.yandex.go.promocodes.referral.impl.data.c cVar, cyx cyxVar) {
        this.a = tt2Var;
        this.b = dqf0Var;
        this.c = aVar;
        this.d = mVar;
        this.e = wVar;
        this.f = cVar;
        this.g = cyxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, s9f0 s9f0Var, ContinuationImpl continuationImpl) {
        PromoUpdateInteractor$updatePromoInternal$1 promoUpdateInteractor$updatePromoInternal$1;
        int i;
        c430 c430Var;
        fVar.getClass();
        if (continuationImpl instanceof PromoUpdateInteractor$updatePromoInternal$1) {
            promoUpdateInteractor$updatePromoInternal$1 = (PromoUpdateInteractor$updatePromoInternal$1) continuationImpl;
            int i2 = promoUpdateInteractor$updatePromoInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoUpdateInteractor$updatePromoInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoUpdateInteractor$updatePromoInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoUpdateInteractor$updatePromoInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (s9f0Var.c() == null) {
                        return Optional.empty();
                    }
                    byx b = s9f0Var.b();
                    Screen screen = b != null ? b.a : null;
                    byx b2 = s9f0Var.b();
                    Mode mode = (b2 == null || (c430Var = b2.b) == null) ? null : c430Var.a;
                    yaf0 d = s9f0Var.d();
                    if (!(d instanceof uaf0) ? (d instanceof waf0) && jl40.l(((vaf0) ((waf0) d)).e, "scooters-discovery") && screen == Screen.DISCOVERY && mode == Mode.SCOOTERS : screen == Screen.MAIN) {
                        return Optional.empty();
                    }
                    a aVar = fVar.c;
                    ObjectOverMap c = s9f0Var.c();
                    String a = s9f0Var.a();
                    promoUpdateInteractor$updatePromoInternal$1.L$0 = null;
                    promoUpdateInteractor$updatePromoInternal$1.label = 1;
                    obj = aVar.a(c, a, promoUpdateInteractor$updatePromoInternal$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Optional.ofNullable(obj);
            }
        }
        promoUpdateInteractor$updatePromoInternal$1 = new PromoUpdateInteractor$updatePromoInternal$1(fVar, continuationImpl);
        Object obj2 = promoUpdateInteractor$updatePromoInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoUpdateInteractor$updatePromoInternal$1.label;
        if (i != 0) {
        }
        return Optional.ofNullable(obj2);
    }

    public final tpr b() {
        e eVar = new e(kotlinx.coroutines.flow.e.s(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(this.d.i.a, new ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$1())), this.e.d()}, 2)), new c(kotlinx.coroutines.flow.e.t(this.g.a())), this.f.d, new PromoUpdateInteractor$updatesPromo$1(this, null)), new PromoUpdateInteractor$updatesPromo$2(this)), this);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(eVar, uyj.a);
    }
}
