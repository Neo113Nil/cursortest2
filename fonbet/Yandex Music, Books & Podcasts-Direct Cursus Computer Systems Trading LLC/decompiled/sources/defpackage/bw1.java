package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.api.exception.e;
import com.yandex.passport.api.i;
import com.yandex.passport.api.n;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.autologin.ui.k;
import com.yandex.passport.internal.autologin.ui.o;
import com.yandex.passport.internal.autologin.ui.q;
import com.yandex.passport.internal.autologin.ui.r;
import com.yandex.passport.internal.autologin.ui.s;
import com.yandex.passport.internal.entities.d;
import com.yandex.passport.internal.impl.f0;
import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.impl.x;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.passport.internal.properties.g;
import com.yandex.passport.sloth.ui.c;
import com.yandex.plus.plaquesdk.plaque.adapter.a;
import com.yandex.plus.plaquesdk.plaque.adapter.h;
import com.yandex.plus.plaquesdk.plaque.adapter.j;
import com.yandex.plus.plaquesdk.plaque.api.dependencies.b;
import com.yandex.plus.plaquesdk.plaque.api.models.display.t;
import com.yandex.plus.plaquesdk.plaque.api.models.display.u;
import com.yandex.plus.plaquesdk.plaque.api.models.display.v;
import com.yandex.plus.plaquesdk.plaque.api.models.display.w;
import com.yandex.plus.plaquesdk.plaque.api.models.m;
import com.yandex.plus.plaquesdk.plaque.api.models.p;
import defpackage.bw1;
import defpackage.qyf;
import defpackage.x97;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.YaRotatingProgress;

/* loaded from: classes.dex */
public final class bw1 implements ewf {
    public final /* synthetic */ int a = 2;
    public boolean b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;

