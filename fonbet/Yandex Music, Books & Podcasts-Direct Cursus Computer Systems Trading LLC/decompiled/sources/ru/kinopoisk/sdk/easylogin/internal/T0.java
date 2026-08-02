package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.afh;
import defpackage.aij;
import defpackage.bfh;
import defpackage.bm5;
import defpackage.bu3;
import defpackage.cfh;
import defpackage.cjj;
import defpackage.dm5;
import defpackage.e3s;
import defpackage.eij;
import defpackage.etn;
import defpackage.fij;
import defpackage.fjj;
import defpackage.fm5;
import defpackage.gij;
import defpackage.gsd;
import defpackage.h5n;
import defpackage.hij;
import defpackage.hjj;
import defpackage.jj4;
import defpackage.jto;
import defpackage.ka8;
import defpackage.klx;
import defpackage.kso;
import defpackage.leu;
import defpackage.lij;
import defpackage.lm5;
import defpackage.mi0;
import defpackage.mij;
import defpackage.mm5;
import defpackage.nij;
import defpackage.om5;
import defpackage.r0n;
import defpackage.ra8;
import defpackage.rij;
import defpackage.seh;
import defpackage.sto;
import defpackage.suh;
import defpackage.teh;
import defpackage.tn3;
import defpackage.uif;
import defpackage.up6;
import defpackage.veh;
import defpackage.vij;
import defpackage.vnc;
import defpackage.weh;
import defpackage.wif;
import defpackage.wt3;
import defpackage.wvo;
import defpackage.y5g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.D0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.T0;

/* loaded from: classes5.dex */
public final class T0 implements D0 {

    @NotNull
    public final LinkedHashMap a;

    @NotNull
    public final InterfaceC1305z0 b;

    @NotNull
    public final F0 c;

    @NotNull
    public final G0 d;
    public volatile InterfaceC1305z0.a e;

    @NotNull
    public final r0n f;

