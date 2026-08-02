package ru.yandex.taxi.preorder.source.userposition.repository;

import android.location.Location;
import defpackage.ccz;
import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/location/Location;", "<anonymous>", "(Ltse;)Landroid/location/Location;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.repository.CachedLocationRepositoryImpl$readFromPreferences$2", f = "CachedLocationRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class CachedLocationRepositoryImpl$readFromPreferences$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedLocationRepositoryImpl$readFromPreferences$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CachedLocationRepositoryImpl$readFromPreferences$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedLocationRepositoryImpl$readFromPreferences$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.this$0.d.c(RemoteBioParameters.TIME)) {
            this.this$0.b.getClass();
            return null;
        }
        try {
            Location location = new Location(this.this$0.d.l("provider", "CachedLocationRepository"));
            cne0 cne0Var = this.this$0.d;
            location.setTime(cne0Var.j(RemoteBioParameters.TIME, 0L));
            location.setLatitude(Double.longBitsToDouble(cne0Var.j("lat", 0L)));
            location.setLongitude(Double.longBitsToDouble(cne0Var.j("lon", 0L)));
            location.setAccuracy(cne0Var.h("accuracy"));
            ccz cczVar = this.this$0.b;
            location.getLatitude();
            location.getLongitude();
            location.getProvider();
            cczVar.getClass();
            return location;
        } catch (ClassCastException e) {
            this.this$0.b.getClass();
            ccz.a(e, "readFromPreferences: failed to restore location");
            return null;
        }
    }
}
