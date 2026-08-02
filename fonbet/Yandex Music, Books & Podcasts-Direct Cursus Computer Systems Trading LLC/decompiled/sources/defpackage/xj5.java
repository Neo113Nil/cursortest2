package defpackage;

import android.app.Activity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class xj5 {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;

    public xj5(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, jyr jyrVar6, jyr jyrVar7, jyr jyrVar8) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
        this.d = jyrVar4;
        this.e = jyrVar5;
        this.f = jyrVar6;
        this.g = jyrVar7;
        this.h = jyrVar8;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zh5 zh5Var, boolean z, long j, cg6 cg6Var) {
        uj5 uj5Var;
        int i;
        xh5 xh5Var;
        if (cg6Var instanceof uj5) {
            uj5Var = (uj5) cg6Var;
            int i2 = uj5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uj5Var.n = i2 - Integer.MIN_VALUE;
                Object obj = uj5Var.l;
                nm6 nm6Var = nm6.a;
                i = uj5Var.n;
                jyr jyrVar = this.b;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    pi5 pi5Var = (pi5) jyrVar.getValue();
                    String str = zh5Var.a;
                    uj5Var.j = zh5Var;
                    uj5Var.k = z;
                    uj5Var.n = 1;
                    pi5Var.getClass();
                    obj = tyf.L(j, new ov(pi5Var, str, continuation, 9), uj5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = uj5Var.k;
                    zh5Var = uj5Var.j;
                    qgg.h0(obj);
                }
                xh5Var = (xh5) obj;
                if (xh5Var == null || !z) {
                    return xh5Var;
                }
                String d = zh5Var.d();
                if (d != null) {
                    return pi5.a((pi5) jyrVar.getValue(), d);
                }
                return null;
            }
        }
        uj5Var = new uj5(this, cg6Var);
        Object obj2 = uj5Var.l;
        nm6 nm6Var2 = nm6.a;
        i = uj5Var.n;
        jyr jyrVar2 = this.b;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        xh5Var = (xh5) obj2;
        if (xh5Var == null) {
        }
        return xh5Var;
    }

    public final boolean b(xh5 xh5Var, zh5 zh5Var, Activity activity) {
        if (xh5Var instanceof dh5) {
            dfi.r("CommunicationTrigger.Banner can't be processed in CommunicationTriggerProcessor", "CommunicationTriggerProcessor");
            return false;
        }
        if (xh5Var instanceof kh5) {
            dfi.r("CommunicationTrigger.BarAbove can't be processed in CommunicationTriggerProcessor", "CommunicationTriggerProcessor");
            return false;
        }
        if (xh5Var instanceof mh5) {
            ((mj5) this.c.getValue()).a(xh5Var, zh5Var, activity);
            return true;
        }
        if (xh5Var instanceof lh5) {
            ((mj5) this.d.getValue()).a(xh5Var, zh5Var, activity);
            return true;
        }
        if (xh5Var instanceof ph5) {
            ((mj5) this.e.getValue()).a(xh5Var, zh5Var, activity);
            return true;
        }
        if (xh5Var instanceof vh5) {
            ((mj5) this.f.getValue()).a(xh5Var, zh5Var, activity);
            return true;
        }
        b6e.s();
        return false;
    }

    public final yj5 c() {
        return (yj5) this.h.getValue();
    }

    public final boolean d(zh5 zh5Var, xh5 xh5Var) {
        kj5 kj5Var = (kj5) this.g.getValue();
        kj5Var.getClass();
        zh5Var.getClass();
        xh5Var.getClass();
        Collection values = kj5Var.a.values();
        values.getClass();
        Collection collection = values;
        boolean z = true;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((Boolean) ((Function2) it.next()).invoke(zh5Var, xh5Var)).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            ssg.a(4, "CommunicationTriggerProcessor", "notification is filtered", null);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6 A[Catch: all -> 0x0032, CancellationException -> 0x0038, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0038, all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c0, B:14:0x00c2, B:16:0x00c6, B:41:0x00f4, B:43:0x00f8, B:45:0x0100, B:51:0x0118, B:72:0x0164, B:73:0x0169, B:77:0x0049, B:78:0x009a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4 A[Catch: all -> 0x0032, CancellationException -> 0x0038, TRY_ENTER, TryCatch #7 {CancellationException -> 0x0038, all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c0, B:14:0x00c2, B:16:0x00c6, B:41:0x00f4, B:43:0x00f8, B:45:0x0100, B:51:0x0118, B:72:0x0164, B:73:0x0169, B:77:0x0049, B:78:0x009a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, xqn] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [xqn] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r9v14, types: [xqn] */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8, types: [xqn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zh5 zh5Var, Activity activity, boolean z, String str, cg6 cg6Var) {
        vj5 vj5Var;
        int i;
        ?? r13;
        String str2;
        zh5 zh5Var2;
        kk5 kk5Var;
        zh5 zh5Var3;
        ?? r9;
        zh5 zh5Var4;
        xqn xqnVar;
        zh5 zh5Var5;
        xqn xqnVar2;
        xyo xyoVar;
        try {
            if (cg6Var instanceof vj5) {
                vj5Var = (vj5) cg6Var;
                int i2 = vj5Var.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vj5Var.o = i2 - Integer.MIN_VALUE;
                    Object obj = vj5Var.m;
                    nm6 nm6Var = nm6.a;
                    i = vj5Var.o;
                    String str3 = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        yj5 c = c();
                        String str4 = zh5Var.a;
                        c.a(str4, z);
                        r13 = new xqn();
                        try {
                            if (activity.isFinishing() || activity.isDestroyed()) {
                                r13.a = kk5.ACTIVITY_GONE;
                                Boolean bool = Boolean.FALSE;
                                yj5 c2 = c();
                                kk5 kk5Var2 = (kk5) r13.a;
                                if (kk5Var2 == null) {
                                    kk5Var2 = kk5.ERROR;
                                }
                                c2.b(str4, kk5Var2, null, null);
                                return bool;
                            }
                            jyr jyrVar = this.a;
                            if (z != 0) {
                                oi5 oi5Var = (oi5) jyrVar.getValue();
                                List w = xz0.w(new String[]{str4, zh5Var.d()});
                                vj5Var.j = zh5Var;
                                vj5Var.k = activity;
                                vj5Var.l = r13;
                                vj5Var.o = 1;
                                e5b e5bVar = e5b.a;
                                e5bVar.getClass();
                                Object b = oi5Var.b(w, str, e5bVar, vj5Var);
                                if (b != nm6Var) {
                                    zh5Var5 = zh5Var;
                                    xqnVar2 = r13;
                                    obj = b;
                                    xyoVar = (xyo) obj;
                                    r9 = xqnVar2;
                                    zh5Var3 = zh5Var5;
                                }
                            } else {
                                oi5 oi5Var2 = (oi5) jyrVar.getValue();
                                String str5 = zh5Var.a;
                                vj5Var.j = zh5Var;
                                vj5Var.k = activity;
                                vj5Var.l = r13;
                                vj5Var.o = 2;
                                Object e = oi5.e(oi5Var2, str5, str, vj5Var, 4);
                                if (e != nm6Var) {
                                    zh5Var4 = zh5Var;
                                    xqnVar = r13;
                                    obj = e;
                                    xyoVar = (xyo) obj;
                                    r9 = xqnVar;
                                    zh5Var3 = zh5Var4;
                                }
                            }
                            return nm6Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            z = zh5Var;
                            zh5Var = r13;
                            str2 = null;
                            r9 = zh5Var;
                            zh5Var3 = z;
                            try {
                                r9.a = kk5.TIMEOUT;
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                r13 = r9;
                                zh5Var2 = zh5Var3;
                                yj5 c3 = c();
                                String str6 = zh5Var2.a;
                                kk5Var = (kk5) r13.a;
                                if (kk5Var == null) {
                                    kk5Var = kk5.ERROR;
                                }
                                c3.b(str6, kk5Var, str3, str2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = null;
                            zh5Var2 = zh5Var;
                            yj5 c32 = c();
                            String str62 = zh5Var2.a;
                            kk5Var = (kk5) r13.a;
                            if (kk5Var == null) {
                            }
                            c32.b(str62, kk5Var, str3, str2);
                            throw th;
                        }
                    }
                    if (i == 1) {
                        xqn xqnVar3 = vj5Var.l;
                        activity = vj5Var.k;
                        zh5 zh5Var6 = vj5Var.j;
                        qgg.h0(obj);
                        xqnVar2 = xqnVar3;
                        zh5Var5 = zh5Var6;
                        xyoVar = (xyo) obj;
                        r9 = xqnVar2;
                        zh5Var3 = zh5Var5;
                    } else {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xqn xqnVar4 = vj5Var.l;
                        activity = vj5Var.k;
                        zh5 zh5Var7 = vj5Var.j;
                        qgg.h0(obj);
                        xqnVar = xqnVar4;
                        zh5Var4 = zh5Var7;
                        xyoVar = (xyo) obj;
                        r9 = xqnVar;
                        zh5Var3 = zh5Var4;
                    }
                    if (!(xyoVar instanceof vyo)) {
                        r9.a = kk5.REQUEST_FAILED;
                        String message = ((vyo) xyoVar).a.getMessage();
                        try {
                            Boolean bool2 = Boolean.FALSE;
                            yj5 c4 = c();
                            String str7 = zh5Var3.a;
                            kk5 kk5Var3 = (kk5) r9.a;
                            if (kk5Var3 == null) {
                                kk5Var3 = kk5.ERROR;
                            }
                            c4.b(str7, kk5Var3, null, message);
                            return bool2;
                        } catch (CancellationException e3) {
                            str2 = message;
                            e = e3;
                            r9 = r9;
                            zh5Var3 = zh5Var3;
                            r9.a = kk5.TIMEOUT;
                            throw e;
                        } catch (Throwable th3) {
                            str2 = message;
                            th = th3;
                            r13 = r9;
                            zh5Var2 = zh5Var3;
                            yj5 c322 = c();
                            String str622 = zh5Var2.a;
                            kk5Var = (kk5) r13.a;
                            if (kk5Var == null) {
                            }
                            c322.b(str622, kk5Var, str3, str2);
                            throw th;
                        }
                    }
                    if (!(xyoVar instanceof wyo)) {
                        throw new x7j();
                    }
                    xh5 xh5Var = (xh5) ((wyo) xyoVar).a;
                    if (xh5Var == null) {
                        r9.a = kk5.NO_TRIGGER;
                        Boolean bool3 = Boolean.FALSE;
                        yj5 c5 = c();
                        String str8 = zh5Var3.a;
                        kk5 kk5Var4 = (kk5) r9.a;
                        if (kk5Var4 == null) {
                            kk5Var4 = kk5.ERROR;
                        }
                        c5.b(str8, kk5Var4, null, null);
                        return bool3;
                    }
                    String name = xh5Var.a().a.name();
                    try {
                        boolean d = d(zh5Var3, xh5Var);
                        String str9 = zh5Var3.a;
                        if (d) {
                            r9.a = kk5.TRY_SHOW;
                            Boolean valueOf = Boolean.valueOf(b(xh5Var, zh5Var3, activity));
                            yj5 c6 = c();
                            kk5 kk5Var5 = (kk5) r9.a;
                            if (kk5Var5 == null) {
                                kk5Var5 = kk5.ERROR;
                            }
                            c6.b(str9, kk5Var5, name, null);
                            return valueOf;
                        }
                        r9.a = kk5.FILTERED;
                        Boolean bool4 = Boolean.FALSE;
                        yj5 c7 = c();
                        kk5 kk5Var6 = (kk5) r9.a;
                        if (kk5Var6 == null) {
                            kk5Var6 = kk5.ERROR;
                        }
                        c7.b(str9, kk5Var6, name, null);
                        return bool4;
                    } catch (CancellationException e4) {
                        e = e4;
                        str2 = null;
                        str3 = name;
                        r9 = r9;
                        zh5Var3 = zh5Var3;
                        r9.a = kk5.TIMEOUT;
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = null;
                        str3 = name;
                        r13 = r9;
                        zh5Var2 = zh5Var3;
                        yj5 c3222 = c();
                        String str6222 = zh5Var2.a;
                        kk5Var = (kk5) r13.a;
                        if (kk5Var == null) {
                        }
                        c3222.b(str6222, kk5Var, str3, str2);
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
            if (!(xyoVar instanceof vyo)) {
            }
        } catch (CancellationException e5) {
            e = e5;
        } catch (Throwable th5) {
            th = th5;
            r13 = zh5Var;
            zh5Var = z;
        }
        vj5Var = new vj5(this, cg6Var);
        Object obj2 = vj5Var.m;
        nm6 nm6Var2 = nm6.a;
        i = vj5Var.o;
        String str32 = null;
    }

    public final boolean f(zh5 zh5Var, Activity activity, boolean z, String str) {
        kk5 kk5Var;
        String str2;
        jyr jyrVar = this.b;
        zh5Var.getClass();
        activity.getClass();
        yj5 c = c();
        String str3 = zh5Var.a;
        c.a(str3, z);
        try {
            pi5 pi5Var = (pi5) jyrVar.getValue();
            pi5Var.getClass();
            str3.getClass();
            xh5 b = pi5Var.b(str3, str);
            if (b == null && z) {
                String d = zh5Var.d();
                b = d != null ? pi5.a((pi5) jyrVar.getValue(), d) : null;
            }
            if (b == null) {
                c().b(str3, kk5.NO_TRIGGER, null, null);
                return false;
            }
            str2 = b.a().a.name();
            try {
                if (!d(zh5Var, b)) {
                    c().b(str3, kk5.FILTERED, str2, null);
                    return false;
                }
                kk5Var = kk5.TRY_SHOW;
                try {
                    boolean b2 = b(b, zh5Var, activity);
                    c().b(str3, kk5Var, str2, null);
                    return b2;
                } catch (Throwable th) {
                    th = th;
                    yj5 c2 = c();
                    if (kk5Var == null) {
                        kk5Var = kk5.ERROR;
                    }
                    c2.b(str3, kk5Var, str2, null);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                kk5Var = null;
            }
        } catch (Throwable th3) {
            th = th3;
            kk5Var = null;
            str2 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(zh5 zh5Var, Activity activity, boolean z, long j, cg6 cg6Var) {
        wj5 wj5Var;
        int i;
        zh5 zh5Var2;
        if (cg6Var instanceof wj5) {
            wj5Var = (wj5) cg6Var;
            int i2 = wj5Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wj5Var.n = i2 - Integer.MIN_VALUE;
                wj5 wj5Var2 = wj5Var;
                Object obj = wj5Var2.l;
                Object obj2 = nm6.a;
                i = wj5Var2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j <= 0) {
                        ssg.a(5, "CommunicationTriggerProcessor", "timeout is <=0", null);
                        return Boolean.valueOf(f(zh5Var, activity, z, null));
                    }
                    wj5Var2.j = zh5Var;
                    wj5Var2.k = activity;
                    wj5Var2.n = 1;
                    obj = a(zh5Var, z, j, wj5Var2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    zh5Var2 = zh5Var;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    activity = wj5Var2.k;
                    zh5Var2 = wj5Var2.j;
                    qgg.h0(obj);
                }
                xh5 xh5Var = (xh5) obj;
                return xh5Var != null ? Boolean.FALSE : (activity.isFinishing() || activity.isDestroyed()) ? Boolean.FALSE : !d(zh5Var2, xh5Var) ? Boolean.FALSE : Boolean.valueOf(b(xh5Var, zh5Var2, activity));
            }
        }
        wj5Var = new wj5(this, cg6Var);
        wj5 wj5Var22 = wj5Var;
        Object obj3 = wj5Var22.l;
        Object obj22 = nm6.a;
        i = wj5Var22.n;
        if (i != 0) {
        }
        xh5 xh5Var2 = (xh5) obj3;
        if (xh5Var2 != null) {
        }
    }
}
