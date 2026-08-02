package ru.yandex.taxi.preorder.source.userposition.repository;

import android.content.SharedPreferences;
import android.location.Location;
import defpackage.ccz;
import defpackage.cne0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.repository.CachedLocationRepositoryImpl$onAppCreated$1", f = "CachedLocationRepositoryImpl.kt", l = {46, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class CachedLocationRepositoryImpl$onAppCreated$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedLocationRepositoryImpl$onAppCreated$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CachedLocationRepositoryImpl$onAppCreated$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedLocationRepositoryImpl$onAppCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        if (r2 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0117  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Location location;
        pz40 pz40Var;
        Location location2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.b.getClass();
            a aVar = this.this$0;
            this.label = 1;
            ccz cczVar = aVar.b;
            cne0 cne0Var = aVar.d;
            if (cne0Var.i("version", 0) < 1) {
                cczVar.getClass();
                if (cne0Var.c(RemoteBioParameters.TIME)) {
                    location = new Location(cne0Var.l("provider", "CachedLocationRepository"));
                    location.setTime(cne0Var.j(RemoteBioParameters.TIME, 0L));
                    location.setLatitude(cne0Var.h("lat"));
                    location.setLongitude(cne0Var.h("lon"));
                    location.setAccuracy(cne0Var.h("accuracy"));
                } else {
                    location = null;
                }
                SharedPreferences.Editor putInt = cne0Var.k().edit().clear().putInt("version", 1);
                if (location == null) {
                    putInt.commit();
                } else if (putInt.putString("provider", location.getProvider()).putLong(RemoteBioParameters.TIME, location.getTime()).putLong("lat", Double.doubleToRawLongBits(location.getLatitude())).putLong("lon", Double.doubleToRawLongBits(location.getLongitude())).putFloat("accuracy", location.getAccuracy()).commit()) {
                    location.getLatitude();
                    location.getLongitude();
                } else {
                    SharedPreferences.Editor edit = cne0Var.k().edit();
                    edit.clear().putInt("version", 1);
                    edit.commit();
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pz40Var = (pz40) this.L$0;
                kotlin.b.b(obj);
                ((r0) pz40Var).l(obj);
                a aVar2 = this.this$0;
                ccz cczVar2 = aVar2.b;
                location2 = (Location) aVar2.e.getValue();
                if (location2 != null) {
                    location2.getLatitude();
                    location2.getLongitude();
                }
                cczVar2.getClass();
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        a aVar3 = this.this$0;
        r0 r0Var = aVar3.e;
        this.L$0 = r0Var;
        this.label = 2;
        aVar3.a.getClass();
        sjh sjhVar = uyj.a;
        obj = tje.k0(mdh.b, new CachedLocationRepositoryImpl$readFromPreferences$2(aVar3, null), this);
        if (obj != coroutineSingletons) {
            pz40Var = r0Var;
            ((r0) pz40Var).l(obj);
            a aVar22 = this.this$0;
            ccz cczVar22 = aVar22.b;
            location2 = (Location) aVar22.e.getValue();
            if (location2 != null) {
            }
            cczVar22.getClass();
            return zy11Var;
        }
        return coroutineSingletons;
    }
}
