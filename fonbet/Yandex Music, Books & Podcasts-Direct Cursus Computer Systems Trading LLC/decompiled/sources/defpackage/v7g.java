package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.animation.c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.f0;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.media.ynison.service.b0;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.w;
import com.yandex.media.ynison.service.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes3.dex */
public abstract class v7g {
    public static final int A(mhp mhpVar, mhp[] mhpVarArr) {
        mhpVarArr.getClass();
        int hashCode = (mhpVar.i().hashCode() * 31) + Arrays.hashCode(mhpVarArr);
        int e = mhpVar.e();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(e > 0)) {
                break;
            }
            int i3 = e - 1;
            int i4 = i * 31;
            String i5 = mhpVar.h(mhpVar.e() - e).i();
            if (i5 != null) {
                i2 = i5.hashCode();
            }
            i = i4 + i2;
            e = i3;
        }
        int e2 = mhpVar.e();
        int i6 = 1;
        while (true) {
            if (!(e2 > 0)) {
                return (((hashCode * 31) + i) * 31) + i6;
            }
            int i7 = e2 - 1;
            int i8 = i6 * 31;
            ivf a = mhpVar.h(mhpVar.e() - e2).a();
            i6 = i8 + (a != null ? a.hashCode() : 0);
            e2 = i7;
        }
    }

    public static final boolean B(e0 e0Var) {
        e0Var.getClass();
        if (e0Var.n().j().G()) {
            return e0Var.n().j().G() && e0Var.n().j().A().size() == e0Var.n().j().D().i();
        }
        return true;
    }

    public static final void C(Function0 function0) {
        new Handler(Looper.getMainLooper()).post(new u6h(0, function0));
    }

    public static final long D(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        les[] lesVarArr = kes.b;
        return floatToRawIntBits;
    }

    public static bp0 E(d7k d7kVar) {
        int h = d7kVar.h();
        if (d7kVar.h() != 1684108385) {
            vq1.n0("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int h2 = d7kVar.h();
        byte[] bArr = ch3.a;
        int i = h2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            dfi.o(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        d7kVar.I(4);
        int i2 = h - 16;
        byte[] bArr2 = new byte[i2];
        d7kVar.f(bArr2, 0, i2);
        return new bp0(str, null, bArr2, 3);
    }

    public static gcs F(int i, d7k d7kVar, String str) {
        int h = d7kVar.h();
        if (d7kVar.h() == 1684108385 && h >= 22) {
            d7kVar.I(10);
            int B = d7kVar.B();
            if (B > 0) {
                String i2 = k5r.i(B, "");
                int B2 = d7kVar.B();
                if (B2 > 0) {
                    i2 = i2 + "/" + B2;
                }
                return new gcs(str, null, yde.y(i2));
            }
        }
        vq1.n0("MetadataUtil", "Failed to parse index/count attribute: ".concat(ceg.d(i)));
        return null;
    }

    public static int G(d7k d7kVar) {
        int h = d7kVar.h();
        if (d7kVar.h() == 1684108385) {
            d7kVar.I(8);
            int i = h - 16;
            if (i == 1) {
                return d7kVar.v();
            }
            if (i == 2) {
                return d7kVar.B();
            }
            if (i == 3) {
                return d7kVar.y();
            }
            if (i == 4 && (d7kVar.e() & 128) == 0) {
                return d7kVar.z();
            }
        }
        vq1.n0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static qae H(int i, String str, d7k d7kVar, boolean z, boolean z2) {
        int G = G(d7kVar);
        if (z2) {
            G = Math.min(1, G);
        }
        if (G >= 0) {
            return z ? new gcs(str, null, yde.y(Integer.toString(G))) : new ub5("und", str, Integer.toString(G));
        }
        vq1.n0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(ceg.d(i)));
        return null;
    }

    public static gcs I(int i, d7k d7kVar, String str) {
        int h = d7kVar.h();
        if (d7kVar.h() == 1684108385) {
            d7kVar.I(8);
            return new gcs(str, null, yde.y(d7kVar.r(h - 16)));
        }
        vq1.n0("MetadataUtil", "Failed to parse text attribute: ".concat(ceg.d(i)));
        return null;
    }

    public static final View J(View view) {
        Context context = view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            return activity.getWindow().getDecorView();
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return J(view2);
        }
        return null;
    }

    public static x K(w wVar, int i, Iterable iterable, String str, String str2, String str3, b0 b0Var, i0 i0Var, s0 s0Var, String str4) {
        wVar.getClass();
        iterable.getClass();
        s0Var.getClass();
        chl H = x.H();
        if (str4 != null) {
            H.d();
            x.j((x) H.b, str4);
        }
        H.d();
        x.o((x) H.b, wVar);
        if (str != null) {
            dlr h = dlr.h(str);
            H.d();
            x.k((x) H.b, h);
        }
        if (str2 != null) {
            dlr h2 = dlr.h(str2);
            H.d();
            x.l((x) H.b, h2);
        }
        if (str3 != null) {
            dlr h3 = dlr.h(str3);
            H.d();
            x.n((x) H.b, h3);
        }
        H.h(i);
        H.d();
        x.f((x) H.b, iterable);
        H.d();
        x.m((x) H.b, b0Var);
        if (i0Var != null) {
            H.d();
            x.p((x) H.b, i0Var);
        }
        H.d();
        x.q((x) H.b, s0Var);
        return (x) H.b();
    }

    public static final void L(Context context, lik likVar) {
        context.getClass();
        int i = TariffPaywallActivity.z;
        Intent b = dml.b(context, likVar);
        Activity G = sj2.G(context);
        if (G != null) {
            G.startActivity(b);
            return;
        }
        b.addFlags(268435456);
        Assertions.fail("paywall activity starts with NEW_TASK");
        context.startActivity(b);
    }

    public static b0 M(int i) {
        if (i == 0) {
            throw null;
        }
        wnl i2 = b0.i();
        i2.d();
        b0.f((b0) i2.b, i);
        return (b0) i2.b();
    }

    public static final int N(roi roiVar) {
        int c;
        int i = roiVar.b;
        int c2 = roiVar.c(0);
        while (roiVar.b != 0 && roiVar.c(0) == c2) {
            roiVar.g(0, roiVar.d());
            roiVar.f(roiVar.b - 1);
            int i2 = roiVar.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int c3 = roiVar.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int c4 = roiVar.c(i6);
                if (i5 >= i2 || (c = roiVar.c(i5)) <= c4) {
                    if (c4 > c3) {
                        roiVar.g(i4, c4);
                        roiVar.g(i6, c3);
                        i4 = i6;
                    }
                } else if (c > c3) {
                    roiVar.g(i4, c);
                    roiVar.g(i5, c3);
                    i4 = i5;
                }
            }
        }
        return c2;
    }

    public static final long O(long j) {
        aqf aqfVar = aqf.a;
        return ia6.a(ga6.k(j), ga6.i(j), ga6.j(j), ga6.h(j));
    }

    public static final Set P(String str) {
        List split$default;
        JsonObject n0 = cxb.n0(str);
        if (n0 == null || !n0.a.containsKey(ConstantDeviceInfo.APP_PLATFORM)) {
            return null;
        }
        JsonElement v = n0.v(ConstantDeviceInfo.APP_PLATFORM);
        v.getClass();
        String I = cxb.I(v);
        if (I == null) {
            return null;
        }
        split$default = StringsKt__StringsKt.split$default(I, new String[]{StringUtils.COMMA}, false, 0, 6, null);
        List list = split$default;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.t0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        Set A0 = CollectionsKt.A0(arrayList2);
        if (A0.isEmpty()) {
            return null;
        }
        return A0;
    }

    public static final String Q(mhp mhpVar) {
        return CollectionsKt.X(yhn.m(0, mhpVar.e()), ", ", mhpVar.i() + '(', ")", new s8i(24, mhpVar), 24);
    }

    public static final nyu R(igr igrVar) {
        e0t e0tVar = igrVar.k;
        gxc gxcVar = igrVar.h;
        pfn pfnVar = igrVar.g;
        e0tVar.getClass();
        if (e0tVar instanceof d0t) {
            d0t d0tVar = (d0t) e0tVar;
            s9p s9pVar = d0tVar.a;
            pfnVar.getClass();
            gxcVar.getClass();
            return new iyu(s9pVar, new c5q(pfnVar, gxcVar), d0tVar.b);
        }
        if (!e0tVar.equals(f0t.a)) {
            b6e.s();
            return null;
        }
        pfnVar.getClass();
        gxcVar.getClass();
        return new jyu(new c5q(pfnVar, gxcVar));
    }

    public static void S(sa7 sa7Var, byte[] bArr, pm5 pm5Var) {
        ByteBuffer j = om3.j(bArr.length);
        j.put(bArr);
        j.flip();
        om3 om3Var = new om3();
        om3Var.a(j);
        lum lumVar = new lum(sa7Var, om3Var, pm5Var);
        sa7Var.h(lumVar);
        lumVar.o();
    }

    public static final void a(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(331528827);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            float f = 8;
            float f2 = 12;
            long j = ((dq0) oq5Var.j(eq0.a)).a.c;
            yci o = d.o(yciVar, (((2 * f) + f2) * 4) - f2, f + f);
            boolean e = oq5Var.e(j) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (e || K == gq5.a) {
                frj frjVar = new frj(function0, f, f2, f, j);
                oq5Var.k0(frjVar);
                K = frjVar;
            }
            ksw.j(0, oq5Var, o, (Function1) K);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i, 13);
        }
    }

    public static final void b(raj rajVar, esi esiVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        kjn kjnVar;
        int i3;
        esiVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-90212030);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(rajVar) : oq5Var2.h(rajVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(esiVar) : oq5Var2.h(esiVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        int i4 = i2;
        if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
            aqi M = gld.M(esiVar.c(), oq5Var2);
            aqi M2 = gld.M(esiVar.g(), oq5Var2);
            rba rbaVar = rba.a;
            lzs lzsVar = (lzs) M.getValue();
            frs frsVar = frs.d;
            cdj cdjVar = (cdj) M2.getValue();
            int i5 = i4 & 112;
            boolean z = i5 == 32 || ((i4 & 64) != 0 && oq5Var2.h(esiVar));
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                kjnVar = kjnVar2;
                i3 = i5;
                k5h k5hVar = new k5h(0, esiVar, esi.class, "onClick", "onClick()V", 0, 19);
                oq5Var2.k0(k5hVar);
                K = k5hVar;
            } else {
                i3 = i5;
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean z2 = i3 == 32 || ((i4 & 64) != 0 && oq5Var2.h(esiVar));
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                ln6 ln6Var = new ln6(0, esiVar, esi.class, "onLongClick", "onLongClick()Z", 8, 2);
                oq5Var2.k0(ln6Var);
                K2 = ln6Var;
            }
            Function0 function02 = (Function0) K2;
            boolean z3 = i3 == 32 || ((i4 & 64) != 0 && oq5Var2.h(esiVar));
            Object K3 = oq5Var2.K();
            if (z3 || K3 == kjnVar) {
                K3 = new k5h(0, esiVar, esi.class, "onOverflowClick", "onOverflowClick()V", 0, 20);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            o5g.e(rajVar, rbaVar, lzsVar, frsVar, cdjVar, false, function0, function02, (Function0) ((h9f) K3), yciVar, null, null, 0L, 0L, null, null, oq5Var, (i4 & 14) | 199728 | ((i4 << 21) & 1879048192), 0, 64512);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(rajVar, esiVar, yciVar, i, 20);
        }
    }

    public static final void c(ncj ncjVar, bci bciVar, hq5 hq5Var, int i) {
        ncjVar.getClass();
        bciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-700224463);
        int i2 = (oq5Var.h(ncjVar) ? 4 : 2) | i | (oq5Var.h(bciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            scj scjVar = (scj) gld.M(ncjVar.d, oq5Var).getValue();
            if (Intrinsics.d(scjVar, ocj.a)) {
                oq5Var.Z(1394164245);
                oq5Var.p(false);
            } else {
                if (!(scjVar instanceof rcj)) {
                    throw vz1.i(oq5Var, 1394160958, false);
                }
                oq5Var.Z(269483768);
                int i3 = i2 << 3;
                d((rcj) scjVar, ncjVar, bciVar, oq5Var, (i3 & 896) | (i3 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(ncjVar, bciVar, i, 29);
        }
    }

    public static final void d(rcj rcjVar, ncj ncjVar, bci bciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1013446320);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(rcjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(ncjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(bciVar) : oq5Var.h(bciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = rcjVar instanceof qcj;
            boolean h = oq5Var.h(rcjVar) | oq5Var.h(ncjVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new avi(5, rcjVar, ncjVar);
                oq5Var.k0(K);
            }
            vq1.g(null, bciVar, z, (Function1) K, oq5Var, 64 | ((i2 >> 3) & 112), 5);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(rcjVar, ncjVar, bciVar, i, 28);
        }
    }

    public static final void e(int i, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1101215683);
        int i2 = i | (oq5Var.g(z) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            float f = 16;
            yci q = a.q(androidx.compose.foundation.a.k(d.e(d.d(yciVar, 1.0f), 96), true, null), 0.0f, 0.0f, 0.0f, f, 7);
            boolean z2 = (i2 & 112) == 32;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = new g1j(18, function0);
                oq5Var.k0(K);
            }
            yci e = androidx.compose.foundation.a.e(q, false, null, null, (Function0) K, 7);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new d0p(19);
                oq5Var.k0(K2);
            }
            yci b = nfp.b(e, true, (Function1) K2);
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
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
            w4k E = a0g.E(z ? R.drawable.ic_unpin_24 : R.drawable.ic_pin_24, 0, oq5Var);
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.m(a.q(vciVar, f, 0.0f, 0.0f, 0.0f, 14), 24), z ? "section_pin_bottom_sheet_unpin_icon" : "section_pin_bottom_sheet_pin_icon");
            agr agrVar = eq0.a;
            gae.b(E, null, a2, ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 48, 0);
            String M = rvf.M(z ? R.string.collection_carousel_unpin_action : R.string.collection_carousel_pin_action, oq5Var);
            ges j = nu0.j();
            long j2 = ((dq0) oq5Var.j(agrVar)).b.a;
            yci q2 = a.q(vciVar, f, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xv7.j(M, androidx.compose.ui.platform.a.a(q2.f(new LayoutWeightElement(true, 1.0f)), "section_pin_bottom_sheet_action_text"), j2, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j, oq5Var, 0, 3120, 55288);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tm(z, function0, yciVar, i, 5);
        }
    }

    public static final void f(fyp fypVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        String str;
        String str2;
        int i2;
        int i3;
        fypVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-880484514);
        if ((((oq5Var.h(fypVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (fypVar.equals(zxp.a)) {
                i2 = 306187491;
                i3 = R.string.share_button_link;
            } else if (fypVar.equals(zxp.b)) {
                i2 = 306190339;
                i3 = R.string.share_button_more;
            } else {
                if (!(fypVar instanceof eyp)) {
                    throw vz1.i(oq5Var, 306185902, false);
                }
                oq5Var.Z(306193119);
                eyp eypVar = (eyp) fypVar;
                Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                if (eypVar instanceof cyp) {
                    str = "Telegram";
                } else if (eypVar instanceof dyp) {
                    str = "WhatsApp";
                } else if (eypVar instanceof ayp) {
                    str = "Facebook";
                } else {
                    if (!(eypVar instanceof byp)) {
                        b6e.s();
                        return;
                    }
                    str = "Instagram";
                }
                if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    try {
                        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(eypVar.a, 0);
                        applicationInfo.getClass();
                        str = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                str2 = str;
                oq5Var.p(false);
                agr agrVar = es5.h;
                etn.l(agrVar.a(new kx7(((jx7) oq5Var.j(agrVar)).getDensity(), 1.0f)), ild.C(634721310, new gvl(yciVar, str2, fypVar, function0, 22), oq5Var), oq5Var, 56);
            }
            str2 = vz1.n(oq5Var, i2, i3, oq5Var, false);
            agr agrVar2 = es5.h;
            etn.l(agrVar2.a(new kx7(((jx7) oq5Var.j(agrVar2)).getDensity(), 1.0f)), ild.C(634721310, new gvl(yciVar, str2, fypVar, function0, 22), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(fypVar, function0, yciVar, i, 12);
        }
    }

    public static final void g(qqq qqqVar, tmb tmbVar, qnq qnqVar, nnq nnqVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        nnqVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-568980044);
        int i2 = (oq5Var2.h(qqqVar) ? 4 : 2) | i | (oq5Var2.h(tmbVar) ? 32 : 16) | (oq5Var2.h(qnqVar) ? 256 : 128) | (oq5Var2.f(nnqVar) ? 2048 : 1024);
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            aqi O = gld.O(qqqVar.e, oq5Var2);
            aqi P = ldg.P(O, a, oq5Var2);
            u7g.a(((ma5) oq5Var2.j(pa5.a)).g(), oq5Var2, 0);
            oq5Var = oq5Var2;
            q7g.r(3078, 6, ild.C(-473972338, new gvl(qqqVar, O, a, P, 24), oq5Var2), ild.C(-695924088, new lc(qqqVar, tmbVar, nnqVar, qnqVar, a, 19), oq5Var2), oq5Var, null, false);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 25, qqqVar, tmbVar, qnqVar, nnqVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x044f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final otb otbVar, final sdr sdrVar, final zwr zwrVar, final a3h a3hVar, final Function1 function1, final Function0 function0, final Function0 function02, final Function1 function12, final Function1 function13, final Function0 function03, final yci yciVar, hq5 hq5Var, final int i) {
        int i2;
        sdr sdrVar2;
        oq5 oq5Var;
        xmn r;
        Function2 function2;
        long j;
        int i3;
        wje wjeVar;
        int i4;
        Float f;
        float f2;
        boolean z;
        int i5;
        fvf fvfVar;
        boolean z2;
        boolean z3;
        final otb otbVar2;
        boolean z4;
        boolean f3;
        Object K;
        otbVar.getClass();
        sdrVar.getClass();
        zwrVar.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        function12.getClass();
        function13.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-456195477);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(otbVar) : oq5Var2.h(otbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            sdrVar2 = sdrVar;
            i2 |= oq5Var2.f(sdrVar2) ? 32 : 16;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(zwrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.d(a3hVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i2 |= oq5Var2.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i2 |= oq5Var2.h(function02) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= oq5Var2.h(function12) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i2 |= oq5Var2.h(function13) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= oq5Var2.h(function03) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (oq5Var2.P(i2 & 1, ((i2 & 306783379) == 306783378 && ((oq5Var2.f(yciVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            long longValue = ((Number) sdrVar2.getValue()).longValue() + 266;
            boolean z5 = (1879048192 & i2) == 536870912;
            Object K2 = oq5Var2.K();
            kjn kjnVar = gq5.a;
            Continuation continuation = null;
            if (z5 || K2 == kjnVar) {
                K2 = new om0(function03, continuation, 5);
                oq5Var2.k0(K2);
            }
            gld.w(oq5Var2, zwrVar, (Function2) K2);
            final long z6 = z(48);
            float f4 = 16;
            agr agrVar = es5.h;
            float p = (2 * f4) + ((jx7) oq5Var2.j(agrVar)).p(z6);
            float n0 = ((jx7) oq5Var2.j(agrVar)).n0(p);
            float f5 = 80;
            long j2 = longValue;
            wje s = fgq.s(fgq.D(null, oq5Var2, 1), 0.0f, 2.0f, weo.C(weo.S(2000, 0, nya.d, 2), null, 0L, 6), null, oq5Var2, 4536, 8);
            List list = zwrVar.a;
            if (list.isEmpty()) {
                oq5Var2.Z(-1241706664);
                vci vciVar = vci.a;
                yci e = d.e(d.d(a.o(vciVar, 0.0f, f5, 1), 1.0f), p);
                kfh d = ug3.d(b2c.f, false);
                int i6 = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, e);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, d, wp5.f);
                g0g.U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var2, i6, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                boolean f6 = oq5Var2.f(s);
                Object K3 = oq5Var2.K();
                if (f6 || K3 == kjnVar) {
                    K3 = new a9q(s, 13);
                    oq5Var2.k0(K3);
                }
                a((Function0) K3, a.m(vciVar, f4), oq5Var2, 48);
                oq5Var2.p(true);
                oq5Var2.p(false);
                r = oq5Var2.r();
                if (r != null) {
                    final int i7 = 0;
                    function2 = new Function2() { // from class: pwr
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    v7g.h(otbVar, sdrVar, zwrVar, a3hVar, function1, function0, function02, function12, function13, function03, yciVar, (hq5) obj, rvf.R(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    v7g.h(otbVar, sdrVar, zwrVar, a3hVar, function1, function0, function02, function12, function13, function03, yciVar, (hq5) obj, rvf.R(i | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            oq5Var2.Z(-1245696457);
            oq5Var2.p(false);
            Iterator it = list.iterator();
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    j = j2;
                    i3 = -1;
                    break;
                }
                j = j2;
                if (((ywr) it.next()).a >= j) {
                    i3 = i8;
                    break;
                } else {
                    i8++;
                    j2 = j;
                }
            }
            if (i3 == -1) {
                i3 = list.size();
            }
            int i9 = i3 - 1;
            int i10 = i9 + 1;
            if (i10 < 0) {
                i10 = 0;
            }
            fvf a = hvf.a(i10, 0, oq5Var2, 0, 2);
            int i11 = i2 & 896;
            boolean z7 = i11 == 256;
            Object K4 = oq5Var2.K();
            if (z7 || K4 == kjnVar) {
                int size = list.size() + 1;
                ArrayList arrayList = new ArrayList(size);
                wjeVar = s;
                int i12 = 0;
                while (i12 < size) {
                    if (i12 == 0) {
                        i4 = i12;
                        f = Float.valueOf(n0);
                    } else {
                        i4 = i12;
                        f = null;
                    }
                    arrayList.add(f);
                    i12 = i4 + 1;
                }
                oq5Var2.k0(arrayList);
                K4 = arrayList;
            } else {
                wjeVar = s;
            }
            final List list2 = (List) K4;
            if (i9 >= 0) {
                oq5Var2.Z(-1240846972);
                boolean z8 = (3670016 & i2) == 1048576;
                Object K5 = oq5Var2.K();
                if (z8 || K5 == kjnVar) {
                    f2 = p;
                    K5 = new om0(function02, null, 6);
                    oq5Var2.k0(K5);
                } else {
                    f2 = p;
                }
                gld.w(oq5Var2, zwrVar, (Function2) K5);
                z = false;
            } else {
                f2 = p;
                z = false;
                oq5Var2.Z(-1245696457);
            }
            oq5Var2.p(z);
            Integer valueOf = Integer.valueOf(i9);
            int i13 = i2 & 7168;
            boolean d2 = (i13 == 2048) | oq5Var2.d(i9) | oq5Var2.f(list2) | oq5Var2.f(a);
            Object K6 = oq5Var2.K();
            if (d2 || K6 == kjnVar) {
                K6 = new fr4(a3hVar, i9, list2, a, (Continuation) null, 11);
                i5 = i9;
                fvfVar = a;
                oq5Var2.k0(K6);
            } else {
                fvfVar = a;
                i5 = i9;
            }
            int i14 = i2;
            gld.y(valueOf, a3hVar, (Function2) K6, oq5Var2);
            uoi uoiVar = fvfVar.f;
            boolean f7 = ((i14 & 29360128) == 8388608) | oq5Var2.f(fvfVar);
            Object K7 = oq5Var2.K();
            if (f7 || K7 == kjnVar) {
                K7 = new swr(fvfVar, function12, null, 1);
                oq5Var2.k0(K7);
            }
            gld.w(oq5Var2, uoiVar, (Function2) K7);
            o6g o6gVar = u2h.a;
            yciVar.getClass();
            yci a2 = androidx.compose.ui.platform.a.a(gut.q1((i14 >> 21) & 112, oq5Var2, androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(yciVar, new s2h(0)), new s2h(2)), function13), "lyrics_list");
            gz2 gz2Var = b2c.o;
            q0k a3 = a.a(0.0f, f5, 1);
            if (i11 == 256) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            final long j3 = j;
            final float f8 = f2;
            final wje wjeVar2 = wjeVar;
            boolean e2 = z2 | oq5Var2.e(j3) | oq5Var2.c(f8) | (i13 == 2048 ? true : z3) | oq5Var2.f(wjeVar2) | oq5Var2.d(i5);
            if ((i14 & 14) != 4) {
                otbVar2 = otbVar;
                if ((i14 & 8) == 0 || !oq5Var2.h(otbVar2)) {
                    z4 = z3;
                    f3 = e2 | z4 | ((i14 & 57344) != 16384 ? true : z3) | ((i14 & 458752) != 131072 ? true : z3) | oq5Var2.f(list2);
                    K = oq5Var2.K();
                    if (!f3 || K == kjnVar) {
                        final int i15 = i5;
                        Function1 function14 = new Function1() { // from class: qwr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                vuf vufVar = (vuf) obj;
                                vufVar.getClass();
                                final zwr zwrVar2 = zwr.this;
                                final long j4 = j3;
                                final float f9 = f8;
                                final a3h a3hVar2 = a3hVar;
                                final long j5 = z6;
                                final sdr sdrVar3 = wjeVar2;
                                vuf.Y(vufVar, null, new wn5(new pyc() { // from class: rwr
                                    @Override // defpackage.pyc
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        hq5 hq5Var2 = (hq5) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        ((androidx.compose.foundation.lazy.a) obj2).getClass();
                                        oq5 oq5Var3 = (oq5) hq5Var2;
                                        if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                            zwr zwrVar3 = zwr.this;
                                            long j6 = ((ywr) CollectionsKt.Q(zwrVar3.a)).a - j4;
                                            yci e3 = d.e(d.d(vci.a, 1.0f), f9);
                                            kfh d3 = ug3.d(b2c.f, false);
                                            int i16 = oq5Var3.P;
                                            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                                            yci H2 = vnj.H(oq5Var3, e3);
                                            xp5.T.getClass();
                                            grb grbVar2 = wp5.b;
                                            oq5Var3.d0();
                                            if (oq5Var3.O) {
                                                oq5Var3.k(grbVar2);
                                            } else {
                                                oq5Var3.n0();
                                            }
                                            g0g.U(oq5Var3, d3, wp5.f);
                                            g0g.U(oq5Var3, l2, wp5.e);
                                            kb5 kb5Var2 = wp5.g;
                                            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i16))) {
                                                ouj.x(i16, oq5Var3, i16, kb5Var2);
                                            }
                                            g0g.U(oq5Var3, H2, wp5.d);
                                            if (a3hVar2 != a3h.b || j6 <= 0) {
                                                oq5Var3.Z(-805564196);
                                            } else {
                                                oq5Var3.Z(-798907473);
                                                long j7 = 1000;
                                                long j8 = (j6 / j7) + 1;
                                                long j9 = ((ywr) CollectionsKt.Q(zwrVar3.a)).a / j7;
                                                long j10 = zwrVar3.b;
                                                boolean z9 = j9 > j10 && j8 <= j10;
                                                etn.f(z9, null, c.e(null, 3), c.f(null, 3), null, ild.C(988091257, new z4j(1, j8, j5), oq5Var3), oq5Var3, 200064, 18);
                                                etn.f(!z9, null, c.e(null, 3), c.f(null, 3), null, ild.C(-142450960, new ix(sdrVar3, 6), oq5Var3), oq5Var3, 200064, 18);
                                            }
                                            oq5Var3.p(false);
                                            oq5Var3.p(true);
                                        } else {
                                            oq5Var3.S();
                                        }
                                        return Unit.a;
                                    }
                                }, -107358272, true), 3);
                                List list3 = zwrVar2.a;
                                vufVar.Z(list3.size(), null, new zcf(list3, 17), new wn5(new vwr(list3, a3hVar2, i15, otbVar2, function1, function0, list2), -1091073711, true));
                                vuf.Y(vufVar, null, new wn5(new tik(25, zwrVar2), 653427575, true), 3);
                                return Unit.a;
                            }
                        };
                        oq5Var2.k0(function14);
                        K = function14;
                    }
                    oq5Var = oq5Var2;
                    weo.f(a2, fvfVar, a3, null, gz2Var, null, false, null, (Function1) K, oq5Var, 196992, 472);
                }
            } else {
                otbVar2 = otbVar;
            }
            z4 = true;
            f3 = e2 | z4 | ((i14 & 57344) != 16384 ? true : z3) | ((i14 & 458752) != 131072 ? true : z3) | oq5Var2.f(list2);
            K = oq5Var2.K();
            if (!f3) {
            }
            final int i152 = i5;
            Function1 function142 = new Function1() { // from class: qwr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    vuf vufVar = (vuf) obj;
                    vufVar.getClass();
                    final zwr zwrVar2 = zwr.this;
                    final long j4 = j3;
                    final float f9 = f8;
                    final a3h a3hVar2 = a3hVar;
                    final long j5 = z6;
                    final sdr sdrVar3 = wjeVar2;
                    vuf.Y(vufVar, null, new wn5(new pyc() { // from class: rwr
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            hq5 hq5Var2 = (hq5) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            ((androidx.compose.foundation.lazy.a) obj2).getClass();
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                                zwr zwrVar3 = zwr.this;
                                long j6 = ((ywr) CollectionsKt.Q(zwrVar3.a)).a - j4;
                                yci e3 = d.e(d.d(vci.a, 1.0f), f9);
                                kfh d3 = ug3.d(b2c.f, false);
                                int i16 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                                yci H2 = vnj.H(oq5Var3, e3);
                                xp5.T.getClass();
                                grb grbVar2 = wp5.b;
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar2);
                                } else {
                                    oq5Var3.n0();
                                }
                                g0g.U(oq5Var3, d3, wp5.f);
                                g0g.U(oq5Var3, l2, wp5.e);
                                kb5 kb5Var2 = wp5.g;
                                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i16))) {
                                    ouj.x(i16, oq5Var3, i16, kb5Var2);
                                }
                                g0g.U(oq5Var3, H2, wp5.d);
                                if (a3hVar2 != a3h.b || j6 <= 0) {
                                    oq5Var3.Z(-805564196);
                                } else {
                                    oq5Var3.Z(-798907473);
                                    long j7 = 1000;
                                    long j8 = (j6 / j7) + 1;
                                    long j9 = ((ywr) CollectionsKt.Q(zwrVar3.a)).a / j7;
                                    long j10 = zwrVar3.b;
                                    boolean z9 = j9 > j10 && j8 <= j10;
                                    etn.f(z9, null, c.e(null, 3), c.f(null, 3), null, ild.C(988091257, new z4j(1, j8, j5), oq5Var3), oq5Var3, 200064, 18);
                                    etn.f(!z9, null, c.e(null, 3), c.f(null, 3), null, ild.C(-142450960, new ix(sdrVar3, 6), oq5Var3), oq5Var3, 200064, 18);
                                }
                                oq5Var3.p(false);
                                oq5Var3.p(true);
                            } else {
                                oq5Var3.S();
                            }
                            return Unit.a;
                        }
                    }, -107358272, true), 3);
                    List list3 = zwrVar2.a;
                    vufVar.Z(list3.size(), null, new zcf(list3, 17), new wn5(new vwr(list3, a3hVar2, i152, otbVar2, function1, function0, list2), -1091073711, true));
                    vuf.Y(vufVar, null, new wn5(new tik(25, zwrVar2), 653427575, true), 3);
                    return Unit.a;
                }
            };
            oq5Var2.k0(function142);
            K = function142;
            oq5Var = oq5Var2;
            weo.f(a2, fvfVar, a3, null, gz2Var, null, false, null, (Function1) K, oq5Var, 196992, 472);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        r = oq5Var.r();
        if (r != null) {
            final int i16 = 1;
            function2 = new Function2() { // from class: pwr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i16) {
                        case 0:
                            ((Integer) obj2).getClass();
                            v7g.h(otbVar, sdrVar, zwrVar, a3hVar, function1, function0, function02, function12, function13, function03, yciVar, (hq5) obj, rvf.R(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            v7g.h(otbVar, sdrVar, zwrVar, a3hVar, function1, function0, function02, function12, function13, function03, yciVar, (hq5) obj, rvf.R(i | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final void i(String str, k2s k2sVar, boolean z, fvf fvfVar, Function0 function0, Function0 function02, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1561248491);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(k2sVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.f(fvfVar) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function1) ? 1048576 : 524288) | 12582912;
        if (oq5Var.P(i2 & 1, (4793491 & i2) != 4793490)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            pd.b(new qzm[0], false, ild.C(1014790654, new gqq(function0, z, k2sVar, function1, (mm6) K, fvfVar, str, function02, 0), oq5Var), oq5Var, 0, 2);
            yciVar2 = vci.a;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hqq(str, k2sVar, z, fvfVar, function0, function02, function1, yciVar2, i);
        }
    }

    public static final void j(int i, hq5 hq5Var) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1075189798);
        int i3 = i & 6;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(vciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci g = d.g(d.d(vciVar, 1.0f), 472, 0.0f, 2);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, g);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            c3x.m(0, 2, 0L, oq5Var, b.a.a(vciVar, b2c.f));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mz3(i);
        }
    }

    public static final void k(n7v n7vVar, hq5 hq5Var, int i) {
        n7vVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1977243313);
        if ((((oq5Var.h(n7vVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(lm0.o, ild.C(-241878584, new u0v(3, (a9v) gld.O(n7vVar.g, oq5Var).getValue(), n7vVar), oq5Var), oq5Var, 48, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m7v(n7vVar, i);
        }
    }

    public static final void l(Function0 function0, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1297788995);
        if ((i & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vq2.a(2.0f);
                oq5Var.k0(K);
            }
            fk0 fk0Var = (fk0) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = vq2.a(1.0f);
                oq5Var.k0(K2);
            }
            fk0 fk0Var2 = (fk0) K2;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = vq2.a(0.8f);
                oq5Var.k0(K3);
            }
            fk0 fk0Var3 = (fk0) K3;
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K4);
            }
            aqi aqiVar = (aqi) K4;
            Unit unit = Unit.a;
            boolean h = oq5Var.h(fk0Var) | oq5Var.h(fk0Var2) | oq5Var.h(fk0Var3);
            Object K5 = oq5Var.K();
            if (h || K5 == kjnVar) {
                xg xgVar = new xg(fk0Var, fk0Var2, function0, fk0Var3, aqiVar, (Continuation) null, 23);
                fk0Var3 = fk0Var3;
                aqiVar = aqiVar;
                oq5Var.k0(xgVar);
                K5 = xgVar;
            }
            gld.w(oq5Var, unit, (Function2) K5);
            yci k = a.k(d.m(d.x(vci.a, null, 3), 44), 0.0f, -20, 1);
            boolean h2 = oq5Var.h(fk0Var) | oq5Var.h(fk0Var2) | oq5Var.h(fk0Var3);
            Object K6 = oq5Var.K();
            if (h2 || K6 == kjnVar) {
                i50 i50Var = new i50(fk0Var, fk0Var2, fk0Var3, aqiVar, 25);
                oq5Var.k0(i50Var);
                K6 = i50Var;
            }
            ksw.j(6, oq5Var, k, (Function1) K6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xtp(function0, i, 10);
        }
    }

    public static final Double m(double d, String str, double d2) {
        String str2;
        if (!Double.isNaN(d) && Math.abs(d) <= 1.0E10d) {
            return Double.valueOf(d);
        }
        int hashCode = str.hashCode();
        if (hashCode == 98696) {
            if (str.equals("cot")) {
                str2 = "Cotangent";
            }
            str2 = str;
        } else if (hashCode != 2988422) {
            if (hashCode == 3003607 && str.equals("asin")) {
                str2 = "Arcsine";
            }
            str2 = str;
        } else {
            if (str.equals("acos")) {
                str2 = "Arccosine";
            }
            str2 = str;
        }
        ghh.I(str + '(' + d2 + ')', str2.concat(" is undefined for the given value."), null);
        throw null;
    }

    public static final void n(roi roiVar, int i) {
        if (roiVar.b == 0 || !(roiVar.c(0) == i || roiVar.c(roiVar.b - 1) == i)) {
            int i2 = roiVar.b;
            roiVar.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int c = roiVar.c(i3);
                if (i <= c) {
                    break;
                }
                roiVar.g(i2, c);
                i2 = i3;
            }
            roiVar.g(i2, i);
        }
    }

    public static final Notification o(f0 f0Var) {
        f0Var.getClass();
        NullPointerException e = null;
        for (int i = 0; i < 3; i++) {
            try {
                Notification b = f0Var.b();
                b.getClass();
                return b;
            } catch (NullPointerException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
        Intrinsics.j("error");
        throw null;
    }

    public static final void p(long j) {
        les[] lesVarArr = kes.b;
        if ((j & 1095216660480L) == 0) {
            ume.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static long q(long j, aqf aqfVar) {
        aqf aqfVar2 = aqf.a;
        return ia6.a(aqfVar == aqfVar2 ? ga6.k(j) : ga6.j(j), aqfVar == aqfVar2 ? ga6.i(j) : ga6.h(j), aqfVar == aqfVar2 ? ga6.j(j) : ga6.k(j), aqfVar == aqfVar2 ? ga6.h(j) : ga6.i(j));
    }

    public static long r(int i, long j) {
        return ia6.a(0, ga6.i(j), (i & 4) != 0 ? ga6.j(j) : 0, ga6.h(j));
    }

    public static void s(aa7 aa7Var, om3 om3Var) {
        int i;
        u97 u97Var = null;
        while (!aa7Var.g() && (u97Var = aa7Var.u()) != null && (i = om3Var.c) > 0) {
            u97Var.Q(aa7Var, om3Var);
            if (i == om3Var.c && u97Var == aa7Var.u() && !aa7Var.g()) {
                System.out.println("handler: " + u97Var);
                om3Var.n();
                wvs.p("mDataHandler failed to consume data, yet remains the mDataHandler.");
                return;
            }
        }
        if (om3Var.c == 0 || aa7Var.g()) {
            return;
        }
        System.out.println("handler: " + u97Var);
        System.out.println("emitter: " + aa7Var);
        om3Var.n();
        wvs.p("Not all data was consumed by Util.emitAllData");
    }

    public static dfh t(u2i u2iVar, String str) {
        int i = 0;
        while (true) {
            n2i[] n2iVarArr = u2iVar.a;
            if (i >= n2iVarArr.length) {
                return null;
            }
            n2i n2iVar = n2iVarArr[i];
            if (n2iVar instanceof dfh) {
                dfh dfhVar = (dfh) n2iVar;
                if (dfhVar.a.equals(str)) {
                    return dfhVar;
                }
            }
            i++;
        }
    }

    public static w7g u() {
        return new w7g(new a8g("Link", "Cool link", ""), new r7g(""));
    }

    public static final boolean v(pbu pbuVar) {
        pbuVar.getClass();
        return (pbuVar instanceof mbu) || Intrinsics.d(pbuVar, lbu.a);
    }

    public static final ad6 w(String str) {
        JsonObject n0 = cxb.n0(str);
        if (n0 == null || !n0.a.containsKey("option")) {
            return null;
        }
        JsonElement v = n0.v("option");
        v.getClass();
        String I = cxb.I(v);
        if (I != null) {
            return b2c.z(I);
        }
        return null;
    }

    public static final nyn x(n7q n7qVar) {
        n7qVar.getClass();
        return (nyn) wdg.A(n7qVar, wvo.g);
    }

    public static final long y(double d) {
        return D((float) d, 4294967296L);
    }

    public static final long z(int i) {
        return D(i, 4294967296L);
    }
}
