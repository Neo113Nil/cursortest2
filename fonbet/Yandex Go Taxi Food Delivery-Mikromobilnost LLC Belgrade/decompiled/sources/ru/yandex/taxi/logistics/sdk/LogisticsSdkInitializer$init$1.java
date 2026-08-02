package ru.yandex.taxi.logistics.sdk;

import android.app.Application;
import defpackage.bvf0;
import defpackage.fva0;
import defpackage.ggz;
import defpackage.gjz;
import defpackage.jgz;
import defpackage.kjz;
import defpackage.kst;
import defpackage.mvg;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.qcp0;
import defpackage.rs2;
import defpackage.s59;
import defpackage.ts2;
import defpackage.tse;
import defpackage.vng;
import defpackage.vs2;
import defpackage.wls;
import defpackage.y30;
import defpackage.y8g;
import defpackage.yni;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.LogisticsSdkInitializer$init$1", f = "LogisticsSdkInitializer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LogisticsSdkInitializer$init$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticsSdkInitializer$init$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogisticsSdkInitializer$init$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LogisticsSdkInitializer$init$1 logisticsSdkInitializer$init$1 = (LogisticsSdkInitializer$init$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        logisticsSdkInitializer$init$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fva0 fva0Var = this.this$0.p;
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Time;
        fva0.f(fva0Var, "LogisticsSdk.Init", performanceAnalytics$Type, 0L, 4);
        o oVar = this.this$0;
        Application application = oVar.a;
        kjz kjzVar = new kjz(1, oVar, application);
        synchronized (bvf0.g) {
            y30 y30Var = new y30(application);
            AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = new AppVisibilitySubscriptionImpl(y30Var);
            application.registerActivityLifecycleCallbacks(appVisibilitySubscriptionImpl);
            y8g y8gVar = new y8g(new gjz(kjzVar, y30Var, appVisibilitySubscriptionImpl));
            bvf0.e = y8gVar;
            bvf0.c = y8gVar;
            bvf0.d = y8gVar;
            bvf0.f = y8gVar;
            new yni();
            new qcp0();
            vng.e = new s59(oVar);
            ngd0.z = new kjz(0, oVar, kjzVar);
            y8g y8gVar2 = bvf0.f;
            if (y8gVar2 == null) {
                y8gVar2 = null;
            }
            ((com.yandex.delivery.utils.auth.impl.a) y8gVar2.F.get()).c(kjzVar.f().a);
            y8g y8gVar3 = bvf0.f;
            if (y8gVar3 == null) {
                y8gVar3 = null;
            }
            ((vs2) y8gVar3.O0.get()).a = new ts2(((rs2) oVar.k.get()).g());
            bvf0.N(kjzVar);
        }
        jgz jgzVar = jgz.a;
        ggz ggzVar = new ggz();
        kst kstVar = new kst();
        ArrayList arrayList = ggzVar.a;
        jgz.d = kstVar;
        ArrayList arrayList2 = jgz.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        fva0.b(this.this$0.p, "LogisticsSdk.Init", performanceAnalytics$Type, null, 4);
        return zy11.a;
    }
}
