package ru.yandex.taxi.delivery.impl.paid_insurance;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import defpackage.ahi;
import defpackage.aoi;
import defpackage.aq80;
import defpackage.bvf0;
import defpackage.cxm;
import defpackage.czh;
import defpackage.dci;
import defpackage.dt20;
import defpackage.gjz;
import defpackage.hwy0;
import defpackage.izh;
import defpackage.jwh;
import defpackage.m8h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.q990;
import defpackage.qcp0;
import defpackage.r990;
import defpackage.tls;
import defpackage.tse;
import defpackage.vyh;
import defpackage.wls;
import defpackage.x990;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.delivery.api.routers.PaidInsuranceScreenSource;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.impl.paid_insurance.DeliveryPaidInsuranceRouterImpl$onLaunch$1", f = "DeliveryPaidInsuranceRouterImpl.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPaidInsuranceRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ ahi $payload;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.delivery.impl.paid_insurance.DeliveryPaidInsuranceRouterImpl$onLaunch$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            c cVar = (c) this.receiver;
            cVar.getClass();
            cVar.b.a(Uri.parse((String) obj), DeeplinkSource.UNSPECIFIED);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.delivery.impl.paid_insurance.DeliveryPaidInsuranceRouterImpl$onLaunch$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((c) this.receiver).d.a(((Boolean) obj).booleanValue());
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPaidInsuranceRouterImpl$onLaunch$1(e eVar, ahi ahiVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$payload = ahiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryPaidInsuranceRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryPaidInsuranceRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        r990 r990Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gjz gjzVar = bvf0.u().a;
            Application application = (Application) gjzVar.b.c;
            q5z.h(application);
            qcp0 qcp0Var = new qcp0();
            hwy0 c = gjzVar.c();
            dci b = gjzVar.b();
            q5z.h(b);
            jwh a2 = gjzVar.a();
            q5z.h(a2);
            dt20 dt20Var = new dt20(application, qcp0Var, c, b, a2);
            e eVar = this.this$0;
            r990 r990Var2 = new r990(new vyh(1, eVar.G), new aq80(dt20Var), new m8h(a2));
            c cVar = eVar.E;
            PaidInsuranceScreenSource paidInsuranceScreenSource = this.$payload.a;
            this.L$0 = r990Var2;
            this.label = 1;
            a = cVar.a(paidInsuranceScreenSource, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            r990Var = r990Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r990Var = (r990) this.L$0;
            kotlin.b.b(obj);
            a = obj;
        }
        x990 x990Var = (x990) a;
        zy11 zy11Var = zy11.a;
        if (x990Var == null) {
            return zy11Var;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this.this$0.E, c.class, "openDeeplink", "openDeeplink(Ljava/lang/String;)V", 0);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(1, this.this$0.E, c.class, "onToggleClick", "onToggleClick(Z)V", 0);
        czh create = r990Var.a.create();
        aq80 aq80Var = r990Var.b;
        q990 q990Var = new q990(r990Var, create, anonymousClass1, anonymousClass2);
        dt20 dt20Var2 = (dt20) aq80Var.a;
        Context context = (Context) dt20Var2.b;
        q5z.h(context);
        czh.a(create, new izh(new cxm(new aoi(new dt20(context, (hwy0) dt20Var2.c, (dci) dt20Var2.w, new m8h((jwh) dt20Var2.x), 18), x990Var, q990Var)), ButtonType.BACK, ScreenMode.FIXED, null, null, null, 8178));
        return zy11Var;
    }
}
