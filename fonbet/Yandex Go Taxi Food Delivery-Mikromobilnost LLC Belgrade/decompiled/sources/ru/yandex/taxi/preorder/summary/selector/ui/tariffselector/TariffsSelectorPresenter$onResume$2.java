package ru.yandex.taxi.preorder.summary.selector.ui.tariffselector;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.Notification;
import defpackage.fnx0;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.pex0;
import defpackage.pl2;
import defpackage.snx0;
import defpackage.spb0;
import defpackage.tnx0;
import defpackage.tse;
import defpackage.unx0;
import defpackage.wls;
import defpackage.xqe;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorPresenter$onResume$2", f = "TariffsSelectorPresenter.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffsSelectorPresenter$onResume$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorPresenter$onResume$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            b bVar = (b) this.receiver;
            unx0 unx0Var = bVar.B;
            pex0 pex0Var = ((fnx0) obj).c;
            String str = pex0Var.b;
            if (pex0Var.O instanceof pl2) {
                xqe xqeVar = (xqe) bVar.z;
                xqeVar.getClass();
                String a = xqe.a(str, "antisurge_clarification");
                Notification notification = (Notification) pex0Var.p0.get("antisurge_clarification");
                if (notification == null ? false : xqeVar.a.a(a, notification)) {
                    bVar.G.v0(pex0Var);
                }
            }
            snx0 snx0Var = unx0Var.d;
            if (str.length() > 0 && !snx0Var.b.contains(str)) {
                snx0Var.b.add(str);
                o7r0 o7r0Var = unx0Var.b;
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("tariff_class", str);
                o7r0Var.a.a("tariff_shown", hashMap, 1, new HashMap());
            }
            String valueOf = pex0Var.h() ? "1.0" : String.valueOf(pex0Var.e0.a);
            tnx0 tnx0Var = new tnx0("Shown", str, valueOf);
            snx0 snx0Var2 = unx0Var.d;
            tnx0 tnx0Var2 = snx0Var2.c;
            if (tnx0Var2 == null || !tnx0Var2.equals(tnx0Var)) {
                spb0 spb0Var = unx0Var.c;
                Map e = gw00.e(new Pair("Shown", gw00.e(new Pair(str, g8e.z("Surge", valueOf)))));
                spb0Var.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("next", e);
                spb0Var.a.a("PickupLocation", hashMap2, 1, new HashMap());
                snx0Var2.c = tnx0Var;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffsSelectorPresenter$onResume$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffsSelectorPresenter$onResume$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffsSelectorPresenter$onResume$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth b = ((k) this.this$0.y).j.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.this$0, b.class, "onSelectedTariff", "onSelectedTariff(Lru/yandex/taxi/tariffs/model/TariffSelection;)V", 4);
            this.label = 1;
            if (e.k(b, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
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
