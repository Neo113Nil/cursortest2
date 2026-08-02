package defpackage;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final class ju0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public ju0(int i) {
        switch (i) {
            case 2:
                bdt I = hag.I(Context.class);
                l18 l18Var = l18.b;
                this.a = l18Var.b(I, true);
                this.b = l18Var.b(hag.I(z66.class), true);
                this.c = l18Var.b(hag.I(i0j.class), true);
                this.d = l18Var.b(hag.I(cc7.class), true);
                this.e = l18Var.b(hag.I(frt.class), true);
                this.f = l18Var.b(hag.I(oq7.class), true);
                this.g = btf.b(new oxo(26, this));
                this.h = l18Var.b(hag.I(k6l.class), true);
                this.i = l18Var.b(hag.I(nmj.class), true);
                this.j = l18Var.b(hag.I(uwu.class), true);
                this.k = l18Var.b(hag.I(qwu.class), true);
                this.l = btf.b(new nrq(2));
                this.m = l18Var.b(hag.I(g2q.class), true);
                break;
            default:
                lhs lhsVar = new lhs("AppStart", 100, 24);
                this.a = lhsVar;
                this.b = lhs.b(lhsVar, "ContentProviders", 0, 0L, 30);
                this.c = lhs.b(lhsVar, "onCreate", 100, 30000L, 24);
                int i2 = 0;
                int i3 = 30;
                this.d = new lhs("ConfigureServices", i2, i3);
                this.e = new lhs("InitServices", i2, i3);
                this.f = new lhs("DiConfigure", i2, i3);
                this.g = new lhs("DiInjects", i2, i3);
                this.h = new lhs("AnalyticsInit", i2, i3);
                this.i = new lhs("UserInit", i2, i3);
                this.j = new lhs("ExperimentsInit", i2, i3);
                this.k = new lhs("SyncDiInit", i2, i3);
                this.l = new lhs("Jobs", i2, i3);
                this.m = new lhs("MediaInit", i2, i3);
                break;
        }
    }

    public static final Object a(ju0 ju0Var, boolean z, boolean z2, String str, String str2, String str3, z77 z77Var, boolean z3, p87 p87Var) {
        ju0Var.getClass();
        if (str3 == null) {
            return v6a.a;
        }
        if (!z3) {
            return w6a.a;
        }
        String a = ((ctd) ju0Var.b).a(Boolean.valueOf(z2), str, str2, str3, z77Var);
        return ((t1f) ju0Var.m).Z(a, new q87(z, ju0Var, new File((File) ju0Var.a, a), z77Var, str3, z2, str2, str, null), p87Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ju0 ju0Var, String str, String str2, String str3, String str4, cg6 cg6Var) {
        r87 r87Var;
        int i;
        InputStream inputStream;
        Object t7oVar;
        u4o u4oVar;
        tpi tpiVar;
        z0i z0iVar = (z0i) ju0Var.h;
        if (cg6Var instanceof r87) {
            r87Var = (r87) cg6Var;
            int i2 = r87Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r87Var.l = i2 - Integer.MIN_VALUE;
                Object obj = r87Var.j;
                nm6 nm6Var = nm6.a;
                i = r87Var.l;
                ejg ejgVar = null;
                if (i != 0) {
                    qgg.h0(obj);
                    g7e g7eVar = new g7e(ouj.n(str, "/v1/appwidget/daily"), ((y3e) ju0Var.e).b(str3, str2, str4), null);
                    r87Var.l = 1;
                    obj = z0iVar.invoke(g7eVar, r87Var);
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
                obj.getClass();
                inputStream = ((i7e) obj).c;
                if (inputStream != null) {
                    xq0.q("bodyInputStream is null");
                    return null;
                }
                try {
                    y4o y4oVar = (y4o) i4w.C((i5f) ju0Var.g, y4o.Companion.serializer(), inputStream);
                    inputStream.close();
                    y4oVar.getClass();
                    try {
                        r7o r7oVar = z7o.b;
                        u4oVar = y4oVar.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    if (u4oVar == null) {
                        throw new IllegalStateException("data is null");
                    }
                    String id = u4oVar.getId();
                    if (id == null) {
                        throw new IllegalStateException("id is null");
                    }
                    String title = u4oVar.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    f4o q = u4oVar.q();
                    if (q != null) {
                        if (!(q instanceof e4o)) {
                            throw new x7j();
                        }
                        String str5 = ((e4o) q).a;
                        if (str5 != null) {
                            ejgVar = new ejg(str5);
                        }
                    }
                    upi a = u4oVar.a();
                    if (a != null) {
                        tpiVar = new tpi();
                        Object[] objArr = a.b;
                        long[] jArr = a.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((255 & j) < 128) {
                                            x4o x4oVar = (x4o) objArr[(i3 << 3) + i5];
                                            String str6 = x4oVar.a;
                                            String str7 = x4oVar.b;
                                            if (str6 != null && str7 != null) {
                                                tpiVar.j(str7, str6);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i4 != 8) {
                                        break;
                                    }
                                }
                                if (i3 == length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        tpiVar = vso.b;
                        tpiVar.getClass();
                    }
                    if (u4oVar instanceof k4o) {
                        t7oVar = new kjg(id, title, ejgVar, tpiVar);
                    } else if (u4oVar instanceof n4o) {
                        t7oVar = new njg(id, title, ejgVar, tpiVar);
                    } else if (u4oVar instanceof q4o) {
                        t7oVar = new qjg(id, title, ejgVar, tpiVar);
                    } else {
                        if (!(u4oVar instanceof t4o)) {
                            throw new x7j();
                        }
                        t7oVar = new tjg(id, title, ejgVar, tpiVar);
                    }
                    qgg.h0(t7oVar);
                    return t7oVar;
                } finally {
                }
            }
        }
        r87Var = new r87(ju0Var, cg6Var);
        Object obj2 = r87Var.j;
        nm6 nm6Var2 = nm6.a;
        i = r87Var.l;
        ejg ejgVar2 = null;
        if (i != 0) {
        }
        obj2.getClass();
        inputStream = ((i7e) obj2).c;
        if (inputStream != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ju0 ju0Var, boolean z, cg6 cg6Var) {
        t87 t87Var;
        int i;
        qqi qqiVar;
        File file;
        try {
            if (cg6Var instanceof t87) {
                t87Var = (t87) cg6Var;
                int i2 = t87Var.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    t87Var.o = i2 - Integer.MIN_VALUE;
                    Object obj = t87Var.m;
                    nm6 nm6Var = nm6.a;
                    i = t87Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        File file2 = new File((File) ju0Var.a, "isEnabled");
                        qqiVar = (qqi) ju0Var.l;
                        t87Var.k = file2;
                        t87Var.l = qqiVar;
                        t87Var.j = z;
                        t87Var.o = 1;
                        if (qqiVar.a(t87Var) == nm6Var) {
                            return nm6Var;
                        }
                        file = file2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = t87Var.j;
                        qqiVar = t87Var.l;
                        file = t87Var.k;
                        qgg.h0(obj);
                    }
                    if (file.exists()) {
                        if (!z) {
                            throw new IllegalStateException("Already disabled");
                        }
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } else {
                        if (z) {
                            throw new IllegalStateException("Already enabled");
                        }
                        file.delete();
                    }
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            if (file.exists()) {
            }
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        t87Var = new t87(ju0Var, cg6Var);
        Object obj2 = t87Var.m;
        nm6 nm6Var2 = nm6.a;
        i = t87Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(boolean z, cg6 cg6Var) {
        s87 s87Var;
        int i;
        if (cg6Var instanceof s87) {
            s87Var = (s87) cg6Var;
            int i2 = s87Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s87Var.l = i2 - Integer.MIN_VALUE;
                Object obj = s87Var.j;
                nm6 nm6Var = nm6.a;
                i = s87Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ou7 p = x97.p((tf6) this.j, (a) this.k, null, new z11(this, z, (Continuation) null, 5), 2);
                    s87Var.l = 1;
                    obj = p.s(s87Var);
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
                return ((z7o) obj).a;
            }
        }
        s87Var = new s87(this, cg6Var);
        Object obj2 = s87Var.j;
        nm6 nm6Var2 = nm6.a;
        i = s87Var.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    public ju0(File file, ctd ctdVar, tjl tjlVar, ujl ujlVar, y3e y3eVar, b3i b3iVar, ehv ehvVar, i5f i5fVar, z0i z0iVar, b5m b5mVar, tf6 tf6Var, a aVar) {
        ctdVar.getClass();
        aVar.getClass();
        this.a = file;
        this.b = ctdVar;
        this.c = tjlVar;
        this.d = ujlVar;
        this.e = y3eVar;
        this.f = b3iVar;
        this.g = i5fVar;
        this.h = z0iVar;
        this.i = b5mVar;
        this.j = tf6Var;
        this.k = aVar;
        this.l = rqi.a();
        this.m = new t1f(1);
    }
}
