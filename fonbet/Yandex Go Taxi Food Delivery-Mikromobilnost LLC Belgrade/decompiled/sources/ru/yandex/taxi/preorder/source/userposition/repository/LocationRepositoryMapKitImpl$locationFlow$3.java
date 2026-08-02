package ru.yandex.taxi.preorder.source.userposition.repository;

import android.location.Location;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lzy11;", "<anonymous>", "(Landroid/location/Location;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.repository.LocationRepositoryMapKitImpl$locationFlow$3", f = "LocationRepositoryMapKitImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LocationRepositoryMapKitImpl$locationFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRepositoryMapKitImpl$locationFlow$3(Continuation continuation, f fVar) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationRepositoryMapKitImpl$locationFlow$3 locationRepositoryMapKitImpl$locationFlow$3 = new LocationRepositoryMapKitImpl$locationFlow$3(continuation, this.this$0);
        locationRepositoryMapKitImpl$locationFlow$3.L$0 = obj;
        return locationRepositoryMapKitImpl$locationFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LocationRepositoryMapKitImpl$locationFlow$3 locationRepositoryMapKitImpl$locationFlow$3 = (LocationRepositoryMapKitImpl$locationFlow$3) create((Location) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        locationRepositoryMapKitImpl$locationFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Location location = (Location) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.e = location;
        return zy11.a;
    }
}
