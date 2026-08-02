package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class aw0 {
    public final String a;
    public final AtomicBoolean b;
    public final zi3 c;
    public final pv0 d;
    public final rv0 e;
    public final bld f;
    public final ymq g;
    public final boolean h;
    public final x6k i;
    public final x6k j;
    public Object k;
    public final w2f l;
    public final xdr m;

    public aw0(pv0 pv0Var, rv0 rv0Var, Bundle bundle, int i) {
        bundle = (i & 4) != 0 ? null : bundle;
        bld bldVar = bld.a;
        pv0Var.getClass();
        this.a = ot0.x(rv0Var.a);
        this.b = new AtomicBoolean(true);
        this.c = men.g(Integer.MAX_VALUE, 6, null);
        this.d = pv0Var;
        this.e = rv0Var;
        this.f = bldVar;
        this.g = wmq.a;
        this.h = true;
        int i2 = rv0Var.a;
        if (Integer.MIN_VALUE <= i2 && i2 < -1) {
            xq0.x("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        wvo wvoVar = wvo.e;
        this.i = new x6k(null, wvoVar);
        this.j = new x6k(bundle, wvoVar);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.k = e5bVar;
        this.l = saf.p();
        this.m = ydr.a(null);
    }

    public final void a(Context context, Throwable th) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        if (!this.h) {
            throw th;
        }
        int i = this.e.a;
        this.d.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|(1:(1:(4:19|20|21|22)(1:(2:13|14)(3:16|17|18)))(1:23))(2:52|(2:54|55)(3:56|(1:58)|36))|24|25|26|27|28|(4:30|(1:32)|33|34)(3:37|38|39)))|59|6|(0)(0)|24|25|26|27|28|(0)(0)|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        if (r15.b(r5) == r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012b, code lost:
    
        r5.j = null;
        r5.k = null;
        r5.l = null;
        r5.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
    
        if (r15.b(r5) != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        r7.a(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0108, code lost:
    
        r5.j = null;
        r5.k = null;
        r5.l = null;
        r5.o = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (r15.b(r5) != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0117, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        r5.j = r0;
        r5.k = null;
        r5.l = null;
        r5.o = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        if (r15.b(r5) != r6) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[Catch: all -> 0x00d2, CancellationException -> 0x012b, TryCatch #3 {CancellationException -> 0x012b, all -> 0x00d2, blocks: (B:26:0x0095, B:28:0x009a, B:30:0x00a2, B:32:0x00cc, B:33:0x00d4, B:38:0x00ed, B:39:0x0104), top: B:25:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, n3b n3bVar, cg6 cg6Var) {
        wv0 wv0Var;
        int i;
        Context context2;
        aw0 aw0Var;
        n3b n3bVar2;
        AppWidgetProviderInfo appWidgetInfo;
        if (cg6Var instanceof wv0) {
            wv0Var = (wv0) cg6Var;
            int i2 = wv0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wv0Var.o = i2 - Integer.MIN_VALUE;
                Object obj = wv0Var.m;
                nm6 nm6Var = nm6.a;
                i = wv0Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (qld.K(n3bVar)) {
                        return Boolean.FALSE;
                    }
                    n3bVar.getClass();
                    int i3 = this.e.a;
                    wv0Var.j = this;
                    wv0Var.k = context;
                    wv0Var.l = n3bVar;
                    wv0Var.o = 1;
                    obj = vof.g.I(context, i3, wv0Var);
                    if (obj != nm6Var) {
                        context2 = context;
                        aw0Var = this;
                        n3bVar2 = n3bVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2 || i == 3 || i == 4) {
                        qgg.h0(obj);
                        dqs.a();
                        return Boolean.TRUE;
                    }
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) wv0Var.j;
                    qgg.h0(obj);
                    dqs.a();
                    throw th;
                }
                n3bVar2 = wv0Var.l;
                Context context3 = wv0Var.k;
                aw0Var = (aw0) wv0Var.j;
                qgg.h0(obj);
                context2 = context3;
                vof vofVar = (vof) obj;
                Object systemService = context2.getSystemService("appwidget");
                systemService.getClass();
                AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                aw0Var.getClass();
                rv0 rv0Var = aw0Var.e;
                appWidgetInfo = appWidgetManager.getAppWidgetInfo(rv0Var.a);
                if (appWidgetInfo != null) {
                    throw new IllegalArgumentException(("No app widget info for " + rv0Var.a).toString());
                }
                ComponentName componentName = appWidgetInfo.provider;
                pcg.G((yvn) n3bVar2);
                aw0Var.k = pcg.U(n3bVar2);
                RemoteViews V = v5g.V(context2, rv0Var.a, (yvn) n3bVar2, vofVar, vofVar.a(n3bVar2), componentName);
                if (aw0Var.h) {
                    appWidgetManager.updateAppWidget(rv0Var.a, V);
                }
                aw0Var.m.l(V);
                wv0Var.j = null;
                wv0Var.k = null;
                wv0Var.l = null;
                wv0Var.o = 2;
            }
        }
        wv0Var = new wv0(this, cg6Var);
        Object obj2 = wv0Var.m;
        nm6 nm6Var2 = nm6.a;
        i = wv0Var.o;
        if (i != 0) {
        }
        vof vofVar2 = (vof) obj2;
        Object systemService2 = context2.getSystemService("appwidget");
        systemService2.getClass();
        AppWidgetManager appWidgetManager2 = (AppWidgetManager) systemService2;
        aw0Var.getClass();
        rv0 rv0Var2 = aw0Var.e;
        appWidgetInfo = appWidgetManager2.getAppWidgetInfo(rv0Var2.a);
        if (appWidgetInfo != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, Object obj, cg6 cg6Var) {
        xv0 xv0Var;
        int i;
        ypi C;
        b2r j;
        aw0 aw0Var;
        ypi ypiVar;
        if (cg6Var instanceof xv0) {
            xv0Var = (xv0) cg6Var;
            int i2 = xv0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xv0Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = xv0Var.k;
                nm6 nm6Var = nm6.a;
                i = xv0Var.m;
                Unit unit = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    boolean z = obj instanceof uv0;
                    String str = this.a;
                    if (!z) {
                        if (obj instanceof tv0) {
                            b2r k = g2r.k();
                            ypi ypiVar2 = k instanceof ypi ? (ypi) k : null;
                            if (ypiVar2 == null || (C = ypiVar2.C(null, null)) == null) {
                                xq0.q("Cannot create a mutable snapshot of an read-only snapshot");
                                return null;
                            }
                            try {
                                j = C.j();
                                try {
                                    this.j.setValue(((tv0) obj).a);
                                    b2r.q(j);
                                    C.w().w();
                                    C.c();
                                } finally {
                                }
                            } finally {
                            }
                        } else if (obj instanceof sv0) {
                            b2r k2 = g2r.k();
                            ypi ypiVar3 = k2 instanceof ypi ? (ypi) k2 : null;
                            if (ypiVar3 == null || (C = ypiVar3.C(null, null)) == null) {
                                xq0.q("Cannot create a mutable snapshot of an read-only snapshot");
                                return null;
                            }
                            try {
                                j = C.j();
                                try {
                                    List list = (List) this.k.get(((sv0) obj).a);
                                    if (list != null) {
                                        Iterator it = list.iterator();
                                        if (it.hasNext()) {
                                            throw null;
                                        }
                                        unit = Unit.a;
                                    }
                                    b2r.q(j);
                                    C.w().w();
                                    C.c();
                                    if (unit == null) {
                                        sk3.r(Log.w("AppWidgetSession", ouj.q(new StringBuilder("Triggering Action("), ((sv0) obj).a, ") for session(", str, ") failed")));
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } finally {
                            }
                        } else {
                            if (!(obj instanceof vv0)) {
                                b6e.v(obj.getClass(), " to AppWidgetSession", "Sent unrecognized event type ");
                                return null;
                            }
                            w2f w2fVar = ((vv0) obj).a;
                            if (w2fVar.b()) {
                                w2fVar.U(Unit.a);
                            }
                        }
                        return Unit.a;
                    }
                    uqf uqfVar = this.d.b;
                    if (uqfVar != null) {
                        xv0Var.j = this;
                        xv0Var.m = 1;
                        obj2 = this.f.c(context, uqfVar, str, xv0Var);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        aw0Var = this;
                    } else {
                        aw0Var = this;
                        obj2 = null;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aw0Var = xv0Var.j;
                    qgg.h0(obj2);
                }
                b2r k3 = g2r.k();
                ypiVar = !(k3 instanceof ypi) ? (ypi) k3 : null;
                if (ypiVar != null || (C = ypiVar.C(null, null)) == null) {
                    xq0.q("Cannot create a mutable snapshot of an read-only snapshot");
                    return null;
                }
                try {
                    j = C.j();
                    try {
                        aw0Var.i.setValue(obj2);
                        b2r.q(j);
                        C.w().w();
                        return Unit.a;
                    } finally {
                    }
                } finally {
                }
            }
        }
        xv0Var = new xv0(this, cg6Var);
        Object obj22 = xv0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = xv0Var.m;
        Unit unit2 = null;
        if (i != 0) {
        }
        b2r k32 = g2r.k();
        if (!(k32 instanceof ypi)) {
        }
        if (ypiVar != null) {
        }
        xq0.q("Cannot create a mutable snapshot of an read-only snapshot");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(5:19|20|(1:22)|24|25))(2:27|28))(6:29|30|20|(0)|24|25))(4:31|32|14|(0)(0))))|34|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r5.c(r2, r11, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[Catch: iq4 -> 0x0098, TRY_LEAVE, TryCatch #0 {iq4 -> 0x0098, blocks: (B:12:0x0030, B:14:0x005b, B:20:0x0075, B:22:0x007d, B:30:0x0049, B:32:0x0050), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0095 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, lma lmaVar, cg6 cg6Var) {
        mkp mkpVar;
        int i;
        si3 si3Var;
        aw0 aw0Var;
        lma lmaVar2;
        si3 si3Var2;
        aw0 aw0Var2;
        Context context2;
        lma lmaVar3;
        Object c;
        if (cg6Var instanceof mkp) {
            mkpVar = (mkp) cg6Var;
            int i2 = mkpVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mkpVar.p = i2 - Integer.MIN_VALUE;
                Object obj = mkpVar.n;
                nm6 nm6Var = nm6.a;
                i = mkpVar.p;
                if (i == 0) {
                    if (i == 1) {
                        si3Var2 = mkpVar.m;
                        Function1 function1 = mkpVar.l;
                        context2 = mkpVar.k;
                        aw0Var2 = mkpVar.j;
                        qgg.h0(obj);
                        lmaVar2 = function1;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return Unit.a;
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    si3Var2 = mkpVar.m;
                    Function1 function12 = mkpVar.l;
                    context2 = mkpVar.k;
                    aw0Var2 = mkpVar.j;
                    qgg.h0(obj);
                    lma lmaVar4 = function12;
                    Context context3 = context2;
                    si3Var = si3Var2;
                    context = context3;
                    aw0Var = aw0Var2;
                    lmaVar3 = lmaVar4;
                    mkpVar.j = aw0Var;
                    mkpVar.k = context;
                    mkpVar.l = lmaVar3;
                    mkpVar.m = si3Var;
                    mkpVar.p = 1;
                    c = si3Var.c(mkpVar);
                    if (c != nm6Var) {
                        return nm6Var;
                    }
                    si3 si3Var3 = si3Var;
                    context2 = context;
                    si3Var2 = si3Var3;
                    aw0Var2 = aw0Var;
                    obj = c;
                    lmaVar2 = lmaVar3;
                    if (((Boolean) obj).booleanValue()) {
                        Object d = si3Var2.d();
                        lmaVar2.invoke(d);
                        mkpVar.j = aw0Var2;
                        mkpVar.k = context2;
                        mkpVar.l = lmaVar2;
                        mkpVar.m = si3Var2;
                        mkpVar.p = 2;
                        lmaVar4 = lmaVar2;
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                zi3 zi3Var = this.c;
                zi3Var.getClass();
                si3Var = new si3(zi3Var);
                aw0Var = this;
                lmaVar3 = lmaVar;
                mkpVar.j = aw0Var;
                mkpVar.k = context;
                mkpVar.l = lmaVar3;
                mkpVar.m = si3Var;
                mkpVar.p = 1;
                c = si3Var.c(mkpVar);
                if (c != nm6Var) {
                }
            }
        }
        mkpVar = new mkp(this, cg6Var);
        Object obj2 = mkpVar.n;
        nm6 nm6Var2 = nm6.a;
        i = mkpVar.p;
        if (i == 0) {
        }
    }

    public final Object e(Object obj, cg6 cg6Var) {
        Object m = this.c.m(obj, cg6Var);
        return m == nm6.a ? m : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        zv0 zv0Var;
        int i;
        vv0 vv0Var;
        if (cg6Var instanceof zv0) {
            zv0Var = (zv0) cg6Var;
            int i2 = zv0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zv0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = zv0Var.k;
                Object obj2 = nm6.a;
                i = zv0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    vv0 vv0Var2 = new vv0(new w2f(this.l));
                    zv0Var.j = vv0Var2;
                    zv0Var.m = 1;
                    if (e(vv0Var2, zv0Var) == obj2) {
                        return obj2;
                    }
                    vv0Var = vv0Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vv0Var = zv0Var.j;
                    qgg.h0(obj);
                }
                return vv0Var.a;
            }
        }
        zv0Var = new zv0(this, cg6Var);
        Object obj3 = zv0Var.k;
        Object obj22 = nm6.a;
        i = zv0Var.m;
        if (i != 0) {
        }
        return vv0Var.a;
    }
}
