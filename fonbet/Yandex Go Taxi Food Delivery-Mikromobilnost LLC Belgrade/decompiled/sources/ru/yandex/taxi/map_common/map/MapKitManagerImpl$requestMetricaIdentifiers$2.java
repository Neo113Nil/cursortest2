package ru.yandex.taxi.map_common.map;

import android.app.Application;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.unr0;
import defpackage.v2u0;
import defpackage.wls;
import defpackage.yb20;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitManagerImpl$requestMetricaIdentifiers$2", f = "MapKitManagerImpl.kt", l = {160}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapKitManagerImpl$requestMetricaIdentifiers$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapKitManagerImpl$requestMetricaIdentifiers$2(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapKitManagerImpl$requestMetricaIdentifiers$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapKitManagerImpl$requestMetricaIdentifiers$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n nVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar2 = this.this$0;
            v2u0 v2u0Var = nVar2.d;
            Application application = nVar2.b;
            this.L$0 = nVar2;
            this.label = 1;
            Object l = ((ru.yandex.taxi.analytics.q) v2u0Var).l(application, this);
            if (l == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = l;
            nVar = nVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nVar = (n) this.L$0;
            kotlin.b.b(obj);
        }
        yb20 yb20Var = (yb20) obj;
        nVar.getClass();
        String str = yb20Var.b;
        String str2 = yb20Var.a;
        unr0.C(new Object[]{str}, 1, "! init mapkit - DeviceId: %s", jst.e);
        String.format("! init mapkit - UUID    : %s", Arrays.copyOf(new Object[]{str2}, 1));
        nVar.l(yb20Var);
        return zy11.a;
    }
}