    public bw1(Context context, n nVar, dv1 dv1Var, qxp qxpVar) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.d = nVar;
        this.k = dv1Var;
        this.j = qxpVar;
        Handler q = dvt.q(null);
        this.e = q;
        this.f = dvt.a >= 23 ? new zv1(this) : null;
        this.g = new l83(2, this);
        yv1 yv1Var = yv1.c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.h = uriFor != null ? new aw1(this, q, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
    
        if (defpackage.x97.V(r10, r0, r6) == r7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        if (defpackage.x97.V(r10, r12, r6) == r7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        r4 = r0;
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (r3.emit(r4, r6) == r7) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(bw1 bw1Var, g gVar, cg6 cg6Var) {
        o oVar;
        int i;
        Object n;
        g gVar2;
        Throwable a;
        Object obj;
        x0q x0qVar = (x0q) bw1Var.h;
        if (cg6Var instanceof o) {
            oVar = (o) cg6Var;
            int i2 = oVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.n = i2 - Integer.MIN_VALUE;
                o oVar2 = oVar;
                Object obj2 = oVar2.l;
                Object obj3 = nm6.a;
                i = oVar2.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    k kVar = new k((f0) bw1Var.e, ((x) bw1Var.f).b);
                    oVar2.j = gVar;
                    oVar2.n = 1;
                    n = bw1Var.n(kVar, gVar, oVar2);
                    if (n != obj3) {
                        gVar2 = gVar;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj4 = oVar2.k;
                    g gVar3 = oVar2.j;
                    qgg.h0(obj2);
                    n = obj4;
                    gVar2 = gVar3;
                    obj = n;
                    g gVar4 = gVar2;
                    r7o r7oVar = z7o.b;
                    if (!(obj instanceof t7o)) {
                        d dVar = (d) obj;
                        boolean z = dVar.b;
                        f fVar = dVar.a;
                        if (!z) {
                            bw1Var.m(fVar);
                        } else if (fVar.m != n.CHILDISH) {
                            dq7 dq7Var = ca8.a;
                            bsd bsdVar = j5h.a;
                            l1p l1pVar = new l1p(bw1Var, gVar4, dVar, continuation, 11);
                            oVar2.j = null;
                            oVar2.k = obj;
                            oVar2.n = 4;
                        } else {
                            x97.y((qyf) bw1Var.g, null, null, new r1w(x0qVar, continuation, 9), 3);
                        }
                    }
                    return Unit.a;
                }
                gVar2 = oVar2.j;
                qgg.h0(obj2);
                n = ((z7o) obj2).a;
                a = z7o.a(n);
                if (a != null) {
                    if (a instanceof e) {
                        dq7 dq7Var2 = ca8.a;
                        bsd bsdVar2 = j5h.a;
                        j9w j9wVar = new j9w(bw1Var, a, continuation, 11);
                        oVar2.j = gVar2;
                        oVar2.k = n;
                        oVar2.n = 2;
                    } else {
                        z7o z7oVar = new z7o(new t7o(a));
                        oVar2.j = gVar2;
                        oVar2.k = n;
                        oVar2.n = 3;
                    }
                    n = obj4;
                    gVar2 = gVar3;
                }
                obj = n;
                g gVar42 = gVar2;
                r7o r7oVar2 = z7o.b;
                if (!(obj instanceof t7o)) {
                }
                return Unit.a;
            }
        }
        oVar = new o(bw1Var, cg6Var);
        o oVar22 = oVar;
        Object obj22 = oVar22.l;
        Object obj32 = nm6.a;
        i = oVar22.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        a = z7o.a(n);
        if (a != null) {
        }
        obj = n;
        g gVar422 = gVar2;
        r7o r7oVar22 = z7o.b;
        if (!(obj instanceof t7o)) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        if (r0.emit(r13, r1) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r15 == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(bw1 bw1Var, g gVar, cg6 cg6Var) {
        q qVar;
        int i;
        Object v;
        Object obj;
        Throwable a;
        x0q x0qVar = (x0q) bw1Var.h;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = qVar.l;
                nm6 nm6Var = nm6.a;
                i = qVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    f0 f0Var = (f0) bw1Var.e;
                    qVar.j = gVar;
                    qVar.n = 1;
                    v = f0Var.v(gVar, qVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj2);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = qVar.k;
                        qgg.h0(obj2);
                        v = obj;
                        a = z7o.a(v);
                        if (a != null) {
                            z7o z7oVar = new z7o(new t7o(a));
                            qVar.j = null;
                            qVar.k = v;
                            qVar.n = 3;
                        }
                        return Unit.a;
                    }
                    gVar = qVar.j;
                    qgg.h0(obj2);
                    v = ((z7o) obj2).a;
                }
                g gVar2 = gVar;
                r7o r7oVar = z7o.b;
                if (!(v instanceof t7o)) {
                    f fVar = (f) v;
                    if (fVar.m != n.CHILDISH) {
                        dq7 dq7Var = ca8.a;
                        bsd bsdVar = j5h.a;
                        l1p l1pVar = new l1p(bw1Var, gVar2, fVar, continuation, 12);
                        qVar.j = null;
                        qVar.k = v;
                        qVar.n = 2;
                        if (x97.V(bsdVar, l1pVar, qVar) != nm6Var) {
                            obj = v;
                            v = obj;
                        }
                        return nm6Var;
                    }
                    x97.y((qyf) bw1Var.g, null, null, new r1w(x0qVar, continuation, 9), 3);
                }
                a = z7o.a(v);
                if (a != null) {
                }
                return Unit.a;
            }
        }
        qVar = new q(bw1Var, cg6Var);
        Object obj22 = qVar.l;
        nm6 nm6Var2 = nm6.a;
        i = qVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        g gVar22 = gVar;
        r7o r7oVar2 = z7o.b;
        if (!(v instanceof t7o)) {
        }
        a = z7o.a(v);
        if (a != null) {
        }
        return Unit.a;
    }

