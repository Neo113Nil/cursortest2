package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import defpackage.aur;
import defpackage.gld;
import defpackage.ltm;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.qgg;
import defpackage.uif;
import defpackage.we7;
import defpackage.xq0;
import defpackage.y7g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.Q6;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.pairing.nsd.NsdServiceDiscovery$discoveryState$1", f = "NsdServiceDiscovery.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class T6 extends aur implements Function2<ltm, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ S6 c;
    public final /* synthetic */ String d;

    public static final class a extends uif implements Function0<Unit> {
        public final /* synthetic */ S6 a;
        public final /* synthetic */ b b;
        public final /* synthetic */ WifiManager.MulticastLock c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(S6 s6, b bVar, WifiManager.MulticastLock multicastLock) {
            super(0);
            this.a = s6;
            this.b = bVar;
            this.c = multicastLock;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Timber.INSTANCE.tag("NsdServiceDiscovery").d("onClose", new Object[0]);
            this.a.a.stopServiceDiscovery(this.b);
            this.c.release();
            return Unit.a;
        }
    }

    public static final class b implements NsdManager.DiscoveryListener {
        public final /* synthetic */ ltm a;

        public b(ltm ltmVar) {
            this.a = ltmVar;
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onDiscoveryStarted(String str) {
            str.getClass();
            Timber.INSTANCE.tag("NsdServiceDiscovery").d("onDiscoveryStarted: [serviceType=%s]", str);
            ((oc4) this.a).c(new Q6.d(str));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onDiscoveryStopped(String str) {
            str.getClass();
            Timber.INSTANCE.tag("NsdServiceDiscovery").d("onDiscoveryStopped: [serviceType=%s]", str);
            ((oc4) this.a).c(new Q6.e(str));
            gld.L(this.a, null);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            nsdServiceInfo.getClass();
            Timber.INSTANCE.tag("NsdServiceDiscovery").d("onServiceFound: [serviceInfo=%s]", nsdServiceInfo);
            ((oc4) this.a).c(new Q6.b(nsdServiceInfo));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            nsdServiceInfo.getClass();
            Timber.INSTANCE.tag("NsdServiceDiscovery").d("onServiceLost: [serviceInfo=%s]", nsdServiceInfo);
            ((oc4) this.a).c(new Q6.c(nsdServiceInfo));
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onStartDiscoveryFailed(String str, int i) {
            str.getClass();
            Timber.INSTANCE.tag("NsdServiceDiscovery").d("onStartDiscoveryFailed: [serviceType=%s;errorCode=%s]", str, Integer.valueOf(i));
            ((oc4) this.a).c(new Q6.a(false, str, i));
            gld.L(this.a, null);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public final void onStopDiscoveryFailed(String str, int i) {
            str.getClass();
            Timber.INSTANCE.tag("NsdServiceDiscovery").d("onStopDiscoveryFailed: [serviceType=%s;errorCode=%s]", str, Integer.valueOf(i));
            ((oc4) this.a).c(new Q6.a(true, str, i));
            gld.L(this.a, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T6(S6 s6, String str, Continuation<? super T6> continuation) {
        super(2, continuation);
        this.c = s6;
        this.d = str;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        T6 t6 = new T6(this.c, this.d, continuation);
        t6.b = obj;
        return t6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T6) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        WifiManager wifiManager;
        NsdManager nsdManager;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            ltm ltmVar = (ltm) this.b;
            Timber.INSTANCE.tag("NsdServiceDiscovery").d("block channel", new Object[0]);
            b bVar = new b(ltmVar);
            wifiManager = this.c.b;
            WifiManager.MulticastLock createMulticastLock = wifiManager.createMulticastLock("PairingDiscoveryLock" + this.d);
            createMulticastLock.setReferenceCounted(true);
            createMulticastLock.acquire();
            nsdManager = this.c.a;
            nsdManager.discoverServices(this.d, 1, bVar);
            a aVar = new a(this.c, bVar, createMulticastLock);
            this.a = 1;
            if (y7g.q(ltmVar, aVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
