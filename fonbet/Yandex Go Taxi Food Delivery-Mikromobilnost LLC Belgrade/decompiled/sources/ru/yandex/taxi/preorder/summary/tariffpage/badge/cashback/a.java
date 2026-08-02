package ru.yandex.taxi.preorder.summary.tariffpage.badge.cashback;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.bdc;
import defpackage.d1;
import defpackage.evu0;
import defpackage.fbx0;
import defpackage.h29;
import defpackage.hbx0;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.m7x0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.ufu;
import defpackage.vpr;
import defpackage.wl4;
import defpackage.xng0;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h29 b;

    public a(vpr vprVar, h29 h29Var) {
        this.a = vprVar;
        this.b = h29Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        List singletonList;
        Object obj3;
        String str;
        if (continuation instanceof CashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) {
            cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = (CashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) continuation;
            int i2 = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    h29 h29Var = this.b;
                    k7x0 k7x0Var = h29Var.d;
                    pex0 pex0Var = ((mi31) obj).a;
                    Iterator it = pex0Var.S.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((ServiceLevel.Branding) obj2).c == ServiceLevel.Branding.Type.CASH_BACK) {
                            break;
                        }
                    }
                    ServiceLevel.Branding branding = (ServiceLevel.Branding) obj2;
                    if (branding == null) {
                        singletonList = null;
                    } else {
                        String str2 = branding.b == ServiceLevel.Branding.Action.SHOW_BANNER ? branding.j.c : null;
                        String str3 = branding.k;
                        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                        String str4 = branding.e;
                        if (str4 == null) {
                            str4 = "";
                        }
                        FormattedText c = bVar.c(str4);
                        String str5 = branding.f;
                        if (str5 == null) {
                            str5 = "";
                        }
                        FormattedText c2 = bVar.c(str5);
                        String a = (str3 == null || evu0.J(str3)) ? null : ((m7x0) k7x0Var).a(str3);
                        String str6 = branding.i;
                        singletonList = Collections.singletonList(new wl4(null, c, c2, 0, null, null, null, new hbx0(a, str6, h29Var.b(str6)), null, null, null, null, new d1(15, h29Var, pex0Var, str2), 65273));
                    }
                    if (singletonList == null) {
                        Iterator it2 = pex0Var.S.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (((ServiceLevel.Branding) obj3).c == ServiceLevel.Branding.Type.BADGE) {
                                break;
                            }
                        }
                        ServiceLevel.Branding branding2 = (ServiceLevel.Branding) obj3;
                        if (branding2 == null || (str = branding2.e) == null || evu0.J(str)) {
                            singletonList = null;
                        } else {
                            String str7 = branding2.k;
                            kdc h = ((ufu) h29Var.e).h(new bdc(xng0.textMain), branding2.q);
                            ru.yandex.taxi.common_models.net.b bVar2 = FormattedText.Companion;
                            FormattedText c3 = bVar2.c(str);
                            String str8 = branding2.f;
                            FormattedText c4 = bVar2.c(str8 != null ? str8 : "");
                            String a2 = (str7 == null || evu0.J(str7)) ? null : ((m7x0) k7x0Var).a(str7);
                            String str9 = branding2.i;
                            singletonList = Collections.singletonList(new wl4(null, c3, c4, 0, null, null, null, new fbx0(h, a2, str9, h29Var.b(str9)), null, null, null, null, new d1(14, h29Var, pex0Var, branding2), 65273));
                        }
                        if (singletonList == null) {
                            singletonList = EmptyList.a;
                        }
                    }
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$0 = null;
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$1 = null;
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$2 = null;
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$3 = null;
                    cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj4);
                }
                return zy11.a;
            }
        }
        cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = new CashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj42 = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackBrandingTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
