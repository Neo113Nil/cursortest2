package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aij;
import defpackage.bm5;
import defpackage.c5b;
import defpackage.cjj;
import defpackage.dij;
import defpackage.e3s;
import defpackage.etn;
import defpackage.fjj;
import defpackage.fm5;
import defpackage.gij;
import defpackage.jij;
import defpackage.jto;
import defpackage.klx;
import defpackage.leu;
import defpackage.lm5;
import defpackage.r0n;
import defpackage.sto;
import defpackage.suh;
import defpackage.uif;
import defpackage.up6;
import defpackage.uvg;
import defpackage.vij;
import defpackage.vnc;
import defpackage.wif;
import defpackage.xh2;
import defpackage.y5g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.di.CastModule$Companion$provideCombinedCastDeviceManager$1;

/* loaded from: classes5.dex */
public final class P0 implements InterfaceC1305z0 {

    @NotNull
    public final LinkedHashMap a;

    @NotNull
    public final CastModule$Companion$provideCombinedCastDeviceManager$1 b;

    @NotNull
    public final F0 c;

    @NotNull
    public final G0 d;

    @NotNull
    public volatile List<InterfaceC1305z0.a> e;

    @NotNull
    public final r0n f;
    public final aij g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/P0$a;", "", "", "REFCOUNT_TIMEOUT_SEC", "J", "", "TAG", "Ljava/lang/String;", "android_cast_connectivitymobile_combined"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b extends uif implements Function1<Throwable, Unit> {
        public final /* synthetic */ InterfaceC1305z0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1305z0.a aVar) {
            super(1);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            G0 g0 = P0.this.d;
            th.getClass();
            InterfaceC1305z0.a aVar = this.b;
            g0.onAvailableDevicesError(th, aVar.c, aVar.f);
            return Unit.a;
        }
    }

    static {
        new a(null);
    }

    public P0(@NotNull LinkedHashMap linkedHashMap, @NotNull CastModule$Companion$provideCombinedCastDeviceManager$1 castModule$Companion$provideCombinedCastDeviceManager$1, @NotNull F0 f0, @NotNull G0 g0) {
        linkedHashMap.getClass();
        castModule$Companion$provideCombinedCastDeviceManager$1.getClass();
        f0.getClass();
        g0.getClass();
        this.a = linkedHashMap;
        this.b = castModule$Companion$provideCombinedCastDeviceManager$1;
        this.c = f0;
        this.d = g0;
        this.e = c5b.a;
        this.f = new r0n();
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1305z0) ((Map.Entry) it.next()).getValue()).b());
        }
        xh2 xh2Var = new xh2(Q0.a, 1);
        int i = vnc.a;
        up6.U(i, "bufferSize");
        jij jijVar = new jij(new dij(arrayList, xh2Var, i << 1), new uvg(19, new R0(this)), 0);
        up6.U(1, "bufferSize");
        klx klxVar = new klx(28);
        AtomicReference atomicReference = new AtomicReference();
        fjj fjjVar = new fjj(new cjj(atomicReference, klxVar), jijVar, atomicReference, klxVar);
        jto jtoVar = sto.a;
        up6.U(1, "subscriberCount");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        up6.L(timeUnit, "unit is null");
        up6.L(jtoVar, "scheduler is null");
        this.g = new vij(fjjVar, 30L, timeUnit, jtoVar);
        r0n r0nVar = this.f;
        r0nVar.getClass();
        try {
            r0nVar.a(new gij(new wif(new uvg(20, new O0(this)))));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            leu.a0(th);
            y5g.g0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public static final List c(Function1 function1, Object obj) {
        obj.getClass();
        return (List) function1.invoke(obj);
    }

    public static final void d(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final bm5 a(@NotNull InterfaceC1305z0.a aVar) {
        lm5 lm5Var;
        bm5 a2;
        aVar.getClass();
        F8.a(this.c, "CombinedCastDevicesManager", "connect", new Object[]{"castDeviceInfo = " + aVar}, 4);
        a();
        InterfaceC1305z0 interfaceC1305z0 = (InterfaceC1305z0) this.a.get(aVar.a());
        if (interfaceC1305z0 == null || (a2 = interfaceC1305z0.a(aVar)) == null) {
            lm5Var = null;
        } else {
            suh suhVar = new suh(6, this, aVar);
            e3s e3sVar = etn.r;
            lm5Var = new lm5(new lm5(a2, e3sVar, e3sVar, suhVar), e3sVar, new uvg(18, new b(aVar)), etn.q);
        }
        return lm5Var == null ? new fm5(1, new InterfaceC1305z0.e(null, 1, null)) : lm5Var;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final aij b() {
        F8.a(this.c, "CombinedCastDevicesManager", "discovery", new Object[0], 4);
        aij aijVar = this.g;
        aijVar.getClass();
        return aijVar;
    }

    public static final void b(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void a(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void a(P0 p0, InterfaceC1305z0.a aVar) {
        p0.d.onDeviceConnected(aVar.c, aVar.f);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    public final void a() {
        Object obj;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC1305z0.a) obj).e == InterfaceC1305z0.d.Connected) {
                    break;
                }
            }
        }
        InterfaceC1305z0.a aVar = (InterfaceC1305z0.a) obj;
        if (aVar != null) {
            this.d.onDeviceDisconnected(aVar.c, aVar.f);
        }
        F8.a(this.c, "CombinedCastDevicesManager", "disconnect", new Object[0], 4);
        Iterator it2 = this.a.entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1305z0) ((Map.Entry) it2.next()).getValue()).a();
        }
    }
}
