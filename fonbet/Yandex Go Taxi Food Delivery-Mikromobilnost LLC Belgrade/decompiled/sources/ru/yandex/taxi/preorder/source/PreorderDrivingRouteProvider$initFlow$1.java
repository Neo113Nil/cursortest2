package ru.yandex.taxi.preorder.source;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.directions.driving.VehicleType;
import defpackage.aqe0;
import defpackage.b64;
import defpackage.bqe0;
import defpackage.cl7;
import defpackage.cqe0;
import defpackage.cv00;
import defpackage.cx60;
import defpackage.d0l0;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.j18;
import defpackage.jgl0;
import defpackage.kgl0;
import defpackage.mvg;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.rjt0;
import defpackage.tcc;
import defpackage.uj;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zpe0;
import defpackage.zy11;
import defpackage.zzk0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.RoutesAnalytics$Screen;
import ru.yandex.taxi.map_common.map.o;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lzpe0;", "Ld0l0;", "route", "Lzy11;", "<anonymous>", "(Lvpr;Ld0l0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.PreorderDrivingRouteProvider$initFlow$1", f = "PreorderDrivingRouteProvider.kt", l = {HProv.PP_DHOID, HProv.PP_BIO_STATISTICA_LEN, 99}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PreorderDrivingRouteProvider$initFlow$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cqe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderDrivingRouteProvider$initFlow$1(cqe0 cqe0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cqe0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PreorderDrivingRouteProvider$initFlow$1 preorderDrivingRouteProvider$initFlow$1 = new PreorderDrivingRouteProvider$initFlow$1(this.this$0, (Continuation) obj3);
        preorderDrivingRouteProvider$initFlow$1.L$0 = (vpr) obj;
        preorderDrivingRouteProvider$initFlow$1.L$1 = (d0l0) obj2;
        return preorderDrivingRouteProvider$initFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01c7, code lost:
    
        if (r1.emit(r3, r26) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b2, code lost:
    
        if (r3 == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004d, code lost:
    
        if (r1.emit(r3, r26) == r2) goto L58;
     */
    /* JADX WARN: Type inference failed for: r3v17, types: [T, uj] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        j18 j18Var;
        Object s;
        vpr vprVar = (vpr) this.L$0;
        d0l0 d0l0Var = (d0l0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.t = d0l0Var;
            zpe0 zpe0Var = new zpe0(d0l0Var, ntj0.a);
            this.L$0 = vprVar;
            this.L$1 = d0l0Var;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                kotlin.b.b(obj);
                s = obj;
                zpe0 zpe0Var2 = (zpe0) s;
                if (zpe0Var2 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        cqe0 cqe0Var = this.this$0;
        this.L$0 = vprVar;
        this.L$1 = null;
        this.label = 2;
        cqe0Var.getClass();
        j18 j18Var2 = new j18(1, dvw.b(this));
        Ref$ObjectRef y = b64.y(j18Var2);
        cx60 cx60Var = new cx60(2, y);
        cl7 cl7Var = new cl7(j18Var2, cx60Var);
        PreorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2 preorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2 = new PreorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
        Boolean bool = (!((Boolean) cqe0Var.s.b()).booleanValue() || cqe0Var.b()) ? null : Boolean.TRUE;
        long nanoTime = System.nanoTime();
        cv00 cv00Var = cqe0Var.a;
        zzk0 zzk0Var = d0l0.Companion;
        List d = d0l0Var.d(false, false);
        bqe0 bqe0Var = new bqe0(cqe0Var, nanoTime, preorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2, d0l0Var);
        int i2 = aqe0.a[d0l0Var.c.ordinal()];
        ((o) cv00Var).f(d, bool, bqe0Var, null, null, i2 != 1 ? i2 != 2 ? i2 != 3 ? VehicleType.TAXI : VehicleType.DEFAULT : VehicleType.MOTO : VehicleType.TRUCK);
        rjt0 rjt0Var = cqe0Var.b;
        RoutesAnalytics$Screen a = rjt0Var.a();
        if (a != null) {
            List<Address> a2 = rjt0Var.c.c().a();
            arrayList = new ArrayList(tcc.n(a2, 10));
            for (Address address : a2) {
                arrayList.add(new jgl0(address.B().a, address.B().b));
                j18Var2 = j18Var2;
            }
        } else {
            arrayList = null;
        }
        j18 j18Var3 = j18Var2;
        kgl0 kgl0Var = rjt0Var.b;
        String valueOf = String.valueOf(bool);
        String modeName = rjt0Var.o.getModeName();
        kgl0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("WithAvoidTolls", valueOf);
        hashMap.put("Mode", modeName);
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((jgl0) it.next()).c);
            }
            hashMap.put("route_addresses", arrayList2);
        }
        if (a != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, a.getEventValue());
        }
        kgl0Var.a.a("Routes.Requested", hashMap, 2, new HashMap());
        y.element = uj.E;
        if (cl7Var.c()) {
            cx60Var.invoke();
            j18Var = j18Var3;
        } else {
            j18Var = j18Var3;
            j18Var.w(new dx60(cl7Var, 2));
        }
        s = j18Var.s();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