    public static final void c(bw1 bw1Var, Object obj) {
        r7o r7oVar = z7o.b;
        if (!(obj instanceof t7o)) {
            bw1Var.m((f) obj);
        }
        if (z7o.a(obj) != null) {
            x97.y((qyf) bw1Var.g, null, null, new wkc((x0q) bw1Var.h, null, obj, 1), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(bw1 bw1Var, q58 q58Var, cg6 cg6Var) {
        w58 w58Var;
        int i;
        q58 q58Var2;
        bw1 bw1Var2;
        q58 q58Var3;
        bw1 bw1Var3;
        q58 q58Var4;
        bw1 bw1Var4;
        rj6 rj6Var;
        rj6 rj6Var2;
        rj6 rj6Var3;
        jyr jyrVar = (jyr) bw1Var.g;
        if (cg6Var instanceof w58) {
            w58Var = (w58) cg6Var;
            int i2 = w58Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w58Var.n = i2 - Integer.MIN_VALUE;
                Object obj = w58Var.l;
                nm6 nm6Var = nm6.a;
                i = w58Var.n;
                if (i == 0) {
                    if (i == 1) {
                        bw1Var4 = w58Var.k;
                        q58Var4 = w58Var.j;
                        qgg.h0(obj);
                        rj6Var = (rj6) obj;
                        if (rj6Var instanceof qj6) {
                            if (rj6Var instanceof pj6) {
                                bw1Var.b = true;
                                return bw1Var.g(((j58) q58Var4).r());
                            }
                            b6e.s();
                            return null;
                        }
                        l68 l = bw1Var4.l((z9b) ((qj6) rj6Var).a);
                        if (l != null) {
                            return l;
                        }
                        bw1Var.b = true;
                        return bw1Var.g(((j58) q58Var4).r());
                    }
                    if (i == 2) {
                        bw1Var3 = w58Var.k;
                        q58Var3 = w58Var.j;
                        qgg.h0(obj);
                        rj6Var2 = (rj6) obj;
                        if (rj6Var2 instanceof qj6) {
                            if (rj6Var2 instanceof pj6) {
                                bw1Var.b = true;
                                return bw1Var.h(((m58) q58Var3).c);
                            }
                            b6e.s();
                            return null;
                        }
                        l68 l2 = bw1Var3.l((z9b) ((qj6) rj6Var2).a);
                        if (l2 != null) {
                            return l2;
                        }
                        bw1Var.b = true;
                        return bw1Var.h(((m58) q58Var3).c);
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bw1Var2 = w58Var.k;
                    q58Var2 = w58Var.j;
                    qgg.h0(obj);
                    rj6Var3 = (rj6) obj;
                    if (rj6Var3 instanceof qj6) {
                        if (rj6Var3 instanceof pj6) {
                            bw1Var.b = true;
                            return bw1Var.u(ild.u(q58Var2));
                        }
                        b6e.s();
                        return null;
                    }
                    l68 l3 = bw1Var2.l((z9b) ((qj6) rj6Var3).a);
                    if (l3 != null) {
                        return l3;
                    }
                    bw1Var.b = true;
                    return bw1Var.u(ild.u(q58Var2));
                }
                qgg.h0(obj);
                Continuation continuation = null;
                if (q58Var instanceof j58) {
                    bw1Var.b = false;
                    e68 e68Var = (e68) jyrVar.getValue();
                    String M = ((j58) q58Var).M();
                    w58Var.j = q58Var;
                    w58Var.k = bw1Var;
                    w58Var.n = 1;
                    e68Var.getClass();
                    obj = x97.V(dm6.b, new d68(e68Var, M, continuation, 0), w58Var);
                    if (obj != nm6Var) {
                        q58Var4 = q58Var;
                        bw1Var4 = bw1Var;
                        rj6Var = (rj6) obj;
                        if (rj6Var instanceof qj6) {
                        }
                    }
                } else if (q58Var instanceof m58) {
                    bw1Var.b = false;
                    e68 e68Var2 = (e68) jyrVar.getValue();
                    String str = ((m58) q58Var).b;
                    w58Var.j = q58Var;
                    w58Var.k = bw1Var;
                    w58Var.n = 2;
                    e68Var2.getClass();
                    obj = x97.V(dm6.b, new d68(e68Var2, str, continuation, 1), w58Var);
                    if (obj != nm6Var) {
                        q58Var3 = q58Var;
                        bw1Var3 = bw1Var;
                        rj6Var2 = (rj6) obj;
                        if (rj6Var2 instanceof qj6) {
                        }
                    }
                } else {
                    if (!(q58Var instanceof n58)) {
                        b6e.s();
                        return null;
                    }
                    bw1Var.b = false;
                    e68 e68Var3 = (e68) jyrVar.getValue();
                    String u = ((n58) q58Var).u();
                    w58Var.j = q58Var;
                    w58Var.k = bw1Var;
                    w58Var.n = 3;
                    e68Var3.getClass();
                    obj = x97.V(dm6.b, new d68(e68Var3, u, continuation, 2), w58Var);
                    if (obj != nm6Var) {
                        q58Var2 = q58Var;
                        bw1Var2 = bw1Var;
                        rj6Var3 = (rj6) obj;
                        if (rj6Var3 instanceof qj6) {
                        }
                    }
                }
                return nm6Var;
            }
        }
        w58Var = new w58(bw1Var, cg6Var);
        Object obj2 = w58Var.l;
        nm6 nm6Var2 = nm6.a;
        i = w58Var.n;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(bw1 bw1Var, l3j l3jVar, cg6 cg6Var) {
        v58 v58Var;
        int i;
        l3j l3jVar2;
        bw1 bw1Var2;
        l3j l3jVar3;
        bw1 bw1Var3;
        l3j l3jVar4;
        bw1 bw1Var4;
        a58 a58Var;
        l68 k;
        a58 a58Var2;
        l68 k2;
        a58 a58Var3;
        l68 k3;
        jyr jyrVar = (jyr) bw1Var.h;
        if (cg6Var instanceof v58) {
            v58Var = (v58) cg6Var;
            int i2 = v58Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v58Var.n = i2 - Integer.MIN_VALUE;
                Object obj = v58Var.l;
                nm6 nm6Var = nm6.a;
                i = v58Var.n;
                if (i == 0) {
                    if (i == 1) {
                        bw1Var4 = v58Var.k;
                        l3jVar4 = (l3j) v58Var.j;
                        qgg.h0(obj);
                        a58Var = (a58) obj;
                        if (a58Var == null && (k = bw1Var4.k(a58Var)) != null) {
                            return k;
                        }
                        bw1Var4.b = true;
                        return bw1Var.g(((k58) l3jVar4).c);
                    }
                    if (i == 2) {
                        bw1Var3 = v58Var.k;
                        l3jVar3 = (l3j) v58Var.j;
                        qgg.h0(obj);
                        a58Var2 = (a58) obj;
                        if (a58Var2 == null && (k2 = bw1Var3.k(a58Var2)) != null) {
                            return k2;
                        }
                        bw1Var3.b = true;
                        return bw1Var.h(((m58) l3jVar3).c);
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bw1Var2 = v58Var.k;
                    l3jVar2 = (l3j) v58Var.j;
                    qgg.h0(obj);
                    a58Var3 = (a58) obj;
                    if (a58Var3 == null && (k3 = bw1Var2.k(a58Var3)) != null) {
                        return k3;
                    }
                    bw1Var2.b = true;
                    return bw1Var.u(ild.u((q58) l3jVar2));
                }
                qgg.h0(obj);
                if (l3jVar instanceof k58) {
                    hs5 hs5Var = ((k58) l3jVar).a;
                    bw1Var.b = false;
                    k68 k68Var = (k68) jyrVar.getValue();
                    v58Var.j = l3jVar;
                    v58Var.k = bw1Var;
                    v58Var.n = 1;
                    obj = k68Var.b(hs5Var, v58Var);
                    if (obj != nm6Var) {
                        l3jVar4 = l3jVar;
                        bw1Var4 = bw1Var;
                        a58Var = (a58) obj;
                        if (a58Var == null) {
                        }
                        bw1Var4.b = true;
                        return bw1Var.g(((k58) l3jVar4).c);
                    }
                } else if (l3jVar instanceof m58) {
                    hs5 hs5Var2 = ((m58) l3jVar).a;
                    bw1Var.b = false;
                    k68 k68Var2 = (k68) jyrVar.getValue();
                    v58Var.j = l3jVar;
                    v58Var.k = bw1Var;
                    v58Var.n = 2;
                    obj = k68Var2.b(hs5Var2, v58Var);
                    if (obj != nm6Var) {
                        l3jVar3 = l3jVar;
                        bw1Var3 = bw1Var;
                        a58Var2 = (a58) obj;
                        if (a58Var2 == null) {
                        }
                        bw1Var3.b = true;
                        return bw1Var.h(((m58) l3jVar3).c);
                    }
                } else {
                    if (!(l3jVar instanceof o58)) {
                        b6e.s();
                        return null;
                    }
                    hs5 hs5Var3 = ((o58) l3jVar).a;
                    bw1Var.b = false;
                    k68 k68Var3 = (k68) jyrVar.getValue();
                    v58Var.j = l3jVar;
                    v58Var.k = bw1Var;
                    v58Var.n = 3;
                    obj = k68Var3.b(hs5Var3, v58Var);
                    if (obj != nm6Var) {
                        l3jVar2 = l3jVar;
                        bw1Var2 = bw1Var;
                        a58Var3 = (a58) obj;
                        if (a58Var3 == null) {
                        }
                        bw1Var2.b = true;
                        return bw1Var.u(ild.u((q58) l3jVar2));
                    }
                }
                return nm6Var;
            }
        }
        v58Var = new v58(bw1Var, cg6Var);
        Object obj2 = v58Var.l;
        nm6 nm6Var2 = nm6.a;
        i = v58Var.n;
        if (i == 0) {
        }
    }

    public static int i(w wVar, Context context) {
        if (wVar instanceof t) {
            return -1;
        }
        if (wVar instanceof u) {
            return -2;
        }
        if (!(wVar instanceof v)) {
            b6e.s();
            return 0;
        }
        com.yandex.plus.core.android.extensions.e eVar = ((v) wVar).a;
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        displayMetrics.getClass();
        return com.yandex.plus.core.android.extensions.e.c(eVar.a, displayMetrics).intValue();
    }

    public static vat o(q58 q58Var, dci dciVar) {
        int i = ild.u(q58Var) ? R.string.disclaimer_cacnel_available : R.string.disclaimer_cacnel_unavailable;
        Integer valueOf = ild.u(q58Var) ? Integer.valueOf(R.string.disclaimer_cacnel_unavailable) : null;
        int i2 = ild.u(q58Var) ? R.drawable.ic_eye_crossed_24 : R.drawable.ic_unavailable_24;
        int i3 = dciVar == null ? -1 : r58.a[dciVar.ordinal()];
        if (i3 != -1) {
            if (i3 == 1) {
                return new vat(Integer.valueOf(i2), Integer.valueOf(i), valueOf);
            }
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                b6e.s();
                return null;
            }
        }
        return new vat(Integer.valueOf(i2), Integer.valueOf(i), valueOf);
    }

    @Override // defpackage.ewf
    public synchronized boolean e(Parcel parcel, int i) {
        IBinder readStrongBinder;
        if (i == 1) {
            if (parcel.readInt() >= 1 && (readStrongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                yfx yfxVar = new yfx(xu1.b);
                yfxVar.w(wdp.g, (ee0) this.e);
                yfxVar.w(wdp.f, new gg3(callingUid));
                yfxVar.w(y13.o, Integer.valueOf(callingUid));
                wu1 wu1Var = y13.p;
                Intent intent = ((ee0) this.e).a;
                yfxVar.w(wu1Var, intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName());
                yfxVar.w(y13.q, (xhe) this.h);
                yfxVar.w(vwb.a, new b23(callingUid, (n) this.g));
                yfxVar.w(bkp.e, b9p.b);
                x13 x13Var = new x13((xhj) this.c, yfxVar.h(), (yde) this.d, readStrongBinder);
                x13Var.q(((hjp) this.j).C(x13Var));
                return true;
            }
        }
        return false;
    }

    public l68 g(boolean z) {
        Context context = (Context) this.c;
        if (z) {
            return null;
        }
        String string = context.getString(R.string.album_not_available);
        string.getClass();
        String string2 = context.getString(R.string.disclaimer_cacnel_unavailable);
        string2.getClass();
        return new l68(R.drawable.ic_unavailable_24, string, null, null, string2, null);
    }

    public l68 h(boolean z) {
        Context context = (Context) this.c;
        if (z) {
            return null;
        }
        String string = context.getString(R.string.artist_not_available);
        string.getClass();
        String string2 = context.getString(R.string.disclaimer_cacnel_unavailable);
        string2.getClass();
        return new l68(R.drawable.ic_unavailable_24, string, null, null, string2, null);
    }

    public void j() {
        t2i t2iVar;
        jyr jyrVar = (jyr) this.f;
        Context context = (Context) this.c;
        rg4 rg4Var = (rg4) this.i;
        if (rg4Var == null || (t2iVar = (t2i) this.j) == null) {
            return;
        }
        Object obj = t2iVar.a;
        if (obj != null) {
            v20 v20Var = (v20) obj;
            ogp.B(context, 14);
            rg4Var.d();
            rg4Var.c().setTitle(v20Var.a);
            rcm rcmVar = rg4Var.f;
            ArrayList arrayList = v20Var.d;
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ywl((re4) it.next()));
            }
            rcmVar.getClass();
            rcmVar.i = arrayList2;
            ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new ywl(((ywl) it2.next()).a));
            }
            ArrayList arrayList4 = rcmVar.d;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
            rcmVar.g();
            rcmVar.h = hs4.k;
            return;
        }
        if (t2iVar.c != null) {
            ogp.B(context, 12);
            rg4Var.d();
            if (!((z66) jyrVar.getValue()).g()) {
                hld.I(context, (z66) jyrVar.getValue());
                return;
            } else {
                context.getClass();
                hag.x(context, R.string.error_unknown, 0);
                return;
            }
        }
        ogp.B(context, 10);
        if (this.b) {
            rg4Var.b().setRefreshing(true);
            return;
        }
        YaRotatingProgress yaRotatingProgress = (YaRotatingProgress) rg4Var.d.a(rg4.h[2]);
        yaRotatingProgress.d = false;
        yaRotatingProgress.removeCallbacks(yaRotatingProgress.f);
        if (yaRotatingProgress.c) {
            return;
        }
        yaRotatingProgress.b = -1L;
        yaRotatingProgress.c = true;
        yaRotatingProgress.postDelayed(yaRotatingProgress.e, 300L);
    }

