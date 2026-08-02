package ru.yandex.taxi.masstransit.address.interactor;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.d0l0;
import defpackage.g050;
import defpackage.g6u;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uu30;
import defpackage.uyj;
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
@mvg(c = "ru.yandex.taxi.masstransit.address.interactor.SyncRouteInteractor$syncTaxiAddressesInternal$2", f = "SyncRouteInteractor.kt", l = {HProv.ALG_SID_SHA_224, 183, 184, 187}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SyncRouteInteractor$syncTaxiAddressesInternal$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRouteInteractor$syncTaxiAddressesInternal$2(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SyncRouteInteractor$syncTaxiAddressesInternal$2 syncRouteInteractor$syncTaxiAddressesInternal$2 = new SyncRouteInteractor$syncTaxiAddressesInternal$2(this.this$0, continuation);
        syncRouteInteractor$syncTaxiAddressesInternal$2.L$0 = obj;
        return syncRouteInteractor$syncTaxiAddressesInternal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncRouteInteractor$syncTaxiAddressesInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        if (r10.a(r17) == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        i iVar;
        g050 g050Var2;
        noh h;
        Object s;
        i iVar2;
        uu30 uu30Var;
        Object k;
        uu30 uu30Var2;
        ZoneAddress zoneAddress;
        g050 g050Var3;
        List list;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            th = th;
            g050Var = g050Var2;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            iVar = this.this$0;
            g050Var2 = iVar.h;
            this.L$0 = tseVar;
            this.L$1 = g050Var2;
            this.L$2 = iVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    h = (noh) this.L$8;
                    uu30Var = (uu30) this.L$3;
                    i iVar3 = (i) this.L$2;
                    g050Var2 = (g050) this.L$1;
                    kotlin.b.b(obj);
                    iVar2 = iVar3;
                    s = obj;
                    ZoneAddress zoneAddress2 = (ZoneAddress) s;
                    this.L$0 = null;
                    this.L$1 = g050Var2;
                    this.L$2 = iVar2;
                    this.L$3 = uu30Var;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = zoneAddress2;
                    this.label = 3;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        uu30Var2 = uu30Var;
                        zoneAddress = zoneAddress2;
                        g050Var3 = g050Var2;
                        list = (List) k;
                        if (zoneAddress != null) {
                        }
                        hst hstVar = jst.e;
                        if (zoneAddress == null) {
                        }
                        if (list.size() == uu30Var2.b.size()) {
                        }
                        xby.l(hstVar, "Transport.AddressSyncError", null, null, "Addresses sync error. Source update valid = " + r4 + " destination = " + z, 6);
                        g050Var3.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                if (i == 3) {
                    ZoneAddress zoneAddress3 = (ZoneAddress) this.L$9;
                    uu30 uu30Var3 = (uu30) this.L$3;
                    i iVar4 = (i) this.L$2;
                    g050Var3 = (g050) this.L$1;
                    try {
                        kotlin.b.b(obj);
                        iVar2 = iVar4;
                        uu30Var2 = uu30Var3;
                        zoneAddress = zoneAddress3;
                        k = obj;
                        list = (List) k;
                        if (zoneAddress != null || list.size() != uu30Var2.b.size()) {
                            hst hstVar2 = jst.e;
                            boolean z2 = zoneAddress == null;
                            if (list.size() == uu30Var2.b.size()) {
                                z = false;
                            }
                            xby.l(hstVar2, "Transport.AddressSyncError", null, null, "Addresses sync error. Source update valid = " + z2 + " destination = " + z, 6);
                            g050Var3.d(null);
                            return zy11.a;
                        }
                        iVar2.c.getClass();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        SyncRouteInteractor$syncTaxiAddressesInternal$2$1$1 syncRouteInteractor$syncTaxiAddressesInternal$2$1$1 = new SyncRouteInteractor$syncTaxiAddressesInternal$2$1$1(iVar2, zoneAddress, list, null);
                        this.L$0 = null;
                        this.L$1 = g050Var3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.label = 4;
                        if (tje.k0(g6uVar, syncRouteInteractor$syncTaxiAddressesInternal$2$1$1, this) != coroutineSingletons) {
                            g050Var = g050Var3;
                            g050Var3 = g050Var;
                            g050Var3.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var = g050Var3;
                    }
                } else {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) this.L$1;
                    try {
                        kotlin.b.b(obj);
                        g050Var3 = g050Var;
                        g050Var3.d(null);
                        return zy11.a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                g050Var.d(null);
                throw th;
            }
            iVar = (i) this.L$2;
            g050Var2 = (g050) this.L$1;
            kotlin.b.b(obj);
        }
        uu30 a = iVar.b.a();
        d0l0 c = iVar.a.c();
        qoh h2 = tje.h(tseVar, null, null, new SyncRouteInteractor$syncTaxiAddressesInternal$2$1$sourceDeferred$1(a.a, iVar, c.a, null), 3);
        h = tje.h(tseVar, null, null, new SyncRouteInteractor$syncTaxiAddressesInternal$2$1$destinationsDeferred$1(a, c, null, iVar), 3);
        this.L$0 = null;
        this.L$1 = g050Var2;
        this.L$2 = iVar;
        this.L$3 = a;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = h;
        this.label = 2;
        s = h2.s(this);
        if (s == coroutineSingletons) {
            return coroutineSingletons;
        }
        iVar2 = iVar;
        uu30Var = a;
        ZoneAddress zoneAddress22 = (ZoneAddress) s;
        this.L$0 = null;
        this.L$1 = g050Var2;
        this.L$2 = iVar2;
        this.L$3 = uu30Var;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.L$9 = zoneAddress22;
        this.label = 3;
        k = h.k(this);
        if (k != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
