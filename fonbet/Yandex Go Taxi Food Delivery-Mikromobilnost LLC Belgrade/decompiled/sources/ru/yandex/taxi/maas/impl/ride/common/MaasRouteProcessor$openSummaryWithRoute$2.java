package ru.yandex.taxi.maas.impl.ride.common;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.tariffs.interactor.b;
import com.yandex.go.zone.model.Zone;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.c0l0;
import defpackage.dd61;
import defpackage.jst;
import defpackage.m000;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.deeplinks.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.common.MaasRouteProcessor$openSummaryWithRoute$2", f = "MaasRouteProcessor.kt", l = {HProv.ALG_SID_GR3410_12_256, 74, HProv.PROV_GOST_2001_DH, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MaasRouteProcessor$openSummaryWithRoute$2 extends SuspendLambda implements wls {
    final /* synthetic */ m000 $deeplinkData;
    final /* synthetic */ tls $onError;
    final /* synthetic */ sls $onSummaryOpened;
    final /* synthetic */ c0l0 $route;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasRouteProcessor$openSummaryWithRoute$2(a aVar, m000 m000Var, c0l0 c0l0Var, sls slsVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$deeplinkData = m000Var;
        this.$route = c0l0Var;
        this.$onSummaryOpened = slsVar;
        this.$onError = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasRouteProcessor$openSummaryWithRoute$2(this.this$0, this.$deeplinkData, this.$route, this.$onSummaryOpened, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasRouteProcessor$openSummaryWithRoute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0148, code lost:
    
        if (ru.yandex.taxi.maas.impl.ride.common.a.b(r9, r10, r2, r3, r4, r14) != r6) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        a aVar;
        sls slsVar;
        m000 m000Var;
        c0l0 c0l0Var;
        tls tlsVar2;
        Object e;
        a aVar2;
        sls slsVar2;
        ZoneAddress zoneAddress;
        pv0 pv0Var;
        Object obj2;
        ZoneAddress zoneAddress2;
        b bVar;
        Zone zone;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar3 = this.this$0;
                m000 m000Var2 = this.$deeplinkData;
                c0l0 c0l0Var2 = this.$route;
                sls slsVar3 = this.$onSummaryOpened;
                tls tlsVar3 = this.$onError;
                try {
                    this.L$0 = aVar3;
                    this.L$1 = m000Var2;
                    this.L$2 = c0l0Var2;
                    this.L$3 = slsVar3;
                    this.L$4 = tlsVar3;
                    this.label = 1;
                    if (a.a(aVar3, m000Var2, this) != coroutineSingletons) {
                        aVar = aVar3;
                        slsVar = slsVar3;
                        m000Var = m000Var2;
                        c0l0Var = c0l0Var2;
                        tlsVar2 = tlsVar3;
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    th = th;
                    tlsVar = tlsVar3;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            tlsVar = 3;
                        }
                        if (i == 3) {
                            zoneAddress2 = (ZoneAddress) this.L$4;
                            tls tlsVar4 = (tls) this.L$3;
                            slsVar2 = (sls) this.L$2;
                            m000 m000Var3 = (m000) this.L$1;
                            aVar2 = (a) this.L$0;
                            kotlin.b.b(obj);
                            m000Var = m000Var3;
                            tlsVar2 = tlsVar4;
                            obj2 = obj;
                            pv0 pv0Var2 = (pv0) obj2;
                            bVar = aVar2.h;
                            zone = zoneAddress2.b;
                            this.L$0 = aVar2;
                            this.L$1 = m000Var;
                            this.L$2 = slsVar2;
                            this.L$3 = tlsVar2;
                            this.L$4 = zoneAddress2;
                            this.L$5 = pv0Var2;
                            this.label = 4;
                            if (bVar.b(zone, this) != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            zoneAddress = zoneAddress2;
                            pv0Var = pv0Var2;
                            Address address = pv0Var.a;
                            this.L$0 = tlsVar2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 5;
                        } else {
                            if (i != 4) {
                                if (i != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                tlsVar = (tls) this.L$0;
                                try {
                                    kotlin.b.b(obj);
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                return zy11.a;
                            }
                            pv0Var = (pv0) this.L$5;
                            zoneAddress = (ZoneAddress) this.L$4;
                            tls tlsVar5 = (tls) this.L$3;
                            slsVar2 = (sls) this.L$2;
                            m000 m000Var4 = (m000) this.L$1;
                            aVar2 = (a) this.L$0;
                            kotlin.b.b(obj);
                            m000Var = m000Var4;
                            tlsVar2 = tlsVar5;
                            Address address2 = pv0Var.a;
                            this.L$0 = tlsVar2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 5;
                        }
                    } else {
                        tls tlsVar6 = (tls) this.L$4;
                        slsVar = (sls) this.L$3;
                        c0l0 c0l0Var3 = (c0l0) this.L$2;
                        m000 m000Var5 = (m000) this.L$1;
                        a aVar4 = (a) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            aVar = aVar4;
                            m000Var = m000Var5;
                            c0l0Var = c0l0Var3;
                            tlsVar2 = tlsVar6;
                            e = obj;
                            ZoneAddress a = ((dd61) e).a();
                            e eVar = aVar.f;
                            zzs zzsVar = c0l0Var.b;
                            this.L$0 = aVar;
                            this.L$1 = m000Var;
                            this.L$2 = slsVar;
                            this.L$3 = tlsVar2;
                            this.L$4 = a;
                            this.label = 3;
                            obj2 = e.b(eVar, zzsVar, this, 30);
                            if (obj2 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            slsVar2 = slsVar;
                            zoneAddress2 = a;
                            aVar2 = aVar;
                            pv0 pv0Var22 = (pv0) obj2;
                            bVar = aVar2.h;
                            zone = zoneAddress2.b;
                            this.L$0 = aVar2;
                            this.L$1 = m000Var;
                            this.L$2 = slsVar2;
                            this.L$3 = tlsVar2;
                            this.L$4 = zoneAddress2;
                            this.L$5 = pv0Var22;
                            this.label = 4;
                            if (bVar.b(zone, this) != coroutineSingletons) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            tlsVar = tlsVar6;
                        }
                    }
                    jst.e.k(th, "error when open maas route deeplink");
                    tlsVar.invoke(th);
                    return zy11.a;
                }
                tlsVar2 = (tls) this.L$4;
                slsVar = (sls) this.L$3;
                c0l0Var = (c0l0) this.L$2;
                m000Var = (m000) this.L$1;
                aVar = (a) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th5) {
                    th = th5;
                    tlsVar = tlsVar2;
                }
            }
            e eVar2 = aVar.f;
            zzs zzsVar2 = c0l0Var.a;
            this.L$0 = aVar;
            this.L$1 = m000Var;
            this.L$2 = c0l0Var;
            this.L$3 = slsVar;
            this.L$4 = tlsVar2;
            this.label = 2;
            e = eVar2.e(zzsVar2, null, false, false, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            ZoneAddress a2 = ((dd61) e).a();
            e eVar3 = aVar.f;
            zzs zzsVar3 = c0l0Var.b;
            this.L$0 = aVar;
            this.L$1 = m000Var;
            this.L$2 = slsVar;
            this.L$3 = tlsVar2;
            this.L$4 = a2;
            this.label = 3;
            obj2 = e.b(eVar3, zzsVar3, this, 30);
            if (obj2 != coroutineSingletons) {
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
