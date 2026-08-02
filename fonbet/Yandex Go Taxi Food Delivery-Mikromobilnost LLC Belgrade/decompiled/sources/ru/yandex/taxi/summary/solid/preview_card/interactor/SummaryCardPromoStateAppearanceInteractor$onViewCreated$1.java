package ru.yandex.taxi.summary.solid.preview_card.interactor;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import defpackage.b2k;
import defpackage.fnx0;
import defpackage.hev0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omu0;
import defpackage.pex0;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.ye60;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.preview_card.interactor.SummaryCardPromoStateAppearanceInteractor$onViewCreated$1", f = "SummaryCardPromoStateAppearanceInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryCardPromoStateAppearanceInteractor$onViewCreated$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfnx0;", "tariffSelection", "Lzy11;", "<anonymous>", "(Lfnx0;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.summary.solid.preview_card.interactor.SummaryCardPromoStateAppearanceInteractor$onViewCreated$1$3", f = "SummaryCardPromoStateAppearanceInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.summary.solid.preview_card.interactor.SummaryCardPromoStateAppearanceInteractor$onViewCreated$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((fnx0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            fnx0 fnx0Var = (fnx0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d dVar = this.this$0;
            pex0 pex0Var = fnx0Var.c;
            this.L$0 = null;
            this.label = 1;
            ru.yandex.taxi.summary.solid.preview_card.data.a aVar = dVar.a;
            Iterator it = pex0Var.S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((ServiceLevel.Branding) obj2).c == ServiceLevel.Branding.Type.PREVIEW_CARD) {
                    break;
                }
            }
            ServiceLevel.Branding branding = (ServiceLevel.Branding) obj2;
            Pair pair = new Pair(branding != null ? branding.p : null, pex0Var.b);
            SummaryCardPromo summaryCardPromo = (SummaryCardPromo) pair.getFirst();
            String str = (String) pair.getSecond();
            if (summaryCardPromo != null) {
                Object obj4 = aVar.c.get(summaryCardPromo.g.a);
                if (obj4 == null) {
                    obj4 = new hev0(false, str, 0, summaryCardPromo);
                }
                obj3 = aVar.b((hev0) obj4, summaryCardPromo, this);
            } else {
                obj3 = zy11Var;
            }
            return obj3 == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCardPromoStateAppearanceInteractor$onViewCreated$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryCardPromoStateAppearanceInteractor$onViewCreated$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryCardPromoStateAppearanceInteractor$onViewCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b2k l = vng.l(new c(((k) this.this$0.b).j.b()), new omu0(15), vng.c);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
        this.label = 1;
        Object collect = l.collect(new i0(ye60.a, anonymousClass3), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
