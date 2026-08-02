package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.WebOSTVService;
import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.sessions.LaunchSession;
import com.connectsdk.service.sessions.WebAppSession;
import com.connectsdk.service.sessions.WebAppSessionListener;
import com.connectsdk.service.sessions.WebOSWebAppSession;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
import defpackage.cg6;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.t7o;
import defpackage.wct;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import defpackage.zt3;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class O5 extends defpackage.s9 {

    @NotNull
    public static final a p = new a(null);

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public final N5 f;

    @NotNull
    public final String g;

    @NotNull
    public final String h;

    @NotNull
    public final I5 i;

    @NotNull
    public final oqi j;
    public boolean k;
    public ConnectableDevice l;
    public WebOSWebAppSession m;

    @NotNull
    public final ConcurrentHashMap n;

    @NotNull
    public final e o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/O5$a;", "", "", "APP_NOT_FOUND_ERROR_MESSAGE", "Ljava/lang/String;", "REQUEST_ID_FIELD_NAME", "android_cast_connectivitymobile_lg"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final boolean a(a aVar, ServiceCommandError serviceCommandError) {
            aVar.getClass();
            return Intrinsics.d(serviceCommandError.getMessage(), "Application error");
        }
    }

    public interface b {
        void a(@NotNull Exception exc);

        void a(@NotNull JSONObject jSONObject);
    }

    @we7(c = "ru.kinopoisk.cast.lg.interaction.LgTvInteractor$close$1", f = "LgTvInteractor.kt", l = {353}, m = "invokeSuspend")
    public static final class c extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public oqi a;
        public O5 b;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return O5.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return O5.this.new c((Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            oqi oqiVar;
            O5 o5;
            nm6 nm6Var = nm6.a;
            int i = this.c;
            if (i == 0) {
                qgg.h0(obj);
                O5 o52 = O5.this;
                oqiVar = o52.j;
                this.a = oqiVar;
                this.b = o52;
                this.c = 1;
                if (oqiVar.a(this) == nm6Var) {
                    return nm6Var;
                }
                o5 = o52;
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o5 = this.b;
                oqiVar = this.a;
                qgg.h0(obj);
            }
            try {
                o5.k = true;
                o5.n.clear();
                o5.l = null;
                WebOSWebAppSession webOSWebAppSession = o5.m;
                if (webOSWebAppSession != null) {
                    webOSWebAppSession.disconnectFromWebApp();
                }
                o5.m = null;
                gld.L((mm6) o5.b.getValue(), null);
                Unit unit = Unit.a;
                oqiVar.b(null);
                return unit;
            } catch (Throwable th) {
                oqiVar.b(null);
                throw th;
            }
        }
    }

    @we7(c = "ru.kinopoisk.cast.lg.interaction.LgTvInteractor", f = "LgTvInteractor.kt", l = {105, 105}, m = "openApplicationStorePageInternal")
    public static final class d extends cg6 {
        public O5 a;
        public O5 b;
        public /* synthetic */ Object c;
        public int e;

        public d(cg6 cg6Var) {
            super(cg6Var);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return O5.this.a((Continuation<? super Unit>) this);
        }
    }

    public static final class e implements WebAppSessionListener {

        @we7(c = "ru.kinopoisk.cast.lg.interaction.LgTvInteractor$webAppSessionListener$1$onReceiveMessage$1", f = "LgTvInteractor.kt", l = {}, m = "invokeSuspend")
        public static final class a extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ Object b;
            public final /* synthetic */ O5 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, O5 o5, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = obj;
                this.c = o5;
            }

            @Override // defpackage.kq2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.b, this.c, continuation);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                Object t7oVar;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (this.b instanceof JSONObject) {
                    Timber.Companion companion = Timber.INSTANCE;
                    companion.tag(this.c.g).d("Json message is received: %s", this.b);
                    if (((JSONObject) this.b).has("requestId")) {
                        Object obj2 = ((JSONObject) this.b).get("requestId");
                        b bVar = (b) this.c.n.get(obj2);
                        O5 o5 = this.c;
                        if (bVar == null) {
                            companion.tag(o5.g).w("Can't handle result - handler is missing", new Object[0]);
                        } else {
                            wct.n(o5.n).remove(obj2);
                            Object obj3 = this.b;
                            try {
                                r7o r7oVar = z7o.b;
                                bVar.a((JSONObject) obj3);
                                t7oVar = Unit.a;
                            } catch (Throwable th) {
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(th);
                            }
                            O5 o52 = this.c;
                            Throwable a = z7o.a(t7oVar);
                            if (a != null) {
                                Timber.INSTANCE.tag(o52.g).w(a, "On message received failure", new Object[0]);
                                bVar.a(new Exception("Failed to handle message"));
                            }
                        }
                    }
                } else {
                    Timber.INSTANCE.tag(this.c.g).i("Received message is not json, message is ignored: %s", this.b);
                }
                return Unit.a;
            }
        }

        public e() {
        }

        @Override // com.connectsdk.service.sessions.WebAppSessionListener
        public final void onReceiveMessage(WebAppSession webAppSession, Object obj) {
            obj.getClass();
            x97.y((mm6) O5.this.b.getValue(), null, null, new a(obj, O5.this, null), 3);
        }

        @Override // com.connectsdk.service.sessions.WebAppSessionListener
        public final void onWebAppSessionDisconnect(WebAppSession webAppSession) {
            Timber.INSTANCE.tag(O5.this.g).i("Web app session disconnected", new Object[0]);
            Set<String> keySet = O5.this.n.keySet();
            O5 o5 = O5.this;
            for (String str : keySet) {
                b bVar = (b) o5.n.get(str);
                if (bVar != null) {
                    bVar.a(new IllegalStateException("Web app session is disconnected"));
                }
                o5.n.remove(str);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O5(@NotNull String str, @NotNull String str2, @NotNull N5 n5, @NotNull F0 f0, @NotNull Q2 q2) {
        super(q2);
        str.getClass();
        str2.getClass();
        n5.getClass();
        f0.getClass();
        q2.getClass();
        this.d = str;
        this.e = str2;
        this.f = n5;
        this.g = "LgTvInteractor";
        this.h = String.format("deviceId=%s, appId=%s", Arrays.copyOf(new Object[]{str, str2}, 2));
        this.i = new I5(f0, n5);
        this.j = rqi.a();
        this.n = new ConcurrentHashMap();
        this.o = new e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #1 {all -> 0x00cf, blocks: (B:25:0x0077, B:27:0x007b, B:31:0x00d2, B:32:0x00d9), top: B:24:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2 A[Catch: all -> 0x00cf, TRY_ENTER, TryCatch #1 {all -> 0x00cf, blocks: (B:25:0x0077, B:27:0x007b, B:31:0x00d2, B:32:0x00d9), top: B:24:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ConnectableDevice connectableDevice, String str, cg6 cg6Var) {
        T5 t5;
        int i;
        oqi oqiVar;
        String str2;
        O5 o5;
        oqi oqiVar2;
        try {
            if (cg6Var instanceof T5) {
                t5 = (T5) cg6Var;
                int i2 = t5.g;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    t5.g = i2 - Integer.MIN_VALUE;
                    Object obj = t5.e;
                    nm6 nm6Var = nm6.a;
                    i = t5.g;
                    if (i != 0) {
                        qgg.h0(obj);
                        Timber.INSTANCE.tag(this.g).v("Launching app %s", str);
                        oqiVar = this.j;
                        t5.a = this;
                        t5.b = connectableDevice;
                        t5.c = str;
                        t5.d = oqiVar;
                        t5.g = 1;
                        if (oqiVar.a(t5) != nm6Var) {
                            str2 = str;
                            o5 = this;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar2 = (oqi) t5.b;
                        o5 = t5.a;
                        try {
                            qgg.h0(obj);
                            LaunchSession launchSession = (LaunchSession) obj;
                            Timber.INSTANCE.tag(o5.g).v("Successfully launched", new Object[0]);
                            WebOSWebAppSession webOSWebAppSession = new WebOSWebAppSession(launchSession, launchSession.getService());
                            o5.m = webOSWebAppSession;
                            webOSWebAppSession.setWebAppSessionListener(o5.o);
                            Unit unit = Unit.a;
                            oqiVar2.b(null);
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    oqi oqiVar3 = t5.d;
                    String str3 = t5.c;
                    ConnectableDevice connectableDevice2 = (ConnectableDevice) t5.b;
                    O5 o52 = t5.a;
                    qgg.h0(obj);
                    oqiVar = oqiVar3;
                    connectableDevice = connectableDevice2;
                    str2 = str3;
                    o5 = o52;
                    if (!o5.k) {
                        throw new IllegalStateException("The interactor has already been closed");
                    }
                    Launcher a2 = a(connectableDevice);
                    t5.a = o5;
                    t5.b = oqiVar;
                    t5.c = null;
                    t5.d = null;
                    t5.g = 2;
                    zt3 zt3Var = new zt3(1, qxe.b(t5));
                    zt3Var.s();
                    a2.launchApp(str2, new U5(zt3Var));
                    Object q = zt3Var.q();
                    if (q != nm6Var) {
                        oqi oqiVar4 = oqiVar;
                        obj = q;
                        oqiVar2 = oqiVar4;
                        LaunchSession launchSession2 = (LaunchSession) obj;
                        Timber.INSTANCE.tag(o5.g).v("Successfully launched", new Object[0]);
                        WebOSWebAppSession webOSWebAppSession2 = new WebOSWebAppSession(launchSession2, launchSession2.getService());
                        o5.m = webOSWebAppSession2;
                        webOSWebAppSession2.setWebAppSessionListener(o5.o);
                        Unit unit2 = Unit.a;
                        oqiVar2.b(null);
                        return unit2;
                    }
                    return nm6Var;
                }
            }
            if (!o5.k) {
            }
        } catch (Throwable th2) {
            th = th2;
            oqiVar2 = oqiVar;
            oqiVar2.b(null);
            throw th;
        }
        t5 = new T5(this, cg6Var);
        Object obj2 = t5.e;
        nm6 nm6Var2 = nm6.a;
        i = t5.g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r3.a(r7, r1) == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:25:0x005a, B:27:0x005e, B:29:0x0062, B:31:0x006e, B:32:0x008a, B:34:0x008f, B:36:0x0095, B:40:0x00b0, B:41:0x00b7), top: B:24:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:25:0x005a, B:27:0x005e, B:29:0x0062, B:31:0x006e, B:32:0x008a, B:34:0x008f, B:36:0x0095, B:40:0x00b0, B:41:0x00b7), top: B:24:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        Q5 q5;
        int i;
        oqi oqiVar;
        O5 o5;
        oqi oqiVar2;
        Throwable th;
        ConnectableDevice connectableDevice;
        O5 o52;
        try {
            if (cg6Var instanceof Q5) {
                q5 = (Q5) cg6Var;
                int i2 = q5.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    q5.f = i2 - Integer.MIN_VALUE;
                    Object obj = q5.d;
                    nm6 nm6Var = nm6.a;
                    i = q5.f;
                    if (i != 0) {
                        qgg.h0(obj);
                        oqiVar = this.j;
                        q5.a = this;
                        q5.b = oqiVar;
                        q5.f = 1;
                        if (oqiVar.a(q5) != nm6Var) {
                            o5 = this;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        connectableDevice = q5.c;
                        oqiVar2 = q5.b;
                        o52 = q5.a;
                        try {
                            qgg.h0(obj);
                            o52.l = connectableDevice;
                            oqiVar2.b(null);
                            return connectableDevice;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    oqi oqiVar3 = q5.b;
                    o5 = q5.a;
                    qgg.h0(obj);
                    oqiVar = oqiVar3;
                    if (!o5.k) {
                        throw new IllegalStateException("The interactor has already been closed");
                    }
                    ConnectableDevice connectableDevice2 = o5.l;
                    if (connectableDevice2 == null && (connectableDevice2 = o5.f.a(o5.d)) == null) {
                        throw new IllegalStateException(("Device " + o5.d + " not found").toString());
                    }
                    connectableDevice = connectableDevice2;
                    if (!connectableDevice.isConnected()) {
                        I5 i5 = o5.i;
                        String str = o5.d;
                        q5.a = o5;
                        q5.b = oqiVar;
                        q5.c = connectableDevice;
                        q5.f = 2;
                    }
                    oqiVar2 = oqiVar;
                    o52 = o5;
                    o52.l = connectableDevice;
                    oqiVar2.b(null);
                    return connectableDevice;
                }
            }
            if (!o5.k) {
            }
        } catch (Throwable th3) {
            oqiVar2 = oqiVar;
            th = th3;
            oqiVar2.b(null);
            throw th;
        }
        q5 = new Q5(this, cg6Var);
        Object obj2 = q5.d;
        nm6 nm6Var2 = nm6.a;
        i = q5.f;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f8, code lost:
    
        if (r0 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: all -> 0x00a8, TryCatch #1 {all -> 0x00a8, blocks: (B:25:0x007d, B:27:0x0081, B:29:0x0085, B:31:0x008f, B:33:0x0095, B:34:0x00aa, B:35:0x00b1, B:37:0x00b2, B:39:0x00b6, B:41:0x00c0, B:46:0x00f6, B:48:0x0101, B:49:0x0108, B:50:0x010b, B:51:0x0112), top: B:24:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b A[Catch: all -> 0x00a8, TryCatch #1 {all -> 0x00a8, blocks: (B:25:0x007d, B:27:0x0081, B:29:0x0085, B:31:0x008f, B:33:0x0095, B:34:0x00aa, B:35:0x00b1, B:37:0x00b2, B:39:0x00b6, B:41:0x00c0, B:46:0x00f6, B:48:0x0101, B:49:0x0108, B:50:0x010b, B:51:0x0112), top: B:24:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        R5 r5;
        nm6 nm6Var;
        int i;
        O5 o5;
        oqi oqiVar;
        ConnectableDevice connectableDevice;
        oqi oqiVar2;
        WebOSWebAppSession webOSWebAppSession;
        if (cg6Var instanceof R5) {
            r5 = (R5) cg6Var;
            int i2 = r5.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r5.f = i2 - Integer.MIN_VALUE;
                Object obj = r5.d;
                nm6Var = nm6.a;
                i = r5.f;
                if (i != 0) {
                    qgg.h0(obj);
                    r5.a = this;
                    r5.f = 1;
                    obj = b(r5);
                    if (obj != nm6Var) {
                        o5 = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        webOSWebAppSession = (WebOSWebAppSession) r5.b;
                        oqiVar2 = (oqi) r5.a;
                        try {
                            qgg.h0(obj);
                            oqiVar2.b(null);
                            return webOSWebAppSession;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    oqiVar = r5.c;
                    connectableDevice = (ConnectableDevice) r5.b;
                    o5 = (O5) r5.a;
                    qgg.h0(obj);
                    try {
                        if (!o5.k) {
                            throw new IllegalStateException("The interactor has already been closed");
                        }
                        if (o5.m == null) {
                            DeviceService serviceByName = connectableDevice.getServiceByName(WebOSTVService.ID);
                            WebOSTVService webOSTVService = serviceByName instanceof WebOSTVService ? (WebOSTVService) serviceByName : null;
                            if (webOSTVService == null) {
                                throw new IllegalStateException("WebOS tv service is missing");
                            }
                            WebOSWebAppSession webOSWebAppSession2 = new WebOSWebAppSession(LaunchSession.launchSessionForAppId(o5.e), webOSTVService);
                            o5.m = webOSWebAppSession2;
                            webOSWebAppSession2.setWebAppSessionListener(o5.o);
                        }
                        WebOSWebAppSession webOSWebAppSession3 = o5.m;
                        if (webOSWebAppSession3 == null) {
                            throw new IllegalStateException("Web os web app session is null");
                        }
                        if (!webOSWebAppSession3.isConnected().booleanValue()) {
                            Timber.INSTANCE.tag(o5.g).d("Session is not connected, trying to reconnect", new Object[0]);
                            webOSWebAppSession3.disconnectFromWebApp();
                            r5.a = oqiVar;
                            r5.b = webOSWebAppSession3;
                            r5.c = null;
                            r5.f = 3;
                            zt3 zt3Var = new zt3(1, qxe.b(r5));
                            zt3Var.s();
                            webOSWebAppSession3.connect(new P5(o5, zt3Var));
                            Object q = zt3Var.q();
                            if (q != nm6Var) {
                                q = Unit.a;
                            }
                        }
                        webOSWebAppSession = webOSWebAppSession3;
                        oqiVar2 = oqiVar;
                        oqiVar2.b(null);
                        return webOSWebAppSession;
                    } catch (Throwable th2) {
                        th = th2;
                        oqiVar2 = oqiVar;
                        oqiVar2.b(null);
                        throw th;
                    }
                }
                O5 o52 = (O5) r5.a;
                qgg.h0(obj);
                o5 = o52;
                ConnectableDevice connectableDevice2 = (ConnectableDevice) obj;
                oqiVar = o5.j;
                r5.a = o5;
                r5.b = connectableDevice2;
                r5.c = oqiVar;
                r5.f = 2;
                if (oqiVar.a(r5) != nm6Var) {
                    connectableDevice = connectableDevice2;
                    if (!o5.k) {
                    }
                }
                return nm6Var;
            }
        }
        r5 = new R5(this, cg6Var);
        Object obj2 = r5.d;
        nm6Var = nm6.a;
        i = r5.f;
        if (i != 0) {
        }
        ConnectableDevice connectableDevice22 = (ConnectableDevice) obj2;
        oqiVar = o5.j;
        r5.a = o5;
        r5.b = connectableDevice22;
        r5.c = oqiVar;
        r5.f = 2;
        if (oqiVar.a(r5) != nm6Var) {
        }
        return nm6Var;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1290xb
    public final void close() {
        x97.y((mm6) this.b.getValue(), null, null, new c(null), 3);
    }

    @Override // defpackage.s9
    @NotNull
    public final String b() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r2.a((com.connectsdk.device.ConnectableDevice) r7, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull cg6 cg6Var) {
        W5 w5;
        int i;
        O5 o5;
        O5 o52;
        if (cg6Var instanceof W5) {
            w5 = (W5) cg6Var;
            int i2 = w5.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w5.e = i2 - Integer.MIN_VALUE;
                Object obj = w5.c;
                nm6 nm6Var = nm6.a;
                i = w5.e;
                if (i != 0) {
                    qgg.h0(obj);
                    w5.a = this;
                    w5.b = this;
                    w5.e = 1;
                    obj = b(w5);
                    if (obj != nm6Var) {
                        o5 = this;
                        o52 = o5;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o5 = w5.b;
                o52 = w5.a;
                qgg.h0(obj);
                String str = o52.e;
                w5.a = null;
                w5.b = null;
                w5.e = 2;
            }
        }
        w5 = new W5(this, cg6Var);
        Object obj2 = w5.c;
        nm6 nm6Var2 = nm6.a;
        i = w5.e;
        if (i != 0) {
        }
        String str2 = o52.e;
        w5.a = null;
        w5.b = null;
        w5.e = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        d dVar;
        int i;
        O5 o5;
        O5 o52;
        WebOSTVService webOSTVService;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.e = i2 - Integer.MIN_VALUE;
                Object obj = dVar.c;
                nm6 nm6Var = nm6.a;
                i = dVar.e;
                if (i != 0) {
                    qgg.h0(obj);
                    dVar.a = this;
                    dVar.b = this;
                    dVar.e = 1;
                    obj = b(dVar);
                    if (obj != nm6Var) {
                        o5 = this;
                        o52 = o5;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o5 = dVar.b;
                o52 = dVar.a;
                qgg.h0(obj);
                o5.getClass();
                DeviceService serviceByName = ((ConnectableDevice) obj).getServiceByName(WebOSTVService.ID);
                webOSTVService = !(serviceByName instanceof WebOSTVService) ? (WebOSTVService) serviceByName : null;
                if (webOSTVService == null) {
                    dVar.a = null;
                    dVar.b = null;
                    dVar.e = 2;
                    o52.getClass();
                    zt3 zt3Var = new zt3(1, qxe.b(dVar));
                    zt3Var.s();
                    webOSTVService.launchAppStore(o52.e, new V5(o52, zt3Var));
                    Object q = zt3Var.q();
                    if (q != nm6Var) {
                        q = Unit.a;
                    }
                } else {
                    xq0.q("WebOS tv service is missing");
                    return null;
                }
            }
        }
        dVar = new d((cg6) continuation);
        Object obj2 = dVar.c;
        nm6 nm6Var2 = nm6.a;
        i = dVar.e;
        if (i != 0) {
        }
        o5.getClass();
        DeviceService serviceByName2 = ((ConnectableDevice) obj2).getServiceByName(WebOSTVService.ID);
        if (!(serviceByName2 instanceof WebOSTVService)) {
        }
        if (webOSTVService == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull C1004d1 c1004d1, @NotNull Type type, @NotNull cg6 cg6Var) {
        S5 s5;
        int i;
        Type type2;
        JSONObject jSONObject;
        C1004d1 c1004d12;
        O5 o5;
        if (cg6Var instanceof S5) {
            s5 = (S5) cg6Var;
            int i2 = s5.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s5.g = i2 - Integer.MIN_VALUE;
                Object obj = s5.e;
                nm6 nm6Var = nm6.a;
                i = s5.g;
                if (i != 0) {
                    qgg.h0(obj);
                    JSONObject jSONObject2 = new JSONObject(C1018e1.a(c1004d1));
                    s5.a = c1004d1;
                    s5.b = type;
                    s5.c = jSONObject2;
                    s5.d = this;
                    s5.g = 1;
                    Object c2 = c(s5);
                    if (c2 != nm6Var) {
                        type2 = type;
                        jSONObject = jSONObject2;
                        obj = c2;
                        c1004d12 = c1004d1;
                        o5 = this;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o5 = s5.d;
                jSONObject = s5.c;
                type2 = s5.b;
                c1004d12 = s5.a;
                qgg.h0(obj);
                String str = c1004d12.b;
                s5.a = null;
                s5.b = null;
                s5.c = null;
                s5.d = null;
                s5.g = 2;
                o5.getClass();
                zt3 zt3Var = new zt3(1, qxe.b(s5));
                zt3Var.s();
                Timber.INSTANCE.tag(o5.g).d("Sending message %s", jSONObject);
                o5.n.put(str, new X5(type2, zt3Var));
                ((WebOSWebAppSession) obj).sendMessage(jSONObject, new Y5(o5, zt3Var));
                Object q = zt3Var.q();
                return q != nm6Var ? nm6Var : q;
            }
        }
        s5 = new S5(this, cg6Var);
        Object obj2 = s5.e;
        nm6 nm6Var2 = nm6.a;
        i = s5.g;
        if (i != 0) {
        }
        String str2 = c1004d12.b;
        s5.a = null;
        s5.b = null;
        s5.c = null;
        s5.d = null;
        s5.g = 2;
        o5.getClass();
        zt3 zt3Var2 = new zt3(1, qxe.b(s5));
        zt3Var2.s();
        Timber.INSTANCE.tag(o5.g).d("Sending message %s", jSONObject);
        o5.n.put(str2, new X5(type2, zt3Var2));
        ((WebOSWebAppSession) obj2).sendMessage(jSONObject, new Y5(o5, zt3Var2));
        Object q2 = zt3Var2.q();
        if (q2 != nm6Var2) {
        }
    }

    @Override // defpackage.s9
    @NotNull
    public final String a() {
        return this.g;
    }

    public static Launcher a(ConnectableDevice connectableDevice) {
        Launcher launcher = (Launcher) connectableDevice.getCapability(Launcher.class);
        if (launcher != null) {
            return launcher;
        }
        throw new IllegalStateException(("Device " + connectableDevice.getId() + " does not support Launcher capability").toString());
    }
}