    @NotNull
    public final aij g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/T0$a;", "", "", "TAG", "Ljava/lang/String;", "android_cast_connectivitymobile_combined"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c extends uif implements Function1<D0, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            D0 d0 = (D0) obj;
            d0.getClass();
            d0.a();
            return Unit.a;
        }
    }

    public static final class d extends uif implements Function1<InterfaceC1305z0.a, Boolean> {
        public final /* synthetic */ List<InterfaceC1305z0.a> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<InterfaceC1305z0.a> list) {
            super(1);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            boolean z;
            InterfaceC1305z0.a aVar = (InterfaceC1305z0.a) obj;
            aVar.getClass();
            List<InterfaceC1305z0.a> list = this.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((InterfaceC1305z0.a) it.next()).a, aVar.a)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    public static final class e extends uif implements Function1<InterfaceC1305z0.a, mm5> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            InterfaceC1305z0.a aVar = (InterfaceC1305z0.a) obj;
            aVar.getClass();
            return T0.this.b.a(aVar);
        }
    }

    public static final class f extends uif implements Function1<ka8, Unit> {
        public f() {
            super(1);
        }

        public final void a() {
            T0.this.c.a("CombinedCastPlayer", "reconnecting", "castDeviceInfo = " + T0.this.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a();
            return Unit.a;
        }
    }

    public static final class g extends uif implements Function1<Throwable, Unit> {
        public g() {
            super(1);
        }

        public final void a(Throwable th) {
            T0.this.c.a("CombinedCastPlayer", "failed reconnect", th, "castDeviceInfo = " + T0.this.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T0(@NotNull LinkedHashMap linkedHashMap, @NotNull InterfaceC1305z0 interfaceC1305z0, @NotNull F0 f0, @NotNull G0 g0) {
        aij rijVar;
        aij aijVar;
        linkedHashMap.getClass();
        interfaceC1305z0.getClass();
        f0.getClass();
        g0.getClass();
        this.a = linkedHashMap;
        this.b = interfaceC1305z0;
        this.c = f0;
        this.d = g0;
        r0n r0nVar = new r0n();
        this.f = new r0n();
        aij a2 = B0.a(interfaceC1305z0);
        gsd gsdVar = mi0.a;
        if (gsdVar == null) {
            jj4.j("scheduler == null");
            throw null;
        }
        a2.getClass();
        int i = vnc.a;
        up6.U(i, "bufferSize");
        hij hijVar = new hij(new rij(a2, gsdVar, i, 0));
        h5n h5nVar = new h5n(16, new X0(this));
        up6.U(i, "bufferSize");
        try {
            if (hijVar instanceof kso) {
                Object call = ((kso) hijVar).call();
                if (call == null) {
                    aijVar = nij.a;
                    up6.U(1, "bufferSize");
                    klx klxVar = new klx(28);
                    AtomicReference atomicReference = new AtomicReference();
                    this.g = new vij(new fjj(new cjj(atomicReference, klxVar), aijVar, atomicReference, klxVar), 0L, TimeUnit.NANOSECONDS, null);
                    r0nVar.a(new gij(new wif(new h5n(17, new S0(this)))));
                    return;
                }
                rijVar = new dm5(1, call, h5nVar);
            } else {
                rijVar = new rij(hijVar, h5nVar, i, 1);
            }
            r0nVar.a(new gij(new wif(new h5n(17, new S0(this)))));
            return;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            leu.a0(th);
            y5g.g0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
        aijVar = rijVar;
        up6.U(1, "bufferSize");
        klx klxVar2 = new klx(28);
        AtomicReference atomicReference2 = new AtomicReference();
        this.g = new vij(new fjj(new cjj(atomicReference2, klxVar2), aijVar, atomicReference2, klxVar2), 0L, TimeUnit.NANOSECONDS, null);
    }

    public static final void b(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final hjj d(Function1 function1, Object obj) {
        obj.getClass();
        return (hjj) function1.invoke(obj);
    }

    public static final void e(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void f(T0 t0) {
        t0.c.a("CombinedCastPlayer", "reconnected", "castDeviceInfo = " + t0.e);
    }

    public static final mm5 g(Function1 function1, Object obj) {
        obj.getClass();
        return (mm5) function1.invoke(obj);
    }

    public static final void h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void a(c cVar) {
        aij aijVar = this.g;
        aijVar.getClass();
        jto jtoVar = sto.a;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        up6.L(timeUnit, "unit is null");
        up6.L(jtoVar, "scheduler is null");
        long max = Math.max(0L, 1L);
        gsd gsdVar = mi0.a;
        if (gsdVar == null) {
            jj4.j("scheduler == null");
            return;
        }
        try {
            weh wehVar = new weh(new seh(new h5n(23, new U0(this, cVar)), new h5n(24, new V0(this))), gsdVar);
            try {
                afh afhVar = new afh(wehVar);
                wehVar.b(afhVar);
                bfh bfhVar = afhVar.b;
                up6.L(bfhVar, "observer is null");
                try {
                    cfh cfhVar = new cfh(bfhVar);
                    ra8.g(bfhVar, cfhVar);
                    ra8.e(cfhVar, jtoVar.c(cfhVar, max, timeUnit));
                    try {
                        aijVar.a(new lij(afhVar));
                    } catch (NullPointerException e2) {
                        throw e2;
                    } catch (Throwable th) {
                        throw new NullPointerException(r0);
                    }
                } catch (NullPointerException e3) {
                    throw e3;
                } catch (Throwable th2) {
                    throw new NullPointerException(r0);
                }
            } catch (NullPointerException e4) {
                throw e4;
            } catch (Throwable th22) {
                throw new NullPointerException(r0);
            }
        } catch (NullPointerException e5) {
            throw e5;
        } finally {
            leu.a0(th22);
            new NullPointerException("subscribeActual failed").initCause(th22);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/T0$b;", "", "<init>", "()V", "a", "b", "Lru/kinopoisk/sdk/easylogin/internal/T0$b$a;", "Lru/kinopoisk/sdk/easylogin/internal/T0$b$b;", "android_cast_connectivitymobile_combined"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static abstract class b {

        public static final class a extends b {

            @NotNull
            public final D0 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull InterfaceC1305z0.a aVar, @NotNull D0 d0) {
                super(null);
                aVar.getClass();
                d0.getClass();
                this.a = d0;
            }

            @NotNull
            public final D0 a() {
                return this.a;
            }
        }

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.T0$b$b, reason: collision with other inner class name */
        public static final class C0037b extends b {

            @NotNull
            public static final C0037b a = new C0037b();

            public C0037b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final InterfaceC1305z0.a e(T0 t0) {
        return t0.e;
    }

    public static final boolean f(Function1 function1, Object obj) {
        obj.getClass();
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void a(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.D0
    public final void a() {
        F8.a(this.c, "CombinedCastPlayer", "release", new Object[0], 4);
        a(c.a);
    }

    public final aij a(InterfaceC1305z0.c cVar) {
        return new fij(new suh(23, this, cVar));
    }

    public static final void a(final T0 t0, final InterfaceC1305z0.c cVar, mij mijVar) {
        mijVar.getClass();
        D0.a aVar = (D0.a) t0.a.get(cVar);
        final D0 a2 = aVar != null ? aVar.a() : null;
        F0 f0 = t0.c;
        if (a2 != null) {
            f0.a("CombinedCastPlayer", "castPlayer created", "castType = " + cVar);
            eij eijVar = (eij) mijVar;
            if (!eijVar.b()) {
                eijVar.a.onNext(a2);
            }
            ra8.f(eijVar, new bu3(new wt3() { // from class: h0s
                @Override // defpackage.wt3
                public final void cancel() {
                    T0.a(T0.this, cVar, a2);
                }
            }));
            return;
        }
        F8.a(f0, "CombinedCastPlayer", "createPlayerObservable", "not fount cast player factory", null, new Object[]{"castType = " + cVar}, 8);
        E7 e7 = new E7(null, 1, null);
        if (((eij) mijVar).d(e7)) {
            return;
        }
        y5g.g0(e7);
    }

    public static final void a(T0 t0, InterfaceC1305z0.c cVar, D0 d0) {
        t0.c.a("CombinedCastPlayer", "releasing player in cancellable", "castType = " + cVar);
        d0.a();
    }

    public final bm5 a(List<InterfaceC1305z0.a> list) {
        om5 om5Var = new om5(1, new teh(new veh(new tn3(3, this)), new h5n(18, new d(list))), new h5n(19, new e()));
        h5n h5nVar = new h5n(20, new f());
        e3s e3sVar = etn.r;
        wvo wvoVar = etn.q;
        return new fm5(4, new lm5(new lm5(new lm5(om5Var, h5nVar, e3sVar, wvoVar), e3sVar, e3sVar, new h5n(21, this)), e3sVar, new h5n(22, new g()), wvoVar));
    }
}
