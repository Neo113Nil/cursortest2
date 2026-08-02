package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.runtime.auth.Account;
import com.yandex.runtime.recording.EventLoggingFactory;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ok00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitManagerImpl$runPostInitActions$1", f = "MapKitManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapKitManagerImpl$runPostInitActions$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapKitManagerImpl$runPostInitActions$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapKitManagerImpl$runPostInitActions$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MapKitManagerImpl$runPostInitActions$1 mapKitManagerImpl$runPostInitActions$1 = (MapKitManagerImpl$runPostInitActions$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mapKitManagerImpl$runPostInitActions$1.invokeSuspend(zy11Var);
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
        ok00 ok00Var = this.this$0.h;
        ok00Var.getClass();
        EventLoggingFactory.getEventLogging().subscribe(ok00Var.d);
        MapKitFactory.getInstance().setAccount((Account) this.this$0.l.getValue());
        return zy11.a;
    }
}
