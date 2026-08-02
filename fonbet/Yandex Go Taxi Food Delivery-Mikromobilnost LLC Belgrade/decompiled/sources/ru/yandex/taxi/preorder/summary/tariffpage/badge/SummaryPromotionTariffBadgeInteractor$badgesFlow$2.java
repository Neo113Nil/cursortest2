package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import android.graphics.Rect;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.evu0;
import defpackage.g00;
import defpackage.gbx0;
import defpackage.ibx0;
import defpackage.kdc;
import defpackage.l051;
import defpackage.lxo0;
import defpackage.lzu0;
import defpackage.m051;
import defpackage.mbx0;
import defpackage.mi31;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny6;
import defpackage.ny61;
import defpackage.o051;
import defpackage.p051;
import defpackage.pdc;
import defpackage.pex0;
import defpackage.r051;
import defpackage.s051;
import defpackage.tcc;
import defpackage.tmv0;
import defpackage.u051;
import defpackage.ufu;
import defpackage.uzg;
import defpackage.v051;
import defpackage.w511;
import defpackage.wl4;
import defpackage.xlp0;
import defpackage.xng0;
import defpackage.z051;
import defpackage.zj60;
import defpackage.zkv0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.preorder.summary.tariffpage.badge.j;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmi31;", "verticalTariff", "", "<unused var>", "", "Lwl4;", "<anonymous>", "(Lmi31;Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.badge.SummaryPromotionTariffBadgeInteractor$badgesFlow$2", f = "SummaryPromotionTariffBadgeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionTariffBadgeInteractor$badgesFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionTariffBadgeInteractor$badgesFlow$2(j jVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = jVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryPromotionTariffBadgeInteractor$badgesFlow$2 summaryPromotionTariffBadgeInteractor$badgesFlow$2 = new SummaryPromotionTariffBadgeInteractor$badgesFlow$2(this.this$0, (Continuation) obj3);
        summaryPromotionTariffBadgeInteractor$badgesFlow$2.L$0 = (mi31) obj;
        return summaryPromotionTariffBadgeInteractor$badgesFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final j jVar = this.this$0;
        ru.yandex.taxi.summary.promotions.repository.e eVar = jVar.a;
        String str = mi31Var.f;
        String str2 = mi31Var.b;
        pex0 pex0Var = mi31Var.a;
        final int i = 1;
        tmv0 j = eVar.j(str, str2, !pex0Var.g(), jVar.g, jVar.h);
        ArrayList arrayList = new ArrayList();
        for (final zkv0 zkv0Var : j.a) {
            if (j.b) {
                arrayList.add(new wl4(null, null, null, 0, null, null, null, null, null, null, null, null, null, 126975));
            } else {
                pdc pdcVar = jVar.d;
                String str3 = zkv0Var.a;
                FormattedText formattedText = zkv0Var.c;
                FormattedText formattedText2 = zkv0Var.d;
                zj60 zj60Var = new zj60();
                Rect rect = new Rect(jVar.b(), jVar.b(), jVar.b(), jVar.b());
                String str4 = zkv0Var.e;
                wl4 wl4Var = new wl4(str3, formattedText, formattedText2, 0, (str4 == null || evu0.J(str4)) ? null : str4, null, rect, null, null, zj60Var, null, null, null, 128936);
                z051 z051Var = zkv0Var.f;
                if (z051Var instanceof p051) {
                    uzg uzgVar = ((p051) z051Var).a;
                    final int i2 = 0;
                    wl4Var = wl4.a(wl4Var, null, null, null, new ibx0(zkv0Var.h, ((ru.yandex.taxi.cashback.l) jVar.e).b()), (FormattedText) uzgVar.d.getValue(), ((ufu) pdcVar).f(new bdc(xng0.textMain), uzgVar.a), new Runnable() { // from class: omv0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            zkv0 zkv0Var2 = zkv0Var;
                            j jVar2 = jVar;
                            switch (i3) {
                                case 0:
                                    jVar2.b.c(zkv0Var2, SummaryPromotionsAnalytics$SummaryState.EXPANDED);
                                    break;
                                default:
                                    jVar2.b.c(zkv0Var2, SummaryPromotionsAnalytics$SummaryState.EXPANDED);
                                    break;
                            }
                        }
                    }, 63615);
                } else if (z051Var instanceof r051) {
                    wl4Var = wl4.a(wl4Var, null, null, new Rect(((avj0) jVar.c).c(mrg0.go_design_s_space), jVar.b(), jVar.b(), jVar.b()), null, null, null, null, 131007);
                } else if (z051Var instanceof v051) {
                    wl4Var = wl4.a(wl4Var, null, null, null, null, ((v051) z051Var).a, null, null, 130559);
                } else if (z051Var instanceof l051) {
                    g00 g00Var = ((l051) z051Var).a;
                    wl4Var = wl4.a(wl4Var, null, null, null, null, (FormattedText) g00Var.d.getValue(), ((ufu) pdcVar).f(new bdc(xng0.textMain), g00Var.a), new Runnable() { // from class: omv0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i;
                            zkv0 zkv0Var2 = zkv0Var;
                            j jVar2 = jVar;
                            switch (i3) {
                                case 0:
                                    jVar2.b.c(zkv0Var2, SummaryPromotionsAnalytics$SummaryState.EXPANDED);
                                    break;
                                default:
                                    jVar2.b.c(zkv0Var2, SummaryPromotionsAnalytics$SummaryState.EXPANDED);
                                    break;
                            }
                        }
                    }, 63871);
                } else if (z051Var instanceof u051) {
                    u051 u051Var = (u051) z051Var;
                    boolean a = jVar.f.a(u051Var, pex0Var);
                    lzu0 lzu0Var = new lzu0(5, zkv0Var, u051Var);
                    Pair pair = (Pair) lzu0Var.invoke(Boolean.valueOf(a));
                    FormattedText formattedText3 = (FormattedText) pair.getFirst();
                    FormattedText formattedText4 = (FormattedText) pair.getSecond();
                    if (formattedText4 == null) {
                        formattedText4 = FormattedText.c;
                    }
                    wl4Var = wl4.a(wl4Var, formattedText3, formattedText4, null, new mbx0(a, new lxo0(24, jVar, zkv0Var, u051Var), lzu0Var, false, 8), null, null, null, 130809);
                } else if (z051Var instanceof m051) {
                    List<ActionButton> list = ((m051) z051Var).a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    for (ActionButton actionButton : list) {
                        ufu ufuVar = (ufu) pdcVar;
                        kdc b = ufuVar.b(actionButton.c);
                        if (b == null) {
                            b = new bdc(xng0.controlMinor);
                        }
                        String str5 = actionButton.b;
                        kdc i3 = ufuVar.i(actionButton.d);
                        if (i3 == null) {
                            i3 = new bdc(xng0.textOnControlMinor);
                        }
                        arrayList2.add(new ny6(b, str5, i3, new xlp0(17, jVar, zkv0Var, actionButton)));
                    }
                    wl4Var = wl4.a(wl4Var, null, null, null, new gbx0(arrayList2), null, null, null, 130815);
                } else if (!(z051Var instanceof o051) && !z051Var.equals(s051.a)) {
                    w511.b();
                    return null;
                }
                arrayList.add(wl4Var);
                jVar.b.f.c(zkv0Var, SummaryPromotionsAnalytics$SummaryState.EXPANDED);
                i = 1;
            }
        }
        return arrayList;
    }
}
