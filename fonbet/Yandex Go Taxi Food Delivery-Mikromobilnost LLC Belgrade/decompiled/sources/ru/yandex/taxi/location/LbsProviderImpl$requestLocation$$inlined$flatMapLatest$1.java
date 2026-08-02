package ru.yandex.taxi.location;

import android.location.Location;
import defpackage.a8y;
import defpackage.cmt;
import defpackage.d8y;
import defpackage.e8y;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.g92;
import defpackage.h8y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.q7y;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.p;
import ru.yandex.taxi.location.dto.LbsResponse;
import ru.yandex.taxi.net.taxi.LocationApi;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.location.LbsProviderImpl$requestLocation$$inlined$flatMapLatest$1", f = "LbsProviderImpl.kt", l = {215, 221, 226, 236, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class LbsProviderImpl$requestLocation$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $deviceId$inlined;
    final /* synthetic */ String $uuid$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LbsProviderImpl$requestLocation$$inlined$flatMapLatest$1(Continuation continuation, g gVar, String str, String str2) {
        super(3, continuation);
        this.this$0 = gVar;
        this.$uuid$inlined = str;
        this.$deviceId$inlined = str2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LbsProviderImpl$requestLocation$$inlined$flatMapLatest$1 lbsProviderImpl$requestLocation$$inlined$flatMapLatest$1 = new LbsProviderImpl$requestLocation$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$uuid$inlined, this.$deviceId$inlined);
        lbsProviderImpl$requestLocation$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        lbsProviderImpl$requestLocation$$inlined$flatMapLatest$1.L$1 = obj2;
        return lbsProviderImpl$requestLocation$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(1:(1:(1:(3:8|9|10)(2:12|13))(8:14|15|(1:17)(1:54)|18|(1:20)(1:53)|(6:22|(1:24)(1:48)|(1:(1:27)(1:46))(1:47)|28|(8:30|(6:32|33|(1:35)|36|(1:38)|39)|40|33|(0)|36|(0)|39)(8:41|(6:45|33|(0)|36|(0)|39)|40|33|(0)|36|(0)|39)|50)|49|50))(3:55|56|57))(9:58|59|60|61|62|63|64|(2:66|(2:68|(3:70|56|57))(1:71))(5:72|(1:74)|75|(6:77|(2:79|(1:81))|86|(1:88)(1:89)|83|(7:85|15|(0)(0)|18|(0)(0)|(0)|49))|50)|52))(1:93))(3:102|(1:104)|52)|94|95|96|(5:98|62|63|64|(0)(0))|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00da, code lost:
    
        r16 = r2;
        r2 = r1;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023a, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r7, r12, r17) == r6) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0135, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e8y e8yVar;
        vpr vprVar;
        vpr vprVar2;
        e8y e8yVar2;
        Object a;
        Object failure;
        vpr vprVar3;
        Throwable a2;
        vpr vprVar4;
        LbsResponse lbsResponse;
        Throwable th;
        boolean z;
        a8y a8yVar;
        long j;
        vpr vprVar5 = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        tpr tprVar = pvn.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e8y e8yVar3 = (e8y) obj2;
            p pVar = this.this$0.g;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar5;
            this.L$3 = null;
            this.L$4 = e8yVar3;
            this.label = 1;
            if (pVar.b(e8yVar3, this) != coroutineSingletons) {
                e8yVar = e8yVar3;
                vprVar = vprVar5;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            e8y e8yVar4 = (e8y) this.L$4;
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            e8yVar = e8yVar4;
        } else {
            if (i == 2) {
                e8yVar2 = (e8y) this.L$4;
                vprVar2 = (vpr) this.L$2;
                try {
                    kotlin.b.b(obj);
                    a = obj;
                    failure = (fmt) a;
                } catch (Throwable th2) {
                    th = th2;
                    failure = new Result.Failure(th);
                    vprVar3 = vprVar2;
                    a2 = Result.a(failure);
                    if (a2 != null) {
                    }
                    return coroutineSingletons;
                }
                vprVar3 = vprVar2;
                a2 = Result.a(failure);
                if (a2 != null) {
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    fmt fmtVar = (fmt) failure;
                    if (fmtVar != null) {
                        LbsResponse lbsResponse2 = (LbsResponse) fmtVar.a;
                        LbsResponse.a aVar = lbsResponse2.a;
                        String str = aVar.b;
                        if (str != null) {
                            if (evu0.J(str)) {
                                str = null;
                            }
                        }
                        str = lbsResponse2.b.f != null ? null : "Location not found (position.type is null)";
                        p pVar2 = this.this$0.g;
                        int i2 = fmtVar.b;
                        int i3 = aVar.a;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = vprVar3;
                        this.L$3 = null;
                        this.L$4 = e8yVar2;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = lbsResponse2;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.label = 4;
                        if (pVar2.a(e8yVar2, i2, i3, str, this) != coroutineSingletons) {
                            vprVar4 = vprVar3;
                            lbsResponse = lbsResponse2;
                            g gVar = this.this$0;
                            gVar.getClass();
                            LbsResponse.b bVar = lbsResponse.b;
                            LbsResponse.Type type = bVar.f;
                            if (type == null) {
                            }
                            q7y q7yVar = gVar.b;
                            if (z) {
                            }
                            if (z) {
                            }
                            vprVar3 = vprVar4;
                        }
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.label = 5;
                } else {
                    if (!(a2 instanceof GoApiHttpException)) {
                        throw a2;
                    }
                    p pVar3 = this.this$0.g;
                    int code = ((GoApiHttpException) a2).getCode();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = a2;
                    this.L$5 = null;
                    this.label = 3;
                    if (pVar3.a(e8yVar2, code, 0, "", this) != coroutineSingletons) {
                        th = a2;
                        throw th;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                th = (Throwable) this.L$4;
                kotlin.b.b(obj);
                throw th;
            }
            if (i != 4) {
                if (i == 5) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lbsResponse = (LbsResponse) this.L$7;
            e8yVar2 = (e8y) this.L$4;
            vprVar4 = (vpr) this.L$2;
            kotlin.b.b(obj);
            g gVar2 = this.this$0;
            gVar2.getClass();
            LbsResponse.b bVar2 = lbsResponse.b;
            LbsResponse.Type type2 = bVar2.f;
            z = type2 == null;
            q7y q7yVar2 = gVar2.b;
            if (z) {
                q7yVar2.getClass();
            } else {
                Objects.toString(type2);
                q7yVar2.getClass();
            }
            if (z) {
                this.this$0.k.i.set(true);
                g gVar3 = this.this$0;
                gVar3.getClass();
                LbsResponse.Type type3 = bVar2.f;
                int i4 = type3 == null ? -1 : h8y.a[type3.ordinal()];
                Location location = new Location(i4 != 1 ? i4 != 2 ? "lbs-ip" : "lbs-gsm" : "lbs-wifi");
                location.setLatitude(bVar2.c);
                location.setLongitude(bVar2.d);
                location.setAccuracy((float) bVar2.e);
                location.setTime(System.currentTimeMillis());
                location.setAltitude(bVar2.a);
                location.setVerticalAccuracyMeters(bVar2.b);
                if (type3 == LbsResponse.Type.WIFI) {
                    d8y d8yVar = (d8y) kotlin.collections.a.R(e8yVar2.e);
                    if (d8yVar != null) {
                        j = d8yVar.c;
                        if (j == -1) {
                            j = e8yVar2.f;
                        }
                        location.setElapsedRealtimeNanos(j);
                        q7y q7yVar3 = gVar3.b;
                        Objects.toString(type3);
                        location.toString();
                        q7yVar3.getClass();
                        ConcurrentHashMap concurrentHashMap = gVar3.p;
                        if (type3 == null) {
                            type3 = LbsResponse.Type.IP;
                        }
                        concurrentHashMap.put(type3, location);
                        tprVar = new g92(2, location);
                    }
                    j = -1;
                    if (j == -1) {
                    }
                    location.setElapsedRealtimeNanos(j);
                    q7y q7yVar32 = gVar3.b;
                    Objects.toString(type3);
                    location.toString();
                    q7yVar32.getClass();
                    ConcurrentHashMap concurrentHashMap2 = gVar3.p;
                    if (type3 == null) {
                    }
                    concurrentHashMap2.put(type3, location);
                    tprVar = new g92(2, location);
                } else {
                    if (type3 == LbsResponse.Type.GSM && (a8yVar = (a8y) kotlin.collections.a.R(e8yVar2.d)) != null) {
                        j = a8yVar.f;
                        if (j == -1) {
                        }
                        location.setElapsedRealtimeNanos(j);
                        q7y q7yVar322 = gVar3.b;
                        Objects.toString(type3);
                        location.toString();
                        q7yVar322.getClass();
                        ConcurrentHashMap concurrentHashMap22 = gVar3.p;
                        if (type3 == null) {
                        }
                        concurrentHashMap22.put(type3, location);
                        tprVar = new g92(2, location);
                    }
                    j = -1;
                    if (j == -1) {
                    }
                    location.setElapsedRealtimeNanos(j);
                    q7y q7yVar3222 = gVar3.b;
                    Objects.toString(type3);
                    location.toString();
                    q7yVar3222.getClass();
                    ConcurrentHashMap concurrentHashMap222 = gVar3.p;
                    if (type3 == null) {
                    }
                    concurrentHashMap222.put(type3, location);
                    tprVar = new g92(2, location);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.label = 5;
            }
            vprVar3 = vprVar4;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.label = 5;
        }
        cmt<LbsResponse> a3 = ((LocationApi) this.this$0.m.getValue()).a(this.$uuid$inlined, this.$deviceId$inlined, e8yVar);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = vprVar;
        this.L$3 = null;
        this.L$4 = e8yVar;
        this.L$5 = null;
        this.label = 2;
        a = a3.a(this);
        if (a != coroutineSingletons) {
            e8y e8yVar5 = e8yVar;
            vprVar2 = vprVar;
            e8yVar2 = e8yVar5;
            failure = (fmt) a;
            vprVar3 = vprVar2;
            a2 = Result.a(failure);
            if (a2 != null) {
            }
        }
        return coroutineSingletons;
    }
}
