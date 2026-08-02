package ru.kinopoisk.sdk.easylogin.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.gms.cast.CastDevice;
import defpackage.a4g;
import defpackage.aij;
import defpackage.aur;
import defpackage.bm5;
import defpackage.cg6;
import defpackage.clc;
import defpackage.crh;
import defpackage.erh;
import defpackage.fb7;
import defpackage.fm5;
import defpackage.g3a;
import defpackage.gkq;
import defpackage.gld;
import defpackage.gsd;
import defpackage.hdr;
import defpackage.hrh;
import defpackage.irh;
import defpackage.jj4;
import defpackage.jmp;
import defpackage.ka8;
import defpackage.krh;
import defpackage.mi0;
import defpackage.nkp;
import defpackage.nm6;
import defpackage.o64;
import defpackage.oi3;
import defpackage.om5;
import defpackage.p84;
import defpackage.pjc;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.tf6;
import defpackage.u0q;
import defpackage.ub7;
import defpackage.uif;
import defpackage.up6;
import defpackage.v5g;
import defpackage.v75;
import defpackage.veh;
import defpackage.vwb;
import defpackage.vx7;
import defpackage.we7;
import defpackage.x0q;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.y1g;
import defpackage.zeh;
import defpackage.zsd;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class F4 implements InterfaceC1305z0 {
    public static final /* synthetic */ int h = 0;

    @NotNull
    public final Context a;

    @NotNull
    public final F0 b;

    @NotNull
    public final LinkedHashMap c;

    @NotNull
    public final krh d;

    @NotNull
    public final crh e;

    @NotNull
    public final xpi f;

    @NotNull
    public final u0q g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/F4$a;", "", "", "TAG", "Ljava/lang/String;", "UNKNOWN_MODEL", "android_cast_connectivitymobile_googlecast"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b {

        @NotNull
        public final String a;

        @NotNull
        public final InetAddress b;

        public b(@NotNull String str, @NotNull InetAddress inetAddress) {
            str.getClass();
            inetAddress.getClass();
            this.a = str;
            this.b = inetAddress;
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
            return "GoogleCastDeviceInfo(id=" + this.a + ", inetAddress=" + this.b + ")";
        }
    }

    public final class c extends erh {
        public c() {
        }

        @Override // defpackage.erh
        public final void onProviderAdded(@NotNull krh krhVar, @NotNull hrh hrhVar) {
            krhVar.getClass();
            hrhVar.getClass();
            F8.a(F4.this.b, "GoogleCastDevicesManager", "onProviderAdded", new Object[]{"providerInfo=" + hrhVar}, 4);
            F4.this.f.a(F4.this.c());
        }

        @Override // defpackage.erh
        public final void onProviderChanged(@NotNull krh krhVar, @NotNull hrh hrhVar) {
            krhVar.getClass();
            hrhVar.getClass();
            F8.a(F4.this.b, "GoogleCastDevicesManager", "onProviderChanged", new Object[]{"providerInfo=" + hrhVar}, 4);
            F4.this.f.a(F4.this.c());
        }

        @Override // defpackage.erh
        public final void onProviderRemoved(@NotNull krh krhVar, @NotNull hrh hrhVar) {
            krhVar.getClass();
            hrhVar.getClass();
            F8.a(F4.this.b, "GoogleCastDevicesManager", "onProviderRemoved", new Object[]{"providerInfo=" + hrhVar}, 4);
            F4.this.f.a(F4.this.c());
        }

        @Override // defpackage.erh
        public final void onRouteAdded(@NotNull krh krhVar, @NotNull irh irhVar) {
            krhVar.getClass();
            irhVar.getClass();
            F8.a(F4.this.b, "GoogleCastDevicesManager", "onRouteAdded", new Object[]{"routeInfo=" + irhVar}, 4);
            F4.this.f.a(F4.this.c());
        }

        @Override // defpackage.erh
        public final void onRouteChanged(@NotNull krh krhVar, @NotNull irh irhVar) {
            krhVar.getClass();
            irhVar.getClass();
            F8.a(F4.this.b, "GoogleCastDevicesManager", "onRouteChanged", new Object[]{"routeInfo=" + irhVar}, 4);
            F4.this.f.a(F4.this.c());
        }

        @Override // defpackage.erh
        public final void onRouteRemoved(@NotNull krh krhVar, @NotNull irh irhVar) {
            krhVar.getClass();
            irhVar.getClass();
            F8.a(F4.this.b, "GoogleCastDevicesManager", "onRouteRemoved", new Object[]{"routeInfo=" + irhVar}, 4);
            F4.this.f.a(F4.this.c());
        }

        @Override // defpackage.erh
        @vx7
        public final void onRouteSelected(@NotNull krh krhVar, @NotNull irh irhVar) {
            krhVar.getClass();
            irhVar.getClass();
            F8.a(F4.this.b, "GoogleCastDevicesManager", "onRouteSelected", new Object[]{"routeInfo=" + irhVar}, 4);
            F4.this.f.a(F4.this.c());
        }

        @Override // defpackage.erh
        @vx7
        public final void onRouteUnselected(@NotNull krh krhVar, @NotNull irh irhVar) {
            krhVar.getClass();
            irhVar.getClass();
            F8.a(F4.this.b, "GoogleCastDevicesManager", "onRouteUnselected", new Object[]{"routeInfo=" + irhVar}, 4);
            F4.this.f.a(F4.this.c());
        }
    }

    public static final class d<V> implements Callable {
        public static final d<V> a = new d<>();

        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw new InterfaceC1305z0.e(null, 1, null);
        }
    }

    public static final class e extends uif implements Function1<irh, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            irh irhVar = (irh) obj;
            irhVar.getClass();
            F4.this.d.getClass();
            krh.j(irhVar);
            return Unit.a;
        }
    }

    public static final class f extends uif implements Function1<ka8, Unit> {
        public final /* synthetic */ InterfaceC1305z0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC1305z0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final void a() {
            F4.this.b.a("GoogleCastDevicesManager", "start", "castDeviceInfo=" + this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a();
            return Unit.a;
        }
    }

    public static final class g extends uif implements Function1<Unit, Unit> {
        public final /* synthetic */ InterfaceC1305z0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC1305z0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final void a() {
            F4.this.b.a("GoogleCastDevicesManager", "Selected", "castDeviceInfo=" + this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a();
            return Unit.a;
        }
    }

    public static final class h extends uif implements Function1<Throwable, Unit> {
        public final /* synthetic */ InterfaceC1305z0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC1305z0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final void a(Throwable th) {
            F4.this.b.a("GoogleCastDevicesManager", "error", th, "castDeviceInfo=" + this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.cast.googlecast.GoogleCastDevicesManager$discoveryFlow$1", f = "GoogleCastDevicesManager.kt", l = {UibcKeyCode.TV_KEYCODE_8}, m = "invokeSuspend")
    public static final class i extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = F4.this.new i(continuation);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            i iVar = F4.this.new i((Continuation) obj2);
            iVar.b = (rjc) obj;
            return iVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                rjc rjcVar = (rjc) this.b;
                F0 f0 = F4.this.b;
                f0.getClass();
                f0.a(C1121l6.a.b.b, "GoogleCastDevicesManager", "Discovery start", (Throwable) null, new Object[0]);
                ArrayList c = F4.this.c();
                this.a = 1;
                if (rjcVar.emit(c, this) == nm6Var) {
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

    @we7(c = "ru.kinopoisk.cast.googlecast.GoogleCastDevicesManager$discoveryFlow$3", f = "GoogleCastDevicesManager.kt", l = {}, m = "invokeSuspend")
    public static final class j extends aur implements Function2<List<? extends InterfaceC1305z0.a>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = F4.this.new j(continuation);
            jVar.a = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            j jVar = F4.this.new j((Continuation) obj2);
            jVar.a = (List) obj;
            return jVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            List list = (List) this.a;
            F4.this.b.a("GoogleCastDevicesManager", "Cast devices updated", "foundCastDevices=" + list);
            return Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.cast.googlecast.GoogleCastDevicesManager$discoveryFlow$4", f = "GoogleCastDevicesManager.kt", l = {}, m = "invokeSuspend")
    public static final class k extends aur implements pyc {
        public /* synthetic */ Throwable a;

        public k(Continuation<? super k> continuation) {
            super(3, continuation);
        }

        @Override // defpackage.pyc
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            k kVar = F4.this.new k((Continuation) obj3);
            kVar.a = (Throwable) obj2;
            return kVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            Throwable th = this.a;
            F0 f0 = F4.this.b;
            f0.getClass();
            f0.a(C1121l6.a.C0039a.b, "GoogleCastDevicesManager", "Discovery failed", th, new Object[0]);
            return Unit.a;
        }
    }

    public static final class l implements pjc {
        public final /* synthetic */ pjc a;
        public final /* synthetic */ F4 b;

        public static final class a<T> implements rjc {
            public final /* synthetic */ rjc a;
            public final /* synthetic */ F4 b;

            @we7(c = "ru.kinopoisk.cast.googlecast.GoogleCastDevicesManager$special$$inlined$map$1$2", f = "GoogleCastDevicesManager.kt", l = {50}, m = "emit")
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.F4$l$a$a, reason: collision with other inner class name */
            public static final class C0025a extends cg6 {
                public /* synthetic */ Object a;
                public int b;

                public C0025a(Continuation continuation) {
                    super(continuation);
                }

                @Override // defpackage.kq2
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(rjc rjcVar, F4 f4) {
                this.a = rjcVar;
                this.b = f4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x0179 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v19 */
            /* JADX WARN: Type inference failed for: r5v20 */
            /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v31 */
            /* JADX WARN: Type inference failed for: r5v32 */
            @Override // defpackage.rjc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0025a c0025a;
                int i;
                InterfaceC1305z0.d dVar;
                Object obj2;
                Iterator it;
                Object obj3;
                CastDevice e;
                CastDevice d;
                String str;
                a<T> aVar = this;
                if (continuation instanceof C0025a) {
                    c0025a = (C0025a) continuation;
                    int i2 = c0025a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0025a.b = i2 - Integer.MIN_VALUE;
                        Object obj4 = c0025a.a;
                        nm6 nm6Var = nm6.a;
                        i = c0025a.b;
                        p84 p84Var = null;
                        int i3 = 1;
                        if (i != 0) {
                            qgg.h0(obj4);
                            rjc rjcVar = aVar.a;
                            F4 f4 = aVar.b;
                            int i4 = F4.h;
                            f4.getClass();
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList = new ArrayList();
                            for (T t : (List) obj) {
                                irh irhVar = (irh) t;
                                String str2 = irhVar.c;
                                str2.getClass();
                                String flattenToShortString = ((ComponentName) irhVar.a.d.b).flattenToShortString();
                                flattenToShortString.getClass();
                                if (hashSet.add(StringsKt.Y(str2, flattenToShortString))) {
                                    arrayList.add(t);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                irh irhVar2 = (irh) it2.next();
                                F4 f42 = aVar.b;
                                f42.getClass();
                                String str3 = irhVar2.c;
                                str3.getClass();
                                String str4 = irhVar2.d;
                                str4.getClass();
                                InterfaceC1305z0.c cVar = InterfaceC1305z0.c.GoogleCast;
                                InterfaceC1305z0.b bVar = irhVar2.n == i3 ? InterfaceC1305z0.b.AndroidTv : InterfaceC1305z0.b.Unknown;
                                f42.d.getClass();
                                irh g = krh.g();
                                CastDevice castDevice = p84Var;
                                f42.d.getClass();
                                krh.b();
                                irh irhVar3 = krh.c().v;
                                if (irhVar3 == null) {
                                    xq0.q("There is no default route.  The media router has not yet been fully initialized.");
                                    return castDevice;
                                }
                                if (Intrinsics.d(g, irhVar3)) {
                                    dVar = InterfaceC1305z0.d.Disconnected;
                                } else {
                                    int i5 = irhVar2.i;
                                    dVar = i5 != i3 ? i5 != 2 ? InterfaceC1305z0.d.Disconnected : InterfaceC1305z0.d.Connected : InterfaceC1305z0.d.Connecting;
                                }
                                InterfaceC1305z0.d dVar2 = dVar;
                                str3.getClass();
                                int V = StringsKt.V(6, str3, StringUtils.PROCESS_POSTFIX_DELIMITER);
                                String substring = V == -1 ? str3 : str3.substring(V + i3, str3.length());
                                if (f42.c.containsKey(substring)) {
                                    str = (String) f42.c.get(substring);
                                } else {
                                    o64 a = o64.a(f42.a);
                                    a.getClass();
                                    y1g.B("Must be called from the main thread.");
                                    jmp jmpVar = a.b;
                                    jmpVar.getClass();
                                    y1g.B("Must be called from the main thread.");
                                    nkp c = jmpVar.c();
                                    p84 p84Var2 = (c == null || !(c instanceof p84)) ? castDevice : (p84) c;
                                    if (p84Var2 != null && (d = p84Var2.d()) != null) {
                                        if (!substring.equals(d.d())) {
                                            d = castDevice;
                                        }
                                        if (d != null) {
                                            obj2 = d.e;
                                            it = f42.c().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj3 = castDevice;
                                                    break;
                                                }
                                                obj3 = it.next();
                                                if (Intrinsics.d(((irh) obj3).c, str3)) {
                                                    break;
                                                }
                                            }
                                            irh irhVar4 = (irh) obj3;
                                            Object obj5 = (irhVar4 != null || (e = CastDevice.e(irhVar4.s)) == null) ? castDevice : e.e;
                                            if (obj2 == null) {
                                                obj2 = obj5;
                                            }
                                            str = obj2 == null ? (String) f42.c.put(substring, obj2) : castDevice;
                                        }
                                    }
                                    obj2 = castDevice;
                                    it = f42.c().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                        }
                                    }
                                    irh irhVar42 = (irh) obj3;
                                    if (irhVar42 != null) {
                                    }
                                    if (obj2 == null) {
                                    }
                                    if (obj2 == null) {
                                    }
                                }
                                if (str == null) {
                                    str = "Unknown";
                                }
                                arrayList2.add(new InterfaceC1305z0.a(str3, str4, cVar, bVar, dVar2, str));
                                aVar = this;
                                p84Var = castDevice;
                                i3 = 1;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                if (((InterfaceC1305z0.a) next).d != InterfaceC1305z0.b.Unknown) {
                                    arrayList3.add(next);
                                }
                            }
                            c0025a.b = 1;
                            if (rjcVar.emit(arrayList3, c0025a) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj4);
                        }
                        return Unit.a;
                    }
                }
                c0025a = aVar.new C0025a(continuation);
                Object obj42 = c0025a.a;
                nm6 nm6Var2 = nm6.a;
                i = c0025a.b;
                p84 p84Var3 = null;
                int i32 = 1;
                if (i != 0) {
                }
                return Unit.a;
            }
        }

        public l(pjc pjcVar, F4 f4) {
            this.a = pjcVar;
            this.b = f4;
        }

        @Override // defpackage.pjc
        public final Object collect(rjc rjcVar, Continuation continuation) {
            Object collect = this.a.collect(new a(rjcVar, this.b), continuation);
            return collect == nm6.a ? collect : Unit.a;
        }
    }

    static {
        new a(null);
    }

    public F4(@NotNull Context context, @NotNull H4 h4, @NotNull F0 f0, @NotNull Q2 q2) {
        context.getClass();
        h4.getClass();
        f0.getClass();
        q2.getClass();
        this.a = context;
        this.b = f0;
        this.c = new LinkedHashMap();
        krh d2 = krh.d(context);
        this.d = d2;
        String J = vwb.J(h4.a());
        ArrayList<String> arrayList = new ArrayList<>();
        if (!arrayList.contains(J)) {
            arrayList.add(J);
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", arrayList);
        crh crhVar = new crh(bundle, arrayList);
        this.e = crhVar;
        c cVar = new c();
        tf6 e2 = gld.e(kotlin.coroutines.e.c(a4g.n(), q2.b().plus(new C1187q2("GoogleCastDevicesManager"))));
        x0q b2 = y0q.b(0, 1, oi3.b, 1);
        this.f = b2;
        this.g = zsd.D0(new clc(new ub7(12, zsd.b0(new l(new clc(b2, new i(null)), this)), new j(null)), new k(null)), e2, new hdr(0L, Long.MAX_VALUE));
        try {
            o64.a(context);
            d2.a(crhVar, cVar, 4);
            f0.a(C1121l6.a.c.b, "GoogleCastDevicesManager", "GoogleCast initialized", (Throwable) null, new Object[0]);
        } catch (Throwable th) {
            F0 f02 = this.b;
            f02.getClass();
            f02.a(C1121l6.a.C0039a.b, "GoogleCastDevicesManager", "Failed at initialize GoogleCast", th, new Object[0]);
        }
    }

    public static final void d(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final bm5 a(@NotNull InterfaceC1305z0.a aVar) {
        aVar.getClass();
        veh vehVar = new veh(new fb7(1, this, aVar));
        d<V> dVar = d.a;
        up6.L(dVar, "callable is null");
        fm5 fm5Var = new fm5(3, new zeh(1, new zeh(3, new zeh(2, new zeh(4, new zeh(0, vehVar, new gkq(dVar)), new g3a(10, new e())), new g3a(11, new f(aVar))), new g3a(12, new g(aVar))), new g3a(13, new h(aVar))));
        gsd gsdVar = mi0.a;
        if (gsdVar != null) {
            return new om5(0, fm5Var, gsdVar);
        }
        jj4.j("scheduler == null");
        return null;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final aij b() {
        return v5g.t(this.g);
    }

    public final ArrayList c() {
        this.d.getClass();
        ArrayList f2 = krh.f();
        f2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = f2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((irh) next).h(this.e)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final void b(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final irh a(F4 f4, InterfaceC1305z0.a aVar) {
        Object obj;
        Iterator it = f4.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((irh) obj).c, aVar.a)) {
                break;
            }
        }
        return (irh) obj;
    }

    public static final Unit a(Function1 function1, Object obj) {
        obj.getClass();
        return (Unit) function1.invoke(obj);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    public final void a() {
        F8.a(this.b, "GoogleCastDevicesManager", "disconnect", new Object[0], 4);
        this.d.getClass();
        krh.k(1);
    }

    public final b a(@NotNull String str) {
        Object obj;
        CastDevice e2;
        str.getClass();
        Iterator it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((irh) obj).c, str)) {
                break;
            }
        }
        irh irhVar = (irh) obj;
        if (irhVar == null || (e2 = CastDevice.e(irhVar.s)) == null) {
            return null;
        }
        InetAddress inetAddress = e2.c;
        inetAddress.getClass();
        return new b(str, inetAddress);
    }
}
