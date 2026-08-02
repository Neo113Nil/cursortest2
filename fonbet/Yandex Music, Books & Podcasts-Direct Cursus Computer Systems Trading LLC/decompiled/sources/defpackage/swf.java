package defpackage;

import android.content.res.Configuration;
import android.graphics.BlurMaskFilter;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.s0;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Call;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class swf {
    public static final boolean A(lfm lfmVar) {
        return (lfmVar.b() || !lfmVar.h || lfmVar.d) ? false : true;
    }

    public static final boolean B(lfm lfmVar) {
        return lfmVar.h && !lfmVar.d;
    }

    public static final boolean C(ynn ynnVar, float f, float f2) {
        float f3 = ynnVar.a;
        if (f > ynnVar.c || f3 > f) {
            return false;
        }
        return f2 <= ynnVar.d && ynnVar.b <= f2;
    }

    public static final String D(long j) {
        String m;
        if (j <= -999500000) {
            m = hrg.m((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            m = hrg.m((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            m = hrg.m((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            m = hrg.m((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            m = hrg.m((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            m = hrg.m((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{m}, 1));
    }

    public static final dzf E(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            dzf dzfVar = tag instanceof dzf ? (dzf) tag : null;
            if (dzfVar != null) {
                return dzfVar;
            }
            Object B = rvf.B(view);
            view = B instanceof View ? (View) B : null;
        }
        return null;
    }

    public static final nfh F(utf utfVar, int i, long j, v2k v2kVar, long j2, bxj bxjVar, gz2 gz2Var, hz2 hz2Var, xof xofVar, boolean z, int i2) {
        return new nfh(i, i2, utfVar.a(i, j), j2, v2kVar.e(i), bxjVar, gz2Var, hz2Var, xofVar, z);
    }

    public static htr G() {
        htr H = H();
        htr htrVar = H.b;
        return htrVar == null ? H : htrVar;
    }

    public static htr H() {
        quk qukVar = htr.f;
        String language = I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode != 3424) {
            if (hashCode != 3651) {
                if (hashCode == 3749 && language.equals("uz")) {
                    return htr.i;
                }
            } else if (language.equals("ru")) {
                return htr.h;
            }
        } else if (language.equals("kk")) {
            return htr.j;
        }
        return htr.g;
    }

    public static final Locale I() {
        dqg dqgVar = dqg.b;
        Locale b = dqg.d(LocaleList.getAdjustedDefault()).b(0);
        if (b != null) {
            return b;
        }
        Locale locale = Locale.getDefault();
        locale.getClass();
        return locale;
    }

    public static final u3q J(izs izsVar) {
        izsVar.getClass();
        if (izsVar instanceof e6v) {
            return ((e6v) izsVar).getEntity();
        }
        if (izsVar.equals(hzs.a)) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static final String K(izs izsVar) {
        izsVar.getClass();
        if (!(izsVar instanceof e6v)) {
            if (izsVar.equals(hzs.a)) {
                su4.s(2, null, "This should not happen. Track source should be always filled in wave queue", null);
                return null;
            }
            b6e.s();
            return null;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof b6v) {
            return pcg.E(((b6v) e6vVar).a.getId());
        }
        if (e6vVar instanceof d6v) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static final String L(Call call) {
        return call.a().a.i;
    }

    public static final int M(qo6 qo6Var) {
        switch (qo6Var.ordinal()) {
            case 0:
                return R.drawable.ic_android_my_wibe;
            case 1:
                return R.drawable.ic_album_24;
            case 2:
                return 0;
            case 3:
                return R.drawable.ic_artist_24;
            case 4:
                return R.drawable.ic_playlist_24;
            case 5:
                return 0;
            case 6:
                return R.drawable.ic_ticket_24;
            case 7:
                return R.drawable.ic_podcast_and_book_24;
            case 8:
                return R.drawable.ic_radio_24;
            case 9:
                return R.drawable.ic_track_24;
            case 10:
                return 0;
            case 11:
                return R.drawable.ic_clip_24;
            case 12:
                return 0;
            case 13:
                return R.drawable.ic_radio_24;
            default:
                b6e.s();
            case 14:
                return 0;
        }
    }

    public static final Object N(Call call, Continuation continuation) {
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        zt3Var.u(new yao(call, 0));
        call.D(new pec(zt3Var));
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    public static final Object O(Call call, Class cls, cg6 cg6Var) {
        zt3 zt3Var = new zt3(1, qxe.b(cg6Var));
        zt3Var.s();
        zt3Var.u(new yao(call, 1));
        call.D(new nnd(26, zt3Var, cls));
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    public static final boolean P(long j) {
        return ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0;
    }

    public static final boolean Q(izs izsVar) {
        izsVar.getClass();
        if (Intrinsics.d(izsVar, hzs.a)) {
            return false;
        }
        if (!(izsVar instanceof e6v)) {
            b6e.s();
            return false;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof b6v) {
            return false;
        }
        if (e6vVar instanceof d6v) {
            return true;
        }
        b6e.s();
        return false;
    }

    public static final boolean R(izs izsVar) {
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a) || izsVar == null) {
                return false;
            }
            b6e.s();
            return false;
        }
        e6v e6vVar = (e6v) izsVar;
        if (!(e6vVar instanceof d6v)) {
            if (e6vVar instanceof b6v) {
                return false;
            }
            b6e.s();
            return false;
        }
        int ordinal = ((d6v) e6vVar).b.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        b6e.s();
        return false;
    }

    public static final boolean S(lfm lfmVar, long j, long j2) {
        int i = lfmVar.i == 1 ? 1 : 0;
        long j3 = lfmVar.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    public static boolean T(b6d b6dVar) {
        htr H = H();
        String str = b6dVar.a;
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (lowerCase.equals("kz")) {
            H.getClass();
            if (H == htr.h || H == htr.j) {
                return true;
            }
        } else if (!lowerCase.equals("uz")) {
            H.getClass();
            return H == htr.h;
        }
        return false;
    }

    public static final boolean U(long j) {
        return (j & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean V(izs izsVar) {
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a) || izsVar == null) {
                return false;
            }
            b6e.s();
            return false;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof d6v) {
            return true;
        }
        if (e6vVar instanceof b6v) {
            return false;
        }
        b6e.s();
        return false;
    }

    public static final long W(long j, long j2, float f) {
        float I = fxf.I(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float I2 = fxf.I(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (Float.floatToRawIntBits(I) << 32) | (Float.floatToRawIntBits(I2) & 4294967295L);
    }

    public static final t9f X(uhp uhpVar, lm4 lm4Var) {
        uhpVar.getClass();
        t9f b = uhpVar.b(lm4Var, c5b.a);
        if (b != null) {
            return b;
        }
        throw new zhp(gld.V(lm4Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r1 == defpackage.gq5.a) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(List list, hq5 hq5Var, int i) {
        on6 on6Var;
        Object obj;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2073945830);
        int i2 = (oq5Var.f(list) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (!z) {
                obj = K;
            }
            ArrayList arrayList = new ArrayList(3);
            int i3 = 0;
            while (i3 < 3) {
                String str = (String) ((i3 < 0 || i3 >= list.size()) ? "" : list.get(i3));
                if (i3 == 0) {
                    on6Var = new on6(str, 21, 5, 8.0f);
                } else if (i3 != 1) {
                    on6Var = new on6(str, -21, 5, -8.0f);
                } else {
                    float f = 0;
                    on6Var = new on6(str, f, f, 0.0f);
                }
                arrayList.add(on6Var);
                i3++;
            }
            oq5Var.k0(arrayList);
            obj = arrayList;
            c(6, oq5Var, a.a(vci.a, "mixes_screen_item_radial_covers"), (List) obj);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t44(i, 3, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r1 == defpackage.gq5.a) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(List list, hq5 hq5Var, int i) {
        Object obj;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-129203133);
        int i2 = (oq5Var.f(list) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (!z) {
                obj = K;
            }
            ArrayList arrayList = new ArrayList(3);
            int i3 = 0;
            while (i3 < 3) {
                String str = (String) ((i3 < 0 || i3 >= list.size()) ? "" : list.get(i3));
                arrayList.add(i3 != 0 ? i3 != 1 ? new on6(str, -24, 12, 0.0f) : new on6(str, 0, 6, 0.0f) : new on6(str, 24, 0, 0.0f));
                i3++;
            }
            oq5Var.k0(arrayList);
            obj = arrayList;
            c(6, oq5Var, a.a(vci.a, "mixes_screen_item_stack_covers"), (List) obj);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t44(i, 4, list);
        }
    }

    public static final void c(int i, hq5 hq5Var, yci yciVar, List list) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-923590607);
        int i2 = (oq5Var.f(list) ? 32 : 16) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            yci o = d.o(yciVar, 112, 76);
            kfh d = ug3.d(b2c.c, false);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(979565066);
            for (on6 on6Var : CollectionsKt.q0(list, 3)) {
                irf.y(on6Var.a, qo6.m, androidx.compose.foundation.layout.a.j(ezf.N(d.m(vci.a, 64), on6Var.d), on6Var.b, on6Var.c), false, true, null, null, null, oq5Var, 24624, 232);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o68(yciVar, list, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final qo6 qo6Var, final gce gceVar, yci yciVar, yci yciVar2, long j, long j2, boolean z, hq5 hq5Var, final int i, final int i2) {
        int i3;
        yci yciVar3;
        int i4;
        yci yciVar4;
        final long j3;
        int i5;
        boolean z2;
        int i6;
        long j4;
        int i7;
        boolean z3;
        final yci yciVar5;
        final long j5;
        final yci yciVar6;
        xmn r;
        int i8;
        qo6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1103105868);
        if ((i & 6) == 0) {
            i3 = (oq5Var.d(qo6Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(gceVar.ordinal()) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar3 = yciVar;
            i3 |= oq5Var.f(yciVar3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                yciVar4 = yciVar2;
                i3 |= oq5Var.f(yciVar4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= RemoteCameraConfig.Notification.ID;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j3 = j2;
                        if (oq5Var.e(j3)) {
                            i8 = SQLiteDatabase.OPEN_SHAREDCACHE;
                            i3 |= i8;
                        }
                    } else {
                        j3 = j2;
                    }
                    i8 = SQLiteDatabase.OPEN_FULLMUTEX;
                    i3 |= i8;
                } else {
                    j3 = j2;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                } else if ((1572864 & i) == 0) {
                    z2 = z;
                    i3 |= oq5Var.g(z2) ? 1048576 : 524288;
                    if ((i3 & 599187) == 599186 || !oq5Var.z()) {
                        oq5Var.U();
                        i6 = i & 1;
                        vci vciVar = vci.a;
                        if (i6 != 0 || oq5Var.y()) {
                            if (i9 != 0) {
                                yciVar3 = vciVar;
                            }
                            if (i4 != 0) {
                                yciVar4 = vciVar;
                            }
                            agr agrVar = eq0.a;
                            j4 = ((dq0) oq5Var.j(agrVar)).a.e;
                            if ((i2 & 32) != 0) {
                                j3 = ((dq0) oq5Var.j(agrVar)).c.c;
                            }
                            if (i5 != 0) {
                                z2 = false;
                            }
                        } else {
                            oq5Var.S();
                            j4 = j;
                        }
                        oq5Var.q();
                        yci d = androidx.compose.foundation.layout.a.d(d.d(androidx.compose.foundation.a.b(yciVar3, j3, vnj.i), 1.0f), 1.0f);
                        kfh d2 = ug3.d(b2c.b, false);
                        i7 = oq5Var.P;
                        androidx.compose.runtime.internal.a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, d);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        yci yciVar7 = yciVar3;
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, d2, wp5.f);
                        g0g.U(oq5Var, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var, i7, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        if (M(qo6Var) != 0 || z2) {
                            z3 = false;
                            oq5Var.Z(1031544340);
                        } else {
                            oq5Var.Z(1033631632);
                            gae.b(a0g.E(M(qo6Var), 0, oq5Var), null, b.a.a(vciVar, b2c.f).f(gceVar == gce.d ? yciVar4 : d.m(yciVar4, gceVar.a)), j4, oq5Var, 48, 0);
                            z3 = false;
                        }
                        oq5Var.p(z3);
                        oq5Var.p(true);
                        yciVar5 = yciVar4;
                        j5 = j4;
                        yciVar6 = yciVar7;
                    } else {
                        oq5Var.S();
                        yciVar6 = yciVar3;
                        yciVar5 = yciVar4;
                        j5 = j;
                    }
                    final boolean z4 = z2;
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new Function2() { // from class: vsk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                swf.d(qo6.this, gceVar, yciVar6, yciVar5, j5, j3, z4, (hq5) obj, rvf.R(i | 1), i2);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i3 & 599187) == 599186) {
                }
                oq5Var.U();
                i6 = i & 1;
                vci vciVar2 = vci.a;
                if (i6 != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                agr agrVar2 = eq0.a;
                j4 = ((dq0) oq5Var.j(agrVar2)).a.e;
                if ((i2 & 32) != 0) {
                }
                if (i5 != 0) {
                }
                oq5Var.q();
                yci d3 = androidx.compose.foundation.layout.a.d(d.d(androidx.compose.foundation.a.b(yciVar3, j3, vnj.i), 1.0f), 1.0f);
                kfh d22 = ug3.d(b2c.b, false);
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, d3);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                yci yciVar72 = yciVar3;
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, d22, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (!oq5Var.O) {
                }
                ouj.x(i7, oq5Var, i7, kb5Var2);
                g0g.U(oq5Var, H2, wp5.d);
                if (M(qo6Var) != 0) {
                }
                z3 = false;
                oq5Var.Z(1031544340);
                oq5Var.p(z3);
                oq5Var.p(true);
                yciVar5 = yciVar4;
                j5 = j4;
                yciVar6 = yciVar72;
                final boolean z42 = z2;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            yciVar4 = yciVar2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i3 & 599187) == 599186) {
            }
            oq5Var.U();
            i6 = i & 1;
            vci vciVar22 = vci.a;
            if (i6 != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            agr agrVar22 = eq0.a;
            j4 = ((dq0) oq5Var.j(agrVar22)).a.e;
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            oq5Var.q();
            yci d32 = androidx.compose.foundation.layout.a.d(d.d(androidx.compose.foundation.a.b(yciVar3, j3, vnj.i), 1.0f), 1.0f);
            kfh d222 = ug3.d(b2c.b, false);
            i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, d32);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var.d0();
            yci yciVar722 = yciVar3;
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d222, wp5.f);
            g0g.U(oq5Var, l22, wp5.e);
            kb5 kb5Var22 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i7, oq5Var, i7, kb5Var22);
            g0g.U(oq5Var, H22, wp5.d);
            if (M(qo6Var) != 0) {
            }
            z3 = false;
            oq5Var.Z(1031544340);
            oq5Var.p(z3);
            oq5Var.p(true);
            yciVar5 = yciVar4;
            j5 = j4;
            yciVar6 = yciVar722;
            final boolean z422 = z2;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar3 = yciVar;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        yciVar4 = yciVar2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i3 & 599187) == 599186) {
        }
        oq5Var.U();
        i6 = i & 1;
        vci vciVar222 = vci.a;
        if (i6 != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        agr agrVar222 = eq0.a;
        j4 = ((dq0) oq5Var.j(agrVar222)).a.e;
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        oq5Var.q();
        yci d322 = androidx.compose.foundation.layout.a.d(d.d(androidx.compose.foundation.a.b(yciVar3, j3, vnj.i), 1.0f), 1.0f);
        kfh d2222 = ug3.d(b2c.b, false);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, d322);
        xp5.T.getClass();
        grb grbVar222 = wp5.b;
        oq5Var.d0();
        yci yciVar7222 = yciVar3;
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d2222, wp5.f);
        g0g.U(oq5Var, l222, wp5.e);
        kb5 kb5Var222 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var222);
        g0g.U(oq5Var, H222, wp5.d);
        if (M(qo6Var) != 0) {
        }
        z3 = false;
        oq5Var.Z(1031544340);
        oq5Var.p(z3);
        oq5Var.p(true);
        yciVar5 = yciVar4;
        j5 = j4;
        yciVar6 = yciVar7222;
        final boolean z4222 = z2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void e(int i, int i2, hq5 hq5Var, yci yciVar) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-3748885);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            yci yciVar2 = yciVar;
            d(qo6.m, gce.d, yciVar2, null, 0L, 0L, false, oq5Var, ((i3 << 6) & 896) | 54, 120);
            yciVar = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rl4(yciVar, i, i2, 6);
        }
    }

    public static final t9f e0(f9f f9fVar, ArrayList arrayList, Function0 function0) {
        t9f qy0Var;
        t9f arnVar;
        f9fVar.getClass();
        if (f9fVar.equals(ern.a(Collection.class)) || f9fVar.equals(ern.a(List.class)) || f9fVar.equals(ern.a(List.class)) || f9fVar.equals(ern.a(ArrayList.class))) {
            qy0Var = new qy0((t9f) arrayList.get(0), 0);
        } else if (f9fVar.equals(ern.a(HashSet.class))) {
            qy0Var = new qy0((t9f) arrayList.get(0), 1);
        } else if (f9fVar.equals(ern.a(Set.class)) || f9fVar.equals(ern.a(Set.class)) || f9fVar.equals(ern.a(LinkedHashSet.class))) {
            qy0Var = new qy0((t9f) arrayList.get(0), 2);
        } else if (f9fVar.equals(ern.a(HashMap.class))) {
            qy0Var = new wsd((t9f) arrayList.get(0), (t9f) arrayList.get(1), 0);
        } else if (f9fVar.equals(ern.a(Map.class)) || f9fVar.equals(ern.a(Map.class)) || f9fVar.equals(ern.a(LinkedHashMap.class))) {
            qy0Var = new wsd((t9f) arrayList.get(0), (t9f) arrayList.get(1), 1);
        } else {
            if (f9fVar.equals(ern.a(Map.Entry.class))) {
                t9f t9fVar = (t9f) arrayList.get(0);
                t9f t9fVar2 = (t9f) arrayList.get(1);
                t9fVar.getClass();
                t9fVar2.getClass();
                arnVar = new n9h(t9fVar, t9fVar2, 0);
            } else if (f9fVar.equals(ern.a(Pair.class))) {
                t9f t9fVar3 = (t9f) arrayList.get(0);
                t9f t9fVar4 = (t9f) arrayList.get(1);
                t9fVar3.getClass();
                t9fVar4.getClass();
                arnVar = new n9h(t9fVar3, t9fVar4, 1);
            } else if (f9fVar.equals(ern.a(vat.class))) {
                t9f t9fVar5 = (t9f) arrayList.get(0);
                t9f t9fVar6 = (t9f) arrayList.get(1);
                t9f t9fVar7 = (t9f) arrayList.get(2);
                t9fVar5.getClass();
                t9fVar6.getClass();
                t9fVar7.getClass();
                qy0Var = new zf6(t9fVar5, t9fVar6, t9fVar7);
            } else if (leu.P(f9fVar).isArray()) {
                Object invoke = function0.invoke();
                invoke.getClass();
                t9f t9fVar8 = (t9f) arrayList.get(0);
                t9fVar8.getClass();
                arnVar = new arn((f9f) invoke, t9fVar8);
            } else {
                qy0Var = null;
            }
            qy0Var = arnVar;
        }
        if (qy0Var != null) {
            return qy0Var;
        }
        t9f[] t9fVarArr = (t9f[]) arrayList.toArray(new t9f[0]);
        t9f[] t9fVarArr2 = (t9f[]) Arrays.copyOf(t9fVarArr, t9fVarArr.length);
        return zwf.x(leu.P(f9fVar), (t9f[]) Arrays.copyOf(t9fVarArr2, t9fVarArr2.length));
    }

    public static final void f(c8i c8iVar, Function1 function1, hq5 hq5Var, int i) {
        c8iVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(91403472);
        int i2 = i | (oq5Var.f(c8iVar) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            tgo C = o5g.C(oq5Var);
            vci vciVar = vci.a;
            yci u = xp3.u(vciVar, C);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new y6g(7, function1, c8iVar);
                oq5Var.k0(K);
            }
            yci e = androidx.compose.foundation.a.e(u, false, null, null, (Function0) K, 7);
            agr agrVar = eq0.a;
            float f = 20;
            yci a = a.a(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.b(e, ((dq0) oq5Var.j(agrVar)).d.c, vnj.i), f, 16, f, f), "mixes_screen_item");
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
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
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci e2 = d.e(vciVar, 40);
            kfh d = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, e2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            xcs.b(c8iVar.b, a.a(vciVar, "mixes_screen_item_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 0, 0, null, nu0.j(), oq5Var, 48, 48, 62968);
            oq5Var = oq5Var;
            oq5Var.p(true);
            u1g.l(oq5Var, d.e(vciVar, 12));
            List j0 = CollectionsKt.j0(c8iVar.e);
            int ordinal = c8iVar.d.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    oq5Var.Z(-660173755);
                    a(j0, oq5Var, 0);
                    oq5Var.p(false);
                    oq5Var.p(true);
                } else if (ordinal != 2) {
                    throw vz1.i(oq5Var, -660178829, false);
                }
            }
            oq5Var.Z(-660175996);
            b(j0, oq5Var, 0);
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(c8iVar, function1, i, 10);
        }
    }

    public static final long f0(lfm lfmVar, boolean z) {
        long g = enj.g(lfmVar.c, lfmVar.g);
        if (z || !lfmVar.b()) {
            return g;
        }
        return 0L;
    }

    public static final void g(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1186623139);
        if (oq5Var.P(i & 1, i != 0)) {
            tgo C = o5g.C(oq5Var);
            vci vciVar = vci.a;
            float f = 20;
            yci p = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.b(xp3.u(vciVar, C), ((dq0) oq5Var.j(eq0.a)).d.c, vnj.i), f, 16, f, f);
            gz2 gz2Var = b2c.o;
            kx0 kx0Var = qx0.c;
            ta5 a = sa5.a(kx0Var, gz2Var, oq5Var, 48);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci e = d.e(vciVar, 40);
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            ges j = nu0.j();
            float f2 = 76;
            pm0.d(d.r(xp3.u(vciVar, o5g.C(oq5Var)), f2), j, oq5Var, 0);
            pm0.d(d.r(xp3.u(vciVar, o5g.C(oq5Var)), 52), j, oq5Var, 0);
            oq5Var.p(true);
            u1g.l(oq5Var, d.e(vciVar, 12));
            pm0.c(xp3.u(d.o(vciVar, f2, f2), o5g.E(oq5Var)), oq5Var, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d6h(i, 1);
        }
    }

    public static final t9f g0(uhp uhpVar, u9f u9fVar) {
        uhpVar.getClass();
        u9fVar.getClass();
        t9f D = ywf.D(uhpVar, u9fVar, true);
        if (D != null) {
            return D;
        }
        throw new zhp(gld.V(gld.U(u9fVar)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8.K(), java.lang.Integer.valueOf(r10)) == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(ko2 ko2Var, qn2 qn2Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        mn0 m;
        ko2Var.getClass();
        qn2Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(824694309);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(ko2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(qn2Var) : oq5Var.h(qn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            iz2 iz2Var = b2c.f;
            yci d = d.d(yciVar, 1.0f);
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                i3 = 16;
            } else {
                i3 = 16;
            }
            ouj.x(i4, oq5Var, i4, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            lx0 lx0Var = qx0.e;
            hz2 hz2Var = b2c.l;
            oq5Var.Z(-1191295816);
            boolean b = ko2Var.b();
            yci yciVar2 = vci.a;
            if (b) {
                boolean h = ((i2 & 112) == 32 || ((i2 & 64) != 0 && oq5Var.h(qn2Var))) | oq5Var.h(ko2Var);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new y6g(18, qn2Var, ko2Var);
                    oq5Var.k0(K);
                }
                yciVar2 = androidx.compose.foundation.a.e(yciVar2, false, null, null, (Function0) K, 7);
            }
            oq5Var.p(false);
            nho a = lho.a(lx0Var, hz2Var, oq5Var, 54);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, yciVar2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            yme ymeVar = new yme(new psk(4, v7g.z(i3), v7g.z(i3)), pd.d);
            yme ymeVar2 = new yme(new psk(4, v7g.z(8), v7g.z(i3)), pd.e);
            oq5Var.Z(-1438364205);
            kn0 kn0Var = new kn0();
            u2x.s(kn0Var, "prefixIcon");
            u2x.s(kn0Var, "spacer");
            if (ko2Var.equals(fo2.a)) {
                oq5Var.Z(-203500815);
                neg.l(oq5Var);
                neg.r(oq5Var);
                CharSequence Y = f8g.Y(R.string.informers_no_network_offline_mode_text, oq5Var);
                d85 d85Var = new d85(neg.m(oq5Var).b.b);
                oq5Var.Z(-492313982);
                m = o8g.m(Y, d85Var.a, oq5Var, 0 & 126, 0);
                oq5Var.p(false);
                oq5Var.p(false);
            } else if (ko2Var.equals(go2.b)) {
                oq5Var.Z(-203494726);
                neg.l(oq5Var);
                neg.r(oq5Var);
                String M = rvf.M(R.string.informers_no_network_with_offline_wave_playing_text, oq5Var);
                d85 d85Var2 = new d85(neg.m(oq5Var).b.b);
                M.getClass();
                oq5Var.Z(-492313982);
                m = o8g.m(M, d85Var2.a, oq5Var, 0 & 126, 0);
                oq5Var.p(false);
                oq5Var.p(false);
            } else if (ko2Var.equals(do2.b)) {
                oq5Var.Z(-203488426);
                neg.l(oq5Var);
                neg.r(oq5Var);
                CharSequence Y2 = f8g.Y(R.string.informers_no_network_with_wave_and_downloads_text, oq5Var);
                d85 d85Var3 = new d85(neg.m(oq5Var).b.b);
                oq5Var.Z(-492313982);
                m = o8g.m(Y2, d85Var3.a, oq5Var, 0 & 126, 0);
                oq5Var.p(false);
                oq5Var.p(false);
            } else if (ko2Var.equals(eo2.b)) {
                oq5Var.Z(-203482349);
                neg.l(oq5Var);
                neg.r(oq5Var);
                CharSequence Y3 = f8g.Y(R.string.informers_no_network_with_downloads_text, oq5Var);
                d85 d85Var4 = new d85(neg.m(oq5Var).b.b);
                oq5Var.Z(-492313982);
                m = o8g.m(Y3, d85Var4.a, oq5Var, 0 & 126, 0);
                oq5Var.p(false);
                oq5Var.p(false);
            } else if (ko2Var.equals(io2.b)) {
                oq5Var.Z(-203476002);
                neg.l(oq5Var);
                neg.r(oq5Var);
                CharSequence Y4 = f8g.Y(R.string.informers_no_network_without_downloads_and_auto_cache_text, oq5Var);
                d85 d85Var5 = new d85(neg.m(oq5Var).b.b);
                oq5Var.Z(-492313982);
                m = o8g.m(Y4, d85Var5.a, oq5Var, 0 & 126, 0);
                oq5Var.p(false);
                oq5Var.p(false);
            } else if (ko2Var.equals(jo2.b)) {
                oq5Var.Z(-203469180);
                neg.l(oq5Var);
                neg.r(oq5Var);
                String M2 = rvf.M(R.string.informers_no_network_without_downloads_and_with_auto_cache_text, oq5Var);
                d85 d85Var6 = new d85(neg.m(oq5Var).b.b);
                M2.getClass();
                oq5Var.Z(-492313982);
                m = o8g.m(M2, d85Var6.a, oq5Var, 0 & 126, 0);
                oq5Var.p(false);
                oq5Var.p(false);
            } else {
                if (!ko2Var.equals(bo2.a)) {
                    throw vz1.i(oq5Var, -203501621, false);
                }
                oq5Var.Z(-203463063);
                neg.l(oq5Var);
                neg.r(oq5Var);
                String M3 = rvf.M(R.string.informers_no_network_no_downloads_text, oq5Var);
                d85 d85Var7 = new d85(neg.m(oq5Var).b.b);
                M3.getClass();
                oq5Var.Z(-492313982);
                m = o8g.m(M3, d85Var7.a, oq5Var, 0 & 126, 0);
                oq5Var.p(false);
                oq5Var.p(false);
            }
            kn0Var.b(m);
            mn0 h2 = kn0Var.h();
            oq5Var.p(false);
            xv7.i(h2, null, neg.m(oq5Var).b.a, 0L, 0L, 3, 0L, 2, false, 2, 0, uah.e(new Pair("prefixIcon", ymeVar), new Pair("spacer", ymeVar2)), null, ges.b(((zn2) oq5Var.j(ao2.a)).d.a, 0L, 0L, null, null, 0L, 0, 0L, null, new h6g(17, e6g.b), 0, 0, 15728639), null, null, oq5Var, 0, 3120, 874234);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(ko2Var, qn2Var, yciVar, i, 24);
        }
    }

    public static final t9f h0(uhp uhpVar, Type type) {
        uhpVar.getClass();
        type.getClass();
        t9f A = uwf.A(uhpVar, type, true);
        if (A != null) {
            return A;
        }
        Class y = uwf.y(type);
        y.getClass();
        throw new zhp(gld.V(ern.a(y)));
    }

    public static final long i(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final t9f i0(f9f f9fVar) {
        f9fVar.getClass();
        t9f x = zwf.x(leu.P(f9fVar), (t9f[]) Arrays.copyOf(new t9f[0], 0));
        return x == null ? (t9f) ksm.a.get(f9fVar) : x;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(int i, int i2, hq5 hq5Var, rab rabVar, yci yciVar, Function0 function0, Function0 function02, boolean z) {
        int i3;
        boolean z2;
        int i4;
        Function0 function03;
        Function0 function04;
        xmn r;
        rabVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-235618125);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(rabVar) : oq5Var.h(rabVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function03 = function02;
                i3 |= oq5Var.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
                if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i5 != 0) {
                        z2 = false;
                    }
                    Function0 function05 = i4 != 0 ? null : function03;
                    j66.p(rabVar.d, o5g.F(oq5Var), a.a(yciVar, "playlist_grid_item"), function0, qo6.e, function05, null, ild.C(1376678593, new o91(z2, rabVar, 6), oq5Var), oq5Var, ((i3 << 6) & 7168) | 12607488 | ((i3 << 3) & 458752), 64);
                    function04 = function05;
                } else {
                    oq5Var.S();
                    function04 = function03;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new pt(rabVar, function0, yciVar, z2, function04, i, i2);
                    return;
                }
                return;
            }
            function03 = function02;
            if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function03 = function02;
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final ArrayList j0(uhp uhpVar, List list, boolean z) {
        uhpVar.getClass();
        list.getClass();
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g0(uhpVar, (u9f) it.next()));
            }
            return arrayList;
        }
        List<u9f> list3 = list;
        ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
        for (u9f u9fVar : list3) {
            u9fVar.getClass();
            t9f D = ywf.D(uhpVar, u9fVar, false);
            if (D == null) {
                return null;
            }
            arrayList2.add(D);
        }
        return arrayList2;
    }

    public static final void k(zy2 zy2Var, boolean z, Function0 function0, boolean z2, Function0 function02, yci yciVar, Function0 function03, hq5 hq5Var, int i) {
        ges j;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1180120890);
        int i2 = i | (oq5Var.f(zy2Var) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.g(z2) ? 2048 : 1024) | (oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function03) ? 1048576 : 524288);
        if (oq5Var.P(i2 & 1, (599187 & i2) != 599186)) {
            ru ruVar = zy2Var.a;
            if (z) {
                oq5Var.Z(224821642);
                j = nu0.g();
            } else {
                oq5Var.Z(224822950);
                j = nu0.j();
            }
            oq5Var.p(false);
            ghh.a(ruVar, function0, d.d(yciVar, 1.0f), j, ild.C(-559410135, new s43(zy2Var, function03, function02, z2, 17), oq5Var), e9g.a, null, oq5Var, 221184 | ((i2 >> 3) & 112), 64);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hr6(zy2Var, z, function0, z2, function02, yciVar, function03, i, 1);
        }
    }

    public static final void k0(View view, dzf dzfVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, dzfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(Function0 function0, yci yciVar, String str, o0k o0kVar, hq5 hq5Var, int i, int i2) {
        String str2;
        int i3;
        int i4;
        o0k o0kVar2;
        String str3;
        xmn r;
        int i5;
        o0k c;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-462693604);
        int i6 = i | (oq5Var.h(function0) ? 4 : 2);
        if ((i2 & 4) == 0) {
            str2 = str;
            if (oq5Var.f(str2)) {
                i3 = 256;
                i4 = i6 | i3 | 1024;
                if (oq5Var.P(i4 & 1, (i4 & 1171) == 1170)) {
                    oq5Var.S();
                    o0kVar2 = o0kVar;
                    str3 = str2;
                } else {
                    oq5Var.U();
                    if ((i & 1) == 0 || oq5Var.y()) {
                        if ((i2 & 4) != 0) {
                            str2 = rvf.M(R.string.landing_block_see_all, oq5Var);
                            i4 &= -897;
                        }
                        i5 = i4 & (-7169);
                        c = androidx.compose.foundation.layout.a.c(0.0f, aeq.a, 0.0f, 0.0f, 13);
                    } else {
                        oq5Var.S();
                        if ((i2 & 4) != 0) {
                            i4 &= -897;
                        }
                        i5 = i4 & (-7169);
                        c = o0kVar;
                    }
                    String str4 = str2;
                    oq5Var.q();
                    ltg.i(a.a(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.a.l(yciVar, c), false, null, new meo(0), function0, 3), "show_more"), false, 0L, function0, null, ild.C(-970612830, new da1(str4, 16), oq5Var), oq5Var, ((i5 << 9) & 7168) | 196608, 22);
                    o0kVar2 = c;
                    str3 = str4;
                }
                r = oq5Var.r();
                if (r == null) {
                    r.d = new zkl(function0, yciVar, str3, o0kVar2, i, i2);
                    return;
                }
                return;
            }
        } else {
            str2 = str;
        }
        i3 = 128;
        i4 = i6 | i3 | 1024;
        if (oq5Var.P(i4 & 1, (i4 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final Object l0(huo huoVar, boolean z, huo huoVar2, Function2 function2) {
        Object sm5Var;
        Object V;
        Continuation continuation = huoVar.d;
        try {
            if (function2 instanceof kq2) {
                wct.o(2, function2);
                sm5Var = function2.invoke(huoVar2, huoVar);
            } else {
                sm5Var = qxe.c(function2, huoVar2, huoVar);
            }
        } catch (t98 e) {
            Throwable th = e.a;
            huoVar.U(new sm5(th, false));
            if (ve7.b() && (continuation instanceof om6)) {
                throw dar.a(th, (om6) continuation);
            }
            throw th;
        } catch (Throwable th2) {
            sm5Var = new sm5(th2, false);
        }
        nm6 nm6Var = nm6.a;
        if (sm5Var == nm6Var || (V = huoVar.V(sm5Var)) == i3f.b) {
            return nm6Var;
        }
        huoVar.p0();
        if (!(V instanceof sm5)) {
            return i3f.a(V);
        }
        if (!z) {
            Throwable th3 = ((sm5) V).a;
            if ((th3 instanceof wis) && ((wis) th3).a == huoVar) {
                if (!(sm5Var instanceof sm5)) {
                    return sm5Var;
                }
                Throwable th4 = ((sm5) sm5Var).a;
                if (ve7.b() && (continuation instanceof om6)) {
                    throw dar.a(th4, (om6) continuation);
                }
                throw th4;
            }
        }
        Throwable th5 = ((sm5) V).a;
        if (ve7.b() && (continuation instanceof om6)) {
            throw dar.a(th5, (om6) continuation);
        }
        throw th5;
    }

    public static final void m(final String str, final elu eluVar, final qmu qmuVar, final float f, final yci yciVar, hq5 hq5Var, final int i) {
        qmu qmuVar2;
        boolean z;
        xmn r;
        Function2 function2;
        eluVar.getClass();
        qmuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-942303528);
        int w = oq5Var.w();
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.d(eluVar.ordinal()) ? 32 : 16) | (oq5Var.d(qmuVar.ordinal()) ? 256 : 128) | (oq5Var.c(f) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            qmuVar2 = qmuVar;
        } else {
            kfh d = ug3.d(b2c.b, false);
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-482234877);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(-482263057);
                BlurMaskFilter blurMaskFilter = new BlurMaskFilter(ff7.Q(10, oq5Var), BlurMaskFilter.Blur.NORMAL);
                qo6 Q = u1g.Q(eluVar);
                gce gceVar = gce.d;
                bs2 n0 = n0(eluVar, f, oq5Var);
                d(Q, gceVar, null, n0 == null ? yciVar : yciVar.f(kdi.b(kdi.a(vciVar, (dup) n0.b), blurMaskFilter, n0.a)), 0L, 0L, false, oq5Var, 48, BuildConfig.API_LEVEL);
                oq5Var.t(w);
                r = oq5Var.r();
                if (r != null) {
                    final int i4 = 0;
                    function2 = new Function2(str, eluVar, qmuVar, f, yciVar, i, i4) { // from class: yxq
                        public final /* synthetic */ int a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ elu c;
                        public final /* synthetic */ qmu d;
                        public final /* synthetic */ float e;
                        public final /* synthetic */ yci f;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int R = rvf.R(1);
                                    swf.m(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int R2 = rvf.R(1);
                                    swf.m(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            oq5Var.Z(-484233200);
            oq5Var.p(false);
            iz2 iz2Var = b2c.f;
            qmuVar2 = qmuVar;
            w1g.j(str, null, yciVar, null, null, iz2Var, hd6.a, 0.0f, null, 0, ild.C(248497138, new sg6(eluVar, f), oq5Var), oq5Var, 102432816 | (i2 & 14) | ((i2 >> 6) & 896), 664);
            if (qmuVar2 != qmu.a) {
                oq5Var.Z(-479916946);
                orl.a(0, 4, 0L, oq5Var, b.a.a(vciVar, iz2Var), qmuVar2 == qmu.c);
                z = false;
            } else {
                z = false;
                oq5Var.Z(-484233200);
            }
            oq5Var.p(z);
            oq5Var.p(z);
            oq5Var.p(true);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i5 = 1;
            final qmu qmuVar3 = qmuVar2;
            function2 = new Function2(str, eluVar, qmuVar3, f, yciVar, i, i5) { // from class: yxq
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ elu c;
                public final /* synthetic */ qmu d;
                public final /* synthetic */ float e;
                public final /* synthetic */ yci f;

                {
                    this.a = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int R = rvf.R(1);
                            swf.m(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int R2 = rvf.R(1);
                            swf.m(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R2);
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final uqw m0(s0 s0Var, String str) {
        s0Var.getClass();
        String j = s0Var.j();
        j.getClass();
        return new uqw(s0Var.k(), s0Var.l(), str, j);
    }

    public static final void n(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1380597624);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            tgo a = ugo.a(4);
            vci vciVar = vci.a;
            ivf.k(i3 & 14, 0, oq5Var, d.m(xp3.u(vciVar, a), 60), z);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar, i, 16);
        }
    }

    public static final bs2 n0(elu eluVar, float f, hq5 hq5Var) {
        int ordinal = eluVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-645368704);
            bs2 bs2Var = new bs2(o5g.E(oq5Var), u7g.E(R.dimen.corner_4, oq5Var));
            oq5Var.p(false);
            return bs2Var;
        }
        if (ordinal == 3) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-645364958);
            oq5Var2.p(false);
            return new bs2(ugo.a, f / 2);
        }
        if (ordinal != 4) {
            throw vz1.i((oq5) hq5Var, -645372411, false);
        }
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.Z(1468607723);
        oq5Var3.p(false);
        return null;
    }

    public static final void o(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1742613654);
        if (oq5Var.P(i & 1, (i & 3) != 2)) {
            pm0.c(d.m(xp3.u(yciVar, ugo.a(4)), 60), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 16);
        }
    }

    public static final s0 o0(uqw uqwVar) {
        String str = uqwVar.b;
        long j = uqwVar.c;
        long j2 = uqwVar.d;
        str.getClass();
        iot m = s0.m();
        m.d();
        s0.f((s0) m.b, str);
        m.d();
        s0.h((s0) m.b, j2);
        m.d();
        s0.g((s0) m.b, j);
        return (s0) m.b();
    }

    public static final void p(boolean z, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(540508188);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            z2 = z;
            ivf.l(z2, d.d(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 20, 0.0f, 11), 1.0f), nu0.h(), oq5Var, (i2 & 14) | 48, 0);
        } else {
            z2 = z;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf4(i, 6, z2, false);
        }
    }

    public static /* synthetic */ boolean p0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, j8x j8xVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(j8xVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(j8xVar) != obj && atomicReferenceFieldUpdater.get(j8xVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final void q(boolean z, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(193357396);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            z2 = z;
            ivf.l(z2, d.d(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 36, 0.0f, 11), 1.0f), nu0.i(), oq5Var, (i2 & 14) | 48, 0);
        } else {
            z2 = z;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf4(i, 7, z2, false);
        }
    }

    public static final void r(ltu ltuVar, boolean z, boolean z2, hq5 hq5Var, int i) {
        kjn kjnVar;
        ltuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1865694621);
        if ((((oq5Var.f(ltuVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.g(z2) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ylu yluVar = zlu.b;
            long j = yluVar.c;
            long j2 = yluVar.d;
            long j3 = yluVar.e;
            sdr V = zwf.V(weo.S(300, 0, null, 6), null, oq5Var, 2);
            boolean f = oq5Var.f((ai3) V.getValue()) | oq5Var.e(j) | oq5Var.e(j2) | oq5Var.e(j3);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (f || K == kjnVar2) {
                ai3 ai3Var = (ai3) V.getValue();
                ai3Var.getClass();
                kjnVar = kjnVar2;
                ylu yluVar2 = new ylu(zlu.a, ai3Var, j, j2, j3);
                oq5Var.k0(yluVar2);
                K = yluVar2;
            } else {
                kjnVar = kjnVar2;
            }
            ylu yluVar3 = (ylu) K;
            agr agrVar = zlu.d;
            boolean h = oq5Var.h(yluVar3);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new wfs(26, yluVar3);
                oq5Var.k0(K2);
            }
            etn.l(agrVar.a((Function0) K2), ild.C(-1958657827, new ptu(z2, ltuVar, z), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ptu(ltuVar, z, z2, i);
        }
    }

    public static final void s(ltu ltuVar, boolean z, hq5 hq5Var, int i) {
        boolean z2;
        ltuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(966406834);
        int i2 = (oq5Var.f(ltuVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
        } else {
            z2 = z;
            ivf.r(saf.g, saf.h, ild.C(357399016, new mtu(ltuVar, 0), oq5Var), z2, null, saf.i, null, oq5Var, ((i2 << 6) & 7168) | 197046, 80);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl3(ltuVar, z2, i, 10);
        }
    }

    public static final void t(final ltu ltuVar, final b4v b4vVar, final ab0 ab0Var, final boolean z, hq5 hq5Var, int i) {
        int i2;
        aqi aqiVar;
        oq5 oq5Var;
        ltuVar.getClass();
        b4vVar.getClass();
        ab0Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(346975938);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(ltuVar) : oq5Var2.h(ltuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(b4vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(ab0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.g(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && oq5Var2.f(ltuVar));
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (z2 || K == obj) {
                K = ltuVar.a();
                oq5Var2.k0(K);
            }
            final s2v s2vVar = (s2v) K;
            final aqi M = gld.M(s2vVar.h, oq5Var2);
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = szf.U(new f6u(M, 11));
                oq5Var2.k0(K2);
            }
            final sdr sdrVar = (sdr) K2;
            aqi O = gld.O(s2vVar.i, oq5Var2);
            Object K3 = oq5Var2.K();
            if (K3 == obj) {
                K3 = szf.U(new f6u(O, 12));
                oq5Var2.k0(K3);
            }
            final sdr sdrVar2 = (sdr) K3;
            l3v l3vVar = b4vVar.a;
            a6v C = aaw.C(l3vVar.b.a, ((Boolean) sdrVar.getValue()).booleanValue(), oq5Var2);
            act S = weo.S(300, 0, null, 6);
            sdr b = bmq.b(C.b(), S, "WavePrimaryColorAnim", oq5Var2, 432, 8);
            sdr b2 = bmq.b(C.a(), S, "WaveSecondaryColorAnim", oq5Var2, 432, 8);
            sdr b3 = bmq.b(C.d(), S, "WaveWordsButtonColorAnim", oq5Var2, 432, 8);
            sdr V = zwf.V(S, sk3.Y(C.c()), oq5Var2, 0);
            Object K4 = oq5Var2.K();
            if (K4 == obj) {
                K4 = szf.g0(zlu.b);
                oq5Var2.k0(K4);
            }
            aqi aqiVar2 = (aqi) K4;
            Object[] objArr = {b, b2, b3, V};
            boolean f = oq5Var2.f(b) | oq5Var2.f(b2) | oq5Var2.f(b3) | oq5Var2.f(V);
            Object K5 = oq5Var2.K();
            if (f || K5 == obj) {
                K5 = new lua(b, b2, b3, V, aqiVar2, null, 1);
                aqiVar = aqiVar2;
                oq5Var2.k0(K5);
            } else {
                aqiVar = aqiVar2;
            }
            gld.z(objArr, (Function2) K5, oq5Var2);
            Object K6 = oq5Var2.K();
            if (K6 == obj) {
                K6 = szf.g0(null);
                oq5Var2.k0(K6);
            }
            final aqi aqiVar3 = (aqi) K6;
            aqi K7 = ksw.K(oq5Var2);
            Object K8 = oq5Var2.K();
            if (K8 == obj) {
                K8 = szf.U(new stu(sdrVar, K7, 0));
                oq5Var2.k0(K8);
            }
            final sdr sdrVar3 = (sdr) K8;
            boolean z3 = !((Boolean) sdrVar.getValue()).booleanValue() && ((Boolean) sdrVar2.getValue()).booleanValue();
            String M2 = rvf.M(R.string.player_skip_description, oq5Var2);
            String M3 = rvf.M(R.string.player_previous_description, oq5Var2);
            boolean h = oq5Var2.h(s2vVar);
            Object K9 = oq5Var2.K();
            if (h || K9 == obj) {
                K9 = new ttu(s2vVar, 0);
                oq5Var2.k0(K9);
            }
            nw6 nw6Var = new nw6(M2, (Function0) K9);
            if (!(l3vVar.c != null)) {
                nw6Var = null;
            }
            boolean h2 = oq5Var2.h(s2vVar);
            Object K10 = oq5Var2.K();
            if (h2 || K10 == obj) {
                K10 = new ttu(s2vVar, 1);
                oq5Var2.k0(K10);
            }
            nw6 nw6Var2 = new nw6(M3, (Function0) K10);
            if (!(l3vVar.a != null)) {
                nw6Var2 = null;
            }
            final List w = xz0.w(new nw6[]{nw6Var, nw6Var2});
            agr agrVar = zlu.d;
            Object K11 = oq5Var2.K();
            if (K11 == obj) {
                K11 = new jc(aqiVar, 27);
                oq5Var2.k0(K11);
            }
            qzm a = agrVar.a((Function0) K11);
            final aqi aqiVar4 = aqiVar;
            final boolean z4 = z3;
            oq5Var = oq5Var2;
            etn.l(a, ild.C(1749496322, new Function2() { // from class: utu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    hq5 hq5Var2 = (hq5) obj2;
                    if ((((Integer) obj3).intValue() & 3) == 2) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    final aqi aqiVar5 = aqiVar3;
                    ya0 ya0Var = (ya0) aqiVar5.getValue();
                    final boolean z5 = z4;
                    final s2v s2vVar2 = s2vVar;
                    final List list = w;
                    final b4v b4vVar2 = b4vVar;
                    final sdr sdrVar4 = sdrVar3;
                    final ab0 ab0Var2 = ab0Var;
                    wn5 C2 = ild.C(-861811893, new ryc() { // from class: ntu
                        @Override // defpackage.ryc
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i3;
                            dh3 dh3Var = (dh3) obj4;
                            onu onuVar = (onu) obj5;
                            hq5 hq5Var3 = (hq5) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            dh3Var.getClass();
                            onuVar.getClass();
                            if ((intValue & 6) == 0) {
                                i3 = (((oq5) hq5Var3).f(dh3Var) ? 4 : 2) | intValue;
                            } else {
                                i3 = intValue;
                            }
                            if ((intValue & 48) == 0) {
                                i3 |= ((oq5) hq5Var3).d(onuVar.ordinal()) ? 32 : 16;
                            }
                            if ((i3 & 147) == 146) {
                                oq5 oq5Var4 = (oq5) hq5Var3;
                                if (oq5Var4.z()) {
                                    oq5Var4.S();
                                    return Unit.a;
                                }
                            }
                            tt0.g(Boolean.valueOf(z5), null, null, null, ild.C(803152970, new g0d(s2vVar2, list, onuVar, b4vVar2, dh3Var, sdrVar4, ab0Var2, aqiVar5), hq5Var3), hq5Var3, 24576, 14);
                            return Unit.a;
                        }
                    }, hq5Var2);
                    ltu ltuVar2 = ltuVar;
                    aqi aqiVar6 = aqiVar4;
                    sdr sdrVar5 = sdrVar;
                    ivf.r(C2, ild.C(-2144358524, new aqp(12, ltuVar2, aqiVar6, sdrVar5), hq5Var2), ild.C(-1714693320, new mtu(ltuVar2, 2), hq5Var2), z, null, ild.C(1847254528, new lc(b4vVar2, s2vVar2, M, sdrVar5, sdrVar2, 21), hq5Var2), ya0Var, hq5Var2, 197046, 16);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(ltuVar, b4vVar, ab0Var, z, i, 18);
        }
    }

    public static final void u(j1w j1wVar, hq5 hq5Var, int i) {
        boolean h;
        int i2;
        j1wVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1387780793);
        int i3 = 4;
        int i4 = (oq5Var.f(j1wVar) ? 4 : 2) | i;
        if ((i4 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            i2 = 0;
        } else {
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object K = oq5Var.K();
            int i6 = 3;
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new dxv(i6, j1wVar);
                oq5Var.k0(K);
            }
            pd.c(0, 1, oq5Var, (Function0) K, false);
            ksw.w(0, oq5Var);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = Boolean.valueOf(Intrinsics.d(j1wVar.b.getValue(), e1w.a));
                oq5Var.k0(K2);
            }
            boolean booleanValue = ((Boolean) K2).booleanValue();
            aqi O = gld.O(j1wVar.c, oq5Var);
            qs5 qs5Var = e3w.a;
            dyv dyvVar = ((d3w) oq5Var.j(qs5Var)).b;
            heh hehVar = heh.a;
            int i7 = ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            float f = ((euv) oq5Var.j(fuv.a)).a;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = tlm.h((i7 * 0.9f) / f, oq5Var);
            }
            poi poiVar = (poi) K3;
            if (booleanValue) {
                oq5Var.Z(2077512540);
                h = irv.h(oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-21638503);
                oq5Var.p(false);
                h = true;
            }
            float f2 = !h ? 0.65f : 1.0f;
            boolean z2 = !booleanValue;
            boolean z3 = !((Boolean) O.getValue()).booleanValue();
            float e = ((t6k) poiVar).e();
            dyv dyvVar2 = ((d3w) oq5Var.j(qs5Var)).b;
            final heh hehVar2 = heh.a;
            jeh jehVar = jeh.a;
            if ((95 & 32) != 0) {
                f2 = 1.0f;
            }
            if ((95 & 128) != 0) {
                z2 = false;
            }
            if ((95 & 256) != 0) {
                booleanValue = true;
            }
            if ((95 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                z3 = true;
            }
            if ((95 & 2048) != 0) {
                e = Float.MAX_VALUE;
            }
            float f3 = (95 & 4096) != 0 ? 1.0f : 2.2f;
            Object[] objArr = new Object[0];
            act actVar = rxv.K;
            apo B = dag.B(new t30(new jiv(6), 3), new mp3(6, new oo1(e, f3, i3)));
            boolean c = oq5Var.c(0.0f) | oq5Var.c(0.0f) | oq5Var.d(0) | oq5Var.d(0) | oq5Var.d(jehVar.ordinal()) | oq5Var.c(f2) | oq5Var.c(1.0f) | oq5Var.g(z2) | ((((234881024 & 100663296) ^ 100663296) > 67108864 && oq5Var.g(booleanValue)) || (100663296 & 100663296) == 67108864) | oq5Var.g(z3) | oq5Var.d(hehVar2.ordinal()) | oq5Var.c(e);
            Object K4 = oq5Var.K();
            if (c || K4 == kjnVar) {
                final boolean z4 = booleanValue;
                final boolean z5 = z3;
                final float f4 = f2;
                final float f5 = e;
                final boolean z6 = z2;
                K4 = new Function0() { // from class: sxv
                    {
                        jeh jehVar2 = jeh.a;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        jeh jehVar2 = jeh.a;
                        float f6 = f4;
                        boolean z7 = z6;
                        return new rxv(0.0f, 0.0f, 0, 0, jehVar2, f6, 1.0f, z7, z4, z7, z7, z7, z5, hehVar2, f5, 1.0f);
                    }
                };
                oq5Var.k0(K4);
            }
            rxv rxvVar = (rxv) o2g.g0(objArr, B, (Function0) K4, oq5Var, 0, 4);
            i2 = 0;
            rvf.t(rxvVar, oq5Var, 0);
            avf.q(j1wVar, rxvVar, null, oq5Var, i5);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new r0w(j1wVar, i, i2);
        }
    }

    public static final void v(f8s f8sVar, l8s l8sVar, String str) {
        m8s.i.fine(l8sVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + f8sVar.a);
    }

    public static final ExtractedText w(ybs ybsVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = ybsVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = ybsVar.b;
        extractedText.selectionStart = rds.e(j);
        extractedText.selectionEnd = rds.d(j);
        extractedText.flags = !StringsKt.N(ybsVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void x(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(StringUtils.COMMA);
            }
        }
    }

    public static final float y(long j, float f, long j2, long j3) {
        long D = c3x.D(d85.b(j, f, 0.0f, 0.0f, 0.0f, 14), j3);
        float N = c3x.N(c3x.D(j2, D)) + 0.05f;
        float N2 = c3x.N(D) + 0.05f;
        return Math.max(N, N2) / Math.min(N, N2);
    }

    public static final boolean z(lfm lfmVar) {
        return !lfmVar.h && lfmVar.d;
    }

    public abstract void Y(gln glnVar, int i, String str);

    public void Z(gln glnVar, int i, String str) {
        glnVar.getClass();
    }

    public abstract void a0(gln glnVar, Exception exc, l3o l3oVar);

    public void b0(gln glnVar, pn3 pn3Var) {
        glnVar.getClass();
    }

    public abstract void c0(gln glnVar, String str);

    public abstract void d0(gln glnVar, l3o l3oVar);
}
