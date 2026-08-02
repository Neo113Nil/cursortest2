package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.t;
import com.connectsdk.discovery.DiscoveryProvider;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.s;
import com.yandex.media.ynison.service.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
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
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.nonmusic.shelf.data.MyShelfBlockCoversButtonDataDto;

/* loaded from: classes3.dex */
public abstract class u7g {
    public static String a;
    public static Pair b;

    public static ArrayList A(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((N(bArr) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void B(float f, float f2, float f3) {
        if (f >= f2) {
            xq0.x("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else {
            if (f2 < f3) {
                return;
            }
            xq0.x("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    public static void C(JSONObject jSONObject) {
        List split$default;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("k");
                String optString2 = optJSONObject.optString("v");
                optString.getClass();
                if (optString.length() != 0) {
                    CopyOnWriteArraySet a2 = h3i.a();
                    next.getClass();
                    split$default = StringsKt__StringsKt.split$default(optString, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                    optString2.getClass();
                    a2.add(new h3i(next, split$default, optString2));
                }
            }
        }
    }

    public static final int D(x3h x3hVar, long j) {
        Iterator it = x3hVar.a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((w3h) it.next()).a >= j) {
                break;
            }
            i++;
        }
        return i == -1 ? r6.size() - 1 : i - 1;
    }

    public static final float E(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        return gdg.K(oq5Var).getDimension(i) / ((jx7) oq5Var.j(es5.h)).getDensity();
    }

    public static final a0 G(a0 a0Var) {
        x w;
        a0Var.getClass();
        c0 k = a0Var.m() ? a0Var.k() : null;
        if (k == null || (w = ocg.w(a0Var)) == null || w.z() != 0 || k.m()) {
            return a0Var;
        }
        pnl o = a0.o(a0Var);
        qrl r = c0.r(k);
        r.i(true);
        o.j((c0) r.b());
        return (a0) o.b();
    }

    public static final a0 H(a0 a0Var) {
        a0Var.getClass();
        c0 k = a0Var.m() ? a0Var.k() : null;
        if (k == null) {
            return a0Var;
        }
        pnl o = a0.o(a0Var);
        o.j(I(k));
        return (a0) o.b();
    }

    public static final c0 I(c0 c0Var) {
        c0Var.getClass();
        qrl r = c0.r(c0Var);
        long l = ((c0) r.b).l();
        if (l < 0) {
            l = 0;
        }
        r.h(l);
        r.j(yhn.g(((c0) r.b).o(), new lvg(0L, ((c0) r.b).l())));
        return (c0) r.b();
    }

    public static final a0 J(a0 a0Var) {
        int e;
        x w = ocg.w(a0Var);
        if (w == null) {
            return a0Var;
        }
        pnl o = a0.o(a0Var);
        chl I = x.I(w);
        if (((x) I.b).z() == 0) {
            e = -1;
        } else {
            int r = ((x) I.b).r();
            List unmodifiableList = Collections.unmodifiableList(((x) I.b).A());
            unmodifiableList.getClass();
            e = yhn.e(r, u75.f(unmodifiableList));
        }
        I.h(e);
        o.i((x) I.b());
        return (a0) o.b();
    }

    public static final a0 K(a0 a0Var) {
        x w = ocg.w(a0Var);
        if (w == null || w.z() == 0) {
            return null;
        }
        pnl o = a0.o(a0Var);
        chl I = x.I(w);
        int r = ((x) I.b).r();
        List unmodifiableList = Collections.unmodifiableList(((x) I.b).A());
        unmodifiableList.getClass();
        I.h(yhn.e(r, u75.f(unmodifiableList)));
        o.i((x) I.b());
        return (a0) o.b();
    }

    public static final a0 L(a0 a0Var) {
        i0 C;
        x w = ocg.w(a0Var);
        if (w == null || (C = y7g.C(w)) == null) {
            return a0Var;
        }
        pnl o = a0.o(a0Var);
        chl I = x.I(w);
        mse j = C.j();
        j.getClass();
        List w0 = CollectionsKt.w0(CollectionsKt.z0(j));
        ArrayList arrayList = new ArrayList();
        for (Object obj : w0) {
            Integer num = (Integer) obj;
            int size = Collections.unmodifiableList(((x) I.b).A()).size();
            num.getClass();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < size) {
                arrayList.add(obj);
            }
        }
        if (C.i() == 0 || ((x) I.b).z() == 0) {
            I.d();
            x.h((x) I.b);
        } else {
            meq l = i0.l(C);
            l.d();
            i0.g((i0) l.b);
            int size2 = arrayList.size();
            int z = ((x) I.b).z();
            o3d o3dVar = I.b;
            if (size2 >= z) {
                l.h(CollectionsKt.q0(arrayList, ((x) o3dVar).z()));
            } else {
                List unmodifiableList = Collections.unmodifiableList(((x) o3dVar).A());
                unmodifiableList.getClass();
                IntRange f = u75.f(unmodifiableList);
                ArrayList arrayList2 = new ArrayList();
                ype it = f.iterator();
                while (it.c) {
                    Object next = it.next();
                    if (!arrayList.contains(Integer.valueOf(((Number) next).intValue()))) {
                        arrayList2.add(next);
                    }
                }
                l.h(CollectionsKt.g0(arrayList, arrayList2));
            }
            i0 i0Var = (i0) l.b();
            I.d();
            x.p((x) I.b, i0Var);
        }
        o.i((x) I.b());
        return (a0) o.b();
    }

    public static long M(byte b2, byte b3) {
        int i;
        int i2 = b2 & 255;
        int i3 = b2 & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? DiscoveryProvider.TIMEOUT : 10000 << r6);
    }

    public static int N(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static final nyn O(gyn gynVar) {
        gynVar.getClass();
        if (Intrinsics.d(gynVar, lyn.a)) {
            return nyn.a;
        }
        if (Intrinsics.d(gynVar, myn.a)) {
            return nyn.b;
        }
        if (Intrinsics.d(gynVar, kyn.a)) {
            return nyn.c;
        }
        b6e.s();
        return null;
    }

    public static final int P(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean Q(a0 a0Var, nil nilVar) {
        a0Var.getClass();
        c0 k = a0Var.m() ? a0Var.k() : null;
        if (k != null) {
            if (k.o() > k.l()) {
                dfi.r(hrg.m(k.l(), ")", tlm.l(k.o(), "PlayingStatus.isValid() progressMs(", ") > durationMs(")), "YnisonRequestValidator");
                return false;
            }
            if (k.n() < 0.0d) {
                dfi.r("PlayingStatus.isValid() playbackSpeed(" + k.n() + ") is negative", "YnisonRequestValidator");
                return false;
            }
            x w = ocg.w(a0Var);
            if (w != null && nilVar.b(w)) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(long j, long j2) {
        return j - j2 <= 80000;
    }

    public static final ges T(ges gesVar, xof xofVar) {
        c4r c4rVar = gesVar.a;
        bcs bcsVar = d4r.d;
        bcs bcsVar2 = c4rVar.a;
        if (bcsVar2.equals(zbs.a)) {
            bcsVar2 = d4r.d;
        }
        bcs bcsVar3 = bcsVar2;
        long j = c4rVar.b;
        les[] lesVarArr = kes.b;
        if ((j & 1095216660480L) == 0) {
            j = d4r.a;
        }
        long j2 = j;
        tqc tqcVar = c4rVar.c;
        if (tqcVar == null) {
            tqcVar = tqc.m;
        }
        tqc tqcVar2 = tqcVar;
        oqc oqcVar = c4rVar.d;
        oqc oqcVar2 = new oqc(oqcVar != null ? oqcVar.a : 0);
        pqc pqcVar = c4rVar.e;
        pqc pqcVar2 = new pqc(pqcVar != null ? pqcVar.a : 65535);
        qpc qpcVar = c4rVar.f;
        if (qpcVar == null) {
            qpcVar = qpc.a;
        }
        qpc qpcVar2 = qpcVar;
        String str = c4rVar.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = c4rVar.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = d4r.b;
        }
        long j4 = j3;
        wu2 wu2Var = c4rVar.i;
        wu2 wu2Var2 = new wu2(wu2Var != null ? wu2Var.a : 0.0f);
        ccs ccsVar = c4rVar.j;
        if (ccsVar == null) {
            ccsVar = ccs.c;
        }
        ccs ccsVar2 = ccsVar;
        bqg bqgVar = c4rVar.k;
        if (bqgVar == null) {
            bqg bqgVar2 = bqg.c;
            bqgVar = stk.a.F();
        }
        bqg bqgVar3 = bqgVar;
        long j5 = c4rVar.l;
        if (j5 == 16) {
            j5 = d4r.c;
        }
        long j6 = j5;
        aas aasVar = c4rVar.m;
        if (aasVar == null) {
            aasVar = aas.b;
        }
        aas aasVar2 = aasVar;
        otp otpVar = c4rVar.n;
        if (otpVar == null) {
            otpVar = otp.d;
        }
        otp otpVar2 = otpVar;
        iuk iukVar = c4rVar.o;
        kpa kpaVar = c4rVar.p;
        if (kpaVar == null) {
            kpaVar = dbc.a;
        }
        c4r c4rVar2 = new c4r(bcsVar3, j2, tqcVar2, oqcVar2, pqcVar2, qpcVar2, str2, j4, wu2Var2, ccsVar2, bqgVar3, j6, aasVar2, otpVar2, iukVar, kpaVar);
        x5k x5kVar = gesVar.b;
        int i = y5k.b;
        int i2 = x5kVar.a;
        int i3 = 5;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 5;
        }
        int i4 = x5kVar.b;
        if (i4 == 3) {
            int ordinal = xofVar.ordinal();
            if (ordinal == 0) {
                i3 = 4;
            } else if (ordinal != 1) {
                b6e.s();
                return null;
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int ordinal2 = xofVar.ordinal();
            if (ordinal2 == 0) {
                i3 = 1;
            } else {
                if (ordinal2 != 1) {
                    b6e.s();
                    return null;
                }
                i3 = 2;
            }
        } else {
            i3 = i4;
        }
        long j7 = x5kVar.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = y5k.a;
        }
        fcs fcsVar = x5kVar.d;
        if (fcsVar == null) {
            fcsVar = fcs.c;
        }
        duk dukVar = x5kVar.e;
        h6g h6gVar = x5kVar.f;
        int i5 = x5kVar.g;
        int i6 = u5g.b;
        if (i5 == 0) {
            i5 = u5g.b;
        }
        int i7 = x5kVar.h;
        if (i7 == Integer.MIN_VALUE) {
            i7 = 1;
        }
        lds ldsVar = x5kVar.i;
        if (ldsVar == null) {
            ldsVar = lds.c;
        }
        return new ges(c4rVar2, new x5k(i2, i3, j7, fcsVar, dukVar, h6gVar, i5, i7, ldsVar), gesVar.c);
    }

    public static final String U(s sVar) {
        sVar.getClass();
        String h = sVar.h();
        h.getClass();
        if (h.length() > 0) {
            return h;
        }
        return null;
    }

    public static final void V(int i, int i2, mhp mhpVar) {
        mhpVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(mhpVar.f(i4));
            }
            i3 >>>= 1;
        }
        throw new z5i(mhpVar.i(), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static final bri W(MyShelfBlockCoversButtonDataDto myShelfBlockCoversButtonDataDto) {
        ?? r1;
        String title = myShelfBlockCoversButtonDataDto.getTitle();
        if (title == null) {
            return null;
        }
        List covers = myShelfBlockCoversButtonDataDto.getCovers();
        if (covers != null) {
            ArrayList O = CollectionsKt.O(covers);
            r1 = new ArrayList(v75.o(O, 10));
            Iterator it = O.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                str.getClass();
                webPath$Storage.getClass();
                r1.add(etn.B(str, webPath$Storage));
            }
        } else {
            r1 = c5b.a;
        }
        return new bri(title, r1);
    }

    public static final gyn X(nyn nynVar) {
        nynVar.getClass();
        int ordinal = nynVar.ordinal();
        if (ordinal == 0) {
            return lyn.a;
        }
        if (ordinal == 1) {
            return myn.a;
        }
        if (ordinal == 2) {
            return kyn.a;
        }
        b6e.s();
        return null;
    }

    public static final cqq Y(rj6 rj6Var) {
        zpq zpqVar;
        rj6Var.getClass();
        if (rj6Var instanceof qj6) {
            return new bqq(((qj6) rj6Var).a);
        }
        if (!(rj6Var instanceof pj6)) {
            b6e.s();
            return null;
        }
        boolean z = (rj6Var instanceof mj6) && ((mj6) rj6Var).a == 404;
        if (z) {
            zpqVar = zpq.b;
        } else {
            if (z) {
                b6e.s();
                return null;
            }
            zpqVar = zpq.a;
        }
        return new aqq(zpqVar, ((pj6) rj6Var).a());
    }

    public static final void a(boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(729020824);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(-1390765910);
            } else {
                oq5Var.Z(-1390153288);
                Object j = oq5Var.j(AndroidCompositionLocals_androidKt.b);
                j.getClass();
                Window window = ((Activity) j).getWindow();
                boolean h = ((i2 & 14) == 4) | oq5Var.h(window);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new ps(window, z, 9);
                    oq5Var.k0(K);
                }
                gld.D((Function0) K, oq5Var);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k4m(i, 12, z);
        }
    }

