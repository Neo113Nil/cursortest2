package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import com.yandex.go.zone.dto.objects.CouponCheckResult;
import defpackage.avj0;
import defpackage.d1h0;
import defpackage.evu0;
import defpackage.kyh0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.wl4;
import defpackage.x1f;
import defpackage.zy11;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ x1f b;

    public c(vpr vprVar, x1f x1fVar) {
        this.a = vprVar;
        this.b = x1fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CouponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1;
        int i;
        String str;
        String str2;
        Object obj2;
        if (continuation instanceof CouponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) {
            couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = (CouponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) continuation;
            int i2 = couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    x1f x1fVar = this.b;
                    x1fVar.getClass();
                    pex0 pex0Var = ((mi31) obj).a;
                    CouponCheckResult couponCheckResult = pex0Var.j0;
                    boolean z = pex0Var.u;
                    if (couponCheckResult == null || (str = couponCheckResult.c) == null || z || !couponCheckResult.a) {
                        str = null;
                    }
                    if (couponCheckResult == null || (str2 = couponCheckResult.e) == null || z) {
                        str2 = null;
                    }
                    if (str == null || evu0.J(str)) {
                        obj2 = EmptyList.a;
                    } else {
                        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                        if (str2 == null || evu0.J(str2)) {
                            str2 = ((avj0) x1fVar.a).i(kyh0.tariff_card_coupon_note, str);
                        }
                        obj2 = Collections.singletonList(new wl4(null, bVar.c(str2), null, d1h0.coupon_badge_icon, null, null, null, null, null, null, null, null, null, 131061));
                    }
                    couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$0 = null;
                    couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$1 = null;
                    couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$2 = null;
                    couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$3 = null;
                    couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = new CouponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = couponTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