    public l68 k(a58 a58Var) {
        dci dciVar;
        Context context = (Context) this.c;
        String str = a58Var.d;
        if (str == null) {
            return null;
        }
        String str2 = a58Var.c;
        if (str2 != null) {
            dci.b.getClass();
            dci[] values = dci.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                dciVar = values[i];
                if (dciVar.a.equals(str2)) {
                    break;
                }
            }
        }
        dciVar = null;
        vat o = o((q58) this.d, dciVar);
        int intValue = ((Number) o.a).intValue();
        int intValue2 = ((Number) o.b).intValue();
        Integer num = (Integer) o.c;
        String str3 = a58Var.e;
        f58 f58Var = a58Var.f;
        g58 g58Var = f58Var != null ? new g58(f58Var.a, f58Var.b) : null;
        String string = context.getString(intValue2);
        string.getClass();
        return new l68(intValue, str, str3, g58Var, string, num != null ? context.getString(num.intValue()) : null);
    }

    public l68 l(z9b z9bVar) {
        Context context = (Context) this.c;
        eci eciVar = z9bVar.a;
        if (eciVar == null) {
            return null;
        }
        vat o = o((q58) this.d, (dci) eciVar.e.getValue());
        int intValue = ((Number) o.a).intValue();
        int intValue2 = ((Number) o.b).intValue();
        Integer num = (Integer) o.c;
        String str = eciVar.b;
        String str2 = eciVar.c;
        f58 f58Var = eciVar.d;
        g58 g58Var = f58Var != null ? new g58(f58Var.a, f58Var.b) : null;
        String string = context.getString(intValue2);
        string.getClass();
        return new l68(intValue, str, str2, g58Var, string, num != null ? context.getString(num.intValue()) : null);
    }

    public void m(f fVar) {
        qyf qyfVar = (qyf) this.g;
        Continuation continuation = null;
        if (!this.b) {
            x97.y(qyfVar, null, null, new r((x0q) this.h, continuation, fVar, 0), 3);
        } else {
            dq7 dq7Var = ca8.a;
            x97.y(qyfVar, mn7.d, null, new rhw(this, fVar, continuation, 20), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(k kVar, g gVar, cg6 cg6Var) {
        s sVar;
        int i;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.l = i2 - Integer.MIN_VALUE;
                s sVar2 = sVar;
                Object obj = sVar2.j;
                Object obj2 = nm6.a;
                i = sVar2.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (Build.VERSION.SDK_INT < 34) {
                    Context context = (Context) this.c;
                    q0 q0Var = (q0) this.d;
                    zh zhVar = q0Var.u;
                    x0q x0qVar = q0Var.m;
                    sVar2.l = 1;
                    Object e = kVar.e(context, gVar, zhVar, x0qVar, sVar2);
                    if (e != obj2) {
                        return e;
                    }
                } else {
                    f0 f0Var = (f0) this.e;
                    Context context2 = (Context) this.c;
                    sVar2.l = 2;
                    Object w = f0Var.w(context2, gVar, sVar2);
                    if (w != obj2) {
                        return w;
                    }
                }
                return obj2;
            }
        }
        sVar = new s(this, cg6Var);
        s sVar22 = sVar;
        Object obj3 = sVar22.j;
        Object obj22 = nm6.a;
        i = sVar22.l;
        if (i == 0) {
        }
    }

    public void p(boolean z) {
        jyr jyrVar = (jyr) this.e;
        og4 og4Var = (og4) this.k;
        Continuation continuation = null;
        if (og4Var == null) {
            Intrinsics.j("chartType");
            throw null;
        }
        if (og4Var.equals(lg4.a)) {
            tg4 tg4Var = (tg4) jyrVar.getValue();
            rjq rjqVar = tg4Var.c;
            rjqVar.g();
            x97.y(hld.s(rjqVar, dm6.b()), null, null, new sg4(tg4Var, z, continuation, 0), 3);
            return;
        }
        if (og4Var.equals(ng4.a)) {
            tg4 tg4Var2 = (tg4) jyrVar.getValue();
            rjq rjqVar2 = tg4Var2.e;
            rjqVar2.g();
            x97.y(hld.s(rjqVar2, dm6.b()), null, null, new sg4(tg4Var2, z, continuation, 1), 3);
            return;
        }
        if (!(og4Var instanceof mg4)) {
            b6e.s();
            return;
        }
        tg4 tg4Var3 = (tg4) jyrVar.getValue();
        String str = ((mg4) og4Var).a;
        tg4Var3.getClass();
        str.getClass();
        rjq rjqVar3 = tg4Var3.g;
        rjqVar3.g();
        x97.y(hld.s(rjqVar3, dm6.b()), null, null, new cg1(tg4Var3, str, z, continuation, 4), 3);
    }

    public void q(View view) {
        Object tag = view.getTag(R.id.plaque_sdk_micro_widget_view_holder_tag);
        if (tag instanceof j) {
            ((j) tag).a = true;
            return;
        }
        ((c) ((b) this.d)).c("Has not tag at ".concat(view.getClass().getSimpleName()));
    }

    public void r(yv1 yv1Var) {
        if (!this.b || yv1Var.equals((yv1) this.i)) {
            return;
        }
        this.i = yv1Var;
        gk7 gk7Var = (gk7) ((n) this.d).b;
        Looper myLooper = Looper.myLooper();
        Looper looper = gk7Var.f0;
        if (looper != myLooper) {
            xq0.q(hrg.s("Current looper (", myLooper != null ? myLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
            return;
        }
        yv1 yv1Var2 = gk7Var.w;
        if (yv1Var2 == null || yv1Var.equals(yv1Var2)) {
            return;
        }
        gk7Var.w = yv1Var;
        ly1 ly1Var = gk7Var.r;
        if (ly1Var != null) {
            ly1Var.T();
        }
    }

    public void s(boolean z) {
        rar rarVar = (rar) this.k;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.k = x97.y(hld.s((rjq) this.i, dm6.b()), null, null, new z11(z, this, continuation, 6), 3);
    }

    public void t(AudioDeviceInfo audioDeviceInfo) {
        qxp qxpVar = (qxp) this.j;
        if (Objects.equals(audioDeviceInfo, qxpVar == null ? null : (AudioDeviceInfo) qxpVar.a)) {
            return;
        }
        qxp qxpVar2 = audioDeviceInfo != null ? new qxp(audioDeviceInfo) : null;
        this.j = qxpVar2;
        r(yv1.b((Context) this.c, (dv1) this.k, qxpVar2));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "BinderServer[" + ((ee0) this.e) + "]";
            default:
                return super.toString();
        }
    }

    public l68 u(boolean z) {
        Context context = (Context) this.c;
        if (z) {
            return null;
        }
        String string = context.getString(R.string.bottom_sheet_track_no_rights_title);
        string.getClass();
        String string2 = context.getString(R.string.bottom_sheet_track_no_rights_description);
        String string3 = context.getString(R.string.disclaimer_cacnel_unavailable);
        string3.getClass();
        return new l68(R.drawable.ic_unavailable_24, string, string2, null, string3, null);
    }

    public void v(List list) {
        list.getClass();
        List list2 = (List) this.g;
        this.g = list;
        zsd.H(new a(list2, list, this)).a((com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.h);
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j jVar = (j) arrayList.get(i);
            jVar.getClass();
            if (jVar.a) {
                com.yandex.plus.plaquesdk.plaque.api.models.x xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) ((List) this.g).get(i);
                Unit unit = null;
                if (xVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.n) {
                    com.yandex.plus.plaquesdk.plaque.adapter.c cVar = jVar instanceof com.yandex.plus.plaquesdk.plaque.adapter.c ? (com.yandex.plus.plaquesdk.plaque.adapter.c) jVar : null;
                    if (cVar != null) {
                        cVar.a(xVar);
                        unit = Unit.a;
                    }
                } else if (xVar instanceof p) {
                    com.yandex.plus.plaquesdk.plaque.adapter.d dVar = jVar instanceof com.yandex.plus.plaquesdk.plaque.adapter.d ? (com.yandex.plus.plaquesdk.plaque.adapter.d) jVar : null;
                    if (dVar != null) {
                        dVar.a(xVar);
                        unit = Unit.a;
                    }
                } else if (xVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.t) {
                    com.yandex.plus.plaquesdk.plaque.adapter.f fVar = jVar instanceof com.yandex.plus.plaquesdk.plaque.adapter.f ? (com.yandex.plus.plaquesdk.plaque.adapter.f) jVar : null;
                    if (fVar != null) {
                        fVar.a(xVar);
                        unit = Unit.a;
                    }
                } else if (xVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.u) {
                    com.yandex.plus.plaquesdk.plaque.adapter.g gVar = jVar instanceof com.yandex.plus.plaquesdk.plaque.adapter.g ? (com.yandex.plus.plaquesdk.plaque.adapter.g) jVar : null;
                    if (gVar != null) {
                        gVar.a(xVar);
                        unit = Unit.a;
                    }
                } else if (xVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.v) {
                    h hVar = jVar instanceof h ? (h) jVar : null;
                    if (hVar != null) {
                        hVar.a(xVar);
                        unit = Unit.a;
                    }
                } else if (xVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.r) {
                    com.yandex.plus.plaquesdk.plaque.adapter.e eVar = jVar instanceof com.yandex.plus.plaquesdk.plaque.adapter.e ? (com.yandex.plus.plaquesdk.plaque.adapter.e) jVar : null;
                    if (eVar != null) {
                        eVar.a(xVar);
                        unit = Unit.a;
                    }
                } else {
                    if (!(xVar instanceof m)) {
                        b6e.s();
                        return;
                    }
                    com.yandex.plus.plaquesdk.plaque.adapter.b bVar = jVar instanceof com.yandex.plus.plaquesdk.plaque.adapter.b ? (com.yandex.plus.plaquesdk.plaque.adapter.b) jVar : null;
                    if (bVar != null) {
                        bVar.a(xVar);
                        unit = Unit.a;
                    }
                }
                if (unit == null) {
                    ((c) ((b) this.j)).c("Holder " + jVar + " can't bind " + xVar);
                }
                if (this.b) {
                    View d = jVar.d();
                    ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
                    if (layoutParams == null) {
                        jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    w wVar = xVar.c().b;
                    Context context = jVar.d().getContext();
                    context.getClass();
                    marginLayoutParams.width = i(wVar, context);
                    xVar.c().getClass();
                    Context context2 = jVar.d().getContext();
                    context2.getClass();
                    marginLayoutParams.height = i(u.a, context2);
                    d.setLayoutParams(marginLayoutParams);
                } else {
                    continue;
                }
            }
            jVar.a = false;
        }
    }

    public bw1(Context context, q58 q58Var, xzi xziVar) {
        context.getClass();
        q58Var.getClass();
        this.c = context;
        this.d = q58Var;
        this.e = xziVar;
        bdt I = hag.I(z66.class);
        l18 l18Var = l18.b;
        this.f = l18Var.b(I, true);
        this.g = l18Var.b(hag.I(e68.class), true);
        this.h = l18Var.b(hag.I(k68.class), true);
        this.i = new rjq(false);
    }

    public bw1(ViewGroup viewGroup, b bVar, Function1 function1, boolean z) {
        bVar.getClass();
        function1.getClass();
        v0 v0Var = new v0(20);
        v0 v0Var2 = new v0(21);
        this.c = viewGroup;
        this.d = bVar;
        this.e = v0Var;
        this.f = v0Var2;
        this.g = c5b.a;
        this.h = new com.yandex.plus.home.plaque.plugin.internal.proxy.a(23, this);
        this.i = new ArrayList();
        this.j = bVar;
        this.k = function1;
        this.b = z;
    }

    public bw1(Context context, q0 q0Var, f0 f0Var, x xVar, i iVar, sh shVar, qyf qyfVar, x0q x0qVar, rhw rhwVar) {
        context.getClass();
        f0Var.getClass();
        iVar.getClass();
        shVar.getClass();
        this.c = context;
        this.d = q0Var;
        this.e = f0Var;
        this.f = xVar;
        this.g = qyfVar;
        this.h = x0qVar;
        this.i = rhwVar;
        final int i = 0;
        this.j = shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 0), new rh(this) { // from class: com.yandex.passport.internal.autologin.ui.l
            public final /* synthetic */ bw1 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                z7o z7oVar = (z7o) obj;
                switch (i) {
                    case 0:
                        bw1 bw1Var = this.b;
                        x97.y((qyf) bw1Var.g, null, null, new p(z7oVar, bw1Var, null, 1), 3);
                        break;
                    default:
                        bw1 bw1Var2 = this.b;
                        x97.y((qyf) bw1Var2.g, null, null, new p(z7oVar, bw1Var2, null, 0), 3);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.k = shVar.registerForActivityResult(new vh(11), new rh(this) { // from class: com.yandex.passport.internal.autologin.ui.l
            public final /* synthetic */ bw1 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                z7o z7oVar = (z7o) obj;
                switch (i2) {
                    case 0:
                        bw1 bw1Var = this.b;
                        x97.y((qyf) bw1Var.g, null, null, new p(z7oVar, bw1Var, null, 1), 3);
                        break;
                    default:
                        bw1 bw1Var2 = this.b;
                        x97.y((qyf) bw1Var2.g, null, null, new p(z7oVar, bw1Var2, null, 0), 3);
                        break;
                }
            }
        });
    }

    public bw1(ee0 ee0Var, gao gaoVar, List list, n nVar, xhe xheVar, v13 v13Var) {
        this.e = ee0Var;
        this.c = gaoVar;
        o2g.O(list, "streamTracerFactories");
        this.d = yde.v(list);
        this.g = nVar;
        this.h = xheVar;
        this.i = v13Var;
        this.f = new fwf(this);
    }

    public bw1(Context context) {
        context.getClass();
        this.c = context;
        bdt I = hag.I(tg4.class);
        l18 l18Var = l18.b;
        this.e = l18Var.b(I, true);
        this.f = l18Var.b(hag.I(z66.class), true);
        rjq rjqVar = new rjq(false);
        this.g = rjqVar;
        this.h = hld.s(rjqVar, dm6.b());
    }
}
