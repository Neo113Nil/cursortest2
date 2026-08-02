package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import defpackage.ilx0;
import defpackage.jlx0;
import defpackage.mi31;
import defpackage.mlx0;
import defpackage.nlx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wl4;
import defpackage.y7x0;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ilx0 b;

    public k(vpr vprVar, ilx0 ilx0Var) {
        this.a = vprVar;
        this.b = ilx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1 tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1;
        int i;
        Object singletonList;
        if (continuation instanceof TariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1) {
            tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = (TariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ilx0 ilx0Var = this.b;
                    nlx0 nlx0Var = ilx0Var.a;
                    List list = ((mi31) obj).a.S;
                    nlx0Var.getClass();
                    mlx0 a = nlx0.a(list);
                    if (a == null) {
                        singletonList = EmptyList.a;
                    } else {
                        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                        FormattedText c = bVar.c(a.a);
                        String str = a.b;
                        if (str == null) {
                            str = "";
                        }
                        wl4 wl4Var = new wl4(null, c, bVar.c(str), 0, null, null, null, null, null, null, null, null, new y7x0(5, ilx0Var, a), 65401);
                        jlx0 jlx0Var = ilx0Var.c;
                        String str2 = a.c;
                        HashSet hashSet = jlx0Var.c;
                        if (!hashSet.contains(str2)) {
                            jlx0Var.a.h(null, null, str2, null, null);
                            hashSet.add(str2);
                        }
                        singletonList = Collections.singletonList(wl4Var);
                    }
                    tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = new TariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffPromoBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
