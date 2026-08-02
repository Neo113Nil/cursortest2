package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
import defpackage.gld;
import defpackage.ltm;
import defpackage.mm6;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.t75;
import defpackage.uif;
import defpackage.we7;
import defpackage.xq0;
import defpackage.y7g;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.M6;

/* loaded from: classes5.dex */
public final class P6 implements O6 {

    @NotNull
    public final Context a;

    @NotNull
    public final WifiManager b;

    @NotNull
    public final ConnectivityManager c;

    @we7(c = "ru.kinopoisk.network.state.NetworkStateProviderImpl$getNetworkConnectionState$1", f = "NetworkStateProviderImpl.kt", l = {UibcKeyCode.TV_KEYCODE_5}, m = "invokeSuspend")
    public static final class a extends aur implements Function2<ltm, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.P6$a$a, reason: collision with other inner class name */
        public static final class C0036a extends uif implements Function0<Unit> {
            public final /* synthetic */ P6 a;
            public final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0036a(P6 p6, b bVar) {
                super(0);
                this.a = p6;
                this.b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.a.c.unregisterNetworkCallback(this.b);
                return Unit.a;
            }
        }

        public static final class b extends ConnectivityManager.NetworkCallback {
            public final /* synthetic */ ltm a;
            public final /* synthetic */ P6 b;

            public b(ltm ltmVar, P6 p6) {
                this.a = ltmVar;
                this.b = p6;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                network.getClass();
                networkCapabilities.getClass();
                if (gld.T(this.a)) {
                    ((oc4) this.a).c(this.b.a(networkCapabilities));
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                network.getClass();
                if (gld.T(this.a)) {
                    ((oc4) this.a).c(new M6.b(P6.a(this.b.a)));
                }
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = P6.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            a aVar = P6.this.new a((Continuation) obj2);
            aVar.b = (ltm) obj;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            mm6 mm6Var;
            Throwable th;
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                ltm ltmVar = (ltm) this.b;
                try {
                    ((oc4) ltmVar).c(P6.this.b());
                    NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addTransportType(1).addTransportType(0).addTransportType(4).removeCapability(15);
                    b bVar = new b(ltmVar, P6.this);
                    P6.this.c.registerNetworkCallback(removeCapability.build(), bVar);
                    C0036a c0036a = new C0036a(P6.this, bVar);
                    this.b = ltmVar;
                    this.a = 1;
                    if (y7g.q(ltmVar, c0036a, this) == nm6Var) {
                        return nm6Var;
                    }
                } catch (Throwable th2) {
                    mm6Var = ltmVar;
                    th = th2;
                    ((oc4) mm6Var).p0(th);
                    return Unit.a;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mm6Var = (ltm) this.b;
                try {
                    qgg.h0(obj);
                } catch (Throwable th3) {
                    th = th3;
                    ((oc4) mm6Var).p0(th);
                    return Unit.a;
                }
            }
            return Unit.a;
        }
    }

    public P6(@NotNull Context context) {
        context.getClass();
        this.a = context;
        Object systemService = context.getSystemService("wifi");
        systemService.getClass();
        this.b = (WifiManager) systemService;
        Object systemService2 = context.getSystemService("connectivity");
        systemService2.getClass();
        this.c = (ConnectivityManager) systemService2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public final M6.a a(NetworkCapabilities networkCapabilities) {
        n8g b = t75.b();
        int i = 0;
        if (networkCapabilities.hasTransport(0)) {
            b.add(N6.Cellular);
        }
        if (networkCapabilities.hasTransport(1)) {
            b.add(N6.Wifi);
        }
        if (networkCapabilities.hasTransport(2)) {
            b.add(N6.Bluetooth);
        }
        if (networkCapabilities.hasTransport(3)) {
            b.add(N6.Ethernet);
        }
        if (networkCapabilities.hasTransport(4)) {
            b.add(N6.VPN);
        }
        if (networkCapabilities.hasTransport(5)) {
            b.add(N6.WifiAware);
        }
        if (networkCapabilities.hasTransport(6)) {
            b.add(N6.LoWPAN);
        }
        n8g a2 = t75.a(b);
        boolean isEmpty = a2.isEmpty();
        n8g n8gVar = a2;
        if (isEmpty) {
            n8gVar = t75.c(N6.Unknown);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            i = networkCapabilities.getSignalStrength();
        } else if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5) || networkCapabilities.hasTransport(6)) {
            i = this.b.getConnectionInfo().getRssi();
        }
        return new M6.a(n8gVar, i);
    }

    @NotNull
    public final M6 b() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.c.getActiveNetwork();
        return (activeNetwork == null || (networkCapabilities = this.c.getNetworkCapabilities(activeNetwork)) == null) ? new M6.b(a(this.a)) : a(networkCapabilities);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.O6
    @NotNull
    public final pjc a() {
        return zsd.K(new a(null));
    }

    public static boolean a(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }
}
