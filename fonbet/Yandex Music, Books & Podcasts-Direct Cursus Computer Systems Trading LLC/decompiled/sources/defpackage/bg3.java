package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.wave.NewWaveModelDto;
import com.yandex.music.shared.wavefortwo.data.MultivibeGroupDto;
import com.yandex.music.shared.wavefortwo.data.MultivibeGroupMemberDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class bg3 {
    public static final float[] a = new float[91];
    public static final wn5 b = new wn5(new go5(14), -495605559, false);
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final lc8 f;
    public static final lc8 g;
    public static final lc8 h;
    public static final lc8 i;
    public static final int[] j;
    public static final int[] k;
    public static final String[] l;
    public static Boolean m;
    public static Boolean n;
    public static Boolean o;
    public static Boolean p;
    public static Boolean q;
    public static Boolean r;
    public static Boolean s;

    static {
        int i2 = 21;
        new wn5(new fo5(i2), -1773596373, false);
        c = new wn5(new lo5(i2), 1748251408, false);
        d = new wn5(new lo5(22), 1243587238, false);
        new wn5(new lo5(23), 1640382739, false);
        e = new wn5(new ap5(2), -525214106, false);
        f = new lc8(22);
        g = new lc8(23);
        h = new lc8(24);
        i = new lc8(25);
        j = new int[]{R.attr.theme, ru.yandex.music.R.attr.theme};
        k = new int[]{ru.yandex.music.R.attr.materialThemeOverlay};
        l = new String[]{"yandex.ru", "yandex.kz", "yandex.uz", "yandex.by", "yandex.com", "ya.ru", "ya.kz", "ya.uz", "ya.by", "ya.com", "mgc-loyalty.ru"};
    }

    public static void A(Uri uri, String str, int i2, qdc qdcVar) {
        sr1 sr1Var = new sr1(uri, str);
        if (i2 <= 0) {
            i2 = 30000;
        }
        sr1Var.e = i2;
        sr1Var.c.H(HttpMessage.CONTENT_TYPE_HEADER, "application/json");
        nsh x = nsh.x();
        x.getClass();
        jml jmlVar = new jml();
        or1 or1Var = new or1(x);
        viq viqVar = new viq();
        x.h(sr1Var, 0, or1Var, new kkp(x, qdcVar, viqVar, jmlVar, 16));
        viqVar.l(or1Var);
    }

    public static final ArrayList B(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.d(((sbb) obj).getOrder(), obq.a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList C(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.d(((sbb) obj).getOrder(), pbq.a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final f29 D(View view) {
        if (view instanceof f29) {
            return (f29) view;
        }
        j1a j1aVar = view instanceof j1a ? (j1a) view : null;
        if (j1aVar != null) {
            KeyEvent.Callback child = j1aVar.getChild();
            if (child instanceof f29) {
                return (f29) child;
            }
        }
        return null;
    }

    public static final int E(View view) {
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (height < 0) {
            return 0;
        }
        return height;
    }

    public static final int F(View view) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        if (width < 0) {
            return 0;
        }
        return width;
    }

    public static final e23 G(View view) {
        f29 D = D(view);
        if (D != null) {
            return D.getBindingContext();
        }
        return null;
    }

    public static final String H(zy9 zy9Var) {
        if (zy9Var instanceof ry9) {
            return ((ry9) zy9Var).b.a;
        }
        if (zy9Var instanceof uy9) {
            return ((uy9) zy9Var).b.a;
        }
        if (zy9Var instanceof vy9) {
            return ((vy9) zy9Var).b.a;
        }
        if (zy9Var instanceof xy9) {
            return ((xy9) zy9Var).b.a;
        }
        if (zy9Var instanceof sy9) {
            return ((sy9) zy9Var).b.a;
        }
        if (zy9Var instanceof yy9) {
            return ((yy9) zy9Var).b.a;
        }
        if (zy9Var instanceof ty9) {
            return ((ty9) zy9Var).b.a;
        }
        if (zy9Var instanceof qy9) {
            return ((qy9) zy9Var).b.a;
        }
        if (zy9Var instanceof wy9) {
            return ((wy9) zy9Var).b.b;
        }
        b6e.s();
        return null;
    }

    public static final thj I(wff wffVar) {
        wffVar.getClass();
        return new thj(pkb.Shortcut, wffVar.a, 1, 1, "");
    }

    public static final boolean J(szb szbVar, xzb xzbVar, String str) {
        szb szbVar2;
        pzb pzbVar = szbVar instanceof pzb ? (pzb) szbVar : null;
        if (pzbVar == null) {
            return false;
        }
        List f2 = pzbVar.f(xzbVar);
        if (f2.contains(str)) {
            return true;
        }
        Iterator it = f2.iterator();
        while (it.hasNext()) {
            kxt c2 = xzbVar.c((String) it.next());
            gxt gxtVar = c2 instanceof gxt ? (gxt) c2 : null;
            if (gxtVar != null) {
                synchronized (gxtVar) {
                    szbVar2 = (szb) gxtVar.d.c;
                }
                if (J(szbVar2, xzbVar, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean K(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (r == null) {
            r = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return r.booleanValue();
    }

    public static boolean L(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (p == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            p = Boolean.valueOf(z);
        }
        return p.booleanValue();
    }

    public static boolean M(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        if (n == null) {
            n = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || L(resources));
        }
        return n.booleanValue();
    }

    public static boolean N(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (s == null) {
            s = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return s.booleanValue();
    }

    public static void O(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        xq0.x(str.concat(" may not be negative"));
    }

    public static void P(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xq0.x(str.concat(" may not be null"));
    }

    public static final szb U(cym cymVar, xzb xzbVar, dfb dfbVar) {
        try {
            ox8 ox8Var = qx8.a;
            szb szbVar = cymVar.a;
            String str = cymVar.b;
            Object b2 = szbVar.b();
            b2.getClass();
            szb b3 = qx8.b((String) b2, "get", cymVar.e, dfbVar);
            if (!J(b3, xzbVar, str)) {
                return b3;
            }
            dfbVar.d(new IllegalArgumentException(hrg.q("Property variable '", str, "' has cycle in 'get' expression.")));
            return null;
        } catch (z7k e2) {
            dfbVar.d(e2);
            return null;
        }
    }

    public static final boolean V(View view) {
        do {
            ViewParent parent = view.getParent();
            view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (view == null || view.getParent() == null) {
                return false;
            }
        } while (!view.performLongClick());
        return true;
    }

    public static final u9b W(int i2, String str, boolean z) {
        String str2;
        if (z) {
            int i3 = i2 % 3;
            if (i3 == 0) {
                str2 = "avatars.mds.yandex.net/get-music-misc/2419084/img.686688add03ee35062c02822/%%";
            } else if (i3 == 1) {
                str2 = "avatars.mds.yandex.net/get-music-misc/28592/img.6867878964ece217d515ffda/%%";
            } else {
                if (i3 != 2) {
                    xq0.q("int % 3 can't be something other then 0, 1, 2");
                    return null;
                }
                str2 = "avatars.mds.yandex.net/get-music-misc/30221/img.686787926dccf85a8a06c771/%%";
            }
        } else {
            int i4 = i2 % 3;
            if (i4 == 0) {
                str2 = "avatars.mds.yandex.net/get-music-misc/30221/img.68678806f4c3467d82bab43b/%%";
            } else if (i4 == 1) {
                str2 = "avatars.mds.yandex.net/get-music-misc/34161/img.68678811e40cd01bff989e50/%%";
            } else {
                if (i4 != 2) {
                    xq0.q("int % 3 can't be something other then 0, 1, 2");
                    return null;
                }
                str2 = "avatars.mds.yandex.net/get-music-misc/30221/img.6867881aea3b324d5df9692f/%%";
            }
        }
        return new u9b(str2, str, null);
    }

    public static hl4 X(Drawable drawable, int i2, int i3, int i4) {
        return new hl4(0, 0, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, drawable);
    }

    public static void Y(HashMap hashMap) {
        String[] strArr;
        List g2;
        ConcurrentHashMap concurrentHashMap = ast.d;
        ast astVar = ast.e;
        if (bp6.a.contains(ast.class)) {
            return;
        }
        try {
            if (!ast.b.get()) {
                astVar.b();
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                int length = str2.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.e(str2.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                String Y = gvt.Y(astVar.c(str, str2.subSequence(i2, length + 1).toString()));
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (g2 = new Regex(StringUtils.COMMA).g(0, str3)) == null) {
                        strArr = new String[0];
                    } else {
                        Object[] array = g2.toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        strArr = (String[]) array;
                    }
                    Set d2 = vop.d((String[]) Arrays.copyOf(strArr, strArr.length));
                    if (d2.contains(Y)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(Y);
                    } else if (strArr.length < 5) {
                        sb.append(str3);
                        sb.append(StringUtils.COMMA);
                        sb.append(Y);
                    } else {
                        for (int i3 = 1; i3 < 5; i3++) {
                            sb.append(strArr[i3]);
                            sb.append(StringUtils.COMMA);
                        }
                        sb.append(Y);
                        d2.remove(strArr[0]);
                    }
                    concurrentHashMap.put(str, sb.toString());
                } else {
                    concurrentHashMap.put(str, Y);
                }
            }
            String H = gvt.H(concurrentHashMap);
            if (bp6.a.contains(astVar)) {
                return;
            }
            try {
                j3c.d().execute(new cs4(H, 1));
            } catch (Throwable th) {
                bp6.a(astVar, th);
            }
        } catch (Throwable th2) {
            bp6.a(ast.class, th2);
        }
    }

    public static final int Z(Long l2, DisplayMetrics displayMetrics) {
        Integer num;
        if (l2 != null) {
            long longValue = l2.longValue();
            long j2 = longValue >> 31;
            num = Integer.valueOf((j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            num = null;
        }
        return eeh.b(a0(num, displayMetrics));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(yci yciVar, g40 g40Var, boolean z, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        boolean z2;
        g40 g40Var2;
        yci yciVar2;
        boolean z3;
        xmn r2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1781813501);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(g40Var) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            z2 = z;
            i4 |= oq5Var.g(z2) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i4 |= oq5Var.h(wn5Var) ? 2048 : 1024;
            }
            if (oq5Var.P(i4 & 1, (i4 & 1171) == 1170)) {
                oq5Var.S();
                g40Var2 = g40Var;
                yciVar2 = yciVar;
                z3 = z2;
            } else {
                if (i5 != 0) {
                    yciVar = vci.a;
                }
                g40 g40Var3 = i6 != 0 ? b2c.b : g40Var;
                if (i7 != 0) {
                    z2 = false;
                }
                kfh d2 = ug3.d(g40Var3, z2);
                boolean f2 = oq5Var.f(d2) | ((i4 & 7168) == 2048);
                Object K = oq5Var.K();
                if (f2 || K == gq5.a) {
                    K = new s30(10, d2, wn5Var);
                    oq5Var.k0(K);
                }
                u2x.p(yciVar, (Function2) K, oq5Var, i4 & 14, 0);
                g40Var2 = g40Var3;
                z3 = z2;
                yciVar2 = yciVar;
            }
            r2 = oq5Var.r();
            if (r2 == null) {
                r2.d = new eh3(yciVar2, g40Var2, z3, wn5Var, i2, i3);
                return;
            }
            return;
        }
        z2 = z;
        if ((i2 & 3072) == 0) {
        }
        if (oq5Var.P(i4 & 1, (i4 & 1171) == 1170)) {
        }
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static final float a0(Number number, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, number != null ? number.floatValue() : 0.0f, displayMetrics);
    }

    public static final void b(final List list, final f14 f14Var, final yci yciVar, final boolean z, final o0k o0kVar, final float f2, hq5 hq5Var, final int i2) {
        oq5 oq5Var;
        list.getClass();
        f14Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1470581418);
        int i3 = i2 | (oq5Var2.f(list) ? 4 : 2) | (oq5Var2.f(f14Var) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128) | (oq5Var2.g(z) ? 2048 : 1024) | (oq5Var2.f(o0kVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var2.P(i3 & 1, (74899 & i3) != 74898)) {
            oq5Var2.U();
            if ((i2 & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            ynn i4 = irv.i(oq5Var2);
            yci a2 = a.a(yciVar, "carousel_block_lazy_row");
            wn5 C = ild.C(-667859769, new w04(i4, f14Var, z), oq5Var2);
            int i5 = (i3 & 14) | 100663296;
            int i6 = i3 >> 3;
            oq5Var = oq5Var2;
            up6.i(list, a2, null, o0kVar, f2, 0.0f, 0.0f, null, null, null, false, 0, C, oq5Var, i5 | (i6 & 7168) | (i6 & 57344), 384, 3812);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new Function2(list, f14Var, yciVar, z, o0kVar, f2, i2) { // from class: x04
                public final /* synthetic */ List a;
                public final /* synthetic */ f14 b;
                public final /* synthetic */ yci c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ o0k e;
                public final /* synthetic */ float f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    bg3.b(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final u9b b0(u9b u9bVar, int i2, boolean z) {
        u9bVar.getClass();
        return StringsKt.M(u9bVar.a, "img.6568f242071da73cabc5846c/%%", false) ? W(i2, "#999999", z) : u9bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f14 f14Var, zpd zpdVar, yci yciVar, o0k o0kVar, float f2, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        o0k o0kVar2;
        int i4;
        int i5;
        float f3;
        xmn r2;
        yci yciVar3;
        o0k o0kVar3;
        float f4;
        f14Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(595109404);
        int i6 = (oq5Var.f(f14Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i6 |= oq5Var.d(zpdVar.ordinal()) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i3 & 8) != 0) {
                o0kVar2 = o0kVar;
                if (oq5Var.f(o0kVar2)) {
                    i4 = 2048;
                    i5 = i6 | i4 | RemoteCameraConfig.Notification.ID;
                    if (oq5Var.P(i5 & 1, (i5 & 9363) != 9362)) {
                        oq5Var.U();
                        if ((i2 & 1) == 0 || oq5Var.y()) {
                            yciVar3 = i7 != 0 ? vci.a : yciVar2;
                            o0kVar3 = (i3 & 8) != 0 ? vt0.c : o0kVar2;
                            f4 = vt0.a;
                        } else {
                            oq5Var.S();
                            f4 = f2;
                            yciVar3 = yciVar2;
                            o0kVar3 = o0kVar2;
                        }
                        oq5Var.q();
                        tt0.g((lht) gld.M(f14Var.getState(), oq5Var).getValue(), null, null, "carouselCrossfade", ild.C(-683726424, new u04(zpdVar, yciVar3, o0kVar3, f4, f14Var), oq5Var), oq5Var, 27648, 6);
                        yciVar2 = yciVar3;
                        o0kVar2 = o0kVar3;
                        f3 = f4;
                    } else {
                        oq5Var.S();
                        f3 = f2;
                    }
                    r2 = oq5Var.r();
                    if (r2 != null) {
                        r2.d = new v04(f14Var, zpdVar, yciVar2, o0kVar2, f3, i2, i3);
                        return;
                    }
                    return;
                }
            } else {
                o0kVar2 = o0kVar;
            }
            i4 = 1024;
            i5 = i6 | i4 | RemoteCameraConfig.Notification.ID;
            if (oq5Var.P(i5 & 1, (i5 & 9363) != 9362)) {
            }
            r2 = oq5Var.r();
            if (r2 != null) {
            }
        }
        yciVar2 = yciVar;
        if ((i3 & 8) != 0) {
        }
        i4 = 1024;
        i5 = i6 | i4 | RemoteCameraConfig.Notification.ID;
        if (oq5Var.P(i5 & 1, (i5 & 9363) != 9362)) {
        }
        r2 = oq5Var.r();
        if (r2 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public static final fhi c0(MultivibeGroupDto multivibeGroupDto) {
        ghi d0;
        ?? r5;
        lhi lhiVar;
        lhi lhiVar2;
        multivibeGroupDto.getClass();
        String id = multivibeGroupDto.getId();
        if (id == null) {
            return null;
        }
        String name = multivibeGroupDto.getName();
        MultivibeGroupMemberDto owner = multivibeGroupDto.getOwner();
        if (owner == null || (d0 = d0(owner)) == null) {
            return null;
        }
        List<MultivibeGroupMemberDto> members = multivibeGroupDto.getMembers();
        if (members != null) {
            r5 = new ArrayList();
            for (MultivibeGroupMemberDto multivibeGroupMemberDto : members) {
                ghi d02 = multivibeGroupMemberDto != null ? d0(multivibeGroupMemberDto) : null;
                if (d02 != null) {
                    r5.add(d02);
                }
            }
        } else {
            r5 = c5b.a;
        }
        List list = r5;
        NewWaveModelDto wave = multivibeGroupDto.getWave();
        dou a2 = wave != null ? wave.a() : null;
        String status = multivibeGroupDto.getStatus();
        if (status == null) {
            return null;
        }
        int hashCode = status.hashCode();
        if (hashCode == -891611359) {
            if (status.equals("ENABLED")) {
                lhiVar = lhi.b;
                lhiVar2 = lhiVar;
            }
            lhiVar2 = null;
        } else if (hashCode != 65307009) {
            if (hashCode == 1053567612 && status.equals("DISABLED")) {
                lhiVar = lhi.c;
                lhiVar2 = lhiVar;
            }
            lhiVar2 = null;
        } else {
            if (status.equals("DRAFT")) {
                lhiVar = lhi.a;
                lhiVar2 = lhiVar;
            }
            lhiVar2 = null;
        }
        if (lhiVar2 == null) {
            return null;
        }
        return new fhi(id, name, d0, list, a2, lhiVar2);
    }

    public static final void d(rd5 rd5Var, hq5 hq5Var, int i2) {
        rd5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1251467877);
        if ((((oq5Var.h(rd5Var) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            iz2 iz2Var = b2c.f;
            float f2 = 0;
            yci p2 = androidx.compose.foundation.layout.a.p(d.d(vci.a, 1.0f), f2, 14, f2, 6);
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, p2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            tt0.g((xd5) gld.O(rd5Var.d, oq5Var).getValue(), null, weo.S(0, 0, nya.d, 3), "concert_informer_state", ild.C(-268661086, new u2(28, rd5Var), oq5Var), oq5Var, 27648, 2);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kv4(rd5Var, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ghi d0(MultivibeGroupMemberDto multivibeGroupMemberDto) {
        khi khiVar;
        Long uid = multivibeGroupMemberDto.getUid();
        String name = multivibeGroupMemberDto.getName();
        if (name != null) {
            EntityCoverDto cover = multivibeGroupMemberDto.getCover();
            u9b V = cover != null ? c3x.V(cover) : null;
            String status = multivibeGroupMemberDto.getStatus();
            if (status != null) {
                int hashCode = status.hashCode();
                if (hashCode == -1629280142) {
                    if (status.equals("INACTIVE_EXIT")) {
                        khiVar = ihi.a;
                        if (khiVar != null) {
                        }
                    }
                    khiVar = null;
                    if (khiVar != null) {
                    }
                } else if (hashCode != -783997839) {
                    if (hashCode == 1925346054 && status.equals("ACTIVE")) {
                        khiVar = hhi.a;
                        if (khiVar != null) {
                            return new ghi(uid, name, V, khiVar);
                        }
                    }
                    khiVar = null;
                    if (khiVar != null) {
                    }
                } else {
                    if (status.equals("INACTIVE_SUBSCRIPTION")) {
                        khiVar = jhi.a;
                        if (khiVar != null) {
                        }
                    }
                    khiVar = null;
                    if (khiVar != null) {
                    }
                }
            }
        }
        return null;
    }

    public static final void e(o16 o16Var, c26 c26Var, tvd tvdVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        o16Var.getClass();
        c26Var.getClass();
        tvdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-15364954);
        int i3 = i2 | (oq5Var.h(o16Var) ? 4 : 2) | (oq5Var.h(c26Var) ? 32 : 16) | 3072;
        if ((i3 & 1043) == 1042 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Continuation continuation = null;
            if (o16Var.equals(l16.a)) {
                oq5Var.Z(1554789410);
                sk3.f(6, oq5Var, null, false);
                oq5Var.p(false);
            } else if (o16Var instanceof m16) {
                oq5Var.Z(1554957585);
                Class<?> cls = o16Var.getClass();
                boolean h2 = oq5Var.h(c26Var);
                Object K = oq5Var.K();
                if (h2 || K == gq5.a) {
                    K = new ox1(c26Var, continuation, 9);
                    oq5Var.k0(K);
                }
                gld.w(oq5Var, cls, (Function2) K);
                lg3.o((m16) o16Var, c26Var, d.d(vciVar, 1.0f), oq5Var, (i3 & 112) | (i3 & 14) | 384);
                oq5Var.p(false);
            } else {
                if (!o16Var.equals(n16.a)) {
                    throw vz1.i(oq5Var, -1058225540, false);
                }
                oq5Var.Z(1555318115);
                sk3.f(6, oq5Var, null, true);
                oq5Var.p(false);
            }
            eta.p(vciVar, 16, oq5Var, true);
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new av5(o16Var, c26Var, tvdVar, yciVar2, i2, 3);
        }
    }

    public static final int e0(long j2, jk9 jk9Var, DisplayMetrics displayMetrics) {
        int ordinal = jk9Var.ordinal();
        if (ordinal == 0) {
            return w(Long.valueOf(j2), displayMetrics);
        }
        if (ordinal == 1) {
            return Z(Long.valueOf(j2), displayMetrics);
        }
        if (ordinal == 2) {
            long j3 = j2 >> 31;
            return (j3 == 0 || j3 == -1) ? (int) j2 : j2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        b6e.s();
        return 0;
    }

    public static final void f(vyb vybVar, Function0 function0, hq5 hq5Var, int i2) {
        boolean z;
        oq5 oq5Var;
        float f2;
        boolean z2;
        boolean z3;
        vybVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-384910532);
        int i3 = (oq5Var2.f(vybVar) ? 4 : 2) | i2 | (oq5Var2.h(function0) ? 32 : 16);
        if (oq5Var2.P(i3 & 1, (i3 & 19) != 18)) {
            vci vciVar = vci.a;
            float f3 = 24;
            yci p2 = androidx.compose.foundation.layout.a.p(d.d(vciVar, 1.0f), f3, 48, f3, f3);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, p2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var2.Z(19816700);
            oq5Var2.p(false);
            if (vybVar.a != null) {
                oq5Var2.Z(21273979);
                z = false;
                f2 = f3;
                xcs.b(vybVar.a, null, ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 2, 0, null, nu0.c(), oq5Var2, 0, 3072, 56826);
                oq5Var = oq5Var2;
                eta.p(vciVar, 12, oq5Var, false);
            } else {
                z = false;
                oq5Var = oq5Var2;
                f2 = f3;
                oq5Var.Z(19816700);
                oq5Var.p(false);
            }
            if (vybVar.b != null) {
                oq5Var.Z(21631223);
                oq5 oq5Var3 = oq5Var;
                xcs.b(vybVar.b, null, ((dq0) oq5Var.j(eq0.a)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 2, 0, null, nu0.j(), oq5Var3, 0, 3072, 56826);
                oq5Var = oq5Var3;
                eta.p(vciVar, f2, oq5Var, z);
            } else {
                oq5Var.Z(19816700);
                oq5Var.p(z);
            }
            if (vybVar.c != null) {
                oq5Var.Z(21989769);
                wn5 C = ild.C(-2134876127, new tt5(15, vybVar), oq5Var);
                z2 = z;
                oq5Var2 = oq5Var;
                z3 = true;
                hdg.n(((i3 >> 3) & 14) | 384, 2, C, oq5Var2, null, function0);
            } else {
                z2 = z;
                oq5Var2 = oq5Var;
                z3 = true;
                oq5Var2.Z(19816700);
            }
            oq5Var2.p(z2);
            oq5Var2.p(z3);
        } else {
            oq5Var2.S();
        }
        xmn r2 = oq5Var2.r();
        if (r2 != null) {
            r2.d = new t1b(vybVar, function0, i2, 7);
        }
    }

    public static final int f0(ow8 ow8Var, DisplayMetrics displayMetrics, xzb xzbVar) {
        szb szbVar = ow8Var.a;
        szb szbVar2 = ow8Var.b;
        int ordinal = ((jk9) szbVar.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            return x((Number) szbVar2.a(xzbVar), displayMetrics);
        }
        if (ordinal == 1) {
            return eeh.b(a0((Number) szbVar2.a(xzbVar), displayMetrics));
        }
        if (ordinal == 2) {
            return (int) ((Number) szbVar2.a(xzbVar)).doubleValue();
        }
        b6e.s();
        return 0;
    }

    public static final void g(fxa fxaVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1977781714);
        if (((i2 | 2) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                fxaVar = (fxa) oq5Var.j(cs5.e);
            } else {
                oq5Var.S();
            }
            oq5Var.q();
            etn.m(new qzm[]{cs5.e.a(fxaVar)}, wn5Var, oq5Var, 48);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new s30(fxaVar, wn5Var, i2, 26);
        }
    }

    public static final int g0(jz8 jz8Var, DisplayMetrics displayMetrics, xzb xzbVar) {
        szb szbVar = jz8Var.a;
        szb szbVar2 = jz8Var.b;
        int ordinal = ((jk9) szbVar.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            return w((Long) szbVar2.a(xzbVar), displayMetrics);
        }
        if (ordinal == 1) {
            return Z((Long) szbVar2.a(xzbVar), displayMetrics);
        }
        if (ordinal != 2) {
            b6e.s();
            return 0;
        }
        long longValue = ((Number) szbVar2.a(xzbVar)).longValue();
        long j2 = longValue >> 31;
        return (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final void h(boolean z, zpd zpdVar, yci yciVar, o0k o0kVar, float f2, hq5 hq5Var, int i2) {
        zpd zpdVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1129061929);
        int i3 = i2 | (oq5Var.g(z) ? 4 : 2) | (oq5Var.d(zpdVar.ordinal()) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | (oq5Var.f(o0kVar) ? 2048 : 1024) | (oq5Var.c(f2) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            ArrayList arrayList = new ArrayList(10);
            for (int i4 = 0; i4 < 10; i4++) {
                arrayList.add(Unit.a);
            }
            zpdVar2 = zpdVar;
            int i5 = i3 >> 3;
            up6.j(arrayList, yciVar, o0kVar, f2, 0.0f, null, null, false, 0, ild.C(-1768338895, new y04(z, zpdVar2), oq5Var), oq5Var, (i5 & 112) | 102236160 | (i5 & 896) | (i5 & 7168), 688);
        } else {
            zpdVar2 = zpdVar;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new z04(z, zpdVar2, yciVar, o0kVar, f2, i2);
        }
    }

    public static final int h0(kk9 kk9Var, DisplayMetrics displayMetrics, xzb xzbVar) {
        szb szbVar = kk9Var.a;
        szb szbVar2 = kk9Var.b;
        int ordinal = ((jk9) szbVar.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            return w((Long) szbVar2.a(xzbVar), displayMetrics);
        }
        if (ordinal == 1) {
            return Z((Long) szbVar2.a(xzbVar), displayMetrics);
        }
        if (ordinal != 2) {
            b6e.s();
            return 0;
        }
        long longValue = ((Number) szbVar2.a(xzbVar)).longValue();
        long j2 = longValue >> 31;
        return (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static oi i(mm6 mm6Var, CoroutineContext coroutineContext, int i2, kin kinVar, Function2 function2, int i3) {
        oi oiVar;
        pm6 pm6Var = pm6.d;
        if ((i3 & 1) != 0) {
            coroutineContext = g.a;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            pm6Var = pm6.a;
        }
        if ((i3 & 8) != 0) {
            kinVar = null;
        }
        CoroutineContext b2 = bm6.b(mm6Var, coroutineContext);
        zi3 g2 = men.g(i2, 6, null);
        if (pm6Var == pm6.b) {
            crf crfVar = new crf(b2, g2, false);
            crfVar.e = qxe.a(crfVar, crfVar, function2);
            oiVar = crfVar;
        } else {
            oiVar = new oi(b2, g2, true);
        }
        if (kinVar != null) {
            oiVar.R(kinVar);
        }
        oiVar.o0(pm6Var, oiVar, function2);
        return oiVar;
    }

    public static final float i0(long j2, jk9 jk9Var, DisplayMetrics displayMetrics) {
        int ordinal = jk9Var.ordinal();
        if (ordinal == 0) {
            return y(Long.valueOf(j2), displayMetrics);
        }
        if (ordinal == 1) {
            return a0(Long.valueOf(j2), displayMetrics);
        }
        if (ordinal == 2) {
            return j2;
        }
        b6e.s();
        return 0.0f;
    }

    public static final void j(View view, om8 om8Var, pm8 pm8Var) {
        int N = vq1.N(om8Var, pm8Var);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof u79) {
            u79 u79Var = (u79) layoutParams;
            if (u79Var.a != N) {
                u79Var.a = N;
                view.requestLayout();
            }
        } else {
            Objects.toString(view.getTag());
            Objects.toString(layoutParams);
        }
        boolean z = pm8Var == pm8.BASELINE;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        u79 u79Var2 = layoutParams2 instanceof u79 ? (u79) layoutParams2 : null;
        if (u79Var2 == null || u79Var2.b == z) {
            return;
        }
        u79Var2.b = z;
        view.requestLayout();
    }

    public static final float j0(jz8 jz8Var, DisplayMetrics displayMetrics, xzb xzbVar) {
        return i0(((Number) jz8Var.b.a(xzbVar)).longValue(), (jk9) jz8Var.a.a(xzbVar), displayMetrics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(View view, e23 e23Var, bd8 bd8Var, List list, List list2, List list3, List list4, List list5, List list6, List list7, sm8 sm8Var, szb szbVar) {
        List c2;
        pe8 t = e23Var.a.getDiv2Component$div_release().t();
        List list8 = list;
        if (list8 == null || list8.isEmpty()) {
            c2 = bd8Var != null ? t75.c(bd8Var) : null;
        } else {
            c2 = list;
        }
        t.getClass();
        xzb xzbVar = e23Var.b;
        le8 le8Var = new le8(c2, list3, list2, list4, list5, list6, list7, t, e23Var, view, sm8Var, szbVar);
        q6k.i(view, c2, xzbVar, new ke8(le8Var, 0));
        q6k.i(view, list2, xzbVar, new ke8(le8Var, 1));
        q6k.i(view, list3, xzbVar, new ke8(le8Var, 2));
        ke8 ke8Var = new ke8(le8Var, 3);
        if (view instanceof a0c) {
            ((a0c) view).i(szbVar.c(xzbVar, ke8Var));
        }
        le8Var.invoke();
    }

    public static final kxt k0(zy9 zy9Var, xzb xzbVar, eym eymVar, dfb dfbVar) {
        if (zy9Var instanceof ry9) {
            yb3 yb3Var = ((ry9) zy9Var).b;
            return new axt(yb3Var.a, ((Boolean) yb3Var.b.a(xzbVar)).booleanValue());
        }
        if (zy9Var instanceof uy9) {
            jre jreVar = ((uy9) zy9Var).b;
            return new ext(jreVar.a, ((Number) jreVar.b.a(xzbVar)).longValue());
        }
        if (zy9Var instanceof vy9) {
            jhj jhjVar = ((vy9) zy9Var).b;
            return new dxt(jhjVar.a, ((Number) jhjVar.b.a(xzbVar)).doubleValue());
        }
        if (zy9Var instanceof xy9) {
            wir wirVar = ((xy9) zy9Var).b;
            return new hxt(wirVar.a, (String) wirVar.b.a(xzbVar));
        }
        if (zy9Var instanceof sy9) {
            ga5 ga5Var = ((sy9) zy9Var).b;
            return new bxt(ga5Var.a, ((Number) ga5Var.b.a(xzbVar)).intValue());
        }
        if (zy9Var instanceof yy9) {
            qqt qqtVar = ((yy9) zy9Var).b;
            return new ixt((Uri) qqtVar.b.a(xzbVar), qqtVar.a);
        }
        if (zy9Var instanceof ty9) {
            m28 m28Var = ((ty9) zy9Var).b;
            return new cxt(m28Var.a, (JSONObject) m28Var.b.a(xzbVar));
        }
        if (zy9Var instanceof qy9) {
            kz0 kz0Var = ((qy9) zy9Var).b;
            return new zwt(kz0Var.a, (JSONArray) kz0Var.b.a(xzbVar));
        }
        if (!(zy9Var instanceof wy9)) {
            b6e.s();
            return null;
        }
        cym cymVar = ((wy9) zy9Var).b;
        szb U = U(cymVar, xzbVar, dfbVar);
        if (U == null) {
            return null;
        }
        String str = cymVar.b;
        nx8 nx8Var = cymVar.e;
        return new gxt(str, nx8Var, new jac(str, nx8Var, U, cymVar.d, cymVar.c, eymVar));
    }

    public static final void l(View view, ix8 ix8Var, xzb xzbVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (ix8Var != null) {
            jk9 jk9Var = (jk9) ix8Var.g.a(xzbVar);
            i2 = m0((Long) ix8Var.c.a(xzbVar), displayMetrics, jk9Var);
            i3 = m0((Long) ix8Var.f.a(xzbVar), displayMetrics, jk9Var);
            i4 = m0((Long) ix8Var.d.a(xzbVar), displayMetrics, jk9Var);
            i5 = m0((Long) ix8Var.a.a(xzbVar), displayMetrics, jk9Var);
            szb szbVar = ix8Var.e;
            Integer valueOf = szbVar != null ? Integer.valueOf(m0((Long) szbVar.a(xzbVar), displayMetrics, jk9Var)) : null;
            szb szbVar2 = ix8Var.b;
            num = szbVar2 != null ? Integer.valueOf(m0((Long) szbVar2.a(xzbVar), displayMetrics, jk9Var)) : null;
            r3 = valueOf;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            num = null;
        }
        if (marginLayoutParams.leftMargin == i2 && marginLayoutParams.topMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.bottomMargin == i5 && ((r3 == null || marginLayoutParams.getMarginStart() == r3.intValue()) && (num == null || marginLayoutParams.getMarginEnd() == num.intValue()))) {
            return;
        }
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.bottomMargin = i5;
        if (r3 == null && num == null) {
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i4;
        } else {
            marginLayoutParams.setMarginStart(r3 != null ? r3.intValue() : 0);
            marginLayoutParams.setMarginEnd(num != null ? num.intValue() : 0);
        }
        view.requestLayout();
    }

    public static final void l0(ViewGroup viewGroup, gc8 gc8Var, List list, List list2) {
        w1a A = gc8Var.getDiv2Component$div_release().A();
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dp8 d2 = ((k79) it.next()).a.d();
                List e2 = d2.e();
                if (e2 == null) {
                    e2 = c5b.a;
                }
                z75.t(arrayList, CollectionsKt.g0(e2, vq1.P(d2)));
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((wj9) it2.next()).a());
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                k79 k79Var = (k79) it3.next();
                List P = vq1.P(k79Var.a.d());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : P) {
                    if (!hashSet.contains(((l1a) obj).c)) {
                        arrayList2.add(obj);
                    }
                }
                List e3 = k79Var.a.d().e();
                if (e3 == null) {
                    e3 = c5b.a;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : e3) {
                    if (!hashSet.contains(((tw8) obj2).d)) {
                        arrayList3.add(obj2);
                    }
                }
                A.h(gc8Var, k79Var.b, null, k79Var.a, arrayList2, arrayList3);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(new uq2(viewGroup, list, A, gc8Var));
    }

    public static final void m(View view, ix8 ix8Var, xzb xzbVar) {
        if (ix8Var == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        szb szbVar = ix8Var.a;
        szb szbVar2 = ix8Var.f;
        szb szbVar3 = ix8Var.b;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        jk9 jk9Var = (jk9) ix8Var.g.a(xzbVar);
        szb szbVar4 = ix8Var.e;
        if (szbVar4 == null && szbVar3 == null) {
            view.setPadding(e0(((Number) ix8Var.c.a(xzbVar)).longValue(), jk9Var, displayMetrics), e0(((Number) szbVar2.a(xzbVar)).longValue(), jk9Var, displayMetrics), e0(((Number) ix8Var.d.a(xzbVar)).longValue(), jk9Var, displayMetrics), e0(((Number) szbVar.a(xzbVar)).longValue(), jk9Var, displayMetrics));
        } else {
            view.setPaddingRelative(szbVar4 != null ? e0(((Number) szbVar4.a(xzbVar)).longValue(), jk9Var, displayMetrics) : 0, e0(((Number) szbVar2.a(xzbVar)).longValue(), jk9Var, displayMetrics), szbVar3 != null ? e0(((Number) szbVar3.a(xzbVar)).longValue(), jk9Var, displayMetrics) : 0, e0(((Number) szbVar.a(xzbVar)).longValue(), jk9Var, displayMetrics));
        }
    }

    public static final int m0(Long l2, DisplayMetrics displayMetrics, jk9 jk9Var) {
        Integer num;
        if (l2 != null) {
            long longValue = l2.longValue();
            long j2 = longValue >> 31;
            num = Integer.valueOf((j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            num = null;
        }
        return eeh.b(n0(num, displayMetrics, jk9Var));
    }

    public static final void n(dp8 dp8Var, xzb xzbVar, View view) {
        Unit unit;
        szb szbVar;
        qv9 f2 = dp8Var.f();
        if (f2 == null || (szbVar = f2.c) == null) {
            unit = null;
        } else {
            view.setRotation((float) ((Number) szbVar.a(xzbVar)).doubleValue());
            unit = Unit.a;
        }
        if (unit == null) {
            view.setRotation(0.0f);
        } else if (view.getWidth() == 0 && view.getHeight() == 0) {
            srj.c(view, new t5(2, view, view, f2, xzbVar, false));
        } else {
            view.setPivotX(vq2.G(view, view.getWidth(), f2.a, xzbVar));
            view.setPivotY(vq2.G(view, view.getHeight(), f2.b, xzbVar));
        }
    }

    public static final float n0(Number number, DisplayMetrics displayMetrics, jk9 jk9Var) {
        int ordinal = jk9Var.ordinal();
        int i2 = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = 2;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return 0.0f;
                }
                i2 = 0;
            }
        }
        return TypedValue.applyDimension(i2, number != null ? number.floatValue() : 0.0f, displayMetrics);
    }

    public static final fcc o(i10 i10Var) {
        String str;
        int ordinal = i10Var.ordinal();
        int i2 = 3;
        if (ordinal == 0) {
            str = "release_date";
        } else if (ordinal == 1) {
            str = "artist";
        } else if (ordinal == 2) {
            str = "title";
        } else {
            if (ordinal != 3) {
                b6e.s();
                return null;
            }
            str = PListParser.TAG_DATE;
        }
        int ordinal2 = i10Var.ordinal();
        if (ordinal2 == 0) {
            i2 = 4;
        } else if (ordinal2 == 1) {
            i2 = 2;
        } else if (ordinal2 != 2) {
            if (ordinal2 != 3) {
                b6e.s();
                return null;
            }
            i2 = 1;
        }
        return new fcc("sort", str, i2);
    }

    public static final Object o0(Object obj) {
        if (!(obj instanceof Uri)) {
            return obj;
        }
        String obj2 = obj.toString();
        obj2.getClass();
        return new lpt(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(View view, do8 do8Var, do8 do8Var2, xzb xzbVar) {
        szb szbVar;
        szb szbVar2;
        if (view instanceof sq1) {
            ja8 ja8Var = null;
            if (xp3.B(do8Var != null ? do8Var.a : null, do8Var2 != null ? do8Var2.a : null)) {
                return;
            }
            sq1 sq1Var = (sq1) view;
            Double d2 = (do8Var == null || (szbVar2 = do8Var.a) == null) ? null : (Double) szbVar2.a(xzbVar);
            sq1Var.setAspectRatio(d2 != null ? (float) d2.doubleValue() : 0.0f);
            if (xp3.V(do8Var != null ? do8Var.a : null) || !(view instanceof a0c)) {
                return;
            }
            a0c a0cVar = (a0c) view;
            if (do8Var != null && (szbVar = do8Var.a) != null) {
                ja8Var = szbVar.c(xzbVar, new tq2(view));
            }
            a0cVar.i(ja8Var);
        }
    }

    public static Context p0(Context context, AttributeSet attributeSet, int i2, int i3) {
        return q0(context, attributeSet, i2, i3, new int[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(ViewGroup viewGroup, szb szbVar, szb szbVar2, xzb xzbVar) {
        if (xp3.B(szbVar, szbVar2)) {
            return;
        }
        vq2.r(viewGroup, ((Boolean) szbVar.a(xzbVar)).booleanValue());
        if (szbVar instanceof ozb) {
            return;
        }
        f29 f29Var = viewGroup instanceof f29 ? (f29) viewGroup : null;
        if (f29Var != null) {
            f29Var.i(szbVar.c(xzbVar, new m40(7, viewGroup)));
        }
    }

    public static Context q0(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof uf6) && ((uf6) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        uf6 uf6Var = new uf6(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = obtainStyledAttributes2.getResourceId(i5, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                uf6Var.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, j);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            uf6Var.getTheme().applyStyle(resourceId, true);
        }
        return uf6Var;
    }

    public static final void r(pr8 pr8Var, xzb xzbVar, Function1 function1) {
        xzb Q;
        pr8Var.a.c(xzbVar, function1);
        JSONArray jSONArray = (JSONArray) pr8Var.a.a(xzbVar);
        int length = jSONArray.length();
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                Object obj = jSONArray.get(i2);
                if (obj != null && (Q = qwp.Q(pr8Var, obj, i2, xzbVar)) != null) {
                    xzbVar = Q;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        Iterator it = pr8Var.c.iterator();
        while (it.hasNext()) {
            ((or8) it.next()).c.c(xzbVar, function1);
        }
    }

    public static final boolean r0(kq1 kq1Var) {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = kq1Var.getLayoutParams();
        return layoutParams != null && ((i2 = layoutParams.width) == -2 || i2 == -3) && ((i3 = layoutParams.height) == -2 || i3 == -3);
    }

    public static final void s(View view, one oneVar) {
        View view2;
        if (view.isFocused() || !view.isInTouchMode()) {
            return;
        }
        oneVar.getClass();
        WeakReference weakReference = one.d;
        if (weakReference == null || (view2 = (View) weakReference.get()) == null) {
            return;
        }
        view2.clearFocus();
        wdp.X(view2);
    }

    public static final boolean t(ynn ynnVar, float f2, float f3) {
        float f4 = ynnVar.a;
        if (f2 > ynnVar.c || f4 > f2) {
            return false;
        }
        return f3 <= ynnVar.d && ynnVar.b <= f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final s30 u(View view, e23 e23Var, sm8 sm8Var, h19 h19Var) {
        qtf qtfVar;
        GestureDetector gestureDetector;
        if (sm8Var != null) {
            xzb xzbVar = e23Var.b;
            Animation c2 = cwt.c(sm8Var, xzbVar, false, view);
            Animation c3 = cwt.c(sm8Var, xzbVar, true, null);
            if (c2 != null || c3 != null) {
                qtfVar = new qtf(14, c2, c3);
                if (h19Var != null) {
                    if (((h19Var.b == null && h19Var.c == null) ? null : h19Var) != null) {
                        gestureDetector = new GestureDetector(e23Var.a.getContext$div_release(), h19Var, new Handler(Looper.getMainLooper()));
                        if (qtfVar == null || gestureDetector != null) {
                            return new s30(7, qtfVar, gestureDetector);
                        }
                        return null;
                    }
                }
                gestureDetector = null;
                if (qtfVar == null) {
                }
                return new s30(7, qtfVar, gestureDetector);
            }
        }
        qtfVar = null;
        if (h19Var != null) {
        }
        gestureDetector = null;
        if (qtfVar == null) {
        }
        return new s30(7, qtfVar, gestureDetector);
    }

    public static final tnc v(ueo ueoVar, boolean z, String[] strArr, Function1 function1) {
        return new tnc(zsd.C(ueoVar.i().a((String[]) Arrays.copyOf(strArr, strArr.length)), -1), ueoVar, z, function1);
    }

    public static final int w(Long l2, DisplayMetrics displayMetrics) {
        Integer num;
        if (l2 != null) {
            long longValue = l2.longValue();
            long j2 = longValue >> 31;
            num = Integer.valueOf((j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            num = null;
        }
        return x(num, displayMetrics);
    }

    public static final int x(Number number, DisplayMetrics displayMetrics) {
        return eeh.b(y(number, displayMetrics));
    }

    public static final float y(Number number, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, number != null ? number.floatValue() : 0.0f, displayMetrics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(View view, Canvas canvas) {
        tp8 divBorderDrawer;
        int save = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            yp8 yp8Var = view instanceof yp8 ? (yp8) view : null;
            if (yp8Var != null && (divBorderDrawer = yp8Var.getDivBorderDrawer()) != null) {
                divBorderDrawer.e(canvas);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public abstract void Q(sgr sgrVar, s2i s2iVar);

    public abstract void S(Object obj);

    public abstract void T();

    public void R(s2i s2iVar) {
    }
}
