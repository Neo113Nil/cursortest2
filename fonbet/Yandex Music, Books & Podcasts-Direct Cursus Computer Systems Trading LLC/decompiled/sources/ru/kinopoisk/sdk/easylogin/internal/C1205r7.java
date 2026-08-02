package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a4g;
import defpackage.aur;
import defpackage.c5b;
import defpackage.clc;
import defpackage.gld;
import defpackage.ltm;
import defpackage.mm6;
import defpackage.mu7;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.pjc;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.r2f;
import defpackage.ryc;
import defpackage.t75;
import defpackage.ub7;
import defpackage.uif;
import defpackage.v75;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.y7g;
import defpackage.zsd;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.Q6;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1205r7 implements InterfaceC1192q7 {
    public static final /* synthetic */ int i = 0;

    @NotNull
    public final O6 a;

    @NotNull
    public final C1108k7 b;

    @NotNull
    public final C1247u7 c;

    @NotNull
    public final S6 d;

    @NotNull
    public final V6 e;

    @NotNull
    public final C1178p7 f;

    @NotNull
    public final mm6 g;

    @NotNull
    public final Map<String, b> h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/r7$a;", "", "", "TAG", "Ljava/lang/String;", "libs_android_pairing_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7$b */
    public static final class b {

        @NotNull
        public final C1260v7 a;

        @NotNull
        public final C1164o7 b;

        public b(@NotNull C1260v7 c1260v7, @NotNull C1164o7 c1164o7) {
            c1260v7.getClass();
            c1164o7.getClass();
            this.a = c1260v7;
            this.b = c1164o7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "DeviceServiceInfo(serviceInfo=" + this.a + ", device=" + this.b + ")";
        }
    }

    @we7(c = "ru.kinopoisk.pairing.PairingManagerImpl$discover$1", f = "PairingManagerImpl.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7$c */
    public static final class c extends aur implements Function2<ltm, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7$c$a */
        public static final class a extends uif implements Function0<Unit> {
            public final /* synthetic */ r2f a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r2f r2fVar) {
                super(0);
                this.a = r2fVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Timber.INSTANCE.tag("PairingManager").d("discovery onClose", new Object[0]);
                this.a.g(null);
                return Unit.a;
            }
        }

        @we7(c = "ru.kinopoisk.pairing.PairingManagerImpl$discover$1$job$1", f = "PairingManagerImpl.kt", l = {63}, m = "invokeSuspend")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7$c$b */
        public static final class b extends aur implements Function2<Q6, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ C1205r7 c;
            public final /* synthetic */ LinkedHashMap d;
            public final /* synthetic */ ltm e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C1205r7 c1205r7, LinkedHashMap linkedHashMap, ltm ltmVar, Continuation continuation) {
                super(2, continuation);
                this.c = c1205r7;
                this.d = linkedHashMap;
                this.e = ltmVar;
            }

            @Override // defpackage.kq2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.c, this.d, this.e, continuation);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((b) create((Q6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                nm6 nm6Var = nm6.a;
                int i = this.a;
                if (i == 0) {
                    qgg.h0(obj);
                    Q6 q6 = (Q6) this.b;
                    Timber.INSTANCE.tag("PairingManager").d("discovery state: %s", q6);
                    if (q6 instanceof Q6.d) {
                        C1205r7 c1205r7 = this.c;
                        LinkedHashMap linkedHashMap = this.d;
                        int i2 = C1205r7.i;
                        c1205r7.getClass();
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((mu7) it.next()).g(null);
                        }
                        linkedHashMap.clear();
                        c1205r7.h.clear();
                    } else if (q6 instanceof Q6.e) {
                        C1205r7 c1205r72 = this.c;
                        mm6 mm6Var = this.e;
                        LinkedHashMap linkedHashMap2 = this.d;
                        int i3 = C1205r7.i;
                        c1205r72.getClass();
                        Iterator it2 = linkedHashMap2.values().iterator();
                        while (it2.hasNext()) {
                            ((mu7) it2.next()).g(null);
                        }
                        linkedHashMap2.clear();
                        c1205r72.h.clear();
                        ((oc4) mm6Var).c(c5b.a);
                    } else if (q6 instanceof Q6.a) {
                        C1205r7 c1205r73 = this.c;
                        ltm ltmVar = this.e;
                        LinkedHashMap linkedHashMap3 = this.d;
                        int i4 = C1205r7.i;
                        c1205r73.a(ltmVar, linkedHashMap3, q6);
                    } else if (q6 instanceof Q6.c) {
                        C1205r7.a(this.c, this.e, this.d, (Q6.c) q6);
                    } else if (q6 instanceof Q6.b) {
                        this.a = 1;
                        if (C1205r7.a(this.c, this.e, this.d, (Q6.b) q6, this) == nm6Var) {
                            return nm6Var;
                        }
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

        @we7(c = "ru.kinopoisk.pairing.PairingManagerImpl$discover$1$job$2", f = "PairingManagerImpl.kt", l = {RemoteCameraConfig.Camera.JPEG_QUALITY_70}, m = "invokeSuspend")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7$c$c, reason: collision with other inner class name */
        public static final class C0041c extends aur implements ryc {
            public int a;
            public int b;
            public /* synthetic */ Throwable c;
            public /* synthetic */ long d;
            public final /* synthetic */ C1205r7 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0041c(C1205r7 c1205r7, Continuation<? super C0041c> continuation) {
                super(4, continuation);
                this.e = c1205r7;
            }

            @Override // defpackage.ryc
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                long longValue = ((Number) obj3).longValue();
                C0041c c0041c = new C0041c(this.e, (Continuation) obj4);
                c0041c.c = (Throwable) obj2;
                c0041c.d = longValue;
                return c0041c.invokeSuspend(Unit.a);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                int i;
                nm6 nm6Var = nm6.a;
                int i2 = this.b;
                if (i2 == 0) {
                    qgg.h0(obj);
                    Throwable th = this.c;
                    long j = this.d;
                    Timber.INSTANCE.tag("PairingManager").e(th, "discovery, try retry, [attempt=%s]", new Long(j));
                    C1108k7 c1108k7 = this.e.b;
                    int i3 = j < c1108k7.d ? 1 : 0;
                    if (i3 != 0) {
                        long j2 = c1108k7.e;
                        this.a = i3;
                        this.b = 1;
                        if (y2x.o(j2, this) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    i = i3;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.a;
                    qgg.h0(obj);
                }
                return Boolean.valueOf(i != 0);
            }
        }

        @we7(c = "ru.kinopoisk.pairing.PairingManagerImpl$discover$1$job$3", f = "PairingManagerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7$c$d */
        public static final class d extends aur implements pyc {
            public /* synthetic */ Throwable a;

            public d(Continuation<? super d> continuation) {
                super(3, continuation);
            }

            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                d dVar = new d((Continuation) obj3);
                dVar.a = (Throwable) obj2;
                return dVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                Timber.INSTANCE.tag("PairingManager").d(this.a, "discovery error", new Object[0]);
                return Unit.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C1205r7.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            c cVar = C1205r7.this.new c((Continuation) obj2);
            cVar.b = (ltm) obj;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                ltm ltmVar = (ltm) this.b;
                Timber.INSTANCE.tag("PairingManager").d("discovery start", new Object[0]);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1205r7 c1205r7 = C1205r7.this;
                S6 s6 = c1205r7.d;
                String str = c1205r7.c.b;
                s6.getClass();
                str.getClass();
                a aVar = new a(zsd.r0(C1205r7.this.g, new clc(new clc(new ub7(12, zsd.K(new T6(s6, str, null)), new b(C1205r7.this, linkedHashMap, ltmVar, null)), new C0041c(C1205r7.this, null)), new d(null))));
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

    @we7(c = "ru.kinopoisk.pairing.PairingManagerImpl$discover$2", f = "PairingManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.r7$d */
    public static final class d extends aur implements Function2<List<? extends C1164o7>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(continuation);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            d dVar = new d((Continuation) obj2);
            dVar.a = (List) obj;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            Timber.INSTANCE.tag("PairingManager").d("discovery state: %s", (List) this.a);
            return Unit.a;
        }
    }

    static {
        new a(null);
    }

    public C1205r7(@NotNull NsdManager nsdManager, @NotNull WifiManager wifiManager, @NotNull O6 o6, @NotNull C1108k7 c1108k7, @NotNull C1247u7 c1247u7, @NotNull kotlinx.coroutines.a aVar) {
        nsdManager.getClass();
        wifiManager.getClass();
        o6.getClass();
        c1108k7.getClass();
        c1247u7.getClass();
        aVar.getClass();
        this.a = o6;
        this.b = c1108k7;
        this.c = c1247u7;
        this.d = new S6(nsdManager, wifiManager);
        new U6(nsdManager, wifiManager);
        this.e = new V6(nsdManager, c1108k7);
        this.f = new C1178p7();
        this.g = gld.e(kotlin.coroutines.e.c(a4g.n(), aVar.plus(new C1187q2("PairingManager"))));
        Map<String, b> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        synchronizedMap.getClass();
        this.h = synchronizedMap;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1192q7
    public final C1136m7 a(@NotNull String str) {
        Object obj;
        Iterator<T> it = this.h.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((b) obj).b.a, str)) {
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar != null) {
            return new C1136m7(bVar.a, bVar.b);
        }
        throw new IllegalArgumentException(String.format("Device %s not found", Arrays.copyOf(new Object[]{str}, 1)).toString());
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1192q7
    @NotNull
    public final List<C1260v7> b() {
        Collection<b> values = this.h.values();
        ArrayList arrayList = new ArrayList(v75.o(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).a);
        }
        return CollectionsKt.w0(arrayList);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1192q7
    @NotNull
    public final pjc c() {
        return new ub7(12, zsd.K(new c(null)), new d(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(C1205r7 c1205r7, ltm ltmVar, LinkedHashMap linkedHashMap, Q6.c cVar) {
        c1205r7.getClass();
        String serviceName = cVar.a.getServiceName();
        mu7 mu7Var = (mu7) linkedHashMap.get(serviceName);
        if (mu7Var != null) {
            mu7Var.g(null);
        }
        serviceName.getClass();
        linkedHashMap.remove(serviceName);
        c1205r7.h.remove(serviceName);
        ((oc4) ltmVar).c(a(linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(C1205r7 c1205r7, ltm ltmVar, LinkedHashMap linkedHashMap, Q6.b bVar, c.b bVar2) {
        c1205r7.getClass();
        String serviceName = bVar.a.getServiceName();
        mu7 mu7Var = (mu7) linkedHashMap.get(serviceName);
        if (mu7Var != null && mu7Var.b()) {
            return Unit.a;
        }
        mu7 mu7Var2 = (mu7) linkedHashMap.get(serviceName);
        if (mu7Var2 != null) {
            mu7Var2.g(null);
        }
        Object V = x97.V(((defpackage.a6) ltmVar).c, new C1219s7(linkedHashMap, serviceName, c1205r7, bVar, ltmVar, null), bVar2);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1192q7
    @NotNull
    public final List<C1164o7> a() {
        Collection<b> values = this.h.values();
        ArrayList arrayList = new ArrayList(v75.o(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).b);
        }
        return CollectionsKt.w0(arrayList);
    }

    public final void a(ltm ltmVar, LinkedHashMap linkedHashMap, Q6 q6) {
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((mu7) it.next()).g(null);
        }
        linkedHashMap.clear();
        this.h.clear();
        gld.K(ltmVar, "Failed", new IllegalStateException("state: " + q6));
    }

    public static final List a(C1205r7 c1205r7, NsdServiceInfo nsdServiceInfo) {
        if (Build.VERSION.SDK_INT >= 34) {
            List<InetAddress> hostAddresses = nsdServiceInfo.getHostAddresses();
            hostAddresses.getClass();
            return hostAddresses;
        }
        return t75.c(nsdServiceInfo.getHost());
    }

    public static ArrayList a(LinkedHashMap linkedHashMap) {
        Collection values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((mu7) obj).X()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1164o7 c1164o7 = (C1164o7) ((mu7) it.next()).o();
            if (c1164o7 != null) {
                arrayList2.add(c1164o7);
            }
        }
        return arrayList2;
    }
}
