package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ozw implements fyh, ac6, pm5, x7o, pjn, tt3, nkq, r9i, p7q, hgg {
    public static ozw c;
    public static final int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final /* synthetic */ int a;
    public final Object b;

    public ozw(int i, byte b) {
        this.a = i;
        switch (i) {
            case 25:
                this.b = new dei(new brh());
                break;
            case 26:
            default:
                this.b = new bz2(11);
                break;
            case 27:
                this.b = new ConcurrentHashMap(16);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.b = new ArrayDeque();
                break;
        }
    }

    public static String E(kk9 kk9Var, xzb xzbVar) {
        return ((Number) kk9Var.b.a(xzbVar)).longValue() + ((jk9) kk9Var.a.a(xzbVar)).a;
    }

    public static synchronized ozw F(Context context) {
        ozw ozwVar;
        synchronized (ozw.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (ozw.class) {
                ozwVar = c;
                if (ozwVar == null) {
                    ozwVar = new ozw(applicationContext);
                    c = ozwVar;
                }
            }
            return ozwVar;
        }
        return ozwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(View view, dp8 dp8Var, xzb xzbVar, dfb dfbVar) {
        boolean z;
        boolean z2;
        int h0;
        int i;
        int h02;
        boolean z3;
        u79 u79Var;
        i(dp8Var.a(), CameraProperty.HEIGHT, dp8Var.getId(), view.getResources().getDisplayMetrics(), xzbVar, dfbVar);
        int j0 = vq1.j0(dp8Var.a(), view.getResources().getDisplayMetrics(), xzbVar, view.getLayoutParams());
        boolean z4 = true;
        if (view.getLayoutParams().height == j0) {
            z = false;
        } else {
            view.getLayoutParams().height = j0;
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        u79 u79Var2 = layoutParams instanceof u79 ? (u79) layoutParams : null;
        if (u79Var2 != null) {
            float z5 = z(dp8Var.a(), xzbVar);
            if (u79Var2.c != z5) {
                u79Var2.c = z5;
                z2 = true;
                kk9 y = y(dp8Var.a());
                h0 = y != null ? bg3.h0(y, view.getResources().getDisplayMetrics(), xzbVar) : 0;
                kk9 k = k(dp8Var.a());
                i = Integer.MAX_VALUE;
                h02 = k != null ? bg3.h0(k, view.getResources().getDisplayMetrics(), xzbVar) : Integer.MAX_VALUE;
                if (h0 > h02) {
                    h0 = 0;
                } else {
                    i = h02;
                }
                if (view.getMinimumHeight() != h0) {
                    view.setMinimumHeight(h0);
                    z3 = true;
                } else {
                    z3 = false;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                u79Var = layoutParams2 instanceof u79 ? (u79) layoutParams2 : null;
                if (u79Var != null && u79Var.g != i) {
                    u79Var.g = i;
                    z3 = true;
                }
                if (!z3 && !z2) {
                    z4 = false;
                }
                if (z4) {
                    view.requestLayout();
                    bg3.n(dp8Var, xzbVar, view);
                    return;
                }
                return;
            }
        }
        if (!z) {
            z2 = false;
            kk9 y2 = y(dp8Var.a());
            if (y2 != null) {
            }
            kk9 k2 = k(dp8Var.a());
            i = Integer.MAX_VALUE;
            if (k2 != null) {
            }
            if (h0 > h02) {
            }
            if (view.getMinimumHeight() != h0) {
            }
            ViewGroup.LayoutParams layoutParams22 = view.getLayoutParams();
            if (layoutParams22 instanceof u79) {
            }
            if (u79Var != null) {
                u79Var.g = i;
                z3 = true;
            }
            if (!z3) {
                z4 = false;
            }
            if (z4) {
            }
        }
        z2 = true;
        kk9 y22 = y(dp8Var.a());
        if (y22 != null) {
        }
        kk9 k22 = k(dp8Var.a());
        i = Integer.MAX_VALUE;
        if (k22 != null) {
        }
        if (h0 > h02) {
        }
        if (view.getMinimumHeight() != h0) {
        }
        ViewGroup.LayoutParams layoutParams222 = view.getLayoutParams();
        if (layoutParams222 instanceof u79) {
        }
        if (u79Var != null) {
        }
        if (!z3) {
        }
        if (z4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(View view, dp8 dp8Var, xzb xzbVar, dfb dfbVar) {
        boolean z;
        boolean z2;
        int h0;
        int i;
        int h02;
        boolean z3;
        u79 u79Var;
        i(dp8Var.c(), CameraProperty.WIDTH, dp8Var.getId(), view.getResources().getDisplayMetrics(), xzbVar, dfbVar);
        int j0 = vq1.j0(dp8Var.c(), view.getResources().getDisplayMetrics(), xzbVar, view.getLayoutParams());
        boolean z4 = true;
        if (view.getLayoutParams().width == j0) {
            z = false;
        } else {
            view.getLayoutParams().width = j0;
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        u79 u79Var2 = layoutParams instanceof u79 ? (u79) layoutParams : null;
        if (u79Var2 != null) {
            float z5 = z(dp8Var.c(), xzbVar);
            if (u79Var2.d != z5) {
                u79Var2.d = z5;
                z2 = true;
                kk9 y = y(dp8Var.c());
                h0 = y != null ? bg3.h0(y, view.getResources().getDisplayMetrics(), xzbVar) : 0;
                kk9 k = k(dp8Var.c());
                i = Integer.MAX_VALUE;
                h02 = k != null ? bg3.h0(k, view.getResources().getDisplayMetrics(), xzbVar) : Integer.MAX_VALUE;
                if (h0 > h02) {
                    h0 = 0;
                } else {
                    i = h02;
                }
                if (view.getMinimumWidth() != h0) {
                    view.setMinimumWidth(h0);
                    z3 = true;
                } else {
                    z3 = false;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                u79Var = layoutParams2 instanceof u79 ? (u79) layoutParams2 : null;
                if (u79Var != null && u79Var.h != i) {
                    u79Var.h = i;
                    z3 = true;
                }
                if (!z3 && !z2) {
                    z4 = false;
                }
                if (z4) {
                    view.requestLayout();
                    bg3.n(dp8Var, xzbVar, view);
                    return;
                }
                return;
            }
        }
        if (!z) {
            z2 = false;
            kk9 y2 = y(dp8Var.c());
            if (y2 != null) {
            }
            kk9 k2 = k(dp8Var.c());
            i = Integer.MAX_VALUE;
            if (k2 != null) {
            }
            if (h0 > h02) {
            }
            if (view.getMinimumWidth() != h0) {
            }
            ViewGroup.LayoutParams layoutParams22 = view.getLayoutParams();
            if (layoutParams22 instanceof u79) {
            }
            if (u79Var != null) {
                u79Var.h = i;
                z3 = true;
            }
            if (!z3) {
                z4 = false;
            }
            if (z4) {
            }
        }
        z2 = true;
        kk9 y22 = y(dp8Var.c());
        if (y22 != null) {
        }
        kk9 k22 = k(dp8Var.c());
        i = Integer.MAX_VALUE;
        if (k22 != null) {
        }
        if (h0 > h02) {
        }
        if (view.getMinimumWidth() != h0) {
        }
        ViewGroup.LayoutParams layoutParams222 = view.getLayoutParams();
        if (layoutParams222 instanceof u79) {
        }
        if (u79Var != null) {
        }
        if (!z3) {
        }
        if (z4) {
        }
    }

    public static void i(bk9 bk9Var, String str, String str2, DisplayMetrics displayMetrics, xzb xzbVar, dfb dfbVar) {
        kk9 k;
        kk9 y = y(bk9Var);
        if (y == null || (k = k(bk9Var)) == null || bg3.h0(y, displayMetrics, xzbVar) <= bg3.h0(k, displayMetrics, xzbVar)) {
            return;
        }
        dfbVar.d(new Throwable(String.format("Element has incorrect %s constraints (min size is bigger than max size). %sminSize: %s, maxSize: %s.", Arrays.copyOf(new Object[]{str, str2 != null ? String.format("Id: '%s', ", Arrays.copyOf(new Object[]{str2}, 1)) : "", E(y, xzbVar), E(k, xzbVar)}, 4))));
    }

    public static kk9 k(bk9 bk9Var) {
        if (bk9Var instanceof ak9) {
            return ((ak9) bk9Var).b.b;
        }
        if (bk9Var instanceof zj9) {
            return ((zj9) bk9Var).b.a;
        }
        return null;
    }

    public static kk9 y(bk9 bk9Var) {
        if (bk9Var instanceof ak9) {
            return ((ak9) bk9Var).b.c;
        }
        if (bk9Var instanceof zj9) {
            return ((zj9) bk9Var).b.b;
        }
        return null;
    }

    public static float z(bk9 bk9Var, xzb xzbVar) {
        szb szbVar;
        zj9 zj9Var = bk9Var instanceof zj9 ? (zj9) bk9Var : null;
        if (zj9Var == null || (szbVar = zj9Var.b.c) == null) {
            return 0.0f;
        }
        return (float) ((Number) szbVar.a(xzbVar)).doubleValue();
    }

    public void A(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        ((x7o) this.b).onSuccess(new dn(uri, str));
    }

    public void B(int i, boolean z) {
        bz2 bz2Var = (bz2) this.b;
        if (!z) {
            bz2Var.getClass();
        } else {
            vq1.A(!bz2Var.b);
            ((SparseBooleanArray) bz2Var.c).delete(i);
        }
    }

    public y7o C(q1f q1fVar) {
        q1fVar.getClass();
        r1f r1fVar = q1fVar.a;
        if (r1fVar != r1f.f && r1fVar != r1f.g) {
            return new y7o(null, new v1f(f1d.g("Unable to JSON-deserialize object: ", r1fVar.name()), null));
        }
        try {
            return new y7o(D(xee.A(q1fVar)), null);
        } catch (Throwable th) {
            return new y7o(null, new v1f("Unable to JSON-serialize object", new Throwable(th.getMessage())));
        }
    }

    public String D(Serializable serializable) {
        n7f n7fVar;
        boolean z;
        dei deiVar = (dei) this.b;
        if (serializable == null) {
            return "null";
        }
        if (serializable instanceof Integer) {
            deiVar.getClass();
            return deiVar.a(Integer.TYPE, avt.a, null).d(serializable);
        }
        if (serializable instanceof Long) {
            deiVar.getClass();
            return deiVar.a(Long.TYPE, avt.a, null).d(serializable);
        }
        if (serializable instanceof Double) {
            deiVar.getClass();
            return deiVar.a(Double.TYPE, avt.a, null).d(serializable);
        }
        if (serializable instanceof String) {
            deiVar.getClass();
            return deiVar.a(String.class, avt.a, null).d(serializable);
        }
        if (serializable instanceof Boolean) {
            deiVar.getClass();
            return deiVar.a(Boolean.TYPE, avt.a, null).d(serializable);
        }
        if (serializable instanceof List) {
            deiVar.getClass();
            z3f a = deiVar.a(List.class, avt.a, null);
            hi3 hi3Var = new hi3();
            try {
                n7fVar = new n7f(hi3Var);
                z = n7fVar.e;
                n7fVar.e = true;
                try {
                    a.e(n7fVar, serializable);
                    return hi3Var.G0();
                } finally {
                }
            } catch (IOException e) {
                xq0.w(e);
                return null;
            }
        }
        if (!(serializable instanceof Map)) {
            wvs.p("Unknown object type to serialize: ".concat(serializable.getClass().getSimpleName()));
            return null;
        }
        deiVar.getClass();
        z3f a2 = deiVar.a(Map.class, avt.a, null);
        hi3 hi3Var2 = new hi3();
        try {
            n7fVar = new n7f(hi3Var2);
            z = n7fVar.e;
            n7fVar.e = true;
            try {
                a2.e(n7fVar, serializable);
                return hi3Var2.G0();
            } finally {
            }
        } catch (IOException e2) {
            xq0.w(e2);
            return null;
        }
    }

    public synchronized void G() {
        ihr ihrVar = (ihr) this.b;
        ReentrantLock reentrantLock = ihrVar.a;
        reentrantLock.lock();
        try {
            ihrVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void a(int i, boolean z) {
        bz2 bz2Var = (bz2) this.b;
        if (z) {
            bz2Var.i(i);
        } else {
            bz2Var.getClass();
        }
    }

    @Override // defpackage.nkq
    public void b(ka8 ka8Var) {
        ((jm5) this.b).b(ka8Var);
    }

    @Override // defpackage.hgg
    public void d(jgg jggVar, long j, long j2, boolean z) {
        ((n97) this.b).C((d8k) jggVar, j2);
    }

    @Override // defpackage.fyh
    public void e(hxh hxhVar, boolean z) {
        if (hxhVar instanceof tmr) {
            ((tmr) hxhVar).z.k().c(false);
        }
        fyh fyhVar = ((dg) this.b).e;
        if (fyhVar != null) {
            fyhVar.e(hxhVar, z);
        }
    }

    @Override // defpackage.pjn
    public q1 f(znk znkVar) {
        return (q1) this.b;
    }

    @Override // defpackage.hgg
    public void g(jgg jggVar, long j, long j2) {
        long j3;
        d8k d8kVar = (d8k) jggVar;
        n97 n97Var = (n97) this.b;
        long j4 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        n97Var.m.getClass();
        n97Var.q.M(cfgVar, d8kVar.c);
        d97 d97Var = (d97) d8kVar.f;
        d97 d97Var2 = n97Var.H;
        int size = d97Var2 == null ? 0 : d97Var2.m.size();
        long j5 = d97Var.b(0).b;
        int i = 0;
        while (i < size && n97Var.H.b(i).b < j5) {
            i++;
        }
        if (d97Var.d) {
            if (size - i > d97Var.m.size()) {
                vq1.n0("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j6 = n97Var.Y;
                j3 = -9223372036854775807L;
                if (j6 == -9223372036854775807L || d97Var.h * 1000 > j6) {
                    n97Var.X = 0;
                } else {
                    vq1.n0("DashMediaSource", "Loaded stale dynamic manifest: " + d97Var.h + ", " + n97Var.Y);
                }
            }
            int i2 = n97Var.X;
            n97Var.X = i2 + 1;
            if (i2 < n97Var.m.r(d8kVar.c)) {
                n97Var.D.postDelayed(n97Var.v, Math.min((n97Var.X - 1) * 1000, ScreenMirroringConfig.Test.pcVideoUdpPort));
                return;
            } else {
                n97Var.C = new g97();
                return;
            }
        }
        j3 = -9223372036854775807L;
        n97Var.H = d97Var;
        n97Var.I = d97Var.d & n97Var.I;
        n97Var.J = j - j2;
        n97Var.K = j;
        n97Var.Z += i;
        synchronized (n97Var.t) {
            try {
                if (d8kVar.b.a == n97Var.F) {
                    Uri uri = n97Var.H.k;
                    if (uri == null) {
                        uri = d8kVar.d.c;
                    }
                    n97Var.F = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d97 d97Var3 = n97Var.H;
        if (!d97Var3.d || n97Var.L != j3) {
            n97Var.E(true);
            return;
        }
        y3e y3eVar = d97Var3.i;
        if (y3eVar == null) {
            n97Var.B();
            return;
        }
        String str = y3eVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                n97Var.L = dvt.b0(y3eVar.c) - n97Var.K;
                n97Var.E(true);
                return;
            } catch (r7k e) {
                n97Var.D(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            n97Var.F(y3eVar, new l97());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            n97Var.F(y3eVar, new ogp());
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            n97Var.B();
        } else {
            n97Var.D(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public y7o j(String str) {
        q1f F;
        str.getClass();
        try {
            boolean v = c.v(StringsKt.v0(str).toString(), "{", false);
            dei deiVar = (dei) this.b;
            if (v) {
                deiVar.getClass();
                Map map = (Map) deiVar.a(Map.class, avt.a, null).b(str);
                if (map != null) {
                    F = xee.F(map);
                }
                F = null;
            } else {
                deiVar.getClass();
                List list = (List) deiVar.a(List.class, avt.a, null).b(str);
                if (list != null) {
                    F = xee.F(list);
                }
                F = null;
            }
            if (F != null) {
                return new y7o(F, null);
            }
            return new y7o(null, new v1f("Unable to JSON-deserialize object \"" + str + "\"", null));
        } catch (Throwable th) {
            return new y7o(null, new v1f(hrg.q("Unable to JSON-deserialize object \"", str, "\""), th));
        }
    }

    @Override // defpackage.r9i
    public void l(String str) {
        str.getClass();
        ((oc4) ((ltm) this.b)).c(new u7o(new cgm(str)));
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        jzs jzsVar = szuVar.l;
        e5q e5qVar = szuVar.a;
        if (swf.V(jzsVar.g) && !swf.R(jzsVar.g) && wxf.m((vuu) this.b, hdg.i0(e5qVar)) && !gut.R(e5qVar) && szuVar.m.b.c) {
            return jzsVar;
        }
        return null;
    }

    @Override // defpackage.hgg
    public void o(jgg jggVar, long j, long j2, int i) {
        cfg cfgVar;
        d8k d8kVar = (d8k) jggVar;
        n97 n97Var = (n97) this.b;
        if (i == 0) {
            long j3 = d8kVar.a;
            cfgVar = new cfg(d8kVar.b);
        } else {
            long j4 = d8kVar.a;
            nb7 nb7Var = d8kVar.b;
            ngr ngrVar = d8kVar.d;
            cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        }
        n97Var.q.R(cfgVar, d8kVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.nkq
    public void onError(Throwable th) {
        ((jm5) this.b).onError(th);
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 10:
                fg3 fg3Var = (fg3) obj;
                fg3Var.getClass();
                z03 z03Var = (z03) this.b;
                cdv cdvVar = (cdv) z03Var.e;
                if (cdvVar != null) {
                    cdvVar.C(ycv.a);
                }
                sx3 sx3Var = (sx3) z03Var.f;
                if (sx3Var != null) {
                    sx3Var.a(new px3(fg3Var));
                    break;
                }
                break;
            case 17:
                ((jm5) this.b).onComplete();
                break;
            default:
                fg3 fg3Var2 = (fg3) obj;
                fg3Var2.getClass();
                z07 z07Var = (z07) this.b;
                z07Var.E.l(ycv.a);
                z07Var.C.l(new px3(fg3Var2));
                break;
        }
    }

    @Override // defpackage.r9i
    public void p(t9i t9iVar) {
        t9iVar.getClass();
        ((oc4) ((ltm) this.b)).c(new u7o(new dgm(t9iVar)));
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return null;
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        pm5 pm5Var;
        switch (this.a) {
            case 7:
                nr1 nr1Var = (nr1) this.b;
                if (exc == null) {
                    nsh nshVar = nr1Var.u;
                    or1 or1Var = nr1Var.p;
                    if (!or1Var.isCancelled()) {
                        if (or1Var.j != null) {
                            ((ys1) nshVar.d).e(or1Var.i);
                        }
                        nr1Var.toString();
                        Iterator it = ((CopyOnWriteArrayList) nshVar.b).iterator();
                        while (it.hasNext()) {
                            ((cjq) it.next()).getClass();
                        }
                        break;
                    }
                } else {
                    nr1Var.b(exc);
                    break;
                }
                break;
            default:
                ss1 ss1Var = (ss1) this.b;
                if (!ss1Var.n) {
                    ss1Var.n = true;
                    ss1Var.o = exc;
                    if (!ss1Var.p.i() && (pm5Var = ss1Var.s) != null) {
                        pm5Var.r(exc);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.tt3
    public void s(Typeface typeface) {
        bu4 bu4Var = (bu4) this.b;
        if (bu4Var.z(typeface)) {
            bu4Var.l(false);
        }
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return null;
    }

    @Override // defpackage.hgg
    public mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        d8k d8kVar = (d8k) jggVar;
        n97 n97Var = (n97) this.b;
        long j3 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        int i2 = d8kVar.c;
        long C = n97Var.m.C(new j4x(iOException, i, 9));
        mdr mdrVar = C == -9223372036854775807L ? osh.m : new mdr(0, C, false);
        n97Var.q.P(cfgVar, i2, iOException, !mdrVar.b());
        return mdrVar;
    }

    @Override // defpackage.fyh
    public boolean w(hxh hxhVar) {
        dg dgVar = (dg) this.b;
        if (hxhVar == dgVar.c) {
            return false;
        }
        ((tmr) hxhVar).A.getClass();
        fyh fyhVar = dgVar.e;
        if (fyhVar != null) {
            return fyhVar.w(hxhVar);
        }
        return false;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        switch (this.a) {
            case 10:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                ((z03) this.b).i(bfkVar);
                break;
            default:
                bfk bfkVar2 = (bfk) obj;
                bfkVar2.getClass();
                z07 z07Var = (z07) this.b;
                z07Var.E.l(ycv.a);
                z07Var.C.l(new mx3(bfkVar2));
                break;
        }
    }

    public ozw(Context context) {
        String d2;
        this.a = 0;
        ihr a = ihr.a(context);
        this.b = a;
        a.b();
        String d3 = a.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d3) || (d2 = a.d(ihr.g("googleSignInOptions", d3))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.a(d2);
        } catch (JSONException unused) {
        }
    }

    public ozw(d01 d01Var) {
        this.a = 6;
        d01Var.getClass();
        this.b = d01Var;
    }

    public ozw(Double d2, Double d3) {
        this.a = 12;
        this.b = d2;
    }

    public ozw(vuu vuuVar) {
        this.a = 21;
        vuuVar.getClass();
        this.b = vuuVar;
    }

    public ozw(int i) {
        this.a = 19;
        TimeUnit.MINUTES.getClass();
        this.b = new fpa(m8s.h, i);
    }

    public /* synthetic */ ozw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ozw(d8l d8lVar) {
        this.a = 1;
        bz2 bz2Var = new bz2(11);
        this.b = bz2Var;
        bz2Var.j(d8lVar.a);
    }
}
