package ru.yandex.taxi.logistics.deliveries.order;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import defpackage.ajz;
import defpackage.avc0;
import defpackage.avj0;
import defpackage.bjz;
import defpackage.bvc0;
import defpackage.dzg0;
import defpackage.eiz;
import defpackage.en70;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fiz;
import defpackage.fn70;
import defpackage.giz;
import defpackage.he6;
import defpackage.hiz;
import defpackage.hkz;
import defpackage.hm70;
import defpackage.hn70;
import defpackage.ie6;
import defpackage.iiz;
import defpackage.je6;
import defpackage.jiz;
import defpackage.ke6;
import defpackage.kiz;
import defpackage.kyh0;
import defpackage.lm70;
import defpackage.lzg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe6;
import defpackage.oiz;
import defpackage.pe6;
import defpackage.piz;
import defpackage.qe6;
import defpackage.qiz;
import defpackage.sm70;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.yiz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lyn70;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.order.LogisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1", f = "LogisticsTrackingTrackingCardUiStateInteractor.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LogisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ bjz $tracking;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1(c cVar, bjz bjzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$tracking = bjzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LogisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1 logisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1 = new LogisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1(this.this$0, this.$tracking, continuation);
        logisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return logisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogisticsTrackingTrackingCardUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fn70 fn70Var;
        fn70 hm70Var;
        long j;
        bjz bjzVar;
        List list;
        tpr F;
        hkz hkzVar;
        oe6 oe6Var;
        ke6 ke6Var;
        ke6 je6Var;
        Long l;
        Long l2;
        String str;
        String str2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            bjz bjzVar2 = this.$tracking;
            cVar.getClass();
            yiz yizVar = bjzVar2.i;
            ajz ajzVar = bjzVar2.k;
            String h = ((avj0) cVar.d).h(kyh0.delivery);
            String str3 = bjzVar2.e;
            LogisticsOrderTracking$Status logisticsOrderTracking$Status = bjzVar2.h;
            LogisticsOrderTracking$Status logisticsOrderTracking$Status2 = LogisticsOrderTracking$Status.Stub;
            SpannableTextStrategyInteractor.SpannableTextStrategy spannableTextStrategy = logisticsOrderTracking$Status == logisticsOrderTracking$Status2 ? SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_DENSITY : SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_100_TEXT_SIZE;
            Integer valueOf = logisticsOrderTracking$Status == logisticsOrderTracking$Status2 ? null : Integer.valueOf(f1h0.ic_chevron_next_circle);
            boolean z = logisticsOrderTracking$Status == logisticsOrderTracking$Status2 || yizVar != null;
            String str4 = bjzVar2.f;
            Long l3 = yizVar != null ? yizVar.a : null;
            qiz qizVar = bjzVar2.g;
            String str5 = ajzVar != null ? ajzVar.b : null;
            if (l3 != null) {
                hm70Var = new en70(l3);
            } else {
                if (qizVar instanceof piz) {
                    fn70Var = new lm70(((piz) qizVar).a, null);
                } else if (str5 != null) {
                    avc0 avc0Var = new avc0();
                    avc0Var.b = str5;
                    avc0Var.d = Collections.singletonList(CarPlateAppearanceExperiment.CarPlateUsage.ORDER_LIST_ITEM);
                    fn70Var = new sm70(new bvc0(avc0Var), null, null, Integer.valueOf(lzg0.ic_delivery_car), null, null, HProv.PP_INFO);
                } else if (qizVar instanceof oiz) {
                    hm70Var = new hm70(lzg0.ic_delivery_box);
                } else {
                    fn70Var = null;
                }
                boolean z2 = ajzVar == null && (str = ajzVar.a) != null && (evu0.J(str) ^ true) && (str2 = ajzVar.b) != null && (evu0.J(str2) ^ true);
                int i2 = (yizVar == null ? yizVar.a : null) == null ? 1 : 0;
                boolean z3 = (yizVar == null ? yizVar.b : null) == null;
                j = 0;
                long longValue = (yizVar != null || (l2 = yizVar.b) == null) ? 0L : l2.longValue();
                if (yizVar != null && (l = yizVar.a) != null) {
                    j = l.longValue();
                }
                hn70 hn70Var = new hn70(str3, null, null, spannableTextStrategy, valueOf, z, null, str4, null, null, fn70Var, z2, i2, null, z3, longValue, j, h, 91846);
                c cVar2 = this.this$0;
                bjzVar = this.$tracking;
                cVar2.getClass();
                if (bjzVar.o.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (kiz kizVar : bjzVar.o) {
                        String str6 = kizVar.b;
                        jiz jizVar = kizVar.a;
                        String str7 = kizVar.c;
                        String str8 = kizVar.d;
                        pe6 pe6Var = str8 != null ? new pe6(str8) : null;
                        giz gizVar = giz.a;
                        boolean equals = jizVar.equals(gizVar);
                        iiz iizVar = iiz.a;
                        if (equals) {
                            oe6Var = null;
                        } else {
                            if (!(jizVar instanceof eiz) && !(jizVar instanceof fiz) && !(jizVar instanceof hiz) && !jizVar.equals(iizVar)) {
                                w511.b();
                                return null;
                            }
                            oe6Var = new oe6(dzg0.chevron_next);
                        }
                        if (jizVar instanceof fiz) {
                            je6Var = ie6.a;
                        } else if (jizVar instanceof eiz) {
                            je6Var = new he6(((eiz) jizVar).a);
                        } else if (jizVar instanceof hiz) {
                            hiz hizVar = (hiz) jizVar;
                            je6Var = new je6(hizVar.a, hizVar.b);
                        } else {
                            if (!jizVar.equals(gizVar) && !jizVar.equals(iizVar)) {
                                w511.b();
                                return null;
                            }
                            ke6Var = null;
                            arrayList.add(new qe6(str6, str7, pe6Var, oe6Var, ke6Var));
                        }
                        ke6Var = je6Var;
                        arrayList.add(new qe6(str6, str7, pe6Var, oe6Var, ke6Var));
                    }
                    list = kotlin.collections.a.J0(arrayList);
                } else {
                    list = null;
                }
                c cVar3 = this.this$0;
                bjz bjzVar3 = this.$tracking;
                String str9 = bjzVar3.b;
                g X = e.X(new b(cVar3.a.e(), str9), new LogisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1(null, cVar3, bjzVar3.e, str9));
                cVar3.b.getClass();
                F = e.F(X, uyj.a);
                hkzVar = new hkz(vprVar, hn70Var, this.this$0, this.$tracking, list);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (F.collect(hkzVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            fn70Var = hm70Var;
            if (ajzVar == null) {
            }
            if ((yizVar == null ? yizVar.a : null) == null) {
            }
            if ((yizVar == null ? yizVar.b : null) == null) {
            }
            j = 0;
            if (yizVar != null) {
            }
            if (yizVar != null) {
                j = l.longValue();
            }
            hn70 hn70Var2 = new hn70(str3, null, null, spannableTextStrategy, valueOf, z, null, str4, null, null, fn70Var, z2, i2, null, z3, longValue, j, h, 91846);
            c cVar22 = this.this$0;
            bjzVar = this.$tracking;
            cVar22.getClass();
            if (bjzVar.o.isEmpty()) {
            }
            c cVar32 = this.this$0;
            bjz bjzVar32 = this.$tracking;
            String str92 = bjzVar32.b;
            g X2 = e.X(new b(cVar32.a.e(), str92), new LogisticsTrackingTrackingCardUiStateInteractor$getTitleUpdates$$inlined$flatMapLatest$1(null, cVar32, bjzVar32.e, str92));
            cVar32.b.getClass();
            F = e.F(X2, uyj.a);
            hkzVar = new hkz(vprVar, hn70Var2, this.this$0, this.$tracking, list);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (F.collect(hkzVar, this) == coroutineSingletons) {
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
