package ru.yandex.taxi.vendor_api.google.location;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import defpackage.bdp;
import defpackage.fqs;
import defpackage.ftt;
import defpackage.jst;
import defpackage.k991;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Landroid/location/Location;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.google.location.GoogleFusedLocationAPIHelperImpl$locationUpdates$1", f = "GoogleFusedLocationAPIHelperImpl.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class GoogleFusedLocationAPIHelperImpl$locationUpdates$1 extends SuspendLambda implements wls {
    final /* synthetic */ fqs $locationRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleFusedLocationAPIHelperImpl$locationUpdates$1(a aVar, fqs fqsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$locationRequest = fqsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoogleFusedLocationAPIHelperImpl$locationUpdates$1 googleFusedLocationAPIHelperImpl$locationUpdates$1 = new GoogleFusedLocationAPIHelperImpl$locationUpdates$1(this.this$0, this.$locationRequest, continuation);
        googleFusedLocationAPIHelperImpl$locationUpdates$1.L$0 = obj;
        return googleFusedLocationAPIHelperImpl$locationUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleFusedLocationAPIHelperImpl$locationUpdates$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            jst.e.getClass();
            ftt fttVar = new ftt(y6f0Var);
            k991 k991Var = this.this$0.a;
            fqs fqsVar = this.$locationRequest;
            LocationRequest create = LocationRequest.create();
            fqsVar.getClass();
            create.setPriority(100);
            create.setInterval(5000L);
            create.setFastestInterval(1000L);
            create.setSmallestDisplacement(10.0f);
            create.setWaitForAccurateLocation(false);
            k991Var.g(create, fttVar, Looper.getMainLooper()).d(fttVar);
            bdp bdpVar = new bdp(21, this.this$0, fttVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, bdpVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
