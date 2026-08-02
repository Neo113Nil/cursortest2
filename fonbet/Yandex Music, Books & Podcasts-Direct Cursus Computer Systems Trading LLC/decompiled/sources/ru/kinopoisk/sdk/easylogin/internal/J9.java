package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.clc;
import defpackage.eno;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.uah;
import defpackage.x97;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import defpackage.zsd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.AbstractC1066h7;
import ru.kinopoisk.sdk.easylogin.internal.C1288x9;
import ru.kinopoisk.sdk.easylogin.internal.H0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1080i7;
import ru.kinopoisk.sdk.easylogin.internal.P;
import ru.kinopoisk.sdk.easylogin.internal.W8;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class J9 implements I9 {
    public static final /* synthetic */ int g = 0;

    @NotNull
    public final C1152n9 a;

    @NotNull
    public final Oc b;

    @NotNull
    public final C1288x9 c;

    @NotNull
    public final InterfaceC1228t2 d;
    public String e;
    public String f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/J9$a;", "", "", "TAG", "Ljava/lang/String;", "android_easylogin_tvauth_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public J9(@NotNull C1152n9 c1152n9, @NotNull Oc oc, @NotNull C1288x9 c1288x9, @NotNull InterfaceC1228t2 interfaceC1228t2) {
        c1152n9.getClass();
        oc.getClass();
        c1288x9.getClass();
        interfaceC1228t2.getClass();
        this.a = c1152n9;
        this.b = oc;
        this.c = c1288x9;
        this.d = interfaceC1228t2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(11:11|12|13|(1:15)|16|(1:18)|(1:20)|21|(1:23)|24|(2:26|27)(2:29|30))(2:32|33))(2:34|35))(2:39|(2:41|(2:43|(2:45|46)(2:47|(4:49|(1:51)|52|(2:54|38)(1:55))(2:56|57)))(2:58|59))(2:60|61))|36))|64|6|7|(0)(0)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        if (r14 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
    
        r14 = defpackage.z7o.b;
        r14 = new defpackage.t7o(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // ru.kinopoisk.sdk.easylogin.internal.I9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull cg6 cg6Var) {
        N9 n9;
        int i;
        J9 j9;
        if (cg6Var instanceof N9) {
            n9 = (N9) cg6Var;
            int i2 = n9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n9.d = i2 - Integer.MIN_VALUE;
                Object obj = n9.b;
                nm6 nm6Var = nm6.a;
                i = n9.d;
                if (i != 0) {
                    qgg.h0(obj);
                    Timber.Companion companion = Timber.INSTANCE;
                    companion.tag("TvAuthScenarioManager").v("Checking user code. User code from tv = [%s], entered chars = [%s], type = [%s]", this.e, str, this.f);
                    String str2 = this.e;
                    if (str2 == null) {
                        xq0.q("User code was not requested");
                        return null;
                    }
                    if (str.length() != 2) {
                        companion.tag("TvAuthScenarioManager").v("Wrong characters length", new Object[0]);
                        xq0.x("Wrong user code length");
                        return null;
                    }
                    if (!kotlin.text.c.n(str2, str, false)) {
                        companion.tag("TvAuthScenarioManager").v("Wrong user code ending", new Object[0]);
                        return H0.a.a;
                    }
                    Pc puid = this.d.getPuid();
                    if (puid == null) {
                        xq0.q("Puid value is empty");
                        return null;
                    }
                    String str3 = this.f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    r7o r7oVar = z7o.b;
                    C1288x9 c1288x9 = this.c;
                    c1288x9.getClass();
                    C1288x9.a.INSTANCE.getClass();
                    String str4 = (String) uah.i(C1288x9.a.t, c1288x9.a().f).getOrDefault(str3, "");
                    companion.tag("TvAuthScenarioManager").v("Confirming user code [%s] with client auth type [%s]", str2, str3);
                    Oc oc = this.b;
                    n9.a = this;
                    n9.d = 1;
                    if (oc.verify(puid, str2, str4, n9) == nm6Var) {
                        return nm6Var;
                    }
                    j9 = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Object t7oVar = (P) obj;
                        r7o r7oVar2 = z7o.b;
                        boolean z = t7oVar instanceof t7o;
                        if (!z) {
                            Timber.INSTANCE.tag("TvAuthScenarioManager").v("Successfully authorized TV", new Object[0]);
                        }
                        Throwable a2 = z7o.a(t7oVar);
                        if (a2 != null) {
                            Timber.INSTANCE.tag("TvAuthScenarioManager").d(a2, "Failed to authorize TV by user code", new Object[0]);
                        }
                        if (z) {
                            t7oVar = null;
                        }
                        P p = (P) t7oVar;
                        return (p != null ? p.a : null) == P.c.Authorized ? H0.b.a : H0.a.a;
                    }
                    j9 = n9.a;
                    qgg.h0(obj);
                }
                Timber.INSTANCE.tag("TvAuthScenarioManager").v("Waiting for tv to become authorized", new Object[0]);
                C1152n9 c1152n9 = j9.a;
                O9 o9 = O9.a;
                n9.a = null;
                n9.d = 2;
                obj = j9.a(c1152n9, o9, n9);
            }
        }
        n9 = new N9(this, cg6Var);
        Object obj2 = n9.b;
        nm6 nm6Var2 = nm6.a;
        i = n9.d;
        if (i != 0) {
        }
        Timber.INSTANCE.tag("TvAuthScenarioManager").v("Waiting for tv to become authorized", new Object[0]);
        C1152n9 c1152n92 = j9.a;
        O9 o92 = O9.a;
        n9.a = null;
        n9.d = 2;
        obj2 = j9.a(c1152n92, o92, n9);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ru.kinopoisk.sdk.easylogin.internal.I9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull cg6 cg6Var) {
        P9 p9;
        Object obj;
        int i;
        C1152n9 c1152n9;
        J9 j9;
        J9 j92;
        J9 j93;
        J9 j94;
        W8 a2;
        if (cg6Var instanceof P9) {
            p9 = (P9) cg6Var;
            int i2 = p9.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p9.e = i2 - Integer.MIN_VALUE;
                obj = p9.c;
                nm6 nm6Var = nm6.a;
                i = p9.e;
                if (i != 0) {
                    qgg.h0(obj);
                    C1152n9 c1152n92 = this.a;
                    p9.a = this;
                    p9.b = c1152n92;
                    p9.e = 1;
                    Object a3 = a(p9);
                    if (a3 != nm6Var) {
                        c1152n9 = c1152n92;
                        obj = a3;
                        j9 = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j94 = (J9) p9.b;
                        j93 = p9.a;
                        qgg.h0(obj);
                        j94.getClass();
                        a2 = a((P) obj);
                        if (a2 instanceof W8.d) {
                            W8.d dVar = (W8.d) a2;
                            j93.e = dVar.a;
                            j93.f = dVar.b;
                        }
                        return a2;
                    }
                    c1152n9 = (C1152n9) p9.b;
                    j92 = p9.a;
                    qgg.h0(obj);
                    Q9 q9 = new Q9(j92);
                    p9.a = j92;
                    p9.b = j92;
                    p9.e = 3;
                    obj = j92.a(c1152n9, q9, p9);
                    if (obj != nm6Var) {
                        j93 = j92;
                        j94 = j93;
                        j94.getClass();
                        a2 = a((P) obj);
                        if (a2 instanceof W8.d) {
                        }
                        return a2;
                    }
                    return nm6Var;
                }
                c1152n9 = (C1152n9) p9.b;
                j9 = p9.a;
                qgg.h0(obj);
                if (!(((InterfaceC1080i7) obj) instanceof InterfaceC1080i7.b)) {
                    return W8.c.a;
                }
                Pc puid = j9.d.getPuid();
                Long l = puid != null ? new Long(puid.a) : null;
                p9.a = j9;
                p9.b = c1152n9;
                p9.e = 2;
                defpackage.s9 s9Var = c1152n9.a;
                Object V = x97.V(s9Var.a.a(), new C1086j(new V8(l), s9Var, "execute", defpackage.s9.c, C1072i.a, null), p9);
                if (V != nm6Var) {
                    V = Unit.a;
                }
                if (V != nm6Var) {
                    V = Unit.a;
                }
                if (V != nm6Var) {
                    j92 = j9;
                    Q9 q92 = new Q9(j92);
                    p9.a = j92;
                    p9.b = j92;
                    p9.e = 3;
                    obj = j92.a(c1152n9, q92, p9);
                    if (obj != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        p9 = new P9(this, cg6Var);
        obj = p9.c;
        nm6 nm6Var2 = nm6.a;
        i = p9.e;
        if (i != 0) {
        }
        if (!(((InterfaceC1080i7) obj) instanceof InterfaceC1080i7.b)) {
        }
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.I9
    public final void cancel() {
        this.e = null;
        this.f = null;
        this.a.a.close();
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.I9
    public final Object a(@NotNull C1036f5 c1036f5) {
        defpackage.s9 s9Var = this.a.a;
        Timber.INSTANCE.tag(s9Var.a()).i("Opening application install page. Descriptor=[%s]", s9Var.b());
        Object V = x97.V(s9Var.a.a(), new C1128m(s9Var, null), c1036f5);
        nm6 nm6Var = nm6.a;
        if (V != nm6Var) {
            V = Unit.a;
        }
        if (V != nm6Var) {
            V = Unit.a;
        }
        return V == nm6Var ? V : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.kinopoisk.sdk.easylogin.internal.I9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull cg6 cg6Var) {
        R9 r9;
        int i;
        try {
            if (cg6Var instanceof R9) {
                r9 = (R9) cg6Var;
                int i2 = r9.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    r9.c = i2 - Integer.MIN_VALUE;
                    Object obj = r9.a;
                    Object obj2 = nm6.a;
                    i = r9.c;
                    if (i != 0) {
                        qgg.h0(obj);
                        C1152n9 c1152n9 = this.a;
                        r9.c = 1;
                        defpackage.s9 s9Var = c1152n9.a;
                        Timber.INSTANCE.tag(s9Var.a()).i("Opening application. Descriptor=[%s]", s9Var.b());
                        Object V = x97.V(s9Var.a.a(), new C1114l(s9Var, null), r9);
                        if (V != obj2) {
                            V = Unit.a;
                        }
                        if (V != obj2) {
                            V = Unit.a;
                        }
                        if (V == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return InterfaceC1080i7.a.a;
                }
            }
            if (i != 0) {
            }
            return InterfaceC1080i7.a.a;
        } catch (AbstractC1066h7.a unused) {
            return InterfaceC1080i7.b.a;
        }
        r9 = new R9(this, cg6Var);
        Object obj3 = r9.a;
        Object obj22 = nm6.a;
        i = r9.c;
    }

    public static W8 a(P p) {
        switch (p.getA()) {
            case Starting:
            case Unknown:
                throw new IllegalStateException(("The state " + p.getA() + " was not expected").toString());
            case WaitingForConfirmation:
                String b = p.getB();
                if (b != null) {
                    String c = p.getC();
                    if (c != null) {
                        return new W8.d(b, c);
                    }
                    xq0.x("Type expected but not provided");
                    return null;
                }
                xq0.x("User code expected but not provided");
                return null;
            case Authorized:
                return W8.a.a;
            case Timeout:
            case Canceled:
            case Error:
                return new W8.b(new IllegalStateException("Unexpected status received: " + p.getA()));
            default:
                b6e.s();
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c6, code lost:
    
        if (defpackage.y2x.p(r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c6 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C1152n9 c1152n9, Function1 function1, cg6 cg6Var) {
        K9 k9;
        int i;
        J9 j9;
        C1152n9 c1152n92;
        Function1 function12;
        J9 j92;
        P p;
        Object g0;
        if (cg6Var instanceof K9) {
            k9 = (K9) cg6Var;
            int i2 = k9.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k9.f = i2 - Integer.MIN_VALUE;
                Object obj = k9.d;
                nm6 nm6Var = nm6.a;
                i = k9.f;
                if (i != 0) {
                    qgg.h0(obj);
                    j9 = this;
                    Timber.INSTANCE.tag("TvAuthScenarioManager").v("Getting auth process state...", new Object[0]);
                    clc z0 = zsd.z0(new eno(new L9(c1152n9, null)), j9.c.a().q, new M9(j9, null));
                    k9.a = j9;
                    k9.b = c1152n9;
                    k9.c = function1;
                    k9.f = 1;
                    g0 = zsd.g0(z0, k9);
                    if (g0 != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = k9.c;
                    c1152n92 = k9.b;
                    j92 = k9.a;
                    qgg.h0(obj);
                    C1152n9 c1152n93 = c1152n92;
                    function1 = function12;
                    c1152n9 = c1152n93;
                    j9 = j92;
                    Timber.INSTANCE.tag("TvAuthScenarioManager").v("Getting auth process state...", new Object[0]);
                    clc z02 = zsd.z0(new eno(new L9(c1152n9, null)), j9.c.a().q, new M9(j9, null));
                    k9.a = j9;
                    k9.b = c1152n9;
                    k9.c = function1;
                    k9.f = 1;
                    g0 = zsd.g0(z02, k9);
                    if (g0 != nm6Var) {
                        Function1 function13 = function1;
                        c1152n92 = c1152n9;
                        function12 = function13;
                        j92 = j9;
                        obj = g0;
                        p = (P) obj;
                        Timber.INSTANCE.tag("TvAuthScenarioManager").v("Got state %s", p);
                        if (!((Boolean) function12.invoke(p)).booleanValue()) {
                            return p;
                        }
                        C1288x9 c1288x9 = j92.c;
                        c1288x9.getClass();
                        msa msaVar = nsa.b;
                        long N = yd5.N(c1288x9.a().o, ssa.MILLISECONDS);
                        k9.a = j92;
                        k9.b = c1152n92;
                        k9.c = function12;
                        k9.f = 2;
                    }
                    return nm6Var;
                }
                function12 = k9.c;
                c1152n92 = k9.b;
                j92 = k9.a;
                qgg.h0(obj);
                p = (P) obj;
                Timber.INSTANCE.tag("TvAuthScenarioManager").v("Got state %s", p);
                if (!((Boolean) function12.invoke(p)).booleanValue()) {
                }
            }
        }
        k9 = new K9(this, cg6Var);
        Object obj2 = k9.d;
        nm6 nm6Var2 = nm6.a;
        i = k9.f;
        if (i != 0) {
        }
    }
}