    public static final void b(Function0 function0, a8g a8gVar, yci yciVar, long j, hq5 hq5Var, int i) {
        yci yciVar2;
        yci yciVar3;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1175996967);
        int i2 = i | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(a8gVar) ? 256 : 128) | 3072 | (oq5Var.e(j) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                yciVar3 = vci.a;
            } else {
                oq5Var.S();
                yciVar3 = yciVar;
            }
            oq5Var.q();
            ltg.i(a.a(d.g(d.d(yciVar3, 1.0f), 68, 0.0f, 2), "link_item"), false, j, function0, null, ild.C(-330895725, new ykf(2, a8gVar), oq5Var), oq5Var, ((i2 >> 6) & 896) | 196608 | ((i2 << 6) & 7168), 18);
            yciVar2 = yciVar3;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new df1(function0, a8gVar, yciVar2, j, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(int i, w3h w3hVar, u6k u6kVar, Function1 function1, Function0 function0, z2h z2hVar, xwr xwrVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        u6k u6kVar2;
        float f;
        float f2;
        sdr b2;
        yci d;
        boolean z;
        kjn kjnVar;
        Object lcoVar;
        sdr sdrVar;
        kjn kjnVar2;
        yci yciVar2;
        boolean f3;
        Object K;
        yci yciVar3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2103110259);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(w3hVar) : oq5Var.h(w3hVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            u6kVar2 = u6kVar;
            i3 |= oq5Var.f(u6kVar2) ? 256 : 128;
        } else {
            u6kVar2 = u6kVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.d(z2hVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.f(xwrVar) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if ((4793491 & i4) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
        } else {
            int h = u6kVar2.h();
            if (z2hVar != z2h.b) {
                if (i >= h) {
                    f = i != h ? i == h + 1 ? 0.3f : i == h + 2 ? 0.1f : 0.05f : 0.0f;
                }
                f2 = 1.0f;
                float f4 = f2;
                b2 = pk0.b(f, null, null, null, oq5Var, 0, 30);
                sdr b3 = pk0.b((z2hVar == z2h.a || i != h) ? f4 : xwrVar.f, null, null, null, oq5Var, 0, 30);
                String str = w3hVar.b;
                ges a2 = xwrVar.a(oq5Var);
                long j = ((dq0) oq5Var.j(eq0.a)).b.a;
                vci vciVar = vci.a;
                d = d.d(vciVar, f4);
                z = ((i4 & 7168) != 2048) | ((i4 & 112) != 32 || ((i4 & 64) != 0 && oq5Var.h(w3hVar))) | ((57344 & i4) == 16384);
                Object K2 = oq5Var.K();
                kjnVar = gq5.a;
                if (!z || K2 == kjnVar) {
                    sdrVar = b2;
                    kjnVar2 = kjnVar;
                    yciVar2 = d;
                    lcoVar = new lco(function1, w3hVar, function0, null, 17);
                    oq5Var.k0(lcoVar);
                } else {
                    lcoVar = K2;
                    kjnVar2 = kjnVar;
                    yciVar2 = d;
                    sdrVar = b2;
                }
                ffm ffmVar = eur.a;
                yci n = androidx.compose.foundation.layout.a.n(yciVar2.f(new SuspendPointerInputElement(w3hVar, function1, null, new dur((Function2) lcoVar), 4)), xwrVar.b, xwrVar.c);
                f3 = oq5Var.f(sdrVar) | oq5Var.f(b3);
                K = oq5Var.K();
                if (!f3 || K == kjnVar2) {
                    K = new xum(28, sdrVar, b3);
                    oq5Var.k0(K);
                }
                yciVar3 = vciVar;
                xcs.b(str, androidx.compose.ui.graphics.a.a(n, (Function1) K), j, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, a2, oq5Var, 0, 0, 65016);
                oq5Var = oq5Var;
            }
            f = 1.0f;
            f2 = 1.0f;
            float f42 = f2;
            b2 = pk0.b(f, null, null, null, oq5Var, 0, 30);
            sdr b32 = pk0.b((z2hVar == z2h.a || i != h) ? f42 : xwrVar.f, null, null, null, oq5Var, 0, 30);
            String str2 = w3hVar.b;
            ges a22 = xwrVar.a(oq5Var);
            long j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
            vci vciVar2 = vci.a;
            d = d.d(vciVar2, f42);
            z = ((i4 & 7168) != 2048) | ((i4 & 112) != 32 || ((i4 & 64) != 0 && oq5Var.h(w3hVar))) | ((57344 & i4) == 16384);
            Object K22 = oq5Var.K();
            kjnVar = gq5.a;
            if (z) {
            }
            sdrVar = b2;
            kjnVar2 = kjnVar;
            yciVar2 = d;
            lcoVar = new lco(function1, w3hVar, function0, null, 17);
            oq5Var.k0(lcoVar);
            ffm ffmVar2 = eur.a;
            yci n2 = androidx.compose.foundation.layout.a.n(yciVar2.f(new SuspendPointerInputElement(w3hVar, function1, null, new dur((Function2) lcoVar), 4)), xwrVar.b, xwrVar.c);
            f3 = oq5Var.f(sdrVar) | oq5Var.f(b32);
            K = oq5Var.K();
            if (!f3) {
            }
            K = new xum(28, sdrVar, b32);
            oq5Var.k0(K);
            yciVar3 = vciVar2;
            xcs.b(str2, androidx.compose.ui.graphics.a.a(n2, (Function1) K), j2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, a22, oq5Var, 0, 0, 65016);
            oq5Var = oq5Var;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ou(i, w3hVar, u6kVar, function1, function0, z2hVar, xwrVar, yciVar3, i2);
        }
    }

    public static final void d(String str, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(586206006);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2);
        if ((i2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            xcs.b(str, xv.z(d.d(androidx.compose.foundation.layout.a.m(vci.a, 16), 1.0f), 0.7f), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, (i2 & 14) | 48, 0, 65016);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new da1(str, i, 17);
        }
    }

    public static final void e(hvb hvbVar, hq5 hq5Var, int i) {
        int i2;
        hvb hvbVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1965833390);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(hvbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            hvbVar2 = hvbVar;
        } else {
            hvbVar2 = hvbVar;
            f(hvbVar2, ild.C(-397226211, new mo5(hvbVar, 7), oq5Var), u2x.b, u2x.c, u2x.d, null, oq5Var, (i2 & 14) | 28080, 32);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o6h(hvbVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(hvb hvbVar, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, wn5 wn5Var4, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        boolean z;
        dvb dvbVar;
        cma cmaVar;
        int i4;
        int i5;
        boolean z2;
        wn5 wn5Var5;
        wn5 wn5Var6;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(971710651);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(hvbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(wn5Var3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(wn5Var4) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((74899 & i3) == 74898 || !oq5Var.z()) {
                vci vciVar = vci.a;
                if (i6 != 0) {
                    yciVar2 = vciVar;
                }
                z = hvbVar instanceof gvb;
                dvbVar = dvb.a;
                if (!z) {
                    cmaVar = new cma(((gvb) hvbVar).c());
                } else {
                    if (!Intrinsics.d(hvbVar, dvbVar)) {
                        b6e.s();
                        return;
                    }
                    cmaVar = null;
                }
                gz2 gz2Var = b2c.o;
                kx0 kx0Var = qx0.c;
                ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 48);
                i4 = oq5Var.P;
                int i7 = i3;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, yciVar2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                yci yciVar3 = yciVar2;
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var, a2, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                if (!Intrinsics.d(hvbVar, dvbVar)) {
                    oq5Var.Z(1873041737);
                    oq5Var.p(false);
                } else {
                    if (!z) {
                        throw vz1.i(oq5Var, 1873039527, false);
                    }
                    oq5Var.Z(1873043392);
                    wn5Var.invoke(hvbVar, oq5Var, Integer.valueOf(i7 & 126));
                    oq5Var.p(false);
                }
                yci o = androidx.compose.foundation.layout.a.o(vciVar, v0k.a, 0.0f, 2);
                if (cmaVar != null) {
                    o = o.f(d.r(vciVar, cmaVar.a));
                }
                ta5 a3 = sa5.a(kx0Var, b2c.n, oq5Var, 0);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, o);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                u1g.l(oq5Var, d.e(vciVar, bub.a));
                if (!Intrinsics.d(hvbVar, dvbVar)) {
                    z2 = true;
                } else {
                    if (!z) {
                        b6e.s();
                        return;
                    }
                    z2 = false;
                }
                wn5Var2.invoke(Boolean.valueOf(z2), oq5Var, Integer.valueOf((i7 >> 3) & 112));
                u1g.l(oq5Var, d.e(vciVar, bub.b));
                wn5Var5 = wn5Var3;
                wn5Var5.invoke(oq5Var, Integer.valueOf((i7 >> 9) & 14));
                u1g.l(oq5Var, d.e(vciVar, bub.c));
                wn5Var6 = wn5Var4;
                wn5Var6.invoke(oq5Var, Integer.valueOf((i7 >> 12) & 14));
                oq5Var.p(true);
                oq5Var.p(true);
                yciVar2 = yciVar3;
            } else {
                oq5Var.S();
                wn5Var5 = wn5Var3;
                wn5Var6 = wn5Var4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new j6h(hvbVar, wn5Var, wn5Var2, wn5Var5, wn5Var6, yciVar2, i, i2, 1);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((74899 & i3) == 74898) {
        }
        vci vciVar2 = vci.a;
        if (i6 != 0) {
        }
        z = hvbVar instanceof gvb;
        dvbVar = dvb.a;
        if (!z) {
        }
        gz2 gz2Var2 = b2c.o;
        kx0 kx0Var2 = qx0.c;
        ta5 a22 = sa5.a(kx0Var2, gz2Var2, oq5Var, 48);
        i4 = oq5Var.P;
        int i72 = i3;
        androidx.compose.runtime.internal.a l3 = oq5Var.l();
        yci H3 = vnj.H(oq5Var, yciVar2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        yci yciVar32 = yciVar2;
        if (oq5Var.O) {
        }
        kb5 kb5Var5 = wp5.f;
        g0g.U(oq5Var, a22, kb5Var5);
        kb5 kb5Var22 = wp5.e;
        g0g.U(oq5Var, l3, kb5Var22);
        kb5 kb5Var32 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i4, oq5Var, i4, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H3, kb5Var42);
        if (!Intrinsics.d(hvbVar, dvbVar)) {
        }
        yci o2 = androidx.compose.foundation.layout.a.o(vciVar2, v0k.a, 0.0f, 2);
        if (cmaVar != null) {
        }
        ta5 a32 = sa5.a(kx0Var2, b2c.n, oq5Var, 0);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, o2);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, kb5Var5);
        g0g.U(oq5Var, l22, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var32);
        g0g.U(oq5Var, H22, kb5Var42);
        u1g.l(oq5Var, d.e(vciVar2, bub.a));
        if (!Intrinsics.d(hvbVar, dvbVar)) {
        }
        wn5Var2.invoke(Boolean.valueOf(z2), oq5Var, Integer.valueOf((i72 >> 3) & 112));
        u1g.l(oq5Var, d.e(vciVar2, bub.b));
        wn5Var5 = wn5Var3;
        wn5Var5.invoke(oq5Var, Integer.valueOf((i72 >> 9) & 14));
        u1g.l(oq5Var, d.e(vciVar2, bub.c));
        wn5Var6 = wn5Var4;
        wn5Var6.invoke(oq5Var, Integer.valueOf((i72 >> 12) & 14));
        oq5Var.p(true);
        oq5Var.p(true);
        yciVar2 = yciVar32;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void g(f4h f4hVar, sdr sdrVar, c6h c6hVar, mcu mcuVar, sdr sdrVar2, ab0 ab0Var, hvb hvbVar, yci yciVar, hq5 hq5Var, int i) {
        sdr sdrVar3;
        yci yciVar2;
        f4hVar.getClass();
        sdrVar.getClass();
        mcuVar.getClass();
        sdrVar2.getClass();
        ab0Var.getClass();
        hvbVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-425128343);
        int i2 = (oq5Var.h(f4hVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            sdrVar3 = sdrVar;
            i2 |= oq5Var.f(sdrVar3) ? 32 : 16;
        } else {
            sdrVar3 = sdrVar;
        }
        int i3 = i2 | (oq5Var.h(c6hVar) ? 256 : 128) | (oq5Var.f(mcuVar) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(sdrVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i3 | (oq5Var.h(ab0Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(hvbVar) ? 1048576 : 524288) | 12582912;
        if ((4793491 & i4) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            t6h t6hVar = (t6h) bcx.x(c6hVar.getState(), oq5Var, 0).getValue();
            kfh d = ug3.d(b2c.b, false);
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (Intrinsics.d(t6hVar, r6h.a)) {
                oq5Var.Z(-89678598);
                e(hvbVar, oq5Var, (i4 >> 18) & 14);
                oq5Var.p(false);
            } else {
                if (!(t6hVar instanceof s6h)) {
                    throw vz1.i(oq5Var, -2081103795, false);
                }
                oq5Var.Z(-89459087);
                s6h s6hVar = (s6h) t6hVar;
                iil iilVar = s6hVar.a;
                ynn i6 = irv.i(oq5Var);
                z5h z5hVar = s6hVar.b;
                boolean h = oq5Var.h(c6hVar);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new i6h(c6hVar, 1);
                    oq5Var.k0(K);
                }
                yci c = com.yandex.music.core.ui.compose.a.c(vciVar, i6, z5hVar, (pyc) K, 14);
                int i7 = i4 << 12;
                h(iilVar, sdrVar3, f4hVar, ab0Var, sdrVar2, hvbVar, c6hVar, mcuVar, c, oq5Var, (i7 & 29360128) | (i4 & 112) | ((i4 << 6) & 896) | ((i4 >> 6) & 7168) | (i4 & 57344) | ((i4 >> 3) & 458752) | (3670016 & i7));
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k6h(f4hVar, sdrVar, c6hVar, mcuVar, sdrVar2, ab0Var, hvbVar, yciVar2, i, 1);
        }
    }

    public static final void h(iil iilVar, sdr sdrVar, f4h f4hVar, ab0 ab0Var, sdr sdrVar2, hvb hvbVar, c6h c6hVar, mcu mcuVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        f4h f4hVar2;
        oq5 oq5Var;
        sdr sdrVar3;
        c6h c6hVar2;
        iil iilVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1978611046);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(iilVar) : oq5Var2.h(iilVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(sdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f4hVar2 = f4hVar;
            i2 |= oq5Var2.h(f4hVar2) ? 256 : 128;
        } else {
            f4hVar2 = f4hVar;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(ab0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(sdrVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(hvbVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.h(c6hVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? oq5Var2.f(mcuVar) : oq5Var2.h(mcuVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((i3 & 38347923) == 38347922 && oq5Var2.z()) {
            oq5Var2.S();
            sdrVar3 = sdrVar;
            iilVar2 = iilVar;
            c6hVar2 = c6hVar;
            oq5Var = oq5Var2;
        } else {
            cml cmlVar = iilVar.a.b;
            oq5Var = oq5Var2;
            sdrVar3 = sdrVar;
            c6hVar2 = c6hVar;
            iilVar2 = iilVar;
            f(hvbVar, ild.C(-232535223, new ntb(f4hVar2, sdrVar, c6hVar, mcuVar, iilVar, ab0Var, pk0.b(((u7l) sdrVar.getValue()).a ? 1.0f : 0.89f, null, "lyrics cover scale", null, oq5Var, 3072, 22), 3), oq5Var), ild.C(-1460255739, new l6h(cmlVar, sdrVar2, c6hVar2, 1), oq5Var), ild.C(1113177970, new m6h(cmlVar, sdrVar3, c6hVar2, 1), oq5Var), ild.C(-1980647983, new q6h(0, sdrVar3, iilVar2, c6hVar2), oq5Var), yciVar, oq5Var, ((i3 >> 15) & 14) | 28080 | ((i3 >> 9) & 458752), 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n6h(iilVar2, sdrVar3, f4hVar, ab0Var, sdrVar2, hvbVar, c6hVar2, mcuVar, yciVar, i, 1);
        }
    }

    public static final void i(int i, fvf fvfVar, Function0 function0, Function0 function02, Function0 function03, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        wn5 wn5Var2;
        oq5 oq5Var;
        fvfVar.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-140145646);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(fvfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 196608) == 0) {
            wn5Var2 = wn5Var;
            i3 |= oq5Var2.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            wn5Var2 = wn5Var;
        }
        if (oq5Var2.P(i3 & 1, (74899 & i3) != 74898)) {
            oq5Var = oq5Var2;
            xp3.d(rvf.M(i, oq5Var2), fvfVar, null, ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2)), function0, ild.C(980303632, new gja(function02, function03, 3), oq5Var2), false, false, null, null, null, wn5Var2, oq5Var, 196608 | (i3 & 112) | (57344 & (i3 << 6)), (i3 >> 12) & 112, 1988);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cj(i, fvfVar, function0, function02, function03, wn5Var, i2);
        }
    }

    public static final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(771126606);
        if (oq5Var.P(i & 1, i != 0)) {
            iz2 iz2Var = b2c.f;
            yci u = xp3.u(d.m(vci.a, 52), ugo.a);
            agr agrVar = eq0.a;
            yci a2 = a.a(androidx.compose.foundation.a.b(u, ((dq0) oq5Var.j(agrVar)).c.c, vnj.i), "destination_icon");
            kfh d = ug3.d(iz2Var, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            gae.b(a0g.E(R.drawable.ic_site_24, 0, oq5Var), null, null, ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 48, 4);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rea(i, 28);
        }
    }

    public static final void k(po6 po6Var, boolean z, bzj bzjVar, bg5 bg5Var, int i, qfi qfiVar, qfi qfiVar2, qfi qfiVar3, qfi qfiVar4, Function1 function1, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        aqi aqiVar;
        aqi aqiVar2;
        int i3;
        Object a2;
        bg5Var.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2090940895);
        int i4 = i2 | (oq5Var2.f(po6Var) ? 4 : 2) | (oq5Var2.g(z) ? 32 : 16) | (oq5Var2.d(bzjVar.ordinal()) ? 256 : 128) | (oq5Var2.h(bg5Var) ? 2048 : 1024) | (oq5Var2.d(i) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(qfiVar) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(qfiVar2) ? 1048576 : 524288) | (oq5Var2.f(qfiVar3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.f(qfiVar4) ? 67108864 : 33554432) | (oq5Var2.h(function1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (oq5Var2.P(i4 & 1, (306783379 & i4) != 306783378)) {
            aqi M = gld.M(bg5Var.h(), oq5Var2);
            aqi M2 = gld.M(bg5Var.l(), oq5Var2);
            aqi M3 = gld.M(bg5Var.c(), oq5Var2);
            boolean a3 = ((frs) M.getValue()).a();
            Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
            boolean z2 = ((i4 & 458752) == 131072) | ((i4 & 3670016) == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 234881024) == 67108864) | ((i4 & 1879048192) == 536870912);
            Object K = oq5Var2.K();
            if (z2 || K == gq5.a) {
                n8g b2 = t75.b();
                aqiVar = M;
                aqiVar2 = M3;
                b2.add(new nw6(qfiVar.a, new m9n(qfiVar, 2)));
                b2.add(new nw6(qfiVar2.a, new m9n(qfiVar2, 3)));
                b2.add(new nw6(qfiVar3.a, new m9n(qfiVar3, 4)));
                b2.add(new nw6(qfiVar4.a, new m9n(qfiVar4, 5)));
                String string = context.getString(R.string.delete_button);
                string.getClass();
                i3 = 0;
                b2.add(new nw6(string, new q9n(i, 0, function1)));
                a2 = t75.a(b2);
                oq5Var2.k0(a2);
            } else {
                aqiVar = M;
                aqiVar2 = M3;
                a2 = K;
                i3 = 0;
            }
            oq5Var = oq5Var2;
            pd.b(new qzm[i3], true, ild.C(1995292568, new u43(i, (List) a2, bzjVar, bg5Var, z, a3, M2, aqiVar2, po6Var, aqiVar), oq5Var2), oq5Var, 432, 0);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mc(po6Var, z, bzjVar, bg5Var, i, qfiVar, qfiVar2, qfiVar3, qfiVar4, function1, i2);
        }
    }

    public static final void l(final oxn oxnVar, final po6 po6Var, final int i, boolean z, final bzj bzjVar, bg5 bg5Var, qfi qfiVar, qfi qfiVar2, qfi qfiVar3, qfi qfiVar4, qfi qfiVar5, yci yciVar, hq5 hq5Var, int i2) {
        boolean z2;
        bg5 bg5Var2;
        qfi qfiVar6;
        qfi qfiVar7;
        oq5 oq5Var;
        yci yciVar2;
        oxnVar.getClass();
        po6Var.getClass();
        bg5Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2064044943);
        int i3 = (i2 & 6) == 0 ? (oq5Var2.f(oxnVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(po6Var) : oq5Var2.h(po6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= oq5Var2.g(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.d(bzjVar.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            bg5Var2 = bg5Var;
            i3 |= oq5Var2.h(bg5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            bg5Var2 = bg5Var;
        }
        if ((1572864 & i2) == 0) {
            qfiVar6 = qfiVar;
            i3 |= oq5Var2.f(qfiVar6) ? 1048576 : 524288;
        } else {
            qfiVar6 = qfiVar;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var2.f(qfiVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            qfiVar7 = qfiVar3;
            i3 |= oq5Var2.f(qfiVar7) ? 67108864 : 33554432;
        } else {
            qfiVar7 = qfiVar3;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= oq5Var2.f(qfiVar4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i4 = (oq5Var2.f(qfiVar5) ? (char) 4 : (char) 2) | '0';
        if (oq5Var2.P(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            boolean z3 = ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((i3 & 1879048192) == 536870912);
            int i5 = i4 & 14;
            boolean z4 = z3 | (i5 == 4);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (z4 || K == kjnVar) {
                ArrayList arrayList = new ArrayList(v75.o(u75.h(qfiVar, qfiVar2, qfiVar3, qfiVar4, qfiVar5), 10));
                for (Iterator it = r1.iterator(); it.hasNext(); it = it) {
                    qfi qfiVar8 = (qfi) it.next();
                    arrayList.add(new nw6(qfiVar8.a, new m9n(qfiVar8, 0)));
                }
                oq5Var2.k0(arrayList);
                obj = arrayList;
            }
            final List list = (List) obj;
            boolean z5 = i5 == 4;
            Object K2 = oq5Var2.K();
            if (z5 || K2 == kjnVar) {
                K2 = new m9n(qfiVar5, 1);
                oq5Var2.k0(K2);
            }
            final boolean z6 = z2;
            final bg5 bg5Var3 = bg5Var2;
            oq5Var = oq5Var2;
            com.yandex.music.design.components.removable.a.a(com.yandex.music.design.components.removable.a.c((Function0) K2, oq5Var2), null, false, 0L, ild.C(-2018498406, new pyc() { // from class: o9n
                @Override // defpackage.pyc
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    hq5 hq5Var2 = (hq5) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((oho) obj2).getClass();
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                        bzj bzjVar2 = bzjVar;
                        oxn oxnVar2 = oxn.this;
                        bg5 bg5Var4 = bg5Var3;
                        u7g.r(oxnVar2, po6Var, bg5Var4, i, z6, bzjVar2, list, ild.C(341857815, new vtb(21, bzjVar2, oxnVar2, bg5Var4), oq5Var3), vci.a, oq5Var3, 12582912);
                    } else {
                        oq5Var3.S();
                    }
                    return Unit.a;
                }
            }, oq5Var2), oq5Var, 24576, 14);
            yciVar2 = vci.a;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new p9n(oxnVar, po6Var, i, z, bzjVar, bg5Var, qfiVar6, qfiVar2, qfiVar7, qfiVar4, qfiVar5, yciVar2, i2);
        }
    }

    public static final void m(r6p r6pVar, tmb tmbVar, nnq nnqVar, qnq qnqVar, Function0 function0, yci yciVar, Function0 function02, hq5 hq5Var, int i) {
        yci yciVar2;
        r6pVar.getClass();
        nnqVar.getClass();
        qnqVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(265045354);
        int i2 = i | (oq5Var.h(r6pVar) ? 4 : 2) | (oq5Var.h(tmbVar) ? 32 : 16) | (oq5Var.f(nnqVar) ? 256 : 128) | (oq5Var.h(qnqVar) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608 | (oq5Var.h(function02) ? 1048576 : 524288);
        if (oq5Var.P(i2 & 1, (599187 & i2) != 599186)) {
            pm0.a(null, ild.C(1327074561, new pr(r6pVar, tmbVar, nnqVar, qnqVar, function0, function02), oq5Var), oq5Var, 48, 1);
            yciVar2 = vci.a;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl1(r6pVar, tmbVar, nnqVar, qnqVar, function0, yciVar2, function02, i);
        }
    }

    public static final void n(n9b n9bVar, Function0 function0) {
        n9bVar.getClass();
        function0.getClass();
        n9bVar.a.a(new wn5(new xtp(1, function0), 654500166, true));
    }

    public static final void o(sdr sdrVar, xit xitVar, z2h z2hVar, x3h x3hVar, b2h b2hVar, Function1 function1, Function1 function12, Function0 function0, Function0 function02, yci yciVar, boolean z, hq5 hq5Var, int i) {
        int i2;
        int i3;
        Continuation continuation;
        int i4;
        u6k u6kVar;
        aqi aqiVar;
        fvf fvfVar;
        oq5 oq5Var;
        x3h x3hVar2 = x3hVar;
        sdrVar.getClass();
        z2hVar.getClass();
        b2hVar.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(726016355);
        int i5 = i | (oq5Var2.f(sdrVar) ? 4 : 2) | (oq5Var2.f(xitVar) ? 32 : 16) | (oq5Var2.d(z2hVar.ordinal()) ? 256 : 128) | (oq5Var2.f(x3hVar2) ? 2048 : 1024) | (oq5Var2.f(b2hVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(function12) ? 1048576 : 524288) | (oq5Var2.h(function0) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.h(function02) ? 67108864 : 33554432) | (oq5Var2.f(yciVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i6 = oq5Var2.g(z) ? 4 : 2;
        if ((i5 & 306783379) == 306783378 && (i6 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            Long valueOf = Long.valueOf(((Number) sdrVar.getValue()).longValue() + 800);
            boolean z2 = (i5 & 14) == 4;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            Continuation continuation2 = null;
            if (z2 || K == kjnVar) {
                K = new jwb(sdrVar, continuation2, 2);
                oq5Var2.k0(K);
            }
            aqi i0 = szf.i0(oq5Var2, valueOf, (Function2) K);
            int i7 = i5 >> 9;
            int i8 = (i7 & 14) ^ 6;
            boolean f = ((i8 > 4 && oq5Var2.f(x3hVar2)) || (i7 & 6) == 4) | oq5Var2.f(i0);
            Object K2 = oq5Var2.K();
            if (f || K2 == kjnVar) {
                i2 = i5;
                K2 = k5r.h(D(x3hVar2, ((Number) i0.getValue()).longValue()), oq5Var2);
            } else {
                i2 = i5;
            }
            u6k u6kVar2 = (u6k) K2;
            boolean f2 = oq5Var2.f(i0) | oq5Var2.f(u6kVar2) | ((i8 > 4 && oq5Var2.h(x3hVar2)) || (i7 & 6) == 4);
            Object K3 = oq5Var2.K();
            if (f2 || K3 == kjnVar) {
                i3 = i2;
                continuation = null;
                i4 = SQLiteDatabase.OPEN_SHAREDCACHE;
                K3 = new fpq(i0, u6kVar2, x3hVar2, continuation, 11);
                u6kVar = u6kVar2;
                aqiVar = i0;
                x3hVar2 = x3hVar2;
                oq5Var2.k0(K3);
            } else {
                u6kVar = u6kVar2;
                aqiVar = i0;
                i3 = i2;
                continuation = null;
                i4 = SQLiteDatabase.OPEN_SHAREDCACHE;
            }
            gld.w(oq5Var2, u6kVar, (Function2) K3);
            int h = u6kVar.h() + 1;
            if (h < 0) {
                h = 0;
            }
            fvf a2 = hvf.a(h, 0, oq5Var2, 0, 2);
            uoi uoiVar = a2.f;
            boolean f3 = ((i3 & 458752) == i4) | oq5Var2.f(a2);
            Object K4 = oq5Var2.K();
            if (f3 || K4 == kjnVar) {
                K4 = new swr(a2, function1, continuation, 0);
                oq5Var2.k0(K4);
            }
            gld.w(oq5Var2, uoiVar, (Function2) K4);
            int i9 = i3 & 896;
            boolean f4 = (i9 == 256) | oq5Var2.f(u6kVar) | oq5Var2.f(a2);
            Object K5 = oq5Var2.K();
            if (f4 || K5 == kjnVar) {
                fvfVar = a2;
                K5 = new fpq(z2hVar, u6kVar, fvfVar, continuation, 10);
                oq5Var2.k0(K5);
            } else {
                fvfVar = a2;
            }
            gld.y(u6kVar, z2hVar, (Function2) K5, oq5Var2);
            boolean f5 = oq5Var2.f(u6kVar) | ((i3 & 29360128) == 8388608);
            Object K6 = oq5Var2.K();
            if (f5 || K6 == kjnVar) {
                K6 = new v0r(function0, u6kVar, continuation, 13);
                oq5Var2.k0(K6);
            }
            gld.w(oq5Var2, x3hVar2, (Function2) K6);
            boolean f6 = (i9 == 256) | oq5Var2.f(aqiVar) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | oq5Var2.f(u6kVar) | ((3670016 & i3) == 1048576) | ((234881024 & i3) == 67108864);
            Object K7 = oq5Var2.K();
            if (f6 || K7 == kjnVar) {
                ofr ofrVar = new ofr(x3hVar2, aqiVar, z2hVar, b2hVar, u6kVar, function12, function02, 1);
                oq5Var2.k0(ofrVar);
                K7 = ofrVar;
            }
            oq5Var = oq5Var2;
            weo.g(yciVar, fvfVar, xitVar, null, null, null, z, (Function1) K7, oq5Var, ((i3 << 3) & 896) | ((i3 >> 27) & 14) | ((i6 << 21) & 29360128), 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mz5(sdrVar, xitVar, z2hVar, x3hVar, b2hVar, function1, function12, function0, function02, yciVar, z, i);
        }
    }

    public static final void p(po6 po6Var, boolean z, boolean z2, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2018822071);
        int i2 = i | (oq5Var.f(po6Var) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.g(z2) ? 256 : 128) | 3072;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String str = po6Var.b;
            String str2 = po6Var.c;
            Boolean valueOf = Boolean.valueOf(po6Var.f);
            if (!z2) {
                valueOf = null;
            }
            qgg.r(str, valueOf != null ? valueOf.booleanValue() : false, po6Var.e, null, z, 0, oq5Var, (i2 << 9) & 57344, 40);
            if (str2 != null) {
                oq5Var.Z(-162989964);
                u1g.l(oq5Var, d.e(vciVar, mu0.a));
                t7g.i(str2, z, null, oq5Var, i2 & 112, 4);
            } else {
                oq5Var.Z(-174271019);
            }
            oq5Var.p(false);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hdj(po6Var, z, z2, yciVar2, i, 2);
        }
    }

    public static final void q(String str, Function0 function0, Function0 function02, q84 q84Var, yci yciVar, hq5 hq5Var, int i) {
        boolean z;
        long j;
        str.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-418377291);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | (oq5Var.f(q84Var) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
            float f = 4;
            yci q = androidx.compose.foundation.layout.a.q(d.d(yciVar, 1.0f), f, f, f, 0.0f, 8);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            vci vciVar = vci.a;
            yci a2 = a.a(vciVar, "go_back");
            b bVar = b.a;
            float f2 = 48;
            aae.a(function0, d.m(bVar.a(a2, iz2Var), f2), false, tt0.l, oq5Var, ((i2 >> 3) & 14) | 24576, 12);
            ges c = nu0.c();
            agr agrVar = eq0.a;
            xcs.b(str, a.a(bVar.a(vciVar, b2c.f), "title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, c, oq5Var, i2 & 14, 0, 65528);
            oq5Var = oq5Var;
            yci a3 = bVar.a(vciVar, b2c.d);
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (q84Var != null) {
                boolean z2 = q84Var.m;
                oq5Var.Z(680156211);
                yci c2 = com.yandex.music.core.ui.compose.b.c(a.a(d.m(vciVar, f2), "cast_picker_button"), "is_casting", Boolean.valueOf(z2));
                int i5 = q84Var.n.a;
                if (z2) {
                    oq5Var.Z(160500265);
                    j = ((dq0) oq5Var.j(agrVar)).a.h;
                    z = false;
                } else {
                    z = false;
                    oq5Var.Z(160501352);
                    j = ((dq0) oq5Var.j(agrVar)).a.a;
                }
                oq5Var.p(z);
                hld.h(i5, i2 & 896, j, oq5Var, c2, function02);
            } else {
                z = false;
                oq5Var.Z(677935681);
            }
            oq5Var.p(z);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(str, function0, function02, q84Var, yciVar, i);
        }
    }

    public static final void r(final oxn oxnVar, final po6 po6Var, final bg5 bg5Var, final int i, final boolean z, final bzj bzjVar, final List list, final wn5 wn5Var, final yci yciVar, hq5 hq5Var, final int i2) {
        oq5 oq5Var;
        zyj zyjVar;
        aqi aqiVar;
        boolean z2;
        kjn kjnVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1717698256);
        int i3 = i2 | (oq5Var2.f(po6Var) ? 32 : 16) | (oq5Var2.h(bg5Var) ? 256 : 128) | (oq5Var2.d(i) ? 2048 : 1024) | (oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.d(bzjVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(list) ? 1048576 : 524288) | (oq5Var2.f(yciVar) ? 67108864 : 33554432);
        if (oq5Var2.P(i3 & 1, (38347921 & i3) != 38347920)) {
            aqi M = gld.M(bg5Var.h(), oq5Var2);
            aqi M2 = gld.M(bg5Var.l(), oq5Var2);
            aqi M3 = gld.M(bg5Var.c(), oq5Var2);
            boolean a2 = ((frs) M.getValue()).a();
            yci b2 = com.yandex.music.core.ui.compose.b.b(a.a(yciVar, "queue_item"), i);
            boolean z3 = (3670016 & i3) == 1048576;
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z3 || K == kjnVar2) {
                K = new h50(list, 7);
                oq5Var2.k0(K);
            }
            yci b3 = nfp.b(b2, false, (Function1) K);
            int ordinal = bzjVar.ordinal();
            if (ordinal == 0) {
                zyjVar = zyj.d;
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
                zyjVar = zyj.c;
            }
            zyj zyjVar2 = zyjVar;
            rba rbaVar = (rba) M2.getValue();
            lzs lzsVar = (lzs) M3.getValue();
            nxq nxqVar = nxq.b;
            boolean h = oq5Var2.h(bg5Var);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar2) {
                aqiVar = M3;
                z2 = a2;
                kjnVar = kjnVar2;
                r9n r9nVar = new r9n(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 2);
                oq5Var2.k0(r9nVar);
                K2 = r9nVar;
            } else {
                aqiVar = M3;
                kjnVar = kjnVar2;
                z2 = a2;
            }
            h9f h9fVar = (h9f) K2;
            boolean h2 = oq5Var2.h(bg5Var);
            Object K3 = oq5Var2.K();
            if (h2 || K3 == kjnVar) {
                r9n r9nVar2 = new r9n(0, bg5Var, bg5.class, "onLongClick", "onLongClick()V", 0, 3);
                oq5Var2.k0(r9nVar2);
                K3 = r9nVar2;
            }
            h9f h9fVar2 = (h9f) K3;
            boolean h3 = oq5Var2.h(bg5Var);
            Object K4 = oq5Var2.K();
            if (h3 || K4 == kjnVar) {
                r9n r9nVar3 = new r9n(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 4);
                oq5Var2.k0(r9nVar3);
                K4 = r9nVar3;
            }
            oq5Var = oq5Var2;
            qgg.l(zyjVar2, rbaVar, lzsVar, z, z2, (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K4), ild.C(-1127436278, new t2n(3, po6Var, aqiVar, M), oq5Var2), ild.C(-226368343, new rul(po6Var, z2, bg5Var, 2), oq5Var2), b3, nxqVar, null, null, null, null, 0L, 0L, null, wn5Var, false, oq5Var, ((i3 >> 3) & 7168) | 905969664, 805306416, 0, 1568768);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(po6Var, bg5Var, i, z, bzjVar, list, wn5Var, yciVar, i2) { // from class: n9n
                public final /* synthetic */ po6 b;
                public final /* synthetic */ bg5 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ bzj f;
                public final /* synthetic */ List g;
                public final /* synthetic */ wn5 h;
                public final /* synthetic */ yci i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(12582913);
                    u7g.r(oxn.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void s(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-841165053);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(1985278687);
            } else {
                oq5Var.Z(1986157506);
                View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
                boolean h = oq5Var.h(view);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new ykl(view, 1);
                    oq5Var.k0(K);
                }
                gld.D((Function0) K, oq5Var);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jiv(i, 1);
        }
    }

    public static final void t(sdr sdrVar, long j, z2h z2hVar, ges gesVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1990787537);
        int i2 = i | (oq5Var.f(sdrVar) ? 4 : 2) | (oq5Var.e(j) ? 32 : 16) | (oq5Var.d(z2hVar.ordinal()) ? 256 : 128) | (oq5Var.f(gesVar) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            long longValue = ((Number) sdrVar.getValue()).longValue();
            z2hVar.getClass();
            int ordinal = z2hVar.ordinal();
            Object obj = rmt.a;
            if (ordinal == 0) {
                long j2 = j - longValue;
                if (j2 > 0) {
                    long j3 = 1000;
                    long j4 = (j2 / j3) + 1;
                    obj = (j / j3 <= 3 || j4 > 3) ? smt.a : new qmt(String.valueOf(j4));
                }
            } else if (ordinal != 1) {
                b6e.s();
                return;
            }
            Long valueOf = Long.valueOf(j);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                n5 n5Var = new n5(sdrVar, j, z2hVar, (Continuation) null, 8);
                oq5Var.k0(n5Var);
                K = n5Var;
            }
            aqi j0 = szf.j0(obj, sdrVar, valueOf, z2hVar, (Function2) K, oq5Var, (i2 << 3) & 8176);
            float p = (y2h.a * 2) + ((jx7) oq5Var.j(es5.h)).p(v7g.z(48));
            tmt tmtVar = (tmt) j0.getValue();
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new csr(9);
                oq5Var.k0(K2);
            }
            Function1 function1 = (Function1) K2;
            vci vciVar = vci.a;
            ot0.l(tmtVar, function1, d.d(d.e(vciVar, p), 1.0f), null, null, false, ild.C(-1955559546, new tik(24, gesVar), oq5Var), oq5Var, 1572912, 56);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i0h(sdrVar, j, z2hVar, gesVar, yciVar2, i);
        }
    }

    public static final void u(mpu mpuVar, t tVar, kpu kpuVar, sai saiVar, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        rpu rpuVar;
        yci yciVar2;
        zru zruVar;
        mpuVar.getClass();
        apo apoVar = mpuVar.a;
        tVar.getClass();
        kpuVar.getClass();
        saiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2067091206);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(mpuVar) : oq5Var.h(mpuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(tVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(kpuVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(saiVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i3 = i2 | 196608;
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            ozm ozmVar = iai.a;
            hai haiVar = (hai) oq5Var.j(ozmVar);
            jab jabVar = new jab(qkb.InformationBlock, 1, 1, 0);
            haiVar.getClass();
            rmb a2 = haiVar.b.a(jabVar, null);
            boolean z = kpuVar instanceof jpu;
            Object obj3 = gq5.a;
            if (z) {
                oq5Var.Z(-526366422);
                oq5Var.Z(-2068116066);
                if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    zruVar = new yru();
                    oq5Var.p(false);
                } else {
                    boolean h = oq5Var.h(mpuVar);
                    Object K = oq5Var.K();
                    if (h || K == obj3) {
                        K = new r3s(23, mpuVar);
                        oq5Var.k0(K);
                    }
                    oq5Var.a0(419377738);
                    bfu R = ngg.R(ern.a(csu.class), tVar, null, k5r.g(csu.class, new p97(1), (Function1) K), tVar.getDefaultViewModelCreationExtras(), oq5Var);
                    oq5Var.p(false);
                    csu csuVar = (csu) R;
                    boolean f = oq5Var.f(tVar);
                    Object K2 = oq5Var.K();
                    if (f || K2 == obj3) {
                        apoVar.getClass();
                        K2 = new lpu(tVar);
                        oq5Var.k0(K2);
                    }
                    lpu lpuVar = (lpu) K2;
                    boolean f2 = oq5Var.f(csuVar) | oq5Var.f(lpuVar) | oq5Var.f(a2);
                    Object K3 = oq5Var.K();
                    if (f2 || K3 == obj3) {
                        apoVar.getClass();
                        lpuVar.getClass();
                        K3 = new asu(csuVar, lpuVar, a2);
                        oq5Var.k0(K3);
                    }
                    zruVar = (zru) K3;
                    oq5Var.p(false);
                }
                int i4 = i3 >> 9;
                wn5Var.invoke(zruVar.b(), oq5Var, Integer.valueOf(i4 & 112));
                hdg.x(zruVar, saiVar, oq5Var, ((i3 >> 6) & 112) | (i4 & 896));
                oq5Var.p(false);
            } else if (kpuVar instanceof gpu) {
                oq5Var.Z(-525880125);
                String str = ((gpu) kpuVar).a;
                Object obj4 = ((hai) oq5Var.j(ozmVar)).a;
                str.getClass();
                oq5Var.Z(-1206141753);
                if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    rpuVar = new qpu();
                    oq5Var.p(false);
                } else {
                    boolean h2 = oq5Var.h(mpuVar) | oq5Var.f(str) | oq5Var.h(obj4);
                    Object K4 = oq5Var.K();
                    if (h2 || K4 == obj3) {
                        K4 = new zzq(18, mpuVar, str, obj4);
                        oq5Var.k0(K4);
                    }
                    oq5Var.a0(419377738);
                    bfu R2 = ngg.R(ern.a(fqu.class), tVar, str, k5r.g(fqu.class, new p97(1), (Function1) K4), tVar.getDefaultViewModelCreationExtras(), oq5Var);
                    oq5Var.p(false);
                    fqu fquVar = (fqu) R2;
                    boolean f3 = oq5Var.f(tVar);
                    Object K5 = oq5Var.K();
                    if (f3 || K5 == obj3) {
                        apoVar.getClass();
                        K5 = new lpu(tVar);
                        oq5Var.k0(K5);
                    }
                    lpu lpuVar2 = (lpu) K5;
                    boolean f4 = oq5Var.f(fquVar) | oq5Var.f(lpuVar2);
                    Object K6 = oq5Var.K();
                    if (f4 || K6 == obj3) {
                        apoVar.getClass();
                        lpuVar2.getClass();
                        K6 = new spu(fquVar, lpuVar2);
                        oq5Var.k0(K6);
                    }
                    rpuVar = (rpu) K6;
                    oq5Var.p(false);
                }
                boolean h3 = oq5Var.h(rpuVar) | ((i3 & 7168) == 2048);
                Object K7 = oq5Var.K();
                if (h3 || K7 == obj3) {
                    K7 = new xes(14, rpuVar, saiVar);
                    oq5Var.k0(K7);
                }
                y7g.g(rpuVar, (Function0) K7, oq5Var, (i3 >> 9) & 896);
                oq5Var.p(false);
            } else if (kpuVar instanceof hpu) {
                oq5Var.Z(-525279872);
                oq5Var.Z(-945685698);
                if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    obj2 = new jqu();
                    oq5Var.p(false);
                } else {
                    Object K8 = oq5Var.K();
                    if (K8 == obj3) {
                        K8 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                    }
                    Object obj5 = ((fs5) K8).a;
                    boolean f5 = oq5Var.f(tVar);
                    Object K9 = oq5Var.K();
                    if (f5 || K9 == obj3) {
                        apoVar.getClass();
                        K9 = new lpu(tVar);
                        oq5Var.k0(K9);
                    }
                    lpu lpuVar3 = (lpu) K9;
                    boolean f6 = oq5Var.f(obj5);
                    Object K10 = oq5Var.K();
                    if (f6 || K10 == obj3) {
                        apoVar.getClass();
                        lpuVar3.getClass();
                        K10 = new lqu(lpuVar3, a2);
                        oq5Var.k0(K10);
                    }
                    obj2 = (kqu) K10;
                    oq5Var.p(false);
                }
                boolean h4 = oq5Var.h(obj2) | ((i3 & 7168) == 2048);
                Object K11 = oq5Var.K();
                if (h4 || K11 == obj3) {
                    K11 = new xes(15, saiVar, obj2);
                    oq5Var.k0(K11);
                }
                c9g.m((Function0) K11, oq5Var, (i3 >> 12) & 112);
                oq5Var.p(false);
            } else if (kpuVar instanceof ipu) {
                oq5Var.Z(-524782384);
                String str2 = ((ipu) kpuVar).a;
                oq5Var.Z(-1774135909);
                if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    obj = new aru();
                    oq5Var.p(false);
                } else {
                    boolean f7 = oq5Var.f(tVar);
                    Object K12 = oq5Var.K();
                    if (f7 || K12 == obj3) {
                        apoVar.getClass();
                        K12 = new lpu(tVar);
                        oq5Var.k0(K12);
                    }
                    lpu lpuVar4 = (lpu) K12;
                    boolean f8 = oq5Var.f(lpuVar4);
                    Object K13 = oq5Var.K();
                    if (f8 || K13 == obj3) {
                        apoVar.getClass();
                        lpuVar4.getClass();
                        K13 = new cru(lpuVar4, str2, a2);
                        oq5Var.k0(K13);
                    }
                    obj = (bru) K13;
                    oq5Var.p(false);
                }
                boolean h5 = oq5Var.h(obj) | ((i3 & 7168) == 2048);
                Object K14 = oq5Var.K();
                if (h5 || K14 == obj3) {
                    K14 = new xes(16, obj, saiVar);
                    oq5Var.k0(K14);
                }
                dag.n((Function0) K14, oq5Var, (i3 >> 12) & 112);
                oq5Var.p(false);
            } else {
                if (!(kpuVar instanceof fpu)) {
                    throw vz1.i(oq5Var, -2095190007, false);
                }
                oq5Var.Z(-2095121534);
                boolean h6 = oq5Var.h(kpuVar) | ((i3 & 7168) == 2048);
                Object K15 = oq5Var.K();
                if (h6 || K15 == obj3) {
                    K15 = new xes(17, kpuVar, saiVar);
                    oq5Var.k0(K15);
                }
                t7g.k((Function0) K15, null, oq5Var, 0, 2);
                oq5Var.p(false);
            }
            yciVar2 = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(mpuVar, tVar, kpuVar, saiVar, wn5Var, yciVar2, i, 18);
        }
    }

    public static final void v(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1869686864);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            String M = rvf.M(R.string.menu_element_dislike, oq5Var);
            String M2 = rvf.M(R.string.accessibility_check_action, oq5Var);
            vci vciVar = vci.a;
            function02 = function0;
            f8g.f(R.drawable.ic_dislike_shot_24, false, function02, ksw.D(vciVar, M, M2), oq5Var, ((i2 << 6) & 896) | 48);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function02, yciVar, i, 14);
        }
    }

    public static final void w(int i, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-476535316);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | 384;
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            String M = rvf.M(R.string.menu_element_like, oq5Var);
            String M2 = rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var);
            vci vciVar = vci.a;
            f8g.f(R.drawable.ic_like_shot_24, z, function0, ksw.D(vciVar, M, M2), oq5Var, (i2 << 3) & 1008);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tm(z, function0, yciVar2, i, 6);
        }
    }

    public static final Object[] x(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        uz0.i(objArr, objArr2, 0, 0, i, 6);
        uz0.f(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] y(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        uz0.i(objArr, objArr2, 0, 0, i, 6);
        uz0.f(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] z(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        uz0.i(objArr, objArr2, 0, 0, i, 6);
        uz0.f(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public boolean F(ylo yloVar) {
        return true;
    }

    public abstract void S(String str);
}
