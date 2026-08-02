package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class r7e implements s8c {
    public static final cp3 f = new cp3(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final cp3 g = new cp3(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    public final String a;
    public final rwj b;
    public final Object c;
    public final jyr d;
    public final boolean e;

    public r7e(String str, rwj rwjVar, arf arfVar, jyr jyrVar, boolean z) {
        this.a = str;
        this.b = rwjVar;
        this.c = arfVar;
        this.d = jyrVar;
        this.e = z;
    }

    public static String d(String str, twh twhVar) {
        String b;
        String str2 = twhVar != null ? twhVar.a : null;
        if ((str2 == null || c.v(str2, "text/plain", false)) && (b = k.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b;
        }
        if (str2 != null) {
            return StringsKt.m0(';', str2, str2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0135 A[Catch: Exception -> 0x00d5, TryCatch #2 {Exception -> 0x00d5, blocks: (B:30:0x021e, B:31:0x0221, B:39:0x015b, B:41:0x0222, B:42:0x0227, B:83:0x009b, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:93:0x00f6, B:95:0x0142, B:99:0x010e, B:101:0x011a, B:102:0x0123, B:104:0x00bd, B:106:0x00c5, B:108:0x012d, B:109:0x0134, B:110:0x0135), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e7 A[Catch: Exception -> 0x0215, TryCatch #3 {Exception -> 0x0215, blocks: (B:17:0x01e1, B:19:0x01e7, B:21:0x020c, B:22:0x0211, B:25:0x020f, B:26:0x0218, B:27:0x021d), top: B:16:0x01e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0218 A[Catch: Exception -> 0x0215, TryCatch #3 {Exception -> 0x0215, blocks: (B:17:0x01e1, B:19:0x01e7, B:21:0x020c, B:22:0x0211, B:25:0x020f, B:26:0x0218, B:27:0x021d), top: B:16:0x01e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0222 A[Catch: Exception -> 0x00d5, TryCatch #2 {Exception -> 0x00d5, blocks: (B:30:0x021e, B:31:0x0221, B:39:0x015b, B:41:0x0222, B:42:0x0227, B:83:0x009b, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:93:0x00f6, B:95:0x0142, B:99:0x010e, B:101:0x011a, B:102:0x0123, B:104:0x00bd, B:106:0x00c5, B:108:0x012d, B:109:0x0134, B:110:0x0135), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009b A[Catch: Exception -> 0x00d5, TRY_ENTER, TryCatch #2 {Exception -> 0x00d5, blocks: (B:30:0x021e, B:31:0x0221, B:39:0x015b, B:41:0x0222, B:42:0x0227, B:83:0x009b, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:93:0x00f6, B:95:0x0142, B:99:0x010e, B:101:0x011a, B:102:0x0123, B:104:0x00bd, B:106:0x00c5, B:108:0x012d, B:109:0x0134, B:110:0x0135), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r3v19, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // defpackage.s8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        q7e q7eVar;
        ?? r4;
        fo7 fo7Var;
        fo7 fo7Var2;
        lq3 a;
        Object b;
        lq3 lq3Var;
        r7e r7eVar;
        pkn pknVar;
        o3o o3oVar;
        l3o l3oVar;
        r7e r7eVar2;
        l3o l3oVar2;
        o3o o3oVar2;
        try {
            if (continuation instanceof q7e) {
                q7eVar = (q7e) continuation;
                int i = q7eVar.o;
                if ((i & Integer.MIN_VALUE) != 0) {
                    q7eVar.o = i - Integer.MIN_VALUE;
                    Object obj = q7eVar.m;
                    nm6 nm6Var = nm6.a;
                    r4 = q7eVar.o;
                    if (r4 != 0) {
                        qgg.h0(obj);
                        rwj rwjVar = this.b;
                        boolean z = rwjVar.n.a;
                        String str = this.a;
                        if (z && (pknVar = (pkn) this.d.getValue()) != null) {
                            String str2 = rwjVar.i;
                            if (str2 == null) {
                                str2 = str;
                            }
                            l78 l78Var = pknVar.b;
                            pn3 pn3Var = pn3.d;
                            g78 g2 = l78Var.g(ovn.C(str2).c("SHA-256").e());
                            if (g2 != null) {
                                fo7Var2 = new fo7(4, g2);
                                if (fo7Var2 == null) {
                                    lac c = c();
                                    g78 g78Var = (g78) fo7Var2.b;
                                    if (g78Var.b) {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                    Long l = (Long) c.h((cak) g78Var.a.c.get(0)).e;
                                    if (l != null && l.longValue() == 0) {
                                        return new r3r(g(fo7Var2), d(str, null), bb7.c);
                                    }
                                    if (!this.e) {
                                        w9c g3 = g(fo7Var2);
                                        hq3 f2 = f(fo7Var2);
                                        return new r3r(g3, d(str, f2 != null ? (twh) f2.e.getValue() : null), bb7.c);
                                    }
                                    a = new kq3(e(), f(fo7Var2)).a();
                                    hq3 hq3Var = a.b;
                                    if (a.a == null && hq3Var != null) {
                                        return new r3r(g(fo7Var2), d(str, (twh) hq3Var.e.getValue()), bb7.c);
                                    }
                                } else {
                                    a = new kq3(e(), null).a();
                                }
                                d0o d0oVar = a.a;
                                d0oVar.getClass();
                                q7eVar.j = this;
                                q7eVar.k = fo7Var2;
                                q7eVar.l = a;
                                q7eVar.o = 1;
                                b = b(d0oVar, q7eVar);
                                if (b != nm6Var) {
                                    return nm6Var;
                                }
                                lq3Var = a;
                                obj = b;
                                r7eVar = this;
                            }
                        }
                        fo7Var2 = null;
                        if (fo7Var2 == null) {
                        }
                        d0o d0oVar2 = a.a;
                        d0oVar2.getClass();
                        q7eVar.j = this;
                        q7eVar.k = fo7Var2;
                        q7eVar.l = a;
                        q7eVar.o = 1;
                        b = b(d0oVar2, q7eVar);
                        if (b != nm6Var) {
                        }
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            l3oVar = (l3o) q7eVar.l;
                            fo7 fo7Var3 = q7eVar.k;
                            r7eVar2 = q7eVar.j;
                            try {
                                qgg.h0(obj);
                                l3oVar2 = (l3o) obj;
                            } catch (Exception e) {
                                e = e;
                                k.a(l3oVar);
                                throw e;
                            }
                            try {
                                Bitmap.Config[] configArr = k.a;
                                o3oVar2 = l3oVar2.g;
                                if (o3oVar2 != null) {
                                    throw new IllegalStateException("response body == null");
                                }
                                r7eVar2.getClass();
                                return new r3r(new p3r(o3oVar2.z(), new ji7(r7eVar2.b.a, 3), null), d(r7eVar2.a, o3oVar2.o()), l3oVar2.h != null ? bb7.d : bb7.c);
                            } catch (Exception e2) {
                                e = e2;
                                l3oVar = l3oVar2;
                                k.a(l3oVar);
                                throw e;
                            }
                        }
                        lq3 lq3Var2 = (lq3) q7eVar.l;
                        fo7Var = q7eVar.k;
                        r7eVar = q7eVar.j;
                        try {
                            qgg.h0(obj);
                            lq3Var = lq3Var2;
                            fo7Var2 = fo7Var;
                        } catch (Exception e3) {
                            e = e3;
                            if (fo7Var != null) {
                                k.a(fo7Var);
                            }
                            throw e;
                        }
                    }
                    l3o l3oVar3 = (l3o) obj;
                    Bitmap.Config[] configArr2 = k.a;
                    o3oVar = l3oVar3.g;
                    if (o3oVar != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    try {
                        fo7 h = r7eVar.h(fo7Var2, lq3Var.a, l3oVar3, lq3Var.b);
                        String str3 = r7eVar.a;
                        if (h != null) {
                            w9c g4 = r7eVar.g(h);
                            hq3 f3 = r7eVar.f(h);
                            return new r3r(g4, d(str3, f3 != null ? (twh) f3.e.getValue() : null), bb7.d);
                        }
                        if (o3oVar.g() > 0) {
                            return new r3r(new p3r(o3oVar.z(), new ji7(r7eVar.b.a, 3), null), d(str3, o3oVar.o()), l3oVar3.h != null ? bb7.d : bb7.c);
                        }
                        k.a(l3oVar3);
                        d0o e4 = r7eVar.e();
                        q7eVar.j = r7eVar;
                        q7eVar.k = h;
                        q7eVar.l = l3oVar3;
                        q7eVar.o = 2;
                        obj = r7eVar.b(e4, q7eVar);
                        if (obj != nm6Var) {
                            r7eVar2 = r7eVar;
                            l3oVar = l3oVar3;
                            l3oVar2 = (l3o) obj;
                            Bitmap.Config[] configArr3 = k.a;
                            o3oVar2 = l3oVar2.g;
                            if (o3oVar2 != null) {
                            }
                        }
                        return nm6Var;
                    } catch (Exception e5) {
                        e = e5;
                        l3oVar = l3oVar3;
                        k.a(l3oVar);
                        throw e;
                    }
                }
            }
            if (r4 != 0) {
            }
            l3o l3oVar32 = (l3o) obj;
            Bitmap.Config[] configArr22 = k.a;
            o3oVar = l3oVar32.g;
            if (o3oVar != null) {
            }
        } catch (Exception e6) {
            e = e6;
            fo7Var = r4;
        }
        q7eVar = new q7e(this, (cg6) continuation);
        Object obj2 = q7eVar.m;
        nm6 nm6Var2 = nm6.a;
        r4 = q7eVar.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v2, types: [arf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d0o d0oVar, cg6 cg6Var) {
        p7e p7eVar;
        int i;
        l3o execute;
        if (cg6Var instanceof p7e) {
            p7eVar = (p7e) cg6Var;
            int i2 = p7eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p7eVar.l = i2 - Integer.MIN_VALUE;
                Object obj = p7eVar.j;
                nm6 nm6Var = nm6.a;
                i = p7eVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Bitmap.Config[] configArr = k.a;
                    boolean d = Intrinsics.d(Looper.myLooper(), Looper.getMainLooper());
                    ?? r2 = this.c;
                    if (d) {
                        if (this.b.o.a) {
                            throw new NetworkOnMainThreadException();
                        }
                        execute = ((ds3) r2.getValue()).b(d0oVar).execute();
                        if (!execute.b() || execute.d == 304) {
                            return execute;
                        }
                        o3o o3oVar = execute.g;
                        if (o3oVar != null) {
                            k.a(o3oVar);
                        }
                        throw new r6e(execute);
                    }
                    es3 b = ((ds3) r2.getValue()).b(d0oVar);
                    p7eVar.l = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(p7eVar));
                    zt3Var.s();
                    bg6 bg6Var = new bg6(b, zt3Var);
                    b.z(bg6Var);
                    zt3Var.u(bg6Var);
                    obj = zt3Var.q();
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                execute = (l3o) obj;
                if (execute.b()) {
                }
                return execute;
            }
        }
        p7eVar = new p7e(this, cg6Var);
        Object obj2 = p7eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = p7eVar.l;
        if (i != 0) {
        }
        execute = (l3o) obj2;
        if (execute.b()) {
        }
        return execute;
    }

    public final lac c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((pkn) value).a;
    }

    public final d0o e() {
        b0o b0oVar = new b0o();
        b0oVar.g(this.a);
        rwj rwjVar = this.b;
        zvd zvdVar = rwjVar.j;
        zvdVar.getClass();
        b0oVar.c = zvdVar.m();
        for (Map.Entry entry : rwjVar.k.a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            b0oVar.f((Class) key, entry.getValue());
        }
        dq3 dq3Var = rwjVar.n;
        boolean z = dq3Var.a;
        boolean z2 = rwjVar.o.a;
        if (!z2 && z) {
            b0oVar.c(cp3.o);
        } else if (!z2 || z) {
            if (!z2 && !z) {
                b0oVar.c(g);
            }
        } else if (dq3Var.b) {
            b0oVar.c(cp3.n);
        } else {
            b0oVar.c(f);
        }
        return b0oVar.b();
    }

    public final hq3 f(fo7 fo7Var) {
        Throwable th;
        hq3 hq3Var;
        try {
            lac c = c();
            g78 g78Var = (g78) fo7Var.b;
            if (g78Var.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            ikn u = fxf.u(c.l((cak) g78Var.a.c.get(0)));
            try {
                hq3Var = new hq3(u);
                try {
                    u.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    u.close();
                } catch (Throwable th4) {
                    fob.a(th3, th4);
                }
                th = th3;
                hq3Var = null;
            }
            if (th != null) {
                throw th;
            }
            hq3Var.getClass();
            return hq3Var;
        } catch (IOException unused) {
            return null;
        }
    }

    public final w9c g(fo7 fo7Var) {
        g78 g78Var = (g78) fo7Var.b;
        if (g78Var.b) {
            xq0.q("snapshot is closed");
            return null;
        }
        cak cakVar = (cak) g78Var.a.c.get(1);
        lac c = c();
        String str = this.b.i;
        if (str == null) {
            str = this.a;
        }
        return new w9c(cakVar, c, str, fo7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fo7 h(fo7 fo7Var, d0o d0oVar, l3o l3oVar, hq3 hq3Var) {
        z6n z6nVar;
        Throwable th;
        Unit unit;
        Long l;
        Unit unit2;
        z0j b;
        Throwable th2 = null;
        if (this.b.n.b && (!this.e || (!d0oVar.a().b && !l3oVar.a().b && !Intrinsics.d(l3oVar.f.a("Vary"), "*")))) {
            int i = 1;
            if (fo7Var != null) {
                g78 g78Var = (g78) fo7Var.b;
                l78 l78Var = g78Var.c;
                synchronized (l78Var) {
                    g78Var.close();
                    b = l78Var.b(g78Var.a.a);
                }
                if (b != null) {
                    z6nVar = new z6n(i, b);
                    if (z6nVar != null) {
                        try {
                            try {
                                if (l3oVar.d != 304 || hq3Var == null) {
                                    hkn t = fxf.t(c().k(((z0j) z6nVar.b).O(0)));
                                    try {
                                        new hq3(l3oVar).b(t);
                                        unit = Unit.a;
                                        try {
                                            t.close();
                                            th = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Throwable th4) {
                                        try {
                                            t.close();
                                        } catch (Throwable th5) {
                                            fob.a(th4, th5);
                                        }
                                        th = th4;
                                        unit = null;
                                    }
                                    if (th != null) {
                                        throw th;
                                    }
                                    unit.getClass();
                                    hkn t2 = fxf.t(c().k(((z0j) z6nVar.b).O(1)));
                                    try {
                                        o3o o3oVar = l3oVar.g;
                                        o3oVar.getClass();
                                        l = Long.valueOf(o3oVar.z().q0(t2));
                                        try {
                                            t2.close();
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            t2.close();
                                        } catch (Throwable th8) {
                                            fob.a(th7, th8);
                                        }
                                        th2 = th7;
                                        l = null;
                                    }
                                    if (th2 != null) {
                                        throw th2;
                                    }
                                    l.getClass();
                                } else {
                                    k3o g2 = l3oVar.g();
                                    g2.f = wdp.Y((zvd) hq3Var.f, l3oVar.f).m();
                                    l3o a = g2.a();
                                    hkn t3 = fxf.t(c().k(((z0j) z6nVar.b).O(0)));
                                    try {
                                        new hq3(a).b(t3);
                                        unit2 = Unit.a;
                                        try {
                                            t3.close();
                                        } catch (Throwable th9) {
                                            th2 = th9;
                                        }
                                    } catch (Throwable th10) {
                                        try {
                                            t3.close();
                                        } catch (Throwable th11) {
                                            fob.a(th10, th11);
                                        }
                                        th2 = th10;
                                        unit2 = null;
                                    }
                                    if (th2 != null) {
                                        throw th2;
                                    }
                                    unit2.getClass();
                                }
                                fo7 g3 = z6nVar.g();
                                k.a(l3oVar);
                                return g3;
                            } catch (Exception e) {
                                Bitmap.Config[] configArr = k.a;
                                try {
                                    ((z0j) z6nVar.b).F(false);
                                } catch (Exception unused) {
                                }
                                throw e;
                            }
                        } catch (Throwable th12) {
                            k.a(l3oVar);
                            throw th12;
                        }
                    }
                }
                z6nVar = null;
                if (z6nVar != null) {
                }
            } else {
                pkn pknVar = (pkn) this.d.getValue();
                if (pknVar != null) {
                    String str = this.b.i;
                    if (str == null) {
                        str = this.a;
                    }
                    l78 l78Var2 = pknVar.b;
                    pn3 pn3Var = pn3.d;
                    z0j b2 = l78Var2.b(ovn.C(str).c("SHA-256").e());
                    if (b2 != null) {
                        z6nVar = new z6n(i, b2);
                        if (z6nVar != null) {
                        }
                    }
                }
                z6nVar = null;
                if (z6nVar != null) {
                }
            }
        } else if (fo7Var != null) {
            k.a(fo7Var);
        }
        return null;
    }
}
