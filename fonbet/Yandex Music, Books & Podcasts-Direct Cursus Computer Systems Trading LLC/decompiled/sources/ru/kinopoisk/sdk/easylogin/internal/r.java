package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a4g;
import defpackage.aur;
import defpackage.cg6;
import defpackage.mm6;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.wct;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$ensureAppIsAccessible$$inlined$executeWithResult$1;
import ru.kinopoisk.sdk.easylogin.internal.AbstractC1066h7;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1122l7;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class r extends defpackage.s9 {
    public static final long n;
    public static final /* synthetic */ int o = 0;
    public final String d;

    @NotNull
    public final Q2 e;

    @NotNull
    public final F4 f;

    @NotNull
    public final InterfaceC1192q7 g;

    @NotNull
    public final String h;
    public InterfaceC1122l7 i;
    public String j;
    public Integer k;

    @NotNull
    public final ConcurrentHashMap l;

    @NotNull
    public final InterfaceC1122l7.a m;

    public static final class a extends Y0<Unit> {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "App.IsInForeground";

        @Override // ru.kinopoisk.sdk.easylogin.internal.Y0
        @NotNull
        public final String a() {
            return b;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/r$b;", "", "Lnsa;", "KINOPOISK_CAST_FIRST_SEARCH_TIMEOUT", "J", "", "REQUEST_ID_FIELD_NAME", "Ljava/lang/String;", "android_cast_connectivitymobile_androidtv"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public interface c {
        void a(@NotNull Exception exc);

        void a(@NotNull JSONObject jSONObject);
    }

    @we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$messageListener$1$1", f = "AndroidTvInteractor.kt", l = {}, m = "invokeSuspend")
    public static final class d extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = jSONObject;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = r.this.new d(this.c, continuation);
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
            Timber.Companion companion = Timber.INSTANCE;
            companion.tag(r.this.h).d("Json message is received: %s", this.c);
            if (this.c.has("requestId")) {
                Object obj2 = this.c.get("requestId");
                c cVar = (c) r.this.l.get(obj2);
                r rVar = r.this;
                if (cVar == null) {
                    companion.tag(rVar.h).w("Can't handle result - handler is missing", new Object[0]);
                } else {
                    wct.n(rVar.l).remove(obj2);
                    JSONObject jSONObject = this.c;
                    try {
                        r7o r7oVar = z7o.b;
                        cVar.a(jSONObject);
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    r rVar2 = r.this;
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.tag(rVar2.h).w(a, "On message received failure", new Object[0]);
                        cVar.a(new Exception("Failed to handle message"));
                    }
                }
            }
            return Unit.a;
        }
    }

    static {
        new b(null);
        msa msaVar = nsa.b;
        n = yd5.M(2, ssa.SECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, String str2, @NotNull Q2 q2, @NotNull F4 f4, @NotNull InterfaceC1192q7 interfaceC1192q7) {
        super(q2);
        q2.getClass();
        f4.getClass();
        interfaceC1192q7.getClass();
        this.d = str;
        this.e = q2;
        this.f = f4;
        this.g = interfaceC1192q7;
        this.h = "AndroidTvInteractor";
        this.j = str2;
        this.l = new ConcurrentHashMap();
        this.m = new com.yandex.passport.sloth.ui.c(22, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (a(r14, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (b(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull C1004d1 c1004d1, @NotNull Type type, @NotNull cg6 cg6Var) {
        C1265w c1265w;
        int i;
        r rVar;
        InterfaceC1122l7 interfaceC1122l7;
        if (cg6Var instanceof C1265w) {
            c1265w = (C1265w) cg6Var;
            int i2 = c1265w.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1265w.f = i2 - Integer.MIN_VALUE;
                Object obj = c1265w.d;
                nm6 nm6Var = nm6.a;
                i = c1265w.f;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.i == null) {
                        String str = this.j;
                        String str2 = this.d;
                        if (str != null) {
                            c1265w.a = this;
                            c1265w.b = c1004d1;
                            c1265w.c = type;
                            c1265w.f = 1;
                        } else if (str2 != null) {
                            c1265w.a = this;
                            c1265w.b = c1004d1;
                            c1265w.c = type;
                            c1265w.f = 2;
                        }
                    }
                    rVar = this;
                } else {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    type = c1265w.c;
                    c1004d1 = c1265w.b;
                    r rVar2 = c1265w.a;
                    qgg.h0(obj);
                    rVar = rVar2;
                }
                Type type2 = type;
                interfaceC1122l7 = rVar.i;
                if (interfaceC1122l7 != null) {
                    xq0.x("Not connected");
                    return null;
                }
                JSONObject jSONObject = new JSONObject(C1018e1.a(c1004d1));
                String str3 = c1004d1.b;
                c1265w.a = null;
                c1265w.b = null;
                c1265w.c = null;
                c1265w.f = 3;
                Object O = a4g.O(new C1304z(rVar, jSONObject, str3, type2, interfaceC1122l7, null), c1265w);
                return O == nm6Var ? nm6Var : O;
            }
        }
        c1265w = new C1265w(this, cg6Var);
        Object obj2 = c1265w.d;
        nm6 nm6Var2 = nm6.a;
        i = c1265w.f;
        if (i != 0) {
        }
        Type type22 = type;
        interfaceC1122l7 = rVar.i;
        if (interfaceC1122l7 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        C1252v c1252v;
        Object obj;
        int i;
        if (cg6Var instanceof C1252v) {
            c1252v = (C1252v) cg6Var;
            int i2 = c1252v.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1252v.c = i2 - Integer.MIN_VALUE;
                obj = c1252v.a;
                Object obj2 = nm6.a;
                i = c1252v.c;
                if (i != 0) {
                    qgg.h0(obj);
                    Integer num = this.k;
                    if (num != null && num.intValue() >= 29) {
                        Y0 y0 = a.a;
                        Type type = new AndroidTvInteractor$ensureAppIsAccessible$$inlined$executeWithResult$1().getType();
                        type.getClass();
                        c1252v.c = 1;
                        obj = a(y0, type, c1252v);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    throw new AbstractC1066h7.a();
                }
                return Unit.a;
            }
        }
        c1252v = new C1252v(this, cg6Var);
        obj = c1252v.a;
        Object obj22 = nm6.a;
        i = c1252v.c;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.a;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1290xb
    public final void close() {
        if (this.d != null) {
            this.j = null;
            this.k = null;
        }
        C1173p2.a((mm6) this.b.getValue());
        InterfaceC1122l7 interfaceC1122l7 = this.i;
        if (interfaceC1122l7 != null) {
            interfaceC1122l7.close();
        }
        this.i = null;
        this.l.clear();
    }

    @Override // defpackage.s9
    @NotNull
    public final String b() {
        return String.format("googleCastDeviceId=%s,kinopoiskCastDeviceId=%s,osVersion=%s", Arrays.copyOf(new Object[]{this.d, this.j, this.k}, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r9.a(r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        C1239u c1239u;
        int i;
        r rVar;
        String str2;
        if (cg6Var instanceof C1239u) {
            c1239u = (C1239u) cg6Var;
            int i2 = c1239u.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1239u.d = i2 - Integer.MIN_VALUE;
                Object obj = c1239u.b;
                nm6 nm6Var = nm6.a;
                i = c1239u.d;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    long j = n;
                    c1239u.a = this;
                    c1239u.d = 1;
                    obj = tyf.M(j, new C1278x(this, str, null), c1239u);
                    if (obj != nm6Var) {
                        rVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Boolean.valueOf(z);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rVar = c1239u.a;
                qgg.h0(obj);
                str2 = (String) obj;
                if (str2 == null) {
                    rVar.j = str2;
                    c1239u.a = null;
                    c1239u.d = 2;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        c1239u = new C1239u(this, cg6Var);
        Object obj2 = c1239u.b;
        nm6 nm6Var2 = nm6.a;
        i = c1239u.d;
        boolean z2 = true;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 == null) {
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.s9
    @NotNull
    public final String a() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r2.b(r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull cg6 cg6Var) {
        C1291y c1291y;
        int i;
        r rVar;
        if (cg6Var instanceof C1291y) {
            c1291y = (C1291y) cg6Var;
            int i2 = c1291y.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1291y.d = i2 - Integer.MIN_VALUE;
                Object obj = c1291y.b;
                nm6 nm6Var = nm6.a;
                i = c1291y.d;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = this.d;
                    String str2 = this.j;
                    if (str2 != null) {
                        c1291y.a = this;
                        c1291y.d = 1;
                        if (a(str2, c1291y) != nm6Var) {
                            rVar = this;
                            c1291y.a = null;
                            c1291y.d = 3;
                        }
                    } else if (str != null) {
                        c1291y.a = this;
                        c1291y.d = 2;
                        obj = b(str, c1291y);
                        if (obj != nm6Var) {
                            rVar = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            c1291y.a = null;
                            c1291y.d = 3;
                        }
                    } else {
                        xq0.q("Wrong device identifier provided");
                        return null;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    rVar = c1291y.a;
                    qgg.h0(obj);
                    c1291y.a = null;
                    c1291y.d = 3;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = c1291y.a;
                    qgg.h0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        throw new AbstractC1066h7.a();
                    }
                    c1291y.a = null;
                    c1291y.d = 3;
                }
            }
        }
        c1291y = new C1291y(this, cg6Var);
        Object obj2 = c1291y.b;
        nm6 nm6Var2 = nm6.a;
        i = c1291y.d;
        if (i != 0) {
        }
    }

    @Override // defpackage.s9
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        return Unit.a;
    }

    public static final void a(r rVar, JSONObject jSONObject) {
        jSONObject.getClass();
        x97.y((mm6) rVar.b.getValue(), null, null, rVar.new d(jSONObject, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        C1225t c1225t;
        int i;
        r rVar;
        String str2;
        r rVar2;
        Iterator<T> it;
        Object obj;
        C1164o7 c1164o7;
        if (cg6Var instanceof C1225t) {
            c1225t = (C1225t) cg6Var;
            int i2 = c1225t.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1225t.f = i2 - Integer.MIN_VALUE;
                Object obj2 = c1225t.d;
                Object obj3 = nm6.a;
                i = c1225t.f;
                if (i != 0) {
                    qgg.h0(obj2);
                    InterfaceC1192q7 interfaceC1192q7 = this.g;
                    c1225t.a = this;
                    c1225t.b = str;
                    c1225t.c = this;
                    c1225t.f = 1;
                    obj2 = interfaceC1192q7.a(str);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    rVar = this;
                    str2 = str;
                    rVar2 = rVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar2 = c1225t.c;
                    str2 = c1225t.b;
                    rVar = c1225t.a;
                    qgg.h0(obj2);
                }
                InterfaceC1122l7 interfaceC1122l7 = (InterfaceC1122l7) obj2;
                interfaceC1122l7.a(rVar.m);
                rVar2.i = interfaceC1122l7;
                it = rVar.g.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.d(((C1164o7) obj).a, str2)) {
                        break;
                    }
                }
                c1164o7 = (C1164o7) obj;
                if (c1164o7 != null || (r5 = StringsKt.toIntOrNull(c1164o7.f)) == null) {
                    Integer num = new Integer(0);
                }
                rVar.k = num;
                return Unit.a;
            }
        }
        c1225t = new C1225t(this, cg6Var);
        Object obj22 = c1225t.d;
        Object obj32 = nm6.a;
        i = c1225t.f;
        if (i != 0) {
        }
        InterfaceC1122l7 interfaceC1122l72 = (InterfaceC1122l7) obj22;
        interfaceC1122l72.a(rVar.m);
        rVar2.i = interfaceC1122l72;
        it = rVar.g.a().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        c1164o7 = (C1164o7) obj;
        if (c1164o7 != null) {
        }
        Integer num2 = new Integer(0);
        rVar.k = num2;
        return Unit.a;
    }
}
