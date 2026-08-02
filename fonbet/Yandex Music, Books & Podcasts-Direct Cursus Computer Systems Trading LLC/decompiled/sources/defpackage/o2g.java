package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.compose.animation.c;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.f;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.videoclip.VideoClipDto;
import com.yandex.music.shared.trailers.api.model.TrackWithSmartPreviewDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public abstract class o2g {
    public static final xvm A(b7q b7qVar, fts ftsVar, onh onhVar, g7q g7qVar) {
        gra K;
        gra graVar;
        maa maaVar = maa.a;
        b7qVar.getClass();
        bdt I = hag.I(vsb.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        wq3 a = vsb.a(kg5.s(b7qVar, ftsVar, maaVar, g7qVar), ((bts) ftsVar.d).d);
        oq4 oq4Var = oq4.g;
        bdt I2 = hag.I(tcl.class);
        qdc qdcVar2 = b7qVar.a;
        qdcVar2.getClass();
        jaw X = X(oq4Var);
        int i = 28;
        uvg uvgVar = new uvg(i, X);
        Object obj = new Object();
        l48 l48Var = new l48(i);
        onh t = rzf.t(onhVar, ftsVar.a.a);
        ets etsVar = ftsVar.f;
        oq4 oq4Var2 = etsVar.a;
        int i2 = etsVar.b;
        hoh hohVar = t.d;
        Bundle bundle = hohVar.I;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("codec", oq4Var2.a);
        bundle.putInt("bitrate", i2);
        eoh a2 = hohVar.a();
        a2.H = bundle;
        hoh hohVar2 = new hoh(a2);
        wmh a3 = t.a();
        a3.k = hohVar2;
        onh a4 = a3.a();
        a4.b.getClass();
        a4.b.getClass();
        cnh cnhVar = a4.b.c;
        if (cnhVar == null) {
            graVar = gra.a;
        } else {
            synchronized (obj) {
                try {
                    K = !cnhVar.equals(null) ? es6.K(cnhVar) : null;
                    K.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            graVar = K;
        }
        return new xvm(a4, a, uvgVar, graVar, l48Var, 1048576, null);
    }

    public static final xvm B(b7q b7qVar, fts ftsVar, onh onhVar, g7q g7qVar) {
        gra K;
        gra graVar;
        b7qVar.getClass();
        bdt I = hag.I(vsb.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        vsb vsbVar = (vsb) qdcVar.C(I);
        bdt I2 = hag.I(dl2.class);
        qdc qdcVar2 = b7qVar.a;
        qdcVar2.getClass();
        dl2 dl2Var = (dl2) qdcVar2.C(I2);
        bdt I3 = hag.I(nbo.class);
        qdc qdcVar3 = b7qVar.a;
        qdcVar3.getClass();
        bts btsVar = (bts) ftsVar.d;
        maa maaVar = maa.a;
        a76 a76Var = new a76(vsbVar.e(dl2Var.a), vsbVar.f);
        obo oboVar = (obo) nbo.b(maaVar).b;
        c5b c5bVar = c5b.a;
        ywd ywdVar = ywd.d;
        b7q b7qVar2 = vsbVar.a;
        bdt I4 = hag.I(oco.class);
        qdc qdcVar4 = b7qVar2.a;
        qdcVar4.getClass();
        oco ocoVar = (oco) qdcVar4.C(I4);
        bdt I5 = hag.I(dpt.class);
        qdc qdcVar5 = b7qVar2.a;
        qdcVar5.getClass();
        wq3 a = vsb.a(new zk7(new sco(ocoVar, g7qVar, a76Var, oboVar, c5bVar, (dpt) qdcVar5.C(I5), ywdVar)), btsVar.d);
        oq4 oq4Var = oq4.f;
        bdt I6 = hag.I(tcl.class);
        qdc qdcVar6 = b7qVar.a;
        qdcVar6.getClass();
        jaw X = X(oq4Var);
        int i = 28;
        uvg uvgVar = new uvg(i, X);
        Object obj = new Object();
        l48 l48Var = new l48(i);
        onh t = rzf.t(onhVar, ftsVar.a.a);
        ets etsVar = ftsVar.f;
        oq4 oq4Var2 = etsVar.a;
        int i2 = etsVar.b;
        hoh hohVar = t.d;
        Bundle bundle = hohVar.I;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("codec", oq4Var2.a);
        bundle.putInt("bitrate", i2);
        eoh a2 = hohVar.a();
        a2.H = bundle;
        hoh hohVar2 = new hoh(a2);
        wmh a3 = t.a();
        a3.k = hohVar2;
        onh a4 = a3.a();
        a4.b.getClass();
        a4.b.getClass();
        cnh cnhVar = a4.b.c;
        if (cnhVar == null) {
            graVar = gra.a;
        } else {
            synchronized (obj) {
                try {
                    K = !cnhVar.equals(null) ? es6.K(cnhVar) : null;
                    K.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            graVar = K;
        }
        return new xvm(a4, a, uvgVar, graVar, l48Var, 1048576, null);
    }

    public static final xvm C(b7q b7qVar, fts ftsVar, onh onhVar) {
        gra K;
        gra graVar;
        maa maaVar = maa.a;
        b7qVar.getClass();
        Pair G = kg5.G(b7qVar, ftsVar, maaVar);
        va7 va7Var = (ip3) G.b;
        if (va7Var == null) {
            va7Var = (va7) G.a;
        }
        va7 va7Var2 = va7Var;
        int i = 28;
        uvg uvgVar = new uvg(i, new hm7());
        Object obj = new Object();
        l48 l48Var = new l48(i);
        onhVar.b.getClass();
        onhVar.b.getClass();
        cnh cnhVar = onhVar.b.c;
        if (cnhVar == null) {
            graVar = gra.a;
        } else {
            synchronized (obj) {
                try {
                    K = !cnhVar.equals(null) ? es6.K(cnhVar) : null;
                    K.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            graVar = K;
        }
        return new xvm(onhVar, va7Var2, uvgVar, graVar, l48Var, 1048576, null);
    }

    public static final onh D(fts ftsVar) {
        gnh gnhVar;
        p9 p9Var = ftsVar.d;
        if (p9Var instanceof cts) {
            return onh.c(((cts) p9Var).b);
        }
        if (!(p9Var instanceof dts)) {
            if (p9Var instanceof bts) {
                return onh.c(((bts) p9Var).b);
            }
            b6e.s();
            return null;
        }
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        Uri fromParts = Uri.fromParts("expecting", "fully", "cached");
        String str = ((dts) p9Var).b;
        vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
        if (fromParts != null) {
            gnhVar = new gnh(fromParts, null, ((UUID) bnhVar.d) != null ? new cnh(bnhVar) : null, null, list, str, qsnVar, -9223372036854775807L);
        } else {
            gnhVar = null;
        }
        return new onh("", new anh(xmhVar), gnhVar, new fnh(dnhVar), hoh.K, jnhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String E(Throwable th) {
        String str;
        String str2;
        jch b;
        jch b2;
        Regex regex = x7k.a;
        String message = th.getMessage();
        String str3 = null;
        if (message != null) {
            int S = StringsKt.S(message, '\n', 0, 6);
            if (S != -1) {
                message = message.substring(0, S);
            }
            try {
                b2 = x7k.a.b(message);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if (b2 != null) {
                MatchGroup a = b2.c.a(1);
                String str4 = a != null ? a.a : null;
                if (str4 != null) {
                    str = "не найден парсер для типа '" + str4 + "'";
                    if (str == null) {
                        return str;
                    }
                    String message2 = th.getMessage();
                    if (message2 != null) {
                        int S2 = StringsKt.S(message2, '\n', 0, 6);
                        if (S2 != -1) {
                            message2 = message2.substring(0, S2);
                        }
                        try {
                            b = x7k.b.b(message2);
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                        if (b != null) {
                            MatchGroup a2 = b.c.a(1);
                            String str5 = a2 != null ? a2.a : null;
                            if (str5 != null) {
                                str2 = "не найден парсер для дискриминатора '" + str5 + "'";
                                if (str2 == null) {
                                    return str2;
                                }
                                String message3 = th.getMessage();
                                if (message3 != null) {
                                    int S3 = StringsKt.S(message3, '\n', 0, 6);
                                    if (S3 != -1) {
                                        message3 = message3.substring(0, S3);
                                    }
                                    try {
                                        jch d = x7k.c.d(message3);
                                        if (d != null) {
                                            MatchGroup a3 = d.c.a(2);
                                            String str6 = a3 != null ? a3.a : null;
                                            MatchGroup a4 = d.c.a(1);
                                            String str7 = a4 != null ? a4.a : null;
                                            if (str6 != null && str7 != null) {
                                                str3 = "отсутствуют обязательные для типа '" + str6 + "' поля '" + str7 + "'";
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th4.printStackTrace();
                                    }
                                }
                                return str3;
                            }
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                }
            }
        }
        str = null;
        if (str == null) {
        }
    }

    public static String F(int i, int i2, String str) {
        if (i < 0) {
            return zwf.R("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zwf.R("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        xq0.x(k5r.i(i2, "negative size: "));
        return null;
    }

    public static void G(int i, String str, boolean z) {
        if (z) {
            return;
        }
        xq0.x(zwf.R(str, Integer.valueOf(i)));
    }

    public static void H(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        xq0.x(zwf.R(str, obj));
    }

    public static void I(String str, long j, boolean z) {
        if (z) {
            return;
        }
        xq0.x(zwf.R(str, Long.valueOf(j)));
    }

    public static void J(String str, boolean z) {
        if (z) {
            return;
        }
        xq0.x(str);
    }

    public static void K(String str, boolean z, int i, int i2) {
        if (z) {
            return;
        }
        xq0.x(zwf.R(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void L(boolean z) {
        if (z) {
            return;
        }
        e7o.e();
    }

    public static void M(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        xq0.x(zwf.R(str, obj, obj2));
    }

    public static void N(int i, int i2) {
        String R;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                R = zwf.R("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    xq0.x(k5r.i(i2, "negative size: "));
                    return;
                }
                R = zwf.R("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(R);
        }
    }

    public static void O(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static void P(int i, int i2) {
        if (i < 0 || i > i2) {
            e7o.o(F(i, i2, "index"));
        }
    }

    public static void Q(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? F(i, i3, "start index") : (i2 < 0 || i2 > i3) ? F(i2, i3, "end index") : zwf.R("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void R(int i, String str, boolean z) {
        if (z) {
            return;
        }
        xq0.q(zwf.R(str, Integer.valueOf(i)));
    }

    public static void S(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        xq0.q(zwf.R(str, obj));
    }

    public static void T(String str, long j, boolean z) {
        if (z) {
            return;
        }
        xq0.q(zwf.R(str, Long.valueOf(j)));
    }

    public static void U(String str, boolean z) {
        if (z) {
            return;
        }
        xq0.q(str);
    }

    public static void V(boolean z) {
        if (z) {
            return;
        }
        e7o.n();
    }

    public static void W(boolean z, Object obj, vhe vheVar) {
        if (z) {
            return;
        }
        xq0.q(zwf.R("%s -> %s", obj, vheVar));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [jaw] */
    public static final jaw X(oq4 oq4Var) {
        final d9w d9wVar;
        switch (oq4Var.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 5:
                d9wVar = new d9w(5);
                break;
            case 1:
            case 7:
                ssg.a(7, "YandexMusicTrackMediaSource", "Unsupported codec type " + oq4Var, null);
                d9wVar = null;
                break;
            case 3:
            case 6:
                d9wVar = new d9w(6);
                break;
            default:
                b6e.s();
                return null;
        }
        return new u2c() { // from class: jaw
            @Override // defpackage.u2c
            public final r2c[] e() {
                r2c[] e = new hm7().e();
                Function1 function1 = Function1.this;
                if (function1 != null) {
                    e.getClass();
                    if (e.length > 1) {
                        uz0.p(e, new eh(19, function1));
                    }
                }
                return e;
            }
        };
    }

    public static final List Y(List list) {
        list.getClass();
        List w0 = CollectionsKt.w0(CollectionsKt.z0(list));
        if (w0.size() != list.size()) {
            su4.s(2, null, "duplicates in list", null);
        }
        return w0;
    }

    public static final String Z(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final void a(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0) {
        int i2;
        String str2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(348654856);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            str2 = str;
        } else {
            hz2 hz2Var = b2c.l;
            agr agrVar = yre.a;
            float f = 40;
            yci u = xp3.u(d.e(d.z(MinimumInteractiveModifier.a, 3), f), ugo.a(36));
            agr agrVar2 = eq0.a;
            yci b = a.b(u, ((dq0) oq5Var.j(agrVar2)).c.c, vnj.i);
            nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i4 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ges i5 = nu0.i();
            long j = ((dq0) oq5Var.j(agrVar2)).b.a;
            vci vciVar = vci.a;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 20, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci g = vz1.g(1.0f, q, false);
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new srp(str, 19);
                oq5Var.k0(K);
            }
            xcs.b(str, nfp.a(g, (Function1) K), j, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, i5, oq5Var, i6, 3120, 55288);
            str2 = str;
            oq5Var = oq5Var;
            w4k E = a0g.E(R.drawable.ic_close_small_24, 0, oq5Var);
            String o = ouj.o(str2, StringUtil.LF, rvf.M(R.string.rup_settings_button_reset, oq5Var));
            d43 d43Var = new d43(((dq0) oq5Var.j(agrVar2)).a.c, 5);
            yci o2 = androidx.compose.foundation.layout.a.o(xp3.u(d.m(vciVar, f), ugo.a), 0.0f, 4, 1);
            boolean z2 = (i3 & 112) == 32;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new gct(14, function0);
                oq5Var.k0(K2);
            }
            irf.r(E, o, androidx.compose.ui.platform.a.a(a.e(o2, false, null, null, (Function0) K2, 7), "landing_wave_block_clear_settings_button"), null, hd6.e, 0.0f, d43Var, oq5Var, 24576, 40);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(str2, function0, yciVar2, i, 28);
        }
    }

    public static int a0(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i = typedValue.type;
        if (i == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i != 6) {
                return -2;
            }
            int i2 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i2, i2);
        }
        return (int) fraction;
    }

    public static final void b(String str, ukd ukdVar, kes kesVar, plv plvVar, hq5 hq5Var, int i) {
        b95 b95Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1574813777);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(ukdVar) ? 32 : 16) | (oq5Var.f(kesVar) ? 256 : 128) | (oq5Var.f(plvVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            if (plvVar instanceof nlv) {
                oq5Var.Z(1567562486);
                oq5Var.p(false);
                b95Var = new sfc(((nlv) plvVar).d);
            } else {
                if (!Intrinsics.d(plvVar, olv.b)) {
                    throw vz1.i(oq5Var, 1567560433, false);
                }
                oq5Var.Z(1567565658);
                b95Var = ((fxa) oq5Var.j(cs5.e)).e;
                oq5Var.p(false);
            }
            fes fesVar = new fes(b95Var, kesVar, null, 124);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(6);
                oq5Var.k0(K);
            }
            y1g.o(str, zdg.E(ukdVar, (Function1) K), fesVar, 1, oq5Var, (i2 & 14) | 3072);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rov(str, ukdVar, kesVar, plvVar, i, 1);
        }
    }

    public static final boolean b0(mwk mwkVar) {
        mwkVar.getClass();
        return ((Boolean) dag.p(mwkVar, e88.j)).booleanValue();
    }

    public static final void c(j2g j2gVar, yci yciVar, hq5 hq5Var, int i) {
        j2gVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-248416232);
        int i2 = (oq5Var.f(j2gVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            etn.m(new qzm[0], ild.C(1455742168, new ykf(j2gVar), oq5Var), oq5Var, 48);
            yciVar = vci.a;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(j2gVar, yciVar, i, 0);
        }
    }

    public static final e2v c0(izs izsVar) {
        if (Intrinsics.d(izsVar, hzs.a)) {
            return new c2v(ryt.a);
        }
        if (!(izsVar instanceof e6v)) {
            b6e.s();
            return null;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof b6v) {
            r3q r3qVar = ((b6v) e6vVar).a;
            if (r3qVar instanceof j3q) {
                j3q j3qVar = (j3q) r3qVar;
                return new x1v(j3qVar.a.a, j3qVar.b, j3qVar.c);
            }
            if (r3qVar instanceof l3q) {
                l3q l3qVar = (l3q) r3qVar;
                return new y1v(l3qVar.a.a, l3qVar.b, l3qVar.c);
            }
            if (r3qVar instanceof p3q) {
                p3q p3qVar = (p3q) r3qVar;
                bd5 bd5Var = p3qVar.a;
                return new a2v(new nvl(bd5Var.s(), bd5Var.a()), p3qVar.c, p3qVar.b);
            }
            if (r3qVar instanceof m3q) {
                return new c2v(((m3q) r3qVar).b);
            }
            b6e.s();
            return null;
        }
        if (!(e6vVar instanceof d6v)) {
            b6e.s();
            return null;
        }
        z4q z4qVar = ((d6v) e6vVar).a;
        if (z4qVar instanceof s4q) {
            s4q s4qVar = (s4q) z4qVar;
            return new d2v(s4qVar.a.a, s4qVar.c, s4qVar.e);
        }
        if (z4qVar instanceof u4q) {
            u4q u4qVar = (u4q) z4qVar;
            return new d2v(u4qVar.a.a, u4qVar.c, u4qVar.e);
        }
        if (z4qVar instanceof w4q) {
            w4q w4qVar = (w4q) z4qVar;
            return new d2v(w4qVar.a.a, w4qVar.c, w4qVar.e);
        }
        b6e.s();
        return null;
    }

    public static final void d(a3g a3gVar, int i, Function0 function0, ynn ynnVar, Function2 function2, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2107370165);
        int i3 = i2 | (oq5Var.f(a3gVar) ? 4 : 2) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.f(ynnVar) ? 2048 : 1024) | (oq5Var.h(function2) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new xjf(10);
                oq5Var.k0(K);
            }
            ot0.l(a3gVar, (Function1) K, yciVar, null, null, false, ild.C(-631398289, new n2g(ynnVar, function2, i, function0, 0), oq5Var), oq5Var, ((i3 >> 9) & 896) | (i3 & 14) | 1572912, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(a3gVar, function0, ynnVar, i, function2, yciVar, i2, 20);
        }
    }

    public static final f2v d0(mwk mwkVar) {
        mwkVar.getClass();
        if (mwkVar instanceof jzs) {
            return c0(((jzs) mwkVar).g);
        }
        boolean z = mwkVar instanceof k4d;
        b2v b2vVar = b2v.a;
        if (z) {
            return b2vVar;
        }
        if (mwkVar instanceof foc) {
            return b2vVar;
        }
        boolean z2 = mwkVar instanceof i5u;
        z1v z1vVar = z1v.a;
        if (z2) {
            return z1vVar;
        }
        boolean z3 = mwkVar instanceof m1q;
        ryt rytVar = ryt.a;
        if (z3) {
            m1q m1qVar = (m1q) mwkVar;
            if (!(m1qVar instanceof j1q)) {
                if (!(m1qVar instanceof c2q)) {
                    if (m1qVar instanceof e2q) {
                        return new c2v(rytVar);
                    }
                    b6e.s();
                    return null;
                }
                d2q d2qVar = ((c2q) m1qVar).e;
                if (d2qVar instanceof c1q) {
                    oq oqVar = ((c1q) d2qVar).a;
                    return new x1v(oqVar.a, new n3q(oqVar.b), i3q.a);
                }
                if (d2qVar instanceof e1q) {
                    e1q e1qVar = (e1q) d2qVar;
                    return new y1v(e1qVar.c.a, new n3q(e1qVar.d), k3q.a);
                }
                if (d2qVar instanceof k1q) {
                    return new c2v(rytVar);
                }
                if (d2qVar instanceof r1q) {
                    r1q r1qVar = (r1q) d2qVar;
                    return new a2v(r1qVar.c.a, new n3q(r1qVar.d), o3q.b);
                }
                if (d2qVar instanceof u1q) {
                    u1q u1qVar = (u1q) d2qVar;
                    return new d2v((s9p) u1qVar.c.d.getValue(), new s4v(u1qVar.d, null), p4q.b);
                }
                if (d2qVar instanceof a2q) {
                    return new c2v(rytVar);
                }
                b6e.s();
                return null;
            }
        } else {
            if (!(mwkVar instanceof faq)) {
                kac.j(mwkVar, "Developer Error. Unexpected class for visit ");
                return null;
            }
            faq faqVar = (faq) mwkVar;
            if (!(faqVar instanceof daq)) {
                if (faqVar instanceof naq) {
                    return c0(q7g.I(((naq) faqVar).d));
                }
                if (faqVar instanceof qaq) {
                    return new c2v(rytVar);
                }
                if (faqVar instanceof saq) {
                    return z1vVar;
                }
                b6e.s();
                return null;
            }
        }
        return b2vVar;
    }

    public static final void e(cds cdsVar, yci yciVar, long j, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2035238795);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(cdsVar) : oq5Var.h(cdsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= oq5Var.e(j) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            bds bdsVar = cdsVar.a;
            long j2 = cdsVar.c;
            String str = bdsVar.a.b;
            vci vciVar = vci.a;
            yci n = d.n(xv.m(jx7Var.c0((int) (j2 >> 32)), jx7Var.c0((int) (j2 & 4294967295L))), ksw.D(vciVar, str, null));
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && oq5Var.h(cdsVar))) | ((i3 & 896) == 256);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new j8a(cdsVar, j, 2);
                oq5Var.k0(K);
            }
            ksw.j(0, oq5Var, n, (Function1) K);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new azb(cdsVar, yciVar2, j, i, 1);
        }
    }

    public static final boolean e0(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final void f(bki bkiVar, owu owuVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        bkiVar.getClass();
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-975900082);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(bkiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(owuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci q = androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            men.h(R.string.listening_history_context_wave, 0, 2, oq5Var, null);
            qhi.c(bkiVar.a, owuVar, null, null, false, null, oq5Var, i2 & 112);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(bkiVar, owuVar, yciVar, i, 19);
        }
    }

    public static final aqi f0(Object[] objArr, apo apoVar, Function0 function0, oq5 oq5Var) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        y5 y5Var = new y5(26, apoVar);
        ybg ybgVar = new ybg(23, apoVar);
        apo apoVar2 = bpo.a;
        return (aqi) g0(copyOf, new apo(0, y5Var, ybgVar), function0, oq5Var, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(usj usjVar, psj psjVar, o3e o3eVar, wn5 wn5Var, yci yciVar, boolean z, pyc pycVar, hq5 hq5Var, int i, int i2) {
        int i3;
        psj psjVar2;
        o3e o3eVar2;
        yci yciVar2;
        int i4;
        boolean z2;
        int i5;
        pyc pycVar2;
        boolean z3;
        xmn r;
        vci vciVar;
        boolean z4;
        psjVar.getClass();
        o3eVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(351874993);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(usjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            psjVar2 = psjVar;
            i3 |= oq5Var.f(psjVar2) ? 32 : 16;
        } else {
            psjVar2 = psjVar;
        }
        if ((i & 384) == 0) {
            o3eVar2 = o3eVar;
            i3 |= oq5Var.h(o3eVar2) ? 256 : 128;
        } else {
            o3eVar2 = o3eVar;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i3 |= oq5Var.g(z2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                } else if ((1572864 & i) == 0) {
                    pycVar2 = pycVar;
                    i3 |= oq5Var.h(pycVar2) ? 1048576 : 524288;
                    if (oq5Var.P(i3 & 1, (599187 & i3) == 599186)) {
                        oq5Var.S();
                        z3 = z2;
                    } else {
                        vci vciVar2 = vci.a;
                        if (i6 != 0) {
                            yciVar2 = vciVar2;
                        }
                        z3 = i4 != 0 ? true : z2;
                        pyc pycVar3 = i5 != 0 ? null : pycVar2;
                        ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                        int i7 = oq5Var.P;
                        androidx.compose.runtime.internal.a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, yciVar2);
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
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var, i7, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        if (z3) {
                            oq5Var.Z(-1221878483);
                            wn5 C = ild.C(270367102, new gab(19, wn5Var, usjVar), oq5Var);
                            int i8 = i3 & 112;
                            boolean z5 = i8 == 32;
                            Object K = oq5Var.K();
                            kjn kjnVar = gq5.a;
                            if (z5 || K == kjnVar) {
                                msj msjVar = new msj(0, psjVar2, psj.class, "onPlaylistClick", "onPlaylistClick()V", 0, 0);
                                oq5Var.k0(msjVar);
                                K = msjVar;
                            }
                            Function0 function0 = (Function0) ((h9f) K);
                            boolean z6 = i8 == 32;
                            Object K2 = oq5Var.K();
                            if (z6 || K2 == kjnVar) {
                                msj msjVar2 = new msj(0, psjVar, psj.class, "onPlaylistLongClick", "onPlaylistLongClick()V", 0, 1);
                                oq5Var.k0(msjVar2);
                                K2 = msjVar2;
                            }
                            vciVar = vciVar2;
                            i(C, function0, (Function0) ((h9f) K2), androidx.compose.ui.platform.a.a(vciVar2, "open_playlist_header_slot"), false, oq5Var, 3078, 16);
                            z4 = false;
                        } else {
                            vciVar = vciVar2;
                            z4 = false;
                            oq5Var.Z(-1226066149);
                        }
                        oq5Var.p(z4);
                        pycVar2 = pycVar3;
                        zsd.u(usjVar.c, o3eVar2, androidx.compose.ui.platform.a.a(vciVar, "open_playlist_pager"), pycVar2, z3 ? i3e.a : i3e.b, null, oq5Var, ((i3 >> 3) & 112) | 384 | ((i3 >> 9) & 7168), 32);
                        oq5Var = oq5Var;
                        oq5Var.p(true);
                    }
                    yci yciVar3 = yciVar2;
                    pyc pycVar4 = pycVar2;
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new i93(usjVar, psjVar, o3eVar, wn5Var, yciVar3, z3, pycVar4, i, i2, 2);
                        return;
                    }
                    return;
                }
                pycVar2 = pycVar;
                if (oq5Var.P(i3 & 1, (599187 & i3) == 599186)) {
                }
                yci yciVar32 = yciVar2;
                pyc pycVar42 = pycVar2;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            z2 = z;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            pycVar2 = pycVar;
            if (oq5Var.P(i3 & 1, (599187 & i3) == 599186)) {
            }
            yci yciVar322 = yciVar2;
            pyc pycVar422 = pycVar2;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        pycVar2 = pycVar;
        if (oq5Var.P(i3 & 1, (599187 & i3) == 599186)) {
        }
        yci yciVar3222 = yciVar2;
        pyc pycVar4222 = pycVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final Object g0(Object[] objArr, zoo zooVar, Function0 function0, hq5 hq5Var, int i, int i2) {
        Object[] objArr2;
        Object obj;
        Object e;
        if ((i2 & 2) != 0) {
            zooVar = bpo.a;
        }
        zoo zooVar2 = zooVar;
        oq5 oq5Var = (oq5) hq5Var;
        String num = Integer.toString(oq5Var.P, CharsKt.checkRadix(36));
        num.getClass();
        zooVar2.getClass();
        koo kooVar = (koo) oq5Var.j(moo.a);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            Object f = (kooVar == null || (e = kooVar.e(num)) == null) ? null : zooVar2.f(e);
            if (f == null) {
                f = function0.invoke();
            }
            objArr2 = objArr;
            goo gooVar = new goo(zooVar2, kooVar, num, f, objArr2);
            oq5Var.k0(gooVar);
            K = gooVar;
        } else {
            objArr2 = objArr;
        }
        goo gooVar2 = (goo) K;
        Object obj2 = Arrays.equals(objArr2, gooVar2.e) ? gooVar2.d : null;
        if (obj2 == null) {
            obj2 = function0.invoke();
        }
        boolean h = oq5Var.h(gooVar2) | ((((i & 112) ^ 48) > 32 && oq5Var.h(zooVar2)) || (i & 48) == 32) | oq5Var.h(kooVar) | oq5Var.f(num) | oq5Var.h(obj2) | oq5Var.h(objArr2);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            Object[] objArr3 = objArr2;
            obj = obj2;
            ec8 ec8Var = new ec8(gooVar2, zooVar2, kooVar, num, obj, objArr3, 3);
            oq5Var.k0(ec8Var);
            K2 = ec8Var;
        } else {
            obj = obj2;
        }
        gld.D((Function0) K2, oq5Var);
        return obj;
    }

    public static final void h(int i, int i2, hq5 hq5Var, yci yciVar, boolean z, boolean z2) {
        int i3;
        yci yciVar2;
        int i4;
        boolean z3;
        int i5;
        yci yciVar3;
        boolean z4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(452428627);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i4 = i3 | (oq5Var.f(yciVar2) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i5 = i4 | 384;
            z3 = z2;
        } else {
            z3 = z2;
            i5 = i4 | (oq5Var.g(z3) ? 256 : 128);
        }
        if (oq5Var.P(i5 & 1, (i5 & 147) != 146)) {
            yci yciVar4 = i6 != 0 ? vci.a : yciVar2;
            boolean z5 = i7 != 0 ? true : z3;
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar4);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (z5) {
                oq5Var.Z(185106870);
                wn5 C = ild.C(1851553190, new xu0(13, z), oq5Var);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new s9j(17);
                    oq5Var.k0(K);
                }
                Function0 function0 = (Function0) K;
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new s9j(18);
                    oq5Var.k0(K2);
                }
                i(C, function0, (Function0) K2, null, false, oq5Var, 25014, 8);
            } else {
                oq5Var.Z(182979557);
            }
            oq5Var.p(false);
            zsd.w(i5 & 910, oq5Var, null, z, z5);
            oq5Var.p(true);
            yciVar3 = yciVar4;
            z4 = z5;
        } else {
            oq5Var.S();
            yciVar3 = yciVar2;
            z4 = z3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lsj(z, yciVar3, z4, i, i2);
        }
    }

    public static final owu h0(qzl qzlVar, StationId stationId, jab jabVar, u0s u0sVar, oq5 oq5Var, int i) {
        qzlVar.getClass();
        stationId.getClass();
        Object obj = (i & 4) != 0 ? null : u0sVar;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = gld.R(g.a, oq5Var);
            oq5Var.k0(K);
        }
        mm6 mm6Var = (mm6) K;
        boolean f = oq5Var.f(obj) | oq5Var.f(stationId);
        Object K2 = oq5Var.K();
        if (f || K2 == kjnVar) {
            mm6Var.getClass();
            rmb a = qzlVar.h.a(jabVar, null);
            thj k = bfg.k(stationId, 0);
            List E = c9g.E(stationId);
            kxi kxiVar = qzlVar.c;
            iik iikVar = new iik(18, a, k);
            l18 l18Var = l18.b;
            bdt I = hag.I(k6l.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            k6l k6lVar = (k6l) qdcVar.C(I);
            bdt I2 = hag.I(uwu.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            uwu uwuVar = (uwu) qdcVar2.C(I2);
            bdt I3 = hag.I(qwu.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            K2 = wyf.S(mm6Var, kxiVar, k6lVar, null, null, (qwu) qdcVar3.C(I3), uwuVar, E, iikVar, null);
            oq5Var.k0(K2);
        }
        return (owu) K2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(wn5 wn5Var, Function0 function0, Function0 function02, yci yciVar, boolean z, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        boolean z2;
        boolean z3;
        yci yciVar3;
        xmn r;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-149070444);
        if ((i & 48) == 0) {
            i3 = (oq5Var.h(function0) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(function02) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
                if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
                    yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                    boolean z4 = i4 == 0 ? z2 : true;
                    long j = d85.m;
                    Object K = oq5Var.K();
                    if (K == gq5.a) {
                        K = new hpj(11);
                        oq5Var.k0(K);
                    }
                    int i6 = ((i3 >> 9) & 112) | 196992;
                    int i7 = i3 << 6;
                    boolean z5 = z4;
                    ltg.i(nfp.b(yciVar4, false, (Function1) K), z5, j, function0, function02, ild.C(-1425655090, new y61(wn5Var, 19), oq5Var), oq5Var, i6 | (i7 & 7168) | (i7 & 57344), 0);
                    yciVar3 = yciVar4;
                    z3 = z5;
                } else {
                    oq5Var.S();
                    z3 = z2;
                    yciVar3 = yciVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new p91(wn5Var, function0, function02, yciVar3, z3, i, i2, 1);
                    return;
                }
                return;
            }
            z2 = z;
            if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final ObjectAnimator i0(View view) {
        view.getClass();
        float dimension = view.getResources().getDimension(R.dimen.collapsed_player_animation_translation);
        float f = -dimension;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f, f - (dimension / 3.0f), (dimension / 6.0f) + f, f, 0.0f);
        ofFloat.setAutoCancel(true);
        ofFloat.setDuration(1100L);
        ofFloat.setStartDelay(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setRepeatCount(1);
        ofFloat.addListener(new jdh(view, 1));
        ofFloat.start();
        return ofFloat;
    }

    public static final void j(y5n y5nVar, boolean z, hq5 hq5Var, int i) {
        y5nVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2082948700);
        int i2 = 4;
        int i3 = (oq5Var.h(y5nVar) ? 4 : 2) | i;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            aqi P = szf.P(y5nVar.c, new j6n(y5nVar.d), null, oq5Var, 0, 2);
            oq5Var.Z(258951768);
            yci b = a.b(vci.a, ((dq0) oq5Var.j(eq0.a)).c.b, vnj.i);
            if (z) {
                oq5Var.Z(-289014824);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-289098958);
                b = bfg.Q(b, bfg.C(oq5Var), false, 14);
                oq5Var.p(false);
            }
            oq5Var.p(false);
            yci q = androidx.compose.foundation.layout.a.q(d.d(b, 1.0f), 0.0f, 8, 0.0f, 16, 5);
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i4 = oq5Var.P;
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            l6n l6nVar = (l6n) P.getValue();
            boolean h = oq5Var.h(y5nVar) | oq5Var.f(P);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (h || K == obj) {
                K = new xum(y5nVar, P, i2);
                oq5Var.k0(K);
            }
            Function1 function1 = (Function1) K;
            boolean h2 = oq5Var.h(y5nVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == obj) {
                K2 = new ril(29, y5nVar);
                oq5Var.k0(K2);
            }
            o5g.f(function1, (Function0) K2, l6nVar, null, true, oq5Var, 24576, 8);
            oq5Var = oq5Var;
            if (z) {
                oq5Var.Z(-775189104);
            } else {
                oq5Var.Z(-773023289);
                WeakHashMap weakHashMap = rqv.w;
                u1g.l(oq5Var, s7g.F(z7l.h(oq5Var).e));
            }
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl3(y5nVar, z, i, 3);
        }
    }

    public static final ukd j0(long j) {
        float c = fma.c(j);
        return o5g.I(new yov(new n38(c)), fma.b(j));
    }

    public static final void k(final fvf fvfVar, final gcc gccVar, final n1p n1pVar, final boolean z, final Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        fvfVar.getClass();
        gccVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(948237620);
        int i2 = i | (oq5Var.f(fvfVar) ? 4 : 2) | (oq5Var.f(gccVar) ? 32 : 16) | (oq5Var.f(n1pVar) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | (oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            final mm6 mm6Var = (mm6) K;
            final float f = 16;
            final int L = ((jx7) oq5Var.j(es5.h)).L(f);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            etn.l(jzj.a.a(null), ild.C(-543150290, new Function2() { // from class: o1p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final fvf fvfVar2;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                        float f2 = 8;
                        yci q = androidx.compose.foundation.layout.a.q(androidx.compose.ui.platform.a.a(vci.a, "filter_lazy_row"), 0.0f, 0.0f, 0.0f, f2, 7);
                        float f3 = f;
                        q0k q0kVar = new q0k(f3, f2, f3, f2);
                        nx0 g = qx0.g(f2);
                        final gcc gccVar2 = gccVar;
                        boolean f4 = oq5Var2.f(gccVar2);
                        final n1p n1pVar2 = n1pVar;
                        boolean f5 = f4 | oq5Var2.f(n1pVar2);
                        final Function1 function12 = function1;
                        boolean f6 = f5 | oq5Var2.f(function12);
                        final mm6 mm6Var2 = mm6Var;
                        boolean h = f6 | oq5Var2.h(mm6Var2);
                        fvf fvfVar3 = fvfVar;
                        boolean f7 = h | oq5Var2.f(fvfVar3);
                        final int i4 = L;
                        boolean d2 = f7 | oq5Var2.d(i4);
                        final boolean z2 = z;
                        boolean g2 = d2 | oq5Var2.g(z2);
                        Object K2 = oq5Var2.K();
                        if (g2 || K2 == gq5.a) {
                            fvfVar2 = fvfVar3;
                            Function1 function13 = new Function1() { // from class: p1p
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    vuf vufVar = (vuf) obj3;
                                    vufVar.getClass();
                                    List list = gcc.this.a;
                                    vufVar.Z(list.size(), null, new zcf(list, 15), new wn5(new s1p(list, n1pVar2, function12, mm6Var2, fvfVar2, i4, z2), -1091073711, true));
                                    return Unit.a;
                                }
                            };
                            oq5Var2.k0(function13);
                            K2 = function13;
                        } else {
                            fvfVar2 = fvfVar3;
                        }
                        weo.i(q, fvfVar2, q0kVar, false, g, null, null, false, null, (Function1) K2, oq5Var2, 24582, 488);
                    } else {
                        oq5Var2.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 56);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(fvfVar, gccVar, n1pVar, z, function1, yciVar, i, 7);
        }
    }

    public static final vzg k0(pxs pxsVar) {
        pxsVar.getClass();
        return new vzg(pxsVar.a, pxsVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0081  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(int i, int i2, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        int i3;
        Function0 function02;
        String str2;
        String str3;
        Object K;
        Object obj;
        boolean f;
        Object K2;
        int i4;
        vci vciVar;
        int i5;
        ?? r3;
        Object obj2;
        String str4;
        jzk jzkVar;
        oq5 oq5Var;
        yci yciVar2;
        String str5;
        oq5 oq5Var2;
        xmn r;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-2060137697);
        if ((i & 6) == 0) {
            i3 = (oq5Var3.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i3 |= oq5Var3.h(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i6 = i3 | 384;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            str2 = str;
            i6 |= oq5Var3.f(str2) ? 2048 : 1024;
            if ((i6 & 1171) == 1170 || !oq5Var3.z()) {
                if (i7 != 0) {
                    str2 = null;
                }
                oq5Var3.Z(187602421);
                StringBuilder sb = new StringBuilder();
                if (str2 != null) {
                    str3 = vz1.n(oq5Var3, -1450183888, R.string.rup_block_settings_button, oq5Var3, false);
                } else {
                    oq5Var3.Z(-1450184136);
                    oq5Var3.p(false);
                    str3 = str2;
                }
                sb.append(str3);
                sb.append('\n');
                if (z) {
                    oq5Var3.Z(-2012760053);
                } else {
                    oq5Var3.Z(-2005934752);
                    sb.append(rvf.M(R.string.accessibility_new_wave_notification_dot, oq5Var3));
                    sb.append('\n');
                }
                oq5Var3.p(false);
                String sb2 = sb.toString();
                oq5Var3.p(false);
                K = oq5Var3.K();
                obj = gq5.a;
                if (K == obj) {
                    K = vz1.h(oq5Var3);
                }
                uoi uoiVar = (uoi) K;
                hz2 hz2Var = b2c.l;
                agr agrVar = yre.a;
                yci u = xp3.u(d.e(d.z(MinimumInteractiveModifier.a, 3), 40), ugo.a(36));
                agr agrVar2 = eq0.a;
                long j = ((dq0) oq5Var3.j(agrVar2)).c.c;
                int i8 = i6;
                jzk jzkVar2 = vnj.i;
                yci o = androidx.compose.foundation.layout.a.o(a.d(a.b(u, j, jzkVar2), uoiVar, eeo.a(0.0f, 7, 0L, false), false, null, new meo(0), function02, 12), 16, 0.0f, 2);
                f = oq5Var3.f(sb2);
                K2 = oq5Var3.K();
                if (!f || K2 == obj) {
                    K2 = new srp(sb2, 18);
                    oq5Var3.k0(K2);
                }
                yci a = androidx.compose.ui.platform.a.a(nfp.b(o, false, (Function1) K2), "landing_wave_block_button_settings");
                nho a2 = lho.a(qx0.a, hz2Var, oq5Var3, 48);
                i4 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.n0();
                } else {
                    oq5Var3.k(grbVar);
                }
                g0g.U(oq5Var3, a2, wp5.f);
                g0g.U(oq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var3, i4, kb5Var);
                }
                g0g.U(oq5Var3, H, wp5.d);
                w4k E = a0g.E(R.drawable.ic_sort_small_24, 0, oq5Var3);
                long j2 = ((dq0) oq5Var3.j(agrVar2)).a.a;
                vci vciVar2 = vci.a;
                gae.b(E, null, d.m(vciVar2, 24), j2, oq5Var3, 432, 0);
                if (str2 == null) {
                    oq5Var3.Z(-1049016206);
                    ges i9 = nu0.i();
                    long j3 = ((dq0) oq5Var3.j(agrVar2)).b.a;
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    yci o2 = androidx.compose.foundation.layout.a.o(new LayoutWeightElement(false, 1.0f), 4, 0.0f, 2);
                    Object K3 = oq5Var3.K();
                    if (K3 == obj) {
                        K3 = new t0v(11);
                        oq5Var3.k0(K3);
                    }
                    r3 = 0;
                    vciVar = vciVar2;
                    obj2 = obj;
                    i5 = -1057017337;
                    str4 = str2;
                    jzkVar = jzkVar2;
                    xcs.b(str4, nfp.a(o2, (Function1) K3), j3, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, i9, oq5Var3, (i8 >> 9) & 14, 0, 65016);
                    oq5Var = oq5Var3;
                } else {
                    vciVar = vciVar2;
                    i5 = -1057017337;
                    r3 = 0;
                    obj2 = obj;
                    str4 = str2;
                    jzkVar = jzkVar2;
                    oq5Var3.Z(-1057017337);
                    oq5Var = oq5Var3;
                }
                oq5Var.p(r3);
                if (z) {
                    oq5Var.Z(i5);
                } else {
                    oq5Var.Z(-1048509077);
                    u1g.l(oq5Var, d.r(vciVar, 4));
                    yci b = a.b(xp3.u(d.m(vciVar, 8), ugo.a), kg5.r(R.color.avatar_alert_red, oq5Var), jzkVar);
                    Object K4 = oq5Var.K();
                    if (K4 == obj2) {
                        K4 = new t0v(12);
                        oq5Var.k0(K4);
                    }
                    ug3.a(nfp.a(b, (Function1) K4), oq5Var, r3);
                }
                oq5Var.p(r3);
                oq5Var.p(true);
                yciVar2 = vciVar;
                str5 = str4;
                oq5Var2 = oq5Var;
            } else {
                oq5Var3.S();
                yciVar2 = yciVar;
                str5 = str2;
                oq5Var2 = oq5Var3;
            }
            r = oq5Var2.r();
            if (r == null) {
                r.d = new a1v(z, function0, yciVar2, str5, i, i2);
                return;
            }
            return;
        }
        str2 = str;
        if ((i6 & 1171) == 1170) {
        }
        if (i7 != 0) {
        }
        oq5Var3.Z(187602421);
        StringBuilder sb3 = new StringBuilder();
        if (str2 != null) {
        }
        sb3.append(str3);
        sb3.append('\n');
        if (z) {
        }
        oq5Var3.p(false);
        String sb22 = sb3.toString();
        oq5Var3.p(false);
        K = oq5Var3.K();
        obj = gq5.a;
        if (K == obj) {
        }
        uoi uoiVar2 = (uoi) K;
        hz2 hz2Var2 = b2c.l;
        agr agrVar3 = yre.a;
        yci u2 = xp3.u(d.e(d.z(MinimumInteractiveModifier.a, 3), 40), ugo.a(36));
        agr agrVar22 = eq0.a;
        long j4 = ((dq0) oq5Var3.j(agrVar22)).c.c;
        int i82 = i6;
        jzk jzkVar22 = vnj.i;
        yci o3 = androidx.compose.foundation.layout.a.o(a.d(a.b(u2, j4, jzkVar22), uoiVar2, eeo.a(0.0f, 7, 0L, false), false, null, new meo(0), function02, 12), 16, 0.0f, 2);
        f = oq5Var3.f(sb22);
        K2 = oq5Var3.K();
        if (!f) {
        }
        K2 = new srp(sb22, 18);
        oq5Var3.k0(K2);
        yci a3 = androidx.compose.ui.platform.a.a(nfp.b(o3, false, (Function1) K2), "landing_wave_block_button_settings");
        nho a22 = lho.a(qx0.a, hz2Var2, oq5Var3, 48);
        i4 = oq5Var3.P;
        androidx.compose.runtime.internal.a l2 = oq5Var3.l();
        yci H2 = vnj.H(oq5Var3, a3);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var3.d0();
        if (oq5Var3.O) {
        }
        g0g.U(oq5Var3, a22, wp5.f);
        g0g.U(oq5Var3, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var3.O) {
        }
        ouj.x(i4, oq5Var3, i4, kb5Var2);
        g0g.U(oq5Var3, H2, wp5.d);
        w4k E2 = a0g.E(R.drawable.ic_sort_small_24, 0, oq5Var3);
        long j22 = ((dq0) oq5Var3.j(agrVar22)).a.a;
        vci vciVar22 = vci.a;
        gae.b(E2, null, d.m(vciVar22, 24), j22, oq5Var3, 432, 0);
        if (str2 == null) {
        }
        oq5Var.p(r3);
        if (z) {
        }
        oq5Var.p(r3);
        oq5Var.p(true);
        yciVar2 = vciVar;
        str5 = str4;
        oq5Var2 = oq5Var;
        r = oq5Var2.r();
        if (r == null) {
        }
    }

    public static long l0(long j, long j2, int i, long j3) {
        int i2 = dvt.a;
        return j + dvt.g0(j2 - j3, 1000000L, i, RoundingMode.DOWN);
    }

    public static final void m(String str, ukd ukdVar, kes kesVar, plv plvVar, hq5 hq5Var, int i) {
        b95 b95Var;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(110341400);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(ukdVar) ? 32 : 16) | (oq5Var.f(kesVar) ? 256 : 128) | (oq5Var.f(plvVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            if (plvVar instanceof nlv) {
                oq5Var.Z(-1336086211);
                oq5Var.p(false);
                b95Var = new sfc(((nlv) plvVar).d);
            } else {
                if (!Intrinsics.d(plvVar, olv.b)) {
                    throw vz1.i(oq5Var, -1336088264, false);
                }
                oq5Var.Z(-1336083039);
                b95Var = ((fxa) oq5Var.j(cs5.e)).e;
                oq5Var.p(false);
            }
            fes fesVar = new fes(b95Var, kesVar, null, 124);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(4);
                oq5Var.k0(K);
            }
            y1g.o(str, zdg.E(ukdVar, (Function1) K), fesVar, 1, oq5Var, (i2 & 14) | 3072);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rov(str, ukdVar, kesVar, plvVar, i, 0);
        }
    }

    public static final fyt m0(iow iowVar) {
        switch (iowVar.ordinal()) {
            case 0:
            case 6:
            case 7:
                return ryt.a;
            case 1:
                return syt.a;
            case 2:
                return cyt.a;
            case 3:
                return new qyt("", null);
            case 4:
            case 5:
                return eyt.a;
            default:
                b6e.s();
                return null;
        }
    }

    public static final void n(String str, ukd ukdVar, kes kesVar, plv plvVar, hq5 hq5Var, int i, int i2) {
        int i3;
        ukd ukdVar2;
        b95 b95Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1954447548);
        int i4 = i | (oq5Var.f(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (oq5Var.f(ukdVar) ? 32 : 16);
        }
        int i6 = i3 | (oq5Var.f(kesVar) ? 256 : 128) | (oq5Var.f(plvVar) ? 2048 : 1024);
        if (oq5Var.P(i6 & 1, (i6 & 1171) != 1170)) {
            ukdVar2 = i5 != 0 ? skd.a : ukdVar;
            if (plvVar instanceof nlv) {
                oq5Var.Z(1323395969);
                oq5Var.p(false);
                b95Var = new sfc(((nlv) plvVar).d);
            } else {
                if (!Intrinsics.d(plvVar, olv.b)) {
                    throw vz1.i(oq5Var, 1323393916, false);
                }
                oq5Var.Z(1323399141);
                n2o n2oVar = ((fxa) oq5Var.j(cs5.e)).e;
                oq5Var.p(false);
                b95Var = n2oVar;
            }
            fes fesVar = new fes(b95Var, kesVar, new sqc(), 120);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(5);
                oq5Var.k0(K);
            }
            y1g.o(str, zdg.E(ukdVar2, (Function1) K), fesVar, 1, oq5Var, (i6 & 14) | 3072);
        } else {
            oq5Var.S();
            ukdVar2 = ukdVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(str, ukdVar2, kesVar, plvVar, i, i2);
        }
    }

    public static final ArrayList n0(List list) {
        ArrayList O = CollectionsKt.O(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            h0r b0 = zc4.b0((TrackWithSmartPreviewDto) it.next());
            if (b0 != null) {
                arrayList.add(b0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final void o(String str, jzb jzbVar, ukd ukdVar, kes kesVar, plv plvVar, hq5 hq5Var, int i) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(986538472);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 32 : 16) | (oq5Var.f(ukdVar) ? 256 : 128) | (oq5Var.f(kesVar) ? 2048 : 1024) | (oq5Var.f(plvVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            y1g.l(ukdVar, 0, 0, ild.C(211659268, new mdn(str, kesVar, plvVar, jzbVar, 11), oq5Var), oq5Var, ((i2 >> 6) & 14) | 3072, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i, 27, str, jzbVar, ukdVar, kesVar, plvVar);
        }
    }

    public static final jzs o0(naq naqVar) {
        naqVar.getClass();
        mqs mqsVar = naqVar.e;
        v80 c = naqVar.c();
        uow uowVar = naqVar.d;
        return new jzs(mqsVar, c, null, q7g.G(uowVar), null, null, q7g.I(uowVar), false);
    }

    public static final void p(String str, String str2, jzb jzbVar, ukd ukdVar, kes kesVar, plv plvVar, hq5 hq5Var, int i) {
        str.getClass();
        str2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2139283926);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 256 : 128) | (oq5Var.f(ukdVar) ? 2048 : 1024) | (oq5Var.f(kesVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(plvVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            y1g.l(ukdVar, 0, 0, ild.C(883533626, new lc(str, kesVar, plvVar, jzbVar, str2, 23), oq5Var), oq5Var, ((i2 >> 9) & 14) | 3072, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(str, str2, jzbVar, ukdVar, kesVar, plvVar, i, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [c5b] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    public static final x1u p0(VideoClipDto videoClipDto) {
        String playerId;
        ?? r10;
        ?? r12;
        ?? r122;
        h94 z;
        videoClipDto.getClass();
        String clipId = videoClipDto.getClipId();
        if (clipId == null || (playerId = videoClipDto.getPlayerId()) == null) {
            return null;
        }
        String title = videoClipDto.getTitle();
        if (title == null) {
            title = "";
        }
        String thumbnail = videoClipDto.getThumbnail();
        WebPath$Storage webPath$Storage = WebPath$Storage.VIDEO_CLIP;
        webPath$Storage.getClass();
        CoverPath B = etn.B(thumbnail, webPath$Storage);
        String previewUrl = videoClipDto.getPreviewUrl();
        Long duration = videoClipDto.getDuration();
        long longValue = duration != null ? duration.longValue() * 1000 : 0L;
        List trackIds = videoClipDto.getTrackIds();
        List O = trackIds != null ? CollectionsKt.O(trackIds) : c5b.a;
        List<ArtistDto> artists = videoClipDto.getArtists();
        if (artists != null) {
            r10 = new ArrayList();
            for (ArtistDto artistDto : artists) {
                c01 C = artistDto != null ? lxe.C(artistDto) : null;
                if (C != null) {
                    r10.add(C);
                }
            }
        } else {
            r10 = c5b.a;
        }
        List list = r10;
        Boolean explicit = videoClipDto.getExplicit();
        boolean booleanValue = explicit != null ? explicit.booleanValue() : false;
        List<String> disclaimers = videoClipDto.getDisclaimers();
        if (disclaimers != null) {
            r12 = new ArrayList();
            for (String str : disclaimers) {
                hs4 hs4Var = h94.b;
                if (str == null) {
                    z = null;
                } else {
                    hs4Var.getClass();
                    z = hs4.z(str);
                }
                if (z != null) {
                    r12.add(z);
                }
            }
        } else {
            r12 = c5b.a;
        }
        List list2 = r12;
        List<String> disclaimers2 = videoClipDto.getDisclaimers();
        if (disclaimers2 != null) {
            r122 = new ArrayList();
            for (String str2 : disclaimers2) {
                hs5 g0 = str2 == null ? null : wdp.g0(str2);
                if (g0 != null) {
                    r122.add(g0);
                }
            }
        } else {
            r122 = c5b.a;
        }
        return new x1u(clipId, title, playerId, B, previewUrl, longValue, O, list, booleanValue, list2, r122, null, null);
    }

    public static final void q(int i, hq5 hq5Var, yci yciVar, String str, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(739410111);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            y(i2 & 126, oq5Var, null, str, z);
            u1g.l(oq5Var, d.e(vci.a, 16));
            t(z, null, 0, false, oq5Var, (i2 >> 3) & 14, 14);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gb1(str, z, yciVar, i, 2);
        }
    }

    public static final f q0(jzs jzsVar, int i) {
        jzsVar.getClass();
        mqs mqsVar = jzsVar.a;
        v80 v80Var = jzsVar.b;
        pow powVar = new pow(jzsVar.g, i, jzsVar.d);
        mqsVar.getClass();
        v80Var.getClass();
        iiw q = ngg.q(mqsVar);
        String str = q.a;
        gxc gxcVar = v80Var.b;
        return bzf.J(str, lwk.TRACK, gxcVar.a, gxcVar.b, v80Var.a, mqsVar.c, q.b, mqsVar.x0.a.getUri(), ngg.P(powVar));
    }

    public static final void r(sgt sgtVar, nlu nluVar, glu gluVar, hoq hoqVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        nlu nluVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-562712840);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(sgtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(nluVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(gluVar) : oq5Var2.h(gluVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(hoqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i3 = i2;
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            boolean h = oq5Var2.h(nluVar);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                lgq lgqVar = new lgq(1, nluVar, nlu.class, "onEntitySelect", "onEntitySelect(Lcom/yandex/music/shared/skeleton/blocks/ui/logic/api/waveagents/WaveAgentEntityWithUi;)V", 0, 21);
                nluVar2 = nluVar;
                oq5Var2.k0(lgqVar);
                K = lgqVar;
            } else {
                nluVar2 = nluVar;
            }
            vci vciVar = vci.a;
            z(sgtVar, (Function1) ((h9f) K), gluVar, androidx.compose.ui.platform.a.a(vciVar, "waves_agents_block_tabs"), oq5Var2, (i3 & 14) | 3584 | (i3 & 896));
            u1g.l(oq5Var2, d.e(vciVar, 16));
            tt0.g(gluVar, null, null, "wavesContentCrossfade", ild.C(-817838034, new wlu(nluVar2, hoqVar, 1), oq5Var2), oq5Var2, ((i3 >> 6) & 14) | 27656, 6);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 27, sgtVar, nluVar, gluVar, hoqVar, yciVar);
        }
    }

    public static final iow r0(r3q r3qVar) {
        r3qVar.getClass();
        if (r3qVar instanceof j3q) {
            int ordinal = ((j3q) r3qVar).c.ordinal();
            if (ordinal == 0) {
                return iow.a;
            }
            if (ordinal == 1) {
                return iow.e;
            }
            b6e.s();
            return null;
        }
        if (r3qVar instanceof l3q) {
            int ordinal2 = ((l3q) r3qVar).c.ordinal();
            if (ordinal2 == 0) {
                return iow.a;
            }
            if (ordinal2 == 1) {
                return iow.g;
            }
            if (ordinal2 == 2) {
                return iow.h;
            }
            if (ordinal2 == 3) {
                return iow.e;
            }
            b6e.s();
            return null;
        }
        if (r3qVar instanceof p3q) {
            int ordinal3 = ((p3q) r3qVar).b.ordinal();
            if (ordinal3 == 0) {
                return iow.e;
            }
            if (ordinal3 == 1) {
                return iow.a;
            }
            b6e.s();
            return null;
        }
        if (!(r3qVar instanceof m3q)) {
            b6e.s();
            return null;
        }
        tyt tytVar = ((m3q) r3qVar).b;
        if (tytVar instanceof qyt) {
            return iow.d;
        }
        if (Intrinsics.d(tytVar, syt.a)) {
            return iow.b;
        }
        if (Intrinsics.d(tytVar, cyt.a)) {
            return iow.c;
        }
        if (Intrinsics.d(tytVar, ryt.a)) {
            return iow.a;
        }
        if (Intrinsics.d(tytVar, dyt.a)) {
            return iow.e;
        }
        if (Intrinsics.d(tytVar, eyt.a)) {
            return iow.f;
        }
        b6e.s();
        return null;
    }

    public static final void s(nlu nluVar, hoq hoqVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        nluVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2052604117);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(nluVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(hoqVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            d8t e = i8t.e(gld.M(nluVar.c, oq5Var).getValue(), "wavesAgentsCrossfade", oq5Var, 48, 0);
            act S = weo.S(0, 0, null, 7);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new d4u(29);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            tt0.f(e, vciVar, S, (Function1) K, ild.C(-919993930, new wlu(nluVar, hoqVar, 0), oq5Var), oq5Var, ((i3 >> 3) & 112) | 28032, 0);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(nluVar, hoqVar, yciVar2, i, 21);
        }
    }

    public static String s0(cmx cmxVar) {
        StringBuilder sb = new StringBuilder(cmxVar.n());
        for (int i = 0; i < cmxVar.n(); i++) {
            byte a = cmxVar.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[LOOP:0: B:37:0x009c->B:38:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(boolean z, yci yciVar, int i, boolean z2, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        oq5 oq5Var;
        int i9;
        yci yciVar3;
        boolean z4;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1561984234);
        int i10 = (i2 & 6) == 0 ? (oq5Var2.g(z) ? 4 : 2) | i2 : i2;
        int i11 = i3 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i10 |= oq5Var2.f(yciVar2) ? 32 : 16;
            i4 = i3 & 4;
            if (i4 == 0) {
                i10 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 = i;
                i10 |= oq5Var2.d(i5) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i10 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i10 |= oq5Var2.g(z3) ? 2048 : 1024;
                    if ((i10 & 1171) == 1170 || !oq5Var2.z()) {
                        yci yciVar4 = i11 == 0 ? vci.a : yciVar2;
                        i7 = i4 == 0 ? 3 : i5;
                        boolean z5 = i6 == 0 ? true : z3;
                        ArrayList arrayList = new ArrayList(i7);
                        for (i8 = 0; i8 < i7; i8++) {
                            arrayList.add(Integer.valueOf(i8));
                        }
                        oq5Var = oq5Var2;
                        yci yciVar5 = yciVar4;
                        hld.l(arrayList, yciVar5, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 2, z5, false, false, ild.C(1084660349, new jn1(3, z), oq5Var2), oq5Var, (i10 & 112) | 100663296 | ((i10 << 18) & 1879048192), 432, 1276);
                        i9 = i7;
                        yciVar3 = yciVar5;
                        z4 = z5;
                    } else {
                        oq5Var2.S();
                        oq5Var = oq5Var2;
                        yciVar3 = yciVar2;
                        i9 = i5;
                        z4 = z3;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new vlu(z, yciVar3, i9, z4, i2, i3, 0);
                        return;
                    }
                    return;
                }
                z3 = z2;
                if ((i10 & 1171) == 1170) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if (i6 == 0) {
                }
                ArrayList arrayList2 = new ArrayList(i7);
                while (i8 < i7) {
                }
                oq5Var = oq5Var2;
                yci yciVar52 = yciVar4;
                hld.l(arrayList2, yciVar52, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 2, z5, false, false, ild.C(1084660349, new jn1(3, z), oq5Var2), oq5Var, (i10 & 112) | 100663296 | ((i10 << 18) & 1879048192), 432, 1276);
                i9 = i7;
                yciVar3 = yciVar52;
                z4 = z5;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            i5 = i;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z3 = z2;
            if ((i10 & 1171) == 1170) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if (i6 == 0) {
            }
            ArrayList arrayList22 = new ArrayList(i7);
            while (i8 < i7) {
            }
            oq5Var = oq5Var2;
            yci yciVar522 = yciVar4;
            hld.l(arrayList22, yciVar522, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 2, z5, false, false, ild.C(1084660349, new jn1(3, z), oq5Var2), oq5Var, (i10 & 112) | 100663296 | ((i10 << 18) & 1879048192), 432, 1276);
            i9 = i7;
            yciVar3 = yciVar522;
            z4 = z5;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i3 & 4;
        if (i4 == 0) {
        }
        i5 = i;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z3 = z2;
        if ((i10 & 1171) == 1170) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if (i6 == 0) {
        }
        ArrayList arrayList222 = new ArrayList(i7);
        while (i8 < i7) {
        }
        oq5Var = oq5Var2;
        yci yciVar5222 = yciVar4;
        hld.l(arrayList222, yciVar5222, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 2, z5, false, false, ild.C(1084660349, new jn1(3, z), oq5Var2), oq5Var, (i10 & 112) | 100663296 | ((i10 << 18) & 1879048192), 432, 1276);
        i9 = i7;
        yciVar3 = yciVar5222;
        z4 = z5;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void u(String str, boolean z, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1707194928);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            yci x = d.x(vciVar, null, 3);
            nho a = lho.a(qx0.g(4), b2c.l, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, x);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            l((i3 >> 3) & 126, 12, oq5Var, null, null, function0, z);
            a(((i3 >> 6) & 112) | (i3 & 14), oq5Var, null, str, function02);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(str, z, function0, function02, yciVar2, i, 8);
        }
    }

    public static final void v(jlf jlfVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(527233754);
        int i2 = i | (oq5Var.h(jlfVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ff7.Q(24, oq5Var);
            agr agrVar = yre.a;
            yci o = androidx.compose.foundation.layout.a.o(d.z(yciVar.f(MinimumInteractiveModifier.a), 3), 56, 0.0f, 2);
            kfh d = ug3.d(b2c.b, false);
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
            ov6 ov6Var = yvt.a;
            y1g.u(jlfVar, !(jlfVar instanceof hlf), null, c.e(weo.S(0, 0, ov6Var, 3), 2).a(e9b.b), c.f(weo.S(0, 0, ov6Var, 3), 2), ild.C(1133357970, new i5v(function0, function02, 1), oq5Var), oq5Var, (i2 & 14) | 221184);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 10, jlfVar, function0, function02, yciVar);
        }
    }

    public static final void w(jlf jlfVar, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1080142338);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(jlfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else if (jlfVar instanceof ilf) {
            oq5Var.Z(625841682);
            l(i2 & 112, 4, oq5Var, null, rvf.M(R.string.rup_block_settings_button, oq5Var), function0, ((ilf) jlfVar).a);
            oq5Var.p(false);
        } else if (jlfVar instanceof glf) {
            oq5Var.Z(-1365277050);
            a((i2 >> 3) & 112, oq5Var, null, ((glf) jlfVar).a, function02);
            oq5Var.p(false);
        } else if (jlfVar instanceof flf) {
            oq5Var.Z(-1365272187);
            flf flfVar = (flf) jlfVar;
            u(flfVar.a, flfVar.b, function0, function02, null, oq5Var, (i2 << 3) & 8064);
            oq5Var = oq5Var;
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(jlfVar, hlf.a)) {
                throw vz1.i(oq5Var, -1365293772, false);
            }
            oq5Var.Z(-1365261786);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(jlfVar, function0, function02, i, 27);
        }
    }

    public static final void x(glu gluVar, nlu nluVar, hoq hoqVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1727021129);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(gluVar) : oq5Var2.h(gluVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(nluVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(hoqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 2048 : 1024;
        } else {
            yciVar2 = yciVar;
        }
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            ArrayList arrayList = gluVar.b.c;
            q0k a = androidx.compose.foundation.layout.a.a(8, 0.0f, 2);
            boolean z = false;
            float f = 0;
            float f2 = 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && oq5Var2.h(gluVar))) {
                z = true;
            }
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new f5r(17, gluVar);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            up6.i(arrayList, yciVar2, (Function2) K, a, f, f2, 0.0f, null, null, null, false, 0, ild.C(163743205, new jv(23, nluVar, hoqVar), oq5Var2), oq5Var, 224264 | ((i2 >> 6) & 112), 384, 4032);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 14, gluVar, nluVar, hoqVar, yciVar);
        }
    }

    public static final void y(int i, hq5 hq5Var, yci yciVar, String str, boolean z) {
        String str2;
        int i2;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1660566701);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (oq5Var2.f(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            ArrayList arrayList = new ArrayList(3);
            for (int i4 = 0; i4 < 3; i4++) {
                arrayList.add(Integer.valueOf(i4));
            }
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new d4u(28);
                oq5Var2.k0(K);
            }
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            ngg.h(str2, arrayList, 0, (Function1) K, ild.C(1672328547, new jn1(4, z), oq5Var2), vciVar, 0L, 0L, false, null, 0.0f, 40, null, oq5Var, (i3 & 14) | 100691328 | ((i3 << 9) & 458752), 384, 11968);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ihe(str, z, yciVar2, i, 2);
        }
    }

    public static final void z(sgt sgtVar, Function1 function1, glu gluVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1281752389);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(sgtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(gluVar) : oq5Var2.h(gluVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            String str = sgtVar.a;
            List list = sgtVar.b;
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new k32(7, function1);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            ngg.h(str, list, gluVar, (Function1) K, yd5.d, yciVar, 0L, 0L, false, null, 0.0f, 40, null, oq5Var, (i2 & 896) | 25152 | ((i2 << 6) & 458752), 384, 12224);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 15, sgtVar, function1, gluVar, yciVar);
        }
    }
}
