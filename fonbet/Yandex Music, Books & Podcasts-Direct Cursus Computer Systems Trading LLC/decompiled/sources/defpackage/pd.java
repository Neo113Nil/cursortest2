package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.a;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.y;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.material.appbar.MaterialToolbar;
import com.yandex.music.widget.WidgetActionCallback;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public abstract class pd {
    public static final fz2 a = new fz2(-1.0f);
    public static final fz2 b = new fz2(1.0f);
    public static final wn5 c = new wn5(new h3(29), 1748189461, false);
    public static final wn5 d = new wn5(new jo5(25), -1238375190, false);
    public static final wn5 e = new wn5(new jo5(26), 1435048939, false);
    public static final wn5 f = new wn5(new wo5(18), 1107622841, false);
    public static final wn5 g = new wn5(new wo5(19), 381212226, false);
    public static final fv2 h = new fv2();
    public static final ltf[] i = new ltf[0];
    public static final t1n j = new t1n(10);
    public static nxv k;

    public static Intent A(Context context, int i2, mg mgVar) {
        Intent putExtra = new Intent(context, (Class<?>) ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", WidgetActionCallback.class.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i2);
        Map unmodifiableMap = Collections.unmodifiableMap(((moi) mgVar).a);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            kg kgVar = (kg) entry.getKey();
            arrayList.add(new Pair(kgVar.a, entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        putExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", cxb.K((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return putExtra;
    }

    public static final Animation B(sm8 sm8Var, hu9 hu9Var, xzb xzbVar, View view, boolean z) {
        Animation Z;
        if (sm8Var != null && (Z = Z(sm8Var, hu9Var, xzbVar, view, z)) != null) {
            return Z;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(z(z));
        animationSet.addAnimation(C(view, hu9Var, z, null));
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new hya());
        return animationSet;
    }

    public static final TranslateAnimation C(View view, hu9 hu9Var, boolean z, Float f2) {
        float G;
        float G2;
        float G3;
        float G4;
        float K = K(hu9Var);
        float L = L(hu9Var);
        if (z) {
            if (f2 != null) {
                G3 = view.getWidth() * f2.floatValue();
            } else {
                G3 = G(view);
            }
            float f3 = K * G3;
            if (f2 != null) {
                G4 = view.getHeight() * f2.floatValue();
            } else {
                G4 = G(view);
            }
            return new TranslateAnimation(f3, 0.0f, L * G4, 0.0f);
        }
        if (f2 != null) {
            G = view.getWidth() * f2.floatValue();
        } else {
            G = G(view);
        }
        float f4 = K * G;
        if (f2 != null) {
            G2 = view.getHeight() * f2.floatValue();
        } else {
            G2 = G(view);
        }
        return new TranslateAnimation(0.0f, f4, 0.0f, L * G2);
    }

    public static final TransitionSet D(iu9 iu9Var, xzb xzbVar) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new c9t((hu9) iu9Var.k.a(xzbVar), null)).setInterpolator((TimeInterpolator) new hya());
    }

    public static int E(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (tpe.a[roundingMode.ordinal()]) {
            case 1:
                ixf.s(i5 == 0);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i5);
                int abs2 = abs - (Math.abs(i3) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (abs2 <= 0) {
                    return i4;
                }
                break;
            default:
                wvs.b();
                return 0;
        }
        return i4 + i6;
    }

    public static ActionMenuView F(Toolbar toolbar) {
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static final float G(View view) {
        return bg3.y(10, view.getResources().getDisplayMetrics());
    }

    public static ImageButton H(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList I(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static void J(int i2, aa6 aa6Var, awm awmVar, boolean z) {
        o86 o86Var;
        o86 o86Var2;
        boolean z2;
        o86 o86Var3;
        o86 o86Var4;
        if (aa6Var.m) {
            return;
        }
        if (!(aa6Var instanceof ba6) && aa6Var.A() && w(aa6Var)) {
            ba6.W(aa6Var, awmVar, new fv2());
        }
        o86 j2 = aa6Var.j(2);
        o86 j3 = aa6Var.j(4);
        int d2 = j2.d();
        int d3 = j3.d();
        HashSet hashSet = j2.a;
        z96 z96Var = z96.c;
        if (hashSet != null && j2.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                o86 o86Var5 = (o86) it.next();
                aa6 aa6Var2 = o86Var5.d;
                int i3 = i2 + 1;
                boolean w = w(aa6Var2);
                o86 o86Var6 = aa6Var2.J;
                o86 o86Var7 = aa6Var2.L;
                if (aa6Var2.A() && w) {
                    z2 = true;
                    ba6.W(aa6Var2, awmVar, new fv2());
                } else {
                    z2 = true;
                }
                boolean z3 = ((o86Var5 == o86Var6 && (o86Var4 = o86Var7.f) != null && o86Var4.c) || (o86Var5 == o86Var7 && (o86Var3 = o86Var6.f) != null && o86Var3.c)) ? z2 : false;
                z96 z96Var2 = aa6Var2.U[0];
                if (z96Var2 != z96Var || w) {
                    if (!aa6Var2.A()) {
                        if (o86Var5 == o86Var6 && o86Var7.f == null) {
                            int e2 = o86Var6.e() + d2;
                            aa6Var2.K(e2, aa6Var2.r() + e2);
                            J(i3, aa6Var2, awmVar, z);
                        } else if (o86Var5 == o86Var7 && o86Var6.f == null) {
                            int e3 = d2 - o86Var7.e();
                            aa6Var2.K(e3 - aa6Var2.r(), e3);
                            J(i3, aa6Var2, awmVar, z);
                        } else if (z3 && !aa6Var2.y()) {
                            V(i3, aa6Var2, awmVar, z);
                        }
                    }
                } else if (z96Var2 == z96Var && aa6Var2.v >= 0 && aa6Var2.u >= 0 && (aa6Var2.i0 == 8 || (aa6Var2.r == 0 && aa6Var2.Y == 0.0f))) {
                    if (!aa6Var2.y() && !aa6Var2.G && z3 && !aa6Var2.y()) {
                        W(i3, aa6Var, awmVar, aa6Var2, z);
                    }
                }
            }
        }
        if (aa6Var instanceof grd) {
            return;
        }
        HashSet hashSet2 = j3.a;
        if (hashSet2 != null && j3.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                o86 o86Var8 = (o86) it2.next();
                aa6 aa6Var3 = o86Var8.d;
                int i4 = i2 + 1;
                boolean w2 = w(aa6Var3);
                o86 o86Var9 = aa6Var3.J;
                o86 o86Var10 = aa6Var3.L;
                if (aa6Var3.A() && w2) {
                    ba6.W(aa6Var3, awmVar, new fv2());
                }
                boolean z4 = (o86Var8 == o86Var9 && (o86Var2 = o86Var10.f) != null && o86Var2.c) || (o86Var8 == o86Var10 && (o86Var = o86Var9.f) != null && o86Var.c);
                z96 z96Var3 = aa6Var3.U[0];
                if (z96Var3 != z96Var || w2) {
                    if (!aa6Var3.A()) {
                        if (o86Var8 == o86Var9 && o86Var10.f == null) {
                            int e4 = o86Var9.e() + d3;
                            aa6Var3.K(e4, aa6Var3.r() + e4);
                            J(i4, aa6Var3, awmVar, z);
                        } else if (o86Var8 == o86Var10 && o86Var9.f == null) {
                            int e5 = d3 - o86Var10.e();
                            aa6Var3.K(e5 - aa6Var3.r(), e5);
                            J(i4, aa6Var3, awmVar, z);
                        } else if (z4 && !aa6Var3.y()) {
                            V(i4, aa6Var3, awmVar, z);
                        }
                    }
                } else if (z96Var3 == z96Var && aa6Var3.v >= 0 && aa6Var3.u >= 0) {
                    if (aa6Var3.i0 == 8 || (aa6Var3.r == 0 && aa6Var3.Y == 0.0f)) {
                        if (!aa6Var3.y() && !aa6Var3.G && z4 && !aa6Var3.y()) {
                            W(i4, aa6Var, awmVar, aa6Var3, z);
                        }
                    }
                }
            }
        }
        aa6Var.m = true;
    }

    public static final float K(hu9 hu9Var) {
        switch (hu9Var.ordinal()) {
            case 0:
            case 1:
            case 7:
                return 1.0f;
            case 2:
            case 6:
                return 0.0f;
            case 3:
            case 4:
            case 5:
                return -1.0f;
            case 8:
                return 0.5f;
            default:
                b6e.s();
                return 0.0f;
        }
    }

    public static final float L(hu9 hu9Var) {
        switch (hu9Var.ordinal()) {
            case 0:
            case 4:
                return 0.0f;
            case 1:
            case 2:
            case 3:
                return 1.0f;
            case 5:
            case 6:
            case 7:
                return -1.0f;
            case 8:
                return 0.5f;
            default:
                b6e.s();
                return 0.0f;
        }
    }

    public static final boolean M() {
        l18 l18Var = l18.b;
        bdt I = hag.I(qy7.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((qy7) qdcVar.C(I)).a().b();
    }

    public static final boolean N(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1210394545);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            oq5Var.Z(-1681445403);
            boolean B = xv7.B(oq5Var);
            oq5Var.p(false);
            oq5Var.p(false);
            return B;
        }
        oq5Var.Z(-1683525007);
        oq5Var.p(false);
        boolean booleanValue = ((Boolean) szf.Q(O(), oq5Var).getValue()).booleanValue();
        oq5Var.p(false);
        return booleanValue;
    }

    public static final vdr O() {
        l18 l18Var = l18.b;
        bdt I = hag.I(qy7.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((qy7) qdcVar.C(I)).a().a();
    }

    public static int P(int i2) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 <= 0) {
            xq0.x(dfi.c(i2, "x (", ") must be > 0"));
            return 0;
        }
        switch (tpe.a[roundingMode.ordinal()]) {
            case 1:
                ixf.s((i2 > 0) & (((i2 + (-1)) & i2) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i2))) >>> 31);
            default:
                wvs.b();
                return 0;
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static int Q(int i2) {
        int i3 = i2 % SQLiteDatabase.OPEN_FULLMUTEX;
        return i3 >= 0 ? i3 : i3 + SQLiteDatabase.OPEN_FULLMUTEX;
    }

    public static final Integer R(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(S(str));
        } catch (IllegalArgumentException | Exception unused) {
            return null;
        }
    }

    public static final int S(String str) {
        str.getClass();
        try {
            long parseLong = Long.parseLong(str.substring(1), CharsKt.checkRadix(16));
            if (str.length() == 7) {
                parseLong |= 4278190080L;
            } else if (str.length() == 9) {
                xq0.x("Invalid color");
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Invalid color", e2);
        }
    }

    public static final d85 T(String str) {
        Integer b0;
        if (str == null || (b0 = y2x.b0(str)) == null) {
            return null;
        }
        return new d85(c3x.f(b0.intValue()));
    }

    public static void U(List list, Function1 function1, ao1 ao1Var, y yVar, pu0 pu0Var) {
        list.getClass();
        yVar.getClass();
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Intrinsics.d(((u51) it.next()).a, CommonUrlParts.Values.FALSE_INTEGER)) {
                    dfi.r("Unknown artist was found.", "ARTIST_LIST_DIALOG");
                    break;
                }
            }
        }
        cvo cvoVar = cvo.i;
        fxf.Q(yVar, o6m.b(wjb.ArtistListScreen, null, 6), null, null, pu0Var, null, new wn5(new fb1(1, ao1Var, list, function1), 760203931, true), 22);
    }

    public static void V(int i2, aa6 aa6Var, awm awmVar, boolean z) {
        float f2 = aa6Var.f0;
        o86 o86Var = aa6Var.J;
        int d2 = o86Var.f.d();
        o86 o86Var2 = aa6Var.L;
        int d3 = o86Var2.f.d();
        int e2 = o86Var.e() + d2;
        int e3 = d3 - o86Var2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int r = aa6Var.r();
        int i3 = (d3 - d2) - r;
        if (d2 > d3) {
            i3 = (d2 - d3) - r;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + d2;
        int i5 = i4 + r;
        if (d2 > d3) {
            i5 = i4 - r;
        }
        aa6Var.K(i4, i5);
        J(i2 + 1, aa6Var, awmVar, z);
    }

    public static void W(int i2, aa6 aa6Var, awm awmVar, aa6 aa6Var2, boolean z) {
        float f2 = aa6Var2.f0;
        o86 o86Var = aa6Var2.J;
        int e2 = o86Var.e() + o86Var.f.d();
        o86 o86Var2 = aa6Var2.L;
        int d2 = o86Var2.f.d() - o86Var2.e();
        if (d2 >= e2) {
            int r = aa6Var2.r();
            if (aa6Var2.i0 != 8) {
                int i3 = aa6Var2.r;
                if (i3 == 2) {
                    r = (int) (aa6Var2.f0 * 0.5f * (aa6Var instanceof ba6 ? aa6Var.r() : aa6Var.V.r()));
                } else if (i3 == 0) {
                    r = d2 - e2;
                }
                r = Math.max(aa6Var2.u, r);
                int i4 = aa6Var2.v;
                if (i4 > 0) {
                    r = Math.min(i4, r);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - r)) + 0.5f));
            aa6Var2.K(i5, r + i5);
            J(i2 + 1, aa6Var2, awmVar, z);
        }
    }

    public static void X(int i2, aa6 aa6Var, awm awmVar) {
        float f2 = aa6Var.g0;
        o86 o86Var = aa6Var.K;
        int d2 = o86Var.f.d();
        o86 o86Var2 = aa6Var.M;
        int d3 = o86Var2.f.d();
        int e2 = o86Var.e() + d2;
        int e3 = d3 - o86Var2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int l = aa6Var.l();
        int i3 = (d3 - d2) - l;
        if (d2 > d3) {
            i3 = (d2 - d3) - l;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = d2 + i4;
        int i6 = i5 + l;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - l;
        }
        aa6Var.L(i5, i6);
        d0(i2 + 1, aa6Var, awmVar);
    }

    public static void Y(int i2, aa6 aa6Var, awm awmVar, aa6 aa6Var2) {
        float f2 = aa6Var2.g0;
        o86 o86Var = aa6Var2.K;
        int e2 = o86Var.e() + o86Var.f.d();
        o86 o86Var2 = aa6Var2.M;
        int d2 = o86Var2.f.d() - o86Var2.e();
        if (d2 >= e2) {
            int l = aa6Var2.l();
            if (aa6Var2.i0 != 8) {
                int i3 = aa6Var2.s;
                if (i3 == 2) {
                    l = (int) (f2 * 0.5f * (aa6Var instanceof ba6 ? aa6Var.l() : aa6Var.V.l()));
                } else if (i3 == 0) {
                    l = d2 - e2;
                }
                l = Math.max(aa6Var2.x, l);
                int i4 = aa6Var2.y;
                if (i4 > 0) {
                    l = Math.min(i4, l);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - l)) + 0.5f));
            aa6Var2.L(i5, l + i5);
            d0(i2 + 1, aa6Var2, awmVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.animation.AlphaAnimation] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.animation.TranslateAnimation] */
    public static final Animation Z(sm8 sm8Var, hu9 hu9Var, xzb xzbVar, View view, boolean z) {
        ?? alphaAnimation;
        szb szbVar = sm8Var.e;
        szb szbVar2 = sm8Var.b;
        szb szbVar3 = sm8Var.h;
        int ordinal = ((rm8) szbVar.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            alphaAnimation = new AlphaAnimation(szbVar3 != null ? (float) ((Number) szbVar3.a(xzbVar)).doubleValue() : 1.0f, szbVar2 != null ? (float) ((Number) szbVar2.a(xzbVar)).doubleValue() : 0.0f);
        } else if (ordinal == 1) {
            if (z) {
                szbVar2 = szbVar3;
            }
            alphaAnimation = C(view, hu9Var, z, szbVar2 != null ? Float.valueOf((float) ((Number) szbVar2.a(xzbVar)).doubleValue()) : null);
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    alphaAnimation = new AnimationSet(false);
                    List list = sm8Var.d;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            alphaAnimation.addAnimation(Z((sm8) it.next(), hu9Var, xzbVar, view, z));
                        }
                    }
                } else if (ordinal != 5) {
                    b6e.s();
                    return null;
                }
            }
            alphaAnimation = 0;
        } else {
            float doubleValue = szbVar3 != null ? (float) ((Number) szbVar3.a(xzbVar)).doubleValue() : 0.0f;
            float doubleValue2 = szbVar2 != null ? (float) ((Number) szbVar2.a(xzbVar)).doubleValue() : 1.0f;
            alphaAnimation = new ScaleAnimation(doubleValue, doubleValue2, doubleValue, doubleValue2, 1, 0.5f, 1, 0.5f);
        }
        if (alphaAnimation == 0) {
            return null;
        }
        alphaAnimation.setDuration(((Number) sm8Var.a.a(xzbVar)).longValue());
        alphaAnimation.setInterpolator(vq1.Q((um8) sm8Var.c.a(xzbVar)));
        return alphaAnimation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v51 */
    public static final void a(sd3 sd3Var, Function0 function0, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        ?? r1;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1380428921);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var2.f(sd3Var) : oq5Var2.h(sd3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(function0) ? 32 : 16;
        }
        int i4 = i2 & 384;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i3 |= oq5Var2.f(vciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            hz2 hz2Var = b2c.l;
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new mz2(9);
                oq5Var2.k0(K);
            }
            yci e2 = a.e(xp3.u(nfp.b(vciVar, false, (Function1) K), o5g.D(oq5Var2)), false, null, null, function0, 7);
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var2.j(agrVar)).d.c;
            jzk jzkVar = vnj.i;
            yci o = androidx.compose.foundation.layout.a.o(d.g(a.b(e2, j2, jzkVar), 84, 0.0f, 2), 16, 0.0f, 2);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var2, 48);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, o);
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
            yci u = xp3.u(d.m(vciVar, 52), o5g.E(oq5Var2));
            if (((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                oq5Var2.Z(1138847952);
                u1g.l(oq5Var2, a.b(u, d85.l, jzkVar));
                oq5Var2.p(false);
                r1 = 0;
            } else {
                oq5Var2.Z(1138958064);
                String str = sd3Var.b;
                if (str == null) {
                    oq5Var2.Z(1138958063);
                    oq5Var2.p(false);
                    z = false;
                } else {
                    oq5Var2.Z(1138958064);
                    z = false;
                    ocg.e(str, new htq(etq.a), u, null, oq5Var2, 0, 8);
                    oq5Var2.p(false);
                }
                oq5Var2.p(z);
                r1 = z;
            }
            String str2 = sd3Var.c;
            ges j3 = nu0.j();
            long j4 = ((dq0) oq5Var2.j(agrVar)).b.a;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 12, 0.0f, 0.0f, 0.0f, 14);
            if (!(((double) 1.0f) > 0.0d ? true : r1)) {
                qme.a("invalid weight; must be greater than zero");
            }
            xv7.j(str2, vz1.g(1.0f, q, true), j4, 0L, 0L, 0, 0L, 2, false, 3, 0, null, j3, oq5Var2, 0, 3120, 55288);
            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_edge_24, r1, oq5Var2), null, d.m(vciVar, 24), ((dq0) oq5Var2.j(agrVar)).a.a, oq5Var2, 432, 0);
            oq5 oq5Var3 = oq5Var2;
            oq5Var3.p(true);
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(sd3Var, function0, i2);
        }
    }

    public static final Boolean a0(int i2) {
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if ((r17 & 2) != 0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(qzm[] qzmVarArr, boolean z, Function2 function2, hq5 hq5Var, int i2, int i3) {
        boolean z2;
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(390057115);
        int i4 = (i2 & 48) == 0 ? (((i3 & 2) == 0 && oq5Var.g(z)) ? 32 : 16) | i2 : i2;
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.h(function2) ? 256 : 128;
        }
        oq5Var.W(1182733389, Integer.valueOf(qzmVarArr.length));
        int i5 = i4 | (oq5Var.d(qzmVarArr.length) ? 4 : 0);
        for (Object[] objArr : qzmVarArr) {
            i5 |= (i2 & 8) == 0 ? oq5Var.f(objArr) : oq5Var.h(objArr) ? 4 : 0;
        }
        oq5Var.p(false);
        if ((i5 & 14) == 0) {
            i5 |= 2;
        }
        if (oq5Var.P(i5 & 1, (i5 & 147) != 146)) {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                if ((i3 & 2) != 0) {
                    z = N(oq5Var);
                    i5 &= -113;
                }
                boolean z3 = z;
                oq5Var.q();
                int i6 = i5 << 3;
                jf0.a((qzm[]) Arrays.copyOf(qzmVarArr, qzmVarArr.length), ((Boolean) oq5Var.j(koe.a)).booleanValue() ? new pu0(ydr.a(Boolean.valueOf(z3)), new gmr(1), imr.a, new j3(14)) : t(new qzm[0]), z3, function2, oq5Var, (i6 & 896) | 8 | (i6 & 7168), 0);
                z2 = z3;
            } else {
                oq5Var.S();
            }
        } else {
            oq5Var.S();
            z2 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qu((Serializable) qzmVarArr, z2, (Object) function2, i2, i3, 1);
        }
    }

    public static final p85 b0(long j2) {
        int U = c3x.U(j2);
        float[] fArr = new float[3];
        aa5.b((U >> 16) & KotlinVersion.MAX_COMPONENT_VALUE, (U >> 8) & KotlinVersion.MAX_COMPONENT_VALUE, U & KotlinVersion.MAX_COMPONENT_VALUE, fArr);
        return new p85(fArr[0], fArr[1], fArr[2], ((U >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
    }

    public static final void c(int i2, int i3, hq5 hq5Var, Function0 function0, boolean z) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i5 != 0) {
                z = true;
            }
            aqi o0 = szf.o0(function0, oq5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new ui2(z, o0);
                oq5Var.k0(K);
            }
            ui2 ui2Var = (ui2) K;
            boolean z2 = (i4 & 14) == 4;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new si2(ui2Var, z, 0);
                oq5Var.k0(K2);
            }
            gld.D((Function0) K2, oq5Var);
            rpj a2 = elg.a(oq5Var);
            if (a2 == null) {
                xq0.q("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            qpj onBackPressedDispatcher = a2.getOnBackPressedDispatcher();
            dzf dzfVar = (dzf) oq5Var.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h2 = oq5Var.h(onBackPressedDispatcher) | oq5Var.h(dzfVar);
            Object K3 = oq5Var.K();
            if (h2 || K3 == kjnVar) {
                K3 = new lj0(2, onBackPressedDispatcher, dzfVar, ui2Var);
                oq5Var.k0(K3);
            }
            gld.j(dzfVar, onBackPressedDispatcher, (Function1) K3, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ti2(i2, i3, function0, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Transition] */
    /* JADX WARN: Type inference failed for: r0v6, types: [c9t] */
    /* JADX WARN: Type inference failed for: r0v7, types: [oso] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.TransitionSet] */
    public static final Transition c0(sm8 sm8Var, hu9 hu9Var, boolean z, xzb xzbVar) {
        ?? fade;
        Transition duration;
        szb szbVar = sm8Var.e;
        szb szbVar2 = sm8Var.b;
        szb szbVar3 = sm8Var.h;
        int ordinal = ((rm8) szbVar.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            fade = new Fade();
        } else if (ordinal == 1) {
            if (z) {
                szbVar2 = szbVar3;
            }
            fade = new c9t(hu9Var, szbVar2 != null ? Float.valueOf((float) ((Number) szbVar2.a(xzbVar)).doubleValue()) : null);
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    fade = new TransitionSet();
                    List list = sm8Var.d;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            fade.addTransition(c0((sm8) it.next(), hu9Var, z, xzbVar));
                        }
                    }
                } else if (ordinal != 5) {
                    b6e.s();
                    return null;
                }
            }
            fade = 0;
        } else {
            if (z) {
                szbVar2 = szbVar3;
            }
            fade = new oso(szbVar2 != null ? (float) ((Number) szbVar2.a(xzbVar)).doubleValue() : 1.0f);
        }
        if (fade == 0 || (duration = fade.setDuration(((Number) sm8Var.a.a(xzbVar)).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(vq1.Q((um8) sm8Var.c.a(xzbVar)));
    }

    public static final void d(zd3 zd3Var, nb6 nb6Var, hvq hvqVar, int i2, zsq zsqVar, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        zd3Var.getClass();
        hvqVar.getClass();
        zsqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1370187780);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? oq5Var.f(zd3Var) : oq5Var.h(zd3Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? oq5Var.f(nb6Var) : oq5Var.h(nb6Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.d(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= (32768 & i3) == 0 ? oq5Var.f(zsqVar) : oq5Var.h(zsqVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            i4 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i5 = i4;
        if ((74899 & i5) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            f(yciVar, ild.C(-684890139, new uu(zd3Var, nb6Var, hvqVar, i2, zsqVar), oq5Var), oq5Var, ((i5 >> 15) & 14) | 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cj(zd3Var, nb6Var, hvqVar, i2, zsqVar, yciVar, i3, 2);
        }
    }

    public static void d0(int i2, aa6 aa6Var, awm awmVar) {
        boolean z;
        o86 o86Var;
        o86 o86Var2;
        o86 o86Var3;
        o86 o86Var4;
        if (aa6Var.n) {
            return;
        }
        if (!(aa6Var instanceof ba6) && aa6Var.A() && w(aa6Var)) {
            ba6.W(aa6Var, awmVar, new fv2());
        }
        o86 j2 = aa6Var.j(3);
        o86 j3 = aa6Var.j(5);
        int d2 = j2.d();
        int d3 = j3.d();
        HashSet hashSet = j2.a;
        z96 z96Var = z96.c;
        if (hashSet != null && j2.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                o86 o86Var5 = (o86) it.next();
                aa6 aa6Var2 = o86Var5.d;
                int i3 = i2 + 1;
                boolean w = w(aa6Var2);
                o86 o86Var6 = aa6Var2.K;
                o86 o86Var7 = aa6Var2.M;
                if (aa6Var2.A() && w) {
                    ba6.W(aa6Var2, awmVar, new fv2());
                }
                boolean z2 = (o86Var5 == o86Var6 && (o86Var4 = o86Var7.f) != null && o86Var4.c) || (o86Var5 == o86Var7 && (o86Var3 = o86Var6.f) != null && o86Var3.c);
                z96 z96Var2 = aa6Var2.U[1];
                if (z96Var2 != z96Var || w) {
                    if (!aa6Var2.A()) {
                        if (o86Var5 == o86Var6 && o86Var7.f == null) {
                            int e2 = o86Var6.e() + d2;
                            aa6Var2.L(e2, aa6Var2.l() + e2);
                            d0(i3, aa6Var2, awmVar);
                        } else if (o86Var5 == o86Var7 && o86Var6.f == null) {
                            int e3 = d2 - o86Var7.e();
                            aa6Var2.L(e3 - aa6Var2.l(), e3);
                            d0(i3, aa6Var2, awmVar);
                        } else if (z2 && !aa6Var2.z()) {
                            X(i3, aa6Var2, awmVar);
                        }
                    }
                } else if (z96Var2 == z96Var && aa6Var2.y >= 0 && aa6Var2.x >= 0 && (aa6Var2.i0 == 8 || (aa6Var2.s == 0 && aa6Var2.Y == 0.0f))) {
                    if (!aa6Var2.z() && !aa6Var2.G && z2 && !aa6Var2.z()) {
                        Y(i3, aa6Var, awmVar, aa6Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (aa6Var instanceof grd) {
            return;
        }
        HashSet hashSet2 = j3.a;
        if (hashSet2 != null && j3.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                o86 o86Var8 = (o86) it2.next();
                aa6 aa6Var3 = o86Var8.d;
                int i4 = i2 + 1;
                boolean w2 = w(aa6Var3);
                o86 o86Var9 = aa6Var3.K;
                o86 o86Var10 = aa6Var3.M;
                if (aa6Var3.A() && w2) {
                    ba6.W(aa6Var3, awmVar, new fv2());
                }
                boolean z4 = (o86Var8 == o86Var9 && (o86Var2 = o86Var10.f) != null && o86Var2.c) || (o86Var8 == o86Var10 && (o86Var = o86Var9.f) != null && o86Var.c);
                z96 z96Var3 = aa6Var3.U[1];
                if (z96Var3 != z96Var || w2) {
                    if (!aa6Var3.A()) {
                        if (o86Var8 == o86Var9 && o86Var10.f == null) {
                            int e4 = o86Var9.e() + d3;
                            aa6Var3.L(e4, aa6Var3.l() + e4);
                            d0(i4, aa6Var3, awmVar);
                        } else if (o86Var8 == o86Var10 && o86Var9.f == null) {
                            int e5 = d3 - o86Var10.e();
                            aa6Var3.L(e5 - aa6Var3.l(), e5);
                            d0(i4, aa6Var3, awmVar);
                        } else if (z4 && !aa6Var3.z()) {
                            X(i4, aa6Var3, awmVar);
                        }
                    }
                } else if (z96Var3 == z96Var && aa6Var3.y >= 0 && aa6Var3.x >= 0 && (aa6Var3.i0 == 8 || (aa6Var3.s == 0 && aa6Var3.Y == 0.0f))) {
                    if (!aa6Var3.z() && !aa6Var3.G && z4 && !aa6Var3.z()) {
                        Y(i4, aa6Var, awmVar, aa6Var3);
                    }
                }
            }
        }
        o86 j4 = aa6Var.j(6);
        if (j4.a != null && j4.c) {
            int d4 = j4.d();
            Iterator it3 = j4.a.iterator();
            while (it3.hasNext()) {
                o86 o86Var11 = (o86) it3.next();
                aa6 aa6Var4 = o86Var11.d;
                int i5 = i2 + 1;
                boolean w3 = w(aa6Var4);
                o86 o86Var12 = aa6Var4.N;
                if (aa6Var4.A() && w3) {
                    ba6.W(aa6Var4, awmVar, new fv2());
                }
                if (aa6Var4.U[z3 ? 1 : 0] != z96Var || w3) {
                    if (!aa6Var4.A()) {
                        if (o86Var11 == o86Var12) {
                            int e6 = o86Var11.e() + d4;
                            if (aa6Var4.E) {
                                int i6 = e6 - aa6Var4.c0;
                                int i7 = aa6Var4.X + i6;
                                aa6Var4.b0 = i6;
                                aa6Var4.K.l(i6);
                                aa6Var4.M.l(i7);
                                o86Var12.l(e6);
                                z = z3 ? 1 : 0;
                                aa6Var4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            d0(i5, aa6Var4, awmVar);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        aa6Var.n = z3;
    }

    public static final void e(final zd3 zd3Var, nb6 nb6Var, final hvq hvqVar, int i2, final zsq zsqVar, yci yciVar, hq5 hq5Var, int i3) {
        vci vciVar;
        int i4;
        yci yciVar2;
        Object h00Var;
        wd3 wd3Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(394382521);
        int i5 = i3 | (oq5Var.f(zd3Var) ? 4 : 2) | (oq5Var.f(nb6Var) ? 32 : 16) | (oq5Var.h(hvqVar) ? 256 : 128) | (oq5Var.d(i2) ? 2048 : 1024) | (oq5Var.f(zsqVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if ((74899 & i5) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            i4 = i2;
        } else {
            boolean z = zd3Var instanceof wd3;
            kjn kjnVar = gq5.a;
            vci vciVar2 = vci.a;
            if (z) {
                oq5Var.Z(-1980508314);
                if (hvqVar.z()) {
                    oq5Var.Z(-1980454808);
                    wd3 wd3Var2 = (wd3) zd3Var;
                    boolean h2 = ((i5 & 112) == 32) | oq5Var.h(hvqVar) | ((i5 & 7168) == 2048) | ((i5 & 57344) == 16384);
                    Object K = oq5Var.K();
                    if (h2 || K == kjnVar) {
                        wd3Var = wd3Var2;
                        h00Var = new h00(nb6Var, hvqVar, i2, zsqVar, 3);
                        oq5Var.k0(h00Var);
                    } else {
                        wd3Var = wd3Var2;
                        h00Var = K;
                    }
                    r(wd3Var, (Function0) h00Var, oq5Var, (i5 & 14) | 384);
                } else {
                    oq5Var.Z(-1984873207);
                }
                oq5Var.p(false);
                oq5Var.p(false);
            } else if (zd3Var instanceof sd3) {
                oq5Var.Z(1044514320);
                sd3 sd3Var = (sd3) zd3Var;
                int i6 = i5 & 14;
                boolean h3 = (i6 == 4) | oq5Var.h(hvqVar) | ((i5 & 57344) == 16384);
                Object K2 = oq5Var.K();
                if (h3 || K2 == kjnVar) {
                    final int i7 = 0;
                    K2 = new Function0() { // from class: be3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    sd3 sd3Var2 = (sd3) zd3Var;
                                    String str = sd3Var2.d;
                                    hvq hvqVar2 = hvqVar;
                                    hvqVar2.u(str);
                                    hvqVar2.n(sd3Var2.d, zsqVar);
                                    break;
                                default:
                                    xd3 xd3Var = (xd3) zd3Var;
                                    String str2 = xd3Var.e;
                                    hvq hvqVar3 = hvqVar;
                                    hvqVar3.u(str2);
                                    hvqVar3.j(xd3Var.e, zsqVar);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K2);
                }
                a(sd3Var, (Function0) K2, oq5Var, i6 | 384);
                oq5Var.p(false);
            } else {
                if (zd3Var instanceof yd3) {
                    oq5Var.Z(-1979364662);
                    yd3 yd3Var = (yd3) zd3Var;
                    StationId f2 = StationId.f(yd3Var.d);
                    f2.getClass();
                    List list = yd3Var.i;
                    kxi d2 = hvqVar.d();
                    boolean h4 = oq5Var.h(hvqVar) | ((i5 & 14) == 4);
                    Object K3 = oq5Var.K();
                    if (h4 || K3 == kjnVar) {
                        K3 = new ap1(11, hvqVar, zd3Var);
                        oq5Var.k0(K3);
                    }
                    owu Y = wyf.Y(f2, list, d2, (Function0) K3, hvqVar.h(), hvqVar.g(), hvqVar.i(), null, null, null, oq5Var, 6, 0, 896);
                    String str = yd3Var.b;
                    String str2 = yd3Var.c;
                    String str3 = yd3Var.e;
                    d85 d85Var = yd3Var.g;
                    e9q.a(new lnu(str, str2, d85Var != null ? d85Var.a : d85.n, new amu(neg.I(yd3Var.f), null, null), str3, nmu.b, yd3Var.h, null, 128), Y, vciVar2, 0.0f, oq5Var, 384, 8);
                    vciVar = vciVar2;
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                } else {
                    vciVar = vciVar2;
                    if (zd3Var instanceof xd3) {
                        oq5Var.Z(-1977807284);
                        xd3 xd3Var = (xd3) zd3Var;
                        String str4 = xd3Var.b;
                        long j2 = xd3Var.c;
                        long j3 = xd3Var.d;
                        boolean h5 = ((i5 & 14) == 4) | oq5Var.h(hvqVar) | ((i5 & 57344) == 16384);
                        Object K4 = oq5Var.K();
                        if (h5 || K4 == kjnVar) {
                            final int i8 = 1;
                            K4 = new Function0() { // from class: be3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i8) {
                                        case 0:
                                            sd3 sd3Var2 = (sd3) zd3Var;
                                            String str5 = sd3Var2.d;
                                            hvq hvqVar2 = hvqVar;
                                            hvqVar2.u(str5);
                                            hvqVar2.n(sd3Var2.d, zsqVar);
                                            break;
                                        default:
                                            xd3 xd3Var2 = (xd3) zd3Var;
                                            String str22 = xd3Var2.e;
                                            hvq hvqVar3 = hvqVar;
                                            hvqVar3.u(str22);
                                            hvqVar3.j(xd3Var2.e, zsqVar);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var.k0(K4);
                        }
                        wxf.e(str4, j2, j3, (Function0) K4, null, oq5Var, 0, 16);
                        oq5Var.p(false);
                    } else {
                        if (!(zd3Var instanceof td3)) {
                            throw vz1.i(oq5Var, 1044492223, false);
                        }
                        oq5Var.Z(-1977304495);
                        boolean f3 = ((i5 & 14) == 4) | oq5Var.f(hvqVar) | ((i5 & 7168) == 2048);
                        Object K5 = oq5Var.K();
                        if (f3 || K5 == kjnVar) {
                            i4 = i2;
                            K5 = hvqVar.o((td3) zd3Var, i4);
                            oq5Var.k0(K5);
                        } else {
                            i4 = i2;
                        }
                        rzf.d((td3) zd3Var, (zuq) K5, hvqVar, zsqVar, vciVar, oq5Var, ((i5 >> 3) & 7168) | (i5 & 910) | 24576);
                        oq5Var.p(false);
                        yciVar2 = vciVar;
                    }
                }
                i4 = i2;
                yciVar2 = vciVar;
            }
            i4 = i2;
            vciVar = vciVar2;
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(zd3Var, nb6Var, hvqVar, i4, zsqVar, yciVar2, i3);
        }
    }

    public static final eno e0(pjc pjcVar, pjc pjcVar2, pyc pycVar) {
        pjcVar2.getClass();
        return new eno(new d57(pjcVar, pjcVar2, pycVar, (Continuation) null));
    }

    public static final void f(yci yciVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-516033969);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci o = androidx.compose.foundation.layout.a.o(yciVar, li6.c.a + 8, 0.0f, 2);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l((i3 >> 3) & 14, wn5Var, oq5Var, true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ce3(yciVar, wn5Var, i2, 0);
        }
    }

    public static final void g(int i2, int i3, hq5 hq5Var, yci yciVar) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1812985776);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            yci yciVar2 = yciVar;
            vum.b(yciVar2, ((dq0) oq5Var.j(eq0.a)).a.a, 0.0f, 0L, 0, oq5Var, i4 & 14, 28);
            yciVar = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rl4(yciVar, i2, i3, 0);
        }
    }

    public static final void h(String str, Function0 function0, String str2, String str3, List list, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        boolean z;
        List list2 = list;
        str.getClass();
        function0.getClass();
        list2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(366630476);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(str3) ? 2048 : 1024;
        }
        int i4 = i3 | (oq5Var.h(list2) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if (oq5Var.P(i4 & 1, (i4 & 74899) != 74898)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String o = vz1.o(vciVar, 32, oq5Var, R.string.address, oq5Var);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var.j(agrVar)).b.a;
            yci d2 = d.d(vciVar, 1.0f);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new uo5(29);
                oq5Var.k0(K);
            }
            xcs.b(o, nfp.b(d2, false, (Function1) K), j2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c2, oq5Var, 0, 0, 65016);
            oq5Var = oq5Var;
            float f2 = 16;
            u1g.l(oq5Var, d.e(vciVar, f2));
            i(str, function0, oq5Var, i4 & 126);
            if (str2 == null || str3 == null) {
                yciVar2 = vciVar;
                z = false;
                oq5Var.Z(-487407924);
            } else {
                oq5Var.Z(-484778163);
                u1g.l(oq5Var, d.e(vciVar, f2));
                xcs.b(str2, androidx.compose.foundation.layout.a.o(vciVar, f2, 0.0f, 2), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, ((i4 >> 6) & 14) | 48, 0, 65528);
                yciVar2 = vciVar;
                xcs.b(str3, androidx.compose.foundation.layout.a.o(yciVar2, f2, 0.0f, 2), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, ((i4 >> 9) & 14) | 48, 0, 65528);
                oq5Var = oq5Var;
                z = false;
            }
            oq5Var.p(z);
            if (list.isEmpty()) {
                list2 = list;
                oq5Var.Z(-487407924);
            } else {
                oq5Var.Z(-484210584);
                u1g.l(oq5Var, d.e(yciVar2, 8));
                list2 = list;
                j(list2, oq5Var, (i4 >> 12) & 14);
            }
            oq5Var.p(z);
            oq5Var.p(true);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(str, function0, str2, str3, list2, yciVar2, i2, 4);
        }
    }

    public static final void i(String str, Function0 function0, hq5 hq5Var, int i2) {
        int i3;
        String str2;
        oq5 oq5Var;
        Function0 function02 = function0;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1818732739);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(function02) ? 32 : 16;
        }
        int i4 = i3;
        if (oq5Var2.P(i4 & 1, (i4 & 19) != 18)) {
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            p1g.a(str, rvf.M(R.string.open_map, oq5Var2), a.e(androidx.compose.foundation.layout.a.d(d.d(vciVar, 1.0f), 2.0f), false, null, null, function02, 7), null, null, null, hd6.a, 0.0f, null, 0, oq5Var2, (i4 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 952);
            str2 = str;
            oq5Var = oq5Var2;
            float f2 = 8;
            yci a2 = b.a.a(androidx.compose.foundation.layout.a.m(vciVar, f2), b2c.j);
            kfh d3 = ug3.d(iz2Var, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            tgo tgoVar = ugo.a;
            aae.a(function0, xp3.u(a.b(y1g.d0(vciVar, f2, tgoVar, false, 28), d85.f, vnj.i), tgoVar), false, lg3.c, oq5Var, ((i4 >> 3) & 14) | 24576, 12);
            function02 = function0;
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            str2 = str;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ky5(str2, function02, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static final void j(List list, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1813038142);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var.h(list) ? 4 : 2);
        } else {
            i3 = i2;
        }
        boolean z = true;
        boolean z2 = 0;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            vci vciVar = vci.a;
            float f2 = 0.0f;
            yci o = androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-223256155);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f5i f5iVar = (f5i) it.next();
                yci g2 = d.g(vciVar, 20, f2, i4);
                nho a3 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, g2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var2);
                }
                g0g.U(oq5Var, H2, wp5.d);
                float f3 = 8;
                ug3.a(a.b(d.m(xp3.u(vciVar, ugo.a), f3), c3x.f(f5iVar.b), vnj.i), oq5Var, z2);
                u1g.l(oq5Var, d.r(vciVar, f3));
                String o2 = ouj.o(rvf.M(R.string.metro_station_content_description, oq5Var), StringUtil.SPACE, f5iVar.a);
                String str = f5iVar.a;
                ges i7 = nu0.i();
                long j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                boolean f4 = oq5Var.f(o2);
                Object K = oq5Var.K();
                if (f4 || K == gq5.a) {
                    K = new wq(o2, 15);
                    oq5Var.k0(K);
                }
                boolean z3 = z;
                oq5 oq5Var2 = oq5Var;
                xcs.b(str, nfp.b(vciVar, z2, (Function1) K), j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, i7, oq5Var2, 0, 0, 65528);
                oq5Var = oq5Var2;
                oq5Var.p(z3);
                z = z3;
                z2 = z2;
                vciVar = vciVar;
                f2 = f2;
                i4 = i4;
            }
            oq5Var.p(z2);
            oq5Var.p(z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(list, i2, 6);
        }
    }

    public static final void k(gy7 gy7Var, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        int i3;
        boolean z;
        yci yciVar2;
        gy7Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1940973770);
        int i4 = i2 | (oq5Var2.h(gy7Var) ? 4 : 2) | (oq5Var2.h(function1) ? 32 : 16) | 384;
        if ((i4 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            float f2 = 24;
            yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), f2, 0.0f, 2);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, o);
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
            u1g.l(oq5Var2, d.e(vciVar, f2));
            String str = gy7Var.a;
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var2.j(agrVar)).b.a;
            vci vciVar2 = vciVar;
            xv7.j(str, null, j2, 0L, 0L, 0, 0L, 0, false, 0, 0, null, c2, oq5Var2, 0, 0, 65530);
            u1g.l(oq5Var2, d.e(vciVar2, 6));
            kn0 kn0Var = new kn0();
            kn0Var.c(gy7Var.b);
            xv7.i(kn0Var.h(), null, ((dq0) oq5Var2.j(agrVar)).b.b, 0L, 0L, 0, 0L, 0, false, 0, 0, null, null, nu0.j(), null, null, oq5Var2, 0, 0, 917498);
            u1g.l(oq5Var2, d.e(vciVar2, f2));
            String str2 = gy7Var.c;
            if (str2 == null) {
                str2 = "";
            }
            xv7.i(f8g.J(str2, oq5Var2), androidx.compose.ui.platform.a.a(vciVar2, "description_bottom_sheet_description"), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, 0L, 0, 0L, 0, false, 0, 0, null, null, nu0.j(), null, null, oq5Var2, 48, 0, 917496);
            oq5Var = oq5Var2;
            if (function1 != null) {
                oq5Var.Z(2094906859);
                i3 = 32;
                String o2 = vz1.o(vciVar2, 32, oq5Var, R.string.listen, oq5Var);
                boolean f3 = ((i4 & 112) == 32) | oq5Var.f(o2);
                Object K = oq5Var.K();
                if (f3 || K == gq5.a) {
                    K = new lg6(2, o2, function1);
                    oq5Var.k0(K);
                }
                z = false;
                cb0.g(0, oq5Var, androidx.compose.ui.platform.a.a(d.r(vciVar2, 220).f(new HorizontalAlignElement(b2c.o)), "description_bottom_sheet_play_button"), o2, (Function0) K);
            } else {
                i3 = 32;
                z = false;
                oq5Var.Z(2092565646);
            }
            oq5Var.p(z);
            eta.p(vciVar2, i3, oq5Var, true);
            yciVar2 = vciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(gy7Var, function1, yciVar2, i2, 29);
        }
    }

    public static final void l(nla nlaVar, hla hlaVar, qnq qnqVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        nlaVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1516533394);
        int i3 = i2 | (oq5Var2.h(nlaVar) ? 4 : 2) | (oq5Var2.f(hlaVar) ? 32 : 16) | (oq5Var2.h(qnqVar) ? 256 : 128);
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            boolean h2 = oq5Var2.h(nlaVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                dda ddaVar = new dda(0, nlaVar, nla.class, "onBackClicked", "onBackClicked()V", 0, 16);
                oq5Var2.k0(ddaVar);
                K = ddaVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var2.h(nlaVar);
            Object K2 = oq5Var2.K();
            if (h3 || K2 == kjnVar) {
                dda ddaVar2 = new dda(0, nlaVar, nla.class, "onSearchClicked", "onSearchClicked()V", 0, 17);
                oq5Var2.k0(ddaVar2);
                K2 = ddaVar2;
            }
            oq5Var = oq5Var2;
            kg5.g(R.string.main_downloaded_title, a2, function0, (Function0) ((h9f) K2), null, ild.C(402641505, new up(nlaVar, hlaVar, qnqVar, a2, 18), oq5Var2), oq5Var, 196608, 16);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(nlaVar, hlaVar, qnqVar, i2, 4);
        }
    }

    public static final void m(final iab iabVar, final gvd gvdVar, final hab habVar, final tvd tvdVar, final dib dibVar, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final pbu pbuVar, final qo6 qo6Var, final yci yciVar, Function0 function05, ges gesVar, hq5 hq5Var, final int i2, final int i3) {
        hab habVar2;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        pbu pbuVar2;
        Function0 function010;
        int i4;
        final ges gesVar2;
        final Function0 function011;
        final Function0 function012;
        final ges d2;
        iabVar.getClass();
        gvdVar.getClass();
        tvdVar.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        pbuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1270497502);
        int i5 = (oq5Var.f(iabVar) ? 4 : 2) | i2 | (oq5Var.f(gvdVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            habVar2 = habVar;
            i5 |= oq5Var.f(habVar2) ? 256 : 128;
        } else {
            habVar2 = habVar;
        }
        int i6 = i5 | (oq5Var.f(tvdVar) ? 2048 : 1024) | (oq5Var.h(dibVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((196608 & i2) == 0) {
            function06 = function0;
            i6 |= oq5Var.h(function06) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function06 = function0;
        }
        if ((1572864 & i2) == 0) {
            function07 = function02;
            i6 |= oq5Var.h(function07) ? 1048576 : 524288;
        } else {
            function07 = function02;
        }
        if ((12582912 & i2) == 0) {
            function08 = function03;
            i6 |= oq5Var.h(function08) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function08 = function03;
        }
        if ((100663296 & i2) == 0) {
            function09 = function04;
            i6 |= oq5Var.h(function09) ? 67108864 : 33554432;
        } else {
            function09 = function04;
        }
        if ((805306368 & i2) == 0) {
            pbuVar2 = pbuVar;
            i6 |= oq5Var.f(pbuVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            pbuVar2 = pbuVar;
        }
        int i7 = i3 & 4096;
        if (i7 != 0) {
            i4 = 438;
            function010 = function05;
        } else {
            function010 = function05;
            i4 = '6' | (oq5Var.h(function010) ? (char) 256 : (char) 128);
        }
        int i8 = i6;
        if (oq5Var.P(i8 & 1, ((i8 & 306783379) == 306783378 && ((i4 | 1795072) & 599187) == 599186) ? false : true)) {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                function012 = i7 != 0 ? null : function010;
                d2 = nu0.d();
            } else {
                oq5Var.S();
                d2 = gesVar;
                function012 = function010;
            }
            oq5Var.q();
            final hab habVar3 = habVar2;
            final Function0 function013 = function06;
            final Function0 function014 = function07;
            final Function0 function015 = function08;
            final Function0 function016 = function09;
            final pbu pbuVar3 = pbuVar2;
            b(new qzm[0], true, ild.C(2072025941, new Function2() { // from class: dab
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                        long j2 = d85.m;
                        long j3 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                        yci d3 = d.d(yci.this, 1.0f);
                        gvd gvdVar2 = gvdVar;
                        boolean f2 = oq5Var2.f(gvdVar2);
                        Object K = oq5Var2.K();
                        kjn kjnVar = gq5.a;
                        if (f2 || K == kjnVar) {
                            K = new u91(gvdVar2, 2);
                            oq5Var2.k0(K);
                        }
                        yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.ui.draw.a.a(d3, (Function1) K), "entity_header");
                        Object K2 = oq5Var2.K();
                        if (K2 == kjnVar) {
                            K2 = new rua(28);
                            oq5Var2.k0(K2);
                        }
                        q5g.k(nfp.b(a2, false, (Function1) K2), null, j2, j3, null, 0.0f, ild.C(-362789743, new fab(tvdVar, iabVar, habVar3, d2, function014, gvdVar2, qo6Var, pbuVar3, function013, dibVar, function015, function016, function012), oq5Var2), oq5Var2, 1573248, 50);
                    } else {
                        oq5Var2.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 432, 0);
            gesVar2 = d2;
            function011 = function012;
        } else {
            oq5Var.S();
            gesVar2 = gesVar;
            function011 = function010;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: eab
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i2 | 1);
                    pd.m(iab.this, gvdVar, habVar, tvdVar, dibVar, function0, function02, function03, function04, pbuVar, qo6Var, yciVar, function011, gesVar2, (hq5) obj, R, i3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(String str, int i2, ges gesVar, Function0 function0, yci yciVar, String str2, hq5 hq5Var, int i3, int i4) {
        int i5;
        yci yciVar2;
        String str3;
        int i6;
        String str4;
        yci yciVar3;
        String str5;
        oq5 oq5Var;
        String str6;
        yci yciVar4;
        xmn r;
        int i7;
        str.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-770703664);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var2.f(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var2.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= oq5Var2.f(gesVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        int i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var2.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if ((196608 & i3) != 0) {
                if ((i4 & 32) == 0) {
                    str3 = str2;
                    if (oq5Var2.f(str3)) {
                        i7 = SQLiteDatabase.OPEN_SHAREDCACHE;
                        i5 |= i7;
                    }
                } else {
                    str3 = str2;
                }
                i7 = SQLiteDatabase.OPEN_FULLMUTEX;
                i5 |= i7;
            } else {
                str3 = str2;
            }
            i6 = i5 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
            if ((599187 & i6) == 599186 || !oq5Var2.z()) {
                oq5Var2.U();
                if ((i3 & 1) != 0 || oq5Var2.y()) {
                    yci yciVar5 = i8 == 0 ? vci.a : yciVar2;
                    if ((i4 & 32) == 0) {
                        str4 = rvf.N(R.string.overview_block_content_description, new Object[]{""}, oq5Var2);
                        i6 &= -458753;
                    } else {
                        str4 = str3;
                    }
                    yciVar3 = yciVar5;
                    str5 = str4;
                } else {
                    oq5Var2.S();
                    if ((i4 & 32) != 0) {
                        i6 &= -458753;
                    }
                    yciVar3 = yciVar2;
                    str5 = str3;
                }
                oq5Var2.q();
                agr agrVar = eq0.a;
                int i9 = i6 << 3;
                int i10 = (i6 & 14) | ((i6 >> 6) & 112) | (i9 & 896) | (i9 & 7168);
                int i11 = i6 << 6;
                oq5Var = oq5Var2;
                p0q.b(str, function0, i2, gesVar, ((dq0) oq5Var2.j(agrVar)).b.a, ((dq0) oq5Var2.j(agrVar)).b.d, rvf.M(R.string.expand_more, oq5Var2), str5, yciVar3, oq5Var, i10 | (29360128 & i11) | (i11 & 234881024) | ((i6 << 15) & 1879048192));
                str6 = str5;
                yciVar4 = yciVar3;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                yciVar4 = yciVar2;
                str6 = str3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new ctb(str, i2, gesVar, function0, yciVar4, str6, i3, i4);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((196608 & i3) != 0) {
        }
        i6 = i5 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if ((599187 & i6) == 599186) {
        }
        oq5Var2.U();
        if ((i3 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        yciVar3 = yciVar5;
        str5 = str4;
        oq5Var2.q();
        agr agrVar2 = eq0.a;
        int i92 = i6 << 3;
        int i102 = (i6 & 14) | ((i6 >> 6) & 112) | (i92 & 896) | (i92 & 7168);
        int i112 = i6 << 6;
        oq5Var = oq5Var2;
        p0q.b(str, function0, i2, gesVar, ((dq0) oq5Var2.j(agrVar2)).b.a, ((dq0) oq5Var2.j(agrVar2)).b.d, rvf.M(R.string.expand_more, oq5Var2), str5, yciVar3, oq5Var, i102 | (29360128 & i112) | (i112 & 234881024) | ((i6 << 15) & 1879048192));
        str6 = str5;
        yciVar4 = yciVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final int i2, final int i3, final long j2, final long j3, final wn5 wn5Var, hq5 hq5Var, final yci yciVar, final Function0 function0, final boolean z, boolean z2) {
        int i4;
        yci yciVar2;
        boolean z3;
        final boolean z4;
        xmn r;
        function0.getClass();
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(557891510);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.e(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.e(j3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            yciVar2 = yciVar;
        }
        int i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            z3 = z2;
            i4 |= oq5Var.g(z3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((1572864 & i2) == 0) {
                i4 |= oq5Var.h(wn5Var) ? 1048576 : 524288;
            }
            if ((599187 & i4) == 599186 || !oq5Var.z()) {
                if (i5 != 0) {
                    z3 = false;
                }
                final yci yciVar3 = yciVar2;
                final boolean z5 = z3;
                zc4.m(j3, ild.C(1251290854, new Function2() { // from class: j5d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        hq5 hq5Var2 = (hq5) obj;
                        if ((((Integer) obj2).intValue() & 3) == 2) {
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.z()) {
                                oq5Var2.S();
                                return Unit.a;
                            }
                        }
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        Object K = oq5Var3.K();
                        if (K == gq5.a) {
                            K = vz1.h(oq5Var3);
                        }
                        uoi uoiVar = (uoi) K;
                        geo a2 = eeo.a(0.0f, 3, j3, false);
                        boolean z6 = z5;
                        yci d2 = a.d(yciVar3, uoiVar, z6 ? null : a2, z, null, new meo(0), function0, 8);
                        kfh d3 = ug3.d(b2c.f, false);
                        int i6 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l = oq5Var3.l();
                        yci H = vnj.H(oq5Var3, d2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.k(grbVar);
                        } else {
                            oq5Var3.n0();
                        }
                        g0g.U(oq5Var3, d3, wp5.f);
                        g0g.U(oq5Var3, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                            ouj.x(i6, oq5Var3, i6, kb5Var);
                        }
                        g0g.U(oq5Var3, H, wp5.d);
                        if (z6) {
                            oq5Var3.Z(1385759967);
                            ug3.a(e.a(b.a.b(vci.a), uoiVar, a2), oq5Var3, 0);
                        } else {
                            oq5Var3.Z(1384119106);
                        }
                        oq5Var3.p(false);
                        zwf.i(j2, ild.C(1184136929, new y61(wn5Var, 15), oq5Var3), oq5Var3, 48);
                        oq5Var3.p(true);
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, ((i4 >> 9) & 14) | 48, 0);
                z4 = z5;
            } else {
                oq5Var.S();
                z4 = z3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: k5d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pd.o(rvf.R(i2 | 1), i3, j2, j3, wn5Var, (hq5) obj, yciVar, function0, z, z4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if ((1572864 & i2) == 0) {
        }
        if ((599187 & i4) == 599186) {
        }
        if (i5 != 0) {
        }
        final yci yciVar32 = yciVar2;
        final boolean z52 = z3;
        zc4.m(j3, ild.C(1251290854, new Function2() { // from class: j5d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                Object K = oq5Var3.K();
                if (K == gq5.a) {
                    K = vz1.h(oq5Var3);
                }
                uoi uoiVar = (uoi) K;
                geo a2 = eeo.a(0.0f, 3, j3, false);
                boolean z6 = z52;
                yci d2 = a.d(yciVar32, uoiVar, z6 ? null : a2, z, null, new meo(0), function0, 8);
                kfh d3 = ug3.d(b2c.f, false);
                int i6 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, d2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, d3, wp5.f);
                g0g.U(oq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var3, i6, kb5Var);
                }
                g0g.U(oq5Var3, H, wp5.d);
                if (z6) {
                    oq5Var3.Z(1385759967);
                    ug3.a(e.a(b.a.b(vci.a), uoiVar, a2), oq5Var3, 0);
                } else {
                    oq5Var3.Z(1384119106);
                }
                oq5Var3.p(false);
                zwf.i(j2, ild.C(1184136929, new y61(wn5Var, 15), oq5Var3), oq5Var3, 48);
                oq5Var3.p(true);
                return Unit.a;
            }
        }, oq5Var), oq5Var, ((i4 >> 9) & 14) | 48, 0);
        z4 = z52;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void p(k53 k53Var, eqp eqpVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        kjn kjnVar;
        eqp eqpVar2;
        boolean z;
        Object aubVar;
        boolean z2;
        boolean z3;
        eqpVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1302818707);
        int i3 = i2 | (oq5Var2.f(k53Var) ? 4 : 2) | (oq5Var2.f(eqpVar) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128);
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 16, 0.0f, 0.0f, 13), "kids_block");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a3, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            a0g.v(0, oq5Var2, null, rvf.M(R.string.kids_settings_title, oq5Var2));
            boolean z4 = k53Var.d;
            vci vciVar = vci.a;
            kjn kjnVar2 = gq5.a;
            if (z4) {
                oq5Var2.Z(-1024213786);
                fk0 N = u1g.N(eqpVar, lsp.g, oq5Var2, ((i3 >> 3) & 14) | 48);
                String M = rvf.M(R.string.settings_kids_tab, oq5Var2);
                boolean z5 = k53Var.a;
                boolean z6 = (i3 & 112) == 32;
                Object K = oq5Var2.K();
                if (z6 || K == kjnVar2) {
                    z3 = z5;
                    z = false;
                    kjnVar = kjnVar2;
                    aub aubVar2 = new aub(1, eqpVar, eqp.class, "onKidsSwitcherClick", "onKidsSwitcherClick(Z)V", 0, 26);
                    eqpVar2 = eqpVar;
                    oq5Var2.k0(aubVar2);
                    K = aubVar2;
                } else {
                    kjnVar = kjnVar2;
                    z3 = z5;
                    eqpVar2 = eqpVar;
                    z = false;
                }
                Function1 function1 = (Function1) ((h9f) K);
                boolean h2 = oq5Var2.h(N);
                Object K2 = oq5Var2.K();
                if (h2 || K2 == kjnVar) {
                    K2 = new kw4(N, 3);
                    oq5Var2.k0(K2);
                }
                a0g.s(M, null, z3, function1, com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(wyf.t(vciVar, (Function0) K2), "settings_kids_switcher"), "kids_state", Boolean.valueOf(k53Var.a)), oq5Var2, 48);
            } else {
                kjnVar = kjnVar2;
                eqpVar2 = eqpVar;
                z = false;
                oq5Var2.Z(-1026111265);
            }
            oq5Var2.p(z);
            if (k53Var.c) {
                oq5Var2.Z(-1023493129);
                String M2 = rvf.M(((Boolean) oq5Var2.j((agr) pkg.d.c)).booleanValue() ? R.string.settings_kids_subtitle_exclamation : R.string.settings_kids_subtitle, oq5Var2);
                fk0 N2 = u1g.N(eqpVar2, lsp.h, oq5Var2, ((i3 >> 3) & 14) | 48);
                String M3 = rvf.M(R.string.settings_kids_title, oq5Var2);
                boolean z7 = k53Var.b;
                boolean z8 = (i3 & 112) != 32 ? z : true;
                Object K3 = oq5Var2.K();
                if (z8 || K3 == kjnVar) {
                    z2 = z7;
                    aubVar = new aub(1, eqpVar, eqp.class, "onKidsExplicitClick", "onKidsExplicitClick(Z)V", 0, 27);
                    oq5Var2.k0(aubVar);
                } else {
                    aubVar = K3;
                    z2 = z7;
                }
                Function1 function12 = (Function1) ((h9f) aubVar);
                boolean h3 = oq5Var2.h(N2);
                Object K4 = oq5Var2.K();
                if (h3 || K4 == kjnVar) {
                    K4 = new kw4(N2, 4);
                    oq5Var2.k0(K4);
                }
                oq5Var = oq5Var2;
                a0g.s(M3, M2, z2, function12, com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(wyf.t(vciVar, (Function0) K4), "settings_explicit_switcher"), "explicit_state", Boolean.valueOf(k53Var.b)), oq5Var, 0);
            } else {
                oq5Var = oq5Var2;
                oq5Var.Z(-1026111265);
            }
            oq5Var.p(z);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(i2, 22, yciVar, k53Var, eqpVar);
        }
    }

    public static final void q(j53 j53Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-136274006);
        int i3 = (oq5Var.f(j53Var) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            pm0.a(lm0.j, ild.C(2124616627, new rdf(yciVar, j53Var), oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rdf(j53Var, yciVar, i2);
        }
    }

    public static final void r(wd3 wd3Var, Function0 function0, hq5 hq5Var, int i2) {
        int i3;
        long j2;
        long j3;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2100596775);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(wd3Var) : oq5Var.h(wd3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i4 = i2 & 384;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i3 |= oq5Var.f(vciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            String str = wd3Var.d;
            d85 d85Var = wd3Var.b;
            if (d85Var == null) {
                oq5Var.Z(-38863593);
                j2 = c3x.G(oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-38864089);
                oq5Var.p(false);
                j2 = d85Var.a;
            }
            d85 d85Var2 = wd3Var.c;
            if (d85Var2 == null) {
                oq5Var.Z(-38861223);
                j3 = c3x.H(oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-38861812);
                oq5Var.p(false);
                j3 = d85Var2.a;
            }
            function02 = function0;
            hdg.b(str, function02, vciVar, new d85(j2), new d85(j3), oq5Var, i3 & 1008, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(wd3Var, function02, i2);
        }
    }

    public static final pu0 t(qzm... qzmVarArr) {
        return u((qzm[]) Arrays.copyOf(qzmVarArr, qzmVarArr.length), O());
    }

    public static final pu0 u(qzm[] qzmVarArr, vdr vdrVar) {
        vdrVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        cce cceVar = (cce) qdcVar.C(I);
        bdt I2 = hag.I(q8r.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        return new pu0(vdrVar, cceVar, (q8r) qdcVar2.C(I2), new q2(5, qzmVarArr));
    }

    public static boolean w(aa6 aa6Var) {
        z96[] z96VarArr = aa6Var.U;
        z96 z96Var = z96VarArr[0];
        z96 z96Var2 = z96VarArr[1];
        aa6 aa6Var2 = aa6Var.V;
        ba6 ba6Var = aa6Var2 != null ? (ba6) aa6Var2 : null;
        z96 z96Var3 = z96.a;
        if (ba6Var != null) {
            z96 z96Var4 = ba6Var.U[0];
        }
        if (ba6Var != null) {
            z96 z96Var5 = ba6Var.U[1];
        }
        z96 z96Var6 = z96.c;
        z96 z96Var7 = z96.b;
        boolean z = z96Var == z96Var3 || aa6Var.B() || z96Var == z96Var7 || (z96Var == z96Var6 && aa6Var.r == 0 && aa6Var.Y == 0.0f && aa6Var.u(0)) || (z96Var == z96Var6 && aa6Var.r == 1 && aa6Var.v(0, aa6Var.r()));
        boolean z2 = z96Var2 == z96Var3 || aa6Var.C() || z96Var2 == z96Var7 || (z96Var2 == z96Var6 && aa6Var.s == 0 && aa6Var.Y == 0.0f && aa6Var.u(1)) || (z96Var2 == z96Var6 && aa6Var.s == 1 && aa6Var.v(1, aa6Var.l()));
        return (aa6Var.Y > 0.0f && (z || z2)) || (z && z2);
    }

    public static k03 x(cj4 cj4Var) {
        cj4Var.getClass();
        q1c q1cVar = q1c.f;
        r1c r1cVar = r1c.b;
        String str = cj4Var.a;
        String str2 = cj4Var.c;
        String str3 = cj4Var.b;
        return new k03(q1cVar, r1cVar, null, str, hrg.r("Invalid redirectUrl \"", str2, "\" in response: ", su4.o(f1d.m("<VerificationResponse: status - ", str, ", status code - ", str3, ", rc - "), cj4Var.e, ">")));
    }

    public static int y(int i2, int i3) {
        long j2 = i2 + i3;
        int i4 = (int) j2;
        if (j2 == ((long) i4)) {
            return i4;
        }
        throw new ArithmeticException(dfi.f("overflow: checkedAdd(", i2, i3, ", ", ")"));
    }

    public static final AlphaAnimation z(boolean z) {
        return new AlphaAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
    }

    public abstract int s(int i2, int i3, ksk kskVar);

    public Integer v(ksk kskVar) {
        return null;
    }
}
