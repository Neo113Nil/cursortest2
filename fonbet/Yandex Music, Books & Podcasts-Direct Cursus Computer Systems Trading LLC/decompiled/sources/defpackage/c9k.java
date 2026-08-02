package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import com.yandex.passport.api.g;
import com.yandex.passport.api.h;
import com.yandex.passport.api.k;
import com.yandex.passport.api.q;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.impl.q0;
import com.yandex.plus.core.locale.b;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.YMApplication;
import ru.yandex.music.profile.ProfileActivity;

/* loaded from: classes3.dex */
public final class c9k {
    public final YMApplication a;
    public final jyr b = btf.b(new d1j(8, this));

    public c9k(YMApplication yMApplication) {
        this.a = yMApplication;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        defpackage.ssg.a(6, null, "failed to acceptDevice auth", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z1 z1Var, String str, String str2, Continuation continuation) {
        s8k s8kVar;
        int i;
        if (continuation instanceof s8k) {
            s8kVar = (s8k) continuation;
            int i2 = s8kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s8kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = s8kVar.j;
                nm6 nm6Var = nm6.a;
                i = s8kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    g k = k();
                    s8kVar.l = 1;
                    if (k.g(z1Var, str, str2, s8kVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                return Unit.a;
            }
        }
        s8kVar = new s8k(this, (cg6) continuation);
        Object obj2 = s8kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = s8kVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    public final q0 b(ProfileActivity profileActivity, qyf qyfVar) {
        return k().h(profileActivity, qyfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        t8k t8kVar;
        int i;
        Object f;
        if (cg6Var instanceof t8k) {
            t8kVar = (t8k) cg6Var;
            int i2 = t8kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t8kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = t8kVar.j;
                nm6 nm6Var = nm6.a;
                i = t8kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    g k = k();
                    t8kVar.l = 1;
                    f = k.f(t8kVar);
                    if (f == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    f = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (f instanceof t7o) {
                    return f;
                }
                return null;
            }
        }
        t8kVar = new t8k(this, cg6Var);
        Object obj2 = t8kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = t8kVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (f instanceof t7o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (e(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        u8k u8kVar;
        int i;
        f fVar;
        z1 z1Var;
        Object m;
        if (cg6Var instanceof u8k) {
            u8kVar = (u8k) cg6Var;
            int i2 = u8kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u8kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = u8kVar.j;
                Object obj2 = nm6.a;
                i = u8kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    u8kVar.l = 1;
                    obj = c(u8kVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        m = ((z7o) obj).a;
                        r7o r7oVar = z7o.b;
                        if (m instanceof t7o) {
                            m = null;
                        }
                        k kVar = (k) m;
                        String str = kVar != null ? kVar.a : null;
                        if (str != null) {
                            u8kVar.l = 3;
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                fVar = (f) obj;
                if (fVar != null && (z1Var = fVar.a) != null) {
                    u8kVar.l = 2;
                    m = m(z1Var, u8kVar);
                }
                return Unit.a;
            }
        }
        u8kVar = new u8k(this, cg6Var);
        Object obj3 = u8kVar.j;
        Object obj22 = nm6.a;
        i = u8kVar.l;
        if (i != 0) {
        }
        fVar = (f) obj3;
        if (fVar != null) {
            u8kVar.l = 2;
            m = m(z1Var, u8kVar);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        v8k v8kVar;
        int i;
        if (cg6Var instanceof v8k) {
            v8kVar = (v8k) cg6Var;
            int i2 = v8kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v8kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = v8kVar.j;
                nm6 nm6Var = nm6.a;
                i = v8kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    g k = k();
                    str.getClass();
                    v8kVar.l = 1;
                    if (k.t(str, v8kVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                return Unit.a;
            }
        }
        v8kVar = new v8k(this, cg6Var);
        Object obj2 = v8kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = v8kVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(com.yandex.passport.internal.entities.k kVar, Continuation continuation) {
        w8k w8kVar;
        int i;
        Object b;
        if (continuation instanceof w8k) {
            w8kVar = (w8k) continuation;
            int i2 = w8kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w8kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = w8kVar.j;
                nm6 nm6Var = nm6.a;
                i = w8kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    g k = k();
                    w8kVar.l = 1;
                    b = k.b(kVar, w8kVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                List list = (List) (b instanceof t7o ? null : b);
                return list != null ? c5b.a : list;
            }
        }
        w8kVar = new w8k(this, (cg6) continuation);
        Object obj2 = w8kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = w8kVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        List list2 = (List) (b instanceof t7o ? null : b);
        if (list2 != null) {
        }
    }

    public final Object g(String str, aur aurVar) {
        String host = Uri.parse(str).getHost();
        String str2 = "ru";
        if (host != null && host.length() != 0) {
            int W = StringsKt.W(host, '.', 0, 6);
            Integer valueOf = Integer.valueOf(W);
            if (W <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                str2 = host.substring(valueOf.intValue() + 1);
            }
        }
        return h(str, str2, aurVar);
    }

    public final Object h(String str, String str2, Continuation continuation) {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((v5w) ((byb) qdcVar.C(I)).c(ern.a(v5w.class))).h() ? j(str, str2, (cg6) continuation) : i(str, str2, (cg6) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, cg6 cg6Var) {
        x8k x8kVar;
        int i;
        f fVar;
        Object k;
        if (cg6Var instanceof x8k) {
            x8kVar = (x8k) cg6Var;
            int i2 = x8kVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x8kVar.n = i2 - Integer.MIN_VALUE;
                Object obj = x8kVar.l;
                Object obj2 = nm6.a;
                i = x8kVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    x8kVar.j = str;
                    x8kVar.k = str2;
                    x8kVar.n = 1;
                    obj = c(x8kVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        k = ((z7o) obj).a;
                        r7o r7oVar = z7o.b;
                        if (k instanceof t7o) {
                            return null;
                        }
                        return k;
                    }
                    str2 = x8kVar.k;
                    str = x8kVar.j;
                    qgg.h0(obj);
                }
                fVar = (f) obj;
                if (fVar != null) {
                    g k2 = k();
                    Function1 p3eVar = new p3e(13, fVar, str, str2);
                    x8kVar.j = null;
                    x8kVar.k = null;
                    x8kVar.n = 2;
                    k = k2.k(p3eVar, x8kVar);
                }
                return null;
            }
        }
        x8kVar = new x8k(this, cg6Var);
        Object obj3 = x8kVar.l;
        Object obj22 = nm6.a;
        i = x8kVar.n;
        if (i != 0) {
        }
        fVar = (f) obj3;
        if (fVar != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        if (r13 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x004e, code lost:
    
        if (r0 == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, cg6 cg6Var) {
        y8k y8kVar;
        int i;
        f fVar;
        Object t7oVar;
        Object t7oVar2;
        String str3;
        Object k;
        Object obj;
        if (cg6Var instanceof y8k) {
            y8kVar = (y8k) cg6Var;
            int i2 = y8kVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y8kVar.n = i2 - Integer.MIN_VALUE;
                y8k y8kVar2 = y8kVar;
                Object obj2 = y8kVar2.l;
                Object obj3 = nm6.a;
                i = y8kVar2.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    y8kVar2.j = str;
                    y8kVar2.k = str2;
                    y8kVar2.n = 1;
                    obj2 = c(y8kVar2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        k = ((z7o) obj2).a;
                        r7o r7oVar = z7o.b;
                        if (k instanceof t7o) {
                            return null;
                        }
                        return k;
                    }
                    str2 = y8kVar2.k;
                    str = y8kVar2.j;
                    qgg.h0(obj2);
                }
                String str4 = str2;
                fVar = (f) obj2;
                if (fVar != null) {
                    return null;
                }
                l18 l18Var = l18.b;
                bdt I = hag.I(le7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String str5 = r9k.PRODUCTION.a;
                q qVar = h.b;
                int parseInt = Integer.parseInt(str5);
                qVar.getClass();
                h a = q.a(parseInt);
                if (a == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                List list = k9k.a;
                str.getClass();
                Object obj4 = j9k.a;
                try {
                    r7o r7oVar2 = z7o.b;
                    String host = new URI(str).getHost();
                    if (host != null) {
                        t7oVar = host.toLowerCase(Locale.ROOT);
                        t7oVar.getClass();
                    } else {
                        t7oVar = null;
                    }
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (t7oVar instanceof t7o) {
                    t7oVar = null;
                }
                String str6 = (String) t7oVar;
                if (str6 != null) {
                    Iterator it = k9k.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        ((h9k) obj).getClass();
                        if (str6.equals("kinopoisk.ru") || c.n(str6, ".kinopoisk.ru", false)) {
                            break;
                        }
                    }
                    if (((h9k) obj) != null) {
                        obj4 = new i9k();
                    }
                }
                boolean z = (obj4 instanceof i9k ? (i9k) obj4 : null) != null;
                if (z) {
                    str = Uri.parse(a.a.a == h.e.a.a ? "https://sso.passport-test.yandex.ru/push" : "https://sso.passport.yandex.ru/push").buildUpon().appendQueryParameter("uuid", eta.e()).appendQueryParameter("retpath", str).build().toString();
                    str.getClass();
                }
                String str7 = str;
                if (z) {
                    try {
                        r7o r7oVar4 = z7o.b;
                        t7oVar2 = v3g.Q(CookieManager.getInstance().getCookie("https://yandex.ru"));
                    } catch (Throwable th2) {
                        r7o r7oVar5 = z7o.b;
                        t7oVar2 = new t7o(th2);
                    }
                    if (t7oVar2 instanceof t7o) {
                        t7oVar2 = null;
                    }
                    str3 = (String) t7oVar2;
                } else {
                    str3 = null;
                }
                g k2 = k();
                Function1 i50Var = new i50(fVar, str7, str4, str3, 12);
                y8kVar2.j = null;
                y8kVar2.k = null;
                y8kVar2.n = 2;
                k = k2.k(i50Var, y8kVar2);
            }
        }
        y8kVar = new y8k(this, cg6Var);
        y8k y8kVar22 = y8kVar;
        Object obj22 = y8kVar22.l;
        Object obj32 = nm6.a;
        i = y8kVar22.n;
        if (i != 0) {
        }
        String str42 = str2;
        fVar = (f) obj22;
        if (fVar != null) {
        }
    }

    public final g k() {
        return (g) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, cg6 cg6Var) {
        z8k z8kVar;
        int i;
        if (cg6Var instanceof z8k) {
            z8kVar = (z8k) cg6Var;
            int i2 = z8kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z8kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = z8kVar.j;
                nm6 nm6Var = nm6.a;
                i = z8kVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                g k = k();
                l18 l18Var = l18.b;
                bdt I = hag.I(le7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String str2 = r9k.PRODUCTION.a;
                q qVar = h.b;
                int parseInt = Integer.parseInt(str2);
                qVar.getClass();
                h a = q.a(parseInt);
                if (a == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                z1 d = b.d(a, Long.parseLong(str));
                z8kVar.l = 1;
                Object e = k.e(d, z8kVar);
                return e == nm6Var ? nm6Var : e;
            }
        }
        z8kVar = new z8k(this, cg6Var);
        Object obj2 = z8kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = z8kVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(z1 z1Var, cg6 cg6Var) {
        a9k a9kVar;
        int i;
        if (cg6Var instanceof a9k) {
            a9kVar = (a9k) cg6Var;
            int i2 = a9kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a9kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a9kVar.j;
                nm6 nm6Var = nm6.a;
                i = a9kVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                g k = k();
                a9kVar.l = 1;
                Object e = k.e(z1Var, a9kVar);
                return e == nm6Var ? nm6Var : e;
            }
        }
        a9kVar = new a9k(this, cg6Var);
        Object obj2 = a9kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a9kVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, Continuation continuation) {
        b9k b9kVar;
        int i;
        Object e;
        String str2;
        if (continuation instanceof b9k) {
            b9kVar = (b9k) continuation;
            int i2 = b9kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b9kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = b9kVar.j;
                nm6 nm6Var = nm6.a;
                i = b9kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    g k = k();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(le7.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str3 = r9k.PRODUCTION.a;
                    q qVar = h.b;
                    int parseInt = Integer.parseInt(str3);
                    qVar.getClass();
                    h a = q.a(parseInt);
                    if (a == null) {
                        xq0.x("Required value was null.");
                        return null;
                    }
                    z1 d = b.d(a, Long.parseLong(str));
                    b9kVar.l = 1;
                    e = k.e(d, b9kVar);
                    if (e == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    e = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (e instanceof t7o) {
                    e = null;
                }
                k kVar = (k) e;
                str2 = kVar == null ? kVar.a : null;
                if (str2 == null) {
                    return str2;
                }
                return null;
            }
        }
        b9kVar = new b9k(this, (cg6) continuation);
        Object obj2 = b9kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = b9kVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (e instanceof t7o) {
        }
        k kVar2 = (k) e;
        if (kVar2 == null) {
        }
        if (str2 == null) {
        }
    }
}
