package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import com.yandex.go.zone.dto.objects.TariffBranding;
import defpackage.fj6;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.wl4;
import defpackage.zy11;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ fj6 b;

    public a(vpr vprVar, fj6 fj6Var) {
        this.a = vprVar;
        this.b = fj6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BrandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1 brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1;
        int i;
        Object singletonList;
        if (continuation instanceof BrandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1) {
            brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = (BrandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1) continuation;
            int i2 = brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((mi31) obj).a;
                    fj6 fj6Var = this.b;
                    TariffBranding a = ru.yandex.taxi.tariffs.model.b.a(pex0Var, fj6Var.a);
                    if (a == null) {
                        singletonList = EmptyList.a;
                    } else {
                        TariffBranding.Card card = a.f;
                        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                        singletonList = Collections.singletonList(new wl4(null, bVar.c(card.a), bVar.c(card.b), 0, fj6Var.b.a(card.c), null, null, null, null, null, null, null, null, 131049));
                    }
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$0 = null;
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$1 = null;
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$2 = null;
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$3 = null;
                    brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = new BrandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = brandingBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
