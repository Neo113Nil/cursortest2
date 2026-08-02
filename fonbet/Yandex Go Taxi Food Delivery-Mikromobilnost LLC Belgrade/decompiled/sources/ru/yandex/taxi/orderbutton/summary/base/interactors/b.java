package ru.yandex.taxi.orderbutton.summary.base.interactors;

import defpackage.bj70;
import defpackage.glv0;
import defpackage.ilv0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vi70;
import defpackage.wi70;
import defpackage.xi70;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class b implements xi70 {
    public final ru.yandex.taxi.summary.promotions.repository.e a;

    public b(ru.yandex.taxi.summary.promotions.repository.e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xi70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vi70 vi70Var, Continuation continuation) {
        PromotionsButtonModelInteractor$buttonModel$1 promotionsButtonModelInteractor$buttonModel$1;
        int i;
        glv0 glv0Var;
        String str;
        if (continuation instanceof PromotionsButtonModelInteractor$buttonModel$1) {
            promotionsButtonModelInteractor$buttonModel$1 = (PromotionsButtonModelInteractor$buttonModel$1) continuation;
            int i2 = promotionsButtonModelInteractor$buttonModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsButtonModelInteractor$buttonModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsButtonModelInteractor$buttonModel$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsButtonModelInteractor$buttonModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mi31 mi31Var = vi70Var.a;
                    String str2 = mi31Var.f;
                    String str3 = mi31Var.g;
                    promotionsButtonModelInteractor$buttonModel$1.L$0 = vi70Var;
                    promotionsButtonModelInteractor$buttonModel$1.label = 1;
                    obj = c(str2, str3, promotionsButtonModelInteractor$buttonModel$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vi70Var = (vi70) promotionsButtonModelInteractor$buttonModel$1.L$0;
                    kotlin.b.b(obj);
                }
                glv0Var = (glv0) obj;
                if (glv0Var != null) {
                    return null;
                }
                String str4 = glv0Var.a;
                String str5 = glv0Var.b;
                String str6 = str5 == null ? "" : str5;
                if (str5 == null || str5.length() == 0) {
                    str = str4;
                } else {
                    str = ((Object) str4) + Extension.FIX_SPACE + ((Object) str5);
                }
                bj70 bj70Var = vi70Var.b;
                boolean z = vi70Var.a.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
                if (str == null) {
                    if (str6.length() == 0) {
                        str = str4;
                    } else {
                        str = ((Object) str4) + Extension.FIX_SPACE + ((Object) str6);
                    }
                }
                return new wi70(str4, str6, str, bj70Var, true, false, z);
            }
        }
        promotionsButtonModelInteractor$buttonModel$1 = new PromotionsButtonModelInteractor$buttonModel$1(this, (ContinuationImpl) continuation);
        Object obj3 = promotionsButtonModelInteractor$buttonModel$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsButtonModelInteractor$buttonModel$1.label;
        if (i != 0) {
        }
        glv0Var = (glv0) obj3;
        if (glv0Var != null) {
        }
    }

    @Override // defpackage.xi70
    public final String b() {
        return "PromotionsButtonModelInteractor";
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        PromotionsButtonModelInteractor$promotionOrderButton$1 promotionsButtonModelInteractor$promotionOrderButton$1;
        int i;
        Iterator it;
        glv0 glv0Var;
        if (continuationImpl instanceof PromotionsButtonModelInteractor$promotionOrderButton$1) {
            promotionsButtonModelInteractor$promotionOrderButton$1 = (PromotionsButtonModelInteractor$promotionOrderButton$1) continuationImpl;
            int i2 = promotionsButtonModelInteractor$promotionOrderButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsButtonModelInteractor$promotionOrderButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsButtonModelInteractor$promotionOrderButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsButtonModelInteractor$promotionOrderButton$1.label;
                ru.yandex.taxi.summary.promotions.repository.e eVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List singletonList = Collections.singletonList(SummaryPromotionsResponse.DisplayOnType.ORDER_BUTTON);
                    promotionsButtonModelInteractor$promotionOrderButton$1.L$0 = str;
                    promotionsButtonModelInteractor$promotionOrderButton$1.L$1 = str2;
                    promotionsButtonModelInteractor$promotionOrderButton$1.label = 1;
                    obj = eVar.i(str, str2, singletonList, promotionsButtonModelInteractor$promotionOrderButton$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Iterator it2 = ((Iterable) obj).iterator();
                        while (it2.hasNext()) {
                            glv0 a = ((ilv0) it2.next()).a();
                            if (a != null) {
                                return a;
                            }
                        }
                        return null;
                    }
                    str2 = (String) promotionsButtonModelInteractor$promotionOrderButton$1.L$1;
                    str = (String) promotionsButtonModelInteractor$promotionOrderButton$1.L$0;
                    kotlin.b.b(obj);
                }
                it = ((Iterable) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        glv0Var = null;
                        break;
                    }
                    glv0Var = ((ilv0) it.next()).a();
                    if (glv0Var != null) {
                        break;
                    }
                }
                if (glv0Var == null || str2 == null) {
                    return glv0Var;
                }
                List singletonList2 = Collections.singletonList(SummaryPromotionsResponse.DisplayOnType.PROMOBLOCK);
                promotionsButtonModelInteractor$promotionOrderButton$1.L$0 = null;
                promotionsButtonModelInteractor$promotionOrderButton$1.L$1 = null;
                promotionsButtonModelInteractor$promotionOrderButton$1.L$2 = null;
                promotionsButtonModelInteractor$promotionOrderButton$1.label = 2;
                obj = eVar.i(str, str2, singletonList2, promotionsButtonModelInteractor$promotionOrderButton$1);
            }
        }
        promotionsButtonModelInteractor$promotionOrderButton$1 = new PromotionsButtonModelInteractor$promotionOrderButton$1(this, continuationImpl);
        Object obj2 = promotionsButtonModelInteractor$promotionOrderButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsButtonModelInteractor$promotionOrderButton$1.label;
        ru.yandex.taxi.summary.promotions.repository.e eVar2 = this.a;
        if (i != 0) {
        }
        it = ((Iterable) obj2).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (glv0Var == null) {
        }
        return glv0Var;
    }
}
