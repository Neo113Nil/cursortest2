package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.net.Uri;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
import defpackage.bg3;
import defpackage.cg6;
import defpackage.czh;
import defpackage.gw0;
import defpackage.hs4;
import defpackage.jc4;
import defpackage.kc4;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qdc;
import defpackage.qgg;
import defpackage.qvw;
import defpackage.qxe;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.t7o;
import defpackage.un4;
import defpackage.veb;
import defpackage.vjp;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import defpackage.zt3;
import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.k8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1109k8 extends defpackage.s9 {

    @NotNull
    public static final a p = new a(null);

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public final Context f;

    @NotNull
    public final String g;

    @NotNull
    public final String h;
    public gw0 i;

    @NotNull
    public final oqi j;
    public volatile boolean k;

    @NotNull
    public final AtomicBoolean l;

    @NotNull
    public final ConcurrentHashMap m;

    @NotNull
    public final kc4 n;

    @NotNull
    public final jc4 o;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/k8$a;", "", "", "APP_NOT_FOUND_ERROR_CODE", "J", "", "REQUEST_ID_FIELD_NAME", "Ljava/lang/String;", "RESPONSE_EVENT_NAME", "SEND_EVENT_NAME", "android_cast_connectivitymobile_samsung"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k8$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final boolean a(a aVar, veb vebVar) {
            aVar.getClass();
            return vebVar.a == 404;
        }
    }

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k8$b */
    public interface b {
        void a(@NotNull Exception exc);

        void a(@NotNull JSONObject jSONObject);
    }

    @we7(c = "ru.kinopoisk.cast.samsung.interaction.SamsungTvInteractor$close$1", f = "SamsungTvInteractor.kt", l = {306}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k8$c */
    public static final class c extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public oqi a;
        public C1109k8 b;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C1109k8.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C1109k8.this.new c((Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            oqi oqiVar;
            C1109k8 c1109k8;
            nm6 nm6Var = nm6.a;
            int i = this.c;
            if (i == 0) {
                qgg.h0(obj);
                C1109k8 c1109k82 = C1109k8.this;
                oqiVar = c1109k82.j;
                this.a = oqiVar;
                this.b = c1109k82;
                this.c = 1;
                if (oqiVar.a(this) == nm6Var) {
                    return nm6Var;
                }
                c1109k8 = c1109k82;
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c1109k8 = this.b;
                oqiVar = this.a;
                qgg.h0(obj);
            }
            try {
                c1109k8.k = true;
                c1109k8.l.set(false);
                c1109k8.m.clear();
                gw0 gw0Var = c1109k8.i;
                if (gw0Var != null) {
                    gw0Var.d(false);
                }
                c1109k8.i = null;
                Unit unit = Unit.a;
                oqiVar.b(null);
                return unit;
            } catch (Throwable th) {
                oqiVar.b(null);
                throw th;
            }
        }
    }

    @we7(c = "ru.kinopoisk.cast.samsung.interaction.SamsungTvInteractor$onMessageListener$1$1", f = "SamsungTvInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k8$d */
    public static final class d extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ czh c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(czh czhVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = czhVar;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C1109k8.this.new d(this.c, continuation);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            Object t7oVar;
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            czh czhVar = this.c;
            try {
                r7o r7oVar = z7o.b;
                Object obj2 = czhVar.c;
                obj2.getClass();
                t7oVar = new JSONObject((Map) obj2);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            JSONObject jSONObject = (JSONObject) t7oVar;
            if (jSONObject != null) {
                Timber.Companion companion = Timber.INSTANCE;
                companion.tag(C1109k8.this.g).d("Json message is received: %s", jSONObject);
                String optString = jSONObject.optString("requestId");
                optString.getClass();
                if (optString.length() > 0) {
                    b bVar = (b) C1109k8.this.m.get(optString);
                    C1109k8 c1109k8 = C1109k8.this;
                    if (bVar == null) {
                        companion.tag(c1109k8.g).w("Can't handle result - handler is missing", new Object[0]);
                    } else {
                        c1109k8.m.remove(optString);
                        try {
                            bVar.a(jSONObject);
                        } catch (Throwable th2) {
                            Timber.INSTANCE.tag(C1109k8.this.g).w(th2, "On message received failure", new Object[0]);
                            bVar.a(new Exception("Failed to handle message"));
                        }
                    }
                }
            } else {
                Timber.INSTANCE.tag(C1109k8.this.g).i("Received message is not json, message is ignored: %s", this.c);
            }
            return Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.cast.samsung.interaction.SamsungTvInteractor", f = "SamsungTvInteractor.kt", l = {114, 114}, m = "openApplicationStorePageInternal")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.k8$e */
    public static final class e extends cg6 {
        public C1109k8 a;
        public /* synthetic */ Object b;
        public int d;

        public e(cg6 cg6Var) {
            super(cg6Var);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return C1109k8.this.a((Continuation<? super Unit>) this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1109k8(@NotNull String str, @NotNull String str2, @NotNull Context context, @NotNull Q2 q2) {
        super(q2);
        str.getClass();
        str2.getClass();
        context.getClass();
        q2.getClass();
        this.d = str;
        this.e = str2;
        this.f = context;
        this.g = "SamsungTvInteractor";
        this.h = String.format("deviceId=%s, appId=%s", Arrays.copyOf(new Object[]{str, str2}, 2));
        this.j = rqi.a();
        this.l = new AtomicBoolean(false);
        this.m = new ConcurrentHashMap();
        this.n = new qvw(this);
        this.o = new com.yandex.passport.sloth.ui.c(21, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull C1004d1 c1004d1, @NotNull Type type, @NotNull cg6 cg6Var) {
        C1165o8 c1165o8;
        nm6 nm6Var;
        int i;
        JSONObject jSONObject;
        Object b2;
        C1109k8 c1109k8;
        gw0 gw0Var;
        C1004d1 c1004d12;
        gw0 gw0Var2;
        Type type2;
        JSONObject jSONObject2;
        if (cg6Var instanceof C1165o8) {
            c1165o8 = (C1165o8) cg6Var;
            int i2 = c1165o8.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1165o8.h = i2 - Integer.MIN_VALUE;
                Object obj = c1165o8.f;
                nm6Var = nm6.a;
                i = c1165o8.h;
                if (i != 0) {
                    qgg.h0(obj);
                    jSONObject = new JSONObject(C1018e1.a(c1004d1));
                    c1165o8.a = this;
                    c1165o8.b = c1004d1;
                    c1165o8.c = type;
                    c1165o8.d = jSONObject;
                    c1165o8.h = 1;
                    b2 = b(c1165o8);
                    if (b2 != nm6Var) {
                        c1109k8 = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gw0Var2 = c1165o8.e;
                    jSONObject2 = c1165o8.d;
                    type2 = c1165o8.c;
                    c1004d12 = c1165o8.b;
                    c1109k8 = c1165o8.a;
                    qgg.h0(obj);
                    gw0Var2.getClass();
                    String str = c1004d12.b;
                    c1165o8.a = null;
                    c1165o8.b = null;
                    c1165o8.c = null;
                    c1165o8.d = null;
                    c1165o8.e = null;
                    c1165o8.h = 3;
                    c1109k8.getClass();
                    zt3 zt3Var = new zt3(1, qxe.b(c1165o8));
                    zt3Var.s();
                    Timber.INSTANCE.tag(c1109k8.g).d("Sending message %s", jSONObject2);
                    if (!c1109k8.k) {
                        xq0.q("The interactor has already been closed");
                        return null;
                    }
                    c1109k8.m.put(str, new C1220s8(type2, zt3Var));
                    gw0Var2.n(jSONObject2, "host", NetcastTVService.UDAP_API_COMMAND);
                    Object q = zt3Var.q();
                    return q == nm6Var ? nm6Var : q;
                }
                JSONObject jSONObject3 = c1165o8.d;
                type = c1165o8.c;
                C1004d1 c1004d13 = c1165o8.b;
                c1109k8 = c1165o8.a;
                qgg.h0(obj);
                jSONObject = jSONObject3;
                c1004d1 = c1004d13;
                b2 = obj;
                gw0Var = (gw0) b2;
                gw0Var.getClass();
                c1165o8.a = c1109k8;
                c1165o8.b = c1004d1;
                c1165o8.c = type;
                c1165o8.d = jSONObject;
                c1165o8.e = gw0Var;
                c1165o8.h = 2;
                if (c1109k8.a(gw0Var, c1165o8) != nm6Var) {
                    c1004d12 = c1004d1;
                    gw0Var2 = gw0Var;
                    type2 = type;
                    jSONObject2 = jSONObject;
                    gw0Var2.getClass();
                    String str2 = c1004d12.b;
                    c1165o8.a = null;
                    c1165o8.b = null;
                    c1165o8.c = null;
                    c1165o8.d = null;
                    c1165o8.e = null;
                    c1165o8.h = 3;
                    c1109k8.getClass();
                    zt3 zt3Var2 = new zt3(1, qxe.b(c1165o8));
                    zt3Var2.s();
                    Timber.INSTANCE.tag(c1109k8.g).d("Sending message %s", jSONObject2);
                    if (!c1109k8.k) {
                    }
                }
            }
        }
        c1165o8 = new C1165o8(this, cg6Var);
        Object obj2 = c1165o8.f;
        nm6Var = nm6.a;
        i = c1165o8.h;
        if (i != 0) {
        }
        gw0Var = (gw0) b2;
        gw0Var.getClass();
        c1165o8.a = c1109k8;
        c1165o8.b = c1004d1;
        c1165o8.c = type;
        c1165o8.d = jSONObject;
        c1165o8.e = gw0Var;
        c1165o8.h = 2;
        if (c1109k8.a(gw0Var, c1165o8) != nm6Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0080, B:15:0x0089, B:17:0x009f, B:19:0x00a7, B:20:0x00af, B:24:0x00bb, B:25:0x00bc), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0080, B:15:0x0089, B:17:0x009f, B:19:0x00a7, B:20:0x00af, B:24:0x00bb, B:25:0x00bc), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058 A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #0 {all -> 0x00bd, blocks: (B:33:0x0054, B:35:0x0058), top: B:32:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        C1137m8 c1137m8;
        int i;
        oqi oqiVar;
        C1109k8 c1109k8;
        oqi oqiVar2;
        Throwable th;
        gw0 gw0Var;
        C1109k8 c1109k82;
        String str;
        try {
            if (cg6Var instanceof C1137m8) {
                c1137m8 = (C1137m8) cg6Var;
                int i2 = c1137m8.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1137m8.e = i2 - Integer.MIN_VALUE;
                    Object obj = c1137m8.c;
                    nm6 nm6Var = nm6.a;
                    i = c1137m8.e;
                    if (i != 0) {
                        qgg.h0(obj);
                        oqiVar = this.j;
                        c1137m8.a = this;
                        c1137m8.b = oqiVar;
                        c1137m8.e = 1;
                        if (oqiVar.a(c1137m8) != nm6Var) {
                            c1109k8 = this;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar2 = c1137m8.b;
                        c1109k82 = c1137m8.a;
                        try {
                            qgg.h0(obj);
                            vjp vjpVar = (vjp) obj;
                            str = c1109k82.e;
                            vjpVar.getClass();
                            if (str != null) {
                                throw null;
                            }
                            Uri parse = Uri.parse(str);
                            SecureRandom secureRandom = gw0.q;
                            parse.getClass();
                            gw0 gw0Var2 = new gw0(vjpVar, parse);
                            kc4 kc4Var = c1109k82.n;
                            ConcurrentHashMap concurrentHashMap = gw0Var2.h;
                            if (kc4Var == null) {
                                throw null;
                            }
                            List list = (List) concurrentHashMap.get("command-response");
                            if (list == null) {
                                list = new CopyOnWriteArrayList();
                                concurrentHashMap.put("command-response", list);
                            }
                            list.add(kc4Var);
                            gw0Var2.f = c1109k82.o;
                            c1109k82.i = gw0Var2;
                            oqiVar = oqiVar2;
                            gw0Var = gw0Var2;
                            oqiVar.b(null);
                            return gw0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    oqi oqiVar3 = c1137m8.b;
                    c1109k8 = c1137m8.a;
                    qgg.h0(obj);
                    oqiVar = oqiVar3;
                    gw0Var = c1109k8.i;
                    if (gw0Var == null) {
                        c1137m8.a = c1109k8;
                        c1137m8.b = oqiVar;
                        c1137m8.e = 2;
                        zt3 zt3Var = new zt3(1, qxe.b(c1137m8));
                        zt3Var.s();
                        vjp.d(c1109k8.f, c1109k8.d, new C1179p8(zt3Var));
                        Object q = zt3Var.q();
                        if (q != nm6Var) {
                            oqiVar2 = oqiVar;
                            obj = q;
                            c1109k82 = c1109k8;
                            vjp vjpVar2 = (vjp) obj;
                            str = c1109k82.e;
                            vjpVar2.getClass();
                            if (str != null) {
                            }
                        }
                        return nm6Var;
                    }
                    oqiVar.b(null);
                    return gw0Var;
                }
            }
            gw0Var = c1109k8.i;
            if (gw0Var == null) {
            }
            oqiVar.b(null);
            return gw0Var;
        } catch (Throwable th3) {
            oqiVar2 = oqiVar;
            th = th3;
            oqiVar2.b(null);
            throw th;
        }
        c1137m8 = new C1137m8(this, cg6Var);
        Object obj2 = c1137m8.c;
        nm6 nm6Var2 = nm6.a;
        i = c1137m8.e;
        if (i != 0) {
        }
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1290xb
    public final void close() {
        C1173p2.a((mm6) this.b.getValue());
        x97.y((mm6) this.b.getValue(), null, null, new c(null), 3);
    }

    @Override // defpackage.s9
    @NotNull
    public final String b() {
        return this.h;
    }

    @Override // defpackage.s9
    @NotNull
    public final String a() {
        return this.g;
    }

    public static final void a(C1109k8 c1109k8, un4 un4Var) {
        Timber.INSTANCE.tag(c1109k8.g).i("Web app session disconnected", new Object[0]);
        for (String str : c1109k8.m.keySet()) {
            b bVar = (b) c1109k8.m.get(str);
            if (bVar != null) {
                bVar.a(new IllegalStateException("Web app session is disconnected"));
            }
            c1109k8.m.remove(str);
        }
    }

    public static String a(veb vebVar) {
        return vebVar.a + ": " + vebVar.c;
    }

    public static final void a(C1109k8 c1109k8, czh czhVar) {
        x97.y((mm6) c1109k8.b.getValue(), null, null, c1109k8.new d(czhVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r2.a((defpackage.gw0) r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull cg6 cg6Var) {
        C1206r8 c1206r8;
        int i;
        C1109k8 c1109k8;
        if (cg6Var instanceof C1206r8) {
            c1206r8 = (C1206r8) cg6Var;
            int i2 = c1206r8.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1206r8.d = i2 - Integer.MIN_VALUE;
                Object obj = c1206r8.b;
                nm6 nm6Var = nm6.a;
                i = c1206r8.d;
                if (i != 0) {
                    qgg.h0(obj);
                    Timber.INSTANCE.tag(this.g).d("Launching app", new Object[0]);
                    c1206r8.a = this;
                    c1206r8.d = 1;
                    obj = b(c1206r8);
                    if (obj != nm6Var) {
                        c1109k8 = this;
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
                c1109k8 = c1206r8.a;
                qgg.h0(obj);
                obj.getClass();
                c1206r8.a = null;
                c1206r8.d = 2;
            }
        }
        c1206r8 = new C1206r8(this, cg6Var);
        Object obj2 = c1206r8.b;
        nm6 nm6Var2 = nm6.a;
        i = c1206r8.d;
        if (i != 0) {
        }
        obj2.getClass();
        c1206r8.a = null;
        c1206r8.d = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        e eVar;
        nm6 nm6Var;
        int i;
        C1109k8 c1109k8;
        gw0 gw0Var;
        Object q;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
                Object obj = eVar.b;
                nm6Var = nm6.a;
                i = eVar.d;
                if (i != 0) {
                    qgg.h0(obj);
                    eVar.a = this;
                    eVar.d = 1;
                    obj = b(eVar);
                    if (obj != nm6Var) {
                        c1109k8 = this;
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
                c1109k8 = eVar.a;
                qgg.h0(obj);
                obj.getClass();
                gw0Var = (gw0) obj;
                eVar.a = null;
                eVar.d = 2;
                c1109k8.getClass();
                zt3 zt3Var = new zt3(1, qxe.b(eVar));
                zt3Var.s();
                C1193q8 c1193q8 = new C1193q8(c1109k8, zt3Var);
                if (!gw0Var.o) {
                    String valueOf = String.valueOf(gw0.q.nextInt(Integer.MAX_VALUE));
                    if (valueOf != null) {
                        gw0Var.i.put(valueOf, c1193q8);
                    }
                    gw0Var.i(valueOf, new veb(-1L, "error", "Unsupported method"));
                } else {
                    bg3.A(gw0Var.a.f.buildUpon().appendPath("applications").appendPath(gw0Var.b.toString()).appendPath("").build(), ServiceCommand.TYPE_PUT, 30000, new qdc(4, c1193q8, new hs4(14)));
                }
                q = zt3Var.q();
                if (q != nm6Var) {
                    q = Unit.a;
                }
            }
        }
        eVar = new e((cg6) continuation);
        Object obj2 = eVar.b;
        nm6Var = nm6.a;
        i = eVar.d;
        if (i != 0) {
        }
        obj2.getClass();
        gw0Var = (gw0) obj2;
        eVar.a = null;
        eVar.d = 2;
        c1109k8.getClass();
        zt3 zt3Var2 = new zt3(1, qxe.b(eVar));
        zt3Var2.s();
        C1193q8 c1193q82 = new C1193q8(c1109k8, zt3Var2);
        if (!gw0Var.o) {
        }
        q = zt3Var2.q();
        if (q != nm6Var) {
        }
    }

    public final Object a(gw0 gw0Var, cg6 cg6Var) {
        Object obj;
        if (gw0Var.l()) {
            return Unit.a;
        }
        if (this.l.get()) {
            zt3 zt3Var = new zt3(1, qxe.b(cg6Var));
            zt3Var.s();
            gw0Var.g = new C1151n8(this, zt3Var);
            Object q = zt3Var.q();
            return q == nm6.a ? q : Unit.a;
        }
        if (!gw0Var.l()) {
            if (!this.k) {
                zt3 zt3Var2 = new zt3(1, qxe.b(cg6Var));
                zt3Var2.s();
                gw0Var.b(new C1123l8(zt3Var2, this, gw0Var));
                obj = zt3Var2.q();
                if (obj != nm6.a) {
                    obj = Unit.a;
                }
            } else {
                xq0.q("The interactor has already been closed");
                return null;
            }
        } else {
            obj = Unit.a;
        }
        return obj == nm6.a ? obj : Unit.a;
    }
}
