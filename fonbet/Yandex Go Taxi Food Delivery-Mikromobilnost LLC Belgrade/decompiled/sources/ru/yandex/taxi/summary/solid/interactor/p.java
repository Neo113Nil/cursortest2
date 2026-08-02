package ru.yandex.taxi.summary.solid.interactor;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.taxi.summary.shared.promo.models.NotificationTrail$Switch$ClickPolicy;
import defpackage.ak60;
import defpackage.bdc;
import defpackage.bk60;
import defpackage.bze;
import defpackage.ck60;
import defpackage.ek60;
import defpackage.fk60;
import defpackage.gei0;
import defpackage.gk60;
import defpackage.gqs;
import defpackage.hk60;
import defpackage.ik60;
import defpackage.kb5;
import defpackage.kdc;
import defpackage.kqe0;
import defpackage.l051;
import defpackage.m051;
import defpackage.mnv0;
import defpackage.ny6;
import defpackage.ny61;
import defpackage.o051;
import defpackage.p051;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.r051;
import defpackage.r73;
import defpackage.s051;
import defpackage.t76;
import defpackage.tcc;
import defpackage.th40;
import defpackage.tls;
import defpackage.tpr;
import defpackage.u051;
import defpackage.ufu;
import defpackage.v051;
import defpackage.w511;
import defpackage.wk21;
import defpackage.xng0;
import defpackage.ykz0;
import defpackage.yp2;
import defpackage.z051;
import defpackage.zkv0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes6.dex */
public final class p {
    public final ru.yandex.taxi.widget.utils.e a;
    public final pdc b;
    public final mnv0 c;
    public final ykz0 d;
    public final ru.yandex.taxi.summary.promotions.repository.e e;
    public final wk21 f;
    public final pwy0 g;
    public final gei0 h;
    public final yp2 i;

