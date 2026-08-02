package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.domainitem.WaveColorsDto;
import com.yandex.music.shared.dto.domainitem.WaveDto;
import com.yandex.music.shared.playback.api.commands.SetVolumeCommand;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.ActionButtonSlideDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.ActionButtonSlideDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.LikeButtonSlideDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.LikeButtonSlideDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.LikeButtonStateDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.ShareButtonSlideDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.ShareButtonSlideDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SimpleButtonSlideDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SimpleButtonSlideDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlideBackgroundDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlideButtonDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlideDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlideMetaDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlideTrailerDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlidesResponseDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.WaveButtonSlideDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ArtistCarouselDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ArtistsSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.CarouselContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.CarouselItemDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ChartArtistSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ChartArtistSlideListItemDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ChartFavouritesSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ChartSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.CollageContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.DefaultEntitySlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ExtendedTextSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ExtendedTextSlideDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.PayCardSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.PayCardSlideDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.QuizEntitySlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.SingleEntitySlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.SlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.SlideDisclaimerDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.SlideListItemDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.StatEntityDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.StatsSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.TextFactSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.TextSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.TextSlideDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ThenNowComparisonSlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ThenNowComparisonSlideDataDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ThenNowComparisonSlideItemDto;
import com.yandex.music.shared.trailers.api.model.TrackWithSmartPreviewDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class vq1 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final rj7 h;
    public static final Object i;
    public static final SetVolumeCommand j;

    static {
        int i2 = 19;
        e = new wn5(new fo5(i2), 2131355370, false);
        f = new wn5(new lo5(i2), -333422645, false);
        new wn5(new lo5(20), 1010368775, false);
        g = new wn5(new ap5(1), -1868855061, false);
        h = new rj7(22);
        i = new Object();
        j = new SetVolumeCommand(new n4q(0.2f));
    }

    public static void A(boolean z) {
        if (z) {
            return;
        }
        e7o.n();
    }

    public static void B(Object obj) {
        if (obj != null) {
            return;
        }
        e7o.n();
    }

    public static void C(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xq0.q(str);
    }

    public static final yci D(yci yciVar, Function0 function0, Function0 function02, Function0 function03, float f2, meo meoVar, hq5 hq5Var, int i2, int i3) {
        yciVar.getClass();
        function0.getClass();
        int i4 = i3 & 4;
        Object obj = gq5.a;
        if (i4 != 0) {
            oq5 oq5Var = (oq5) hq5Var;
            Object K = oq5Var.K();
            if (K == obj) {
                K = new x6s(26);
                oq5Var.k0(K);
            }
            function03 = (Function0) K;
        }
        Function0 function04 = function03;
        oq5 oq5Var2 = (oq5) hq5Var;
        Object K2 = oq5Var2.K();
        if (K2 == obj) {
            K2 = vz1.h(oq5Var2);
        }
        uoi uoiVar = (uoi) K2;
        meo meoVar2 = (i3 & 64) != 0 ? null : meoVar;
        oq5 oq5Var3 = (oq5) hq5Var;
        Object K3 = oq5Var3.K();
        if (K3 == obj) {
            K3 = vq2.a(1.0f);
            oq5Var3.k0(K3);
        }
        fk0 fk0Var = (fk0) K3;
        gld.w(oq5Var3, uoiVar, new in4(uoiVar, function02, function04, new xqn(), function0, fk0Var, f2, null));
        boolean h2 = oq5Var3.h(fk0Var);
        Object K4 = oq5Var3.K();
        if (h2 || K4 == obj) {
            K4 = new en4(fk0Var, 0);
            oq5Var3.k0(K4);
        }
        yci a2 = a.a(yciVar, (Function1) K4);
        boolean z = (((i2 & 112) ^ 48) > 32 && oq5Var3.f(function0)) || (i2 & 48) == 32;
        Object K5 = oq5Var3.K();
        if (z || K5 == obj) {
            K5 = new ex(5, function0);
            oq5Var3.k0(K5);
        }
        yci b2 = nfp.b(a2, false, (Function1) K5);
        Object K6 = oq5Var3.K();
        if (K6 == obj) {
            K6 = new ym4(1);
            oq5Var3.k0(K6);
        }
        return androidx.compose.foundation.a.d(b2, uoiVar, null, false, null, meoVar2, (Function0) K6, 12);
    }

    public static final fkn E(mm6 mm6Var, vdr vdrVar, vdr vdrVar2, Function2 function2) {
        vdrVar.getClass();
        vdrVar2.getClass();
        return lg3.u0(new u21(10, vdrVar, vdrVar2, new za5(function2, null, 0)), mm6Var, function2.invoke(vdrVar.getValue(), vdrVar2.getValue()));
    }

    public static final anx F(pjc pjcVar) {
        lc4.S.getClass();
        int i2 = hc4.b;
        if (1 >= i2) {
            i2 = 1;
        }
        int i3 = i2 - 1;
        if (pjcVar instanceof sc4) {
            sc4 sc4Var = (sc4) pjcVar;
            oi3 oi3Var = sc4Var.c;
            pjc h2 = sc4Var.h();
            if (h2 != null) {
                int i4 = sc4Var.b;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (oi3Var != oi3.a || i4 == 0) {
                    i3 = 0;
                }
                return new anx(h2, i3, oi3Var, sc4Var.a);
            }
        }
        return new anx(pjcVar, i3, oi3.a, g.a);
    }

    public static final boolean G(jc8 jc8Var, xzb xzbVar) {
        dp8 d2 = jc8Var.d();
        if (d2.A() != null || d2.E() != null || d2.D() != null) {
            return true;
        }
        if (jc8Var instanceof cb8) {
            jt8 jt8Var = ((cb8) jc8Var).c;
            List<k79> x = qwp.x(jt8Var.B, jt8Var.z, xzbVar);
            if (!(x instanceof Collection) || !x.isEmpty()) {
                for (k79 k79Var : x) {
                    if (G(k79Var.a, k79Var.b)) {
                        return true;
                    }
                }
            }
        } else {
            if (!(jc8Var instanceof gb8)) {
                if ((jc8Var instanceof rb8) || (jc8Var instanceof hb8) || (jc8Var instanceof fb8) || (jc8Var instanceof mb8) || (jc8Var instanceof ib8) || (jc8Var instanceof ob8) || (jc8Var instanceof eb8) || (jc8Var instanceof kb8) || (jc8Var instanceof qb8) || (jc8Var instanceof db8) || (jc8Var instanceof lb8) || (jc8Var instanceof nb8) || (jc8Var instanceof sb8) || (jc8Var instanceof jb8) || (jc8Var instanceof pb8)) {
                    return false;
                }
                b6e.s();
                return false;
            }
            Iterable iterable = ((gb8) jc8Var).c.y;
            if (iterable == null) {
                iterable = c5b.a;
            }
            Iterable iterable2 = iterable;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    if (G((jc8) it.next(), xzbVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void H(String str, String str2) {
        synchronized (i) {
            Log.d(str, o(str2, null));
        }
    }

    public static void I(String str, String str2, Exception exc) {
        synchronized (i) {
            Log.d(str, o(str2, exc));
        }
    }

    public static byte[] J(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static void K(String str, String str2) {
        synchronized (i) {
            Log.e(str, o(str2, null));
        }
    }

    public static void L(String str, String str2, Throwable th) {
        synchronized (i) {
            Log.e(str, o(str2, th));
        }
    }

    public static String M(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final int N(om8 om8Var, pm8 pm8Var) {
        int i2;
        int i3 = om8Var == null ? -1 : oy9.a[om8Var.ordinal()];
        if (i3 == 1) {
            i2 = 3;
        } else if (i3 != 2) {
            i2 = 5;
            if (i3 != 3) {
                i2 = (i3 == 4 || i3 != 5) ? 8388611 : 8388613;
            }
        } else {
            i2 = 1;
        }
        int i4 = pm8Var != null ? oy9.b[pm8Var.ordinal()] : -1;
        int i5 = 48;
        if (i4 != 1) {
            if (i4 == 2) {
                i5 = 16;
            } else if (i4 == 3) {
                i5 = 80;
            }
        }
        return i5 | i2;
    }

    public static final int O(du8 du8Var, eu8 eu8Var) {
        int i2 = 8388611;
        switch (du8Var == null ? -1 : oy9.c[du8Var.ordinal()]) {
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 5;
                break;
            case 5:
                i2 = 8388613;
                break;
            case 6:
                i2 = 16777216;
                break;
            case 7:
                i2 = 33554432;
                break;
            case 8:
                i2 = 67108864;
                break;
        }
        int i3 = 48;
        switch (eu8Var != null ? oy9.d[eu8Var.ordinal()] : -1) {
            case 2:
                i3 = 16;
                break;
            case 3:
                i3 = 80;
                break;
            case 4:
                i3 = 268435456;
                break;
            case 5:
                i3 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                break;
            case 6:
                i3 = 1073741824;
                break;
        }
        return i3 | i2;
    }

    public static final List P(dp8 dp8Var) {
        List g2 = dp8Var.g();
        if (g2 != null) {
            return g2;
        }
        l1a y = dp8Var.y();
        List c2 = y != null ? t75.c(y) : null;
        return c2 == null ? c5b.a : c2;
    }

    public static final Interpolator Q(um8 um8Var) {
        int ordinal = um8Var.ordinal();
        if (ordinal == 0) {
            return new LinearInterpolator();
        }
        if (ordinal == 1) {
            return new hya(0, hya.f);
        }
        if (ordinal == 2) {
            return new hya(0, hya.d);
        }
        if (ordinal == 3) {
            return new hya(0, hya.g);
        }
        if (ordinal == 4) {
            return new hya(0, hya.e);
        }
        if (ordinal == 5) {
            return new hya();
        }
        b6e.s();
        return null;
    }

    public static final int R(uhd uhdVar) {
        uhdVar.getClass();
        switch (uhdVar.ordinal()) {
            case 0:
                return ru.yandex.music.R.drawable.ic_station_2_24;
            case 1:
            case 2:
            case 3:
                return ru.yandex.music.R.drawable.ic_station_mini_24;
            case 4:
            case 5:
                return ru.yandex.music.R.drawable.ic_station_24;
            case 6:
            case 7:
                return ru.yandex.music.R.drawable.ic_tv_24;
            case 8:
                return ru.yandex.music.R.drawable.ic_smart_display_24;
            case 9:
                return ru.yandex.music.R.drawable.ic_tv_24;
            case 10:
                return ru.yandex.music.R.drawable.ic_station_chiron_24;
            case 11:
            case 12:
            case 13:
                return ru.yandex.music.R.drawable.ic_jbl_24;
            case 14:
                return ru.yandex.music.R.drawable.ic_station_cucumber_24;
            case 15:
                return ru.yandex.music.R.drawable.ic_plum__24;
            case 16:
                return ru.yandex.music.R.drawable.ic_fiero_24_;
            default:
                b6e.s();
                return 0;
        }
    }

    public static final cm9 S(dm9 dm9Var, xzb xzbVar) {
        Object obj;
        szb szbVar = dm9Var.n;
        List list = dm9Var.I;
        if (szbVar != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((cm9) obj).d, szbVar.a(xzbVar))) {
                    break;
                }
            }
            cm9 cm9Var = (cm9) obj;
            if (cm9Var != null) {
                return cm9Var;
            }
        }
        return (cm9) CollectionsKt.firstOrNull(list);
    }

    public static boolean T() {
        return ((Boolean) su6.e.getValue()).booleanValue();
    }

    public static final String U(String str) {
        return new jcv(str, WebPath$Storage.AVATARS).getPathForSize(frv.b());
    }

    public static final boolean V(dp8 dp8Var) {
        if (dp8Var.y() != null) {
            return true;
        }
        List g2 = dp8Var.g();
        if (g2 != null && !g2.isEmpty()) {
            return true;
        }
        List e2 = dp8Var.e();
        return (e2 == null || e2.isEmpty()) ? false : true;
    }

    public static Object W(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return rb.x(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static final String X(jc8 jc8Var) {
        dp8 d2 = jc8Var.d();
        return d2 instanceof xq9 ? "text" : d2 instanceof i29 ? "image" : d2 instanceof i19 ? "gif" : d2 instanceof ri9 ? "separator" : d2 instanceof k39 ? "indicator" : d2 instanceof zk9 ? "slider" : d2 instanceof l49 ? "input" : d2 instanceof pz9 ? "video" : d2 instanceof jt8 ? "container" : d2 instanceof w19 ? "grid" : d2 instanceof dm9 ? "state" : d2 instanceof s09 ? "gallery" : d2 instanceof eb9 ? "pager" : d2 instanceof vo9 ? "tabs" : d2 instanceof yu8 ? "custom" : d2 instanceof ei9 ? "select" : d2 instanceof jo9 ? "switch" : "";
    }

    public static void Y(String str, String str2) {
        synchronized (i) {
            Log.i(str, o(str2, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Z(ipa ipaVar) {
        if (((xci) ipaVar).a.n) {
            bcx.D(ipaVar, 1).i1();
        }
    }

    public static final void a(xe1 xe1Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var;
        xe1Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-575797380);
        if ((((oq5Var2.h(xe1Var) ? 4 : 2) | i2 | 48) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            jf1 jf1Var = (jf1) szf.Q(xe1Var.a.m, oq5Var2).getValue();
            boolean z = jf1Var instanceof hf1;
            yciVar2 = vci.a;
            if (z) {
                oq5Var2.Z(519853831);
                oq5Var = oq5Var2;
                jf0.e(((hf1) jf1Var).a, yciVar2, e9g.b, true, true, null, oq5Var, 28080, 32);
                oq5Var.p(false);
            } else {
                if (!(jf1Var instanceof if1)) {
                    throw vz1.i(oq5Var2, 709503340, false);
                }
                oq5Var2.Z(520120524);
                if1 if1Var = (if1) jf1Var;
                nnk nnkVar = if1Var.a;
                long j2 = d85.m;
                boolean h2 = oq5Var2.h(xe1Var) | oq5Var2.f(jf1Var);
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (h2 || K == kjnVar) {
                    K = new a3(16, xe1Var, if1Var);
                    oq5Var2.k0(K);
                }
                yci b2 = com.yandex.music.core.ui.compose.a.b(yciVar2, null, 0L, 0.0f, null, (Function2) K, 15);
                boolean f2 = oq5Var2.f(jf1Var) | oq5Var2.h(xe1Var);
                Object K2 = oq5Var2.K();
                if (f2 || K2 == kjnVar) {
                    K2 = new hb(20, xe1Var, if1Var);
                    oq5Var2.k0(K2);
                }
                vq2.b(nnkVar, (Function0) K2, b2, j2, oq5Var2, 3072);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a3(xe1Var, yciVar2, i2, 17);
        }
    }

    public static final boolean a0(jc8 jc8Var) {
        if ((jc8Var instanceof rb8) || (jc8Var instanceof hb8) || (jc8Var instanceof fb8) || (jc8Var instanceof mb8) || (jc8Var instanceof ib8) || (jc8Var instanceof nb8) || (jc8Var instanceof jb8) || (jc8Var instanceof db8) || (jc8Var instanceof lb8) || (jc8Var instanceof sb8) || (jc8Var instanceof pb8)) {
            return false;
        }
        if ((jc8Var instanceof cb8) || (jc8Var instanceof gb8) || (jc8Var instanceof eb8) || (jc8Var instanceof kb8) || (jc8Var instanceof qb8) || (jc8Var instanceof ob8)) {
            return true;
        }
        b6e.s();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    public static final void b(tf3 tf3Var, Function1 function1, sf3 sf3Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        yci yciVar2;
        ?? r1;
        long j2;
        boolean z;
        boolean z2;
        oq5 oq5Var2;
        u85 u85Var;
        tf3Var.getClass();
        function1.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1005367580);
        int i3 = i2 | (oq5Var3.f(tf3Var) ? 4 : 2) | (oq5Var3.h(function1) ? 32 : 16) | (oq5Var3.f(sf3Var) ? 256 : 128) | (oq5Var3.f(yciVar) ? 2048 : 1024);
        if (oq5Var3.P(i3 & 1, (i3 & 1171) != 1170)) {
            rf3 rf3Var = tf3Var.a;
            boolean z3 = tf3Var.c;
            boolean z4 = tf3Var.b;
            String M = rvf.M(rf3Var.b, oq5Var3);
            String M2 = rvf.M(ru.yandex.music.R.string.has_notification, oq5Var3);
            int i4 = i3 & 14;
            boolean f2 = (i4 == 4) | oq5Var3.f(M) | oq5Var3.f(M2);
            Object K = oq5Var3.K();
            Object obj = gq5.a;
            if (f2 || K == obj) {
                K = new g3(15, tf3Var, M, M2);
                oq5Var3.k0(K);
            }
            yci b2 = nfp.b(yciVar, false, (Function1) K);
            geo a2 = eeo.a(56, 4, 0L, false);
            meo meoVar = new meo(4);
            boolean z5 = ((i3 & 112) == 32) | (i4 == 4);
            Object K2 = oq5Var3.K();
            int i5 = 12;
            if (z5 || K2 == obj) {
                K2 = new ap1(i5, function1, tf3Var);
                oq5Var3.k0(K2);
            }
            yci d2 = b.d(androidx.compose.foundation.a.d(b2, null, a2, false, null, meoVar, (Function0) K2, 12), uah.e(new Pair("bottom_tab", Integer.valueOf(rf3Var.a)), new Pair("has_tab_dot", Boolean.valueOf(z3)), new Pair("is_selected", Boolean.valueOf(z4))));
            kfh d3 = ug3.d(b2c.b, false);
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
            w4k E = a0g.E(z4 ? ((Number) rf3Var.d.invoke(sf3Var)).intValue() : ((Number) rf3Var.c.invoke(sf3Var)).intValue(), 0, oq5Var3);
            oq5Var3.Z(-1219871894);
            yci yciVar3 = vci.a;
            yci m = d.m(androidx.compose.foundation.layout.a.m(yciVar3, 4), rf3Var.e);
            if (z3) {
                float f3 = rf3Var.e;
                float f4 = 8;
                boolean z6 = i4 == 4;
                Object K3 = oq5Var3.K();
                if (z6 || K3 == obj) {
                    K3 = new v5(14, tf3Var);
                    oq5Var3.k0(K3);
                }
                yciVar3 = xee.w(yciVar3, f3, f4, false, gar.a, (Function1) K3);
                yciVar2 = yciVar3;
            } else {
                yciVar2 = yciVar3;
            }
            yci f5 = m.f(yciVar3);
            oq5Var3.p(false);
            if (z4) {
                oq5Var3.Z(839252033);
                j2 = ((d85) rf3Var.f.invoke(sf3Var, oq5Var3, Integer.valueOf((i3 >> 6) & 14))).a;
                r1 = 0;
                oq5Var3.p(false);
            } else {
                r1 = 0;
                oq5Var3.Z(839344351);
                oq5Var3.Z(189487557);
                j2 = k5r.f(oq5Var3, false, ((dq0) oq5Var3.j(eq0.a)).a.c).a;
                oq5Var3.p(false);
            }
            gae.b(E, null, f5, j2, oq5Var3, 48, 0);
            if (z3) {
                oq5Var3.Z(839493771);
                ug3.a(androidx.compose.foundation.layout.b.a.a(androidx.compose.foundation.a.b(xp3.u(d.m(yciVar2, 12), ugo.a), kg5.r(ru.yandex.music.R.color.avatar_alert_red, oq5Var3), vnj.i), b2c.d), oq5Var3, r1);
            } else {
                oq5Var3.Z(835028376);
            }
            oq5Var3.p(r1);
            if (rf3Var == rf3.m) {
                oq5Var3.Z(-1219834255);
                z = ((Boolean) oq5Var3.j((agr) alg.d.c)).booleanValue();
                oq5Var3.p(r1);
            } else {
                oq5Var3.Z(839844996);
                oq5Var3.p(r1);
                z = r1;
            }
            if (z) {
                oq5Var3.Z(839880558);
                w4k E2 = a0g.E(ru.yandex.music.R.drawable.nda, r1, oq5Var3);
                if (z4) {
                    u85Var = null;
                } else {
                    float[] y = bcx.y();
                    bcx.H(y);
                    u85 u85Var2 = new u85(new ColorMatrixColorFilter(y));
                    u85Var2.b = y;
                    u85Var = u85Var2;
                }
                z2 = true;
                irf.r(E2, null, androidx.compose.foundation.layout.a.j(yciVar2, -2, 20), null, null, 0.0f, u85Var, oq5Var3, 48, 56);
                oq5Var2 = oq5Var3;
            } else {
                z2 = true;
                oq5Var3.Z(835028376);
                oq5Var2 = oq5Var3;
            }
            oq5Var2.p(r1);
            oq5Var2.p(z2);
            oq5Var = oq5Var2;
        } else {
            oq5Var3.S();
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 23, tf3Var, function1, sf3Var, yciVar);
        }
    }

    public static final boolean b0(u38 u38Var) {
        boolean z = true;
        if (u38Var instanceof n38) {
            return true;
        }
        if (!(Intrinsics.d(u38Var, o38.a) ? true : Intrinsics.d(u38Var, p38.a) ? true : Intrinsics.d(u38Var, s38.a)) && u38Var != null) {
            z = false;
        }
        if (z) {
            return false;
        }
        b6e.s();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.K(), java.lang.Integer.valueOf(r12)) == false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(vy3 vy3Var, int i2, ny3 ny3Var, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        z2k z2kVar;
        boolean z;
        boolean z2;
        kjn kjnVar;
        vci vciVar;
        vy3 vy3Var2;
        vci vciVar2;
        Object t93Var;
        ?? r3;
        boolean z3;
        Object t93Var2;
        vci vciVar3;
        kjn kjnVar2;
        float f2;
        boolean z4;
        float f3;
        boolean z5;
        vci vciVar4;
        Object t93Var3;
        int i5;
        kjn kjnVar3;
        boolean z6;
        boolean z7;
        ny3 ny3Var2 = ny3Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(548739901);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? oq5Var.f(vy3Var) : oq5Var.h(vy3Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.h(ny3Var2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i4;
        if ((i6 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.Z(-941914914);
            Configuration configuration = (Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a);
            float f4 = configuration.screenWidthDp / configuration.screenHeightDp;
            oq5Var.p(false);
            Object K = oq5Var.K();
            kjn kjnVar4 = gq5.a;
            if (K == kjnVar4) {
                K = new jin();
                oq5Var.k0(K);
            }
            jin jinVar = (jin) K;
            z2k z2kVar2 = f4 > jinVar.a ? z2k.b : f4 < jinVar.b ? z2k.c : z2k.a;
            kfh d2 = ug3.d(b2c.b, false);
            int i7 = oq5Var.P;
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                z2kVar = z2kVar2;
            } else {
                z2kVar = z2kVar2;
            }
            ouj.x(i7, oq5Var, i7, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            int ordinal = z2kVar.ordinal();
            vci vciVar5 = vci.a;
            if (ordinal == 0) {
                oq5Var.Z(-724414837);
                int i8 = 3080 | (i6 & 14);
                int i9 = i6 >> 3;
                int i10 = i8 | (i9 & 112) | (i9 & 896);
                z = true;
                z2 = false;
                kjnVar = kjnVar4;
                vciVar = vciVar5;
                vy3Var2 = vy3Var;
                k(vy3Var2, ny3Var, wn5Var, d.c(vciVar5, 1.0f), oq5Var, i10);
                ny3Var2 = ny3Var;
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var.Z(-724109580);
                nho a2 = lho.a(qx0.a, b2c.k, oq5Var, 0);
                int i11 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, vciVar5);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                    ouj.x(i11, oq5Var, i11, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                boolean h2 = oq5Var.h(ny3Var2);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar4) {
                    vciVar3 = vciVar5;
                    kjnVar2 = kjnVar4;
                    f2 = 1.0f;
                    z4 = false;
                    f3 = 0.4891008f;
                    z5 = true;
                    t93Var2 = new t93(0, ny3Var2, ny3.class, "swipeLeft", "swipeLeft()V", 0, 18);
                    oq5Var.k0(t93Var2);
                } else {
                    t93Var2 = K2;
                    kjnVar2 = kjnVar4;
                    vciVar3 = vciVar5;
                    f2 = 1.0f;
                    z4 = false;
                    f3 = 0.4891008f;
                    z5 = true;
                }
                Function0 function0 = (Function0) ((h9f) t93Var2);
                Object K3 = oq5Var.K();
                if (K3 == kjnVar2) {
                    K3 = new zj3(21);
                    oq5Var.k0(K3);
                }
                sj2.f(function0, nfp.a(vciVar3, (Function1) K3), oq5Var, 54);
                yci d3 = androidx.compose.foundation.layout.a.d(d.b(vciVar3, f2), f3);
                int i12 = i6 >> 3;
                int i13 = 3080 | (i6 & 14) | (i12 & 112) | (i12 & 896);
                vci vciVar6 = vciVar3;
                boolean z8 = z4;
                kjn kjnVar5 = kjnVar2;
                k(vy3Var, ny3Var, wn5Var, d3, oq5Var, i13);
                boolean h3 = oq5Var.h(ny3Var);
                Object K4 = oq5Var.K();
                if (h3 || K4 == kjnVar5) {
                    vciVar4 = vciVar6;
                    i5 = 54;
                    kjnVar3 = kjnVar5;
                    z6 = z8;
                    z7 = z5;
                    t93Var3 = new t93(0, ny3Var, ny3.class, "swipeRight", "swipeRight()V", 0, 19);
                    oq5Var.k0(t93Var3);
                } else {
                    vciVar4 = vciVar6;
                    z6 = z8;
                    i5 = 54;
                    kjnVar3 = kjnVar5;
                    t93Var3 = K4;
                    z7 = z5;
                }
                Function0 function02 = (Function0) ((h9f) t93Var3);
                Object K5 = oq5Var.K();
                if (K5 == kjnVar3) {
                    K5 = new zj3(22);
                    oq5Var.k0(K5);
                }
                sj2.f(function02, nfp.a(vciVar4, (Function1) K5), oq5Var, i5);
                oq5Var.p(z7);
                oq5Var.p(z6);
                ny3Var2 = ny3Var;
                vciVar = vciVar4;
                z = z7;
                z2 = z6;
                kjnVar = kjnVar3;
                vy3Var2 = vy3Var;
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, -439010287, false);
                }
                oq5Var.Z(-723241053);
                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i14 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, vciVar5);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i14))) {
                    ouj.x(i14, oq5Var, i14, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                if (0.5f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                u1g.l(oq5Var, new LayoutWeightElement(true, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f));
                int i15 = i6 >> 3;
                k(vy3Var, ny3Var2, wn5Var, androidx.compose.foundation.layout.a.d(d.d(vciVar5, 1.0f), 0.4891008f), oq5Var, 3080 | (i6 & 14) | (i15 & 112) | (i15 & 896));
                if (0.5f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                u1g.l(oq5Var, new LayoutWeightElement(true, 0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f));
                oq5Var.p(true);
                oq5Var.p(false);
                vy3Var2 = vy3Var;
                z = true;
                kjnVar = kjnVar4;
                z2 = false;
                vciVar = vciVar5;
            }
            boolean h4 = oq5Var.h(ny3Var2);
            Object K6 = oq5Var.K();
            if (h4 || K6 == kjnVar) {
                vciVar2 = vciVar;
                r3 = z2;
                z3 = z;
                t93Var = new t93(0, ny3Var2, ny3.class, "close", "close()V", 0, 20);
                oq5Var.k0(t93Var);
            } else {
                vciVar2 = vciVar;
                r3 = z2;
                t93Var = K6;
                z3 = z;
            }
            hld.f((Function0) ((h9f) t93Var), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.a.a(vciVar2, b2c.d), "cards_close_button"), oq5Var, r3);
            sj2.d(vy3Var2.a.size(), i2, i6 & 112, oq5Var, androidx.compose.ui.platform.a.a(gut.p1(vciVar2), "cards_pager_indicator"));
            oq5Var.p(z3);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ry3(vy3Var, i2, ny3Var, wn5Var, yciVar, i3, 1);
        }
    }

    public static final boolean c0(jt8 jt8Var, xzb xzbVar) {
        szb szbVar;
        szb szbVar2;
        szb szbVar3 = jt8Var.C;
        szb szbVar4 = jt8Var.I;
        if (szbVar3.a(xzbVar) == ft8.WRAP && szbVar4.a(xzbVar) != gt8.OVERLAP) {
            if (szbVar4.a(xzbVar) == gt8.HORIZONTAL) {
                bk9 bk9Var = jt8Var.c0;
                return !(bk9Var instanceof ak9) || ((szbVar2 = ((ak9) bk9Var).b.a) != null && ((Boolean) szbVar2.a(xzbVar)).booleanValue());
            }
            bk9 bk9Var2 = jt8Var.v;
            if (!(bk9Var2 instanceof ak9) || ((szbVar = ((ak9) bk9Var2).b.a) != null && ((Boolean) szbVar.a(xzbVar)).booleanValue())) {
                return true;
            }
            do8 do8Var = jt8Var.i;
            if (do8Var != null) {
                return !(((float) ((Number) do8Var.a.a(xzbVar)).doubleValue()) == 0.0f);
            }
        }
        return false;
    }

    public static final void d(vy3 vy3Var, int i2, ny3 ny3Var, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        vy3Var.getClass();
        ny3Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-178479317);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? oq5Var.f(vy3Var) : oq5Var.h(vy3Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.h(ny3Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            c(vy3Var, i2, ny3Var, wn5Var, yciVar, oq5Var, (i4 & 57344) | (i4 & 14) | 8 | (i4 & 112) | (i4 & 896) | (i4 & 7168));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ry3(vy3Var, i2, ny3Var, wn5Var, yciVar, i3, 0);
        }
    }

    public static final s7h d0(uh uhVar, Function1 function1, hq5 hq5Var) {
        Object iiVar;
        uh uhVar2;
        szf.o0(uhVar, hq5Var);
        Object o0 = szf.o0(function1, hq5Var);
        Object obj = (String) o2g.g0(new Object[0], null, e1.w, hq5Var, 3072, 6);
        oq5 oq5Var = (oq5) hq5Var;
        ji jiVar = (ji) oq5Var.j(nhg.a);
        if (jiVar == null) {
            oq5Var.Z(1006590171);
            Object obj2 = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(obj2 instanceof ContextWrapper)) {
                    obj2 = null;
                    break;
                }
                if (obj2 instanceof ji) {
                    break;
                }
                obj2 = ((ContextWrapper) obj2).getBaseContext();
            }
            jiVar = (ji) obj2;
        } else {
            oq5Var.Z(1006589303);
        }
        oq5Var.p(false);
        if (jiVar == null) {
            xq0.q("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object activityResultRegistry = jiVar.getActivityResultRegistry();
        Object K = oq5Var.K();
        Object obj3 = gq5.a;
        if (K == obj3) {
            K = new ai();
            oq5Var.k0(K);
        }
        ai aiVar = (ai) K;
        Object K2 = oq5Var.K();
        if (K2 == obj3) {
            K2 = new s7h(aiVar);
            oq5Var.k0(K2);
        }
        s7h s7hVar = (s7h) K2;
        boolean h2 = oq5Var.h(aiVar) | oq5Var.h(activityResultRegistry) | oq5Var.f(obj) | oq5Var.h(uhVar) | oq5Var.f(o0);
        Object K3 = oq5Var.K();
        if (h2 || K3 == obj3) {
            uhVar2 = uhVar;
            iiVar = new ii(aiVar, activityResultRegistry, obj, uhVar2, o0, 0);
            oq5Var.k0(iiVar);
        } else {
            iiVar = K3;
            uhVar2 = uhVar;
        }
        gld.i(activityResultRegistry, obj, uhVar2, (Function1) iiVar, oq5Var);
        return s7hVar;
    }

    public static final void e(tz5 tz5Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(841383184);
        if ((((oq5Var.h(tz5Var) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(1379331404, new cz5(tz5Var, 1), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qz5(tz5Var, yciVar, i2, 3);
        }
    }

    public static final om8 e0(du8 du8Var) {
        int ordinal = du8Var.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? om8.START : om8.END : om8.START : om8.RIGHT : om8.CENTER : om8.LEFT;
    }

    public static final void f(n9b n9bVar, Function0 function0) {
        n9bVar.getClass();
        function0.getClass();
        n9bVar.a.a(new wn5(new zk(15, function0), -1786654942, true));
    }

    public static final pm8 f0(eu8 eu8Var) {
        int ordinal = eu8Var.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? pm8.TOP : pm8.BASELINE : pm8.BOTTOM : pm8.CENTER : pm8.TOP;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(yci yciVar, bci bciVar, boolean z, Function1 function1, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        boolean z2;
        boolean z3;
        Object K;
        yci yciVar3;
        boolean z4;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(975143731);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? oq5Var.f(bciVar) : oq5Var.h(bciVar) ? 32 : 16;
        }
        int i6 = i4 | 384;
        int i7 = i3 & 8;
        if (i7 != 0) {
            i6 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            i6 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i6 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
            z4 = z;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                yciVar2 = i5 != 0 ? vci.a : yciVar;
                if (i7 != 0) {
                    z2 = true;
                    oq5Var.q();
                    z3 = (57344 & i6) == 16384;
                    K = oq5Var.K();
                    if (!z3 || K == gq5.a) {
                        K = new k32(2, function1);
                        oq5Var.k0(K);
                    }
                    zwf.a(yciVar2, bciVar, z2, true, (Function1) K, oq5Var, (i6 & 14) | 24640 | (i6 & 112) | (i6 & 896) | (i6 & 7168));
                    yciVar3 = yciVar2;
                    z4 = z2;
                }
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
            }
            z2 = z;
            oq5Var.q();
            if ((57344 & i6) == 16384) {
            }
            K = oq5Var.K();
            if (!z3) {
            }
            K = new k32(2, function1);
            oq5Var.k0(K);
            zwf.a(yciVar2, bciVar, z2, true, (Function1) K, oq5Var, (i6 & 14) | 24640 | (i6 & 112) | (i6 & 896) | (i6 & 7168));
            yciVar3 = yciVar2;
            z4 = z2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu0(yciVar3, bciVar, z4, function1, i2, i3, 2);
        }
    }

    public static final Drawable g0(dx8 dx8Var, DisplayMetrics displayMetrics, xzb xzbVar) {
        szb szbVar;
        szb szbVar2;
        if (dx8Var == null) {
            b6e.s();
            return null;
        }
        lj9 lj9Var = dx8Var.b;
        kj9 kj9Var = lj9Var.b;
        szb szbVar3 = lj9Var.a;
        ln9 ln9Var = lj9Var.c;
        if (kj9Var instanceof jj9) {
            qh9 qh9Var = ((jj9) kj9Var).b;
            jz8 jz8Var = qh9Var.d;
            ln9 ln9Var2 = qh9Var.e;
            float j0 = bg3.j0(jz8Var, displayMetrics, xzbVar);
            float j02 = bg3.j0(qh9Var.c, displayMetrics, xzbVar);
            szb szbVar4 = qh9Var.a;
            if (szbVar4 != null) {
                szbVar3 = szbVar4;
            }
            int intValue = ((Number) szbVar3.a(xzbVar)).intValue();
            float j03 = bg3.j0(qh9Var.b, displayMetrics, xzbVar);
            ln9 ln9Var3 = ln9Var2 == null ? ln9Var : ln9Var2;
            Integer num = (ln9Var3 == null || (szbVar2 = ln9Var3.a) == null) ? null : (Integer) szbVar2.a(xzbVar);
            if (ln9Var2 != null) {
                ln9Var = ln9Var2;
            }
            return new aho(new zgo(j0, j02, intValue, j03, num, ln9Var != null ? Float.valueOf(bg3.n0((Number) ln9Var.d.a(xzbVar), displayMetrics, (jk9) ln9Var.c.a(xzbVar))) : null));
        }
        if (!(kj9Var instanceof ij9)) {
            return null;
        }
        zq8 zq8Var = ((ij9) kj9Var).b;
        jz8 jz8Var2 = zq8Var.b;
        ln9 ln9Var4 = zq8Var.c;
        float j04 = bg3.j0(jz8Var2, displayMetrics, xzbVar);
        szb szbVar5 = zq8Var.a;
        if (szbVar5 != null) {
            szbVar3 = szbVar5;
        }
        int intValue2 = ((Number) szbVar3.a(xzbVar)).intValue();
        ln9 ln9Var5 = ln9Var4 == null ? ln9Var : ln9Var4;
        Integer num2 = (ln9Var5 == null || (szbVar = ln9Var5.a) == null) ? null : (Integer) szbVar.a(xzbVar);
        if (ln9Var4 != null) {
            ln9Var = ln9Var4;
        }
        return new hl4(new gl4(j04, intValue2, num2, ln9Var != null ? Float.valueOf(bg3.n0((Number) ln9Var.d.a(xzbVar), displayMetrics, (jk9) ln9Var.c.a(xzbVar))) : null));
    }

    public static final void h(final yci yciVar, final kub kubVar, final xan xanVar, final Function0 function0, hq5 hq5Var, final int i2) {
        oq5 oq5Var;
        xmn r;
        Function2 function2;
        xxk xxkVar;
        oq5 oq5Var2;
        aqi J;
        Continuation continuation;
        aqi aqiVar;
        Continuation continuation2;
        arf b2;
        xo6 xo6Var;
        fk0 fk0Var;
        boolean z;
        boolean z2;
        ld1 ld1Var;
        kjn kjnVar = gq5.a;
        yciVar.getClass();
        kubVar.getClass();
        xanVar.getClass();
        function0.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(1521951635);
        int i3 = (oq5Var3.f(yciVar) ? 4 : 2) | i2 | (oq5Var3.f(kubVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var3.f(xanVar) : oq5Var3.h(xanVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var3.h(function0) ? 2048 : 1024;
        }
        int i4 = i3;
        if (oq5Var3.P(i4 & 1, (i4 & 1171) != 1170)) {
            rnl rnlVar = (rnl) gld.O(kubVar.h, oq5Var3).getValue();
            if (rnlVar == null) {
                r = oq5Var3.r();
                if (r != null) {
                    final int i5 = 0;
                    function2 = new Function2() { // from class: rtb
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    vq1.h(yciVar, kubVar, xanVar, function0, (hq5) obj, rvf.R(i2 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    vq1.h(yciVar, kubVar, xanVar, function0, (hq5) obj, rvf.R(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            qan qanVar = rnlVar.b;
            aqi O = gld.O(kubVar.j, oq5Var3);
            aqi M = gld.M(kubVar.g, oq5Var3);
            xxk xxkVar2 = qanVar.b;
            vxk vxkVar = xxkVar2.a;
            if (vxkVar != null && vxkVar.c) {
                oq5Var3.Z(-1507987719);
                u7g u7gVar = vxkVar.a;
                dzf dzfVar = (dzf) oq5Var3.j(ykg.a);
                dcu dcuVar = dcu.One;
                Object K = oq5Var3.K();
                if (K == kjnVar) {
                    K = new aok(6);
                    oq5Var3.k0(K);
                }
                xxkVar = xxkVar2;
                J = t7g.B(u7gVar, true, (Function0) K, dzfVar, dcuVar, oq5Var3, 432, 0);
                oq5Var2 = oq5Var3;
                oq5Var2.p(false);
            } else {
                xxkVar = xxkVar2;
                oq5Var2 = oq5Var3;
                oq5Var2.Z(-1507832688);
                J = hyf.J(vxkVar != null ? vxkVar.a : null, true, oq5Var2, 48);
                oq5Var2.p(false);
            }
            aqi aqiVar2 = J;
            Unit unit = Unit.a;
            boolean f2 = oq5Var2.f(aqiVar2) | ((i4 & 112) == 32);
            Object K2 = oq5Var2.K();
            if (f2 || K2 == kjnVar) {
                continuation = null;
                K2 = new f98(aqiVar2, kubVar, continuation, 25);
                oq5Var2.k0(K2);
            } else {
                continuation = null;
            }
            gld.w(oq5Var2, unit, (Function2) K2);
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                K3 = gld.R(dm6.b(), oq5Var2);
                oq5Var2.k0(K3);
            }
            mm6 mm6Var = (mm6) K3;
            Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
            Object K4 = oq5Var2.K();
            if (K4 == kjnVar) {
                K4 = new xo6(context, mm6Var);
                oq5Var2.k0(K4);
            }
            xo6 xo6Var2 = (xo6) K4;
            List w = xz0.w(new xxk[]{qanVar.a, qanVar.b, qanVar.c});
            x6k x6kVar = xo6Var2.c;
            if (Intrinsics.d(xo6Var2.d, w)) {
                continuation2 = continuation;
                aqiVar = aqiVar2;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                for (Object obj : w) {
                    if (((xxk) obj).e != null) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    xxk xxkVar3 = (xxk) it.next();
                    String str = xxkVar3.e;
                    str.getClass();
                    Map map = (Map) x6kVar.getValue();
                    aqi aqiVar3 = aqiVar2;
                    if (map == null || (b2 = (arf) map.remove(xxkVar3.e)) == null) {
                        b2 = btf.b(new aw5(10, xxkVar3, xo6Var2));
                    }
                    linkedHashMap.put(str, b2);
                    aqiVar2 = aqiVar3;
                }
                aqiVar = aqiVar2;
                Map map2 = (Map) x6kVar.getValue();
                if (map2 != null) {
                    Iterator it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        arf arfVar = (arf) ((Map.Entry) it2.next()).getValue();
                        if (arfVar.isInitialized()) {
                            ((bo6) arfVar.getValue()).g.g(null);
                        }
                    }
                }
                continuation2 = null;
                x6kVar.setValue(linkedHashMap);
                xo6Var2.d = w;
            }
            Object K5 = oq5Var2.K();
            if (K5 == kjnVar) {
                K5 = new ek1(context, mm6Var);
                oq5Var2.k0(K5);
            }
            ek1 ek1Var = (ek1) K5;
            List w2 = xz0.w(new xxk[]{qanVar.a, qanVar.b, qanVar.c});
            x6k x6kVar2 = ek1Var.c;
            if (!Intrinsics.d(ek1Var.d, w2)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : w2) {
                    if (((xxk) obj2).p != null) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    List list = ((xxk) it3.next()).p;
                    list.getClass();
                    Map map3 = (Map) x6kVar2.getValue();
                    if (map3 == null || (ld1Var = (ld1) map3.remove(list)) == null) {
                        Context context2 = ek1Var.a;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(cce.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        ld1Var = new ld1(list, context2, (cce) qdcVar.C(I), ek1Var.b);
                    }
                    linkedHashMap2.put(list, ld1Var);
                }
                x6kVar2.setValue(linkedHashMap2);
                ek1Var.d = w2;
            }
            Object K6 = oq5Var2.K();
            if (K6 == kjnVar) {
                K6 = bmq.a(oa5.a);
                oq5Var2.k0(K6);
            }
            fk0 fk0Var2 = (fk0) K6;
            xxk xxkVar4 = xxkVar;
            boolean f3 = oq5Var2.f(xxkVar4) | oq5Var2.h(fk0Var2);
            Object K7 = oq5Var2.K();
            if (f3 || K7 == kjnVar) {
                xo6Var = xo6Var2;
                K7 = new j57(xo6Var, xxkVar4, fk0Var2, continuation2, 22);
                fk0Var = fk0Var2;
                oq5Var2.k0(K7);
            } else {
                xo6Var = xo6Var2;
                fk0Var = fk0Var2;
            }
            gld.w(oq5Var2, xxkVar4, (Function2) K7);
            aqi M2 = gld.M(kubVar.m, oq5Var2);
            aqi M3 = gld.M(kubVar.k, oq5Var2);
            dyi L = ivf.L(oq5Var2);
            agr agrVar = AndroidCompositionLocals_androidKt.f;
            View view = (View) oq5Var2.j(agrVar);
            boolean w3 = p6g.w((t3h) M2.getValue());
            WeakHashMap weakHashMap = wdu.a;
            ndu.m(view, w3);
            t3h t3hVar = (t3h) M2.getValue();
            pbu pbuVar = (pbu) aqiVar.getValue();
            if (Intrinsics.d(t3hVar, q3h.a)) {
                z = false;
            } else {
                if (!(t3hVar instanceof s3h) && !(t3hVar instanceof r3h)) {
                    b6e.s();
                    return;
                }
                z = true;
            }
            if (Intrinsics.d(pbuVar, lbu.a) || (pbuVar instanceof mbu) || Intrinsics.d(pbuVar, nbu.a)) {
                z2 = false;
            } else {
                if (!(pbuVar instanceof obu)) {
                    b6e.s();
                    return;
                }
                z2 = true;
            }
            ((View) oq5Var2.j(agrVar)).setKeepScreenOn((z || z2) && ((v7l) O.getValue()).a && ((evo) M.getValue()) == evo.a);
            oq5 oq5Var4 = oq5Var2;
            pd.b(new qzm[0], true, ild.C(1346979530, new tvb(yciVar, L, rnlVar, fk0Var, xxkVar4, kubVar, M, aqiVar, O, M2, function0, xanVar, M3, xo6Var, ek1Var), oq5Var4), oq5Var4, 432, 0);
            oq5Var = oq5Var4;
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        r = oq5Var.r();
        if (r != null) {
            final int i6 = 1;
            function2 = new Function2() { // from class: rtb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj22) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj22).getClass();
                            vq1.h(yciVar, kubVar, xanVar, function0, (hq5) obj3, rvf.R(i2 | 1));
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            vq1.h(yciVar, kubVar, xanVar, function0, (hq5) obj3, rvf.R(i2 | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final ArrayList h0(List list, xzb xzbVar) {
        Object l33Var;
        List<hy8> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (hy8 hy8Var : list2) {
            if (hy8Var instanceof fy8) {
                long longValue = ((Number) ((fy8) hy8Var).b.a.a(xzbVar)).longValue();
                long j2 = longValue >> 31;
                l33Var = new k33((j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            } else {
                if (!(hy8Var instanceof gy8)) {
                    b6e.s();
                    return null;
                }
                l33Var = new l33();
            }
            arrayList.add(l33Var);
        }
        return arrayList;
    }

    public static final void i(aff affVar, hq5 hq5Var, int i2) {
        fvf fvfVar;
        off offVar;
        affVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(13160998);
        int i3 = (oq5Var.h(affVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            off offVar2 = (off) szf.Q(affVar.e, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, offVar2 instanceof kff, null, oq5Var, 4096, 5);
            yci a3 = androidx.compose.ui.platform.a.a(vci.a, "collection_kids_playlists_screen");
            boolean booleanValue = ((Boolean) szf.Q(affVar.f, oq5Var).getValue()).booleanValue();
            boolean h2 = oq5Var.h(affVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                fvfVar = a2;
                offVar = offVar2;
                v2d v2dVar = new v2d(0, affVar, aff.class, "onRefresh", "onRefresh()V", 0, 25);
                oq5Var.k0(v2dVar);
                K = v2dVar;
            } else {
                offVar = offVar2;
                fvfVar = a2;
            }
            h9f h9fVar = (h9f) K;
            boolean h3 = oq5Var.h(affVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                v2d v2dVar2 = new v2d(0, affVar, aff.class, "onBackClicked", "onBackClicked()V", 0, 27);
                oq5Var.k0(v2dVar2);
                K2 = v2dVar2;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h4 = oq5Var.h(affVar);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                v2d v2dVar3 = new v2d(0, affVar, aff.class, "onSearchClicked", "onSearchClicked()V", 0, 29);
                oq5Var.k0(v2dVar3);
                K3 = v2dVar3;
            }
            h9f h9fVar3 = (h9f) K3;
            boolean h5 = oq5Var.h(affVar);
            Object K4 = oq5Var.K();
            if (h5 || K4 == kjnVar) {
                pef pefVar = new pef(0, affVar, aff.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 0);
                oq5Var.k0(pefVar);
                K4 = pefVar;
            }
            xp3.g(ru.yandex.music.R.string.playlists, fvfVar, booleanValue, (Function0) h9fVar, (Function0) h9fVar2, a3, (Function0) h9fVar3, (Function0) ((h9f) K4), ild.C(-844244830, new vtb(6, offVar, affVar, fvfVar), oq5Var), oq5Var, 100859904, 0);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(affVar, i2, 25);
        }
    }

    public static final iq1 i0(g39 g39Var) {
        int ordinal = g39Var.ordinal();
        if (ordinal == 0) {
            return iq1.c;
        }
        if (ordinal == 1) {
            return iq1.a;
        }
        if (ordinal == 2) {
            return iq1.b;
        }
        if (ordinal == 3) {
            return iq1.d;
        }
        b6e.s();
        return null;
    }

    public static final void j(otb otbVar, t3h t3hVar, kub kubVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        zfr zfrVar;
        int i4;
        kub kubVar2;
        zwr zwrVar;
        s3h s3hVar;
        kjn kjnVar;
        int i5;
        kjn kjnVar2;
        kjn kjnVar3;
        kjn kjnVar4;
        kjn kjnVar5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(37828380);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(otbVar) : oq5Var.h(otbVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(t3hVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(kubVar) : oq5Var.h(kubVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i6 = i3;
        if (oq5Var.P(i6 & 1, (i6 & 1171) != 1170)) {
            boolean z = t3hVar instanceof s3h;
            kjn kjnVar6 = gq5.a;
            if (z) {
                oq5Var.Z(1664079419);
                aqi M = gld.M(kubVar.i, oq5Var);
                s3h s3hVar2 = (s3h) t3hVar;
                zwr zwrVar2 = s3hVar2.a;
                int i7 = i6 & 896;
                boolean z2 = i7 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar));
                Object K = oq5Var.K();
                if (z2 || K == kjnVar6) {
                    zwrVar = zwrVar2;
                    s3hVar = s3hVar2;
                    kjnVar = kjnVar6;
                    i5 = i7;
                    o57 o57Var = new o57(1, kubVar, kub.class, "onLyricLineClick", "onLyricLineClick(Lcom/yandex/music/screen/player/ui/SyncLyricsUiData$Lyric;)V", 0, 27);
                    oq5Var.k0(o57Var);
                    K = o57Var;
                } else {
                    s3hVar = s3hVar2;
                    kjnVar = kjnVar6;
                    zwrVar = zwrVar2;
                    i5 = i7;
                }
                h9f h9fVar = (h9f) K;
                boolean z3 = i5 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar));
                Object K2 = oq5Var.K();
                kjn kjnVar7 = kjnVar;
                if (z3 || K2 == kjnVar7) {
                    kjnVar2 = kjnVar7;
                    K2 = new ceb(0, kubVar, kub.class, "onCloseFullscreenLyricsClick", "onCloseFullscreenLyricsClick()V", 0, 15);
                    oq5Var.k0(K2);
                } else {
                    kjnVar2 = kjnVar7;
                }
                h9f h9fVar2 = (h9f) K2;
                boolean z4 = i5 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar));
                Object K3 = oq5Var.K();
                kjn kjnVar8 = kjnVar2;
                if (z4 || K3 == kjnVar8) {
                    kjnVar3 = kjnVar8;
                    K3 = new ceb(0, kubVar, kub.class, "onLyricsViewed", "onLyricsViewed()V", 0, 16);
                    oq5Var.k0(K3);
                } else {
                    kjnVar3 = kjnVar8;
                }
                h9f h9fVar3 = (h9f) K3;
                a3h a3hVar = s3hVar.b;
                boolean z5 = i5 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar));
                Object K4 = oq5Var.K();
                kjn kjnVar9 = kjnVar3;
                if (z5 || K4 == kjnVar9) {
                    kjnVar4 = kjnVar9;
                    K4 = new o57(1, kubVar, kub.class, "onLyricsScroll", "onLyricsScroll(Landroidx/compose/foundation/interaction/DragInteraction;)V", 0, 28);
                    oq5Var.k0(K4);
                } else {
                    kjnVar4 = kjnVar9;
                }
                h9f h9fVar4 = (h9f) K4;
                yci c2 = d.c(yciVar, 1.0f);
                boolean z6 = i5 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar));
                Object K5 = oq5Var.K();
                kjn kjnVar10 = kjnVar4;
                if (z6 || K5 == kjnVar10) {
                    kjnVar5 = kjnVar10;
                    K5 = new o57(1, kubVar, kub.class, "onSwipe", "onSwipe(Lcom/yandex/music/screen/player/ui/components/SwipeDirection;)V", 0, 29);
                    oq5Var.k0(K5);
                } else {
                    kjnVar5 = kjnVar10;
                }
                h9f h9fVar5 = (h9f) K5;
                boolean z7 = i5 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar));
                Object K6 = oq5Var.K();
                if (z7 || K6 == kjnVar5) {
                    K6 = new ceb(0, kubVar, kub.class, "onLyricsShown", "onLyricsShown()V", 0, 17);
                    oq5Var.k0(K6);
                }
                v7g.h(otbVar, M, zwrVar, a3hVar, (Function1) h9fVar, (Function0) h9fVar2, (Function0) h9fVar3, (Function1) h9fVar4, (Function1) h9fVar5, (Function0) ((h9f) K6), c2, oq5Var, i6 & 14);
                oq5Var.p(false);
            } else if (t3hVar instanceof r3h) {
                oq5Var.Z(1664772951);
                zfr zfrVar2 = ((r3h) t3hVar).a;
                int i8 = i6 & 896;
                boolean z8 = i8 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar));
                Object K7 = oq5Var.K();
                if (z8 || K7 == kjnVar6) {
                    zfrVar = zfrVar2;
                    i4 = i8;
                    aub aubVar = new aub(1, kubVar, kub.class, "onSwipe", "onSwipe(Lcom/yandex/music/screen/player/ui/components/SwipeDirection;)V", 0, 0);
                    kubVar2 = kubVar;
                    oq5Var.k0(aubVar);
                    K7 = aubVar;
                } else {
                    i4 = i8;
                    kubVar2 = kubVar;
                    zfrVar = zfrVar2;
                }
                h9f h9fVar6 = (h9f) K7;
                boolean z9 = i4 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar2));
                Object K8 = oq5Var.K();
                if (z9 || K8 == kjnVar6) {
                    K8 = new ceb(0, kubVar, kub.class, "onLyricsViewed", "onLyricsViewed()V", 0, 18);
                    kubVar2 = kubVar;
                    oq5Var.k0(K8);
                }
                h9f h9fVar7 = (h9f) K8;
                boolean z10 = i4 == 256 || ((i6 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(kubVar2));
                Object K9 = oq5Var.K();
                if (z10 || K9 == kjnVar6) {
                    K9 = new ceb(0, kubVar, kub.class, "onLyricsShown", "onLyricsShown()V", 0, 19);
                    oq5Var.k0(K9);
                }
                o8g.e(otbVar, zfrVar, (Function1) h9fVar6, (Function0) h9fVar7, (Function0) ((h9f) K9), yciVar, oq5Var, (i6 & 14) | (458752 & (i6 << 6)));
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(t3hVar, q3h.a)) {
                    throw vz1.i(oq5Var, 1993340996, false);
                }
                oq5Var.Z(1993375648);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 4, otbVar, t3hVar, kubVar, yciVar);
        }
    }

    public static final int j0(bk9 bk9Var, DisplayMetrics displayMetrics, xzb xzbVar, ViewGroup.LayoutParams layoutParams) {
        if (bk9Var == null) {
            return -2;
        }
        if (bk9Var instanceof zj9) {
            return -1;
        }
        if (bk9Var instanceof yj9) {
            return bg3.g0(((yj9) bk9Var).b, displayMetrics, xzbVar);
        }
        if (bk9Var instanceof ak9) {
            szb szbVar = ((ak9) bk9Var).b.a;
            return (szbVar != null && ((Boolean) szbVar.a(xzbVar)).booleanValue() && (layoutParams instanceof u79)) ? -3 : -2;
        }
        b6e.s();
        return 0;
    }

    public static final void k(vy3 vy3Var, ny3 ny3Var, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(925274579);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(vy3Var) : oq5Var.h(vy3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(ny3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5Var.invoke(yciVar, ild.C(-818113946, new ar(16, vy3Var, ny3Var), oq5Var), oq5Var, Integer.valueOf((i3 & 896) | ((i3 >> 9) & 14) | 48));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(vy3Var, ny3Var, false, wn5Var, yciVar, i2, 16);
        }
    }

    public static final PorterDuff.Mode k0(ip8 ip8Var) {
        int ordinal = ip8Var.ordinal();
        if (ordinal == 0) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (ordinal == 1) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (ordinal == 2) {
            return PorterDuff.Mode.DARKEN;
        }
        if (ordinal == 3) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (ordinal == 4) {
            return PorterDuff.Mode.MULTIPLY;
        }
        if (ordinal == 5) {
            return PorterDuff.Mode.SCREEN;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final void l(wx3 wx3Var, ny3 ny3Var, yci yciVar, hq5 hq5Var, int i2) {
        Object obj;
        int i3;
        ?? r13;
        int i4;
        wx3 wx3Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(270958896);
        int i5 = i2 | (oq5Var.h(wx3Var) ? 4 : 2) | (oq5Var.h(ny3Var) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i5 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            wx3Var2 = wx3Var;
        } else {
            yci u = xp3.u(d.c(yciVar, 1.0f), o5g.D(oq5Var));
            Object K = oq5Var.K();
            Object obj2 = gq5.a;
            if (K == obj2) {
                K = new zj3(23);
                oq5Var.k0(K);
            }
            yci b2 = nfp.b(u, false, (Function1) K);
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            w85 w85Var = new w85(((dq0) oq5Var.j(eq0.a)).c.c);
            vci vciVar = vci.a;
            yci u2 = xp3.u(androidx.compose.foundation.layout.a.o(d.c(vciVar, 1.0f), 8, 0.0f, 2), o5g.D(oq5Var));
            iz2 iz2Var = b2c.f;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            yci a2 = bVar.a(u2, iz2Var);
            Object K2 = oq5Var.K();
            int i7 = 24;
            if (K2 == obj2) {
                K2 = new zj3(i7);
                oq5Var.k0(K2);
            }
            p1g.b(wx3Var.a, wx3Var.b, androidx.compose.ui.platform.a.a(nfp.b(a2, false, (Function1) K2), "cards_image"), w85Var, null, null, null, hd6.a, 0.0f, 0, oq5Var, 0, 6, 15344);
            boolean h2 = oq5Var.h(ny3Var);
            Object K3 = oq5Var.K();
            if (h2 || K3 == obj2) {
                obj = obj2;
                i3 = i5;
                r13 = 0;
                i4 = 24;
                t93 t93Var = new t93(0, ny3Var, ny3.class, "swipeLeft", "swipeLeft()V", 0, 21);
                oq5Var.k0(t93Var);
                K3 = t93Var;
            } else {
                i3 = i5;
                obj = obj2;
                r13 = 0;
                i4 = 24;
            }
            Function0 function0 = (Function0) ((h9f) K3);
            yci a3 = bVar.a(ksw.D(vciVar, rvf.M(ru.yandex.music.R.string.slide_go_to_previous, oq5Var), null), b2c.e);
            Object K4 = oq5Var.K();
            if (K4 == obj) {
                K4 = new zj3(25);
                oq5Var.k0(K4);
            }
            sj2.e(function0, nfp.b(a3, r13, (Function1) K4), oq5Var, r13);
            boolean h3 = oq5Var.h(ny3Var);
            Object K5 = oq5Var.K();
            if (h3 || K5 == obj) {
                t93 t93Var2 = new t93(0, ny3Var, ny3.class, "swipeRight", "swipeRight()V", 0, 22);
                oq5Var.k0(t93Var2);
                K5 = t93Var2;
            }
            Function0 function02 = (Function0) ((h9f) K5);
            yci a4 = bVar.a(ksw.D(vciVar, rvf.M(ru.yandex.music.R.string.slide_go_to_next, oq5Var), null), b2c.g);
            Object K6 = oq5Var.K();
            if (K6 == obj) {
                K6 = new zj3(26);
                oq5Var.k0(K6);
            }
            sj2.e(function02, nfp.b(a4, r13, (Function1) K6), oq5Var, r13);
            wx3Var2 = wx3Var;
            xv xvVar = wx3Var2.c;
            if (xvVar == null) {
                oq5Var.Z(-855496863);
            } else {
                oq5Var.Z(-855496862);
                float f2 = 28;
                yci q = androidx.compose.foundation.layout.a.q(bVar.a(vciVar, b2c.i), f2, 0.0f, f2, i4, 2);
                Object K7 = oq5Var.K();
                if (K7 == obj) {
                    K7 = new zj3(20);
                    oq5Var.k0(K7);
                }
                y2x.c(xvVar, ny3Var, nfp.b(q, r13, (Function1) K7), oq5Var, i3 & 112);
            }
            oq5Var.p(r13);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(wx3Var2, ny3Var, yciVar, i2, 12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x043f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x064d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0bff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0b96 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0149  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [c5b] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [c5b] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v63, types: [c5b] */
    /* JADX WARN: Type inference failed for: r6v64, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v65, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ptq l0(SlidesResponseDto slidesResponseDto, boolean z) {
        List list;
        boolean z2;
        ArrayList arrayList;
        Iterator it;
        Object obj;
        Object obj2;
        ak2 yj2Var;
        String U;
        zd3 zd3Var;
        vd3 vd3Var;
        zd3 td3Var;
        String entityId;
        LikeButtonStateDataDto unliked;
        ud3 L;
        LikeButtonStateDataDto liked;
        ud3 L2;
        zd3 xd3Var;
        String title;
        String buttonColor;
        d85 T;
        d85 T2;
        o43 b0;
        String str;
        String message;
        wbk wbkVar;
        String artwork;
        ?? r4;
        q14 q14Var;
        g24 g24Var;
        EntityCoverDto cover;
        String uri;
        String title2;
        String subtitle;
        ThenNowComparisonSlideItemDto firstItem;
        jfs S;
        ThenNowComparisonSlideItemDto secondItem;
        jfs S2;
        ?? r5;
        ck1 ck1Var;
        u9b V;
        String str2;
        pas pasVar;
        u9b V2;
        String e2;
        List<ChartArtistSlideListItemDto> items;
        we4 we4Var;
        ve4 ve4Var;
        u9b V3;
        String e3;
        String title3;
        String subtitle2;
        String description;
        String str3;
        zds zdsVar;
        SlideDisclaimerDto disclaimer;
        ?? r6;
        pgr pgrVar;
        EntityCoverDto cover2;
        String uri2;
        ckq ckqVar;
        u9b V4;
        ldn ldnVar;
        QuizEntitySlideContentDto quizEntitySlideContentDto;
        Iterator it2;
        kdn kdnVar;
        String title4;
        u9b V5;
        etq etqVar;
        dtq o;
        bf4 bf4Var;
        ChartSlideContentDto chartSlideContentDto;
        Iterator it3;
        af4 af4Var;
        String e4;
        SlideDto slideDto;
        long j2;
        df4 df4Var;
        Iterator it4;
        SlideDto slideDto2;
        long j3;
        cf4 cf4Var;
        cf4 cf4Var2;
        String e5;
        Float animationDelay;
        String color;
        Integer b02;
        String str4;
        String str5;
        String firstFrameVideoUrl;
        List<TrackWithSmartPreviewDto> tracks;
        slidesResponseDto.getClass();
        List slides = slidesResponseDto.getSlides();
        if (slides == null || slides.isEmpty()) {
            return null;
        }
        String logo = slidesResponseDto.getLogo();
        String pathForSize = logo != null ? new jcv(logo, WebPath$Storage.AVATARS_NO_CROP).getPathForSize(frv.b() / 2) : null;
        ArrayList O = CollectionsKt.O(slidesResponseDto.getSlides());
        ArrayList<xsq> arrayList2 = new ArrayList();
        Iterator it5 = O.iterator();
        while (it5.hasNext()) {
            SlideDto slideDto3 = (SlideDto) it5.next();
            slideDto3.getClass();
            if (slideDto3.getId() == null) {
                it = it5;
                obj2 = null;
            } else {
                SlideTrailerDto trailer = slideDto3.getTrailer();
                if (trailer == null || (tracks = trailer.getTracks()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (TrackWithSmartPreviewDto trackWithSmartPreviewDto : tracks) {
                        h0r b03 = trackWithSmartPreviewDto != null ? zc4.b0(trackWithSmartPreviewDto) : null;
                        if (b03 != null) {
                            arrayList3.add(b03);
                        }
                    }
                    arrayList = arrayList3;
                }
                SlideBackgroundDto background = slideDto3.getBackground();
                if (background != null) {
                    String videoUrl = background.getVideoUrl();
                    if (videoUrl == null || (str5 = (String) avf.Q(videoUrl)) == null || (firstFrameVideoUrl = background.getFirstFrameVideoUrl()) == null) {
                        yj2Var = null;
                    } else {
                        String U2 = U(firstFrameVideoUrl);
                        String firstFrameHash = background.getFirstFrameHash();
                        String str6 = firstFrameHash != null ? (String) avf.Q(firstFrameHash) : null;
                        String lastFrameVideoUrl = background.getLastFrameVideoUrl();
                        String U3 = lastFrameVideoUrl != null ? U(lastFrameVideoUrl) : null;
                        Boolean withSound = background.getWithSound();
                        boolean booleanValue = withSound != null ? withSound.booleanValue() : false;
                        Boolean withPersonalColor = background.getWithPersonalColor();
                        boolean booleanValue2 = withPersonalColor != null ? withPersonalColor.booleanValue() : false;
                        String videoId = background.getVideoId();
                        Boolean videoLoopEnabled = background.getVideoLoopEnabled();
                        yj2Var = new yj2(str5, U2, str6, U3, booleanValue, booleanValue2, videoId, videoLoopEnabled != null ? videoLoopEnabled.booleanValue() : false, z);
                    }
                    if (yj2Var == null) {
                        String bgImageUrl = background.getBgImageUrl();
                        if (bgImageUrl != null) {
                            U = U(bgImageUrl);
                        } else {
                            String lastFrameVideoUrl2 = background.getLastFrameVideoUrl();
                            if (lastFrameVideoUrl2 != null) {
                                U = U(lastFrameVideoUrl2);
                            } else {
                                String firstFrameVideoUrl2 = background.getFirstFrameVideoUrl();
                                U = firstFrameVideoUrl2 != null ? U(firstFrameVideoUrl2) : null;
                                if (U == null) {
                                    yj2Var = null;
                                    if (yj2Var == null) {
                                        yj2Var = zj2.a;
                                    }
                                }
                            }
                        }
                        Boolean withPersonalColor2 = background.getWithPersonalColor();
                        yj2Var = new xj2(U, withPersonalColor2 != null ? withPersonalColor2.booleanValue() : false);
                        if (yj2Var == null) {
                        }
                    }
                    ak2 ak2Var = yj2Var;
                    SlideButtonDto button = slideDto3.getButton();
                    if (button instanceof ActionButtonSlideDto) {
                        ActionButtonSlideDto actionButtonSlideDto = (ActionButtonSlideDto) slideDto3.getButton();
                        actionButtonSlideDto.getClass();
                        ActionButtonSlideDataDto data = actionButtonSlideDto.getData();
                        if (data != null) {
                            BlockActionDto action = data.getAction();
                            o43 b04 = action != null ? jf0.b0(action) : null;
                            String imageUrl = data.getImageUrl();
                            String title5 = data.getTitle();
                            if (title5 != null && b04 != null && (str4 = b04.a) != null) {
                                td3Var = new sd3(imageUrl, title5, str4);
                                zd3Var = td3Var;
                            }
                        }
                        td3Var = null;
                        zd3Var = td3Var;
                    } else if (button instanceof ShareButtonSlideDto) {
                        ShareButtonSlideDto shareButtonSlideDto = (ShareButtonSlideDto) slideDto3.getButton();
                        shareButtonSlideDto.getClass();
                        ShareButtonSlideDataDto data2 = shareButtonSlideDto.getData();
                        if (data2 != null) {
                            d85 T3 = pd.T(data2.getBgColor());
                            d85 T4 = pd.T(data2.getTitleColor());
                            String title6 = data2.getTitle();
                            if (title6 != null && (message = data2.getMessage()) != null) {
                                td3Var = new wd3(T3, T4, title6, message);
                                zd3Var = td3Var;
                            }
                        }
                        td3Var = null;
                        zd3Var = td3Var;
                    } else {
                        if (button instanceof WaveButtonSlideDto) {
                            WaveButtonSlideDto waveButtonSlideDto = (WaveButtonSlideDto) slideDto3.getButton();
                            waveButtonSlideDto.getClass();
                            WaveDto data3 = waveButtonSlideDto.getData();
                            if (data3 != null) {
                                WaveColorsDto colors = data3.getColors();
                                String title7 = data3.getTitle();
                                if (title7 != null) {
                                    String header = data3.getHeader();
                                    String stationId = data3.getStationId();
                                    if (stationId != null) {
                                        String imageUrl2 = data3.getImageUrl();
                                        String bgImageUrl2 = data3.getBgImageUrl();
                                        d85 T5 = pd.T(colors != null ? colors.getAverage() : null);
                                        d85 T6 = pd.T(colors != null ? colors.getWaveText() : null);
                                        List seeds = data3.getSeeds();
                                        if (seeds != null) {
                                            ArrayList O2 = CollectionsKt.O(seeds);
                                            ArrayList arrayList4 = O2.isEmpty() ? null : O2;
                                            if (arrayList4 != null) {
                                                xd3Var = new yd3(title7, header, stationId, imageUrl2, bgImageUrl2, T5, T6, arrayList4);
                                                td3Var = xd3Var;
                                            }
                                        }
                                    }
                                }
                            }
                            td3Var = null;
                        } else {
                            if (button instanceof SimpleButtonSlideDto) {
                                SimpleButtonSlideDto simpleButtonSlideDto = (SimpleButtonSlideDto) slideDto3.getButton();
                                simpleButtonSlideDto.getClass();
                                SimpleButtonSlideDataDto data4 = simpleButtonSlideDto.getData();
                                if (data4 != null && (title = data4.getTitle()) != null && (buttonColor = data4.getButtonColor()) != null && (T = pd.T(buttonColor)) != null) {
                                    long j4 = T.a;
                                    String textColor = data4.getTextColor();
                                    if (textColor != null && (T2 = pd.T(textColor)) != null) {
                                        long j5 = T2.a;
                                        BlockActionDto action2 = data4.getAction();
                                        if (action2 != null && (b0 = jf0.b0(action2)) != null && (str = b0.a) != null) {
                                            xd3Var = new xd3(j4, j5, title, str);
                                            td3Var = xd3Var;
                                        }
                                    }
                                }
                            } else if (button instanceof LikeButtonSlideDto) {
                                LikeButtonSlideDto likeButtonSlideDto = (LikeButtonSlideDto) slideDto3.getButton();
                                likeButtonSlideDto.getClass();
                                LikeButtonSlideDataDto data5 = likeButtonSlideDto.getData();
                                if (data5 != null) {
                                    ehv ehvVar = vd3.a;
                                    String entityType = data5.getEntityType();
                                    ehvVar.getClass();
                                    if (entityType != null) {
                                        switch (entityType.hashCode()) {
                                            case -1632865838:
                                                if (entityType.equals("PLAYLIST")) {
                                                    vd3Var = vd3.f;
                                                    break;
                                                }
                                                break;
                                            case 2071376:
                                                if (entityType.equals("CLIP")) {
                                                    vd3Var = vd3.e;
                                                    break;
                                                }
                                                break;
                                            case 62359119:
                                                if (entityType.equals("ALBUM")) {
                                                    vd3Var = vd3.d;
                                                    break;
                                                }
                                                break;
                                            case 80083243:
                                                if (entityType.equals("TRACK")) {
                                                    vd3Var = vd3.b;
                                                    break;
                                                }
                                                break;
                                            case 1939198791:
                                                if (entityType.equals("ARTIST")) {
                                                    vd3Var = vd3.c;
                                                    break;
                                                }
                                                break;
                                        }
                                        entityId = data5.getEntityId();
                                        if (entityId != null && vd3Var != null && (unliked = data5.getUnliked()) != null && (L = ild.L(unliked)) != null && (liked = data5.getLiked()) != null && (L2 = ild.L(liked)) != null) {
                                            td3Var = new td3(entityId, vd3Var, L, L2);
                                        }
                                    }
                                    vd3Var = null;
                                    entityId = data5.getEntityId();
                                    if (entityId != null) {
                                        td3Var = new td3(entityId, vd3Var, L, L2);
                                    }
                                }
                            } else {
                                if (button != null) {
                                    b6e.s();
                                    return null;
                                }
                                zd3Var = null;
                            }
                            td3Var = null;
                        }
                        zd3Var = td3Var;
                    }
                    SlideMetaDto meta = slideDto3.getMeta();
                    d85 d85Var = (meta == null || (color = meta.getColor()) == null || (b02 = y2x.b0(color)) == null) ? null : new d85(c3x.f(b02.intValue()));
                    SlideMetaDto meta2 = slideDto3.getMeta();
                    long floatValue = (long) (((meta2 == null || (animationDelay = meta2.getAnimationDelay()) == null) ? 0.5f : animationDelay.floatValue()) * 1000);
                    String promoLogo = slideDto3.getPromoLogo();
                    String pathForSize2 = promoLogo != null ? new jcv(promoLogo, WebPath$Storage.AVATARS).getPathForSize(frv.b()) : null;
                    SlideContentDto content = slideDto3.getContent();
                    if (content instanceof ChartFavouritesSlideContentDto) {
                        ChartFavouritesSlideContentDto chartFavouritesSlideContentDto = (ChartFavouritesSlideContentDto) slideDto3.getContent();
                        chartFavouritesSlideContentDto.getClass();
                        if (chartFavouritesSlideContentDto.getData() == null) {
                            it = it5;
                            slideDto = slideDto3;
                            j2 = floatValue;
                            df4Var = null;
                            obj = null;
                        } else {
                            pas pasVar2 = new pas(chartFavouritesSlideContentDto.getData().getValue(), chartFavouritesSlideContentDto.getData().getValueDescription(), chartFavouritesSlideContentDto.getData().getValueSuffix(), chartFavouritesSlideContentDto.getData().getFooter(), chartFavouritesSlideContentDto.getData().getDescription(), null, null, null, null);
                            String description2 = chartFavouritesSlideContentDto.getData().getDescription();
                            List<SlideListItemDto> items2 = chartFavouritesSlideContentDto.getData().getItems();
                            if (items2 != null) {
                                ArrayList arrayList5 = new ArrayList();
                                for (SlideListItemDto slideListItemDto : items2) {
                                    if (slideListItemDto != null) {
                                        cf4Var = null;
                                        String title8 = slideListItemDto.getTitle();
                                        it4 = it5;
                                        String subtitle3 = slideListItemDto.getSubtitle();
                                        EntityCoverDto cover3 = slideListItemDto.getCover();
                                        slideDto2 = slideDto3;
                                        if (cover3 != null) {
                                            u9b V6 = c3x.V(cover3);
                                            j3 = floatValue;
                                            if (V6 != null && (e5 = V6.e(wct.s(), WebPath$Storage.AVATARS)) != null) {
                                                cf4Var2 = new cf4(title8, subtitle3, e5, Intrinsics.d(slideListItemDto.getCoverType(), "CIRCLE") ? etq.b : etq.a);
                                                if (cf4Var2 == null) {
                                                    arrayList5.add(cf4Var2);
                                                }
                                                it5 = it4;
                                                slideDto3 = slideDto2;
                                                floatValue = j3;
                                            }
                                        } else {
                                            j3 = floatValue;
                                        }
                                    } else {
                                        it4 = it5;
                                        slideDto2 = slideDto3;
                                        j3 = floatValue;
                                        cf4Var = null;
                                    }
                                    cf4Var2 = cf4Var;
                                    if (cf4Var2 == null) {
                                    }
                                    it5 = it4;
                                    slideDto3 = slideDto2;
                                    floatValue = j3;
                                }
                                it = it5;
                                slideDto = slideDto3;
                                j2 = floatValue;
                                obj = null;
                                Boolean isOrderVisible = chartFavouritesSlideContentDto.getData().getIsOrderVisible();
                                boolean booleanValue3 = isOrderVisible != null ? isOrderVisible.booleanValue() : false;
                                btq btqVar = dtq.b;
                                dtq o2 = hag.o(chartFavouritesSlideContentDto.getData().getAlign());
                                if (o2 == null) {
                                    o2 = dtq.b;
                                }
                                df4Var = new df4(pasVar2, description2, booleanValue3, arrayList5, o2);
                            } else {
                                it = it5;
                                slideDto = slideDto3;
                                j2 = floatValue;
                                obj = null;
                                df4Var = null;
                            }
                        }
                        if (df4Var != null) {
                            obj2 = new isq(slideDto.getId(), arrayList, df4Var, ak2Var, zd3Var, d85Var, j2, pathForSize2);
                        }
                    } else {
                        it = it5;
                        obj = null;
                        if (content instanceof ChartSlideContentDto) {
                            ChartSlideContentDto chartSlideContentDto2 = (ChartSlideContentDto) slideDto3.getContent();
                            chartSlideContentDto2.getClass();
                            if (chartSlideContentDto2.getData() != null) {
                                String description3 = chartSlideContentDto2.getData().getDescription();
                                Boolean isOrderVisible2 = chartSlideContentDto2.getData().getIsOrderVisible();
                                boolean booleanValue4 = isOrderVisible2 != null ? isOrderVisible2.booleanValue() : false;
                                List items3 = chartSlideContentDto2.getData().getItems();
                                if (items3 != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it6 = items3.iterator();
                                    while (it6.hasNext()) {
                                        SlideListItemDto slideListItemDto2 = (SlideListItemDto) it6.next();
                                        if (slideListItemDto2 != null) {
                                            String title9 = slideListItemDto2.getTitle();
                                            String subtitle4 = slideListItemDto2.getSubtitle();
                                            EntityCoverDto cover4 = slideListItemDto2.getCover();
                                            chartSlideContentDto = chartSlideContentDto2;
                                            if (cover4 != null) {
                                                u9b V7 = c3x.V(cover4);
                                                it3 = it6;
                                                if (V7 != null && (e4 = V7.e(wct.s(), WebPath$Storage.AVATARS)) != null) {
                                                    af4Var = new af4(title9, subtitle4, e4, Intrinsics.d(slideListItemDto2.getCoverType(), "CIRCLE") ? etq.b : etq.a);
                                                    if (af4Var != null) {
                                                        arrayList6.add(af4Var);
                                                    }
                                                    it6 = it3;
                                                    chartSlideContentDto2 = chartSlideContentDto;
                                                }
                                                af4Var = null;
                                                if (af4Var != null) {
                                                }
                                                it6 = it3;
                                                chartSlideContentDto2 = chartSlideContentDto;
                                            }
                                        } else {
                                            chartSlideContentDto = chartSlideContentDto2;
                                        }
                                        it3 = it6;
                                        af4Var = null;
                                        if (af4Var != null) {
                                        }
                                        it6 = it3;
                                        chartSlideContentDto2 = chartSlideContentDto;
                                    }
                                    ChartSlideContentDto chartSlideContentDto3 = chartSlideContentDto2;
                                    List<SlideListItemDto> items4 = chartSlideContentDto3.getData().getItems();
                                    if (!(items4 instanceof Collection) || !items4.isEmpty()) {
                                        for (SlideListItemDto slideListItemDto3 : items4) {
                                            if (!Intrinsics.d(slideListItemDto3 != null ? slideListItemDto3.getCoverType() : null, "CIRCLE")) {
                                                etqVar = etq.a;
                                                etq etqVar2 = etqVar;
                                                btq btqVar2 = dtq.b;
                                                o = hag.o(chartSlideContentDto3.getData().getAlign());
                                                if (o == null) {
                                                    o = dtq.b;
                                                }
                                                bf4Var = new bf4(description3, booleanValue4, arrayList6, etqVar2, o);
                                                if (bf4Var != null) {
                                                    obj2 = new gsq(slideDto3.getId(), arrayList, bf4Var, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                                                }
                                            }
                                        }
                                    }
                                    etqVar = etq.b;
                                    etq etqVar22 = etqVar;
                                    btq btqVar22 = dtq.b;
                                    o = hag.o(chartSlideContentDto3.getData().getAlign());
                                    if (o == null) {
                                    }
                                    bf4Var = new bf4(description3, booleanValue4, arrayList6, etqVar22, o);
                                    if (bf4Var != null) {
                                    }
                                }
                            }
                            bf4Var = null;
                            if (bf4Var != null) {
                            }
                        } else if (content instanceof DefaultEntitySlideContentDto) {
                            obj2 = new dsq(slideDto3.getId(), arrayList, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                        } else if (content instanceof QuizEntitySlideContentDto) {
                            QuizEntitySlideContentDto quizEntitySlideContentDto2 = (QuizEntitySlideContentDto) slideDto3.getContent();
                            quizEntitySlideContentDto2.getClass();
                            if (quizEntitySlideContentDto2.getData() != null) {
                                String description4 = quizEntitySlideContentDto2.getData().getDescription();
                                List items5 = quizEntitySlideContentDto2.getData().getItems();
                                if (items5 != null) {
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it7 = items5.iterator();
                                    while (it7.hasNext()) {
                                        SlideListItemDto slideListItemDto4 = (SlideListItemDto) it7.next();
                                        if (slideListItemDto4 != null && (title4 = slideListItemDto4.getTitle()) != null) {
                                            String subtitle5 = slideListItemDto4.getSubtitle();
                                            EntityCoverDto cover5 = slideListItemDto4.getCover();
                                            if (cover5 != null && (V5 = c3x.V(cover5)) != null) {
                                                quizEntitySlideContentDto = quizEntitySlideContentDto2;
                                                it2 = it7;
                                                String e6 = V5.e(wct.s(), WebPath$Storage.AVATARS);
                                                if (e6 != null) {
                                                    kdnVar = new kdn(title4, subtitle5, e6, Intrinsics.d(slideListItemDto4.getCoverType(), "CIRCLE") ? etq.b : etq.a);
                                                    if (kdnVar != null) {
                                                        arrayList7.add(kdnVar);
                                                    }
                                                    quizEntitySlideContentDto2 = quizEntitySlideContentDto;
                                                    it7 = it2;
                                                }
                                                kdnVar = null;
                                                if (kdnVar != null) {
                                                }
                                                quizEntitySlideContentDto2 = quizEntitySlideContentDto;
                                                it7 = it2;
                                            }
                                        }
                                        quizEntitySlideContentDto = quizEntitySlideContentDto2;
                                        it2 = it7;
                                        kdnVar = null;
                                        if (kdnVar != null) {
                                        }
                                        quizEntitySlideContentDto2 = quizEntitySlideContentDto;
                                        it7 = it2;
                                    }
                                    QuizEntitySlideContentDto quizEntitySlideContentDto3 = quizEntitySlideContentDto2;
                                    btq btqVar3 = dtq.b;
                                    dtq o3 = hag.o(quizEntitySlideContentDto3.getData().getAlign());
                                    if (o3 == null) {
                                        o3 = dtq.b;
                                    }
                                    ldnVar = new ldn(description4, arrayList7, o3);
                                    if (ldnVar != null) {
                                        obj2 = new osq(slideDto3.getId(), arrayList, ldnVar, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                                    }
                                }
                            }
                            ldnVar = null;
                            if (ldnVar != null) {
                            }
                        } else if (content instanceof SingleEntitySlideContentDto) {
                            SingleEntitySlideContentDto singleEntitySlideContentDto = (SingleEntitySlideContentDto) slideDto3.getContent();
                            singleEntitySlideContentDto.getClass();
                            if (singleEntitySlideContentDto.getData() == null || (cover2 = singleEntitySlideContentDto.getData().getCover()) == null || (uri2 = cover2.getUri()) == null) {
                                ckqVar = null;
                            } else {
                                String E = ltg.E(uri2);
                                String title10 = singleEntitySlideContentDto.getData().getTitle();
                                String subtitle6 = singleEntitySlideContentDto.getData().getSubtitle();
                                String description5 = singleEntitySlideContentDto.getData().getDescription();
                                saf t = t(E, singleEntitySlideContentDto.getData().getCoverMask(), singleEntitySlideContentDto.getData().getCoverBackground());
                                EntityCoverDto smallRoundCover = singleEntitySlideContentDto.getData().getSmallRoundCover();
                                String e7 = (smallRoundCover == null || (V4 = c3x.V(smallRoundCover)) == null) ? null : V4.e(wct.s(), WebPath$Storage.AVATARS);
                                boolean d2 = Intrinsics.d(singleEntitySlideContentDto.getData().getEntityType(), "REWIND");
                                btq btqVar4 = dtq.b;
                                dtq o4 = hag.o(singleEntitySlideContentDto.getData().getAlign());
                                if (o4 == null) {
                                    o4 = dtq.b;
                                }
                                dtq dtqVar = o4;
                                String color2 = singleEntitySlideContentDto.getData().getCover().getColor();
                                ckqVar = new ckq(title10, subtitle6, description5, d2, t, e7, dtqVar, color2 != null ? pd.T(color2) : null);
                            }
                            if (ckqVar != null) {
                                obj2 = new psq(slideDto3.getId(), arrayList, ckqVar, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (content instanceof StatsSlideContentDto) {
                            StatsSlideContentDto statsSlideContentDto = (StatsSlideContentDto) slideDto3.getContent();
                            statsSlideContentDto.getClass();
                            if (statsSlideContentDto.getData() == null) {
                                pgrVar = null;
                            } else {
                                String header2 = statsSlideContentDto.getData().getHeader();
                                String footer = statsSlideContentDto.getData().getFooter();
                                List<StatEntityDto> stats = statsSlideContentDto.getData().getStats();
                                if (stats != null) {
                                    r6 = new ArrayList();
                                    for (StatEntityDto statEntityDto : stats) {
                                        ogr ogrVar = statEntityDto != null ? new ogr(statEntityDto.getValue(), statEntityDto.getValueSuffix(), statEntityDto.getValueDescription()) : null;
                                        if (ogrVar != null) {
                                            r6.add(ogrVar);
                                        }
                                    }
                                } else {
                                    r6 = c5b.a;
                                }
                                btq btqVar5 = dtq.b;
                                dtq o5 = hag.o(statsSlideContentDto.getData().getAlign());
                                if (o5 == null) {
                                    o5 = dtq.b;
                                }
                                pgrVar = new pgr(header2, footer, r6, o5);
                            }
                            if (pgrVar != null) {
                                obj2 = new rsq(slideDto3.getId(), arrayList, pgrVar, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (content instanceof TextSlideContentDto) {
                            TextSlideContentDto textSlideContentDto = (TextSlideContentDto) slideDto3.getContent();
                            textSlideContentDto.getClass();
                            if (textSlideContentDto.getData() == null) {
                                zdsVar = null;
                            } else {
                                String title11 = textSlideContentDto.getData().getTitle();
                                String subtitle7 = textSlideContentDto.getData().getSubtitle();
                                btq btqVar6 = dtq.b;
                                dtq o6 = hag.o(textSlideContentDto.getData().getAlign());
                                if (o6 == null) {
                                    o6 = dtq.b;
                                }
                                dtq dtqVar2 = o6;
                                String titleSize = textSlideContentDto.getData().getTitleSize();
                                if (titleSize != null) {
                                    str3 = titleSize.toLowerCase(Locale.ROOT);
                                    str3.getClass();
                                } else {
                                    str3 = null;
                                }
                                boolean d3 = Intrinsics.d(str3, "big");
                                s7g s7gVar = bes.a;
                                s7g s7gVar2 = d3 ? aes.a : Intrinsics.d(str3, "small") ? s7gVar : null;
                                s7g s7gVar3 = s7gVar2 == null ? s7gVar : s7gVar2;
                                SlideDisclaimerDto disclaimer2 = textSlideContentDto.getData().getDisclaimer();
                                zdsVar = new zds(title11, subtitle7, dtqVar2, s7gVar3, disclaimer2 != null ? gut.u1(disclaimer2) : null);
                            }
                            if (zdsVar != null) {
                                String id = slideDto3.getId();
                                TextSlideDataDto data6 = ((TextSlideContentDto) slideDto3.getContent()).getData();
                                obj2 = new ssq(id, arrayList, zdsVar, ak2Var, zd3Var, d85Var, floatValue, pathForSize2, (data6 == null || (disclaimer = data6.getDisclaimer()) == null) ? null : gut.u1(disclaimer));
                            }
                        } else if (content instanceof ExtendedTextSlideContentDto) {
                            ExtendedTextSlideContentDto extendedTextSlideContentDto = (ExtendedTextSlideContentDto) slideDto3.getContent();
                            extendedTextSlideContentDto.getClass();
                            ExtendedTextSlideDataDto data7 = extendedTextSlideContentDto.getData();
                            o0c o0cVar = (data7 == null || (title3 = data7.getTitle()) == null || (subtitle2 = extendedTextSlideContentDto.getData().getSubtitle()) == null || (description = extendedTextSlideContentDto.getData().getDescription()) == null) ? null : new o0c(title3, subtitle2, description);
                            if (o0cVar != null) {
                                obj2 = new msq(slideDto3.getId(), arrayList, o0cVar, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (content instanceof ChartArtistSlideContentDto) {
                            ChartArtistSlideContentDto chartArtistSlideContentDto = (ChartArtistSlideContentDto) slideDto3.getContent();
                            chartArtistSlideContentDto.getClass();
                            if (chartArtistSlideContentDto.getData() != null) {
                                String title12 = chartArtistSlideContentDto.getData().getTitle();
                                EntityCoverDto cover6 = chartArtistSlideContentDto.getData().getCover();
                                if (cover6 != null && (V2 = c3x.V(cover6)) != null && (e2 = V2.e(wct.s(), WebPath$Storage.AVATARS)) != null && (items = chartArtistSlideContentDto.getData().getItems()) != null) {
                                    ArrayList arrayList8 = new ArrayList();
                                    for (ChartArtistSlideListItemDto chartArtistSlideListItemDto : items) {
                                        if (chartArtistSlideListItemDto != null) {
                                            Long value = chartArtistSlideListItemDto.getValue();
                                            String title13 = chartArtistSlideListItemDto.getTitle();
                                            String subtitle8 = chartArtistSlideListItemDto.getSubtitle();
                                            ue4 ue4Var = Intrinsics.d(chartArtistSlideListItemDto.getTitleType(), "NUMBER") ? ue4.a : ue4.b;
                                            EntityCoverDto cover7 = chartArtistSlideListItemDto.getCover();
                                            ve4Var = (cover7 == null || (V3 = c3x.V(cover7)) == null || (e3 = V3.e(wct.s(), WebPath$Storage.AVATARS)) == null) ? null : new ve4(value, title13, subtitle8, ue4Var, e3, Intrinsics.d(chartArtistSlideListItemDto.getCoverType(), "CIRCLE") ? etq.b : etq.a);
                                        } else {
                                            ve4Var = null;
                                        }
                                        if (ve4Var != null) {
                                            arrayList8.add(ve4Var);
                                        }
                                    }
                                    btq btqVar7 = dtq.b;
                                    dtq o7 = hag.o(chartArtistSlideContentDto.getData().getAlign());
                                    if (o7 == null) {
                                        o7 = dtq.b;
                                    }
                                    we4Var = new we4(e2, title12, arrayList8, o7);
                                    if (we4Var != null) {
                                        obj2 = new hsq(slideDto3.getId(), arrayList, we4Var, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                                    }
                                }
                            }
                            we4Var = null;
                            if (we4Var != null) {
                            }
                        } else if (content instanceof TextFactSlideContentDto) {
                            TextFactSlideContentDto textFactSlideContentDto = (TextFactSlideContentDto) slideDto3.getContent();
                            textFactSlideContentDto.getClass();
                            if (textFactSlideContentDto.getData() == null) {
                                pasVar = null;
                            } else {
                                Long value2 = textFactSlideContentDto.getData().getValue();
                                String valueDescription = textFactSlideContentDto.getData().getValueDescription();
                                String valueSuffix = textFactSlideContentDto.getData().getValueSuffix();
                                String footer2 = textFactSlideContentDto.getData().getFooter();
                                btq btqVar8 = dtq.b;
                                dtq o8 = hag.o(textFactSlideContentDto.getData().getAlign());
                                if (o8 == null) {
                                    o8 = dtq.b;
                                }
                                dtq dtqVar3 = o8;
                                String smallCover = textFactSlideContentDto.getData().getSmallCover();
                                if (smallCover != null) {
                                    int s = wct.s();
                                    CoverPath jcvVar = smallCover.length() > 0 ? new jcv(smallCover, WebPath$Storage.AVATARS) : CoverPath.none();
                                    jcvVar.getClass();
                                    String pathForSize3 = jcvVar.getPathForSize(s);
                                    pathForSize3.getClass();
                                    str2 = pathForSize3;
                                } else {
                                    str2 = null;
                                }
                                pasVar = new pas(value2, valueDescription, valueSuffix, footer2, null, dtqVar3, str2, Intrinsics.d(textFactSlideContentDto.getData().getCoverType(), "CIRCLE") ? etq.b : etq.a, textFactSlideContentDto.getData().getCoverTitle());
                            }
                            if (pasVar != null) {
                                obj2 = new tsq(slideDto3.getId(), arrayList, pasVar, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (content instanceof ArtistsSlideContentDto) {
                            ArtistsSlideContentDto artistsSlideContentDto = (ArtistsSlideContentDto) slideDto3.getContent();
                            artistsSlideContentDto.getClass();
                            if (artistsSlideContentDto.getData() == null) {
                                ck1Var = null;
                            } else {
                                pas pasVar3 = new pas(artistsSlideContentDto.getData().getValue(), artistsSlideContentDto.getData().getValueDescription(), artistsSlideContentDto.getData().getValueSuffix(), artistsSlideContentDto.getData().getFooter(), null, null, null, null, null);
                                List<EntityCoverDto> covers = artistsSlideContentDto.getData().getCovers();
                                if (covers != null) {
                                    r5 = new ArrayList();
                                    for (EntityCoverDto entityCoverDto : covers) {
                                        String e8 = (entityCoverDto == null || (V = c3x.V(entityCoverDto)) == null) ? null : V.e(wct.s(), WebPath$Storage.AVATARS);
                                        if (e8 != null) {
                                            r5.add(e8);
                                        }
                                    }
                                } else {
                                    r5 = c5b.a;
                                }
                                btq btqVar9 = dtq.b;
                                dtq o9 = hag.o(artistsSlideContentDto.getData().getAlign());
                                if (o9 == null) {
                                    o9 = dtq.b;
                                }
                                ck1Var = new ck1(pasVar3, r5, o9);
                            }
                            if (ck1Var != null) {
                                obj2 = new csq(slideDto3.getId(), arrayList, ck1Var, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (content instanceof ThenNowComparisonSlideContentDto) {
                            ThenNowComparisonSlideContentDto thenNowComparisonSlideContentDto = (ThenNowComparisonSlideContentDto) slideDto3.getContent();
                            thenNowComparisonSlideContentDto.getClass();
                            ThenNowComparisonSlideDataDto data8 = thenNowComparisonSlideContentDto.getData();
                            kfs kfsVar = (data8 == null || (title2 = data8.getTitle()) == null || (subtitle = thenNowComparisonSlideContentDto.getData().getSubtitle()) == null || (firstItem = thenNowComparisonSlideContentDto.getData().getFirstItem()) == null || (S = pcg.S(firstItem)) == null || (secondItem = thenNowComparisonSlideContentDto.getData().getSecondItem()) == null || (S2 = pcg.S(secondItem)) == null) ? null : new kfs(title2, subtitle, S, S2);
                            if (kfsVar != null) {
                                obj2 = new usq(slideDto3.getId(), arrayList, kfsVar, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (content instanceof CarouselContentDto) {
                            CarouselContentDto carouselContentDto = (CarouselContentDto) slideDto3.getContent();
                            carouselContentDto.getClass();
                            if (carouselContentDto.getData() == null) {
                                q14Var = null;
                            } else {
                                String savedChoiceKey = carouselContentDto.getData().getSavedChoiceKey();
                                List<CarouselItemDto> items6 = carouselContentDto.getData().getItems();
                                if (items6 != null) {
                                    r4 = new ArrayList();
                                    for (CarouselItemDto carouselItemDto : items6) {
                                        if (carouselItemDto != null) {
                                            if (!(carouselItemDto instanceof ArtistCarouselDataDto)) {
                                                b6e.s();
                                                return null;
                                            }
                                            ArtistCarouselDataDto artistCarouselDataDto = (ArtistCarouselDataDto) carouselItemDto;
                                            if (artistCarouselDataDto.getData() != null && (cover = artistCarouselDataDto.getData().getCover()) != null && (uri = cover.getUri()) != null) {
                                                g24Var = new g24(artistCarouselDataDto.getData().getTitle(), artistCarouselDataDto.getData().getSubtitle(), artistCarouselDataDto.getData().getDescription(), t(ltg.E(uri), artistCarouselDataDto.getData().getCoverMask(), artistCarouselDataDto.getData().getCoverBackground()));
                                                if (g24Var == null) {
                                                    r4.add(g24Var);
                                                }
                                            }
                                        }
                                        g24Var = null;
                                        if (g24Var == null) {
                                        }
                                    }
                                } else {
                                    r4 = c5b.a;
                                }
                                q14Var = new q14(savedChoiceKey, r4);
                            }
                            if (q14Var != null) {
                                obj2 = new fsq(slideDto3.getId(), arrayList, q14Var, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (content instanceof PayCardSlideContentDto) {
                            PayCardSlideContentDto payCardSlideContentDto = (PayCardSlideContentDto) slideDto3.getContent();
                            payCardSlideContentDto.getClass();
                            PayCardSlideDataDto data9 = payCardSlideContentDto.getData();
                            if (data9 == null || (artwork = data9.getArtwork()) == null) {
                                wbkVar = null;
                            } else {
                                int t2 = wct.t();
                                CoverPath jcvVar2 = artwork.length() > 0 ? new jcv(artwork, WebPath$Storage.AVATARS) : CoverPath.none();
                                jcvVar2.getClass();
                                String pathForSize4 = jcvVar2.getPathForSize(t2);
                                pathForSize4.getClass();
                                wbkVar = new wbk(pathForSize4, payCardSlideContentDto.getData().getTitle(), payCardSlideContentDto.getData().getDescription());
                            }
                            if (wbkVar != null) {
                                obj2 = new nsq(slideDto3.getId(), arrayList, wbkVar, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (content instanceof CollageContentDto) {
                            ns4 a2 = os4.a((CollageContentDto) slideDto3.getContent());
                            if (a2 != null) {
                                obj2 = new jsq(slideDto3.getId(), arrayList, a2, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                            }
                        } else if (!Intrinsics.d(content, pkt.a)) {
                            if (content != null) {
                                b6e.s();
                                return null;
                            }
                            obj2 = new dsq(slideDto3.getId(), arrayList, ak2Var, zd3Var, d85Var, floatValue, pathForSize2);
                        }
                    }
                } else {
                    it = it5;
                    obj = null;
                }
                obj2 = obj;
            }
            if (obj2 != null) {
                arrayList2.add(obj2);
            }
            it5 = it;
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            return null;
        }
        if (!arrayList2.isEmpty()) {
            for (xsq xsqVar : arrayList2) {
                ak2 ak2Var2 = xsqVar.c;
                ak2Var2.getClass();
                if (((ak2Var2 instanceof yj2) && ((yj2) ak2Var2).e) || ((list = xsqVar.b) != null && (!list.isEmpty()))) {
                    z2 = true;
                    return new ptq(pathForSize, arrayList2, z2);
                }
            }
        }
        z2 = false;
        return new ptq(pathForSize, arrayList2, z2);
    }

    public static final void m(yci yciVar, mj2 mj2Var, Function0 function0, wn5 wn5Var, hq5 hq5Var, int i2) {
        iz2 iz2Var = b2c.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1573000870);
        int i3 = i2 | (oq5Var.f(yciVar) ? 4 : 2) | (oq5Var.f(mj2Var) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = mj2Var instanceof jj2;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(-1119026276);
                yci c2 = d.c(yciVar, 1.0f);
                boolean z2 = (i3 & 896) == 256;
                Object K = oq5Var.K();
                if (z2 || K == kjnVar) {
                    K = new ex(11, function0);
                    oq5Var.k0(K);
                }
                yci c3 = androidx.compose.ui.draw.a.c(c2, (Function1) K);
                kfh d2 = ug3.d(iz2Var, false);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, c3);
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
                wn5Var.invoke(oq5Var, 6);
                oq5Var.p(true);
                oq5Var.p(false);
            } else if (mj2Var instanceof lj2) {
                oq5Var.Z(-1118735775);
                yci c4 = d.c(yciVar, 1.0f);
                kfh d3 = ug3.d(iz2Var, false);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, c4);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var2);
                }
                g0g.U(oq5Var, H2, wp5.d);
                p1g.a(((lj2) mj2Var).a, null, d.c(vci.a, 1.0f), null, null, null, hd6.a, 0.0f, null, 0, oq5Var, 1573296, 952);
                oq5Var = oq5Var;
                wn5Var.invoke(oq5Var, 6);
                oq5Var.p(true);
                oq5Var.p(false);
            } else {
                if (!(mj2Var instanceof kj2)) {
                    throw vz1.i(oq5Var, -174646164, false);
                }
                oq5Var.Z(-1118329768);
                long f2 = c3x.f(0);
                yci c5 = d.c(yciVar, 1.0f);
                boolean e2 = oq5Var.e(f2);
                Object K2 = oq5Var.K();
                if (e2 || K2 == kjnVar) {
                    K2 = new fn1(f2, 4);
                    oq5Var.k0(K2);
                }
                yci c6 = androidx.compose.ui.draw.a.c(c5, (Function1) K2);
                kfh d4 = ug3.d(iz2Var, false);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, c6);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar3);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d4, wp5.f);
                g0g.U(oq5Var, l3, wp5.e);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H3, wp5.d);
                wn5Var.invoke(oq5Var, 6);
                oq5Var.p(true);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(yciVar, mj2Var, function0, wn5Var, i2);
        }
    }

    public static final String m0(ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (c.o(((t6e) obj).a, HttpMessage.CONTENT_TYPE_HEADER, true)) {
                break;
            }
        }
        t6e t6eVar = (t6e) obj;
        if (t6eVar != null) {
            return t6eVar.b;
        }
        return null;
    }

    public static final void n(final pbu pbuVar, final boolean z, final boolean z2, final boolean z3, final Function1 function1, final Function0 function0, hq5 hq5Var, final int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1352979797);
        int i3 = (oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | i2 | (oq5Var.f(pbuVar) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.g(z2) ? 256 : 128) | (oq5Var.g(z3) ? 2048 : 1024) | (oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            if (pbuVar instanceof lbu) {
                oq5Var.Z(1627456663);
            } else {
                oq5Var.Z(1647206670);
                etn.f(z, null, androidx.compose.animation.c.e(null, 3), androidx.compose.animation.c.f(null, 3), null, ild.C(1271327390, new ttb(pbuVar, function0, z2, z3, function1), oq5Var), oq5Var, ((i3 >> 3) & 14) | 200064, 18);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(z, z2, z3, function1, function0, i2) { // from class: utb
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    vq1.n(pbu.this, this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static void n0(String str, String str2) {
        synchronized (i) {
            Log.w(str, o(str2, null));
        }
    }

    public static String o(String str, Throwable th) {
        boolean z;
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (i) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        z = false;
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            z = true;
                            break;
                        }
                        th2 = th2.getCause();
                    } finally {
                    }
                }
                replace = z ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace(StringUtil.TAB, "    ");
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder m = tlm.m(str, "\n  ");
        m.append(replace.replace(StringUtil.LF, "\n  "));
        m.append('\n');
        return m.toString();
    }

    public static void o0(String str, String str2, Throwable th) {
        synchronized (i) {
            Log.w(str, o(str2, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0180 -> B:17:0x0191). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(e9t e9tVar, RemoteViews remoteViews, ukd ukdVar, xne xneVar) {
        xqn xqnVar;
        Context context;
        xqn xqnVar2;
        xqn xqnVar3;
        jg jgVar;
        u38 u38Var;
        m0k m0kVar;
        Context context2 = e9tVar.a;
        xqn xqnVar4 = new xqn();
        xqn xqnVar5 = new xqn();
        xqn xqnVar6 = new xqn();
        xqn xqnVar7 = new xqn();
        xqn xqnVar8 = new xqn();
        xqnVar8.a = oiu.a;
        xqn xqnVar9 = new xqn();
        xqn xqnVar10 = new xqn();
        xqn xqnVar11 = new xqn();
        xqn xqnVar12 = new xqn();
        ukdVar.a(Unit.a, new pw0(xqnVar9, xqnVar4, xqnVar5, context2, remoteViews, xneVar, xqnVar6, xqnVar8, xqnVar7, e9tVar, xqnVar11, xqnVar10, xqnVar12));
        yov yovVar = (yov) xqnVar4.a;
        bxd bxdVar = (bxd) xqnVar5.a;
        Object obj = rqf.a;
        int i2 = xneVar.b;
        int i3 = xneVar.a;
        int i4 = 0;
        if (i2 == -1) {
            if (yovVar != null) {
                r(remoteViews, yovVar, i3);
            }
            if (bxdVar != null) {
                q(remoteViews, bxdVar, i3);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                xq0.q("There is currently no valid use case where a complex view is used on Android S");
                return;
            }
            u38 u38Var2 = yovVar != null ? yovVar.a : null;
            u38 u38Var3 = bxdVar != null ? bxdVar.a : null;
            if (b0(u38Var2) || b0(u38Var3)) {
                boolean z = (u38Var2 instanceof p38) || (u38Var2 instanceof o38);
                boolean z2 = (u38Var3 instanceof p38) || (u38Var3 instanceof o38);
                xqnVar = xqnVar8;
                int x = ngg.x(remoteViews, e9tVar, ru.yandex.music.R.id.sizeViewStub, (z && z2) ? ru.yandex.music.R.layout.size_match_match : z ? ru.yandex.music.R.layout.size_match_wrap : z2 ? ru.yandex.music.R.layout.size_wrap_match : ru.yandex.music.R.layout.size_wrap_wrap, null);
                boolean z3 = u38Var2 instanceof n38;
                s38 s38Var = s38.a;
                context = context2;
                p38 p38Var = p38.a;
                o38 o38Var = o38.a;
                if (z3) {
                    xqnVar3 = xqnVar12;
                    xqnVar2 = xqnVar10;
                    remoteViews.setInt(x, "setWidth", (int) TypedValue.applyDimension(1, ((n38) u38Var2).a, context.getResources().getDisplayMetrics()));
                } else {
                    xqnVar2 = xqnVar10;
                    xqnVar3 = xqnVar12;
                    if (!((Intrinsics.d(u38Var2, o38Var) ? true : Intrinsics.d(u38Var2, p38Var) ? true : Intrinsics.d(u38Var2, s38Var)) || u38Var2 == null)) {
                        b6e.s();
                        return;
                    }
                }
                if (u38Var3 instanceof n38) {
                    remoteViews.setInt(x, "setHeight", (int) TypedValue.applyDimension(1, ((n38) u38Var3).a, context.getResources().getDisplayMetrics()));
                } else {
                    if (!((Intrinsics.d(u38Var3, o38Var) ? true : Intrinsics.d(u38Var3, p38Var) ? true : Intrinsics.d(u38Var3, s38Var)) || u38Var3 == null)) {
                        b6e.s();
                        return;
                    }
                }
                jgVar = (jg) xqnVar9.a;
                if (jgVar != null) {
                    od odVar = jgVar.a;
                    Integer num = e9tVar.m;
                    int intValue = num != null ? num.intValue() : i3;
                    try {
                        if (e9tVar.f) {
                            remoteViews.setOnClickFillInIntent(intValue, tt0.G(odVar, e9tVar, intValue, d5.z0));
                            odVar = odVar;
                        } else {
                            remoteViews.setOnClickPendingIntent(intValue, tt0.H(odVar, e9tVar, intValue, d5.A0));
                            odVar = odVar;
                        }
                    } catch (Throwable th) {
                        String str = "Unrecognized Action: " + odVar;
                        Log.e("GlanceAppWidget", str, th);
                        odVar = str;
                    }
                }
                u38Var = (u38) xqnVar7.a;
                if (u38Var != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        ow0.a.a(remoteViews, i3, u38Var);
                    } else {
                        Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
                    }
                }
                m0kVar = (m0k) xqnVar6.a;
                if (m0kVar != null) {
                    Resources resources = context.getResources();
                    k0k k0kVar = m0kVar.a;
                    float m = ngg.m(k0kVar.b, resources) + k0kVar.a;
                    k0k k0kVar2 = m0kVar.b;
                    float m2 = ngg.m(k0kVar2.b, resources) + k0kVar2.a;
                    k0k k0kVar3 = m0kVar.c;
                    float m3 = ngg.m(k0kVar3.b, resources) + k0kVar3.a;
                    k0k k0kVar4 = m0kVar.d;
                    float m4 = ngg.m(k0kVar4.b, resources) + k0kVar4.a;
                    k0k k0kVar5 = m0kVar.e;
                    float m5 = ngg.m(k0kVar5.b, resources) + k0kVar5.a;
                    k0k k0kVar6 = m0kVar.f;
                    float m6 = ngg.m(k0kVar6.b, resources) + k0kVar6.a;
                    boolean z4 = e9tVar.c;
                    float f2 = m + (z4 ? m5 : m2);
                    if (!z4) {
                        m2 = m5;
                    }
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    remoteViews.setViewPadding(xneVar.a, (int) TypedValue.applyDimension(1, f2, displayMetrics), (int) TypedValue.applyDimension(1, m3, displayMetrics), (int) TypedValue.applyDimension(1, m4 + m2, displayMetrics), (int) TypedValue.applyDimension(1, m6, displayMetrics));
                }
                if (xqnVar11.a == null) {
                    l1j.f();
                    return;
                }
                lfp lfpVar = (lfp) xqnVar3.a;
                if (lfpVar != null) {
                    Object obj2 = lfpVar.a.a.get(wdp.i);
                    List list = (List) (obj2 == null ? null : obj2);
                    if (list != null) {
                        remoteViews.setContentDescription(i3, CollectionsKt.X(list, null, null, null, null, 63));
                    }
                }
                int ordinal = ((oiu) xqnVar.a).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i4 = 4;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return;
                        }
                        i4 = 8;
                    }
                }
                remoteViews.setViewVisibility(i3, i4);
                return;
            }
        }
        context = context2;
        xqnVar = xqnVar8;
        xqnVar2 = xqnVar10;
        xqnVar3 = xqnVar12;
        jgVar = (jg) xqnVar9.a;
        if (jgVar != null) {
        }
        u38Var = (u38) xqnVar7.a;
        if (u38Var != null) {
        }
        m0kVar = (m0k) xqnVar6.a;
        if (m0kVar != null) {
        }
        if (xqnVar11.a == null) {
        }
    }

    public static final void q(RemoteViews remoteViews, bxd bxdVar, int i2) {
        u38 u38Var = bxdVar.a;
        int i3 = Build.VERSION.SDK_INT;
        o38 o38Var = o38.a;
        s38 s38Var = s38.a;
        if (i3 >= 31) {
            if (i3 >= 33 || !u75.h(s38Var, o38Var).contains(u38Var)) {
                ow0.a.b(remoteViews, i2, u38Var);
                return;
            }
            return;
        }
        List h2 = u75.h(s38Var, p38.a, o38Var);
        Object obj = rqf.a;
        if (h2.contains(u38Var)) {
            return;
        }
        wvs.g(u38Var, " requires a complex layout before API 31", "Using a height of ");
    }

    public static final void r(RemoteViews remoteViews, yov yovVar, int i2) {
        u38 u38Var = yovVar.a;
        int i3 = Build.VERSION.SDK_INT;
        o38 o38Var = o38.a;
        s38 s38Var = s38.a;
        if (i3 >= 31) {
            if (i3 >= 33 || !u75.h(s38Var, o38Var).contains(u38Var)) {
                ow0.a.c(remoteViews, i2, u38Var);
                return;
            }
            return;
        }
        List h2 = u75.h(s38Var, p38.a, o38Var);
        Object obj = rqf.a;
        if (h2.contains(u38Var)) {
            return;
        }
        wvs.g(u38Var, " requires a complex layout before API 31", "Using a width of ");
    }

    public static final u0s s(jcj jcjVar, String str) {
        int i2;
        int ordinal = jcjVar.a.ordinal();
        if (ordinal == 0) {
            i2 = 0;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            i2 = 1;
        }
        return new u0s(str, i2 + 1, jcjVar.b);
    }

    public static final saf t(String str, String str2, String str3) {
        String E = str2 != null ? ltg.E(str2) : null;
        String E2 = str3 != null ? ltg.E(str3) : null;
        return (E == null || E2 == null) ? new mn6(str) : new nn6(str, E, E2);
    }

    public static void u(String str, boolean z) {
        if (z) {
            return;
        }
        xq0.x(str);
    }

    public static void v(boolean z) {
        if (z) {
            return;
        }
        e7o.e();
    }

    public static void w(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            rj7.m();
        }
    }

    public static void x(xoh xohVar) {
        xohVar.getClass();
    }

    public static void y(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static void z(String str, boolean z) {
        if (z) {
            return;
        }
        xq0.q(str);
    }
}
