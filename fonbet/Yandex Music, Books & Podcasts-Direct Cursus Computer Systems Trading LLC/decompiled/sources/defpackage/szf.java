package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Base64;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.player.download2.GetFileInfoException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.player.download2.InternalTrackContentSourcesException;
import com.yandex.music.shared.player.download2.TrackContentSourceException;
import com.yandex.music.shared.relay.common.proto.h;
import com.yandex.music.shared.relay.common.proto.i;
import com.yandex.music.shared.relay.common.proto.j;
import com.yandex.music.widget.WidgetActionCallback;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class szf implements p33 {
    public static final void A(boolean z, float f, ukd ukdVar, plv plvVar, boolean z2, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1595727029);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(ukdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            nkv nkvVar = z ? nkv.l : nkv.j;
            int i3 = z ? R.string.accessibility_checked : R.string.accessibility_not_checked;
            agr agrVar = cs5.b;
            String string = ((Context) oq5Var.j(agrVar)).getResources().getString(i3);
            string.getClass();
            String string2 = ((Context) oq5Var.j(agrVar)).getResources().getString(R.string.menu_element_dislike);
            string2.getClass();
            z(f, ouj.o(string, StringUtil.SPACE, string2), ukdVar, Integer.valueOf(R.drawable.ic_dislike_24), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkvVar)}, 1))), 0.0f, z2, plvVar, oq5Var, ((i2 >> 3) & 14) | (i2 & 896) | (3670016 & (i2 << 6)) | ((i2 << 12) & 29360128), 32);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hlv(z, f, ukdVar, plvVar, z2, i, 1);
        }
    }

    public static final void B(ukd ukdVar, plv plvVar, hq5 hq5Var, int i) {
        int i2;
        ukd ukdVar2;
        plv plvVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(107342199);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ukdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            ukdVar2 = ukdVar;
            plvVar2 = plvVar;
            z(0, null, ukdVar2, null, null, 0.0f, false, plvVar2, oq5Var, ((i2 << 6) & 896) | 54 | ((i2 << 18) & 29360128), 120);
        } else {
            ukdVar2 = ukdVar;
            plvVar2 = plvVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new npu(ukdVar2, plvVar2, i, 7);
        }
    }

    public static final void C(boolean z, float f, ukd ukdVar, plv plvVar, boolean z2, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-638123873);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(ukdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = z ? R.drawable.ic_like_active_24 : R.drawable.ic_like_unactive_24;
            nkv nkvVar = z ? nkv.k : nkv.i;
            int i4 = z ? R.string.accessibility_checked : R.string.accessibility_not_checked;
            agr agrVar = cs5.b;
            String string = ((Context) oq5Var.j(agrVar)).getResources().getString(i4);
            string.getClass();
            String string2 = ((Context) oq5Var.j(agrVar)).getResources().getString(R.string.menu_element_like);
            string2.getClass();
            z(f, ouj.o(string, StringUtil.SPACE, string2), ukdVar, Integer.valueOf(i3), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkvVar)}, 1))), 0.0f, z2, plvVar, oq5Var, ((i2 >> 3) & 14) | (i2 & 896) | (3670016 & (i2 << 6)) | ((i2 << 12) & 29360128), 32);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hlv(z, f, ukdVar, plvVar, z2, i, 0);
        }
    }

    public static final void D(float f, int i, hq5 hq5Var, ukd ukdVar, plv plvVar) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1915222014);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(ukdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            String string = ((Context) oq5Var.j(cs5.b)).getResources().getString(R.string.processing);
            string.getClass();
            boolean f2 = oq5Var.f(string);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new srp(string, 21);
                oq5Var.k0(K);
            }
            vq2.c(zdg.E(ukdVar, (Function1) K), f40.f, ild.C(-1832307616, new ze4(f, plvVar, 5), oq5Var), oq5Var, 384, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new glv(f, ukdVar, plvVar, i, 1);
        }
    }

    public static final void E(float f, int i, hq5 hq5Var, ukd ukdVar, plv plvVar) {
        int i2;
        ukd ukdVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-813780220);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ukdVar2 = ukdVar;
            i2 |= oq5Var.f(ukdVar2) ? 32 : 16;
        } else {
            ukdVar2 = ukdVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            String string = ((Context) oq5Var.j(cs5.b)).getResources().getString(R.string.pause);
            string.getClass();
            z(f, string, ukdVar2, Integer.valueOf(R.drawable.ic_pause_mid_24), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.d)}, 1))), 0.0f, false, plvVar, oq5Var, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 15) & 29360128), 96);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new glv(f, ukdVar, plvVar, i, 4);
        }
    }

    public static final void F(float f, int i, hq5 hq5Var, ukd ukdVar, plv plvVar) {
        int i2;
        ukd ukdVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1485963998);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ukdVar2 = ukdVar;
            i2 |= oq5Var.f(ukdVar2) ? 32 : 16;
        } else {
            ukdVar2 = ukdVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            String string = ((Context) oq5Var.j(cs5.b)).getResources().getString(R.string.listen);
            string.getClass();
            z(f, string, ukdVar2, Integer.valueOf(R.drawable.ic_play_mid_24), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.c)}, 1))), 1, false, plvVar, oq5Var, (i2 & 14) | 196608 | ((i2 << 3) & 896) | ((i2 << 15) & 29360128), 64);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new glv(f, ukdVar, plvVar, i, 0);
        }
    }

    public static final void G(float f, int i, hq5 hq5Var, ukd ukdVar, plv plvVar) {
        int i2;
        ukd ukdVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2011510593);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ukdVar2 = ukdVar;
            i2 |= oq5Var.f(ukdVar2) ? 32 : 16;
        } else {
            ukdVar2 = ukdVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            String string = ((Context) oq5Var.j(cs5.b)).getResources().getString(R.string.player_previous_description);
            string.getClass();
            z(f, string, ukdVar2, Integer.valueOf(R.drawable.ic_backward_medium_24), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.f)}, 1))), 0.0f, false, plvVar, oq5Var, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 15) & 29360128), 96);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new glv(f, ukdVar, plvVar, i, 2);
        }
    }

    public static final void H(float f, int i, hq5 hq5Var, ukd ukdVar, plv plvVar) {
        int i2;
        ukd ukdVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1706156357);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ukdVar2 = ukdVar;
            i2 |= oq5Var.f(ukdVar2) ? 32 : 16;
        } else {
            ukdVar2 = ukdVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            String string = ((Context) oq5Var.j(cs5.b)).getResources().getString(R.string.player_seek_backward_description, Arrays.copyOf(new Object[]{15}, 1));
            string.getClass();
            z(f, string, ukdVar2, Integer.valueOf(R.drawable.ic_seek_15_medium_24), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.h)}, 1))), 0.0f, false, plvVar, oq5Var, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 15) & 29360128), 96);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new glv(f, ukdVar, plvVar, i, 5);
        }
    }

    public static final void I(float f, int i, hq5 hq5Var, ukd ukdVar, plv plvVar) {
        int i2;
        ukd ukdVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1922341075);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ukdVar2 = ukdVar;
            i2 |= oq5Var.f(ukdVar2) ? 32 : 16;
        } else {
            ukdVar2 = ukdVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            String string = ((Context) oq5Var.j(cs5.b)).getResources().getString(R.string.player_seek_forward_description, Arrays.copyOf(new Object[]{30}, 1));
            string.getClass();
            z(f, string, ukdVar2, Integer.valueOf(R.drawable.ic_seek_30_medium_24), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.g)}, 1))), 0.0f, false, plvVar, oq5Var, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 15) & 29360128), 96);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new glv(f, ukdVar, plvVar, i, 3);
        }
    }

    public static final void J(final float f, final ukd ukdVar, final plv plvVar, final boolean z, hq5 hq5Var, final int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-412864365);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(ukdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(plvVar) : oq5Var.h(plvVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            String string = ((Context) oq5Var.j(cs5.b)).getResources().getString(R.string.player_skip_description);
            string.getClass();
            z(f, string, ukdVar, Integer.valueOf(R.drawable.ic_forward_medium_24), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.e)}, 1))), 0.0f, z, plvVar, oq5Var, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 3670016) | ((i2 << 15) & 29360128), 32);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: ilv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    szf.J(f, ukdVar, plvVar, z, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final ynn K(jx7 jx7Var, int i, l7t l7tVar, cds cdsVar, boolean z, int i2) {
        ynn b = cdsVar != null ? cdsVar.b.b(l7tVar.b.d(i)) : ynn.e;
        float f = b.a;
        int L = jx7Var.L(ras.a);
        return ynn.b(b, z ? (i2 - f) - L : f, z ? i2 - f : L + f, 0.0f, 10);
    }

    public static final thj L(mqs mqsVar, int i) {
        mqsVar.getClass();
        return M(mqsVar, 0, i);
    }

    public static final thj M(mqs mqsVar, int i, int i2) {
        mqsVar.getClass();
        pkb pkbVar = a4g.H(mqsVar) ? pkb.PodcastEpisode : a4g.D(gys.AudioBookHolder, mqsVar) ? pkb.AudiobookChapter : pkb.Track;
        String str = mqsVar.a;
        str.getClass();
        return new thj(pkbVar, str, i + 1, i2 + 1, "");
    }

    public static final thj N(mqs mqsVar, spd spdVar) {
        mqsVar.getClass();
        spdVar.getClass();
        return M(mqsVar, spdVar.a, spdVar.b);
    }

    public static final mhp O(mhp mhpVar, uhp uhpVar) {
        mhp O;
        t9f b;
        mhpVar.getClass();
        uhpVar.getClass();
        if (!Intrinsics.d(mhpVar.a(), shp.b)) {
            return mhpVar.isInline() ? O(mhpVar.h(0), uhpVar) : mhpVar;
        }
        f9f u = q6k.u(mhpVar);
        mhp mhpVar2 = null;
        if (u != null && (b = uhpVar.b(u, c5b.a)) != null) {
            mhpVar2 = b.getDescriptor();
        }
        return (mhpVar2 == null || (O = O(mhpVar2, uhpVar)) == null) ? mhpVar : O;
    }

    public static final aqi P(pjc pjcVar, Object obj, CoroutineContext coroutineContext, hq5 hq5Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            coroutineContext = g.a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        oq5 oq5Var = (oq5) hq5Var;
        boolean h = oq5Var.h(coroutineContext2) | oq5Var.h(pjcVar);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new fpq(coroutineContext2, pjcVar, (Continuation) null, 7);
            oq5Var.k0(K);
        }
        return k0(obj, pjcVar, coroutineContext2, (Function2) K, oq5Var, ((i >> 3) & 14) | (i & 896));
    }

    public static final aqi Q(vdr vdrVar, hq5 hq5Var) {
        return P(vdrVar, vdrVar.getValue(), g.a, hq5Var, 0, 0);
    }

    public static final void R(y yVar, qvg qvgVar, Object obj) {
        a l = su4.l(yVar, yVar);
        tvg tvgVar = new tvg();
        tvgVar.setArguments(cxb.K(new Pair("long_tap_args", qvgVar), new Pair("long_tap_playback_scope", obj)));
        l.d(0, tvgVar, "LONG_TAP_DIALOG_TAG", 1);
        l.k(true, true);
    }

    public static final eqi S() {
        sfm sfmVar = o2r.b;
        eqi eqiVar = (eqi) sfmVar.s();
        if (eqiVar != null) {
            return eqiVar;
        }
        eqi eqiVar2 = new eqi(new nq5[0]);
        sfmVar.J(eqiVar2);
        return eqiVar2;
    }

    public static final zx7 T(n2r n2rVar, Function0 function0) {
        sfm sfmVar = o2r.a;
        return new zx7(n2rVar, function0);
    }

    public static final zx7 U(Function0 function0) {
        sfm sfmVar = o2r.a;
        return new zx7(null, function0);
    }

    public static final void V(ejm ejmVar, zvs zvsVar, InternalDownloadException internalDownloadException) {
        String str;
        String str2;
        ejmVar.getClass();
        zvsVar.getClass();
        if (!(internalDownloadException instanceof InternalTrackContentSourcesException)) {
            str = "";
        } else if (internalDownloadException instanceof GetFileInfoException) {
            str = "GFI\\";
        } else {
            if (!(internalDownloadException instanceof TrackContentSourceException)) {
                b6e.s();
                return;
            }
            str = "TCS\\";
        }
        if (internalDownloadException instanceof pte) {
            str2 = hrg.q("CacheOnly(", internalDownloadException.getMessage(), ")");
        } else if ((internalDownloadException instanceof rte) || (internalDownloadException instanceof qte)) {
            str2 = "Corrupted";
        } else if (internalDownloadException instanceof vte) {
            str2 = "Renderer";
        } else if (internalDownloadException instanceof tte) {
            str2 = "Offline";
        } else if (internalDownloadException instanceof yte) {
            str2 = "SocketTimeout";
        } else if (internalDownloadException instanceof wte) {
            str2 = "BadResp";
        } else if (internalDownloadException instanceof bue) {
            str2 = dfi.c(((bue) internalDownloadException).a, "BadRespStreamLinkExpired(", ")");
        } else if (internalDownloadException instanceof xte) {
            str2 = dfi.c(((xte) internalDownloadException).a, "BadRespCode(", ")");
        } else if (internalDownloadException instanceof due) {
            str2 = "NetworkFail";
        } else if (internalDownloadException instanceof ute) {
            str2 = "NoSpace";
        } else if (internalDownloadException instanceof eue) {
            str2 = "StorageFail";
        } else if (internalDownloadException instanceof cue) {
            str2 = "IO";
        } else if (internalDownloadException instanceof ats) {
            str2 = "IllegalState";
        } else {
            if (!(internalDownloadException instanceof aue)) {
                b6e.s();
                return;
            }
            str2 = "NoStorage";
        }
        ejmVar.r(zvsVar, str.concat(str2), internalDownloadException);
    }

    public static final void W(ejm ejmVar, zvs zvsVar, InternalDownloadException internalDownloadException) {
        String str;
        String str2;
        ejmVar.getClass();
        zvsVar.getClass();
        if (!(internalDownloadException instanceof InternalTrackContentSourcesException)) {
            str = "";
        } else if (internalDownloadException instanceof GetFileInfoException) {
            str = "GFI\\";
        } else {
            if (!(internalDownloadException instanceof TrackContentSourceException)) {
                b6e.s();
                return;
            }
            str = "TCS\\";
        }
        if (internalDownloadException instanceof pte) {
            str2 = hrg.q("CacheOnly(", internalDownloadException.getMessage(), ")");
        } else if ((internalDownloadException instanceof rte) || (internalDownloadException instanceof qte)) {
            str2 = "Corrupted";
        } else if (internalDownloadException instanceof vte) {
            str2 = "Renderer";
        } else if (internalDownloadException instanceof tte) {
            str2 = "Offline";
        } else if (internalDownloadException instanceof yte) {
            str2 = "SocketTimeout";
        } else if (internalDownloadException instanceof wte) {
            str2 = "BadResp";
        } else if (internalDownloadException instanceof bue) {
            str2 = dfi.c(((bue) internalDownloadException).a, "BadRespStreamLinkExpired(", ")");
        } else if (internalDownloadException instanceof xte) {
            str2 = dfi.c(((xte) internalDownloadException).a, "BadRespCode(", ")");
        } else if (internalDownloadException instanceof due) {
            str2 = "NetworkFail";
        } else if (internalDownloadException instanceof ute) {
            str2 = "NoSpace";
        } else if (internalDownloadException instanceof eue) {
            str2 = "StorageFail";
        } else if (internalDownloadException instanceof cue) {
            str2 = "IO";
        } else if (internalDownloadException instanceof ats) {
            str2 = "IllegalState";
        } else {
            if (!(internalDownloadException instanceof aue)) {
                b6e.s();
                return;
            }
            str2 = "NoStorage";
        }
        ejmVar.a(zvsVar, str.concat(str2), internalDownloadException);
    }

    public static final Rect X(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        mi.t(textPaint2, charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            mi.t(textPaint, charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static float Y(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final float Z(hq5 hq5Var) {
        return w1g.p(nu0.j(), 0, hq5Var, 0, 2) + w1g.p(nu0.b(), 0, hq5Var, 0, 2);
    }

    public static final void a(Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        Function0 function03;
        Function0 function04;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1528759679);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.h(function02) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            function03 = function0;
            function04 = function02;
            wyf.c(null, function03, function04, null, null, oq5Var, (i2 << 6) & 8064, 51);
            Unit unit = Unit.a;
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new ex(20, function04);
                oq5Var.k0(K);
            }
            gld.k(unit, (Function1) K, oq5Var);
        } else {
            function03 = function0;
            function04 = function02;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new w7a(function03, function04, i, 3);
        }
    }

    public static int[] a0(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        if ((r28 & 32) != 0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, Function0 function0, yci yciVar, yci yciVar2, long j, long j2, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar3;
        int i4;
        yci yciVar4;
        long j3;
        long j4;
        oq5 oq5Var;
        long j5;
        long j6;
        yci yciVar5;
        xmn r;
        int i5;
        int i6;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(456795117);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar3 = yciVar;
            i3 |= oq5Var2.f(yciVar3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                yciVar4 = yciVar2;
                i3 |= oq5Var2.f(yciVar4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (oq5Var2.e(j3)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        j3 = j;
                    }
                    i6 = RemoteCameraConfig.Notification.ID;
                    i3 |= i6;
                } else {
                    j3 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (oq5Var2.e(j4)) {
                            i5 = SQLiteDatabase.OPEN_SHAREDCACHE;
                            i3 |= i5;
                        }
                    } else {
                        j4 = j2;
                    }
                    i5 = SQLiteDatabase.OPEN_FULLMUTEX;
                    i3 |= i5;
                } else {
                    j4 = j2;
                }
                if ((74899 & i3) == 74898 || !oq5Var2.z()) {
                    oq5Var2.U();
                    if ((i & 1) != 0 || oq5Var2.y()) {
                        vci vciVar = vci.a;
                        if (i7 != 0) {
                            yciVar3 = vciVar;
                        }
                        if (i4 != 0) {
                            yciVar4 = vciVar;
                        }
                        if ((i2 & 16) != 0) {
                            j3 = ((dq0) oq5Var2.j(eq0.a)).a.a;
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ((dq0) oq5Var2.j(eq0.a)).a.a;
                            i3 &= -458753;
                        }
                        yci yciVar6 = yciVar4;
                        long j7 = j4;
                        int i8 = i3;
                        yci yciVar7 = yciVar3;
                        long j8 = j3;
                        oq5Var2.q();
                        aae.a(function0, b.c(androidx.compose.ui.platform.a.a(ksw.D(yciVar7, rvf.M(R.string.menu_element_like, oq5Var2), rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var2)), "like_button"), "is_liked", Boolean.valueOf(z)), false, ild.C(103167953, new rl3(z, yciVar6, j8, j7, 1), oq5Var2), oq5Var2, ((i8 >> 3) & 14) | 24576, 12);
                        oq5Var = oq5Var2;
                        j5 = j7;
                        j6 = j8;
                        yciVar3 = yciVar7;
                        yciVar5 = yciVar6;
                    } else {
                        oq5Var2.S();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                } else {
                    oq5Var2.S();
                    yciVar5 = yciVar4;
                    j6 = j3;
                    oq5Var = oq5Var2;
                    j5 = j4;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new sl3(z, function0, yciVar3, yciVar5, j6, j5, i, i2, 1);
                    return;
                }
                return;
            }
            yciVar4 = yciVar2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            oq5Var2.U();
            if ((i & 1) != 0) {
            }
            vci vciVar2 = vci.a;
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            yci yciVar62 = yciVar4;
            long j72 = j4;
            int i82 = i3;
            yci yciVar72 = yciVar3;
            long j82 = j3;
            oq5Var2.q();
            aae.a(function0, b.c(androidx.compose.ui.platform.a.a(ksw.D(yciVar72, rvf.M(R.string.menu_element_like, oq5Var2), rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var2)), "like_button"), "is_liked", Boolean.valueOf(z)), false, ild.C(103167953, new rl3(z, yciVar62, j82, j72, 1), oq5Var2), oq5Var2, ((i82 >> 3) & 14) | 24576, 12);
            oq5Var = oq5Var2;
            j5 = j72;
            j6 = j82;
            yciVar3 = yciVar72;
            yciVar5 = yciVar62;
            r = oq5Var.r();
            if (r != null) {
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
        if ((74899 & i3) == 74898) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        vci vciVar22 = vci.a;
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        yci yciVar622 = yciVar4;
        long j722 = j4;
        int i822 = i3;
        yci yciVar722 = yciVar3;
        long j822 = j3;
        oq5Var2.q();
        aae.a(function0, b.c(androidx.compose.ui.platform.a.a(ksw.D(yciVar722, rvf.M(R.string.menu_element_like, oq5Var2), rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var2)), "like_button"), "is_liked", Boolean.valueOf(z)), false, ild.C(103167953, new rl3(z, yciVar622, j822, j722, 1), oq5Var2), oq5Var2, ((i822 >> 3) & 14) | 24576, 12);
        oq5Var = oq5Var2;
        j5 = j722;
        j6 = j822;
        yciVar3 = yciVar722;
        yciVar5 = yciVar622;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final boolean b0(wxk wxkVar) {
        wxkVar.getClass();
        if (wxkVar instanceof pxk) {
            return true;
        }
        if ((wxkVar instanceof sxk) || (wxkVar instanceof uxk) || (wxkVar instanceof oxk) || (wxkVar instanceof txk)) {
            return false;
        }
        b6e.s();
        return false;
    }

    public static final void c(a9j a9jVar, bci bciVar, w8j w8jVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1103189054);
        int i2 = i | (oq5Var.f(a9jVar) ? 4 : 2) | (oq5Var.h(bciVar) ? 32 : 16) | (oq5Var.h(w8jVar) ? 256 : 128);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = a9jVar instanceof z8j;
            boolean h = ((i2 & 14) == 4) | oq5Var.h(w8jVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new avi(2, a9jVar, w8jVar);
                oq5Var.k0(K);
            }
            vq1.g(yciVar, bciVar, z, (Function1) K, oq5Var, 70 | (i2 & 112), 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(a9jVar, bciVar, w8jVar, yciVar, i, 21);
        }
    }

    public static boolean c0(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final boolean d0(wxk wxkVar) {
        wxkVar.getClass();
        if (wxkVar instanceof uxk) {
            return true;
        }
        if ((wxkVar instanceof pxk) || (wxkVar instanceof sxk) || (wxkVar instanceof oxk) || (wxkVar instanceof txk)) {
            return false;
        }
        b6e.s();
        return false;
    }

    public static final void e(o3k o3kVar, yoc yocVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1000189790);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(o3kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yocVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = U(new s25(o3kVar, 3));
                oq5Var.k0(K2);
            }
            String M = rvf.M(R.string.next, oq5Var);
            Boolean bool = (Boolean) ((sdr) K2).getValue();
            bool.getClass();
            yci m = d.m(vci.a, 52);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new hpj(5);
                oq5Var.k0(K3);
            }
            androidx.compose.animation.a.b(bool, m, (Function1) K3, b2c.i, "onboarding button animation", null, ild.C(976294305, new k71(function0, M, mm6Var, o3kVar, yocVar, 5), oq5Var), oq5Var, 1600944, 32);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(o3kVar, yocVar, (Object) function0, i, 1);
        }
    }

    public static final void f(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(672584875);
        if (oq5Var.P(i & 1, i != 0)) {
            gae.b(a0g.E(R.drawable.ic_arrow_android_back_24, 0, oq5Var), null, gdg.L(d.m(vci.a, 24), -1.0f, 1.0f), 0L, oq5Var, 48, 8);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d6h(i, 9);
        }
    }

    public static boolean f0(n7q n7qVar, nvl nvlVar, o3q o3qVar, Function0 function0, String str, int i) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        n7qVar.getClass();
        return ((Boolean) wdg.A(n7qVar, new xdh(nvlVar, o3qVar, function0, str))).booleanValue();
    }

    public static final void g(o3k o3kVar, yoc yocVar, orj orjVar, hq5 hq5Var, int i) {
        int i2;
        float f;
        float f2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1273633660);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(o3kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yocVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(orjVar) : oq5Var.h(orjVar) ? 256 : 128;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            yci q = androidx.compose.foundation.layout.a.q(d.d(vci.a, 1.0f), 0.0f, 42, 0.0f, 50, 5);
            nho a = lho.a(qx0.e, b2c.l, oq5Var, 54);
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
                f2 = Float.MAX_VALUE;
            } else {
                f = 1.0f;
                f2 = Float.MAX_VALUE;
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, f));
            i(o3kVar, oq5Var, i3 & 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci q2 = androidx.compose.foundation.layout.a.q(new LayoutWeightElement(true, 1.0f > f2 ? f2 : 1.0f), ((prj) oq5Var.j(qrj.a)).d, 0.0f, 0.0f, 0.0f, 14);
            kfh d = ug3.d(b2c.e, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            boolean z = (i3 & 896) == 256 || ((i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(orjVar));
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                m9j m9jVar = new m9j(0, orjVar, orj.class, "finishOnboarding", "finishOnboarding()V", 0, 29);
                oq5Var.k0(m9jVar);
                K = m9jVar;
            }
            e(o3kVar, yocVar, (Function0) ((h9f) K), oq5Var, i3 & 126);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(o3kVar, yocVar, (Object) orjVar, i, 2);
        }
    }

    public static x6k g0(Object obj) {
        return new x6k(obj, ehv.h);
    }

    public static final void h(String[] strArr, o3k o3kVar, orj orjVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        o3k o3kVar2 = o3kVar;
        strArr.getClass();
        o3kVar2.getClass();
        orjVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(178139848);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(strArr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(o3kVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(orjVar) : oq5Var2.h(orjVar) ? 256 : 128;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            kfh d = ug3.d(b2c.i, false);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            yci d2 = d.d(d.b(vciVar, ((prj) oq5Var2.j(qrj.a)).b), 1.0f);
            int i5 = crj.d;
            oq5Var = oq5Var2;
            u1g.l(oq5Var, androidx.compose.foundation.a.a(d2, y9w.U((Pair[]) Arrays.copyOf(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(c3x.f(0))), new Pair(Float.valueOf(0.07f), new d85(c3x.f(50331648))), new Pair(Float.valueOf(0.14f), new d85(c3x.f(167772160))), new Pair(Float.valueOf(0.2f), new d85(c3x.f(335544320))), new Pair(Float.valueOf(0.36f), new d85(c3x.f(637534208))), new Pair(Float.valueOf(0.39f), new d85(c3x.f(989855744))), new Pair(Float.valueOf(0.42f), new d85(c3x.f(1409286144))), new Pair(Float.valueOf(0.46f), new d85(c3x.f(1879048192))), new Pair(Float.valueOf(0.49f), new d85(c3x.h(2399141888L))), new Pair(Float.valueOf(0.52f), new d85(c3x.h(2868903936L))), new Pair(Float.valueOf(0.54f), new d85(c3x.h(3288334336L))), new Pair(Float.valueOf(0.57f), new d85(c3x.h(3640655872L))), new Pair(Float.valueOf(0.64f), new d85(c3x.h(3942645760L))), new Pair(Float.valueOf(0.87f), new d85(c3x.h(4110417920L))), new Pair(Float.valueOf(0.93f), new d85(c3x.h(4227858432L))), new Pair(Float.valueOf(1.0f), new d85(c3x.h(4278190080L)))}, 16), 14)));
            yci c2 = d.c(vciVar, 1.0f);
            ta5 a = sa5.a(qx0.d, b2c.o, oq5Var, 54);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, c2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new yoc();
                oq5Var.k0(K);
            }
            yoc yocVar = (yoc) K;
            if (!(((double) 1.0f) > 0.0d)) {
                qme.a("invalid weight; must be greater than zero");
            }
            o3kVar2 = o3kVar;
            j(strArr, o3kVar2, yocVar, new LayoutWeightElement(true, 1.0f), oq5Var, (i3 & 14) | 384 | (i3 & 112));
            g(o3kVar2, yocVar, orjVar, oq5Var, ((i3 >> 3) & 14) | 48 | (i3 & 896));
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(strArr, o3kVar2, orjVar, i, 0);
        }
    }

    public static u2i h0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = dvt.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                vq1.n0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new d7k(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    vq1.o0("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new kju(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new u2i(arrayList);
    }

    public static final void i(o3k o3kVar, hq5 hq5Var, int i) {
        int i2;
        o3k o3kVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1893662784);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(o3kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            float f = 10;
            float f2 = 34;
            long j = ((dq0) oq5Var.j(eq0.a)).a.a;
            yci r = d.r(d.e(vci.a, f), ((f + f) * (o3kVar.n() - 1)) + f2);
            boolean e = oq5Var.e(j) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (e || K == gq5.a) {
                o3kVar2 = o3kVar;
                frj frjVar = new frj(f, f2, f, o3kVar2, j);
                oq5Var.k0(frjVar);
                K = frjVar;
            } else {
                o3kVar2 = o3kVar;
            }
            ksw.j(0, oq5Var, r, (Function1) K);
        } else {
            o3kVar2 = o3kVar;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new i4(o3kVar2, i, 16);
        }
    }

    public static final aqi i0(hq5 hq5Var, Object obj, Function2 function2) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = g0(obj);
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        Unit unit = Unit.a;
        boolean h = oq5Var.h(function2);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new p2r(function2, aqiVar, null, 0);
            oq5Var.k0(K2);
        }
        gld.w(oq5Var, unit, (Function2) K2);
        return aqiVar;
    }

    public static final void j(String[] strArr, o3k o3kVar, yoc yocVar, LayoutWeightElement layoutWeightElement, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-560018823);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(strArr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(o3kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yocVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(layoutWeightElement) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            Integer valueOf = Integer.valueOf(o3kVar.j());
            yci c = d.c(layoutWeightElement, 1.0f);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new hpj(4);
                oq5Var.k0(K);
            }
            androidx.compose.animation.a.b(valueOf, c, (Function1) K, b2c.i, "onboarding text animation", null, ild.C(-826449553, new jv(15, strArr, yocVar), oq5Var), oq5Var, 1600896, 32);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 28, strArr, o3kVar, yocVar, layoutWeightElement);
        }
    }

    public static final aqi j0(Object obj, Object obj2, Object obj3, Object obj4, Function2 function2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = g0(obj);
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        boolean h = oq5Var.h(function2);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new p2r(function2, aqiVar, null, 3);
            oq5Var.k0(K2);
        }
        gld.x(obj2, obj3, obj4, (Function2) K2, oq5Var);
        return aqiVar;
    }

    public static final void k(int i, int i2, int i3, hq5 hq5Var, yci yciVar) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1091187683);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            pm0.a(null, ild.C(986435450, new jm0(yciVar, i, 10), oq5Var), oq5Var, 48, 1);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sy3(i, yciVar, i2, i3);
        }
    }

    public static final aqi k0(Object obj, Object obj2, Object obj3, Function2 function2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = g0(obj);
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        boolean h = oq5Var.h(function2);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new p2r(function2, aqiVar, null, 2);
            oq5Var.k0(K2);
        }
        gld.y(obj2, obj3, (Function2) K2, oq5Var);
        return aqiVar;
    }

    public static final j l(boolean z, i iVar, h hVar) {
        mtn mtnVar = (mtn) j.e.createBuilder();
        mtnVar.d();
        ((j) mtnVar.b).b = z;
        if (iVar != null) {
            mtnVar.d();
            j jVar = (j) mtnVar.b;
            jVar.getClass();
            jVar.c = iVar;
            jVar.a |= 1;
        }
        if (hVar != null) {
            mtnVar.d();
            j jVar2 = (j) mtnVar.b;
            jVar2.getClass();
            jVar2.d = hVar;
            jVar2.a |= 2;
        }
        return (j) mtnVar.b();
    }

    public static final aqi l0(Object obj, Object obj2, Function2 function2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = g0(obj);
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        boolean h = oq5Var.h(function2);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new p2r(function2, aqiVar, null, 1);
            oq5Var.k0(K2);
        }
        gld.w(oq5Var, obj2, (Function2) K2);
        return aqiVar;
    }

    public static final void m(az2 az2Var, w3g w3gVar, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        ges j;
        w3gVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(612220342);
        int i2 = (oq5Var2.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | i | (oq5Var2.f(az2Var) ? 4 : 2) | (oq5Var2.f(w3gVar) ? 32 : 16) | (oq5Var2.g(z) ? 256 : 128) | (oq5Var2.g(z2) ? 2048 : 1024) | (oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(function03) ? 1048576 : 524288);
        if (oq5Var2.P(i2 & 1, (4793491 & i2) != 4793490)) {
            kbj kbjVar = az2Var.a;
            if (z2) {
                oq5Var2.Z(-66756410);
                j = nu0.g();
            } else {
                oq5Var2.Z(-66755102);
                j = nu0.j();
            }
            oq5Var2.p(false);
            oq5Var = oq5Var2;
            p6g.d(kbjVar, function0, yciVar, 0L, w3gVar, j, true, ild.C(-2054455431, new qr(az2Var, w3gVar, function03, function02, z), oq5Var2), e9g.a, oq5Var, ((i2 >> 9) & 112) | 114819072 | ((i2 >> 15) & 896) | (57344 & (i2 << 9)), 8);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nzo(az2Var, w3gVar, z, z2, function0, function02, function03, yciVar, i);
        }
    }

    public static final aqi m0(Object obj, Object[] objArr, Function2 function2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = g0(obj);
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean h = oq5Var.h(function2);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new p2r(function2, aqiVar, null, 4);
            oq5Var.k0(K2);
        }
        gld.z(copyOf, (Function2) K2, oq5Var);
        return aqiVar;
    }

    public static final void n(mpp mppVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        mppVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(213045097);
        int i2 = (oq5Var2.f(mppVar) ? 4 : 2) | i;
        if (oq5Var2.P(i2 & 1, (i2 & 3) != 2)) {
            ppp pppVar = (ppp) Q(mppVar.c, oq5Var2).getValue();
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            String M = rvf.M(R.string.clear_memory, oq5Var2);
            vm C = ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2));
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new qbp(0, mppVar, mpp.class, "onBackClick", "onBackClick()V", 0, 4);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            xp3.d(M, a, null, C, (Function0) ((h9f) K), null, false, false, null, null, null, ild.C(1164277919, new vtb(25, a, pppVar, mppVar), oq5Var2), oq5Var, 0, 48, 2020);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ucm(mppVar, i, 19);
        }
    }

    public static mju n0(d7k d7kVar, boolean z, boolean z2) {
        if (z) {
            w0(3, d7kVar, false);
        }
        d7kVar.t((int) d7kVar.m(), StandardCharsets.UTF_8);
        long m = d7kVar.m();
        String[] strArr = new String[(int) m];
        for (int i = 0; i < m; i++) {
            strArr[i] = d7kVar.t((int) d7kVar.m(), StandardCharsets.UTF_8);
        }
        if (z2 && (d7kVar.v() & 1) == 0) {
            throw r7k.a(null, "framing bit expected to be set");
        }
        return new mju(strArr);
    }

    public static final void o(o2s o2sVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1443255763);
        int i2 = i | (oq5Var.f(o2sVar) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            a3s a3sVar = (a3s) Q(o2sVar.b, oq5Var).getValue();
            if (bow.u((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b))) {
                oq5Var.Z(-884911141);
                yci e = d.e(d.d(vci.a, 1.0f), 1);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new haq(6);
                    oq5Var.k0(K);
                }
                u1g.l(oq5Var, nfp.b(e, false, (Function1) K));
            } else {
                oq5Var.Z(-885761905);
            }
            oq5Var.p(false);
            hdg.w(a3sVar.c(), ((Number) Q(o2sVar.c, oq5Var).getValue()).intValue(), function1, d.e(yciVar, 56), false, false, false, 0L, 0L, false, null, oq5Var, ((i2 << 3) & 896) | 24576, 4064);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yjq(o2sVar, function1, yciVar, i, 0);
        }
    }

    public static final aqi o0(Object obj, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = g0(obj);
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        aqiVar.setValue(obj);
        return aqiVar;
    }

    public static final void p(vnr vnrVar, hq5 hq5Var, int i) {
        vnr vnrVar2 = vnrVar;
        vnrVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1975798430);
        int i2 = (oq5Var.f(vnrVar2) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            float f = 12;
            int i3 = i2 & 14;
            q(vnrVar2, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, f, 0.0f, 4, 5), f, 0.0f, 2), oq5Var, i3 | 48);
            boolean z = i3 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                vuq vuqVar = new vuq(0, vnrVar2, vnr.class, "onBannerHidden", "onBannerHidden()V", 0, 14);
                oq5Var.k0(vuqVar);
                K = vuqVar;
            }
            h9f h9fVar = (h9f) K;
            boolean z2 = i3 == 4;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                vnrVar2 = vnrVar;
                K2 = new vuq(0, vnrVar2, vnr.class, "onBannerShown", "onBannerShown()V", 0, 15);
                oq5Var.k0(K2);
            } else {
                vnrVar2 = vnrVar;
            }
            a((Function0) ((h9f) K2), (Function0) h9fVar, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(vnrVar2, i, 3);
        }
    }

    public static int p0(Context context, int i, int i2) {
        TypedValue C = ngg.C(context, i);
        return (C == null || C.type != 16) ? i2 : C.data;
    }

    public static final void q(vnr vnrVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        qor qorVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-832625097);
        int i2 = (oq5Var2.f(vnrVar) ? 4 : 2) | i;
        if (oq5Var2.P(i2 & 1, (i2 & 19) != 18)) {
            eor eorVar = (eor) Q(vnrVar.g, oq5Var2).getValue();
            if (eorVar instanceof aor) {
                qorVar = ((aor) eorVar).a;
            } else if (eorVar instanceof ynr) {
                qorVar = ((ynr) eorVar).a;
            } else if (eorVar instanceof xnr) {
                qorVar = ((xnr) eorVar).a;
            } else if (eorVar instanceof dor) {
                qorVar = ((dor) eorVar).a;
            } else {
                if (!Intrinsics.d(eorVar, cor.a) && !Intrinsics.d(eorVar, bor.a)) {
                    b6e.s();
                    return;
                }
                qorVar = null;
            }
            qor qorVar2 = qorVar;
            if (qorVar2 != null) {
                oq5Var2.Z(-1297442342);
                x0q x0qVar = ((lwc) ((tnr) vnrVar.e.getValue()).a.getValue()).e;
                boolean z = (i2 & 14) == 4;
                Object K = oq5Var2.K();
                if (z || K == gq5.a) {
                    K = new vuq(0, vnrVar, vnr.class, "onClick", "onClick()V", 0, 16);
                    oq5Var2.k0(K);
                }
                oq5Var = oq5Var2;
                rzf.m(qorVar2, x0qVar, (Function0) ((h9f) K), yciVar, oq5Var, 3072);
            } else {
                oq5Var = oq5Var2;
                oq5Var.Z(-1299068757);
            }
            oq5Var.p(false);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(vnrVar, yciVar, i, 7);
        }
    }

    public static TimeInterpolator q0(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            xq0.x("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!c0(valueOf, "cubic-bezier") && !c0(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (c0(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(StringUtils.COMMA);
            if (split.length == 4) {
                return new PathInterpolator(Y(split, 0), Y(split, 1), Y(split, 2), Y(split, 3));
            }
            kac.c(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!c0(valueOf, "path")) {
            xq0.x("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String d = f1d.d(1, 5, valueOf);
        Path path = new Path();
        try {
            fbk.b(a4g.v(d), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            kac.k("Error in parsing ".concat(d), e);
            return null;
        }
    }

    public static final void r(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(469346222);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            t(ot0.g, ot0.h, yciVar, oq5Var, ((i2 << 6) & 896) | 54);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 18);
        }
    }

    public static final sfo r0(z4q z4qVar) {
        z4qVar.getClass();
        if (z4qVar instanceof u4q) {
            tnu tnuVar = ((u4q) z4qVar).a;
            return new sfo(tnuVar.a, tnuVar.b);
        }
        if (z4qVar instanceof s4q) {
            tnu tnuVar2 = ((s4q) z4qVar).a;
            return new sfo(tnuVar2.a, tnuVar2.b);
        }
        if (!(z4qVar instanceof w4q)) {
            b6e.s();
            return null;
        }
        unu unuVar = ((w4q) z4qVar).a;
        return new sfo(unuVar.a, unuVar.b);
    }

    public static final void s(String str, CharSequence charSequence, jzb jzbVar, boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, yci yciVar, hq5 hq5Var, int i) {
        str.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2096523057);
        if (((i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(charSequence) ? 32 : 16) | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function03) ? 1048576 : 524288) | (oq5Var.h(function04) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.f(yciVar) ? 67108864 : 33554432)) & 38347923) == 38347922 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 C = ild.C(-1895464401, new qr(str, jzbVar, z, function02, function0), oq5Var);
            wn5 C2 = ild.C(526289358, new s43(charSequence, z, function04, function03, 26), oq5Var);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new phs(3);
                oq5Var.k0(K);
            }
            t(C, C2, nfp.b(yciVar, false, (Function1) K), oq5Var, 54);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k1p(str, charSequence, jzbVar, z, function0, function02, function03, function04, yciVar, i);
        }
    }

    public static final eno s0(Function0 function0) {
        return new eno(new y7b(function0, null, 9));
    }

    public static final void t(wn5 wn5Var, wn5 wn5Var2, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci u;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1236581848);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            u = d.u(d.e(yciVar, Z(oq5Var)), b2c.l, (r2 & 2) == 0);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, u);
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
            xcs.a(nu0.b(), ild.C(116166033, new lqr(wn5Var, 11), oq5Var), oq5Var, 48);
            xcs.a(nu0.j(), ild.C(1190161338, new lqr(wn5Var2, 12), oq5Var), oq5Var, 48);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qks(wn5Var, wn5Var2, yciVar, i, 0);
        }
    }

    public static final j6w t0(x3f x3fVar, mhp mhpVar) {
        mhpVar.getClass();
        ivf a = mhpVar.a();
        if (a instanceof igm) {
            return j6w.f;
        }
        if (Intrinsics.d(a, emr.c)) {
            return j6w.d;
        }
        if (!Intrinsics.d(a, emr.d)) {
            return j6w.c;
        }
        mhp O = O(mhpVar.h(0), x3fVar.b);
        ivf a2 = O.a();
        if ((a2 instanceof csm) || Intrinsics.d(a2, thp.b)) {
            return j6w.e;
        }
        if (x3fVar.a.d) {
            return j6w.d;
        }
        throw ghh.h(O);
    }

    public static final void u(CharSequence charSequence, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1010187779);
        if ((((oq5Var2.h(charSequence) ? 4 : 2) | i | (oq5Var2.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            xv7.j(charSequence.toString(), ldg.x(oq5Var2, yciVar), ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 0, false, 1, 0, null, null, oq5Var, 0, 3072, 122872);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(charSequence, yciVar, i, 16);
        }
    }

    public static final double u0(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final void v(String str, jzb jzbVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-652373873);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = r30.o;
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i3 = i2 >> 3;
            int i4 = oq5Var.P;
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
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).b.a;
            vci vciVar = vci.a;
            xv7.j(str, ldg.x(oq5Var, vciVar), j, 0L, 0L, 0, 0L, 0, false, 0, 0, null, null, oq5Var, i2 & 14, 0, 131064);
            oq5Var = oq5Var;
            if (jzbVar != null) {
                oq5Var.Z(-233786803);
                lg3.q(jzbVar, d.m(androidx.compose.foundation.layout.a.q(vciVar, 4, 0.0f, 0.0f, 0.0f, 14), ff7.P(v7g.z(16), oq5Var)), ((dq0) oq5Var.j(agrVar)).b.a, oq5Var, i3 & 14, 0);
            } else {
                oq5Var.Z(-239631574);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(str, jzbVar, yciVar, i, 25);
        }
    }

    public static void v0(Object obj, String str, boolean z) {
        if (!z) {
            throw new wp3(zwf.R(str, obj));
        }
    }

    public static final void w(l3v l3vVar, sdr sdrVar, ab0 ab0Var, Function0 function0, Function0 function02, Function0 function03, Function1 function1, yci yciVar, Function1 function12, onu onuVar, Function1 function13, Function0 function04, boolean z, pyc pycVar, Function2 function2, hq5 hq5Var, int i, int i2, int i3) {
        int i4;
        sdr sdrVar2;
        ab0 ab0Var2;
        Function0 function05;
        Function0 function06;
        yci yciVar2;
        Function1 function14;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Function0 function07;
        oq5 oq5Var;
        yci yciVar3;
        Function1 function15;
        Function1 function16;
        Function0 function08;
        boolean z2;
        pyc pycVar2;
        Function2 function22;
        sdrVar.getClass();
        ab0Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1053303153);
        if ((i & 6) == 0) {
            i4 = (oq5Var2.h(l3vVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            sdrVar2 = sdrVar;
            i4 |= oq5Var2.f(sdrVar2) ? 32 : 16;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((i & 384) == 0) {
            ab0Var2 = ab0Var;
            i4 |= oq5Var2.h(ab0Var2) ? 256 : 128;
        } else {
            ab0Var2 = ab0Var;
        }
        if ((i & 3072) == 0) {
            function05 = function0;
            i4 |= oq5Var2.h(function05) ? 2048 : 1024;
        } else {
            function05 = function0;
        }
        int i11 = i & 24576;
        int i12 = RemoteCameraConfig.Notification.ID;
        if (i11 == 0) {
            function06 = function02;
            i4 |= oq5Var2.h(function06) ? 16384 : 8192;
        } else {
            function06 = function02;
        }
        if ((i & 196608) == 0) {
            i4 |= oq5Var2.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i4 |= oq5Var2.h(function1) ? 1048576 : 524288;
        }
        int i13 = i3 & 128;
        if (i13 != 0) {
            i4 |= 12582912;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            if ((i & 12582912) == 0) {
                i4 |= oq5Var2.f(yciVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            }
        }
        int i14 = i3 & 256;
        if (i14 != 0) {
            i4 |= 100663296;
            function14 = function12;
        } else {
            function14 = function12;
            if ((i & 100663296) == 0) {
                i4 |= oq5Var2.h(function14) ? 67108864 : 33554432;
            }
        }
        if ((i & 805306368) == 0) {
            i4 |= oq5Var2.d(onuVar == null ? -1 : onuVar.ordinal()) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i15 = i3 & 1024;
        if (i15 != 0) {
            i5 = 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (oq5Var2.h(function13) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i16 = i3 & 2048;
        if (i16 != 0) {
            i7 = i5 | 48;
            i6 = i16;
        } else {
            i6 = i16;
            i7 = i5 | (oq5Var2.h(function04) ? 32 : 16);
        }
        int i17 = i7;
        int i18 = i3 & 4096;
        if (i18 != 0) {
            i8 = i17 | 384;
        } else {
            i8 = i17 | (oq5Var2.g(z) ? 256 : 128);
        }
        int i19 = i3 & RemoteCameraConfig.Notification.ID;
        if (i19 != 0) {
            i9 = i8 | 3072;
        } else {
            i9 = i8 | (oq5Var2.h(pycVar) ? 2048 : 1024);
        }
        int i20 = i3 & 16384;
        if (i20 != 0) {
            i10 = i9 | 24576;
        } else {
            int i21 = i9;
            if (oq5Var2.h(function2)) {
                i12 = 16384;
            }
            i10 = i21 | i12;
        }
        if ((i4 & 306783379) == 306783378 && (i10 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            function08 = function04;
            z2 = z;
            function22 = function2;
            oq5Var = oq5Var2;
            yciVar3 = yciVar2;
            function15 = function14;
            function16 = function13;
            pycVar2 = pycVar;
        } else {
            yci yciVar4 = i13 != 0 ? vci.a : yciVar2;
            if (i14 != 0) {
                function14 = null;
            }
            Function1 function17 = i15 != 0 ? null : function13;
            if (i6 != 0) {
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = new cp5(2);
                    oq5Var2.k0(K);
                }
                function07 = (Function0) K;
            } else {
                function07 = function04;
            }
            boolean z3 = i18 != 0 ? true : z;
            pyc pycVar3 = i19 != 0 ? null : pycVar;
            Function2 function23 = i20 != 0 ? null : function2;
            Function0 function09 = function05;
            Function0 function010 = function07;
            oq5Var = oq5Var2;
            Function0 function011 = function06;
            ab0 ab0Var3 = ab0Var2;
            Function1 function18 = function14;
            boolean z4 = z3;
            w0v.c(l3vVar, sdrVar2, ab0Var3, function09, function011, function03, function1, yciVar4, function18, onuVar, function17, function010, z4, pycVar3, function23, oq5Var, i4 & 2147483646, i10 & 65534, 0);
            yciVar3 = yciVar4;
            function15 = function18;
            function16 = function17;
            function08 = function010;
            z2 = z4;
            pycVar2 = pycVar3;
            function22 = function23;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s0v(l3vVar, sdrVar, ab0Var, function0, function02, function03, function1, yciVar3, function15, onuVar, function16, function08, z2, pycVar2, function22, i, i2, i3, 1);
        }
    }

    public static boolean w0(int i, d7k d7kVar, boolean z) {
        if (d7kVar.a() < 7) {
            if (z) {
                return false;
            }
            throw r7k.a(null, "too short header: " + d7kVar.a());
        }
        if (d7kVar.v() != i) {
            if (z) {
                return false;
            }
            throw r7k.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (d7kVar.v() == 118 && d7kVar.v() == 111 && d7kVar.v() == 114 && d7kVar.v() == 98 && d7kVar.v() == 105 && d7kVar.v() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw r7k.a(null, "expected characters 'vorbis'");
    }

    public static final void x(yci yciVar, onu onuVar, Function2 function2, hq5 hq5Var, int i, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1614631663);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(onuVar == null ? -1 : onuVar.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.h(function2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            if (i5 != 0) {
                function2 = null;
            }
            w0v.e(yciVar, onuVar, function2, oq5Var, i3 & 1022);
        }
        yci yciVar2 = yciVar;
        Function2 function22 = function2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(yciVar2, (Object) onuVar, function22, i, i2, 14);
        }
    }

    public static String x0(obx obxVar) {
        StringBuilder sb = new StringBuilder(obxVar.o());
        for (int i = 0; i < obxVar.o(); i++) {
            byte a = obxVar.a(i);
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

    public static final void y(flv flvVar, ukd ukdVar, plv plvVar, float f, hq5 hq5Var, int i) {
        flvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-897350704);
        int i2 = (oq5Var.f(flvVar) ? 4 : 2) | i | (oq5Var.f(ukdVar) ? 32 : 16) | (oq5Var.f(plvVar) ? 256 : 128) | (oq5Var.c(f) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = flvVar instanceof vkv;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(-1098118978);
                vkv vkvVar = (vkv) flvVar;
                boolean z2 = vkvVar.a;
                float f2 = 24 * f;
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = new siv(13);
                    oq5Var.k0(K);
                }
                A(z2, f2, zdg.E(ukdVar, (Function1) K), plvVar, vkvVar.b, oq5Var, (i2 << 3) & 7168);
                oq5Var.p(false);
            } else if (flvVar instanceof xkv) {
                oq5Var.Z(-1097811923);
                xkv xkvVar = (xkv) flvVar;
                boolean z3 = xkvVar.a;
                float f3 = 24 * f;
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new siv(15);
                    oq5Var.k0(K2);
                }
                C(z3, f3, zdg.E(ukdVar, (Function1) K2), plvVar, xkvVar.b, oq5Var, (i2 << 3) & 7168);
                oq5Var.p(false);
            } else if (flvVar instanceof alv) {
                oq5Var.Z(-1097521949);
                float f4 = 24 * f;
                Object K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    K3 = new siv(16);
                    oq5Var.k0(K3);
                }
                F(f4, i2 & 896, oq5Var, zdg.E(ukdVar, (Function1) K3), plvVar);
                oq5Var.p(false);
            } else if (flvVar instanceof zkv) {
                oq5Var.Z(-1097313567);
                float f5 = 24 * f;
                Object K4 = oq5Var.K();
                if (K4 == kjnVar) {
                    K4 = new siv(17);
                    oq5Var.k0(K4);
                }
                E(f5, i2 & 896, oq5Var, zdg.E(ukdVar, (Function1) K4), plvVar);
                oq5Var.p(false);
            } else if (flvVar instanceof clv) {
                oq5Var.Z(-1097095854);
                float f6 = 32 * f;
                Object K5 = oq5Var.K();
                if (K5 == kjnVar) {
                    K5 = new siv(18);
                    oq5Var.k0(K5);
                }
                H(f6, i2 & 896, oq5Var, zdg.E(ukdVar, (Function1) K5), plvVar);
                oq5Var.p(false);
            } else if (flvVar instanceof dlv) {
                oq5Var.Z(-1096864780);
                float f7 = 32 * f;
                Object K6 = oq5Var.K();
                if (K6 == kjnVar) {
                    K6 = new siv(19);
                    oq5Var.k0(K6);
                }
                I(f7, i2 & 896, oq5Var, zdg.E(ukdVar, (Function1) K6), plvVar);
                oq5Var.p(false);
            } else if (flvVar instanceof elv) {
                oq5Var.Z(-1096641580);
                float f8 = 32 * f;
                Object K7 = oq5Var.K();
                if (K7 == kjnVar) {
                    K7 = new siv(20);
                    oq5Var.k0(K7);
                }
                J(f8, zdg.E(ukdVar, (Function1) K7), plvVar, ((elv) flvVar).a, oq5Var, i2 & 896);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else if (flvVar instanceof blv) {
                oq5Var.Z(-1096388837);
                float f9 = 32 * f;
                Object K8 = oq5Var.K();
                if (K8 == kjnVar) {
                    K8 = new siv(21);
                    oq5Var.k0(K8);
                }
                G(f9, i2 & 896, oq5Var, zdg.E(ukdVar, (Function1) K8), plvVar);
                oq5Var.p(false);
            } else if (flvVar.equals(ykv.a)) {
                oq5Var.Z(-1096173635);
                float f10 = 24 * f;
                Object K9 = oq5Var.K();
                if (K9 == kjnVar) {
                    K9 = new siv(22);
                    oq5Var.k0(K9);
                }
                D(f10, i2 & 896, oq5Var, zdg.E(ukdVar, (Function1) K9), plvVar);
                oq5Var.p(false);
            } else {
                if (!flvVar.equals(wkv.a)) {
                    throw vz1.i(oq5Var, 934408551, false);
                }
                oq5Var.Z(-1095965067);
                Object K10 = oq5Var.K();
                if (K10 == kjnVar) {
                    K10 = new siv(14);
                    oq5Var.k0(K10);
                }
                B(zdg.E(ukdVar, (Function1) K10), plvVar, oq5Var, (i2 >> 3) & 112);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ti7(f, i, 4, flvVar, ukdVar, plvVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void z(final float f, final String str, final ukd ukdVar, Integer num, od odVar, float f2, boolean z, final plv plvVar, hq5 hq5Var, final int i, final int i2) {
        int i3;
        Integer num2;
        int i4;
        od odVar2;
        int i5;
        float f3;
        int i6;
        boolean z2;
        int i7;
        oq5 oq5Var;
        final Integer num3;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1151283070);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.f(ukdVar) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            num2 = num;
            i3 |= oq5Var2.f(num2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                odVar2 = odVar;
                i3 |= oq5Var2.h(odVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f3 = f2;
                    i3 |= oq5Var2.c(f3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    } else if ((1572864 & i) == 0) {
                        z2 = z;
                        i3 |= oq5Var2.g(z2) ? 1048576 : 524288;
                        if ((i & 12582912) == 0) {
                            i3 |= (i & 16777216) == 0 ? oq5Var2.f(plvVar) : oq5Var2.h(plvVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                        }
                        i7 = i3;
                        if (oq5Var2.P(i7 & 1, (i3 & 4793491) != 4793490)) {
                            Integer num4 = i8 != 0 ? null : num2;
                            if (i4 != 0) {
                                odVar2 = null;
                            }
                            float f4 = i5 != 0 ? 0 : f3;
                            boolean z3 = i6 != 0 ? true : z2;
                            ukd ukdVar2 = skd.a;
                            if (odVar2 != null) {
                                ukdVar2 = nt0.u(ukdVar2, odVar2);
                            }
                            ukd d = ukdVar.d(ukdVar2);
                            boolean z4 = (i7 & 112) == 32;
                            Object K = oq5Var2.K();
                            if (z4 || K == gq5.a) {
                                K = new srp(str, 22);
                                oq5Var2.k0(K);
                            }
                            ukd E = zdg.E(d, (Function1) K);
                            f3 = f4;
                            z2 = z3;
                            wn5 C = ild.C(-848816544, new xyj(num4, f, f4, plvVar, z3), oq5Var2);
                            oq5Var = oq5Var2;
                            vq2.c(E, f40.f, C, oq5Var, 384, 0);
                            num3 = num4;
                        } else {
                            oq5Var = oq5Var2;
                            oq5Var.S();
                            num3 = num2;
                        }
                        oq5 oq5Var3 = oq5Var;
                        final od odVar3 = odVar2;
                        final float f5 = f3;
                        final boolean z5 = z2;
                        r = oq5Var3.r();
                        if (r != null) {
                            r.d = new Function2() { // from class: jlv
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    szf.z(f, str, ukdVar, num3, odVar3, f5, z5, plvVar, (hq5) obj, rvf.R(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i3;
                    if (oq5Var2.P(i7 & 1, (i3 & 4793491) != 4793490)) {
                    }
                    oq5 oq5Var32 = oq5Var;
                    final od odVar32 = odVar2;
                    final float f52 = f3;
                    final boolean z52 = z2;
                    r = oq5Var32.r();
                    if (r != null) {
                    }
                }
                f3 = f2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z2 = z;
                if ((i & 12582912) == 0) {
                }
                i7 = i3;
                if (oq5Var2.P(i7 & 1, (i3 & 4793491) != 4793490)) {
                }
                oq5 oq5Var322 = oq5Var;
                final od odVar322 = odVar2;
                final float f522 = f3;
                final boolean z522 = z2;
                r = oq5Var322.r();
                if (r != null) {
                }
            }
            odVar2 = odVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f3 = f2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z2 = z;
            if ((i & 12582912) == 0) {
            }
            i7 = i3;
            if (oq5Var2.P(i7 & 1, (i3 & 4793491) != 4793490)) {
            }
            oq5 oq5Var3222 = oq5Var;
            final od odVar3222 = odVar2;
            final float f5222 = f3;
            final boolean z5222 = z2;
            r = oq5Var3222.r();
            if (r != null) {
            }
        }
        num2 = num;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        odVar2 = odVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f3 = f2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        if ((i & 12582912) == 0) {
        }
        i7 = i3;
        if (oq5Var2.P(i7 & 1, (i3 & 4793491) != 4793490)) {
        }
        oq5 oq5Var32222 = oq5Var;
        final od odVar32222 = odVar2;
        final float f52222 = f3;
        final boolean z52222 = z2;
        r = oq5Var32222.r();
        if (r != null) {
        }
    }

    public lcg e0(hoh hohVar) {
        hohVar.getClass();
        byte[] bArr = hohVar.k;
        if (bArr == null) {
            return null;
        }
        return d(bArr);
    }
}
