package ru.yandex.taxi.masstransit.address.interactor;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.d0l0;
import defpackage.g050;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uu30;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.address.interactor.SyncRouteInteractor$syncTransportAddressesInternal$2", f = "SyncRouteInteractor.kt", l = {HProv.ALG_SID_SHA_224, 148, 149}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SyncRouteInteractor$syncTransportAddressesInternal$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRouteInteractor$syncTransportAddressesInternal$2(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SyncRouteInteractor$syncTransportAddressesInternal$2 syncRouteInteractor$syncTransportAddressesInternal$2 = new SyncRouteInteractor$syncTransportAddressesInternal$2(this.this$0, continuation);
        syncRouteInteractor$syncTransportAddressesInternal$2.L$0 = obj;
        return syncRouteInteractor$syncTransportAddressesInternal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncRouteInteractor$syncTransportAddressesInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|1|(1:(3:(1:(7:6|7|8|9|(5:17|(1:19)(1:25)|20|(1:22)(1:24)|23)(1:13)|14|15)(2:30|31))(7:32|33|34|35|36|(10:39|9|(1:11)|17|(0)(0)|20|(0)(0)|23|14|15)|38)|28|29)(1:46))(1:52)|47|48|(2:50|38)(4:51|36|(0)|38)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0144, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
    
        r12 = r14;
        r14 = r0;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
    
        if (r14.a(r13) == r2) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Type inference failed for: r8v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v8, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i iVar;
        kotlinx.coroutines.sync.a aVar;
        noh h;
        Object s;
        i iVar2;
        d0l0 d0l0Var;
        Throwable th;
        g050 g050Var;
        Object k;
        d0l0 d0l0Var2;
        ZoneAddress zoneAddress;
        i iVar3;
        List list;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            iVar = this.this$0;
            aVar = iVar.h;
            this.L$0 = tseVar;
            this.L$1 = aVar;
            this.L$2 = iVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    h = (noh) this.L$7;
                    d0l0Var = (d0l0) this.L$4;
                    i iVar4 = (i) this.L$2;
                    ?? r8 = (g050) this.L$1;
                    try {
                        kotlin.b.b(obj);
                        s = obj;
                        aVar = r8;
                        iVar2 = iVar4;
                        ZoneAddress zoneAddress2 = (ZoneAddress) s;
                        this.L$0 = null;
                        this.L$1 = aVar;
                        this.L$2 = iVar2;
                        this.L$3 = null;
                        this.L$4 = d0l0Var;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = zoneAddress2;
                        this.label = 3;
                        k = h.k(this);
                        if (k != coroutineSingletons) {
                            kotlinx.coroutines.sync.a aVar2 = aVar;
                            obj = k;
                            g050Var = aVar2;
                            d0l0Var2 = d0l0Var;
                            zoneAddress = zoneAddress2;
                            iVar3 = iVar2;
                            list = (List) obj;
                            if (zoneAddress == null) {
                            }
                            hst hstVar = jst.e;
                            if (zoneAddress == null) {
                            }
                            if (d0l0Var2.b.size() == list.size()) {
                            }
                            xby.l(hstVar, "Transport.AddressSyncError", null, null, "Addresses sync error. Source update valid = " + r5 + " destination = " + z, 6);
                            g050Var.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var = r8;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zoneAddress = (ZoneAddress) this.L$8;
                    d0l0Var2 = (d0l0) this.L$4;
                    iVar3 = (i) this.L$2;
                    g050Var = (g050) this.L$1;
                    try {
                        kotlin.b.b(obj);
                        list = (List) obj;
                        if (zoneAddress == null && d0l0Var2.b.size() == list.size()) {
                            iVar3.b.c(zoneAddress);
                            iVar3.b.b(list);
                        } else {
                            hst hstVar2 = jst.e;
                            boolean z2 = zoneAddress == null;
                            if (d0l0Var2.b.size() == list.size()) {
                                z = false;
                            }
                            xby.l(hstVar2, "Transport.AddressSyncError", null, null, "Addresses sync error. Source update valid = " + z2 + " destination = " + z, 6);
                        }
                        g050Var.d(null);
                        return zy11.a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                g050Var.d(null);
                throw th;
            }
            iVar = (i) this.L$2;
            ?? r82 = (g050) this.L$1;
            kotlin.b.b(obj);
            aVar = r82;
        }
        uu30 a = iVar.b.a();
        d0l0 c = iVar.a.c();
        qoh h2 = tje.h(tseVar, null, null, new SyncRouteInteractor$syncTransportAddressesInternal$2$1$sourceDeferred$1(c.a, iVar, a, null), 3);
        h = tje.h(tseVar, null, null, new SyncRouteInteractor$syncTransportAddressesInternal$2$1$destinationDeferred$1(a, c, null, iVar), 3);
        this.L$0 = null;
        this.L$1 = aVar;
        this.L$2 = iVar;
        this.L$3 = null;
        this.L$4 = c;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = h;
        this.label = 2;
        s = h2.s(this);
        if (s == coroutineSingletons) {
            return coroutineSingletons;
        }
        iVar2 = iVar;
        d0l0Var = c;
        ZoneAddress zoneAddress22 = (ZoneAddress) s;
        this.L$0 = null;
        this.L$1 = aVar;
        this.L$2 = iVar2;
        this.L$3 = null;
        this.L$4 = d0l0Var;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = zoneAddress22;
        this.label = 3;
        k = h.k(this);
        if (k != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
