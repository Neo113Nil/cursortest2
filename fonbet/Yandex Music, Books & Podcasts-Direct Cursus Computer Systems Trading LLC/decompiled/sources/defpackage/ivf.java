package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.t;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.s0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class ivf {
    public final /* synthetic */ int a;

    public /* synthetic */ ivf(int i) {
        this.a = i;
    }

    public static final int A(fvf fvfVar) {
        fvfVar.getClass();
        cvf cvfVar = (cvf) CollectionsKt.firstOrNull(fvfVar.j().k);
        if (cvfVar == null) {
            return Integer.MAX_VALUE;
        }
        if (cvfVar.a != 0) {
            return 0;
        }
        return cvfVar.q + cvfVar.p;
    }

    public static final int B(fvf fvfVar) {
        fvfVar.getClass();
        if (fvfVar.h() != 0) {
            return 0;
        }
        return fvfVar.i();
    }

    public static ColorStateList C(Context context, lum lumVar, int i) {
        int resourceId;
        ColorStateList E;
        TypedArray typedArray = (TypedArray) lumVar.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (E = etn.E(context, resourceId)) == null) ? lumVar.J(i) : E;
    }

    public static ColorStateList D(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList E;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (E = etn.E(context, resourceId)) == null) ? typedArray.getColorStateList(i) : E;
    }

    public static int E(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable F(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable w;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (w = y2x.w(context, resourceId)) == null) ? typedArray.getDrawable(i) : w;
    }

    public static void G(t tVar) {
        if (tVar == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = tVar.getPackageManager().getApplicationInfo(tVar.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && lbv.m == 0) {
                int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    int i2 = lbv.m;
                    i = R.style.com_facebook_activity_theme;
                }
                lbv.m = i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean H(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean I(cvl cvlVar) {
        cvlVar.getClass();
        String str = cvlVar.c.a;
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return Intrinsics.d(((frt) qdcVar.C(I)).c().a, str);
    }

    public static String J(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            xq0.x("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final vyo K(vyo vyoVar) {
        vyoVar.getClass();
        return new vyo(vyoVar.b, vyoVar.a);
    }

    public static final dyi L(hq5 hq5Var) {
        View view = (View) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.f);
        oq5 oq5Var = (oq5) hq5Var;
        boolean f = oq5Var.f(view);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            K = new dyi(view);
            oq5Var.k0(K);
        }
        return (dyi) K;
    }

    public static final jtp M(y7o y7oVar) {
        if (y7oVar.c()) {
            return nif.d(y7oVar.a());
        }
        r7w r7wVar = y7oVar.b;
        up6.D(r7wVar);
        return nif.c(r7wVar);
    }

    public static String N(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    public static final ArrayList O(List list, v80 v80Var, e6v e6vVar, boolean z) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new jzs((mqs) it.next(), v80Var, null, null, null, null, e6vVar, z));
        }
        return arrayList;
    }

    public static final c0 P(fpw fpwVar, s0 s0Var) {
        long j = fpwVar.b;
        long j2 = fpwVar.c;
        boolean z = !fpwVar.a;
        double d = fpwVar.d.a;
        qrl q = c0.q();
        q.j(j);
        q.h(j2);
        q.i(z);
        q.d();
        c0.h((c0) q.b, d);
        q.k(s0Var);
        return (c0) q.b();
    }

    public static boolean Q(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = m7x.b;
            }
        } else {
            if (!(collection instanceof w7x)) {
                return false;
            }
            obj = ((w7x) collection).c;
        }
        return comparator.equals(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wn5 wn5Var, Function0 function0, hq5 hq5Var, int i, int i2) {
        tyc tycVar;
        int i3;
        Function0 function02;
        Function0 function03;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1858437024);
        if ((i & 6) == 0) {
            wn5 wn5Var2 = wn5Var;
            i3 = i | (oq5Var.h(wn5Var2) ? 4 : 2);
            tycVar = wn5Var2;
        } else {
            tycVar = wn5Var;
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= oq5Var.h(function02) ? 32 : 16;
            if (oq5Var.P(i3 & 1, (i3 & 19) == 18)) {
                oq5Var.S();
                function03 = function02;
            } else {
                Function0 function04 = i4 != 0 ? null : function02;
                ges i5 = nu0.i();
                ges i6 = nu0.i();
                float P = ff7.P(i5.b.c, oq5Var);
                float f = 66;
                yci u = xp3.u(vci.a, o5g.F(oq5Var));
                boolean z = function04 != null;
                boolean z2 = (i3 & 112) == 32;
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new or(29, function04);
                    oq5Var.k0(K);
                }
                yci b = a.b(a.e(u, z, null, null, (Function0) K, 6), ((dq0) oq5Var.j(eq0.a)).d.c, vnj.i);
                float f2 = 12;
                yci r2 = d.r(androidx.compose.ui.platform.a.a(d.e(androidx.compose.foundation.layout.a.p(b, f2, 8, f2, f2), f + P), "mixes_block_view_all_button_item"), irv.h(oq5Var) ? 120 : 76);
                kfh d = ug3.d(b2c.b, false);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, r2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                tycVar.invoke(b.a, i5, i6, oq5Var, Integer.valueOf(((i3 << 9) & 7168) | 6));
                oq5Var.p(true);
                function03 = function04;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new uf4(wn5Var, function03, i, i2, 4);
                return;
            }
            return;
        }
        function02 = function0;
        if (oq5Var.P(i3 & 1, (i3 & 19) == 18)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, wn5] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, pyc] */
    /* JADX WARN: Type inference failed for: r2v20, types: [wn5] */
    /* JADX WARN: Type inference failed for: r4v3, types: [wn5] */
    public static final void b(wn5 wn5Var, pyc pycVar, wn5 wn5Var2, wn5 wn5Var3, boolean z, onu onuVar, gtu gtuVar, ya0 ya0Var, hq5 hq5Var, int i) {
        yci c;
        onu onuVar2;
        boolean z2;
        wn5 wn5Var4;
        boolean z3;
        wn5 wn5Var5;
        wn5 wn5Var6;
        wn5 wn5Var7 = wn5Var3;
        iz2 iz2Var = b2c.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1201353325);
        int i2 = i | (oq5Var.h(wn5Var) ? 4 : 2) | (oq5Var.h(pycVar) ? 32 : 16) | (oq5Var.h(wn5Var2) ? 256 : 128) | (oq5Var.h(wn5Var7) ? 2048 : 1024) | (oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.d(onuVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(gtuVar) ? 1048576 : 524288) | (oq5Var.h(ya0Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
        if ((4793491 & i2) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            onuVar2 = onuVar;
            wn5Var6 = wn5Var2;
            wn5Var5 = wn5Var7;
        } else {
            gtuVar.getClass();
            vci vciVar = vci.a;
            if (ya0Var == null) {
                c = vciVar;
            } else {
                bxj bxjVar = bxj.a;
                c = ya0Var.c(true);
            }
            nho a = lho.a(qx0.a, b2c.k, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (0.6666666f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 0.6666666f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6666666f);
            ta5 a2 = sa5.a(qx0.d, b2c.n, oq5Var, 6);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci c2 = androidx.compose.ui.draw.a.c(q7g.N(xp3.v(new LayoutWeightElement(true, 1.0f))), new vp(4, 48));
            kfh d = ug3.d(b2c.f, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, c2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            Integer valueOf = Integer.valueOf(6 | ((i2 >> 12) & 112) | ((i2 << 6) & 896));
            b bVar = b.a;
            onuVar2 = onuVar;
            wn5Var.invoke(bVar, onuVar2, oq5Var, valueOf);
            oq5Var.p(true);
            if (((Boolean) oq5Var.j(upg.a)).booleanValue()) {
                z2 = false;
                oq5Var.Z(-2096563575);
            } else {
                oq5Var.Z(-2088288001);
                u1g.l(oq5Var, d.e(vciVar, gtuVar.e));
                yci d2 = d.d(androidx.compose.foundation.layout.a.o(c, 16, 0.0f, 2), 1.0f);
                kfh d3 = ug3.d(iz2Var, false);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l4 = oq5Var.l();
                yci H4 = vnj.H(oq5Var, d2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, kb5Var);
                g0g.U(oq5Var, l4, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H4, kb5Var4);
                pycVar.invoke(bVar, oq5Var, Integer.valueOf(6 | (i2 & 112)));
                oq5Var.p(true);
                z2 = false;
            }
            oq5Var.p(z2);
            u1g.l(oq5Var, d.e(vciVar, gtuVar.f));
            if (z) {
                oq5Var.Z(-2087850126);
                yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 24, 0.0f, 2);
                kfh d4 = ug3.d(iz2Var, false);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l5 = oq5Var.l();
                yci H5 = vnj.H(oq5Var, o);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d4, kb5Var);
                g0g.U(oq5Var, l5, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H5, kb5Var4);
                ?? r2 = wn5Var2;
                r2.invoke(bVar, oq5Var, Integer.valueOf(6 | ((i2 >> 3) & 112)));
                oq5Var.p(true);
                z3 = false;
                wn5Var4 = r2;
            } else {
                wn5Var4 = wn5Var2;
                z3 = false;
                oq5Var.Z(-2096563575);
            }
            oq5Var.p(z3);
            u1g.l(oq5Var, d.e(vciVar, gtuVar.g + 56));
            oq5Var.p(true);
            yci h = d.h(vciVar, ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenHeightDp);
            if (0.33333334f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            int i8 = 1;
            yci f = h.f(new LayoutWeightElement(true, 0.33333334f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.33333334f));
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new vru(i8);
                oq5Var.k0(K);
            }
            yci b = androidx.compose.ui.layout.a.b(f, (pyc) K);
            kfh d5 = ug3.d(iz2Var, false);
            int i9 = oq5Var.P;
            androidx.compose.runtime.internal.a l6 = oq5Var.l();
            yci H6 = vnj.H(oq5Var, b);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d5, kb5Var);
            g0g.U(oq5Var, l6, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var, i9, kb5Var3);
            }
            g0g.U(oq5Var, H6, kb5Var4);
            ?? r4 = wn5Var3;
            r4.invoke(bVar, ihv.b, oq5Var, Integer.valueOf(((i2 >> 3) & 896) | 54));
            oq5Var.p(true);
            oq5Var.p(true);
            wn5Var6 = wn5Var4;
            wn5Var5 = r4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new atu(wn5Var, pycVar, wn5Var6, wn5Var5, z, onuVar2, gtuVar, ya0Var, i, 1);
        }
    }

    public static final void c(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1737278873);
        if (oq5Var.P(i & 1, i != 0)) {
            q5g.k(null, null, 0L, 0L, null, 0.0f, xv.g, oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j1p(i, 14);
        }
    }

    public static final void d(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1725105707);
        int i2 = i | 6;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            float f = 16;
            float f2 = 8;
            vci vciVar = vci.a;
            yci y = d.y(androidx.compose.foundation.layout.a.p(vciVar, f, f2, f2, f), b2c.n, true);
            nho a = lho.a(qx0.g(f2), b2c.k, oq5Var, 6);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, y);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            dcc.b(60, 0.0f, oq5Var, 6);
            float f3 = 100;
            dcc.b(f3, 0.0f, oq5Var, 6);
            dcc.b(f3, 0.0f, oq5Var, 6);
            dcc.b(f3, 0.0f, oq5Var, 6);
            dcc.b(f3, 0.0f, oq5Var, 6);
            oq5Var.p(true);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 5);
        }
    }

    public static final void e(Function0 function0, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-930472206);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            a(y2x.e, function0, oq5Var, ((i2 << 3) & 112) | 6, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zk(function0, i, 24);
        }
    }

    public static final void f(final boolean z, hq5 hq5Var, int i) {
        final float f;
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(424131772);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            if (irv.h(oq5Var)) {
                f = 120;
                i2 = 80;
            } else {
                f = 76;
                i2 = 52;
            }
            final float f2 = i2;
            a(ild.C(-796575209, new tyc() { // from class: r8i
                @Override // defpackage.tyc
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i4;
                    dh3 dh3Var = (dh3) obj;
                    ges gesVar = (ges) obj2;
                    ges gesVar2 = (ges) obj3;
                    hq5 hq5Var2 = (hq5) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    dh3Var.getClass();
                    gesVar.getClass();
                    gesVar2.getClass();
                    if ((intValue & 6) == 0) {
                        i4 = (((oq5) hq5Var2).f(dh3Var) ? 4 : 2) | intValue;
                    } else {
                        i4 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i4 |= ((oq5) hq5Var2).f(gesVar) ? 32 : 16;
                    }
                    if ((intValue & 384) == 0) {
                        i4 |= ((oq5) hq5Var2).f(gesVar2) ? 256 : 128;
                    }
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.P(i4 & 1, (i4 & 1171) != 1170)) {
                        iz2 iz2Var = b2c.b;
                        vci vciVar = vci.a;
                        yci a = dh3Var.a(vciVar, iz2Var);
                        ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                        int i5 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, a);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, a2, wp5.f);
                        g0g.U(oq5Var2, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                            ouj.x(i5, oq5Var2, i5, kb5Var);
                        }
                        g0g.U(oq5Var2, H, wp5.d);
                        yci r = d.r(xp3.u(vciVar, o5g.C(oq5Var2)), f);
                        int i6 = (i4 << 3) & 896;
                        boolean z2 = z;
                        ivf.l(z2, r, gesVar, oq5Var2, i6, 0);
                        yci u = xp3.u(vciVar, o5g.C(oq5Var2));
                        float f3 = f2;
                        ivf.l(z2, d.r(u, f3), gesVar, oq5Var2, i6, 0);
                        oq5Var2.p(true);
                        ivf.l(z2, dh3Var.a(d.r(xp3.u(vciVar, o5g.C(oq5Var2)), f3), b2c.h), gesVar2, oq5Var2, i4 & 896, 0);
                    } else {
                        oq5Var2.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), null, oq5Var, 6, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sm(i, 26, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0294, code lost:
    
        if (r1 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0296, code lost:
    
        r12 = ru.yandex.music.R.string.stub_subtitle_no_connection_with_downloads;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02a1, code lost:
    
        if (r1 != false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(jmj jmjVar, yci yciVar, boolean z, hmj hmjVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean h;
        Object K;
        kjn kjnVar;
        kjn kjnVar2;
        int i6;
        boolean z4;
        oq5 oq5Var;
        int ordinal;
        int ordinal2;
        boolean z5;
        String str;
        oq5 oq5Var2;
        boolean z6;
        boolean z7;
        boolean z8;
        hmj hmjVar2;
        yci yciVar3;
        boolean z9;
        boolean z10;
        oq5 oq5Var3;
        final mmj mmjVar;
        float f;
        int i7;
        int i8;
        vci vciVar;
        String str2;
        xmn r;
        jmjVar.getClass();
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(-1955881730);
        if ((i & 6) == 0) {
            i3 = (oq5Var4.h(jmjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var4.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= oq5Var4.g(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= oq5Var4.d(hmjVar == null ? -1 : hmjVar.ordinal()) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 || !oq5Var4.z()) {
                    vci vciVar2 = vci.a;
                    yci yciVar4 = i9 != 0 ? vciVar2 : yciVar2;
                    z3 = i4 != 0 ? false : z2;
                    hmj hmjVar3 = i5 != 0 ? hmj.a : hmjVar;
                    final mmj mmjVar2 = (mmj) gld.O(jmjVar.getState(), oq5Var4).getValue();
                    gz2 gz2Var = b2c.o;
                    yci m = androidx.compose.foundation.layout.a.m(yciVar4, irv.g(oq5Var4) ? 8 : 16);
                    h = oq5Var4.h(jmjVar);
                    K = oq5Var4.K();
                    kjnVar = gq5.a;
                    if (!h || K == kjnVar) {
                        kjnVar2 = kjnVar;
                        w4i w4iVar = new w4i(2, jmjVar, jmj.class, "onVisibilityChanged", "onVisibilityChanged(ZLjava/lang/String;)V", 0, 7);
                        oq5Var4.k0(w4iVar);
                        K = w4iVar;
                    } else {
                        kjnVar2 = kjnVar;
                    }
                    yci a = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(m, null, 0L, 0.0f, null, (Function2) ((h9f) K), 15), "offline_switcher");
                    ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var4, 48);
                    i6 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l = oq5Var4.l();
                    yci H = vnj.H(oq5Var4, a);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, a2, wp5.f);
                    g0g.U(oq5Var4, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var4, i6, kb5Var);
                    }
                    g0g.U(oq5Var4, H, wp5.d);
                    if (z3) {
                        oq5Var4.Z(825737673);
                        z4 = !irv.g(oq5Var4);
                        oq5Var4.p(false);
                    } else {
                        oq5Var4.Z(-171934676);
                        oq5Var4.p(false);
                        z4 = false;
                    }
                    if (z4) {
                        oq5Var4.Z(-171905128);
                        gae.b(a0g.E(mmjVar2.c ? R.drawable.ic_offline_mode_offline_40 : R.drawable.ic_offline_mode_lte_wi_fi_40, 0, oq5Var4), null, d.m(vciVar2, 64), ((dq0) oq5Var4.j(eq0.a)).a.a, oq5Var4, 432, 0);
                        oq5Var = oq5Var4;
                        eta.p(vciVar2, 40, oq5Var, false);
                    } else {
                        oq5Var = oq5Var4;
                        oq5Var.Z(-176218034);
                        oq5Var.p(false);
                    }
                    boolean z11 = mmjVar2.c;
                    boolean z12 = mmjVar2.b;
                    boolean z13 = mmjVar2.a;
                    boolean z14 = mmjVar2.d;
                    String M = rvf.M(z11 ? R.string.stub_title_offline_mode : R.string.stub_title_no_connection, oq5Var);
                    h6g h6gVar = nu0.a;
                    h6g h6gVar2 = h6g.c;
                    ges c = nu0.c();
                    agr agrVar = eq0.a;
                    oq5 oq5Var5 = oq5Var;
                    yci yciVar5 = yciVar4;
                    final int i10 = 2;
                    final jmj jmjVar2 = jmjVar;
                    xcs.b(M, androidx.compose.ui.platform.a.a(vciVar2, "offline_switcher_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c, oq5Var5, 48, 0, 65016);
                    float f2 = 12;
                    u1g.l(oq5Var5, d.e(vciVar2, f2));
                    ordinal = hmjVar3.ordinal();
                    int i11 = R.string.stub_subtitle_no_connection_no_downloads;
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (!z14) {
                                if (!z13) {
                                    if (!z11) {
                                    }
                                    i11 = R.string.stub_subtitle_offline_mode;
                                }
                                i11 = R.string.stub_subtitle_no_connection_with_wave_and_downloads;
                            }
                            i11 = R.string.stub_subtitle_no_connection_no_auto_cache;
                        } else if (ordinal == 2) {
                            i11 = z11 ? R.string.stub_subtitle_offline_search : R.string.stub_subtitle_no_connection_search;
                        } else {
                            if (ordinal != 3) {
                                b6e.s();
                                return;
                            }
                            i11 = z11 ? R.string.profile_offline_mode_description : R.string.no_connection_text_2;
                        }
                        xcs.b(rvf.M(i11, oq5Var5), androidx.compose.ui.platform.a.a(vciVar2, "offline_switcher_message"), ((dq0) oq5Var5.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var5, 48, 0, 65016);
                        u1g.l(oq5Var5, d.e(vciVar2, !irv.g(oq5Var5) ? f2 : 24));
                        ordinal2 = hmjVar3.ordinal();
                        if (ordinal2 != 0) {
                            kjn kjnVar3 = kjnVar2;
                            int i12 = -176218034;
                            oq5Var5.Z(-170589240);
                            if (z13) {
                                oq5Var5.Z(-170614164);
                                String M2 = rvf.M(R.string.stub_button_play_my_vibe, oq5Var5);
                                boolean h2 = oq5Var5.h(jmjVar2);
                                Object K2 = oq5Var5.K();
                                if (h2 || K2 == kjnVar3) {
                                    z5 = z13;
                                    m9j m9jVar = new m9j(0, jmjVar, jmj.class, "onPlayMyVibe", "onPlayMyVibe()V", 0, 21);
                                    jmjVar2 = jmjVar;
                                    oq5Var5.k0(m9jVar);
                                    K2 = m9jVar;
                                } else {
                                    z5 = z13;
                                }
                                hdg.o(M2, (Function0) ((h9f) K2), androidx.compose.ui.platform.a.a(d.t(vciVar2, mu0.j, 0.0f, 2), "offline_switcher_primary_button"), 0.0f, oq5Var5, 384, 8);
                                eta.p(vciVar2, f2, oq5Var5, false);
                                i12 = -176218034;
                            } else {
                                z5 = z13;
                                oq5Var5.Z(-176218034);
                                oq5Var5.p(false);
                            }
                            if (z14) {
                                oq5Var5.Z(-170091039);
                                String M3 = rvf.M(R.string.stub_button_open_auto_cache, oq5Var5);
                                boolean h3 = oq5Var5.h(jmjVar2);
                                Object K3 = oq5Var5.K();
                                if (h3 || K3 == kjnVar3) {
                                    m9j m9jVar2 = new m9j(0, jmjVar, jmj.class, "onOpenAutoCacheSettings", "onOpenAutoCacheSettings()V", 0, 22);
                                    jmjVar2 = jmjVar;
                                    oq5Var5.k0(m9jVar2);
                                    K3 = m9jVar2;
                                }
                                hdg.o(M3, (Function0) ((h9f) K3), androidx.compose.ui.platform.a.a(d.t(vciVar2, 260, 0.0f, 2), "offline_switcher_primary_button"), 0.0f, oq5Var5, 384, 8);
                                eta.p(vciVar2, f2, oq5Var5, false);
                                i12 = -176218034;
                            } else {
                                oq5Var5.Z(i12);
                                oq5Var5.p(false);
                            }
                            if (z12) {
                                oq5Var5.Z(-169571138);
                                boolean z15 = z5;
                                if (z15) {
                                    oq5Var5.Z(825815942);
                                    String M4 = rvf.M(R.string.stub_button_open_downloads, oq5Var5);
                                    boolean h4 = oq5Var5.h(jmjVar2);
                                    Object K4 = oq5Var5.K();
                                    if (h4 || K4 == kjnVar3) {
                                        str = "offline_switcher_secondary_button";
                                        m9j m9jVar3 = new m9j(0, jmjVar, jmj.class, "onOpenCollectionDownloads", "onOpenCollectionDownloads()V", 0, 23);
                                        jmjVar2 = jmjVar;
                                        oq5Var5.k0(m9jVar3);
                                        K4 = m9jVar3;
                                    } else {
                                        str = "offline_switcher_secondary_button";
                                    }
                                    oq5Var2 = oq5Var5;
                                    hdg.t(M4, (Function0) ((h9f) K4), androidx.compose.ui.platform.a.a(d.t(vciVar2, mu0.j, 0.0f, 2), str), null, oq5Var2, 384, 8);
                                    z6 = false;
                                    oq5Var5.p(false);
                                } else {
                                    str = "offline_switcher_secondary_button";
                                    if (z15) {
                                        throw vz1.i(oq5Var5, 825814569, false);
                                    }
                                    oq5Var5.Z(825830946);
                                    String M5 = rvf.M(R.string.stub_button_open_downloads, oq5Var5);
                                    boolean h5 = oq5Var5.h(jmjVar2);
                                    Object K5 = oq5Var5.K();
                                    if (h5 || K5 == kjnVar3) {
                                        m9j m9jVar4 = new m9j(0, jmjVar, jmj.class, "onOpenCollectionDownloads", "onOpenCollectionDownloads()V", 0, 24);
                                        jmjVar2 = jmjVar;
                                        oq5Var5.k0(m9jVar4);
                                        K5 = m9jVar4;
                                    }
                                    oq5Var2 = oq5Var5;
                                    hdg.o(M5, (Function0) ((h9f) K5), androidx.compose.ui.platform.a.a(d.t(vciVar2, mu0.j, 0.0f, 2), "offline_switcher_primary_button"), 0.0f, oq5Var2, 384, 8);
                                    z6 = false;
                                    oq5Var2.p(false);
                                }
                                eta.p(vciVar2, f2, oq5Var2, z6);
                            } else {
                                str = "offline_switcher_secondary_button";
                                oq5Var2 = oq5Var5;
                                oq5Var2.Z(i12);
                                oq5Var2.p(false);
                            }
                            String M6 = rvf.M(z11 ? R.string.stub_button_disable_offline_mode : R.string.stub_button_refresh, oq5Var2);
                            boolean h6 = oq5Var2.h(mmjVar2) | oq5Var2.h(jmjVar2);
                            Object K6 = oq5Var2.K();
                            if (h6 || K6 == kjnVar3) {
                                final int i13 = 0;
                                K6 = new Function0() { // from class: gmj
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i13) {
                                            case 0:
                                                boolean z16 = mmjVar2.c;
                                                jmj jmjVar3 = jmjVar2;
                                                if (z16) {
                                                    jmjVar3.c();
                                                } else {
                                                    jmjVar3.e();
                                                }
                                                break;
                                            case 1:
                                                boolean z17 = mmjVar2.c;
                                                jmj jmjVar4 = jmjVar2;
                                                if (z17) {
                                                    jmjVar4.c();
                                                } else {
                                                    jmjVar4.e();
                                                }
                                                break;
                                            default:
                                                boolean z18 = mmjVar2.c;
                                                jmj jmjVar5 = jmjVar2;
                                                if (z18) {
                                                    jmjVar5.c();
                                                } else {
                                                    jmjVar5.e();
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var2.k0(K6);
                            }
                            hdg.t(M6, (Function0) K6, androidx.compose.ui.platform.a.a(d.t(vciVar2, mu0.j, 0.0f, 2), (z12 || z14) ? str : "offline_switcher_primary_button"), null, oq5Var2, 0, 8);
                            oq5Var2.p(false);
                        } else if (ordinal2 == 1) {
                            kjn kjnVar4 = kjnVar2;
                            oq5Var5.Z(-167969120);
                            if (z13) {
                                oq5Var5.Z(-167957588);
                                String M7 = rvf.M(R.string.stub_button_play_my_vibe, oq5Var5);
                                boolean h7 = oq5Var5.h(jmjVar2);
                                Object K7 = oq5Var5.K();
                                if (h7 || K7 == kjnVar4) {
                                    z10 = z11;
                                    z9 = z14;
                                    str2 = M7;
                                    mmjVar = mmjVar2;
                                    i8 = 2;
                                    f = f2;
                                    vciVar = vciVar2;
                                    oq5Var3 = oq5Var5;
                                    m9j m9jVar5 = new m9j(0, jmjVar, jmj.class, "onPlayMyVibe", "onPlayMyVibe()V", 0, 25);
                                    jmjVar2 = jmjVar;
                                    oq5Var3.k0(m9jVar5);
                                    K7 = m9jVar5;
                                } else {
                                    z9 = z14;
                                    z10 = z11;
                                    oq5Var3 = oq5Var5;
                                    vciVar = vciVar2;
                                    f = f2;
                                    str2 = M7;
                                    i8 = 2;
                                    mmjVar = mmjVar2;
                                }
                                hdg.o(str2, (Function0) ((h9f) K7), androidx.compose.ui.platform.a.a(d.t(vciVar, mu0.j, 0.0f, i8), "offline_switcher_primary_button"), 0.0f, oq5Var3, 384, 8);
                                eta.p(vciVar, f, oq5Var3, false);
                                i7 = -176218034;
                            } else {
                                z9 = z14;
                                z10 = z11;
                                oq5Var3 = oq5Var5;
                                mmjVar = mmjVar2;
                                f = f2;
                                i7 = -176218034;
                                i8 = 2;
                                vciVar = vciVar2;
                                oq5Var3.Z(-176218034);
                                oq5Var3.p(false);
                            }
                            if (z9) {
                                oq5Var3.Z(-167433378);
                                String M8 = rvf.M(R.string.stub_button_open_auto_cache, oq5Var3);
                                boolean h8 = oq5Var3.h(jmjVar2);
                                Object K8 = oq5Var3.K();
                                if (h8 || K8 == kjnVar4) {
                                    m9j m9jVar6 = new m9j(0, jmjVar, jmj.class, "onOpenAutoCacheSettings", "onOpenAutoCacheSettings()V", 0, 26);
                                    jmjVar2 = jmjVar;
                                    oq5Var3.k0(m9jVar6);
                                    K8 = m9jVar6;
                                }
                                oq5Var2 = oq5Var3;
                                hdg.o(M8, (Function0) ((h9f) K8), androidx.compose.ui.platform.a.a(d.t(vciVar, mu0.j, 0.0f, i8), "offline_switcher_primary_button"), 0.0f, oq5Var2, 384, 8);
                                eta.p(vciVar, f, oq5Var2, false);
                            } else {
                                oq5Var2 = oq5Var3;
                                oq5Var2.Z(i7);
                                oq5Var2.p(false);
                            }
                            String M9 = rvf.M(z10 ? R.string.stub_button_disable_offline_mode : R.string.stub_button_refresh, oq5Var2);
                            boolean h9 = oq5Var2.h(mmjVar) | oq5Var2.h(jmjVar2);
                            Object K9 = oq5Var2.K();
                            if (h9 || K9 == kjnVar4) {
                                final int i14 = 1;
                                K9 = new Function0() { // from class: gmj
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i14) {
                                            case 0:
                                                boolean z16 = mmjVar.c;
                                                jmj jmjVar3 = jmjVar2;
                                                if (z16) {
                                                    jmjVar3.c();
                                                } else {
                                                    jmjVar3.e();
                                                }
                                                break;
                                            case 1:
                                                boolean z17 = mmjVar.c;
                                                jmj jmjVar4 = jmjVar2;
                                                if (z17) {
                                                    jmjVar4.c();
                                                } else {
                                                    jmjVar4.e();
                                                }
                                                break;
                                            default:
                                                boolean z18 = mmjVar.c;
                                                jmj jmjVar5 = jmjVar2;
                                                if (z18) {
                                                    jmjVar5.c();
                                                } else {
                                                    jmjVar5.e();
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var2.k0(K9);
                            }
                            hdg.t(M9, (Function0) K9, androidx.compose.ui.platform.a.a(d.t(vciVar, mu0.j, 0.0f, i8), "offline_switcher_primary_button"), null, oq5Var2, 384, 8);
                            oq5Var2.p(false);
                        } else {
                            if (ordinal2 != 2 && ordinal2 != 3) {
                                throw vz1.i(oq5Var5, 825781333, false);
                            }
                            oq5Var5.Z(-166475447);
                            String M10 = rvf.M(z11 ? R.string.stub_button_disable_offline_mode : R.string.stub_button_refresh, oq5Var5);
                            boolean h10 = oq5Var5.h(mmjVar2) | oq5Var5.h(jmjVar2);
                            Object K10 = oq5Var5.K();
                            if (h10 || K10 == kjnVar2) {
                                K10 = new Function0() { // from class: gmj
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i10) {
                                            case 0:
                                                boolean z16 = mmjVar2.c;
                                                jmj jmjVar3 = jmjVar2;
                                                if (z16) {
                                                    jmjVar3.c();
                                                } else {
                                                    jmjVar3.e();
                                                }
                                                break;
                                            case 1:
                                                boolean z17 = mmjVar2.c;
                                                jmj jmjVar4 = jmjVar2;
                                                if (z17) {
                                                    jmjVar4.c();
                                                } else {
                                                    jmjVar4.e();
                                                }
                                                break;
                                            default:
                                                boolean z18 = mmjVar2.c;
                                                jmj jmjVar5 = jmjVar2;
                                                if (z18) {
                                                    jmjVar5.c();
                                                } else {
                                                    jmjVar5.e();
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var5.k0(K10);
                            }
                            oq5Var2 = oq5Var5;
                            z7 = true;
                            hdg.t(M10, (Function0) K10, androidx.compose.ui.platform.a.a(d.t(vciVar2, mu0.j, 0.0f, 2), "offline_switcher_primary_button"), null, oq5Var2, 384, 8);
                            oq5Var2.p(false);
                            oq5Var2.p(z7);
                            oq5Var4 = oq5Var2;
                            z8 = z3;
                            hmjVar2 = hmjVar3;
                            yciVar3 = yciVar5;
                        }
                        z7 = true;
                        oq5Var2.p(z7);
                        oq5Var4 = oq5Var2;
                        z8 = z3;
                        hmjVar2 = hmjVar3;
                        yciVar3 = yciVar5;
                    } else {
                        if (!z14) {
                            if (!z13) {
                                if (!z11) {
                                }
                                i11 = R.string.stub_subtitle_offline_mode;
                                xcs.b(rvf.M(i11, oq5Var5), androidx.compose.ui.platform.a.a(vciVar2, "offline_switcher_message"), ((dq0) oq5Var5.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var5, 48, 0, 65016);
                                u1g.l(oq5Var5, d.e(vciVar2, !irv.g(oq5Var5) ? f2 : 24));
                                ordinal2 = hmjVar3.ordinal();
                                if (ordinal2 != 0) {
                                }
                                z7 = true;
                                oq5Var2.p(z7);
                                oq5Var4 = oq5Var2;
                                z8 = z3;
                                hmjVar2 = hmjVar3;
                                yciVar3 = yciVar5;
                            }
                            i11 = R.string.stub_subtitle_no_connection_with_wave_and_downloads;
                            xcs.b(rvf.M(i11, oq5Var5), androidx.compose.ui.platform.a.a(vciVar2, "offline_switcher_message"), ((dq0) oq5Var5.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var5, 48, 0, 65016);
                            u1g.l(oq5Var5, d.e(vciVar2, !irv.g(oq5Var5) ? f2 : 24));
                            ordinal2 = hmjVar3.ordinal();
                            if (ordinal2 != 0) {
                            }
                            z7 = true;
                            oq5Var2.p(z7);
                            oq5Var4 = oq5Var2;
                            z8 = z3;
                            hmjVar2 = hmjVar3;
                            yciVar3 = yciVar5;
                        }
                        i11 = R.string.stub_subtitle_no_connection_no_auto_cache;
                        xcs.b(rvf.M(i11, oq5Var5), androidx.compose.ui.platform.a.a(vciVar2, "offline_switcher_message"), ((dq0) oq5Var5.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var5, 48, 0, 65016);
                        u1g.l(oq5Var5, d.e(vciVar2, !irv.g(oq5Var5) ? f2 : 24));
                        ordinal2 = hmjVar3.ordinal();
                        if (ordinal2 != 0) {
                        }
                        z7 = true;
                        oq5Var2.p(z7);
                        oq5Var4 = oq5Var2;
                        z8 = z3;
                        hmjVar2 = hmjVar3;
                        yciVar3 = yciVar5;
                    }
                } else {
                    oq5Var4.S();
                    yciVar3 = yciVar2;
                    z8 = z2;
                    hmjVar2 = hmjVar;
                }
                r = oq5Var4.r();
                if (r != null) {
                    r.d = new tu0(jmjVar, yciVar3, z8, hmjVar2, i, i2, 5);
                    return;
                }
                return;
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            vci vciVar22 = vci.a;
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            final mmj mmjVar22 = (mmj) gld.O(jmjVar.getState(), oq5Var4).getValue();
            gz2 gz2Var2 = b2c.o;
            yci m2 = androidx.compose.foundation.layout.a.m(yciVar4, irv.g(oq5Var4) ? 8 : 16);
            h = oq5Var4.h(jmjVar);
            K = oq5Var4.K();
            kjnVar = gq5.a;
            if (h) {
            }
            kjnVar2 = kjnVar;
            w4i w4iVar2 = new w4i(2, jmjVar, jmj.class, "onVisibilityChanged", "onVisibilityChanged(ZLjava/lang/String;)V", 0, 7);
            oq5Var4.k0(w4iVar2);
            K = w4iVar2;
            yci a3 = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(m2, null, 0L, 0.0f, null, (Function2) ((h9f) K), 15), "offline_switcher");
            ta5 a22 = sa5.a(qx0.c, gz2Var2, oq5Var4, 48);
            i6 = oq5Var4.P;
            androidx.compose.runtime.internal.a l2 = oq5Var4.l();
            yci H2 = vnj.H(oq5Var4, a3);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var4.d0();
            if (oq5Var4.O) {
            }
            g0g.U(oq5Var4, a22, wp5.f);
            g0g.U(oq5Var4, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var4.O) {
            }
            ouj.x(i6, oq5Var4, i6, kb5Var2);
            g0g.U(oq5Var4, H2, wp5.d);
            if (z3) {
            }
            if (z4) {
            }
            boolean z112 = mmjVar22.c;
            boolean z122 = mmjVar22.b;
            boolean z132 = mmjVar22.a;
            boolean z142 = mmjVar22.d;
            String M11 = rvf.M(z112 ? R.string.stub_title_offline_mode : R.string.stub_title_no_connection, oq5Var);
            h6g h6gVar3 = nu0.a;
            h6g h6gVar22 = h6g.c;
            ges c2 = nu0.c();
            agr agrVar2 = eq0.a;
            oq5 oq5Var52 = oq5Var;
            yci yciVar52 = yciVar4;
            final int i102 = 2;
            final jmj jmjVar22 = jmjVar;
            xcs.b(M11, androidx.compose.ui.platform.a.a(vciVar22, "offline_switcher_title"), ((dq0) oq5Var.j(agrVar2)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c2, oq5Var52, 48, 0, 65016);
            float f22 = 12;
            u1g.l(oq5Var52, d.e(vciVar22, f22));
            ordinal = hmjVar3.ordinal();
            int i112 = R.string.stub_subtitle_no_connection_no_downloads;
            if (ordinal != 0) {
            }
            r = oq5Var4.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        vci vciVar222 = vci.a;
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        final mmj mmjVar222 = (mmj) gld.O(jmjVar.getState(), oq5Var4).getValue();
        gz2 gz2Var22 = b2c.o;
        yci m22 = androidx.compose.foundation.layout.a.m(yciVar4, irv.g(oq5Var4) ? 8 : 16);
        h = oq5Var4.h(jmjVar);
        K = oq5Var4.K();
        kjnVar = gq5.a;
        if (h) {
        }
        kjnVar2 = kjnVar;
        w4i w4iVar22 = new w4i(2, jmjVar, jmj.class, "onVisibilityChanged", "onVisibilityChanged(ZLjava/lang/String;)V", 0, 7);
        oq5Var4.k0(w4iVar22);
        K = w4iVar22;
        yci a32 = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(m22, null, 0L, 0.0f, null, (Function2) ((h9f) K), 15), "offline_switcher");
        ta5 a222 = sa5.a(qx0.c, gz2Var22, oq5Var4, 48);
        i6 = oq5Var4.P;
        androidx.compose.runtime.internal.a l22 = oq5Var4.l();
        yci H22 = vnj.H(oq5Var4, a32);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var4.d0();
        if (oq5Var4.O) {
        }
        g0g.U(oq5Var4, a222, wp5.f);
        g0g.U(oq5Var4, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var4.O) {
        }
        ouj.x(i6, oq5Var4, i6, kb5Var22);
        g0g.U(oq5Var4, H22, wp5.d);
        if (z3) {
        }
        if (z4) {
        }
        boolean z1122 = mmjVar222.c;
        boolean z1222 = mmjVar222.b;
        boolean z1322 = mmjVar222.a;
        boolean z1422 = mmjVar222.d;
        String M112 = rvf.M(z1122 ? R.string.stub_title_offline_mode : R.string.stub_title_no_connection, oq5Var);
        h6g h6gVar32 = nu0.a;
        h6g h6gVar222 = h6g.c;
        ges c22 = nu0.c();
        agr agrVar22 = eq0.a;
        oq5 oq5Var522 = oq5Var;
        yci yciVar522 = yciVar4;
        final int i1022 = 2;
        final jmj jmjVar222 = jmjVar;
        xcs.b(M112, androidx.compose.ui.platform.a.a(vciVar222, "offline_switcher_title"), ((dq0) oq5Var.j(agrVar22)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c22, oq5Var522, 48, 0, 65016);
        float f222 = 12;
        u1g.l(oq5Var522, d.e(vciVar222, f222));
        ordinal = hmjVar3.ordinal();
        int i1122 = R.string.stub_subtitle_no_connection_no_downloads;
        if (ordinal != 0) {
        }
        r = oq5Var4.r();
        if (r != null) {
        }
    }

    public static final void h(nmj nmjVar, tmb tmbVar, yci yciVar, boolean z, Activity activity, dmj dmjVar, hmj hmjVar, hq5 hq5Var, int i) {
        int i2;
        Activity R;
        int i3;
        Activity activity2;
        oq5 oq5Var;
        tmbVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-982070311);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(nmjVar) : oq5Var2.h(nmjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(tmbVar) : oq5Var2.h(tmbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.d(1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.h(dmjVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.d(hmjVar == null ? -1 : hmjVar.ordinal()) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var2.z()) {
            oq5Var2.S();
            activity2 = activity;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                R = vq2.R((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b));
                i3 = i2 & (-458753);
            } else {
                oq5Var2.S();
                i3 = i2 & (-458753);
                R = activity;
            }
            int i4 = i3;
            oq5Var2.q();
            if (R != null) {
                oq5Var2.Z(461024654);
                int i5 = i4 << 3;
                Activity activity3 = R;
                jmj b = nmjVar.b(dmjVar, activity3, tmbVar, 1, oq5Var2, ((i4 >> 18) & 14) | RemoteCameraConfig.Mic.BUFFER_SIZE | (i5 & 896) | (i5 & 7168) | SQLiteDatabase.OPEN_NOMUTEX | (57344 & (i4 << 12)));
                activity2 = activity3;
                g(b, yciVar, z, hmjVar, oq5Var2, ((i4 >> 6) & 1008) | ((i4 >> 12) & 7168), 0);
                oq5Var = oq5Var2;
            } else {
                activity2 = R;
                oq5Var = oq5Var2;
                oq5Var.Z(458500169);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ql0(nmjVar, tmbVar, yciVar, z, activity2, dmjVar, hmjVar, i);
        }
    }

    public static final void i(nmj nmjVar, boolean z, Activity activity, dmj dmjVar, hmj hmjVar, hq5 hq5Var, int i) {
        int i2;
        Activity R;
        int i3;
        Activity activity2;
        oq5 oq5Var;
        Activity activity3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(651890883);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(nmjVar) : oq5Var2.h(nmjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.d(1) ? 32 : 16;
        }
        int i4 = i & 384;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i2 |= oq5Var2.f(vciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.h(dmjVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.d(hmjVar.ordinal()) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            activity3 = activity;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                R = vq2.R((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b));
                i3 = i2 & (-57345);
            } else {
                oq5Var2.S();
                i3 = i2 & (-57345);
                R = activity;
            }
            int i5 = i3;
            oq5Var2.q();
            if (R != null) {
                oq5Var2.Z(-1360407640);
                Activity activity4 = R;
                activity2 = activity4;
                g(nmjVar.b(dmjVar, activity4, null, 1, oq5Var2, ((i5 << 12) & 57344) | ((i5 >> 15) & 14) | 384 | ((i5 << 6) & 7168) | SQLiteDatabase.OPEN_NOMUTEX), vciVar, z, hmjVar, oq5Var2, ((i5 >> 3) & 1008) | ((i5 >> 9) & 7168), 0);
                oq5Var = oq5Var2;
            } else {
                activity2 = R;
                oq5Var = oq5Var2;
                oq5Var.Z(-1363756353);
            }
            oq5Var.p(false);
            activity3 = activity2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(nmjVar, z, activity3, dmjVar, hmjVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(int i, IntRange intRange, Function1 function1, int i2, m2k m2kVar, yci yciVar, hq5 hq5Var, int i3, int i4) {
        int i5;
        yci yciVar2;
        boolean z;
        Object K;
        kjn kjnVar;
        Object K2;
        boolean f;
        Object K3;
        int i6;
        int i7;
        IntRange intRange2;
        boolean f2;
        Object K4;
        boolean f3;
        Object K5;
        xmn r;
        int i8 = i;
        int i9 = i2;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1017505830);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var.d(i8) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var.h(intRange) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= oq5Var.d(i9) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= oq5Var.f(m2kVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i10 = i4 & 32;
        if (i10 != 0) {
            i5 |= 196608;
        } else if ((196608 & i3) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((74899 & i5) == 74898 || !oq5Var.z()) {
                if (i10 != 0) {
                    yciVar2 = vci.a;
                }
                if (i8 >= 0 || i8 >= i9) {
                    su4.s(2, null, k5r.i(i9, "Current page is out of range 0 until "), null);
                }
                jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                int i11 = i5 & 7168;
                z = ((57344 & i5) != 16384) | (i11 != 2048);
                K = oq5Var.K();
                kjnVar = gq5.a;
                if (!z || K == kjnVar) {
                    K = new nmq(a4g.i(((r12 - 1) * m2kVar.d) + (m2kVar.h * Math.min(m2kVar.g, i9)), m2kVar.a * 2));
                    oq5Var.k0(K);
                }
                long m = jx7Var.m(((nmq) K).a);
                int i12 = i5 & 14;
                K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                }
                mm6 mm6Var = ((fs5) K2).a;
                f = oq5Var.f(mm6Var) | (((i11 ^ 3072) <= 2048 && oq5Var.d(i9)) || (i5 & 3072) == 2048);
                K3 = oq5Var.K();
                if (!f || K3 == kjnVar) {
                    if (intRange != null) {
                        IntRange A = etn.A(i8, i9, m2kVar);
                        i6 = i8;
                        i7 = i9;
                        intRange2 = A;
                    } else {
                        i6 = i8;
                        i7 = i9;
                        intRange2 = intRange;
                    }
                    hje hjeVar = new hje(i7, m2kVar, mm6Var, i6, intRange2, function1);
                    int i13 = i6;
                    i9 = i7;
                    i8 = i13;
                    oq5Var.k0(hjeVar);
                    K3 = hjeVar;
                }
                hje hjeVar2 = (hje) K3;
                Integer valueOf = Integer.valueOf(i8);
                f2 = oq5Var.f(hjeVar2) | (i12 != 4);
                K4 = oq5Var.K();
                if (!f2 || K4 == kjnVar) {
                    K4 = new fje(hjeVar2, i8, (Continuation) null);
                    oq5Var.k0(K4);
                }
                gld.w(oq5Var, valueOf, (Function2) K4);
                yci c = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(d.n(m, yciVar2), "pager_indicator"), "current_page", Integer.valueOf(i8));
                f3 = (i11 == 2048) | oq5Var.f(hjeVar2);
                K5 = oq5Var.K();
                if (!f3 || K5 == kjnVar) {
                    K5 = new qo1(i9, hjeVar2, 3);
                    oq5Var.k0(K5);
                }
                ksw.j(0, oq5Var, c, (Function1) K5);
            } else {
                oq5Var.S();
            }
            yci yciVar3 = yciVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new i92(i8, intRange, function1, i9, m2kVar, yciVar3, i3, i4);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((74899 & i5) == 74898) {
        }
        if (i10 != 0) {
        }
        if (i8 >= 0) {
        }
        su4.s(2, null, k5r.i(i9, "Current page is out of range 0 until "), null);
        jx7 jx7Var2 = (jx7) oq5Var.j(es5.h);
        int i112 = i5 & 7168;
        z = ((57344 & i5) != 16384) | (i112 != 2048);
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (!z) {
        }
        K = new nmq(a4g.i(((r12 - 1) * m2kVar.d) + (m2kVar.h * Math.min(m2kVar.g, i9)), m2kVar.a * 2));
        oq5Var.k0(K);
        long m2 = jx7Var2.m(((nmq) K).a);
        int i122 = i5 & 14;
        K2 = oq5Var.K();
        if (K2 == kjnVar) {
        }
        mm6 mm6Var2 = ((fs5) K2).a;
        f = oq5Var.f(mm6Var2) | (((i112 ^ 3072) <= 2048 && oq5Var.d(i9)) || (i5 & 3072) == 2048);
        K3 = oq5Var.K();
        if (!f) {
        }
        if (intRange != null) {
        }
        hje hjeVar3 = new hje(i7, m2kVar, mm6Var2, i6, intRange2, function1);
        int i132 = i6;
        i9 = i7;
        i8 = i132;
        oq5Var.k0(hjeVar3);
        K3 = hjeVar3;
        hje hjeVar22 = (hje) K3;
        Integer valueOf2 = Integer.valueOf(i8);
        f2 = oq5Var.f(hjeVar22) | (i122 != 4);
        K4 = oq5Var.K();
        if (!f2) {
        }
        K4 = new fje(hjeVar22, i8, (Continuation) null);
        oq5Var.k0(K4);
        gld.w(oq5Var, valueOf2, (Function2) K4);
        yci c2 = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(d.n(m2, yciVar2), "pager_indicator"), "current_page", Integer.valueOf(i8));
        f3 = (i112 == 2048) | oq5Var.f(hjeVar22);
        K5 = oq5Var.K();
        if (!f3) {
        }
        K5 = new qo1(i9, hjeVar22, 3);
        oq5Var.k0(K5);
        ksw.j(0, oq5Var, c2, (Function1) K5);
        yci yciVar32 = yciVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void k(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1235207573);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            if (z) {
                oq5Var.Z(-1210882583);
                pm0.c(yciVar, oq5Var, (i3 >> 3) & 14);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1210839834);
                ug3.a(a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i), oq5Var, 0);
                oq5Var.p(false);
            }
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n10(z, yciVar2, i, i2, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if ((r14 & 4) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(boolean z, yci yciVar, ges gesVar, hq5 hq5Var, int i, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1030296678);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && oq5Var.f(gesVar)) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            int i5 = i & 1;
            vci vciVar = vci.a;
            if (i5 == 0 || oq5Var.y()) {
                if (i4 != 0) {
                    yciVar = vciVar;
                }
                if ((i2 & 4) != 0) {
                    gesVar = (ges) oq5Var.j(xcs.a);
                    i3 &= -897;
                }
                oq5Var.q();
                yci e = d.e(yciVar, w1g.p(gesVar, 0, oq5Var, (i3 >> 6) & 14, 2));
                kfh d = ug3.d(b2c.e, false);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, e);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                k(i3 & 14, 0, oq5Var, d.d(d.e(xp3.u(vciVar, ugo.a), ff7.P(gesVar.a.b, oq5Var)), 1.0f), z);
                oq5Var.p(true);
            } else {
                oq5Var.S();
            }
        }
        yci yciVar2 = yciVar;
        ges gesVar2 = gesVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qu(z, yciVar2, gesVar2, i, i2, 6);
        }
    }

    public static final void m(sem semVar, hq5 hq5Var, int i) {
        int i2;
        semVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1438460089);
        int i3 = (oq5Var.h(semVar) ? 4 : 2) | i;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            yem yemVar = (yem) szf.Q(semVar.e, oq5Var).getValue();
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h = oq5Var.h(semVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                ebm ebmVar = new ebm(0, semVar, sem.class, "onBackClicked", "onBackClicked()V", 0, 9);
                oq5Var.k0(ebmVar);
                K = ebmVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h2 = oq5Var.h(semVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                ebm ebmVar2 = new ebm(0, semVar, sem.class, "onSearchClicked", "onSearchClicked()V", 0, 10);
                oq5Var.k0(ebmVar2);
                K2 = ebmVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h3 = oq5Var.h(semVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                ebm ebmVar3 = new ebm(0, semVar, sem.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 11);
                oq5Var.k0(ebmVar3);
                K3 = ebmVar3;
            }
            i2 = 4;
            kg5.g(R.string.your_subscriptions_screen_title, a, function0, function02, (Function0) ((h9f) K3), ild.C(-182194778, new vtb(18, yemVar, semVar, a), oq5Var), oq5Var, 196608, 0);
        } else {
            i2 = 4;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ucm(semVar, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, wn5] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, pyc] */
    /* JADX WARN: Type inference failed for: r4v3, types: [wn5] */
    /* JADX WARN: Type inference failed for: r8v30, types: [wn5] */
    public static final void n(wn5 wn5Var, pyc pycVar, wn5 wn5Var2, wn5 wn5Var3, boolean z, onu onuVar, gtu gtuVar, ya0 ya0Var, hq5 hq5Var, int i) {
        yci c;
        boolean z2;
        wn5 wn5Var4;
        boolean z3;
        boolean z4;
        wn5 wn5Var5;
        wn5 wn5Var6;
        wn5 wn5Var7 = wn5Var3;
        iz2 iz2Var = b2c.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-784685673);
        int i2 = i | (oq5Var.h(wn5Var) ? 4 : 2) | (oq5Var.h(pycVar) ? 32 : 16) | (oq5Var.h(wn5Var2) ? 256 : 128) | (oq5Var.h(wn5Var7) ? 2048 : 1024) | (oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.d(onuVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(gtuVar) ? 1048576 : 524288) | (oq5Var.h(ya0Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
        if ((4793491 & i2) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            wn5Var5 = wn5Var2;
            wn5Var6 = wn5Var7;
        } else {
            vci vciVar = vci.a;
            if (ya0Var == null) {
                c = vciVar;
            } else {
                bxj bxjVar = bxj.a;
                c = ya0Var.c(true);
            }
            float d = irv.d(oq5Var);
            gtuVar.getClass();
            float max = Math.max(d * 0.31f, 240);
            kx0 kx0Var = qx0.d;
            gz2 gz2Var = b2c.n;
            ta5 a = sa5.a(kx0Var, gz2Var, oq5Var, 6);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci yciVar = c;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f);
            ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f);
            kfh d2 = ug3.d(b2c.f, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, layoutWeightElement2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            Integer valueOf = Integer.valueOf(6 | ((i2 >> 12) & 112) | ((i2 << 6) & 896));
            b bVar = b.a;
            wn5Var.invoke(bVar, onuVar, oq5Var, valueOf);
            oq5Var.p(true);
            if (((Boolean) oq5Var.j(upg.a)).booleanValue()) {
                z2 = false;
                oq5Var.Z(1303912671);
            } else {
                oq5Var.Z(1310061397);
                u1g.l(oq5Var, d.e(vciVar, gtuVar.e));
                yci d3 = d.d(androidx.compose.foundation.layout.a.o(yciVar, 16, 0.0f, 2), 1.0f);
                kfh d4 = ug3.d(iz2Var, false);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l4 = oq5Var.l();
                yci H4 = vnj.H(oq5Var, d3);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d4, kb5Var);
                g0g.U(oq5Var, l4, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H4, kb5Var4);
                pycVar.invoke(bVar, oq5Var, Integer.valueOf(6 | (i2 & 112)));
                oq5Var.p(true);
                z2 = false;
            }
            oq5Var.p(z2);
            u1g.l(oq5Var, d.e(vciVar, gtuVar.f));
            if (z) {
                oq5Var.Z(1310499241);
                yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 24, 0.0f, 2);
                kfh d5 = ug3.d(iz2Var, false);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l5 = oq5Var.l();
                yci H5 = vnj.H(oq5Var, o);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d5, kb5Var);
                g0g.U(oq5Var, l5, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H5, kb5Var4);
                ?? r8 = wn5Var2;
                r8.invoke(bVar, oq5Var, Integer.valueOf(6 | ((i2 >> 3) & 112)));
                z4 = true;
                oq5Var.p(true);
                z3 = false;
                wn5Var4 = r8;
            } else {
                wn5Var4 = wn5Var2;
                z3 = false;
                z4 = true;
                oq5Var.Z(1303912671);
            }
            oq5Var.p(z3);
            eta.p(vciVar, gtuVar.g, oq5Var, z4);
            yci e = d.e(d.d(vciVar, 1.0f), max);
            kfh d6 = ug3.d(iz2Var, z3);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l6 = oq5Var.l();
            yci H6 = vnj.H(oq5Var, e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d6, kb5Var);
            g0g.U(oq5Var, l6, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var3);
            }
            g0g.U(oq5Var, H6, kb5Var4);
            ?? r4 = wn5Var3;
            r4.invoke(bVar, ihv.a, oq5Var, Integer.valueOf(((i2 >> 3) & 896) | 54));
            oq5Var.p(true);
            oq5Var.p(true);
            wn5Var6 = r4;
            wn5Var5 = wn5Var4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new atu(wn5Var, pycVar, wn5Var5, wn5Var6, z, onuVar, gtuVar, ya0Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(cf5 cf5Var, Function0 function0, yci yciVar, String str, String str2, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        String str3;
        int i4;
        String M;
        int i5;
        yci yciVar3;
        String str4;
        boolean z;
        Object K;
        kjn kjnVar;
        boolean f;
        Object K2;
        int i6;
        long j;
        Object K3;
        String str5;
        yci yciVar4;
        xmn r;
        int i7;
        cf5Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(737459278);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(cf5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    str3 = str2;
                    if (oq5Var.f(str3)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    str3 = str2;
                }
                i7 = RemoteCameraConfig.Notification.ID;
                i3 |= i7;
            } else {
                str3 = str2;
            }
            if ((i3 & 9363) == 9362 || !oq5Var.z()) {
                oq5Var.U();
                i4 = i & 1;
                vci vciVar = vci.a;
                if (i4 != 0 || oq5Var.y()) {
                    if (i8 != 0) {
                        yciVar2 = vciVar;
                    }
                    M = rvf.M(cf5Var.getText(), oq5Var);
                    i5 = i3 & (-7169);
                    if ((i2 & 16) != 0) {
                        Integer d = cf5Var.d();
                        if (d == null) {
                            oq5Var.Z(891899668);
                            oq5Var.p(false);
                            str3 = null;
                        } else {
                            oq5Var.Z(891899669);
                            str3 = rvf.M(d.intValue(), oq5Var);
                            oq5Var.p(false);
                        }
                        i5 = i3 & (-64513);
                    }
                    yciVar3 = yciVar2;
                    str4 = str3;
                } else {
                    oq5Var.S();
                    int i9 = i3 & (-7169);
                    if ((i2 & 16) != 0) {
                        i9 = i3 & (-64513);
                    }
                    i5 = i9;
                    yciVar3 = yciVar2;
                    str4 = str3;
                    M = str;
                }
                oq5Var.q();
                yci d2 = d.d(d.g(yciVar3, 48, 0.0f, 2), 1.0f);
                z = (i5 & 112) != 32;
                K = oq5Var.K();
                kjnVar = gq5.a;
                if (!z || K == kjnVar) {
                    K = new g1j(21, function0);
                    oq5Var.k0(K);
                }
                yci o = androidx.compose.foundation.layout.a.o(a.e(d2, false, null, null, (Function0) K, 7), 16, 0.0f, 2);
                f = ((((57344 & i5) ^ 24576) <= 16384 && oq5Var.f(str4)) || (i5 & 24576) == 16384) | oq5Var.f(M);
                K2 = oq5Var.K();
                if (!f || K2 == kjnVar) {
                    K2 = new cb(str4, M, 10);
                    oq5Var.k0(K2);
                }
                yci a = androidx.compose.ui.platform.a.a(nfp.b(o, true, (Function1) K2), cf5Var.e());
                nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                String str6 = str4;
                gae.b(a0g.E(cf5Var.c(), 0, oq5Var), null, d.m(androidx.compose.foundation.layout.a.q(vciVar, 8, 0.0f, 0.0f, 0.0f, 14), 24), cf5Var.b(oq5Var), oq5Var, 432, 0);
                String M2 = rvf.M(cf5Var.getText(), oq5Var);
                ges j2 = nu0.j();
                if (cf5Var.a()) {
                    oq5Var.Z(641825403);
                    j = ((dq0) oq5Var.j(eq0.a)).b.b;
                } else {
                    oq5Var.Z(641824345);
                    j = ((dq0) oq5Var.j(eq0.a)).b.a;
                }
                oq5Var.p(false);
                long j3 = j;
                yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 12, 0.0f, 0.0f, 0.0f, 14);
                K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    K3 = new haq(2);
                    oq5Var.k0(K3);
                }
                xv7.j(M2, nfp.a(q, (Function1) K3), j3, 0L, 0L, 0, 0L, 2, false, 1, 0, null, j2, oq5Var, 0, 3120, 55288);
                oq5Var = oq5Var;
                oq5Var.p(true);
                str5 = str6;
                yciVar4 = yciVar3;
            } else {
                oq5Var.S();
                M = str;
                yciVar4 = yciVar2;
                str5 = str3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new cj((Object) cf5Var, function0, yciVar4, (Object) M, (Object) str5, i, i2, 16);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        oq5Var.U();
        i4 = i & 1;
        vci vciVar2 = vci.a;
        if (i4 != 0) {
        }
        if (i8 != 0) {
        }
        M = rvf.M(cf5Var.getText(), oq5Var);
        i5 = i3 & (-7169);
        if ((i2 & 16) != 0) {
        }
        yciVar3 = yciVar2;
        str4 = str3;
        oq5Var.q();
        yci d22 = d.d(d.g(yciVar3, 48, 0.0f, 2), 1.0f);
        if ((i5 & 112) != 32) {
        }
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (!z) {
        }
        K = new g1j(21, function0);
        oq5Var.k0(K);
        yci o2 = androidx.compose.foundation.layout.a.o(a.e(d22, false, null, null, (Function0) K, 7), 16, 0.0f, 2);
        f = ((((57344 & i5) ^ 24576) <= 16384 && oq5Var.f(str4)) || (i5 & 24576) == 16384) | oq5Var.f(M);
        K2 = oq5Var.K();
        if (!f) {
        }
        K2 = new cb(str4, M, 10);
        oq5Var.k0(K2);
        yci a3 = androidx.compose.ui.platform.a.a(nfp.b(o2, true, (Function1) K2), cf5Var.e());
        nho a22 = lho.a(qx0.a, b2c.l, oq5Var, 48);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, a3);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a22, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        String str62 = str4;
        gae.b(a0g.E(cf5Var.c(), 0, oq5Var), null, d.m(androidx.compose.foundation.layout.a.q(vciVar2, 8, 0.0f, 0.0f, 0.0f, 14), 24), cf5Var.b(oq5Var), oq5Var, 432, 0);
        String M22 = rvf.M(cf5Var.getText(), oq5Var);
        ges j22 = nu0.j();
        if (cf5Var.a()) {
        }
        oq5Var.p(false);
        long j32 = j;
        yci q2 = androidx.compose.foundation.layout.a.q(d.d(vciVar2, 1.0f), 12, 0.0f, 0.0f, 0.0f, 14);
        K3 = oq5Var.K();
        if (K3 == kjnVar) {
        }
        xv7.j(M22, nfp.a(q2, (Function1) K3), j32, 0L, 0L, 0, 0L, 2, false, 1, 0, null, j22, oq5Var, 0, 3120, 55288);
        oq5Var = oq5Var;
        oq5Var.p(true);
        str5 = str62;
        yciVar4 = yciVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void p(int i, hq5 hq5Var, yci yciVar, boolean z) {
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1040728056);
        if ((((oq5Var.g(z) ? 4 : 2) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            w4k E = a0g.E(z ? R.drawable.ic_small_like_active_16 : R.drawable.ic_small_like_unactive_16, 0, oq5Var);
            yci c = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar, "small_like_icon"), "isLiked", Boolean.valueOf(z));
            if (z) {
                oq5Var.Z(-1038921830);
                j = ((dq0) oq5Var.j(eq0.a)).a.g;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1038868107);
                j = ((dq0) oq5Var.j(eq0.a)).b.b;
                oq5Var.p(false);
            }
            gae.b(E, null, c, j, oq5Var, 48, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z, yciVar, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(String str, String str2, int i, yci yciVar, Function2 function2, hq5 hq5Var, int i2, int i3) {
        Function2 function22;
        int i4;
        int i5;
        Function2 function23;
        Function2 function24;
        boolean z;
        Function2 function25;
        xmn r;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-723193798);
        int i6 = (oq5Var.f(str) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i6 |= oq5Var.f(str2) ? 32 : 16;
        }
        int i7 = i6 | (oq5Var.d(i) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        int i8 = i3 & 16;
        if (i8 != 0) {
            i7 |= 24576;
        } else if ((i2 & 24576) == 0) {
            function22 = function2;
            i7 |= oq5Var.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i7;
            if ((i4 & 9363) == 9362 || !oq5Var.z()) {
                Function2 function26 = i8 == 0 ? null : function22;
                gz2 gz2Var = b2c.o;
                yci o = androidx.compose.foundation.layout.a.o(yciVar, 48, 0.0f, 2);
                ta5 a = sa5.a(qx0.c, gz2Var, oq5Var, 48);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, o);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                w4k E = a0g.E(i, (i4 >> 6) & 14, oq5Var);
                long j = ((dq0) oq5Var.j(eq0.a)).a.e;
                vci vciVar = vci.a;
                gae.b(E, null, d.m(vciVar, 124), j, oq5Var, 432, 0);
                float f = 24;
                u1g.l(oq5Var, d.e(vciVar, f));
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                function23 = function26;
                xcs.b(str, androidx.compose.ui.platform.a.a(vciVar, "title"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 2, 0, null, nu0.c(), oq5Var, (i4 & 14) | 48, 3120, 54780);
                oq5Var = oq5Var;
                if (function23 == null) {
                    oq5Var.Z(-866116409);
                    u1g.l(oq5Var, d.e(vciVar, 8));
                    function23.invoke(oq5Var, Integer.valueOf((i4 >> 12) & 14));
                } else {
                    oq5Var.Z(-867939054);
                }
                oq5Var.p(false);
                if (str2 == null) {
                    oq5Var.Z(-866000748);
                    u1g.l(oq5Var, d.e(vciVar, f));
                    function24 = function23;
                    xcs.b(str2, androidx.compose.ui.platform.a.a(vciVar, DeviceService.KEY_DESC), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, ((i4 >> 3) & 14) | 48, 0, 65020);
                    oq5Var = oq5Var;
                    z = false;
                } else {
                    function24 = function23;
                    z = false;
                    oq5Var.Z(-867939054);
                }
                oq5Var.p(z);
                oq5Var.p(true);
                function25 = function24;
            } else {
                oq5Var.S();
                function25 = function22;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new xj(str, str2, i, yciVar, function25, i2, i3);
                return;
            }
            return;
        }
        function22 = function2;
        i4 = i7;
        if ((i4 & 9363) == 9362) {
        }
        if (i8 == 0) {
        }
        gz2 gz2Var2 = b2c.o;
        yci o2 = androidx.compose.foundation.layout.a.o(yciVar, 48, 0.0f, 2);
        ta5 a2 = sa5.a(qx0.c, gz2Var2, oq5Var, 48);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, o2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a2, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        w4k E2 = a0g.E(i, (i4 >> 6) & 14, oq5Var);
        long j2 = ((dq0) oq5Var.j(eq0.a)).a.e;
        vci vciVar2 = vci.a;
        gae.b(E2, null, d.m(vciVar2, 124), j2, oq5Var, 432, 0);
        float f2 = 24;
        u1g.l(oq5Var, d.e(vciVar2, f2));
        h6g h6gVar3 = nu0.a;
        h6g h6gVar22 = h6g.c;
        function23 = function26;
        xcs.b(str, androidx.compose.ui.platform.a.a(vciVar2, "title"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 2, 0, null, nu0.c(), oq5Var, (i4 & 14) | 48, 3120, 54780);
        oq5Var = oq5Var;
        if (function23 == null) {
        }
        oq5Var.p(false);
        if (str2 == null) {
        }
        oq5Var.p(z);
        oq5Var.p(true);
        function25 = function24;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, boolean z, yci yciVar, pyc pycVar, ya0 ya0Var, hq5 hq5Var, int i, int i2) {
        int i3;
        pyc pycVar2;
        int i4;
        ya0 ya0Var2;
        yci yciVar2;
        pyc pycVar3;
        ya0 ya0Var3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1713048266);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(wn5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(wn5Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.g(z) ? 2048 : 1024;
        }
        int i5 = i3 | 24576;
        int i6 = i2 & 32;
        if (i6 != 0) {
            i5 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            pycVar2 = pycVar;
            i5 |= oq5Var.h(pycVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i4 = i2 & 64;
            if (i4 == 0) {
                i5 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i) == 0) {
                ya0Var2 = ya0Var;
                i5 |= oq5Var.h(ya0Var2) ? 1048576 : 524288;
                if ((i5 & 599187) == 599186 || !oq5Var.z()) {
                    if (i6 != 0) {
                        pycVar2 = lxe.d;
                    }
                    pyc pycVar4 = pycVar2;
                    ya0 ya0Var4 = i4 != 0 ? null : ya0Var2;
                    vci vciVar = vci.a;
                    bg3.a(d.c(vciVar, 1.0f), null, false, ild.C(-1952569460, new h54(z, wn5Var, pycVar4, wn5Var2, wn5Var3, ya0Var4, 5), oq5Var), oq5Var, 3072, 6);
                    yciVar2 = vciVar;
                    pycVar3 = pycVar4;
                    ya0Var3 = ya0Var4;
                } else {
                    oq5Var.S();
                    pycVar3 = pycVar2;
                    ya0Var3 = ya0Var2;
                    yciVar2 = yciVar;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new i93(wn5Var, wn5Var2, wn5Var3, z, yciVar2, pycVar3, ya0Var3, i, i2);
                    return;
                }
                return;
            }
            ya0Var2 = ya0Var;
            if ((i5 & 599187) == 599186) {
            }
            if (i6 != 0) {
            }
            pyc pycVar42 = pycVar2;
            if (i4 != 0) {
            }
            vci vciVar2 = vci.a;
            bg3.a(d.c(vciVar2, 1.0f), null, false, ild.C(-1952569460, new h54(z, wn5Var, pycVar42, wn5Var2, wn5Var3, ya0Var4, 5), oq5Var), oq5Var, 3072, 6);
            yciVar2 = vciVar2;
            pycVar3 = pycVar42;
            ya0Var3 = ya0Var4;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        pycVar2 = pycVar;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        ya0Var2 = ya0Var;
        if ((i5 & 599187) == 599186) {
        }
        if (i6 != 0) {
        }
        pyc pycVar422 = pycVar2;
        if (i4 != 0) {
        }
        vci vciVar22 = vci.a;
        bg3.a(d.c(vciVar22, 1.0f), null, false, ild.C(-1952569460, new h54(z, wn5Var, pycVar422, wn5Var2, wn5Var3, ya0Var4, 5), oq5Var), oq5Var, 3072, 6);
        yciVar2 = vciVar22;
        pycVar3 = pycVar422;
        ya0Var3 = ya0Var4;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public static final void s(final izv izvVar, hq5 hq5Var, final int i) {
        xmn r;
        Function2 function2;
        w4k E;
        String l;
        oq5 oq5Var;
        aqi B;
        int i2;
        boolean z;
        oq5 oq5Var2;
        ?? r10;
        oq5 oq5Var3;
        izvVar.getClass();
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(-1478197227);
        int i3 = (oq5Var4.f(izvVar) ? 4 : 2) | i;
        if ((i3 & 3) == 2 && oq5Var4.z()) {
            oq5Var4.S();
            oq5Var3 = oq5Var4;
        } else {
            agr agrVar = koe.a;
            if (((Boolean) oq5Var4.j(agrVar)).booleanValue()) {
                oq5Var4.Z(-673730656);
                oq5Var4.p(false);
                E = new w85(d85.d);
                l = "";
            } else {
                oq5Var4.Z(-673638028);
                Integer num = neg.o(oq5Var4).a;
                Integer num2 = ((d3w) oq5Var4.j(e3w.a)).e.a;
                if (num == null || num2 == null) {
                    ((j1w) izvVar.a.a).a.H();
                    oq5Var4.p(false);
                    r = oq5Var4.r();
                    if (r != null) {
                        final int i4 = 0;
                        function2 = new Function2(izvVar, i, i4) { // from class: gzv
                            public final /* synthetic */ int a;
                            public final /* synthetic */ izv b;

                            {
                                this.a = i4;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = this.a;
                                hq5 hq5Var2 = (hq5) obj;
                                ((Integer) obj2).getClass();
                                switch (i5) {
                                    case 0:
                                        ivf.s(this.b, hq5Var2, rvf.R(1));
                                        break;
                                    default:
                                        ivf.s(this.b, hq5Var2, rvf.R(1));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        r.d = function2;
                    }
                    return;
                }
                E = a0g.E(num.intValue(), 0, oq5Var4);
                Context context = (Context) oq5Var4.j(AndroidCompositionLocals_androidKt.b);
                int intValue = num2.intValue();
                context.getClass();
                l = k5r.l("android.resource://", intValue, context.getPackageName(), "/");
                oq5Var4.p(false);
            }
            boolean booleanValue = ((Boolean) oq5Var4.j(agrVar)).booleanValue();
            kjn kjnVar = gq5.a;
            if (booleanValue) {
                oq5Var4.Z(-673187350);
                Object K = oq5Var4.K();
                if (K == kjnVar) {
                    K = szf.g0(nbu.a);
                    oq5Var4.k0(K);
                }
                B = (aqi) K;
                oq5Var4.p(false);
                oq5Var = oq5Var4;
            } else {
                oq5Var4.Z(-673109571);
                oq5Var = oq5Var4;
                B = t7g.B(new jbu(l), true, ((d3w) oq5Var4.j(e3w.a)).l, null, dcu.All, oq5Var, 24624, 8);
                oq5Var.p(false);
            }
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            Unit unit = Unit.a;
            boolean f = oq5Var.f(B);
            Object K3 = oq5Var.K();
            if (f || K3 == kjnVar) {
                K3 = new ill(B, aqiVar, null, 1);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, unit, (Function2) K3);
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            kfh d = ug3.d(b2c.f, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5 oq5Var5 = oq5Var;
            irf.r(E, null, d.c(vciVar, 1.0f), b2c.c, hd6.a, 0.0f, null, oq5Var5, 28080, 96);
            oq5 oq5Var6 = oq5Var5;
            if (((pbu) B.getValue()) instanceof obu) {
                oq5Var6.Z(-2114660256);
                pbu pbuVar = (pbu) B.getValue();
                yci c2 = d.c(vciVar, 1.0f);
                Object K4 = oq5Var6.K();
                if (K4 == kjnVar) {
                    K4 = new jwv(8);
                    oq5Var6.k0(K4);
                }
                yci a = nfp.a(c2, (Function1) K4);
                i2 = -2118835181;
                t7g.j(pbuVar, a, null, null, oq5Var6, 0, 12);
                oq5Var2 = oq5Var6;
                z = false;
            } else {
                i2 = -2118835181;
                z = false;
                oq5Var6.Z(-2118835181);
                oq5Var2 = oq5Var6;
            }
            oq5Var2.p(z);
            if (!(((pbu) B.getValue()) instanceof nbu) || ((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var2.Z(-2114386123);
                boolean z2 = (i3 & 14) == 4;
                Object K5 = oq5Var2.K();
                if (z2 || K5 == kjnVar) {
                    r10 = 0;
                    vtu vtuVar = new vtu(0, izvVar, izv.class, "closeOnboardingScreen", "closeOnboardingScreen()V", 0, 21);
                    oq5Var2.k0(vtuVar);
                    K5 = vtuVar;
                } else {
                    r10 = 0;
                }
                t((Function0) ((h9f) K5), oq5Var2, r10);
                oq5Var2.p(r10);
            } else {
                oq5Var2.Z(i2);
                oq5Var2.p(false);
            }
            oq5Var2.p(true);
            oq5Var3 = oq5Var2;
        }
        r = oq5Var3.r();
        if (r != null) {
            final int i6 = 1;
            function2 = new Function2(izvVar, i, i6) { // from class: gzv
                public final /* synthetic */ int a;
                public final /* synthetic */ izv b;

                {
                    this.a = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            ivf.s(this.b, hq5Var2, rvf.R(1));
                            break;
                        default:
                            ivf.s(this.b, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [hq5, oq5] */
    /* JADX WARN: Type inference failed for: r6v2, types: [hq5, oq5] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static final void t(Function0 function0, hq5 hq5Var, int i) {
        List split$default;
        u6k u6kVar;
        int i2;
        oq5 oq5Var;
        ?? r6 = (oq5) hq5Var;
        r6.b0(1532564696);
        int i3 = (r6.h(function0) ? 4 : 2) | i;
        if ((i3 & 3) == 2 && r6.z()) {
            r6.S();
            oq5Var = r6;
        } else {
            neg.s(r6);
            String M = rvf.M(R.string.wizard_onboarding_text, r6);
            final int i4 = 0;
            split$default = StringsKt__StringsKt.split$default(M, new String[]{StringUtil.LF}, false, 0, 6, null);
            Object K = r6.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new ov6(0.4f, 1.11f, 0.88f, 1.0f);
                r6.k0(K);
            }
            final ov6 ov6Var = (ov6) K;
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            boolean f = r6.f(M);
            Object K2 = r6.K();
            if (f || K2 == obj) {
                K2 = new srp(M, 25);
                r6.k0(K2);
            }
            yci a = nfp.a(d, (Function1) K2);
            ta5 a2 = sa5.a(qx0.c, b2c.o, r6, 48);
            int i5 = r6.P;
            androidx.compose.runtime.internal.a l = r6.l();
            yci H = vnj.H(r6, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            r6.d0();
            if (r6.O) {
                r6.k(grbVar);
            } else {
                r6.n0();
            }
            g0g.U(r6, a2, wp5.f);
            g0g.U(r6, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (r6.O || !Intrinsics.d(r6.K(), Integer.valueOf(i5))) {
                ouj.x(i5, r6, i5, kb5Var);
            }
            g0g.U(r6, H, wp5.d);
            Unit unit = Unit.a;
            final int i6 = 1;
            boolean f2 = ((i3 & 14) == 4) | r6.f(split$default);
            Object K3 = r6.K();
            Continuation continuation = null;
            if (f2 || K3 == obj) {
                K3 = new y6v(split$default, function0, continuation, 12);
                r6.k0(K3);
            }
            gld.w(r6, unit, (Function2) K3);
            r6.Z(548623651);
            int i7 = 0;
            ?? r62 = r6;
            for (Object obj2 : split$default) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    ?? r32 = continuation;
                    u75.n();
                    throw r32;
                }
                String str = (String) obj2;
                final int i9 = i7 * 100;
                final int g = (u75.g(split$default) - i7) * 100;
                Object K4 = r62.K();
                if (K4 == obj) {
                    K4 = k5r.h(i4, r62);
                }
                u6k u6kVar2 = (u6k) K4;
                boolean d2 = r62.d(i9) | r62.d(g);
                Object K5 = r62.K();
                if (d2 || K5 == obj) {
                    K5 = new Function1() { // from class: hzv
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            fcf fcfVar = (fcf) obj3;
                            switch (i4) {
                                case 0:
                                    fcfVar.getClass();
                                    fcfVar.a = 3500;
                                    Float valueOf = Float.valueOf(0.0f);
                                    int i10 = i9;
                                    ecf a3 = fcfVar.a(valueOf, i10 + 300);
                                    ov6 ov6Var2 = ov6Var;
                                    a3.b = ov6Var2;
                                    Float valueOf2 = Float.valueOf(1.0f);
                                    fcfVar.a(valueOf2, i10 + 1500).b = ov6Var2;
                                    int i11 = g;
                                    fcfVar.a(valueOf2, i11 + RemoteCameraConfig.Properties.MIN_WHITE_BALANCE).b = ov6Var2;
                                    fcfVar.a(valueOf, i11 + 3500).b = ov6Var2;
                                    break;
                                default:
                                    fcfVar.getClass();
                                    fcfVar.a = 3500;
                                    Float valueOf3 = Float.valueOf(-1.0f);
                                    int i12 = i9;
                                    ecf a4 = fcfVar.a(valueOf3, i12 + 300);
                                    ov6 ov6Var3 = ov6Var;
                                    a4.b = ov6Var3;
                                    Float valueOf4 = Float.valueOf(0.0f);
                                    fcfVar.a(valueOf4, i12 + 1500).b = ov6Var3;
                                    int i13 = g;
                                    fcfVar.a(valueOf4, i13 + RemoteCameraConfig.Properties.MIN_WHITE_BALANCE).b = ov6Var3;
                                    fcfVar.a(Float.valueOf(1.0f), i13 + 3500).b = ov6Var3;
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r62.k0(K5);
                }
                fcf fcfVar = new fcf();
                ((Function1) K5).invoke(fcfVar);
                vm0 q = ltg.q(0.0f, 0.0f, new gcf(fcfVar), null, r62, 54, 8);
                boolean d3 = r62.d(i9) | r62.d(g);
                Object K6 = r62.K();
                if (d3 || K6 == obj) {
                    K6 = new Function1() { // from class: hzv
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            fcf fcfVar2 = (fcf) obj3;
                            switch (i6) {
                                case 0:
                                    fcfVar2.getClass();
                                    fcfVar2.a = 3500;
                                    Float valueOf = Float.valueOf(0.0f);
                                    int i10 = i9;
                                    ecf a3 = fcfVar2.a(valueOf, i10 + 300);
                                    ov6 ov6Var2 = ov6Var;
                                    a3.b = ov6Var2;
                                    Float valueOf2 = Float.valueOf(1.0f);
                                    fcfVar2.a(valueOf2, i10 + 1500).b = ov6Var2;
                                    int i11 = g;
                                    fcfVar2.a(valueOf2, i11 + RemoteCameraConfig.Properties.MIN_WHITE_BALANCE).b = ov6Var2;
                                    fcfVar2.a(valueOf, i11 + 3500).b = ov6Var2;
                                    break;
                                default:
                                    fcfVar2.getClass();
                                    fcfVar2.a = 3500;
                                    Float valueOf3 = Float.valueOf(-1.0f);
                                    int i12 = i9;
                                    ecf a4 = fcfVar2.a(valueOf3, i12 + 300);
                                    ov6 ov6Var3 = ov6Var;
                                    a4.b = ov6Var3;
                                    Float valueOf4 = Float.valueOf(0.0f);
                                    fcfVar2.a(valueOf4, i12 + 1500).b = ov6Var3;
                                    int i13 = g;
                                    fcfVar2.a(valueOf4, i13 + RemoteCameraConfig.Properties.MIN_WHITE_BALANCE).b = ov6Var3;
                                    fcfVar2.a(Float.valueOf(1.0f), i13 + 3500).b = ov6Var3;
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r62.k0(K6);
                }
                fcf fcfVar2 = new fcf();
                ((Function1) K6).invoke(fcfVar2);
                vm0 q2 = ltg.q(-1.0f, 1.0f, new gcf(fcfVar2), null, r62, 48, 8);
                Object K7 = r62.K();
                if (K7 == obj) {
                    u6kVar = u6kVar2;
                    i2 = 6;
                    K7 = new aq(u6kVar, i2);
                    r62.k0(K7);
                } else {
                    u6kVar = u6kVar2;
                    i2 = 6;
                }
                yci f3 = androidx.compose.ui.layout.a.f(vciVar, (Function1) K7);
                boolean f4 = r62.f(q2);
                Object K8 = r62.K();
                int i10 = 3;
                if (f4 || K8 == obj) {
                    K8 = new itv(i10, u6kVar, q2);
                    r62.k0(K8);
                }
                yci i11 = androidx.compose.foundation.layout.a.i(f3, (Function1) K8);
                boolean f5 = r62.f(q);
                Object K9 = r62.K();
                if (f5 || K9 == obj) {
                    K9 = new xp(q, 22);
                    r62.k0(K9);
                }
                oq5 oq5Var2 = r62;
                xcs.b(str, androidx.compose.ui.graphics.a.a(i11, (Function1) K9), ((dq0) r62.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(r62).e.a, oq5Var2, 0, 0, 65016);
                i6 = 1;
                i4 = 0;
                r62 = oq5Var2;
                i7 = i8;
                ov6Var = ov6Var;
                obj = obj;
                vciVar = vciVar;
                split$default = split$default;
                continuation = null;
            }
            r62.p(i4);
            r62.p(true);
            oq5Var = r62;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xtp(function0, i, 14);
        }
    }

    public static final int u(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r8 < r9) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r2 < r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2 > r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r8 > r9) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long v(int[] iArr, long j) {
        float f;
        float intBitsToFloat;
        float f2;
        float intBitsToFloat2;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) >= 0.0f) {
            f = iArr[0] * (-1.0f);
            intBitsToFloat = Float.intBitsToFloat(i);
        } else {
            f = iArr[0] * (-1.0f);
            intBitsToFloat = Float.intBitsToFloat(i);
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= 0.0f) {
            f2 = iArr[1] * (-1.0f);
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        } else {
            f2 = iArr[1] * (-1.0f);
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static void w(oxq oxqVar, List list, ymn ymnVar) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int c = oxqVar.c((w80) list.get(i));
            int M = oxqVar.M(oxqVar.b, oxqVar.q(c));
            Object obj = M < oxqVar.f(oxqVar.b, oxqVar.q(c + 1)) ? oxqVar.c[oxqVar.g(M)] : gq5.a;
            xmn xmnVar = obj instanceof xmn ? (xmn) obj : null;
            if (xmnVar != null) {
                xmnVar.b = ymnVar;
            }
        }
    }

    public static final Object x(fvf fvfVar, int i, int i2, b9r b9rVar, aur aurVar) {
        Object obj;
        Iterator it = fvfVar.j().k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((cvf) obj).a == i) {
                break;
            }
        }
        cvf cvfVar = (cvf) obj;
        if (cvfVar == null) {
            return new Float(0.0f);
        }
        int i3 = (cvfVar.p - fvfVar.j().l) - i2;
        int i4 = ((cvfVar.p + cvfVar.q) - fvfVar.j().m) + i2;
        if (i3 >= 0) {
            if (i4 <= 0) {
                return new Float(0.0f);
            }
            i3 = i4;
        }
        return neg.g(fvfVar, i3, b9rVar, aurVar);
    }

    public static final wvt y(a1j a1jVar) {
        a1jVar.getClass();
        return new wvt(zsd.F0(new y4s(a1jVar.d, 9), cmd.a, lbq.a, a1jVar.a() == v0j.e ? u0j.a : u0j.b), a1jVar);
    }

    public static final int z(float f) {
        return ((int) (f >= 0.0f ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    public int hashCode() {
        switch (this.a) {
            case 14:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 14:
                String h = ern.a(getClass()).h();
                h.getClass();
                return h;
            default:
                return super.toString();
        }
    }
}
