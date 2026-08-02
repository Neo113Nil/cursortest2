package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.LocationManager;
import android.os.Build;
import androidx.core.location.j;
import defpackage.d7z;
import defpackage.mcz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.p9z;
import defpackage.pvn;
import defpackage.q9z;
import defpackage.r9z;
import defpackage.s9z;
import defpackage.tpr;
import defpackage.vng;
import defpackage.vpr;
import defpackage.ykj;
import defpackage.zls;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.impl.LocationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1", f = "LocationManagerAdapter.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class LocationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ p9z $request$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ s9z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1(Continuation continuation, p9z p9zVar, s9z s9zVar) {
        super(3, continuation);
        this.$request$inlined = p9zVar;
        this.this$0 = s9zVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LocationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1 locationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1 = new LocationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1((Continuation) obj3, this.$request$inlined, this.this$0);
        locationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        locationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1.L$1 = obj2;
        return locationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
    
        if (r5.getProvider(r6) != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        tpr tprVar;
        boolean z;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            LocationManager locationManager = (LocationManager) this.L$1;
            String c = vng.c(this.$request$inlined.a);
            Pair pair = new Pair("request", this.$request$inlined.toString());
            tprVar = pvn.a;
            if (locationManager == null) {
                this.this$0.b.b("LocationManagerAdapter", new RuntimeException("LocationManager not available"), new Pair[0]);
            } else {
                WeakHashMap weakHashMap = j.a;
                if (Build.VERSION.SDK_INT >= 31) {
                    z = d7z.a(locationManager, c);
                } else {
                    if (!locationManager.getAllProviders().contains(c)) {
                    }
                    z = true;
                }
                s9z s9zVar = this.this$0;
                if (z) {
                    s9zVar.b.b("LocationManagerAdapter", new RuntimeException(oyr.p("Provider ", c, " not supported")), new Pair[0]);
                } else {
                    try {
                        failure = vng.d(this.$request$inlined);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        this.this$0.b.b("LocationManagerAdapter", a, pair);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    mcz mczVar = (mcz) failure;
                    if (mczVar != null) {
                        ykj ykjVar = ykj.c;
                        s9z s9zVar2 = this.this$0;
                        tprVar = kotlinx.coroutines.flow.e.g(new LocationManagerAdapterKt$requestLocationUpdates$5(locationManager, c, mczVar, ykjVar, new q9z(s9zVar2, pair, 0), new r9z(s9zVar2, pair, 0), new r9z(s9zVar2, pair, 1), new q9z(s9zVar2, pair, 1), null));
                    }
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
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
        z = false;
        s9z s9zVar3 = this.this$0;
        if (z) {
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        if (kotlinx.coroutines.flow.e.u(tprVar, vprVar, this) == coroutineSingletons) {
        }
        return zy11.a;
    }
}
