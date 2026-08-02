package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.BuildConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class ksw {
    public static volatile k3i a;
    public static final wn5 b = new wn5(new h3(25), -1883695184, false);
    public static final wn5 c = new wn5(new h3(26), 14714676, false);
    public static final wn5 d = new wn5(new jo5(18), -394840434, false);
    public static final wn5 e = new wn5(new lo5(4), -1486457599, false);
    public static final wn5 f = new wn5(new lo5(5), 994716994, false);
    public static final wn5 g = new wn5(new jo5(19), -349040453, false);
    public static final wn5 h;
    public static final wn5 i;
    public static final v2f j;
    public static final v2f k;
    public static final v2f l;
    public static final npe m;
    public static final ny0 n;
    public static final bbr o;
    public static final bbr p;
    public static final bbr q;
    public static final bbr r;
    public static final bbr s;
    public static final bbr t;
    public static final bbr u;
    public static final bbr v;
    public static final bbr w;
    public static dq0 x;
    public static dq0 y;

    static {
        new wn5(new lo5(6), -616601371, false);
        h = new wn5(new wo5(6), -453730977, false);
        i = new wn5(new wo5(7), -1266551935, false);
        j = new v2f(11);
        k = new v2f(12);
        l = new v2f(13);
        m = new npe(new int[0]);
        n = new ny0(5);
        o = new bbr(1);
        p = new bbr(2);
        q = new bbr(3);
        r = new bbr(4);
        s = new bbr(5);
        t = new bbr(6);
        u = new bbr(7);
        v = new bbr(8);
        w = new bbr(0);
    }

    public static final void A(n9b n9bVar, sbb sbbVar) {
        n9bVar.getClass();
        ubi ubiVar = n9bVar.a;
        sbbVar.getClass();
        if (sbbVar instanceof scq) {
            wxf.b(n9bVar, sbbVar.q());
            return;
        }
        if (sbbVar instanceof sbq) {
            up6.a(n9bVar, sbbVar.q());
            return;
        }
        if (sbbVar instanceof xcq) {
            u7g.n(n9bVar, sbbVar.q());
            return;
        }
        if (sbbVar instanceof gcq) {
            vq1.f(n9bVar, sbbVar.q());
            return;
        }
        boolean z = true;
        if (sbbVar instanceof rbq) {
            Function0 q2 = sbbVar.q();
            q2.getClass();
            ubiVar.a(new wn5(new zk(1, q2), -2021354332, true));
            return;
        }
        if (sbbVar instanceof mcq) {
            Function0 q3 = sbbVar.q();
            q3.getClass();
            ubiVar.a(new wn5(new zk(21, q3), 192725378, true));
            return;
        }
        if (sbbVar instanceof ocq) {
            Function0 q4 = sbbVar.q();
            q4.getClass();
            ubiVar.a(new wn5(new zk(22, q4), 1029648809, true));
            return;
        }
        if (sbbVar instanceof lcq) {
            Function0 q5 = sbbVar.q();
            q5.getClass();
            ubiVar.a(new wn5(new zk(20, q5), -1141710458, true));
            return;
        }
        if (sbbVar instanceof fdq) {
            Function0 q6 = sbbVar.q();
            q6.getClass();
            ubiVar.a(new wn5(new zk(9, q6), 979608211, true));
            return;
        }
        if (sbbVar instanceof bdq) {
            Function0 q7 = sbbVar.q();
            q7.getClass();
            ubiVar.a(new wn5(new xtp(3, q7), 1473402156, true));
            return;
        }
        if (sbbVar instanceof ecq) {
            Function0 q8 = sbbVar.q();
            q8.getClass();
            ubiVar.a(new wn5(new zk(14, q8), 2125420102, true));
            return;
        }
        if (sbbVar instanceof fcq) {
            Function0 q9 = sbbVar.q();
            q9.getClass();
            ubiVar.a(new wn5(new zk(12, q9), 908616779, true));
            return;
        }
        if (sbbVar instanceof dcq) {
            Function0 q10 = sbbVar.q();
            q10.getClass();
            ubiVar.a(new wn5(new zk(13, q10), -167115646, true));
            return;
        }
        boolean z2 = false;
        if (sbbVar instanceof icq) {
            lxe.g(n9bVar, false, sbbVar.q());
            return;
        }
        if (sbbVar instanceof ddq) {
            lxe.g(n9bVar, true, sbbVar.q());
            return;
        }
        if (sbbVar instanceof zbq) {
            Function0 q11 = sbbVar.q();
            q11.getClass();
            ubiVar.a(new wn5(new zk(10, q11), -1703485986, true));
        } else if (sbbVar instanceof ucq) {
            Function0 q12 = sbbVar.q();
            q12.getClass();
            ubiVar.a(new wn5(new j93(z2, q12, 2, (byte) 0), 57121286, true));
        } else if (sbbVar instanceof wcq) {
            Function0 q13 = sbbVar.q();
            q13.getClass();
            ubiVar.a(new wn5(new j93(z, q13, 2, (byte) 0), 57121286, true));
        }
    }

    public static final Object B(fvf fvfVar, fvf fvfVar2, aur aurVar) {
        Object collect = zsd.d0(zsd.b0(szf.s0(new ga2(fvfVar, 0))), 1).collect(new gl(10, fvfVar2, fvfVar), aurVar);
        return collect == nm6.a ? collect : Unit.a;
    }

    public static final PorterDuffColorFilter C(Context context, int i2) {
        context.getClass();
        return new PorterDuffColorFilter(qgg.O(context, i2, 0), PorterDuff.Mode.SRC_IN);
    }

    public static final yci D(yci yciVar, String str, String str2) {
        yciVar.getClass();
        return nfp.b(yciVar, false, new cb(str, str2, 0));
    }

    public static dq0 E(boolean z, hq5 hq5Var) {
        long s2 = jf0.s(R.color.icon_primary_day, R.color.icon_primary_night, hq5Var, z);
        long s3 = jf0.s(R.color.icon_on_primary_button_day, R.color.icon_on_primary_button_night, hq5Var, z);
        long s4 = jf0.s(R.color.icon_secondary_day, R.color.icon_secondary_night, hq5Var, z);
        long s5 = jf0.s(R.color.icon_with_text_day, R.color.icon_with_text_night, hq5Var, z);
        long s6 = jf0.s(R.color.icon_disabled_day, R.color.icon_disabled_night, hq5Var, z);
        jf0.s(R.color.icon_accent_day, R.color.icon_accent_night, hq5Var, z);
        bq0 bq0Var = new bq0(s2, s3, s4, s5, s6, jf0.s(R.color.icon_success_day, R.color.icon_success_night, hq5Var, z), jf0.s(R.color.icon_like_day, R.color.icon_like_night, hq5Var, z), jf0.s(R.color.icon_logo_day, R.color.icon_logo_night, hq5Var, z));
        cq0 cq0Var = new cq0(jf0.s(R.color.text_primary_day, R.color.text_primary_night, hq5Var, z), jf0.s(R.color.text_secondary_day, R.color.text_secondary_night, hq5Var, z), jf0.s(R.color.text_disabled_day, R.color.text_disabled_night, hq5Var, z), jf0.s(R.color.text_accent_day, R.color.text_accent_night, hq5Var, z), jf0.s(R.color.text_on_primary_button_day, R.color.text_on_primary_button_night, hq5Var, z));
        zp0 zp0Var = new zp0(jf0.s(R.color.bg_primary_day, R.color.bg_primary_night, hq5Var, z), jf0.s(R.color.bg_secondary_day, R.color.bg_secondary_night, hq5Var, z), jf0.s(R.color.bg_placeholder_day, R.color.bg_placeholder_night, hq5Var, z), jf0.s(R.color.bg_fade_day, R.color.bg_fade_night, hq5Var, z));
        long s7 = jf0.s(R.color.button_primary_day, R.color.button_primary_night, hq5Var, z);
        jf0.s(R.color.button_primary_pressed_day, R.color.button_primary_pressed_night, hq5Var, z);
        long s8 = jf0.s(R.color.button_primary_disabled_day, R.color.button_primary_disabled_night, hq5Var, z);
        long s9 = jf0.s(R.color.button_secondary_day, R.color.button_secondary_night, hq5Var, z);
        jf0.s(R.color.button_secondary_pressed_day, R.color.button_secondary_pressed_night, hq5Var, z);
        long s10 = jf0.s(R.color.button_secondary_disabled_day, R.color.button_secondary_disabled_night, hq5Var, z);
        long s11 = jf0.s(R.color.button_secondary_img_day, R.color.button_secondary_img_night, hq5Var, z);
        jf0.s(R.color.button_secondary_img_pressed_day, R.color.button_secondary_img_pressed_night, hq5Var, z);
        return new dq0(bq0Var, cq0Var, zp0Var, new aq0(s7, s8, s9, s10, s11, jf0.s(R.color.button_secondary_img_disabled_day, R.color.button_secondary_img_disabled_night, hq5Var, z)), new mgr(jf0.s(R.color.other_unchecked_thumb_day, R.color.other_unchecked_thumb_night, hq5Var, z), jf0.s(R.color.other_unchecked_track_day, R.color.other_unchecked_track_night, hq5Var, z)));
    }

    public static final boolean F(hq5 hq5Var) {
        return ((Boolean) ((oq5) hq5Var).j((agr) kkg.d.c)).booleanValue();
    }

    public static final ls7 G(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            return ls7.a;
        }
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        return i2 != 16 ? i2 != 32 ? ls7.a : ls7.b : ls7.a;
    }

    public static final boolean H(Context context) {
        context.getClass();
        ues uesVar = hmd.a;
        if (uesVar == ls7.a) {
            return true;
        }
        if (uesVar == ls7.b) {
            return false;
        }
        if (uesVar == ls7.c) {
            int ordinal = N(G(context)).ordinal();
            return ordinal == 0 || ordinal != 1;
        }
        Resources.Theme theme = new uf6(context, hmd.a.a(context).x()).getTheme();
        theme.getClass();
        if (ocg.z(R.attr.paymentsdk_is_light_theme, theme) != null) {
            return ocg.A(theme, R.attr.paymentsdk_is_light_theme, true);
        }
        int ordinal2 = N(G(context)).ordinal();
        return ordinal2 == 0 || ordinal2 != 1;
    }

    public static final Object I(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static int J(l7f l7fVar, String str, int i2, int i3) {
        int nextInt = l7fVar.nextInt();
        if (nextInt >= i2 && nextInt <= i3) {
            return nextInt;
        }
        String path = l7fVar.getPath();
        StringBuilder l2 = f1d.l(nextInt, "Expected ", str, " but was ", " at path ");
        l2.append(path);
        throw new wp3(l2.toString());
    }

    public static final aqi K(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = l1b.a(context);
            oq5Var.k0(K);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) K;
        Object K2 = oq5Var.K();
        if (K2 == kjnVar) {
            K2 = zsd.I(new l5(accessibilityManager, (Continuation) null, 2));
            oq5Var.k0(K2);
        }
        return gld.N((pjc) K2, Boolean.valueOf(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()), oq5Var, 0);
    }

    public static final boolean L(hiu hiuVar, hiu hiuVar2, pfg pfgVar) {
        hiuVar.getClass();
        if (hiuVar2 == null || ((hiuVar2 instanceof giu) && (hiuVar instanceof fiu))) {
            return true;
        }
        if ((hiuVar instanceof giu) && (hiuVar2 instanceof fiu)) {
            return false;
        }
        return (hiuVar.c == hiuVar2.c && hiuVar.d == hiuVar2.d && hiuVar2.a(pfgVar) <= hiuVar.a(pfgVar)) ? false : true;
    }

    public static eu7 M(eu7 eu7Var, boolean z, gxj gxjVar, List list, boolean z2, int i2) {
        int size;
        xeq xeqVar;
        int d2;
        int i3;
        if ((i2 & 2) != 0) {
            gxjVar = null;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        eu7Var.getClass();
        if (gxjVar != null) {
            eu7Var = n7w.A(eu7Var, eu7Var.a.b(gxjVar.a));
        }
        cu7 cu7Var = eu7Var.a;
        du7 du7Var = eu7Var.b;
        if (!z) {
            egc egcVar = cu7Var.a;
            if (!(egcVar instanceof xeq)) {
                if ((egcVar instanceof km7) || Intrinsics.d(egcVar, y4b.a)) {
                    return eu7Var;
                }
                b6e.s();
                return null;
            }
            xeq xeqVar2 = (xeq) egcVar;
            List list2 = xeqVar2.a;
            int i4 = du7Var.a;
            int i5 = du7Var.b;
            int c2 = xeqVar2.c(i4);
            cu7 a2 = cu7.a(cu7Var, new km7(list2), null, 2);
            if (du7Var.c) {
                i5 = c2;
            } else if (Intrinsics.e(i5, list2.size()) < 0 && (i5 = c2 + 1) > (size = list2.size())) {
                i5 = size;
            }
            return new eu7(a2, new du7(c2, i5));
        }
        int c3 = eu7Var.c();
        egc egcVar2 = cu7Var.a;
        if (egcVar2 instanceof km7) {
            List list3 = ((km7) egcVar2).a;
            if (list != null) {
                xeqVar = new xeq(list3, list);
                d2 = xeqVar.d(c3);
            } else {
                ohn ohnVar = phn.a;
                list3.getClass();
                ohnVar.getClass();
                ArrayList x0 = CollectionsKt.x0(u75.f(list3));
                for (int size2 = x0.size() - 1; size2 > 0; size2--) {
                    int d3 = phn.b.d(size2 + 1);
                    x0.set(d3, x0.set(size2, x0.get(d3)));
                }
                y8p y8pVar = new y8p(x0);
                if (z2) {
                    tz0 tz0Var = (tz0) y8pVar.c;
                    if (c3 < 0 || c3 >= tz0Var.f()) {
                        xq0.o(dfi.f("originalPosition ", c3, tz0Var.f(), " out of bounds [0, ", ")"));
                        return null;
                    }
                    if (x0.size() <= 0) {
                        xq0.o(dfi.c(x0.size(), "toPosition 0 out of bounds [0, ", ")"));
                        return null;
                    }
                    int intValue = ((Number) tz0Var.get(c3)).intValue();
                    ArrayList arrayList = new ArrayList(x0);
                    Collections.swap(arrayList, intValue, 0);
                    y8pVar = new y8p(arrayList);
                }
                xeqVar = new xeq(list3, (ArrayList) y8pVar.b);
                d2 = 0;
            }
        } else {
            if (!(egcVar2 instanceof xeq)) {
                if (Intrinsics.d(egcVar2, y4b.a)) {
                    return eu7Var;
                }
                b6e.s();
                return null;
            }
            if (list == null) {
                return eu7Var;
            }
            xeq xeqVar3 = (xeq) egcVar2;
            int c4 = xeqVar3.c(c3);
            xeqVar = new xeq(xeqVar3.a, list);
            d2 = xeqVar.d(c4);
        }
        cu7 a3 = cu7.a(cu7Var, xeqVar, null, 2);
        boolean z3 = du7Var.c;
        int i6 = du7Var.b;
        if (z3) {
            i6 = d2;
        } else if (Intrinsics.e(i6, egcVar2.getElements().size()) < 0 && (i3 = d2 + 1) <= (i6 = egcVar2.getElements().size())) {
            i6 = i3;
        }
        return new eu7(a3, new du7(d2, i6));
    }

    public static final rhc N(ls7 ls7Var) {
        int ordinal = ls7Var.ordinal();
        if (ordinal == 0) {
            return rhc.a;
        }
        if (ordinal == 1) {
            return rhc.b;
        }
        if (ordinal == 2) {
            return rhc.c;
        }
        b6e.s();
        return null;
    }

    public static final kri O(xh6 xh6Var) {
        if (xh6Var.equals(th6.a)) {
            return gri.a;
        }
        if (xh6Var instanceof sh6) {
            sh6 sh6Var = (sh6) xh6Var;
            return new fri(sh6Var.a, sh6Var.b);
        }
        if (xh6Var instanceof uh6) {
            uh6 uh6Var = (uh6) xh6Var;
            return new hri(uh6Var.a, uh6Var.b);
        }
        if (xh6Var instanceof vh6) {
            vh6 vh6Var = (vh6) xh6Var;
            return new iri(vh6Var.a, vh6Var.b);
        }
        if (xh6Var instanceof wh6) {
            return new jri(((wh6) xh6Var).a);
        }
        b6e.s();
        return null;
    }

    public static final void a(f20 f20Var, bg5 bg5Var, yci yciVar, hq5 hq5Var, int i2) {
        f20 f20Var2;
        int i3;
        kjn kjnVar;
        bg5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1460989285);
        int i4 = i2 | (oq5Var.f(f20Var) ? 4 : 2) | (oq5Var.h(bg5Var) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi Q = szf.Q(bg5Var.l(), oq5Var);
            aqi Q2 = szf.Q(bg5Var.c(), oq5Var);
            aqi Q3 = szf.Q(bg5Var.h(), oq5Var);
            if (bg5Var.k()) {
                f20Var2 = f20Var;
            } else {
                int i5 = f20Var.a;
                boolean z = f20Var.b;
                String str = f20Var.c;
                String str2 = f20Var.d;
                boolean z2 = f20Var.e;
                jzb jzbVar = f20Var.f;
                str.getClass();
                f20Var2 = new f20(i5, z, str, str2, z2, jzbVar, false);
            }
            rba rbaVar = (rba) Q.getValue();
            lzs lzsVar = (lzs) Q2.getValue();
            frs frsVar = (frs) Q3.getValue();
            boolean j2 = bg5Var.j();
            boolean h2 = oq5Var.h(bg5Var);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h2 || K == kjnVar2) {
                i3 = i4;
                kjnVar = kjnVar2;
                zy zyVar = new zy(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 2);
                oq5Var.k0(zyVar);
                K = zyVar;
            } else {
                i3 = i4;
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(bg5Var);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                zy zyVar2 = new zy(0, bg5Var, bg5.class, "onLongClick", "onLongClick()V", 0, 3);
                oq5Var.k0(zyVar2);
                K2 = zyVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(bg5Var);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                zy zyVar3 = new zy(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 4);
                oq5Var.k0(zyVar3);
                K3 = zyVar3;
            }
            b(f20Var2, rbaVar, lzsVar, frsVar, j2, function0, function02, (Function0) ((h9f) K3), yciVar, null, null, null, oq5Var, (i3 << 18) & 234881024, 0, 3584);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new x3(f20Var, bg5Var, yciVar, i2, 10);
        }
    }

    public static final void b(final f20 f20Var, final rba rbaVar, final lzs lzsVar, final frs frsVar, final boolean z, final Function0 function0, final Function0 function02, final Function0 function03, yci yciVar, c0g c0gVar, Function0 function04, lzs lzsVar2, hq5 hq5Var, final int i2, final int i3, final int i4) {
        int i5;
        yci yciVar2;
        final Function0 function05;
        int i6;
        yci yciVar3;
        lzs lzsVar3;
        int i7;
        final c0g c0gVar2;
        yci yciVar4;
        String str;
        String str2;
        String str3;
        Object m10Var;
        f20 f20Var2;
        yci yciVar5;
        final yci yciVar6;
        final lzs lzsVar4;
        String n2;
        int i8;
        rbaVar.getClass();
        lzsVar.getClass();
        frsVar.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-760643175);
        if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? oq5Var.f(f20Var) : oq5Var.h(f20Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= oq5Var.d(rbaVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= oq5Var.d(lzsVar.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= oq5Var.d(frsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 196608) == 0) {
            i5 |= oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i5 |= oq5Var.h(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= oq5Var.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i9 = i4 & 256;
        if (i9 != 0) {
            i5 |= 100663296;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            if ((i2 & 100663296) == 0) {
                i5 |= oq5Var.f(yciVar2) ? 67108864 : 33554432;
            }
        }
        int i10 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i10 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= oq5Var.d(c0gVar == null ? -1 : c0gVar.ordinal()) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i11 = i5;
        int i12 = i4 & 1024;
        if (i12 != 0) {
            i6 = i3 | 6;
            function05 = function04;
        } else {
            function05 = function04;
            if ((i3 & 6) == 0) {
                i6 = i3 | (oq5Var.h(function05) ? 4 : 2);
            } else {
                i6 = i3;
            }
        }
        if ((i3 & 48) == 0) {
            if ((i4 & 2048) == 0) {
                if (oq5Var.d(lzsVar2 != null ? lzsVar2.ordinal() : -1)) {
                    i8 = 32;
                    i6 |= i8;
                }
            }
            i8 = 16;
            i6 |= i8;
        }
        if ((306783379 & i11) == 306783378 && (i6 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            c0gVar2 = c0gVar;
            lzsVar4 = lzsVar2;
            yciVar6 = yciVar2;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                yciVar3 = i9 != 0 ? vci.a : yciVar2;
                c0g c0gVar3 = i10 != 0 ? c0g.a : c0gVar;
                if (i12 != 0) {
                    function05 = null;
                }
                if ((i4 & 2048) != 0) {
                    i6 &= -113;
                    lzsVar3 = lzsVar;
                } else {
                    lzsVar3 = lzsVar2;
                }
                i7 = i6;
                c0gVar2 = c0gVar3;
            } else {
                oq5Var.S();
                if ((i4 & 2048) != 0) {
                    i6 &= -113;
                }
                lzsVar3 = lzsVar2;
                yciVar3 = yciVar2;
                i7 = i6;
                c0gVar2 = c0gVar;
            }
            oq5Var.q();
            hg5 hg5Var = new hg5(f20Var.c, f20Var.d, f20Var.e, f20Var.f, f20Var.g);
            nxq nxqVar = nxq.c;
            int i13 = i11 << 3;
            int i14 = i11 >> 3;
            int i15 = ((i11 >> 24) & 14) | (i13 & 112) | (i14 & 896) | ((i11 << 6) & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016);
            if (f20Var.b) {
                yciVar4 = yciVar3;
                str = vz1.n(oq5Var, -1251606252, R.string.popular_track_description, oq5Var, false);
            } else {
                yciVar4 = yciVar3;
                oq5Var.Z(-145027294);
                oq5Var.p(false);
                str = null;
            }
            if (f20Var.f != null) {
                str2 = vz1.n(oq5Var, -1251599612, R.string.explicit_element_content_description, oq5Var, false);
            } else {
                oq5Var.Z(-144806078);
                oq5Var.p(false);
                str2 = null;
            }
            int ordinal = rbaVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    n2 = vz1.n(oq5Var, -1251593385, R.string.downloading_description, oq5Var, false);
                } else {
                    if (ordinal != 2) {
                        throw vz1.i(oq5Var, -1251595653, false);
                    }
                    n2 = vz1.n(oq5Var, -1251590730, R.string.downloaded_description, oq5Var, false);
                }
                str3 = n2;
            } else {
                oq5Var.Z(-144717790);
                oq5Var.p(false);
                str3 = null;
            }
            yci yciVar7 = yciVar4;
            yci e0 = qgg.e0(yciVar7, frsVar.b(), function03, q5t.a, null, c0g.a, null);
            boolean f2 = ((((i15 & 57344) ^ 24576) > 16384 && oq5Var.f(function0)) || (i15 & 24576) == 16384) | ((((i15 & 112) ^ 48) > 32 && oq5Var.h(f20Var)) || (i15 & 48) == 32) | oq5Var.f(str) | oq5Var.f(str2) | oq5Var.f(str3) | ((((i15 & 458752) ^ 196608) > 131072 && oq5Var.f(function02)) || (i15 & 196608) == 131072);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                f20Var2 = f20Var;
                yciVar5 = e0;
                m10Var = new m10(f20Var2, function02, str, str2, str3, function0);
                oq5Var.k0(m10Var);
            } else {
                yciVar5 = e0;
                m10Var = K;
                f20Var2 = f20Var;
            }
            t7g.c(hg5Var, rbaVar, lzsVar, frsVar, z, nxqVar, function0, function02, function03, nfp.a(yciVar5, (Function1) m10Var), c0gVar2, function05, ild.C(-1932180571, new o10(f20Var2, lzsVar3), oq5Var), oq5Var, 196608 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024), ((i11 >> 27) & 14) | 384 | ((i7 << 3) & 112), 0);
            yciVar6 = yciVar7;
            lzsVar4 = lzsVar3;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: p10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i2 | 1);
                    int R2 = rvf.R(i3);
                    ksw.b(f20.this, rbaVar, lzsVar, frsVar, z, function0, function02, function03, yciVar6, c0gVar2, function05, lzsVar4, (hq5) obj, R, R2, i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(f20 f20Var, lzs lzsVar, hq5 hq5Var, int i2) {
        kb5 kb5Var;
        kb5 kb5Var2;
        boolean z;
        kb5 kb5Var3;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2087707820);
        if ((((oq5Var.f(f20Var) ? 4 : 2) | i2 | (oq5Var.d(lzsVar.ordinal()) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d2 = ug3.d(b2c.e, false);
            int i3 = oq5Var.P;
            a l2 = oq5Var.l();
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
            kb5 kb5Var4 = wp5.f;
            g0g.U(oq5Var, d2, kb5Var4);
            kb5 kb5Var5 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var5);
            kb5 kb5Var6 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var6);
            }
            kb5 kb5Var7 = wp5.d;
            g0g.U(oq5Var, H, kb5Var7);
            if (f20Var.b) {
                oq5Var.Z(1769708234);
                kb5Var2 = kb5Var7;
                kb5Var3 = kb5Var6;
                kb5Var = kb5Var5;
                gae.b(a0g.E(R.drawable.ic_lightning_16, 0, oq5Var), rvf.M(R.string.popular_track_description, oq5Var), d.m(androidx.compose.foundation.layout.a.q(androidx.compose.ui.platform.a.a(vciVar, "album_track_popular"), 4, 0.0f, 0.0f, 0.0f, 14), 16), ((dq0) oq5Var.j(eq0.a)).a.d, oq5Var, 384, 0);
                oq5Var = oq5Var;
                z = false;
            } else {
                kb5Var = kb5Var5;
                kb5Var2 = kb5Var7;
                z = false;
                kb5Var3 = kb5Var6;
                oq5Var.Z(1758561812);
            }
            oq5Var.p(z);
            float f2 = 16;
            yci r2 = d.r(androidx.compose.foundation.layout.a.q(vciVar, 20, 0.0f, 0.0f, 0.0f, 14), f2);
            kfh d3 = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, r2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var4);
            g0g.U(oq5Var, l3, kb5Var);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var2);
            if (lzsVar != lzs.a) {
                oq5Var.Z(836506992);
                orl.a(48, 4, 0L, oq5Var, d.m(vciVar, 12), lzsVar == lzs.b);
                oq5Var.p(false);
                z2 = true;
            } else {
                oq5Var.Z(836740639);
                String valueOf = String.valueOf(f20Var.a);
                long j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                oq5 oq5Var2 = oq5Var;
                xcs.b(valueOf, androidx.compose.ui.platform.a.a(d.z(d.r(vciVar, f2), 1), "track_album_position"), j2, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.i(), oq5Var2, 48, 3072, 57336);
                oq5Var = oq5Var2;
                oq5Var.p(false);
                z2 = true;
            }
            oq5Var.p(z2);
            oq5Var.p(z2);
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            r3.d = new o10(f20Var, lzsVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i2, int i3, hq5 hq5Var, yci yciVar, boolean z) {
        int i4;
        yci yciVar2;
        Object K;
        kjn kjnVar;
        Object K2;
        oq5 oq5Var;
        yci yciVar3;
        xmn r2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-57730132);
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var2.g(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 32 : 16;
            if ((i4 & 19) == 18 || !oq5Var2.z()) {
                yci yciVar4 = i5 == 0 ? vci.a : yciVar2;
                int i6 = i4;
                zyj zyjVar = zyj.a;
                rba rbaVar = rba.a;
                lzs lzsVar = lzs.a;
                nxq nxqVar = nxq.b;
                K = oq5Var2.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new s2(22);
                    oq5Var2.k0(K);
                }
                Function0 function0 = (Function0) K;
                K2 = oq5Var2.K();
                if (K2 == kjnVar) {
                    K2 = new s2(23);
                    oq5Var2.k0(K2);
                }
                oq5Var = oq5Var2;
                qgg.l(zyjVar, rbaVar, lzsVar, false, true, function0, null, (Function0) K2, ltg.d, ild.C(4752627, new sm(1, z), oq5Var2), yciVar4, nxqVar, null, null, null, null, 0L, 0L, null, null, false, oq5Var, 920350134, ((i6 >> 3) & 14) | 48, 0, 2093056);
                yciVar3 = yciVar4;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                yciVar3 = yciVar2;
            }
            r2 = oq5Var.r();
            if (r2 == null) {
                r2.d = new n10(z, yciVar3, i2, i3, 0);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i4 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        int i62 = i4;
        zyj zyjVar2 = zyj.a;
        rba rbaVar2 = rba.a;
        lzs lzsVar2 = lzs.a;
        nxq nxqVar2 = nxq.b;
        K = oq5Var2.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        Function0 function02 = (Function0) K;
        K2 = oq5Var2.K();
        if (K2 == kjnVar) {
        }
        oq5Var = oq5Var2;
        qgg.l(zyjVar2, rbaVar2, lzsVar2, false, true, function02, null, (Function0) K2, ltg.d, ild.C(4752627, new sm(1, z), oq5Var2), yciVar4, nxqVar2, null, null, null, null, 0L, 0L, null, null, false, oq5Var, 920350134, ((i62 >> 3) & 14) | 48, 0, 2093056);
        yciVar3 = yciVar4;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static final void e(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1753684082);
        if (((i2 | 48) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            zyj zyjVar = zyj.a;
            rba rbaVar = rba.a;
            lzs lzsVar = lzs.a;
            nxq nxqVar = nxq.c;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new s2(20);
                oq5Var2.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new s2(21);
                oq5Var2.k0(K2);
            }
            wn5 wn5Var = ltg.c;
            wn5 C = ild.C(-1224965877, new sm(2, z), oq5Var2);
            oq5Var = oq5Var2;
            yciVar2 = vci.a;
            qgg.l(zyjVar, rbaVar, lzsVar, false, true, function0, null, (Function0) K2, wn5Var, C, yciVar2, nxqVar, null, null, null, null, 0L, 0L, null, null, false, oq5Var, 920350134, 54, 0, 2093056);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new q10(z, yciVar2, i2, 0);
        }
    }

    public static final void f(ib1 ib1Var, q0d q0dVar, z0d z0dVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        boolean z;
        List list = z0dVar.e;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-691438958);
        int i3 = i2 | (oq5Var2.h(q0dVar) ? 32 : 16) | (oq5Var2.f(z0dVar) ? 256 : 128);
        if (oq5Var2.P(i3 & 1, (i3 & 145) != 144)) {
            float f2 = ((Configuration) oq5Var2.j(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            cma cmaVar = new cma(f2);
            if (Float.compare(f2, 0) <= 0) {
                cmaVar = null;
            }
            float f3 = cmaVar != null ? cmaVar.a : Float.NaN;
            bs4 bs4Var = bs4.f;
            tgo C = o5g.C(oq5Var2);
            vci vciVar = vci.a;
            bs4Var.p(q0dVar, new d1d(hd6.a, false, false), androidx.compose.foundation.layout.a.d(d.q(xp3.u(vciVar, C), 0.0f, 0.0f, 0.0f, f3, 7), 1.0f), oq5Var2, (i3 >> 3) & 14);
            oq5Var = oq5Var2;
            if (list.size() <= 1 || !z0dVar.f) {
                z = false;
                oq5Var.Z(2656976);
            } else {
                oq5Var.Z(5947781);
                u1g.l(oq5Var, d.e(vciVar, 8));
                int i4 = z0dVar.b;
                IntRange intRange = z0dVar.d;
                boolean h2 = oq5Var.h(q0dVar);
                Object K = oq5Var.K();
                if (h2 || K == gq5.a) {
                    m5 m5Var = new m5(1, q0dVar, q0d.class, "onIndicatorRangeChanged", "onIndicatorRangeChanged(Lkotlin/ranges/IntRange;)V", 0, 15);
                    oq5Var.k0(m5Var);
                    K = m5Var;
                }
                int size = list.size();
                jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                float n0 = jx7Var.n0(3);
                float n02 = jx7Var.n0(2);
                float n03 = jx7Var.n0(1);
                float n04 = jx7Var.n0(4);
                agr agrVar = eq0.a;
                m2k m2kVar = new m2k(n0, n02, n03, n04, ((dq0) oq5Var.j(agrVar)).a.c, ((dq0) oq5Var.j(agrVar)).a.a, 4);
                z = false;
                ivf.j(i4, intRange, (Function1) ((h9f) K), size, m2kVar, null, oq5Var, 0, 32);
                oq5Var = oq5Var;
            }
            oq5Var.p(z);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new x3(ib1Var, q0dVar, z0dVar, i2, 21);
        }
    }

    public static final void g(ib1 ib1Var, hq5 hq5Var, int i2) {
        ib1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-666701261);
        int i3 = (oq5Var.f(ib1Var) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            q0d k2 = ib1Var.k();
            if (k2 == null) {
                oq5Var.Z(-1768307218);
            } else {
                oq5Var.Z(-1768307217);
                yci o2 = androidx.compose.foundation.layout.a.o(androidx.compose.ui.platform.a.a(vci.a, "artist_info_gallery_full"), 16, 0.0f, 2);
                ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                int i4 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, o2);
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
                a1d a1dVar = (a1d) szf.Q(k2.getState(), oq5Var).getValue();
                if (Intrinsics.d(a1dVar, y0d.a)) {
                    oq5Var.Z(1711175142);
                    oq5Var.p(false);
                } else if (a1dVar instanceof z0d) {
                    oq5Var.Z(1506876846);
                    f(ib1Var, k2, (z0d) a1dVar, oq5Var, i3 & 14);
                    oq5Var.p(false);
                } else {
                    if (!Intrinsics.d(a1dVar, x0d.a)) {
                        throw vz1.i(oq5Var, 1711172385, false);
                    }
                    oq5Var.Z(1711185670);
                    oq5Var.p(false);
                }
                oq5Var.p(true);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new q2(ib1Var, i2, 7);
        }
    }

    public static final void h(fvf fvfVar, fvf fvfVar2, hq5 hq5Var, int i2) {
        fvfVar.getClass();
        fvfVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1399113808);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2 | (oq5Var.f(fvfVar2) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            boolean z = (i4 == 4) | (i5 == 32);
            Object K = oq5Var.K();
            Continuation continuation = null;
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new ha2(fvfVar, fvfVar2, continuation, 0);
                oq5Var.k0(K);
            }
            gld.y(fvfVar, fvfVar2, (Function2) K, oq5Var);
            boolean z2 = (i5 == 32) | (i4 == 4);
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new ha2(fvfVar2, fvfVar, continuation, 1);
                oq5Var.k0(K2);
            }
            gld.y(fvfVar, fvfVar2, (Function2) K2, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new m32(fvfVar, fvfVar2, i2, 1);
        }
    }

    public static final void i(iab iabVar, o8w o8wVar, gvd gvdVar, hab habVar, tvd tvdVar, dib dibVar, Function0 function0, Function0 function02, pbu pbuVar, yci yciVar, Function0 function03, hq5 hq5Var, int i2, int i3) {
        hab habVar2;
        Function0 function04;
        pbu pbuVar2;
        Function0 function05;
        int i4;
        oq5 oq5Var;
        Function0 function06;
        Function0 function07;
        int i5;
        qo6 qo6Var = qo6.a;
        iabVar.getClass();
        gvdVar.getClass();
        tvdVar.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        pbuVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1645169050);
        int i6 = (oq5Var2.f(iabVar) ? 4 : 2) | i2 | (oq5Var2.f(o8wVar) ? 32 : 16) | (oq5Var2.f(gvdVar) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            habVar2 = habVar;
            i6 |= oq5Var2.f(habVar2) ? 2048 : 1024;
        } else {
            habVar2 = habVar;
        }
        int i7 = i6 | (oq5Var2.f(tvdVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(dibVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((1572864 & i2) == 0) {
            function04 = function0;
            i7 |= oq5Var2.h(function04) ? 1048576 : 524288;
        } else {
            function04 = function0;
        }
        if ((12582912 & i2) == 0) {
            i7 |= oq5Var2.h(function02) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            pbuVar2 = pbuVar;
            i7 |= oq5Var2.f(pbuVar2) ? 67108864 : 33554432;
        } else {
            pbuVar2 = pbuVar;
        }
        int i8 = i3 & 2048;
        if (i8 != 0) {
            i4 = 54;
            function05 = function03;
        } else {
            function05 = function03;
            i4 = 6 | (oq5Var2.h(function05) ? ' ' : (char) 16);
        }
        if (oq5Var2.P(i7 & 1, ((i7 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            Function0 function08 = i8 != 0 ? null : function05;
            boolean z = o8wVar.a;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var2.Z(1359904518);
                boolean z2 = (i7 & 896) == 256;
                Object K = oq5Var2.K();
                if (z2 || K == kjnVar) {
                    K = new vz(23, gvdVar);
                    oq5Var2.k0(K);
                }
                function07 = (Function0) K;
                oq5Var2.p(false);
                i5 = 0;
            } else {
                if (z) {
                    throw vz1.i(oq5Var2, 459508181, false);
                }
                oq5Var2.Z(1359990884);
                long j2 = ((dq0) oq5Var2.j(eq0.a)).c.d;
                boolean e2 = oq5Var2.e(j2) | ((i7 & 896) == 256);
                Object K2 = oq5Var2.K();
                if (e2 || K2 == kjnVar) {
                    K2 = new mm0(j2, gvdVar, 2);
                    oq5Var2.k0(K2);
                }
                function07 = (Function0) K2;
                i5 = 0;
                oq5Var2.p(false);
            }
            oq5Var = oq5Var2;
            pd.b(new qzm[i5], true, ild.C(-632014397, new ma3(yciVar, function07, tvdVar, iabVar, o8wVar, habVar2, function02, gvdVar, pbuVar2, function04, dibVar, function08), oq5Var2), oq5Var, 432, 0);
            function06 = function08;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            function06 = function05;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ka3(iabVar, o8wVar, gvdVar, habVar, tvdVar, dibVar, function0, function02, pbuVar, yciVar, function06, i2, i3);
        }
    }

    public static final void j(int i2, hq5 hq5Var, yci yciVar, Function1 function1) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            u1g.l(oq5Var, androidx.compose.ui.draw.a.a(yciVar, function1));
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kg0(yciVar, function1, i2, 3);
        }
    }

    public static final void k(yci yciVar, String str, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1162737955);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function1) ? 256 : 128;
        }
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            yci a2 = androidx.compose.ui.draw.a.a(yciVar, function1);
            boolean z = (i3 & 112) == 32;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new r23(str, 2);
                oq5Var.k0(K);
            }
            u1g.l(oq5Var, nfp.b(a2, false, (Function1) K));
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ig0(yciVar, str, function1, i2, 2);
        }
    }

    public static final void l(i31 i31Var, yci yciVar, hq5 hq5Var, int i2) {
        i31Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(299924497);
        if (((i2 | (oq5Var.f(i31Var) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
            int i3 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            yci a3 = androidx.compose.ui.platform.a.a(vciVar, "concert_item_month");
            String str = i31Var.d;
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            xcs.b(str, a3, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j2, oq5Var, 48, 0, 65528);
            xcs.b(i31Var.e, androidx.compose.ui.platform.a.a(vciVar, "concert_item_day_of_month"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.d(), oq5Var, 48, 0, 65528);
            xcs.b(i31Var.f, androidx.compose.ui.platform.a.a(vciVar, "concert_item_day_of_week"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new m32(i31Var, yciVar, i2, 29);
        }
    }

    public static final void m(h31 h31Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var;
        h31Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-633103603);
        int i3 = (oq5Var2.h(h31Var) ? 4 : 2) | i2 | (oq5Var2.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            i31 i31Var = (i31) szf.Q(h31Var.d, oq5Var2).getValue();
            boolean h2 = oq5Var2.h(h31Var);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                e65 e65Var = new e65(0, h31Var, h31.class, "onClick", "onClick()V", 0, 7);
                oq5Var2.k0(e65Var);
                K = e65Var;
            }
            h9f h9fVar = (h9f) K;
            boolean h3 = oq5Var2.h(h31Var);
            Object K2 = oq5Var2.K();
            if (h3 || K2 == kjnVar) {
                e65 e65Var2 = new e65(0, h31Var, h31.class, "onPriceClick", "onPriceClick()V", 0, 9);
                oq5Var2.k0(e65Var2);
                K2 = e65Var2;
            }
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
            o(h31Var.c, i31Var, (Function0) h9fVar, (Function0) ((h9f) K2), yciVar2, null, oq5Var, (i3 << 9) & 57344);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kw5(h31Var, yciVar2, i2, 1);
        }
    }

    public static final void n(i31 i31Var, wn5 wn5Var, Function0 function0, Function0 function02, boolean z, yci yciVar, pyc pycVar, boolean z2, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        Function0 function03;
        yci yciVar2;
        boolean z3;
        boolean z4;
        i31Var.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1308271027);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(i31Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function03 = function0;
            i3 |= oq5Var.h(function03) ? 256 : 128;
        } else {
            function03 = function0;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            yciVar2 = yciVar;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.h(pycVar) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if ((100663296 & i2) == 0) {
            i4 |= oq5Var.f(o0kVar) ? 67108864 : 33554432;
        }
        if ((38347923 & i4) == 38347922 && oq5Var.z()) {
            oq5Var.S();
            z4 = z2;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                z3 = true;
            } else {
                oq5Var.S();
                z3 = z2;
            }
            oq5Var.q();
            yci l2 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.e(yciVar2, false, null, null, function03, 7), o0kVar);
            hz2 hz2Var = b2c.l;
            nho a2 = lho.a(qx0.g, hz2Var, oq5Var, 54);
            int i5 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H = vnj.H(oq5Var, l2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            int i6 = i4;
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l3, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            boolean z5 = z3;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i7 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l4, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var.invoke(i31Var, oq5Var, Integer.valueOf(i6 & 126));
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.r(vciVar, 8));
            pycVar.invoke(i31Var, oq5Var, Integer.valueOf((i6 & 14) | ((i6 >> 15) & 112)));
            oq5Var.p(true);
            u1g.l(oq5Var, d.r(vciVar, 20));
            z(((i6 >> 6) & 112) | ((i6 >> 12) & 7168), oq5Var, null, i31Var.j, function02, z5);
            oq5Var.p(true);
            z4 = z5;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new u43(i31Var, wn5Var, function0, function02, z, yciVar, pycVar, z4, o0kVar, i2);
        }
    }

    public static final void o(boolean z, i31 i31Var, Function0 function0, Function0 function02, yci yciVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        Function0 function03;
        Function0 function04;
        o0k q0kVar;
        int i4;
        o0k o0kVar2;
        i31Var.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-650318633);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(i31Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function03 = function0;
            i3 |= oq5Var.h(function03) ? 256 : 128;
        } else {
            function03 = function0;
        }
        if ((i2 & 3072) == 0) {
            function04 = function02;
            i3 |= oq5Var.h(function04) ? 2048 : 1024;
        } else {
            function04 = function02;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
            o0kVar2 = o0kVar;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                float f2 = 14;
                float f3 = 16;
                q0kVar = new q0k(f3, f2, f3, f2);
                i4 = i3 & (-458753);
            } else {
                oq5Var.S();
                i4 = i3 & (-458753);
                q0kVar = o0kVar;
            }
            oq5Var.q();
            o0k o0kVar3 = q0kVar;
            n(i31Var, ild.C(2016125567, new o91(z, i31Var, 3), oq5Var), function03, function04, z, yciVar, ild.C(976300100, new xu0(7, z), oq5Var), false, o0kVar3, oq5Var, (14 & (i4 >> 3)) | 1572912 | (i4 & 896) | (i4 & 7168) | ((i4 << 12) & 57344) | ((i4 << 3) & 458752));
            o0kVar2 = o0kVar3;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new dq(z, i31Var, function0, function02, yciVar, o0kVar2, i2, 7);
        }
    }

    public static final void p(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        boolean z2 = z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(424263440);
        int i3 = (oq5Var.g(z2) ? 4 : 2) | i2;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci n2 = androidx.compose.foundation.layout.a.n(yciVar, 16, 14);
            hz2 hz2Var = b2c.l;
            nho a2 = lho.a(qx0.g, hz2Var, oq5Var, 54);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, n2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(false, 1.0f);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            float P = ff7.P(v7g.z(68), oq5Var) + 12;
            vci vciVar = vci.a;
            int i6 = i3 & 14;
            ivf.k(i6, 0, oq5Var, xp3.u(d.o(vciVar, 59, P), o5g.F(oq5Var)), z2);
            u1g.l(oq5Var, d.r(vciVar, 8));
            ta5 a4 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i7 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var);
            g0g.U(oq5Var, l4, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            int i8 = i6 | 48;
            ivf.l(z2, d.r(vciVar, 150), nu0.j(), oq5Var, i8, 0);
            u1g.l(oq5Var, d.e(vciVar, 4));
            z2 = z;
            ivf.l(z2, d.r(vciVar, 97), nu0.j(), oq5Var, i8, 0);
            oq5Var.p(true);
            oq5Var.p(true);
            u1g.l(oq5Var, d.r(vciVar, 20));
            ivf.k(i6, 0, oq5Var, xp3.u(d.o(vciVar, 100, 28), ugo.a), z2);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new q10(z2, yciVar, i2, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.K(), java.lang.Integer.valueOf(r14)) == false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(boolean z, String str, su5 su5Var, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        boolean z2;
        boolean z3;
        xmn r2;
        lw5 lw5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-298939039);
        int w2 = oq5Var2.w();
        int i4 = i2 | (oq5Var2.g(z) ? 4 : 2) | (oq5Var2.f(str) ? 32 : 16) | (oq5Var2.d(su5Var.ordinal()) ? 256 : 128) | (oq5Var2.f(str2) ? 2048 : 1024) | (oq5Var2.f(str3) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(str4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(str5) ? 1048576 : 524288) | (oq5Var2.f(null) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.f(str6) ? 67108864 : 33554432) | (oq5Var2.f(num) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        char c2 = oq5Var2.f(str7) ? (char) 4 : (char) 2;
        if ((i4 & 306783379) == 306783378 && (c2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean z4 = (i4 & 112) == 32;
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (z4 || K == obj) {
                K = szf.g0(Boolean.FALSE);
                oq5Var2.k0(K);
            }
            aqi aqiVar = (aqi) K;
            ta5 a2 = sa5.a(qx0.e, b2c.n, oq5Var2, 6);
            int i5 = oq5Var2.P;
            a l2 = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function0);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O) {
                i3 = i4;
            } else {
                i3 = i4;
            }
            ouj.x(i5, oq5Var2, i5, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            oq5Var2.Z(-1470018291);
            if (!z) {
                oq5Var2.Z(-1470073937);
                r(str3, str4, str5, str6, oq5Var2, (i3 >> 12) & 65534);
                oq5Var2.t(w2);
                r2 = oq5Var2.r();
                if (r2 != null) {
                    lw5Var = new lw5(z, str, su5Var, str2, str3, str4, str5, str6, num, str7, i2, 0);
                    r2.d = lw5Var;
                }
                return;
            }
            oq5Var2.Z(-1480529865);
            oq5Var2.p(false);
            yci a3 = androidx.compose.ui.platform.a.a(vciVar, "concert_item_title");
            List c3 = t75.c(str);
            ges j2 = nu0.j();
            ozm ozmVar = eq0.a;
            long j3 = ((dq0) oq5Var2.j(ozmVar)).b.a;
            int i6 = num == null ? 2 : 1;
            boolean f2 = oq5Var2.f(aqiVar);
            Object K2 = oq5Var2.K();
            if (f2 || K2 == obj) {
                K2 = new x80(aqiVar, 11);
                oq5Var2.k0(K2);
            }
            m3f.a(c3, a3, j3, 0L, 0L, 0, 0L, i6, (Function1) K2, j2, oq5Var2, 48, 0, 2040);
            bg3.a(null, null, false, ild.C(962287637, new up(str2, su5Var, num, aqiVar, 14), oq5Var2), oq5Var2, 3072, 7);
            xv7.i(new mn0(6, str3, (ArrayList) null), androidx.compose.ui.platform.a.a(vciVar, "concert_item_event_city"), ((dq0) oq5Var2.j(ozmVar)).b.b, 0L, 0L, 0, 0L, 2, false, (((Boolean) aqiVar.getValue()).booleanValue() || num != null) ? 1 : 2, 0, null, null, nu0.j(), null, null, oq5Var2, 48, 48, 907256);
            oq5Var = oq5Var2;
            if (num != null) {
                oq5Var.Z(-1468203273);
                hz2 hz2Var = b2c.l;
                yci D = D(androidx.compose.ui.platform.a.a(vciVar, "concert_item_cashback"), str7, null);
                nho a4 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                int i7 = oq5Var.P;
                a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, D);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(function0);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a4, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                gae.b(a0g.E(R.drawable.ic_plus_12, 0, oq5Var), null, d.m(vciVar, 12), ((dq0) oq5Var.j(ozmVar)).b.a, oq5Var, 432, 0);
                u1g.l(oq5Var, d.r(vciVar, 4));
                xcs.b(num + "%", null, ((dq0) oq5Var.j(ozmVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 0, 3120, 55290);
                oq5Var = oq5Var;
                z2 = true;
                oq5Var.p(true);
                z3 = false;
            } else {
                z2 = true;
                z3 = false;
                oq5Var.Z(-1480529865);
            }
            oq5Var.p(z3);
            oq5Var.p(z3);
            oq5Var.p(z2);
        }
        r2 = oq5Var.r();
        if (r2 != null) {
            lw5Var = new lw5(z, str, su5Var, str2, str3, str4, str5, str6, num, str7, i2, 1);
            r2.d = lw5Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [hq5, oq5] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void r(String str, String str2, String str3, String str4, hq5 hq5Var, int i2) {
        String str5;
        int i3;
        boolean z;
        int i4;
        int i5;
        vci vciVar;
        int i6;
        agr agrVar;
        oq5 oq5Var;
        oq5 oq5Var2;
        ?? r11 = (oq5) hq5Var;
        r11.b0(1334410419);
        if ((i2 & 6) == 0) {
            str5 = str;
            i3 = (r11.f(str5) ? 4 : 2) | i2;
        } else {
            str5 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= r11.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= r11.f(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= r11.f(null) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= r11.f(str4) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && r11.z()) {
            r11.S();
            oq5Var2 = r11;
        } else {
            boolean z2 = (i3 & 14) == 4;
            Object K = r11.K();
            Object obj = gq5.a;
            if (z2 || K == obj) {
                K = szf.g0(Boolean.FALSE);
                r11.k0(K);
            }
            aqi aqiVar = (aqi) K;
            vci vciVar2 = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(vciVar2, "concert_item_city");
            List c2 = t75.c(str5);
            ges j2 = nu0.j();
            agr agrVar2 = eq0.a;
            int i7 = i3;
            long j3 = ((dq0) r11.j(agrVar2)).b.a;
            int i8 = str4 == null ? 2 : 1;
            boolean f2 = r11.f(aqiVar);
            Object K2 = r11.K();
            if (f2 || K2 == obj) {
                K2 = new x80(aqiVar, 9);
                r11.k0(K2);
            }
            boolean z3 = true;
            m3f.a(c2, a2, j3, 0L, 0L, 0, 0L, i8, (Function1) K2, j2, r11, 48, 0, 2040);
            oq5 oq5Var3 = r11;
            if (str2 != null) {
                oq5Var3.Z(-795913693);
                i4 = i7;
                z3 = true;
                z = 0;
                i5 = 4;
                bg3.a(null, null, false, ild.C(-180672606, new up(str3, str2, str4, aqiVar, 12), oq5Var3), oq5Var3, 3072, 7);
                oq5Var3.p(false);
                i6 = 48;
                agrVar = agrVar2;
                vciVar = vciVar2;
                oq5Var = oq5Var3;
            } else {
                z = 0;
                i4 = i7;
                i5 = 4;
                oq5Var3.Z(-795294096);
                vciVar = vciVar2;
                i6 = 48;
                agrVar = agrVar2;
                xcs.b(str3, androidx.compose.ui.platform.a.a(vciVar, "concert_item_long_place"), ((dq0) oq5Var3.j(agrVar2)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.j(), oq5Var3, ((i4 >> 6) & 14) | 48, 3072, 57336);
                oq5 oq5Var4 = oq5Var3;
                oq5Var4.p(false);
                oq5Var = oq5Var4;
            }
            if (str4 != null) {
                oq5Var.Z(-794974827);
                u1g.l(oq5Var, d.e(vciVar, 8));
                yci a3 = androidx.compose.ui.platform.a.a(vciVar, "cashback");
                nho a4 = lho.a(qx0.a, b2c.l, oq5Var, i6);
                int i9 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, a3);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a4, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var, i9, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                oq5 oq5Var5 = oq5Var;
                gae.b(a0g.E(R.drawable.ic_plus_12, z, oq5Var), null, d.m(vciVar, 12), ((dq0) oq5Var.j(agrVar)).b.a, oq5Var5, 432, 0);
                u1g.l(oq5Var5, d.r(vciVar, i5));
                xcs.b(str4, null, ((dq0) oq5Var5.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var5, (i4 >> 12) & 14, 3120, 55290);
                oq5 oq5Var6 = oq5Var5;
                oq5Var6.p(true);
                oq5Var6.p(false);
                oq5Var2 = oq5Var6;
            } else {
                oq5Var.Z(-809757425);
                oq5Var.p(z);
                oq5Var2 = oq5Var;
            }
        }
        xmn r2 = oq5Var2.r();
        if (r2 != null) {
            r2.d = new uu(str, str2, false, str3, str4, i2, 23);
        }
    }

    public static final void s(cvl cvlVar, kr6 kr6Var, Function0 function0, Function1 function1, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        kr6Var.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(437005995);
        int i3 = i2 | (oq5Var2.h(cvlVar) ? 4 : 2) | (oq5Var2.h(kr6Var) ? 32 : 16) | (oq5Var2.h(function0) ? 256 : 128) | (oq5Var2.h(function1) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            rr6 rr6Var = (rr6) gld.O(kr6Var.b, oq5Var2).getValue();
            boolean z4 = rr6Var instanceof qr6;
            kjn kjnVar = gq5.a;
            if (z4) {
                oq5Var2.Z(800091802);
                String M = rvf.M(cvlVar == null ? R.string.new_playlist_text : R.string.rename_playlist_dialog_title, oq5Var2);
                qr6 qr6Var = (qr6) rr6Var;
                String str2 = qr6Var.a;
                boolean z5 = qr6Var.b;
                boolean z6 = qr6Var.c;
                boolean h2 = oq5Var2.h(kr6Var);
                Object K = oq5Var2.K();
                if (h2 || K == kjnVar) {
                    z = z5;
                    z2 = z6;
                    str = str2;
                    z3 = false;
                    mt4 mt4Var = new mt4(1, kr6Var, kr6.class, "onTextChanged", "onTextChanged(Ljava/lang/String;)V", 0, 27);
                    oq5Var2.k0(mt4Var);
                    K = mt4Var;
                } else {
                    str = str2;
                    z = z5;
                    z3 = false;
                    z2 = z6;
                }
                Function1 function12 = (Function1) ((h9f) K);
                boolean h3 = ((i3 & 896) == 256 ? true : z3) | oq5Var2.h(kr6Var);
                Object K2 = oq5Var2.K();
                if (h3 || K2 == kjnVar) {
                    K2 = new aw5(11, kr6Var, function0);
                    oq5Var2.k0(K2);
                }
                Function0 function02 = (Function0) K2;
                boolean h4 = oq5Var2.h(kr6Var);
                Object K3 = oq5Var2.K();
                if (h4 || K3 == kjnVar) {
                    ej6 ej6Var = new ej6(0, kr6Var, kr6.class, "onOkClick", "onOkClick()V", 0, 11);
                    oq5Var2.k0(ej6Var);
                    K3 = ej6Var;
                }
                oq5Var = oq5Var2;
                t(M, str, z, z2, function12, function02, (Function0) ((h9f) K3), oq5Var, 0);
                oq5Var.p(z3);
            } else {
                oq5Var = oq5Var2;
                Continuation continuation = null;
                if (rr6Var instanceof pr6) {
                    oq5Var.Z(800885123);
                    boolean h5 = oq5Var.h(rr6Var) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
                    Object K4 = oq5Var.K();
                    if (h5 || K4 == kjnVar) {
                        n71 n71Var = new n71((pr6) rr6Var, function1, function0, continuation, 4);
                        oq5Var.k0(n71Var);
                        K4 = n71Var;
                    }
                    gld.w(oq5Var, rr6Var, (Function2) K4);
                    oq5Var.p(false);
                } else {
                    if (!Intrinsics.d(rr6Var, or6.a)) {
                        throw vz1.i(oq5Var, -944023830, false);
                    }
                    oq5Var.Z(801140191);
                    Unit unit = Unit.a;
                    boolean z7 = (i3 & 896) == 256;
                    Object K5 = oq5Var.K();
                    if (z7 || K5 == kjnVar) {
                        K5 = new om0(function0, continuation, 1);
                        oq5Var.k0(K5);
                    }
                    gld.w(oq5Var, unit, (Function2) K5);
                    oq5Var.p(false);
                }
            }
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new av5(i2, 7, cvlVar, kr6Var, function0, function1);
        }
    }

    public static final void t(final String str, final String str2, final boolean z, final boolean z2, final Function1 function1, final Function0 function0, final Function0 function02, hq5 hq5Var, final int i2) {
        int i3;
        String str3;
        Function1 function12;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1703546263);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str3 = str2;
            i3 |= oq5Var2.f(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function12 = function1;
            i3 |= oq5Var2.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function12 = function1;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.h(function0) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var2.h(function02) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            final c3r c3rVar = (c3r) oq5Var2.j(es5.p);
            yci a2 = androidx.compose.ui.platform.a.a(vci.a, "create_edit_playlist_dialog");
            boolean z3 = ((i3 & 7168) == 2048) | ((i3 & 458752) == 131072);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                K = new fr6(0, function0, z2);
                oq5Var2.k0(K);
            }
            Function0 function03 = (Function0) K;
            final int i4 = 0;
            wn5 C = ild.C(-2135258847, new Function2() { // from class: gr6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            nho a3 = lho.a(qx0.a, b2c.k, hq5Var2, 0);
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            int i5 = oq5Var4.P;
                            a l2 = oq5Var4.l();
                            vci vciVar = vci.a;
                            yci H = vnj.H(hq5Var2, vciVar);
                            xp5.T.getClass();
                            Function0 function04 = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(function04);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var2, a3, wp5.f);
                            g0g.U(hq5Var2, l2, wp5.e);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i5))) {
                                ouj.x(i5, oq5Var4, i5, kb5Var);
                            }
                            g0g.U(hq5Var2, H, wp5.d);
                            yci a4 = androidx.compose.ui.platform.a.a(vciVar, "playlist_dialog_ok_button");
                            final c3r c3rVar2 = c3rVar;
                            boolean f2 = oq5Var4.f(c3rVar2);
                            final Function0 function05 = function02;
                            boolean f3 = f2 | oq5Var4.f(function05);
                            Object K2 = oq5Var4.K();
                            if (f3 || K2 == gq5.a) {
                                final int i6 = 1;
                                K2 = new Function0() { // from class: jr6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i6) {
                                            case 0:
                                                c3r c3rVar3 = c3rVar2;
                                                if (c3rVar3 != null) {
                                                    ((nw7) c3rVar3).a();
                                                }
                                                function05.invoke();
                                                break;
                                            default:
                                                c3r c3rVar4 = c3rVar2;
                                                if (c3rVar4 != null) {
                                                    ((nw7) c3rVar4).a();
                                                }
                                                function05.invoke();
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var4.k0(K2);
                            }
                            xee.q((Function0) K2, a4, z, null, x97.b, hq5Var2, 805306416, 504);
                            oq5Var4.p(true);
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var5 = (oq5) hq5Var3;
                                if (oq5Var5.z()) {
                                    oq5Var5.S();
                                    break;
                                }
                            }
                            yci a5 = androidx.compose.ui.platform.a.a(vci.a, "playlist_dialog_cancel_button");
                            oq5 oq5Var6 = (oq5) hq5Var3;
                            final c3r c3rVar3 = c3rVar;
                            boolean f4 = oq5Var6.f(c3rVar3);
                            final Function0 function06 = function02;
                            boolean f5 = f4 | oq5Var6.f(function06);
                            Object K3 = oq5Var6.K();
                            if (f5 || K3 == gq5.a) {
                                final int i7 = 0;
                                K3 = new Function0() { // from class: jr6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i7) {
                                            case 0:
                                                c3r c3rVar32 = c3rVar3;
                                                if (c3rVar32 != null) {
                                                    ((nw7) c3rVar32).a();
                                                }
                                                function06.invoke();
                                                break;
                                            default:
                                                c3r c3rVar4 = c3rVar3;
                                                if (c3rVar4 != null) {
                                                    ((nw7) c3rVar4).a();
                                                }
                                                function06.invoke();
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var6.k0(K3);
                            }
                            xee.q((Function0) K3, a5, z, null, x97.c, oq5Var6, 805306416, 504);
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var2);
            final int i5 = 1;
            up6.b(function03, C, a2, ild.C(453578847, new Function2() { // from class: gr6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            nho a3 = lho.a(qx0.a, b2c.k, hq5Var2, 0);
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            int i52 = oq5Var4.P;
                            a l2 = oq5Var4.l();
                            vci vciVar = vci.a;
                            yci H = vnj.H(hq5Var2, vciVar);
                            xp5.T.getClass();
                            Function0 function04 = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(function04);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var2, a3, wp5.f);
                            g0g.U(hq5Var2, l2, wp5.e);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i52))) {
                                ouj.x(i52, oq5Var4, i52, kb5Var);
                            }
                            g0g.U(hq5Var2, H, wp5.d);
                            yci a4 = androidx.compose.ui.platform.a.a(vciVar, "playlist_dialog_ok_button");
                            final c3r c3rVar2 = c3rVar;
                            boolean f2 = oq5Var4.f(c3rVar2);
                            final Function0 function05 = function0;
                            boolean f3 = f2 | oq5Var4.f(function05);
                            Object K2 = oq5Var4.K();
                            if (f3 || K2 == gq5.a) {
                                final int i6 = 1;
                                K2 = new Function0() { // from class: jr6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i6) {
                                            case 0:
                                                c3r c3rVar32 = c3rVar2;
                                                if (c3rVar32 != null) {
                                                    ((nw7) c3rVar32).a();
                                                }
                                                function05.invoke();
                                                break;
                                            default:
                                                c3r c3rVar4 = c3rVar2;
                                                if (c3rVar4 != null) {
                                                    ((nw7) c3rVar4).a();
                                                }
                                                function05.invoke();
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var4.k0(K2);
                            }
                            xee.q((Function0) K2, a4, z2, null, x97.b, hq5Var2, 805306416, 504);
                            oq5Var4.p(true);
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var5 = (oq5) hq5Var3;
                                if (oq5Var5.z()) {
                                    oq5Var5.S();
                                    break;
                                }
                            }
                            yci a5 = androidx.compose.ui.platform.a.a(vci.a, "playlist_dialog_cancel_button");
                            oq5 oq5Var6 = (oq5) hq5Var3;
                            final c3r c3rVar3 = c3rVar;
                            boolean f4 = oq5Var6.f(c3rVar3);
                            final Function0 function06 = function0;
                            boolean f5 = f4 | oq5Var6.f(function06);
                            Object K3 = oq5Var6.K();
                            if (f5 || K3 == gq5.a) {
                                final int i7 = 0;
                                K3 = new Function0() { // from class: jr6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i7) {
                                            case 0:
                                                c3r c3rVar32 = c3rVar3;
                                                if (c3rVar32 != null) {
                                                    ((nw7) c3rVar32).a();
                                                }
                                                function06.invoke();
                                                break;
                                            default:
                                                c3r c3rVar4 = c3rVar3;
                                                if (c3rVar4 != null) {
                                                    ((nw7) c3rVar4).a();
                                                }
                                                function06.invoke();
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var6.k0(K3);
                            }
                            xee.q((Function0) K3, a5, z2, null, x97.c, oq5Var6, 805306416, 504);
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var2), ild.C(-1252550755, new hr6(str, str3, z, c3rVar, function02, function12, z2), oq5Var2), null, 0L, 0L, null, oq5Var2, 200112, 976);
            oq5Var = oq5Var2;
            Unit unit = Unit.a;
            boolean f2 = oq5Var.f(c3rVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new ox1(c3rVar, null, 12);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, unit, (Function2) K2);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: ir6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ksw.t(str, str2, z, z2, function1, function0, function02, (hq5) obj, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void u(xha xhaVar, hq5 hq5Var, int i2) {
        int i3;
        xhaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(980880207);
        int i4 = (oq5Var.h(xhaVar) ? 4 : 2) | i2;
        if (oq5Var.P(i4 & 1, (i4 & 3) != 2)) {
            cia ciaVar = (cia) szf.Q(xhaVar.h, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h2 = oq5Var.h(xhaVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                dda ddaVar = new dda(0, xhaVar, xha.class, "onBackClicked", "onBackClicked()V", 0, 13);
                oq5Var.k0(ddaVar);
                K = ddaVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(xhaVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                dda ddaVar2 = new dda(0, xhaVar, xha.class, "onSearchClicked", "onSearchClicked()V", 0, 14);
                oq5Var.k0(ddaVar2);
                K2 = ddaVar2;
            }
            i3 = 0;
            kg5.g(R.string.downloaded_podcasts, a2, function0, (Function0) ((h9f) K2), null, ild.C(1132498050, new xk(27, ciaVar, xhaVar, a2), oq5Var), oq5Var, 196608, 16);
        } else {
            i3 = 0;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new nha(xhaVar, i2, i3);
        }
    }

    public static final void v(q0d q0dVar, d1d d1dVar, boolean z, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        d1d d1dVar2;
        Function0 function02;
        q0d q0dVar2;
        yci yciVar2;
        q0dVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1568526635);
        int i3 = (oq5Var.h(q0dVar) ? 4 : 2) | i2 | (oq5Var.f(d1dVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | 24576;
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            d1dVar2 = d1dVar;
            function02 = function0;
            yciVar2 = yciVar;
            q0dVar2 = q0dVar;
        } else {
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(1267432301);
                d1dVar2 = d1dVar;
                function02 = function0;
                bkp.P(q0dVar, d1dVar2, function02, d.c(vciVar, 1.0f), oq5Var, (i3 & 126) | ((i3 >> 3) & 896), 0);
                q0dVar2 = q0dVar;
                oq5Var.p(false);
            } else {
                d1dVar2 = d1dVar;
                function02 = function0;
                q0dVar2 = q0dVar;
                oq5Var.Z(1267643008);
                n7w.o(q0dVar2, d1dVar2, d.c(vciVar, 1.0f), oq5Var, i3 & 126);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new qr(q0dVar2, d1dVar2, z, function02, yciVar2, i2);
        }
    }

    public static final void w(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1219875594);
        if (i2 == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
            Unit unit = Unit.a;
            boolean h2 = oq5Var.h(view);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new xvb(view, 2);
                oq5Var.k0(K);
            }
            gld.k(unit, (Function1) K, oq5Var);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new rea(i2, 20);
        }
    }

    public static final void x(Object obj, int i2, buf bufVar, wn5 wn5Var, hq5 hq5Var, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2079116560);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.h(bufVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            boolean f2 = oq5Var.f(obj) | oq5Var.f(bufVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f2 || K == kjnVar) {
                K = new auf(obj, bufVar);
                oq5Var.k0(K);
            }
            auf aufVar = (auf) K;
            aufVar.c = i2;
            x6k x6kVar = aufVar.g;
            qs5 qs5Var = hsk.a;
            auf aufVar2 = (auf) oq5Var.j(qs5Var);
            b2r G = wyf.G();
            Function1 e2 = G != null ? G.e() : null;
            b2r Q = wyf.Q(G);
            try {
                if (aufVar2 != ((auf) x6kVar.getValue())) {
                    x6kVar.setValue(aufVar2);
                    if (aufVar.d > 0) {
                        auf aufVar3 = aufVar.e;
                        if (aufVar3 != null) {
                            aufVar3.b();
                        }
                        if (aufVar2 != null) {
                            aufVar2.a();
                        } else {
                            aufVar2 = null;
                        }
                        aufVar.e = aufVar2;
                    }
                }
                wyf.b0(G, Q, e2);
                boolean f3 = oq5Var.f(aufVar);
                Object K2 = oq5Var.K();
                if (f3 || K2 == kjnVar) {
                    K2 = new kma(25, aufVar);
                    oq5Var.k0(K2);
                }
                gld.k(aufVar, (Function1) K2, oq5Var);
                etn.l(qs5Var.a(aufVar), wn5Var, oq5Var, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                wyf.b0(G, Q, e2);
                throw th;
            }
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new rj0(obj, i2, bufVar, wn5Var, i3);
        }
    }

    public static final void y(n9b n9bVar, jmj jmjVar, yci yciVar) {
        n9bVar.getClass();
        jmjVar.getClass();
        yciVar.getClass();
        n9bVar.a.a(new wn5(new t1b(2, jmjVar, yciVar), 2039174322, true));
    }

    public static final void z(int i2, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        String str2;
        int i3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1559677802);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (oq5Var.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            String M = rvf.M(R.string.artist_concerts_buy, oq5Var);
            int i5 = 1;
            boolean z2 = (i4 & 14) == 4;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = szf.g0(str2);
                oq5Var.k0(K);
            }
            wn5 C = ild.C(944027326, new hw5(i5, (aqi) K, M), oq5Var);
            float f2 = BuildConfig.API_LEVEL;
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.s(vciVar, 100, f2), "concert_purchase_button");
            if (z) {
                oq5Var.Z(-1404458567);
                hdg.r(function0, a2, null, C, oq5Var, ((i4 >> 3) & 14) | 3072, 4);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1404306729);
                hdg.u(function0, a2, null, C, oq5Var, ((i4 >> 3) & 14) | 3072, 4);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new iw5(str, function0, yciVar2, z, i2, 1, (byte) 0);
        }
    }
}