    public p(ru.yandex.taxi.widget.utils.e eVar, pdc pdcVar, mnv0 mnv0Var, ykz0 ykz0Var, ru.yandex.taxi.summary.promotions.repository.e eVar2, wk21 wk21Var, pwy0 pwy0Var, gei0 gei0Var, yp2 yp2Var) {
        this.a = eVar;
        this.b = pdcVar;
        this.c = mnv0Var;
        this.d = ykz0Var;
        this.e = eVar2;
        this.f = wk21Var;
        this.g = pwy0Var;
        this.h = gei0Var;
        this.i = yp2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (r13 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        if (r13 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0154, code lost:
    
        if (r13 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0182, code lost:
    
        if (r13 == r1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p pVar, zkv0 zkv0Var, boolean z, ContinuationImpl continuationImpl) {
        PromotionInfoInteractor$mapNotificationTrail$1 promotionInfoInteractor$mapNotificationTrail$1;
        int i;
        NotificationTrail$Switch$ClickPolicy notificationTrail$Switch$ClickPolicy;
        pVar.getClass();
        if (continuationImpl instanceof PromotionInfoInteractor$mapNotificationTrail$1) {
            promotionInfoInteractor$mapNotificationTrail$1 = (PromotionInfoInteractor$mapNotificationTrail$1) continuationImpl;
            int i2 = promotionInfoInteractor$mapNotificationTrail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionInfoInteractor$mapNotificationTrail$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionInfoInteractor$mapNotificationTrail$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionInfoInteractor$mapNotificationTrail$1.label;
                int i3 = 3;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return (hk60) obj;
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return (hk60) obj;
                    }
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return (hk60) obj;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zkv0Var = (zkv0) promotionInfoInteractor$mapNotificationTrail$1.L$0;
                    kotlin.b.b(obj);
                    return new gk60((CharSequence) obj, zkv0Var.h, ((ru.yandex.taxi.cashback.l) pVar.f).b());
                }
                kotlin.b.b(obj);
                z051 z051Var = zkv0Var.f;
                if (z051Var instanceof u051) {
                    u051 u051Var = (u051) z051Var;
                    t76 t76Var = zkv0Var.i;
                    if (t76Var != null) {
                        notificationTrail$Switch$ClickPolicy = t76Var.b ? NotificationTrail$Switch$ClickPolicy.BODY_ONLY : NotificationTrail$Switch$ClickPolicy.INDEPENDENT;
                    } else {
                        if (t76Var != null) {
                            w511.b();
                            return null;
                        }
                        notificationTrail$Switch$ClickPolicy = NotificationTrail$Switch$ClickPolicy.SWITCH_ONLY;
                    }
                    return new fk60(z, notificationTrail$Switch$ClickPolicy, new th40(19, pVar, zkv0Var, u051Var));
                }
                if (z051Var instanceof l051) {
                    r73 r73Var = ((l051) z051Var).a;
                    promotionInfoInteractor$mapNotificationTrail$1.L$0 = null;
                    promotionInfoInteractor$mapNotificationTrail$1.L$1 = null;
                    promotionInfoInteractor$mapNotificationTrail$1.Z$0 = z;
                    promotionInfoInteractor$mapNotificationTrail$1.label = 1;
                    obj = pVar.b(r73Var, zkv0Var, promotionInfoInteractor$mapNotificationTrail$1);
                } else if (z051Var instanceof p051) {
                    r73 r73Var2 = ((p051) z051Var).a;
                    promotionInfoInteractor$mapNotificationTrail$1.L$0 = null;
                    promotionInfoInteractor$mapNotificationTrail$1.L$1 = null;
                    promotionInfoInteractor$mapNotificationTrail$1.Z$0 = z;
                    promotionInfoInteractor$mapNotificationTrail$1.label = 2;
                    obj = pVar.b(r73Var2, zkv0Var, promotionInfoInteractor$mapNotificationTrail$1);
                } else {
                    if (z051Var instanceof m051) {
                        List list = ((m051) z051Var).a;
                        yp2 yp2Var = pVar.i;
                        pdc pdcVar = pVar.b;
                        List<ActionButton> list2 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        for (ActionButton actionButton : list2) {
                            String str = actionButton.c;
                            String str2 = actionButton.d;
                            ufu ufuVar = (ufu) pdcVar;
                            kdc b = ufuVar.b(str);
                            if (b == null) {
                                b = new bdc(xng0.controlMinor);
                            }
                            String str3 = actionButton.b;
                            kdc i4 = ufuVar.i(str2);
                            if (i4 == null) {
                                i4 = new bdc(xng0.textOnControlMinor);
                            }
                            arrayList.add(new ik60(new ny6(b, str3, i4, new kqe0(i3, pVar, zkv0Var, actionButton)), yp2Var.a(str2, AppColor$Palette.TextOnControlMinor), yp2Var.a(actionButton.c, AppColor$Palette.ControlMinor)));
                        }
                        return new ak60(arrayList);
                    }
                    if (z051Var instanceof r051) {
                        r73 r73Var3 = ((r051) z051Var).a;
                        promotionInfoInteractor$mapNotificationTrail$1.L$0 = null;
                        promotionInfoInteractor$mapNotificationTrail$1.L$1 = null;
                        promotionInfoInteractor$mapNotificationTrail$1.Z$0 = z;
                        promotionInfoInteractor$mapNotificationTrail$1.label = 3;
                        obj = pVar.b(r73Var3, zkv0Var, promotionInfoInteractor$mapNotificationTrail$1);
                    } else {
                        if (z051Var instanceof o051) {
                            bze bzeVar = ((o051) z051Var).a;
                            return new bk60(bzeVar.c, bzeVar.b);
                        }
                        if (!(z051Var instanceof v051)) {
                            if (z051Var.equals(s051.a)) {
                                return ck60.a;
                            }
                            w511.b();
                            return null;
                        }
                        ru.yandex.taxi.widget.utils.e eVar = pVar.a;
                        FormattedText formattedText = ((v051) z051Var).a;
                        promotionInfoInteractor$mapNotificationTrail$1.L$0 = zkv0Var;
                        promotionInfoInteractor$mapNotificationTrail$1.L$1 = null;
                        promotionInfoInteractor$mapNotificationTrail$1.Z$0 = z;
                        promotionInfoInteractor$mapNotificationTrail$1.label = 4;
                        obj = eVar.t(formattedText, promotionInfoInteractor$mapNotificationTrail$1);
                    }
                }
                return obj2;
            }
        }
        promotionInfoInteractor$mapNotificationTrail$1 = new PromotionInfoInteractor$mapNotificationTrail$1(pVar, continuationImpl);
        Object obj3 = promotionInfoInteractor$mapNotificationTrail$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionInfoInteractor$mapNotificationTrail$1.label;
        int i32 = 3;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(r73 r73Var, zkv0 zkv0Var, ContinuationImpl continuationImpl) {
        PromotionInfoInteractor$mapArrowButton$1 promotionInfoInteractor$mapArrowButton$1;
        int i;
        kdc kdcVar;
        if (continuationImpl instanceof PromotionInfoInteractor$mapArrowButton$1) {
            promotionInfoInteractor$mapArrowButton$1 = (PromotionInfoInteractor$mapArrowButton$1) continuationImpl;
            int i2 = promotionInfoInteractor$mapArrowButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionInfoInteractor$mapArrowButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionInfoInteractor$mapArrowButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionInfoInteractor$mapArrowButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kdc g = ((ufu) this.b).g(r73Var.getA());
                    if (g == null) {
                        g = new bdc(xng0.textMain);
                    }
                    FormattedText formattedText = new FormattedText(r73Var.getB());
                    promotionInfoInteractor$mapArrowButton$1.L$0 = r73Var;
                    promotionInfoInteractor$mapArrowButton$1.L$1 = zkv0Var;
                    promotionInfoInteractor$mapArrowButton$1.L$2 = g;
                    promotionInfoInteractor$mapArrowButton$1.label = 1;
                    Object t = this.a.t(formattedText, promotionInfoInteractor$mapArrowButton$1);
                    if (t == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kdcVar = g;
                    obj = t;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kdc kdcVar2 = (kdc) promotionInfoInteractor$mapArrowButton$1.L$2;
                    zkv0Var = (zkv0) promotionInfoInteractor$mapArrowButton$1.L$1;
                    r73 r73Var2 = (r73) promotionInfoInteractor$mapArrowButton$1.L$0;
                    kotlin.b.b(obj);
                    kdcVar = kdcVar2;
                    r73Var = r73Var2;
                }
                return new ek60(kdcVar, (CharSequence) obj, zkv0Var.h, ((ru.yandex.taxi.cashback.l) this.f).b(), this.i.a(r73Var.getA(), AppColor$Palette.Text));
            }
        }
        promotionInfoInteractor$mapArrowButton$1 = new PromotionInfoInteractor$mapArrowButton$1(this, continuationImpl);
        Object obj2 = promotionInfoInteractor$mapArrowButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionInfoInteractor$mapArrowButton$1.label;
        if (i != 0) {
        }
        return new ek60(kdcVar, (CharSequence) obj2, zkv0Var.h, ((ru.yandex.taxi.cashback.l) this.f).b(), this.i.a(r73Var.getA(), AppColor$Palette.Text));
    }

    public final kotlinx.coroutines.flow.internal.g c(gqs gqsVar, tls tlsVar) {
        return kotlinx.coroutines.flow.e.X(new m0(gqsVar, this.g.a(), new PromotionInfoInteractor$notificationFlow$1(3, null)), new PromotionInfoInteractor$notificationFlow$$inlined$flatMapLatest$1(null, this, tlsVar));
    }

    public final k d(kb5 kb5Var, tpr tprVar) {
        return new k(kb5Var, kotlinx.coroutines.flow.e.t(new m0(kotlinx.coroutines.flow.e.t(new i(tprVar)), new kotlinx.coroutines.flow.n(this.e.d(), new PromotionInfoInteractor$promotionFlow$2(2, null)), new PromotionInfoInteractor$promotionFlow$3(this, kb5Var, null))));
    }

    public final o e(kb5 kb5Var, tpr tprVar) {
        return new o(kb5Var, kotlinx.coroutines.flow.e.t(new m0(kotlinx.coroutines.flow.e.t(new m(tprVar)), new kotlinx.coroutines.flow.n(this.e.d(), new PromotionInfoInteractor$tariffCardPromotionFlow$2(2, null)), new PromotionInfoInteractor$tariffCardPromotionFlow$3(this, kb5Var, null))));
    }
}
