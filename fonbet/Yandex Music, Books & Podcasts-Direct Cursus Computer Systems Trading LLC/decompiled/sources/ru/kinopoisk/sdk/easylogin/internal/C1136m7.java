package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a4g;
import defpackage.arf;
import defpackage.aur;
import defpackage.bqi;
import defpackage.btf;
import defpackage.gld;
import defpackage.im6;
import defpackage.k5r;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.uif;
import defpackage.uob;
import defpackage.we7;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.kinopoisk.sdk.easylogin.internal.C1255v2;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1122l7;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.m7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1136m7 implements InterfaceC1122l7 {

    @NotNull
    public final C1260v7 a;

    @NotNull
    public final kotlinx.coroutines.d b;

    @NotNull
    public final mm6 c;

    @NotNull
    public final bqi d;

    @NotNull
    public final arf e;

    @NotNull
    public final e f;
    public volatile InterfaceC1122l7.a g;

    @we7(c = "ru.kinopoisk.pairing.PairingConnectionImpl$2", f = "PairingConnectionImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m7$a */
    public static final class a extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C1136m7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C1136m7.this.new a((Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            Object t7oVar;
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            C1255v2 c1255v2 = (C1255v2) C1136m7.this.e.getValue();
            C1136m7 c1136m7 = C1136m7.this;
            try {
                r7o r7oVar = z7o.b;
                Timber.INSTANCE.tag("PairingConnectionImpl").v("Connecting", new Object[0]);
                ((xdr) c1136m7.d).l(C1299y7.a);
                t7oVar = Boolean.valueOf(c1255v2.connectBlocking());
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            C1136m7 c1136m72 = C1136m7.this;
            if (!(t7oVar instanceof t7o)) {
                Timber.INSTANCE.tag("PairingConnectionImpl").v("Success", new Object[0]);
                ((xdr) c1136m72.d).l(C1286x7.a);
            }
            C1136m7 c1136m73 = C1136m7.this;
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.tag("PairingConnectionImpl").w(a, "Failed to connect", new Object[0]);
                bqi bqiVar = c1136m73.d;
                C1312z7 c1312z7 = new C1312z7(a);
                xdr xdrVar = (xdr) bqiVar;
                xdrVar.getClass();
                xdrVar.m(null, c1312z7);
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/m7$b;", "", "", "TAG", "Ljava/lang/String;", "libs_android_pairing_impl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m7$b */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m7$c */
    public static final class c extends uif implements Function0<C1255v2> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1255v2 invoke() {
            InetAddress inetAddress = (InetAddress) CollectionsKt.firstOrNull(C1136m7.this.a.a());
            return new C1255v2(k5r.l("ws://", C1136m7.this.a.b(), inetAddress != null ? inetAddress.getHostAddress() : null, StringUtils.PROCESS_POSTFIX_DELIMITER), C1136m7.this.f);
        }
    }

    @we7(c = "ru.kinopoisk.pairing.PairingConnectionImpl$close$1", f = "PairingConnectionImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m7$d */
    public static final class d extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C1136m7.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C1136m7.this.new d((Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            Object t7oVar;
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            if (((C1255v2) C1136m7.this.e.getValue()).isOpen()) {
                C1255v2 c1255v2 = (C1255v2) C1136m7.this.e.getValue();
                try {
                    r7o r7oVar = z7o.b;
                    Timber.INSTANCE.v("Closing", new Object[0]);
                    c1255v2.closeBlocking();
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Timber.INSTANCE.tag("PairingConnectionImpl").w(a, "Failed to close connection", new Object[0]);
                }
                C1136m7 c1136m7 = C1136m7.this;
                if (!(t7oVar instanceof t7o)) {
                    Timber.INSTANCE.tag("PairingConnectionImpl").v("Closed", new Object[0]);
                    ((xdr) c1136m7.d).l(C1273w7.a);
                }
            }
            return Unit.a;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.m7$e */
    public static final class e implements C1255v2.c {
        public e() {
        }

        @Override // ru.kinopoisk.sdk.easylogin.internal.C1255v2.c
        public final void a(String str) {
            str.getClass();
            InterfaceC1122l7.a aVar = C1136m7.this.g;
            if (aVar != null) {
                aVar.a(new JSONObject(str));
            }
        }
    }

    static {
        new b(null);
    }

    public C1136m7(@NotNull C1260v7 c1260v7, @NotNull C1164o7 c1164o7) {
        c1260v7.getClass();
        c1164o7.getClass();
        this.a = c1260v7;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.getClass();
        uob uobVar = new uob(newSingleThreadExecutor);
        this.b = uobVar;
        tf6 e2 = gld.e(uobVar.plus(a4g.n()).plus(new im6("PairingConnectionImpl")));
        this.c = e2;
        this.d = ydr.a(C1273w7.a);
        this.e = btf.b(new c());
        this.f = new e();
        List<InetAddress> list = c1260v7.b;
        list.getClass();
        if (list instanceof Collection ? !list.isEmpty() : list.iterator().hasNext()) {
            x97.y(e2, null, null, new a(null), 3);
        } else {
            xq0.x("Service has no hosts available");
            throw null;
        }
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1122l7
    public final Object a(@NotNull JSONObject jSONObject, @NotNull C1304z c1304z) {
        if (((C1255v2) this.e.getValue()).isClosed() || ((C1255v2) this.e.getValue()).isClosing()) {
            xq0.q("Connection has already been closed");
            return null;
        }
        Timber.INSTANCE.tag("PairingConnectionImpl").d("Sending [%s]", jSONObject);
        Object V = x97.V(this.b, new C1150n7(this, jSONObject, null), c1304z);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1122l7
    public final void close() {
        x97.y(this.c, null, null, new d(null), 3);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1122l7
    public final void a(@NotNull InterfaceC1122l7.a aVar) {
        aVar.getClass();
        this.g = aVar;
    }
}
