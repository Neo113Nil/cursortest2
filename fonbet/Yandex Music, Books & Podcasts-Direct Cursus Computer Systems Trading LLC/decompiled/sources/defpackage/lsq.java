package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.auth.proto.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class lsq implements qsq {
    public final /* synthetic */ int a;

    public static final boolean A(Object obj) {
        return obj == d46.a;
    }

    public static final boolean B(d0o d0oVar) {
        d0oVar.getClass();
        return d0oVar.a().j && d0oVar.a().h > 0;
    }

    public static final String C(int i, o8q o8qVar, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i)};
        skr skrVar = o8qVar.a;
        String b = skrVar.b(R.plurals.likes_content_description, i, Arrays.copyOf(objArr, 1));
        return z ? ouj.o(b, StringUtil.SPACE, skrVar.c(i2)) : b;
    }

    public static w2r D(String str) {
        int i;
        String str2;
        boolean v = c.v(str, "HTTP/1.", false);
        izm izmVar = izm.HTTP_1_0;
        if (v) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                izmVar = izm.HTTP_1_1;
            }
        } else {
            if (!c.v(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new w2r(izmVar, parseInt, str2, 2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final css E(nss nssVar) {
        if (nssVar.equals(pss.a)) {
            return css.f;
        }
        if (nssVar.equals(mss.a)) {
            return css.i;
        }
        if (nssVar.equals(lss.a)) {
            return css.j;
        }
        if (nssVar.equals(kss.a)) {
            return css.g;
        }
        if (nssVar.equals(oss.a)) {
            return css.h;
        }
        b6e.s();
        return null;
    }

    public static final yxc F(a aVar) {
        aVar.getClass();
        String str = aVar.a;
        str.getClass();
        if (str.length() == 0) {
            return null;
        }
        cuk cukVar = drt.e;
        String str2 = aVar.a;
        str2.getClass();
        String str3 = aVar.c;
        str3.getClass();
        drt B = cuk.B(str2, str3, aVar.k);
        int i = aVar.b;
        String str4 = aVar.a;
        str4.getClass();
        boolean z = str4.length() == 0 ? true : aVar.d;
        String str5 = aVar.i;
        str5.getClass();
        b6d b6dVar = new b6d(str5);
        boolean z2 = aVar.e;
        String str6 = aVar.g;
        str6.getClass();
        String str7 = str6.length() > 0 ? str6 : null;
        boolean z3 = aVar.f;
        boolean z4 = aVar.j;
        rse rseVar = aVar.h;
        rseVar.getClass();
        return new yxc(B, i, str7, z, b6dVar, z2, z3, z4, rseVar);
    }

    public static final fot G(pj6 pj6Var) {
        if (pj6Var instanceof mj6) {
            return new cot(((mj6) pj6Var).a);
        }
        if (pj6Var instanceof nj6) {
            return new dot(pj6Var.a());
        }
        if (pj6Var instanceof oj6) {
            return eot.a;
        }
        b6e.s();
        return null;
    }

    public static Map H(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return u7x.i;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static final void c(zab zabVar, fvf fvfVar, o0k o0kVar, boolean z, Function0 function0, vti vtiVar, hq5 hq5Var, int i) {
        int i2;
        fvf fvfVar2;
        zabVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-861434410);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(zabVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fvfVar2 = fvfVar;
            i2 |= oq5Var.f(fvfVar2) ? 32 : 16;
        } else {
            fvfVar2 = fvfVar;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i2 |= (262144 & i) == 0 ? oq5Var.f(vtiVar) : oq5Var.h(vtiVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 >> 9;
            bfg.f(z, function0, o0kVar, null, false, ild.C(235686486, new av5(fvfVar2, o0kVar, zabVar, vtiVar, 17), oq5Var), oq5Var, (i4 & 112) | (i4 & 14) | 196608 | (i3 & 896), 24);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(i, 13, zabVar, fvfVar, o0kVar, function0, vtiVar, z);
        }
    }

    public static final void d(mdj mdjVar, int i, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        mdjVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-331370533);
        int i3 = (oq5Var2.h(mdjVar) ? 4 : 2) | i2;
        if (oq5Var2.P(i3 & 1, (i3 & 19) != 18)) {
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            boolean h = oq5Var2.h(mdjVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                m9j m9jVar = new m9j(0, mdjVar, mdj.class, "onBackClick", "onBackClick()V", 0, 13);
                oq5Var2.k0(m9jVar);
                K = m9jVar;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var2.h(mdjVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                m9j m9jVar2 = new m9j(0, mdjVar, mdj.class, "onSearchClick", "onSearchClick()V", 0, 14);
                oq5Var2.k0(m9jVar2);
                K2 = m9jVar2;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h3 = oq5Var2.h(mdjVar);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                m9j m9jVar3 = new m9j(0, mdjVar, mdj.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 15);
                oq5Var2.k0(m9jVar3);
                K3 = m9jVar3;
            }
            oq5Var = oq5Var2;
            u7g.i(i, a, (Function0) h9fVar, (Function0) ((h9f) K3), (Function0) h9fVar2, ild.C(-200029185, new gab(17, mdjVar, a), oq5Var2), oq5Var, 196614);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(mdjVar, i, i2, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r10.K(), java.lang.Integer.valueOf(r0)) == false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(na0 na0Var, hvb hvbVar, iml imlVar, st4 st4Var, jub jubVar, h4b h4bVar, drh drhVar, Function0 function0, boolean z, sdr sdrVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        Object obj;
        int i2;
        Boolean bool;
        sdr sdrVar2;
        Boolean bool2;
        sdr sdrVar3;
        na0 na0Var2 = na0Var;
        ja0 ja0Var = na0Var2.e;
        hvbVar.getClass();
        imlVar.getClass();
        st4Var.getClass();
        jubVar.getClass();
        drhVar.getClass();
        function0.getClass();
        sdrVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1030358688);
        int i3 = i | (oq5Var2.f(na0Var2) ? 4 : 2) | (oq5Var2.f(hvbVar) ? 32 : 16) | (oq5Var2.h(imlVar) ? 256 : 128) | (oq5Var2.h(st4Var) ? 2048 : 1024) | (oq5Var2.h(jubVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(h4bVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(drhVar) ? 1048576 : 524288) | (oq5Var2.h(function0) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.g(z) ? 67108864 : 33554432) | (oq5Var2.f(sdrVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (oq5Var2.P(i3 & 1, (i3 & 306783379) != 306783378)) {
            Object K = oq5Var2.K();
            Object obj2 = gq5.a;
            if (K == obj2) {
                K = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            aqi O = gld.O(imlVar.i, oq5Var2);
            aqi O2 = gld.O(imlVar.j, oq5Var2);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == obj2) {
                K2 = szf.U(new rkl(na0Var2, 3));
                oq5Var2.k0(K2);
            }
            sdr sdrVar4 = (sdr) K2;
            Object K3 = oq5Var2.K();
            if (K3 == obj2) {
                K3 = szf.U(new xtb(O, 19));
                oq5Var2.k0(K3);
            }
            sdr sdrVar5 = (sdr) K3;
            Boolean bool3 = (Boolean) sdrVar4.getValue();
            bool3.booleanValue();
            Boolean bool4 = (Boolean) sdrVar5.getValue();
            bool4.booleanValue();
            boolean f = oq5Var2.f(sdrVar4) | (i4 == 4) | ((i3 & 29360128) == 8388608);
            Object K4 = oq5Var2.K();
            if (f || K4 == obj2) {
                obj = obj2;
                i2 = i4;
                bool = bool4;
                sdrVar2 = sdrVar5;
                bool2 = bool3;
                Object fllVar = new fll(sdrVar4, na0Var2, function0, sdrVar2, null, 1);
                na0Var2 = na0Var2;
                oq5Var2.k0(fllVar);
                K4 = fllVar;
            } else {
                bool = bool4;
                obj = obj2;
                i2 = i4;
                sdrVar2 = sdrVar5;
                bool2 = bool3;
            }
            gld.x(bool2, na0Var2, bool, (Function2) K4, oq5Var2);
            quj.a(ja0Var, oq5Var2, 0);
            f8g.b(ja0Var, oq5Var2, 0);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function02);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O) {
                sdrVar3 = sdrVar2;
            } else {
                sdrVar3 = sdrVar2;
            }
            ouj.x(i5, oq5Var2, i5, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            kfh d2 = ug3.d(iz2Var, false);
            int i6 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, vciVar);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function02);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            float j = qt4.j(oq5Var2);
            boolean booleanValue = ((Boolean) sdrVar4.getValue()).booleanValue();
            Object K5 = oq5Var2.K();
            if (K5 == obj) {
                K5 = new sjl(16);
                oq5Var2.k0(K5);
            }
            yci b = nfp.b(vciVar, false, (Function1) K5);
            int i7 = 2;
            oq5Var = oq5Var2;
            c9g.j(na0Var, j, h4bVar, booleanValue, ild.C(1277951177, new all(function0, mm6Var, na0Var, O2, st4Var, sdrVar3, O, 1), oq5Var2), ild.C(847604904, new ukl(O, jubVar, mm6Var, na0Var, drhVar, i7), oq5Var2), ild.C(417258631, new tkl(imlVar, O, jubVar, hvbVar, z, i7), oq5Var2), sdrVar, b, oq5Var, i2 | 1794048 | ((i3 >> 9) & 896) | ((i3 >> 6) & 29360128));
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bll(na0Var, hvbVar, imlVar, st4Var, jubVar, h4bVar, drhVar, function0, z, sdrVar, yciVar2, i, 1);
        }
    }

    public static final void f(rbm rbmVar, tvd tvdVar, yci yciVar, hq5 hq5Var, int i) {
        rbmVar.getClass();
        tvdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-753487177);
        int i2 = (oq5Var.f(rbmVar) ? 4 : 2) | i | (oq5Var.f(tvdVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new nr(tvdVar, 26);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.U(new g1j(10, function0));
                oq5Var.k0(K2);
            }
            if (((Boolean) ((sdr) K2).getValue()).booleanValue()) {
                oq5Var.Z(-1637092039);
                g(rbmVar, function0, yciVar, oq5Var, i2 & 910);
            } else {
                oq5Var.Z(-1638172885);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(rbmVar, tvdVar, yciVar, i, 25);
        }
    }

    public static final void g(rbm rbmVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1189361060);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(rbmVar) : oq5Var.h(rbmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            p9b.a(ild.C(377765783, new wcj(19, rbmVar, function0), oq5Var), wyf.s(yciVar, function0), false, oq5Var, 6, 4);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(rbmVar, function0, yciVar, i, 4);
        }
    }

    public static final void h(ek ekVar, ik ikVar, pyc pycVar, yci yciVar, Function2 function2, boolean z, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        pyc pycVar2;
        Function2 function22;
        oq5 oq5Var;
        ekVar.getClass();
        pycVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(562901794);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(ekVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(ikVar) : oq5Var2.h(ikVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            pycVar2 = pycVar;
            i2 |= oq5Var2.h(pycVar2) ? 256 : 128;
        } else {
            pycVar2 = pycVar;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function22 = function2;
            i2 |= oq5Var2.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function22 = function2;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? 1048576 : 524288;
        }
        if ((i2 & 599187) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            yci a = androidx.compose.ui.input.nestedscroll.a.a(yciVar, zc4.L(ekVar, z, oq5Var2, 0), null);
            wn5 C = ild.C(-1037870617, new mqr(ekVar, ikVar, pycVar2, function22, 7), oq5Var2);
            agr agrVar = eq0.a;
            oq5Var = oq5Var2;
            eso.a(a, null, C, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, ((dq0) oq5Var2.j(agrVar)).c.a, ((dq0) oq5Var2.j(agrVar)).b.a, ild.C(1256546272, new j26(wn5Var, 16), oq5Var2), oq5Var, 384);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ql0(ekVar, ikVar, pycVar, yciVar, function2, z, wn5Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, Function0 function0, yci yciVar, Function2 function2, Function0 function02, hq5 hq5Var, int i, int i2) {
        int i3;
        Function2 function22;
        int i4;
        Function0 function03;
        Function2 function23;
        Function0 function04;
        vci vciVar;
        int i5;
        int i6;
        boolean z;
        Function0 function05;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(154288219);
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
            i3 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            function22 = function2;
            i3 |= oq5Var.h(function22) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i) == 0) {
                function03 = function02;
                i3 |= oq5Var.h(function03) ? 1048576 : 524288;
                if ((599187 & i3) == 599186 || !oq5Var.z()) {
                    function23 = i7 != 0 ? null : function22;
                    function04 = i4 != 0 ? null : function03;
                    oq5Var.Z(-2052864931);
                    yci m = d.m(yciVar, 88);
                    vci vciVar2 = vci.a;
                    if (function0 == null) {
                        vciVar = vciVar2;
                    } else {
                        boolean f = oq5Var.f(function0);
                        Object K = oq5Var.K();
                        if (f || K == gq5.a) {
                            K = new gct(12, function0);
                            oq5Var.k0(K);
                        }
                        yci e = androidx.compose.foundation.a.e(vciVar2, false, null, null, (Function0) K, 7);
                        vciVar = vciVar2;
                        m = m.f(e);
                    }
                    yci yciVar2 = m;
                    oq5Var.p(false);
                    yci q = androidx.compose.foundation.layout.a.q(yciVar2, 16, 0.0f, 0.0f, 0.0f, 14);
                    nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
                    i5 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, q);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    int i8 = i3;
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
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    j(wn5Var, wn5Var2, null, oq5Var, i8 & 126);
                    u1g.l(oq5Var, d.r(vciVar, 12));
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    i6 = oq5Var.P;
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
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var, i6, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    wn5Var3.invoke(oq5Var, Integer.valueOf((i8 >> 6) & 14));
                    if (function23 == null) {
                        oq5Var.Z(-1975600116);
                        z = false;
                    } else {
                        z = false;
                        oq5Var.Z(-1975600115);
                        u1g.l(oq5Var, d.e(vciVar, 6));
                        function23.invoke(oq5Var, 0);
                    }
                    oq5Var.p(z);
                    oq5Var.p(true);
                    if (function04 == null) {
                        oq5Var.Z(1973703165);
                        oq5Var.p(z);
                    } else {
                        oq5Var.Z(1973703166);
                        zdg.g(0, 2, ((dq0) oq5Var.j(eq0.a)).a.c, oq5Var, null, function04);
                        oq5Var.p(z);
                    }
                    oq5Var.p(true);
                    function05 = function04;
                } else {
                    oq5Var.S();
                    function23 = function22;
                    function05 = function03;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new ou(wn5Var, wn5Var2, wn5Var3, function0, yciVar, function23, function05, i, i2);
                    return;
                }
                return;
            }
            function03 = function02;
            if ((599187 & i3) == 599186) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            oq5Var.Z(-2052864931);
            yci m2 = d.m(yciVar, 88);
            vci vciVar22 = vci.a;
            if (function0 == null) {
            }
            yci yciVar22 = m2;
            oq5Var.p(false);
            yci q2 = androidx.compose.foundation.layout.a.q(yciVar22, 16, 0.0f, 0.0f, 0.0f, 14);
            nho a3 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, q2);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            int i82 = i3;
            if (oq5Var.O) {
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, a3, kb5Var5);
            kb5 kb5Var22 = wp5.e;
            g0g.U(oq5Var, l3, kb5Var22);
            kb5 kb5Var32 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var32);
            kb5 kb5Var42 = wp5.d;
            g0g.U(oq5Var, H3, kb5Var42);
            j(wn5Var, wn5Var2, null, oq5Var, i82 & 126);
            u1g.l(oq5Var, d.r(vciVar, 12));
            if (1.0f <= 0.0d) {
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, 1.0f);
            ta5 a22 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, layoutWeightElement2);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a22, kb5Var5);
            g0g.U(oq5Var, l22, kb5Var22);
            if (!oq5Var.O) {
            }
            ouj.x(i6, oq5Var, i6, kb5Var32);
            g0g.U(oq5Var, H22, kb5Var42);
            wn5Var3.invoke(oq5Var, Integer.valueOf((i82 >> 6) & 14));
            if (function23 == null) {
            }
            oq5Var.p(z);
            oq5Var.p(true);
            if (function04 == null) {
            }
            oq5Var.p(true);
            function05 = function04;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        function22 = function2;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        function03 = function02;
        if ((599187 & i3) == 599186) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        oq5Var.Z(-2052864931);
        yci m22 = d.m(yciVar, 88);
        vci vciVar222 = vci.a;
        if (function0 == null) {
        }
        yci yciVar222 = m22;
        oq5Var.p(false);
        yci q22 = androidx.compose.foundation.layout.a.q(yciVar222, 16, 0.0f, 0.0f, 0.0f, 14);
        nho a32 = lho.a(qx0.a, b2c.l, oq5Var, 48);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l32 = oq5Var.l();
        yci H32 = vnj.H(oq5Var, q22);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        int i822 = i3;
        if (oq5Var.O) {
        }
        kb5 kb5Var52 = wp5.f;
        g0g.U(oq5Var, a32, kb5Var52);
        kb5 kb5Var222 = wp5.e;
        g0g.U(oq5Var, l32, kb5Var222);
        kb5 kb5Var322 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var322);
        kb5 kb5Var422 = wp5.d;
        g0g.U(oq5Var, H32, kb5Var422);
        j(wn5Var, wn5Var2, null, oq5Var, i822 & 126);
        u1g.l(oq5Var, d.r(vciVar, 12));
        if (1.0f <= 0.0d) {
        }
        LayoutWeightElement layoutWeightElement22 = new LayoutWeightElement(true, 1.0f);
        ta5 a222 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, layoutWeightElement22);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a222, kb5Var52);
        g0g.U(oq5Var, l222, kb5Var222);
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var322);
        g0g.U(oq5Var, H222, kb5Var422);
        wn5Var3.invoke(oq5Var, Integer.valueOf((i822 >> 6) & 14));
        if (function23 == null) {
        }
        oq5Var.p(z);
        oq5Var.p(true);
        if (function04 == null) {
        }
        oq5Var.p(true);
        function05 = function04;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void j(wn5 wn5Var, wn5 wn5Var2, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        wn5 wn5Var3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-826265979);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.h(wn5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            wn5Var3 = wn5Var;
        } else {
            vci vciVar = vci.a;
            yci m = d.m(vciVar, 56);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            iz2 iz2Var = b2c.f;
            iz2 iz2Var2 = b2c.d;
            b bVar = b.a;
            float f = 40;
            yci m2 = d.m(bVar.a(vciVar, iz2Var2), f);
            tgo tgoVar = ugo.a;
            yci b = androidx.compose.ui.graphics.a.b(m2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, tgoVar, true, 59391);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new xlu(17);
                oq5Var.k0(K);
            }
            yci c = androidx.compose.ui.draw.a.c(b, (Function1) K);
            kfh d2 = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, c);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            eta.l((i3 >> 3) & 14, wn5Var2, oq5Var, true);
            yci u = xp3.u(d.m(bVar.a(vciVar, b2c.h), f), tgoVar);
            kfh d3 = ug3.d(iz2Var, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, u);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            wn5Var3 = wn5Var;
            wn5Var3.invoke(oq5Var, Integer.valueOf(i3 & 14));
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qks(wn5Var3, wn5Var2, yciVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(final String str, final Object obj, final ges gesVar, final long j, yci yciVar, final int i, long j2, int i2, final uoi uoiVar, hq5 hq5Var, final int i3, final int i4) {
        final yci yciVar2;
        int i5;
        int i6;
        int i7;
        yci yciVar3;
        int i8;
        long b;
        boolean booleanValue;
        fk0 fk0Var;
        float n0;
        fk0 fk0Var2;
        boolean h;
        Object K;
        Object obj2;
        boolean z;
        Object K2;
        fk0 fk0Var3;
        d85 d85Var;
        d85 d85Var2;
        boolean h2;
        Object b88Var;
        fk0 fk0Var4;
        uoi uoiVar2;
        d85 d85Var3;
        boolean z2;
        float f;
        Object obj3;
        boolean z3;
        d85 d85Var4;
        yci yciVar4;
        Object obj4;
        long j3;
        sdr sdrVar;
        boolean h3;
        Object K3;
        oq5 oq5Var;
        final int i9;
        final long j4;
        xmn r;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1094566112);
        int i10 = i3 | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.h(obj) ? 32 : 16) | (oq5Var2.f(gesVar) ? 256 : 128) | (oq5Var2.e(j) ? 2048 : 1024);
        int i11 = i4 & 16;
        if (i11 != 0) {
            i5 = i10 | 24576;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i5 = i10 | (oq5Var2.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        int i12 = i5 | (oq5Var2.d(i) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        int i13 = 524288 | i12;
        int i14 = i4 & 128;
        if (i14 != 0) {
            i13 = 13107200 | i12;
        } else if ((i3 & 12582912) == 0) {
            i6 = i2;
            i13 |= oq5Var2.d(i6) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            i7 = i13;
            if ((i7 & 38347923) == 38347922 || !oq5Var2.z()) {
                oq5Var2.U();
                if ((i3 & 1) != 0 || oq5Var2.y()) {
                    yciVar3 = i11 == 0 ? vci.a : yciVar2;
                    i8 = i7 & (-3670017);
                    b = d85.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                    i6 = i14 == 0 ? 3 : i2;
                } else {
                    oq5Var2.S();
                    i8 = i7 & (-3670017);
                    yciVar3 = yciVar2;
                    b = j2;
                }
                oq5Var2.q();
                jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                booleanValue = ((Boolean) oq5Var2.j(koe.a)).booleanValue();
                Object obj5 = gq5.a;
                if (booleanValue) {
                    oq5Var2.Z(827960166);
                    boolean f2 = oq5Var2.f(obj);
                    Object K4 = oq5Var2.K();
                    if (f2 || K4 == obj5) {
                        K4 = vq2.a(0.0f);
                        oq5Var2.k0(K4);
                    }
                    fk0Var = (fk0) K4;
                    n0 = jx7Var.n0(16);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(827858114);
                    boolean f3 = oq5Var2.f(obj);
                    Object K5 = oq5Var2.K();
                    if (f3 || K5 == obj5) {
                        K5 = vq2.a(1.0f);
                        oq5Var2.k0(K5);
                    }
                    fk0Var = (fk0) K5;
                    oq5Var2.p(false);
                    n0 = 0.0f;
                }
                fk0Var2 = fk0Var;
                Integer valueOf = Integer.valueOf(i);
                h = ((i8 & 458752) != 131072) | oq5Var2.h(fk0Var2);
                K = oq5Var2.K();
                if (!h || K == obj5) {
                    K = new dv0(i, fk0Var2, (Continuation) null);
                    oq5Var2.k0(K);
                }
                boolean z4 = true;
                int i15 = i8 & 14;
                gld.x(str, valueOf, fk0Var2, (Function2) K, oq5Var2);
                boolean z5 = i6 != 3;
                int i16 = i8 >> 18;
                int i17 = ((i8 >> 9) & 14) | 384;
                oq5Var2.Z(-914005145);
                int i18 = i6;
                act S = weo.S(0, 0, null, 7);
                if (uoiVar != null) {
                    oq5Var2.Z(965626227);
                    if ((((i17 & 14) ^ 6) <= 4 || !oq5Var2.e(j)) && (i17 & 6) != 4) {
                        z4 = false;
                    }
                    Object K6 = oq5Var2.K();
                    if (z4 || K6 == obj5) {
                        K6 = szf.g0(new d85(j));
                        oq5Var2.k0(K6);
                    }
                    oq5Var2.p(false);
                    oq5Var2.p(false);
                    sdrVar = (aqi) K6;
                    j3 = b;
                    obj4 = fk0Var2;
                    z2 = z5;
                    f = n0;
                    obj3 = obj5;
                    yciVar4 = yciVar3;
                } else {
                    oq5Var2.Z(964757979);
                    oq5Var2.p(false);
                    int i19 = (i17 & 14) ^ 6;
                    if (i19 <= 4 || !oq5Var2.e(j)) {
                        obj2 = fk0Var2;
                        if ((i17 & 6) != 4) {
                            z = false;
                            K2 = oq5Var2.K();
                            if (!z || K2 == obj5) {
                                K2 = bmq.a(j);
                                oq5Var2.k0(K2);
                            }
                            fk0Var3 = (fk0) K2;
                            d85Var = new d85(b);
                            d85Var2 = new d85(j);
                            boolean h4 = oq5Var2.h(fk0Var3) | oq5Var2.e(b);
                            if ((i19 > 4 || !oq5Var2.e(j)) && (i17 & 6) != 4) {
                                z4 = false;
                            }
                            h2 = h4 | z4 | oq5Var2.h(S);
                            Object K7 = oq5Var2.K();
                            if (!h2 || K7 == obj5) {
                                fk0Var4 = fk0Var3;
                                uoiVar2 = uoiVar;
                                d85Var3 = d85Var;
                                z2 = z5;
                                f = n0;
                                obj3 = obj5;
                                z3 = false;
                                d85Var4 = d85Var2;
                                yciVar4 = yciVar3;
                                obj4 = obj2;
                                b88Var = new b88(uoiVar2, fk0Var4, b, j, S, (Continuation) null);
                                j3 = b;
                                oq5Var2.k0(b88Var);
                            } else {
                                uoiVar2 = uoiVar;
                                b88Var = K7;
                                d85Var3 = d85Var;
                                z2 = z5;
                                f = n0;
                                obj3 = obj5;
                                yciVar4 = yciVar3;
                                obj4 = obj2;
                                z3 = false;
                                fk0Var4 = fk0Var3;
                                j3 = b;
                                d85Var4 = d85Var2;
                            }
                            gld.x(d85Var3, uoiVar2, d85Var4, (Function2) b88Var, oq5Var2);
                            sdrVar = fk0Var4.c;
                            oq5Var2.p(z3);
                        }
                    } else {
                        obj2 = fk0Var2;
                    }
                    z = true;
                    K2 = oq5Var2.K();
                    if (!z) {
                    }
                    K2 = bmq.a(j);
                    oq5Var2.k0(K2);
                    fk0Var3 = (fk0) K2;
                    d85Var = new d85(b);
                    d85Var2 = new d85(j);
                    boolean h42 = oq5Var2.h(fk0Var3) | oq5Var2.e(b);
                    if (i19 > 4) {
                    }
                    z4 = false;
                    h2 = h42 | z4 | oq5Var2.h(S);
                    Object K72 = oq5Var2.K();
                    if (h2) {
                    }
                    fk0Var4 = fk0Var3;
                    uoiVar2 = uoiVar;
                    d85Var3 = d85Var;
                    z2 = z5;
                    f = n0;
                    obj3 = obj5;
                    z3 = false;
                    d85Var4 = d85Var2;
                    yciVar4 = yciVar3;
                    obj4 = obj2;
                    b88Var = new b88(uoiVar2, fk0Var4, b, j, S, (Continuation) null);
                    j3 = b;
                    oq5Var2.k0(b88Var);
                    gld.x(d85Var3, uoiVar2, d85Var4, (Function2) b88Var, oq5Var2);
                    sdrVar = fk0Var4.c;
                    oq5Var2.p(z3);
                }
                long j5 = ((d85) sdrVar.getValue()).a;
                boolean z6 = !z2;
                yci y = d.y(yciVar4, b2c.n, z2);
                float f4 = f;
                h3 = oq5Var2.h(obj4) | oq5Var2.c(f4);
                K3 = oq5Var2.K();
                if (!h3 || K3 == obj3) {
                    K3 = new kz4(obj4, f4, 4);
                    oq5Var2.k0(K3);
                }
                oq5Var = oq5Var2;
                xcs.b(str, androidx.compose.ui.graphics.a.a(y, (Function1) K3), j5, 0L, null, 0L, null, new o9s(3), 0L, i18, z6, 1, 0, null, gesVar, oq5Var, i15, (i16 & 112) | 3072 | ((i8 << 12) & 3670016), 50680);
                i9 = i18;
                j4 = j3;
                yciVar2 = yciVar4;
            } else {
                oq5Var2.S();
                j4 = j2;
                i9 = i6;
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: e9v
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        lsq.k(str, obj, gesVar, j, yciVar2, i, j4, i9, uoiVar, (hq5) obj6, rvf.R(i3 | 1), i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i6 = i2;
        i7 = i13;
        if ((i7 & 38347923) == 38347922) {
        }
        oq5Var2.U();
        if ((i3 & 1) != 0) {
        }
        if (i11 == 0) {
        }
        i8 = i7 & (-3670017);
        b = d85.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14);
        i6 = i14 == 0 ? 3 : i2;
        oq5Var2.q();
        jx7 jx7Var2 = (jx7) oq5Var2.j(es5.h);
        booleanValue = ((Boolean) oq5Var2.j(koe.a)).booleanValue();
        Object obj52 = gq5.a;
        if (booleanValue) {
        }
        fk0Var2 = fk0Var;
        Integer valueOf2 = Integer.valueOf(i);
        h = ((i8 & 458752) != 131072) | oq5Var2.h(fk0Var2);
        K = oq5Var2.K();
        if (!h) {
        }
        K = new dv0(i, fk0Var2, (Continuation) null);
        oq5Var2.k0(K);
        boolean z42 = true;
        int i152 = i8 & 14;
        gld.x(str, valueOf2, fk0Var2, (Function2) K, oq5Var2);
        if (i6 != 3) {
        }
        int i162 = i8 >> 18;
        int i172 = ((i8 >> 9) & 14) | 384;
        oq5Var2.Z(-914005145);
        int i182 = i6;
        act S2 = weo.S(0, 0, null, 7);
        if (uoiVar != null) {
        }
        long j52 = ((d85) sdrVar.getValue()).a;
        boolean z62 = !z2;
        yci y2 = d.y(yciVar4, b2c.n, z2);
        float f42 = f;
        h3 = oq5Var2.h(obj4) | oq5Var2.c(f42);
        K3 = oq5Var2.K();
        if (!h3) {
        }
        K3 = new kz4(obj4, f42, 4);
        oq5Var2.k0(K3);
        oq5Var = oq5Var2;
        xcs.b(str, androidx.compose.ui.graphics.a.a(y2, (Function1) K3), j52, 0L, null, 0L, null, new o9s(3), 0L, i182, z62, 1, 0, null, gesVar, oq5Var, i152, (i162 & 112) | 3072 | ((i8 << 12) & 3670016), 50680);
        i9 = i182;
        j4 = j3;
        yciVar2 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void l(String str, String str2, gtv gtvVar, yci yciVar, yci yciVar2, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        int i2;
        Function0 function03;
        gtvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(210807088);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(gtvVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            function03 = function02;
            i2 |= oq5Var.h(function03) ? 1048576 : 524288;
        } else {
            function03 = function02;
        }
        int i3 = i2;
        if ((599187 & i3) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.U(new ftr(gtvVar, str2, str));
                oq5Var.k0(K);
            }
            sdr sdrVar = (sdr) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(null);
                oq5Var.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            String str3 = (String) sdrVar.getValue();
            iz2 iz2Var = b2c.f;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new x80(aqiVar, 28);
                oq5Var.k0(K3);
            }
            w1g.j(str3, null, yciVar, (Function1) K3, null, iz2Var, hd6.a, 0.0f, null, 0, ild.C(1340152336, new htv(function03, gtvVar, function0, yciVar2, 0), oq5Var), oq5Var, ((i3 >> 3) & 896) | 1772592, 912);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv(str, str2, gtvVar, yciVar, yciVar2, function0, function02, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(hur hurVar, long j, long j2, long j3, float f, kq2 kq2Var) {
        gvm gvmVar;
        int i;
        xqn xqnVar;
        if (kq2Var instanceof gvm) {
            gvmVar = (gvm) kq2Var;
            int i2 = gvmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gvmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gvmVar.k;
                Object obj2 = nm6.a;
                i = gvmVar.l;
                if (i != 0) {
                    xqn i3 = hrg.i(obj);
                    i3.a = avg.c;
                    try {
                        Function2 hvmVar = new hvm(i3, j2, f, j, null);
                        gvmVar.j = i3;
                        gvmVar.l = 1;
                        if (hurVar.k(j3, hvmVar, gvmVar) == obj2) {
                            return obj2;
                        }
                    } catch (hfm unused) {
                    }
                    xqnVar = i3;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = gvmVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (hfm unused2) {
                    }
                }
                return xqnVar.a;
            }
        }
        gvmVar = new gvm(kq2Var);
        Object obj3 = gvmVar.k;
        Object obj22 = nm6.a;
        i = gvmVar.l;
        if (i != 0) {
        }
        return xqnVar.a;
    }

    public static final lj2 n(e5d e5dVar) {
        String str = e5dVar.e;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        str.getClass();
        webPath$Storage.getClass();
        String pathForSize = etn.B(str, webPath$Storage).getPathForSize(frv.b());
        pathForSize.getClass();
        return new lj2(pathForSize);
    }

    public static final qfk o(bg2 bg2Var, String str) {
        Object obj;
        Iterator it = bg2Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qfk qfkVar = (qfk) obj;
            if (Intrinsics.d(qfkVar.a, str) || qfkVar.b.contains(str)) {
                break;
            }
        }
        return (qfk) obj;
    }

    public static final thj p(x1u x1uVar, int i, int i2) {
        x1uVar.getClass();
        pkb pkbVar = pkb.Video;
        String str = x1uVar.a;
        str.getClass();
        return new thj(pkbVar, str, i + 1, i2 + 1, "");
    }

    public static mzr q(Context context, Integer num) {
        mzr mzrVar;
        context.getClass();
        synchronized (ozr.i) {
            LinkedHashMap linkedHashMap = ozr.j;
            mzrVar = (mzr) linkedHashMap.get(num);
            if (mzrVar == null) {
                Object systemService = context.getSystemService(CameraProperty.AUDIO);
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                mzrVar = audioManager != null ? new ozr(audioManager, context, new HandlerThread("YP".concat(":HtVlmPrvdr")), num) : new nzr();
                linkedHashMap.put(num, mzrVar);
            }
        }
        return mzrVar;
    }

    public static final tgo r(e9g e9gVar, qo6 qo6Var, hq5 hq5Var, int i) {
        e9gVar.getClass();
        qo6Var.getClass();
        int ordinal = e9gVar.ordinal();
        if (ordinal == 0) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-2009588530);
            tgo Q = irf.Q(qo6Var, oq5Var);
            oq5Var.p(false);
            return Q;
        }
        if (ordinal != 1) {
            throw vz1.i((oq5) hq5Var, -2009590141, false);
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-2009586675);
        tgo R = irf.R(qo6Var, oq5Var2);
        oq5Var2.p(false);
        return R;
    }

    public static final float s(e9g e9gVar) {
        e9gVar.getClass();
        int ordinal = e9gVar.ordinal();
        if (ordinal == 0) {
            float f = qn6.a;
            return qn6.a;
        }
        if (ordinal == 1) {
            float f2 = qn6.a;
            return qn6.b;
        }
        b6e.s();
        return 0.0f;
    }

    public static final yci t(jap japVar, boolean z, float f, long j, Function1 function1, Function0 function0, hq5 hq5Var, int i, int i2) {
        yci f2;
        japVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(896462912);
        Function0 function02 = (i2 & 32) != 0 ? null : function0;
        msd msdVar = (msd) oq5Var.j(es5.l);
        aqi o0 = szf.o0(function1, oq5Var);
        aqi o02 = szf.o0(function02, oq5Var);
        aqi o03 = szf.o0(Float.valueOf(f), oq5Var);
        aqi o04 = szf.o0(Long.valueOf(j), oq5Var);
        int i3 = (i & 112) ^ 48;
        boolean z2 = true;
        boolean f3 = ((((i & 29360128) ^ 12582912) > 8388608 && oq5Var.e(500L)) || (i & 12582912) == 8388608) | oq5Var.f(o03) | ((i3 > 32 && oq5Var.f(japVar)) || (i & 48) == 32) | oq5Var.f(o04);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (f3 || K == kjnVar) {
            K = new c5l(o03, japVar, o04, (Continuation) null, 16);
            oq5Var.k0(K);
        }
        gld.w(oq5Var, japVar, (Function2) K);
        vci vciVar = vci.a;
        if (!z) {
            oq5Var.p(false);
            return vciVar;
        }
        boolean z3 = (i3 > 32 && oq5Var.f(japVar)) || (i & 48) == 32;
        Object K2 = oq5Var.K();
        if (z3 || K2 == kjnVar) {
            K2 = new mjm(2, japVar);
            oq5Var.k0(K2);
        }
        yci f4 = androidx.compose.ui.layout.a.f(vciVar, (Function1) K2);
        if ((i3 <= 32 || !oq5Var.f(japVar)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean h = oq5Var.h(msdVar) | z2 | oq5Var.f(o0) | oq5Var.f(o02);
        Object K3 = oq5Var.K();
        if (h || K3 == kjnVar) {
            K3 = new ckg(japVar, msdVar, o0, o02, (Continuation) null, 18);
            oq5Var.k0(K3);
        }
        f2 = f4.f(new SuspendPointerInputElement(japVar, null, null, new dur((Function2) K3), 6));
        oq5Var.p(false);
        return f2;
    }

    public static String u(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((o0t) it.next()).a.g.n;
            if (l5i.o(str2)) {
                return "video/mp4";
            }
            if (l5i.k(str2)) {
                z = true;
            } else if (l5i.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean v() {
        return ((i2q) i2q.e.getValue()).h();
    }

    public static final Bundle w(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        xq0.x(hrg.q("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static final yap x(Object obj) {
        if (obj != d46.a) {
            return (yap) obj;
        }
        xq0.q("Does not contain segment");
        return null;
    }

    public static sdt y(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-262692206);
        sdt sdtVar = (sdt) oq5Var.j(cfs.b);
        oq5Var.p(false);
        return sdtVar;
    }

    public static final boolean z(String str) {
        return str == null || StringsKt.U(str);
    }

    @Override // defpackage.qsq
    public final float a(int i, View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                float translationX = view.getTranslationX();
                lsq lsqVar = com.yandex.div.core.view2.animations.a.L;
                int right = view.getRight();
                if (i == -1) {
                    i = right;
                }
                return translationX - i;
            default:
                float translationX2 = view.getTranslationX();
                lsq lsqVar2 = com.yandex.div.core.view2.animations.a.L;
                int width = viewGroup.getWidth() - view.getLeft();
                if (i == -1) {
                    i = width;
                }
                return translationX2 + i;
        }
    }

    @Override // defpackage.qsq
    public float b(int i, View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
