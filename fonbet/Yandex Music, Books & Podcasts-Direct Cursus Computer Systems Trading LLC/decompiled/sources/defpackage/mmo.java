package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.media3.session.m;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import j$.time.ZonedDateTime;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.player.tracks.TrackVariant;

/* loaded from: classes.dex */
public final class mmo implements v33, adu, kqo, nqo, wqo, typ {
    public static HashSet h;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public mmo(int i) {
        this.a = i;
        switch (i) {
            case 2:
                l18 l18Var = l18.b;
                this.b = l18Var.b(hag.I(z66.class), true);
                this.c = btf.b(new zb0(3));
                bdt I = hag.I(e.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                this.d = new qec(29, (e) qdcVar.C(I));
                this.e = l18Var.b(hag.I(k1l.class), true);
                this.f = l18Var.b(hag.I(fan.class), true);
                this.g = l18Var.b(hag.I(oq7.class), true);
                break;
            case 3:
                this.b = new int[]{2131230944, 2131230942, 2131230868};
                this.c = new int[]{2131230892, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.d = new int[]{2131230941, 2131230943, 2131230885, R.drawable.abc_text_cursor_material, 2131230938, 2131230939, 2131230940};
                this.e = new int[]{2131230917, R.drawable.abc_cab_background_internal_bg, 2131230916};
                this.f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            case 12:
                this.b = new HashSet();
                this.e = new hr2(8, this);
                this.f = new ahg(this, 1);
                this.g = new ahg(this, 0);
                break;
            case 13:
                this.b = rdl.F.l(m.g);
                this.c = blp.b;
                this.d = d8l.b;
                this.e = qsn.e;
                this.f = Bundle.EMPTY;
                this.g = null;
                break;
            case 20:
                l18 l18Var2 = l18.b;
                this.b = l18Var2.b(hag.I(pf4.class), true);
                this.c = l18Var2.b(hag.I(cut.class), true);
                bdt I2 = hag.I(kyl.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                this.d = new t1f(26);
                this.e = l18Var2.b(hag.I(frt.class), true);
                this.f = l18Var2.b(hag.I(z66.class), true);
                this.g = l18Var2.b(hag.I(dy6.class), true);
                break;
        }
    }

    public static ColorStateList C(Context context, int i) {
        int c = gfs.c(context, R.attr.colorControlHighlight);
        int b = gfs.b(context, R.attr.colorButtonNormal);
        int[] iArr = gfs.b;
        int[] iArr2 = gfs.d;
        int i2 = aa5.i(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, gfs.c, gfs.f}, new int[]{b, i2, aa5.i(c, i), i});
    }

    public static void N0(kmo kmoVar, boolean z, olo oloVar) {
        int i;
        flo floVar = kmoVar.a;
        float floatValue = (z ? floVar.c : floVar.e).floatValue();
        if (oloVar instanceof iko) {
            i = ((iko) oloVar).a;
        } else if (!(oloVar instanceof jko)) {
            return;
        } else {
            i = kmoVar.a.k.a;
        }
        int z2 = z(i, floatValue);
        if (z) {
            kmoVar.d.setColor(z2);
        } else {
            kmoVar.e.setColor(z2);
        }
    }

    public static void O(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void O0(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = ir0.b;
        }
        mutate.setColorFilter(ir0.c(i, mode));
    }

    public static void T(mko mkoVar, String str) {
        llo H = mkoVar.a.H(str);
        if (H == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(H instanceof mko)) {
            O("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (H == mkoVar) {
            O("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        mko mkoVar2 = (mko) H;
        if (mkoVar.i == null) {
            mkoVar.i = mkoVar2.i;
        }
        if (mkoVar.j == null) {
            mkoVar.j = mkoVar2.j;
        }
        if (mkoVar.k == 0) {
            mkoVar.k = mkoVar2.k;
        }
        if (mkoVar.h.isEmpty()) {
            mkoVar.h = mkoVar2.h;
        }
        try {
            if (mkoVar instanceof mlo) {
                mlo mloVar = (mlo) mkoVar;
                mlo mloVar2 = (mlo) H;
                if (mloVar.m == null) {
                    mloVar.m = mloVar2.m;
                }
                if (mloVar.n == null) {
                    mloVar.n = mloVar2.n;
                }
                if (mloVar.o == null) {
                    mloVar.o = mloVar2.o;
                }
                if (mloVar.p == null) {
                    mloVar.p = mloVar2.p;
                }
            } else {
                U((qlo) mkoVar, (qlo) H);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = mkoVar2.l;
        if (str2 != null) {
            T(mkoVar, str2);
        }
    }

    public static a1m T0(rj6 rj6Var) {
        boolean z = rj6Var instanceof mj6;
        u0m u0mVar = u0m.a;
        if (z) {
            int i = ((mj6) rj6Var).a;
            return (i == 400 || i == 404) ? v0m.a : u0mVar;
        }
        if (rj6Var instanceof pj6) {
            return u0mVar;
        }
        if (rj6Var instanceof qj6) {
            return U0((zul) ((qj6) rj6Var).a);
        }
        b6e.s();
        return null;
    }

    public static void U(qlo qloVar, qlo qloVar2) {
        if (qloVar.m == null) {
            qloVar.m = qloVar2.m;
        }
        if (qloVar.n == null) {
            qloVar.n = qloVar2.n;
        }
        if (qloVar.o == null) {
            qloVar.o = qloVar2.o;
        }
        if (qloVar.p == null) {
            qloVar.p = qloVar2.p;
        }
        if (qloVar.q == null) {
            qloVar.q = qloVar2.q;
        }
    }

    public static a1m U0(zul zulVar) {
        if (zulVar == null) {
            return u0m.a;
        }
        cvl cvlVar = zulVar.a;
        return (cvlVar.f || ivf.I(cvlVar)) ? new y0m(zulVar) : new w0m(cvlVar.b);
    }

    public static void V(zko zkoVar, String str) {
        llo H = zkoVar.a.H(str);
        if (H == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(H instanceof zko)) {
            O("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (H == zkoVar) {
            O("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        zko zkoVar2 = (zko) H;
        if (zkoVar.p == null) {
            zkoVar.p = zkoVar2.p;
        }
        if (zkoVar.q == null) {
            zkoVar.q = zkoVar2.q;
        }
        if (zkoVar.r == null) {
            zkoVar.r = zkoVar2.r;
        }
        if (zkoVar.s == null) {
            zkoVar.s = zkoVar2.s;
        }
        if (zkoVar.t == null) {
            zkoVar.t = zkoVar2.t;
        }
        if (zkoVar.u == null) {
            zkoVar.u = zkoVar2.u;
        }
        if (zkoVar.v == null) {
            zkoVar.v = zkoVar2.v;
        }
        if (zkoVar.i.isEmpty()) {
            zkoVar.i = zkoVar2.i;
        }
        if (zkoVar.o == null) {
            zkoVar.o = zkoVar2.o;
        }
        if (zkoVar.n == null) {
            zkoVar.n = zkoVar2.n;
        }
        String str2 = zkoVar2.w;
        if (str2 != null) {
            V(zkoVar, str2);
        }
    }

    public static uvh W(i8l i8lVar, yde ydeVar, uvh uvhVar, ois oisVar) {
        sis V = i8lVar.V();
        int k0 = i8lVar.k0();
        Object l = V.p() ? null : V.l(k0);
        int b = (i8lVar.i() || V.p()) ? -1 : V.f(k0, oisVar, false).b(dvt.Y(i8lVar.J0()) - oisVar.e);
        for (int i = 0; i < ydeVar.size(); i++) {
            uvh uvhVar2 = (uvh) ydeVar.get(i);
            if (h0(uvhVar2, l, i8lVar.i(), i8lVar.R(), i8lVar.p0(), b)) {
                return uvhVar2;
            }
        }
        if (ydeVar.isEmpty() && uvhVar != null && h0(uvhVar, l, i8lVar.i(), i8lVar.R(), i8lVar.p0(), b)) {
            return uvhVar;
        }
        return null;
    }

    public static a6l a0() {
        return new a6l(new gxc(avf.G("auto"), weo.t()), null);
    }

    public static void b(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, yko ykoVar) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            ykoVar.g(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (sin * d2) + (cos * d);
        double d4 = (cos * d2) + ((-sin) * d);
        double d5 = abs * abs;
        double d6 = abs2 * abs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double sqrt = Math.sqrt(d9) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d5 = abs * abs;
            d6 = abs2 * abs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d14) * d10;
        double d15 = abs;
        double d16 = abs2;
        double d17 = ((d15 * d4) / d16) * sqrt2;
        double d18 = sqrt2 * (-((d16 * d3) / d15));
        double d19 = ((cos * d17) - (sin * d18)) + ((f + f6) / 2.0d);
        double d20 = (cos * d18) + (sin * d17) + ((f2 + f7) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double acos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double sqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double acos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
        if (!z2 && acos2 > 0.0d) {
            acos2 -= 6.283185307179586d;
        } else if (z2 && acos2 < 0.0d) {
            acos2 += 6.283185307179586d;
        }
        double d26 = acos2 % 6.283185307179586d;
        double d27 = acos % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / ceil;
        double d29 = d28 / 2.0d;
        double sin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = ceil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d30 = d27;
            double d31 = (i2 * d28) + d30;
            double cos2 = Math.cos(d31);
            double sin3 = Math.sin(d31);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (cos2 - (sin2 * sin3));
            fArr[i3 + 1] = (float) ((cos2 * sin2) + sin3);
            double d32 = d31 + d28;
            double cos3 = Math.cos(d32);
            double sin4 = Math.sin(d32);
            fArr[i5 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i5 + 3] = (float) (sin4 - (sin2 * cos3));
            fArr[i5 + 4] = (float) cos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) sin4;
            i2 = i4 + 1;
            d27 = d30;
            ceil = ceil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            ykoVar.e(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static final Object d(mmo mmoVar, rjc rjcVar, rj6 rj6Var, aur aurVar) {
        mmoVar.getClass();
        a1m T0 = T0(rj6Var);
        if (T0 instanceof x0m) {
            Object emit = rjcVar.emit(T0, aurVar);
            return emit == nm6.a ? emit : Unit.a;
        }
        if (!(T0 instanceof z0m)) {
            b6e.s();
            return null;
        }
        cvl cvlVar = ((z0m) T0).a;
        Object collect = mmoVar.H(cvlVar.c.a, cvlVar.a, false, new fs(15, T0)).collect(new uql(rjcVar, 14), aurVar);
        return collect == nm6.a ? collect : Unit.a;
    }

    public static final void f(mmo mmoVar) {
        x97.y(cmd.a, null, null, new nz5((g1n) mmoVar.b, mmoVar, (Continuation) null, 16), 3);
    }

    public static LayerDrawable f0(w2o w2oVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable d = w2oVar.d(context, R.drawable.abc_star_black_48dp);
        Drawable d2 = w2oVar.d(context, R.drawable.abc_star_half_black_48dp);
        if ((d instanceof BitmapDrawable) && d.getIntrinsicWidth() == dimensionPixelSize && d.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) d;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((d2 instanceof BitmapDrawable) && d2.getIntrinsicWidth() == dimensionPixelSize && d2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) d2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static final List g(mmo mmoVar, List list, int i) {
        if (list == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g2t V0 = mmoVar.V0((TrackVariant) it.next(), i);
            if (V0 != null) {
                arrayList.add(V0);
            }
        }
        return arrayList;
    }

    public static boolean h0(uvh uvhVar, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = uvhVar.a;
        int i4 = uvhVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && uvhVar.c == i2) {
            return true;
        }
        return !z && i4 == -1 && uvhVar.e == i3;
    }

    public static boolean i0(flo floVar, long j) {
        return (floVar.a & j) != 0;
    }

    public static boolean j(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static Path l0(alo aloVar) {
        Path path = new Path();
        float[] fArr = aloVar.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = aloVar.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (aloVar instanceof blo) {
            path.close();
        }
        if (aloVar.h == null) {
            aloVar.h = m(path);
        }
        return path;
    }

    public static spi m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new spi(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix q(spi spiVar, spi spiVar2, lqm lqmVar) {
        kqm kqmVar;
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (lqmVar != null && (kqmVar = lqmVar.a) != null) {
            float f3 = spiVar.d / spiVar2.d;
            float f4 = spiVar.e / spiVar2.e;
            float f5 = -spiVar2.b;
            float f6 = -spiVar2.c;
            if (lqmVar.equals(lqm.c)) {
                matrix.preTranslate(spiVar.b, spiVar.c);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float max = lqmVar.b == 2 ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = spiVar.d / max;
            float f8 = spiVar.e / max;
            int ordinal = kqmVar.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            if (ordinal != 8) {
                            }
                        }
                    }
                }
                f = spiVar2.d - f7;
                f5 -= f;
                switch (kqmVar.ordinal()) {
                    case 4:
                    case 5:
                    case 6:
                        f2 = (spiVar2.e - f8) / 2.0f;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        f2 = spiVar2.e - f8;
                        break;
                }
                f6 -= f2;
                matrix.preTranslate(spiVar.b, spiVar.c);
                matrix.preScale(max, max);
                matrix.preTranslate(f5, f6);
            }
            f = (spiVar2.d - f7) / 2.0f;
            f5 -= f;
            switch (kqmVar.ordinal()) {
            }
            f6 -= f2;
            matrix.preTranslate(spiVar.b, spiVar.c);
            matrix.preScale(max, max);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r7.equals("sans-serif") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface t(int i, Integer num, String str) {
        char c = 0;
        boolean z = i == 2;
        int i2 = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i2);
            case 2:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 3:
                return Typeface.create(Typeface.SERIF, i2);
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int z(int i, float f) {
        int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
        int round = Math.round(((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public Object A(List list, aur aurVar) {
        sml smlVar = (sml) this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z75.t(arrayList, ((xlp) it.next()).c);
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Long(((bpu) it2.next()).a));
        }
        Object c = ((uou) ((oou) smlVar.a)).c(arrayList2, aurVar);
        nm6 nm6Var = nm6.a;
        if (c != nm6Var) {
            c = Unit.a;
        }
        return c == nm6Var ? c : Unit.a;
    }

    public void A0(spi spiVar) {
        Canvas canvas = (Canvas) this.b;
        if (((kmo) this.d).a.y != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            uko ukoVar = (uko) ((sfm) this.c).H(((kmo) this.d).a.y);
            J0(ukoVar, spiVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            J0(ukoVar, spiVar);
            canvas.restore();
            canvas.restore();
        }
        Q0();
    }

    @Override // defpackage.nqo
    public TextView B() {
        return (TextView) this.c;
    }

    public void B0() {
        xdr xdrVar = (xdr) this.d;
        int size = ((LinkedHashSet) this.f).size();
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.g;
        yaa yaaVar = new yaa(linkedHashSet.size() + size, linkedHashSet.size(), ((LinkedHashSet) this.e).size());
        xdrVar.getClass();
        xdrVar.m(null, yaaVar);
    }

    public boolean C0() {
        llo H;
        int i = 0;
        if (((kmo) this.d).a.j.floatValue() >= 1.0f && ((kmo) this.d).a.y == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.b;
        int floatValue = (int) (((kmo) this.d).a.j.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i = KotlinVersion.MAX_COMPONENT_VALUE;
            if (floatValue <= 255) {
                i = floatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.e).push((kmo) this.d);
        kmo kmoVar = new kmo((kmo) this.d);
        this.d = kmoVar;
        String str = kmoVar.a.y;
        if (str != null && ((H = ((sfm) this.c).H(str)) == null || !(H instanceof uko))) {
            O("Mask reference '%s' not found", ((kmo) this.d).a.y);
            ((kmo) this.d).a.y = null;
        }
        return true;
    }

    public pjc D(boolean z, boolean z2, lxl lxlVar) {
        lxlVar.getClass();
        Continuation continuation = null;
        if (z2 && !(lxlVar instanceof jxl)) {
            su4.s(2, null, "Unexpected behavior. Unexpected behavior. To get the downloaded playlist, you must use the UserIdAndKind as an argument", null);
        }
        if (lxlVar.equals(fxl.a)) {
            return new eno(new cg1(this, z, continuation, 15));
        }
        if (lxlVar instanceof hxl) {
            return new eno(new d1m(this, lxlVar, z, continuation, 0));
        }
        if (lxlVar instanceof ixl) {
            return new eno(new c5l(this, lxlVar, continuation, 11));
        }
        if (lxlVar instanceof jxl) {
            jxl jxlVar = (jxl) lxlVar;
            return H(jxlVar.a, jxlVar.b, z2, new eno(new d1m(this, lxlVar, z, continuation, 1)));
        }
        if (lxlVar instanceof kxl) {
            return new eno(new d1m(this, lxlVar, z, continuation, 2));
        }
        if (!(lxlVar instanceof gxl)) {
            b6e.s();
            return null;
        }
        long j = ((gxl) lxlVar).a;
        nsl nslVar = (nsl) ((t1f) this.d).c;
        return s0(zsd.M0(((z66) nslVar.d.getValue()).c(), new ekc((Continuation) null, nslVar, j)));
    }

    public void D0(ou7 ou7Var) {
        if (ou7Var.X()) {
            return;
        }
        ((ConcurrentLinkedQueue) this.g).offer(ou7Var);
        ou7Var.R(new wes(19, this, ou7Var));
    }

    @Override // defpackage.typ
    public Object E(StartGenerativeQueueCommand startGenerativeQueueCommand, cg6 cg6Var) {
        d5d d5dVar = startGenerativeQueueCommand.getStartRequest().a.a;
        d5dVar.getClass();
        StationId stationId = new StationId(d5dVar.a, d5dVar.b);
        zzp zzpVar = (zzp) this.b;
        gxc gxcVar = startGenerativeQueueCommand.getStartRequest().b.b;
        Continuation continuation = null;
        return x97.V(dm6.b, new ak1(new yk3(zzpVar, new w90(this, stationId, continuation, 13), stationId, startGenerativeQueueCommand.getPlayWhenReady(), gxcVar), continuation, 14), cg6Var);
    }

    public void E0(glo gloVar, spi spiVar, spi spiVar2, lqm lqmVar) {
        if (spiVar.d == 0.0f || spiVar.e == 0.0f) {
            return;
        }
        if (lqmVar == null && (lqmVar = gloVar.n) == null) {
            lqmVar = lqm.d;
        }
        b1((kmo) this.d, gloVar);
        if (J()) {
            kmo kmoVar = (kmo) this.d;
            kmoVar.f = spiVar;
            if (!kmoVar.a.o.booleanValue()) {
                spi spiVar3 = ((kmo) this.d).f;
                L0(spiVar3.b, spiVar3.c, spiVar3.d, spiVar3.e);
            }
            r(gloVar, ((kmo) this.d).f);
            Canvas canvas = (Canvas) this.b;
            kmo kmoVar2 = (kmo) this.d;
            if (spiVar2 != null) {
                canvas.concat(q(kmoVar2.f, spiVar2, lqmVar));
                ((kmo) this.d).g = gloVar.o;
            } else {
                spi spiVar4 = kmoVar2.f;
                canvas.translate(spiVar4.b, spiVar4.c);
            }
            boolean C0 = C0();
            c1();
            G0(gloVar, true);
            if (C0) {
                A0(gloVar.h);
            }
            Z0(gloVar);
        }
    }

    @Override // defpackage.wqo
    public TextView F() {
        return (TextView) this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F0(nlo nloVar) {
        rko rkoVar;
        String str;
        int indexOf;
        Set b;
        rko rkoVar2;
        Boolean bool;
        if (nloVar instanceof vko) {
            return;
        }
        R0();
        if ((nloVar instanceof llo) && (bool = ((llo) nloVar).d) != null) {
            ((kmo) this.d).h = bool.booleanValue();
        }
        if (nloVar instanceof glo) {
            glo gloVar = (glo) nloVar;
            E0(gloVar, q0(gloVar.p, gloVar.q, gloVar.r, gloVar.s), gloVar.o, gloVar.n);
        } else {
            Bitmap bitmap = null;
            if (nloVar instanceof cmo) {
                cmo cmoVar = (cmo) nloVar;
                Canvas canvas = (Canvas) this.b;
                rko rkoVar3 = cmoVar.r;
                if ((rkoVar3 == null || !rkoVar3.h()) && ((rkoVar2 = cmoVar.s) == null || !rkoVar2.h())) {
                    b1((kmo) this.d, cmoVar);
                    if (J()) {
                        nlo H = cmoVar.a.H(cmoVar.o);
                        if (H == null) {
                            O("Use reference '%s' not found", cmoVar.o);
                        } else {
                            Matrix matrix = cmoVar.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            rko rkoVar4 = cmoVar.p;
                            float e = rkoVar4 != null ? rkoVar4.e(this) : 0.0f;
                            rko rkoVar5 = cmoVar.q;
                            canvas.translate(e, rkoVar5 != null ? rkoVar5.f(this) : 0.0f);
                            r(cmoVar, cmoVar.h);
                            boolean C0 = C0();
                            ((Stack) this.f).push(cmoVar);
                            ((Stack) this.g).push(((Canvas) this.b).getMatrix());
                            if (H instanceof glo) {
                                glo gloVar2 = (glo) H;
                                spi q0 = q0(null, null, cmoVar.r, cmoVar.s);
                                R0();
                                E0(gloVar2, q0, gloVar2.o, gloVar2.n);
                                Q0();
                            } else if (H instanceof tlo) {
                                rko rkoVar6 = cmoVar.r;
                                if (rkoVar6 == null) {
                                    rkoVar6 = new rko(9, 100.0f);
                                }
                                rko rkoVar7 = cmoVar.s;
                                if (rkoVar7 == null) {
                                    rkoVar7 = new rko(9, 100.0f);
                                }
                                spi q02 = q0(null, null, rkoVar6, rkoVar7);
                                R0();
                                tlo tloVar = (tlo) H;
                                if (q02.d != 0.0f && q02.e != 0.0f) {
                                    lqm lqmVar = tloVar.n;
                                    if (lqmVar == null) {
                                        lqmVar = lqm.d;
                                    }
                                    b1((kmo) this.d, tloVar);
                                    kmo kmoVar = (kmo) this.d;
                                    kmoVar.f = q02;
                                    if (!kmoVar.a.o.booleanValue()) {
                                        spi spiVar = ((kmo) this.d).f;
                                        L0(spiVar.b, spiVar.c, spiVar.d, spiVar.e);
                                    }
                                    spi spiVar2 = tloVar.o;
                                    kmo kmoVar2 = (kmo) this.d;
                                    if (spiVar2 != null) {
                                        canvas.concat(q(kmoVar2.f, spiVar2, lqmVar));
                                        ((kmo) this.d).g = tloVar.o;
                                    } else {
                                        spi spiVar3 = kmoVar2.f;
                                        canvas.translate(spiVar3.b, spiVar3.c);
                                    }
                                    boolean C02 = C0();
                                    G0(tloVar, true);
                                    if (C02) {
                                        A0(tloVar.h);
                                    }
                                    Z0(tloVar);
                                }
                                Q0();
                            } else {
                                F0(H);
                            }
                            ((Stack) this.f).pop();
                            ((Stack) this.g).pop();
                            if (C0) {
                                A0(cmoVar.h);
                            }
                            Z0(cmoVar);
                        }
                    }
                }
            } else if (nloVar instanceof slo) {
                slo sloVar = (slo) nloVar;
                b1((kmo) this.d, sloVar);
                if (J()) {
                    Matrix matrix2 = sloVar.n;
                    if (matrix2 != null) {
                        ((Canvas) this.b).concat(matrix2);
                    }
                    r(sloVar, sloVar.h);
                    boolean C03 = C0();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = sloVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        nlo nloVar2 = (nlo) it.next();
                        if (nloVar2 instanceof hlo) {
                            hlo hloVar = (hlo) nloVar2;
                            if (hloVar.c() == null && ((b = hloVar.b()) == null || (!b.isEmpty() && b.contains(language)))) {
                                Set f = hloVar.f();
                                if (f != null) {
                                    if (h == null) {
                                        synchronized (mmo.class) {
                                            HashSet hashSet = new HashSet();
                                            h = hashSet;
                                            hashSet.add("Structure");
                                            h.add("BasicStructure");
                                            h.add("ConditionalProcessing");
                                            h.add("Image");
                                            h.add("Style");
                                            h.add("ViewportAttribute");
                                            h.add("Shape");
                                            h.add("BasicText");
                                            h.add("PaintAttribute");
                                            h.add("BasicPaintAttribute");
                                            h.add("OpacityAttribute");
                                            h.add("BasicGraphicsAttribute");
                                            h.add("Marker");
                                            h.add("Gradient");
                                            h.add("Pattern");
                                            h.add("Clip");
                                            h.add("BasicClip");
                                            h.add("Mask");
                                            h.add("View");
                                        }
                                    }
                                    if (!f.isEmpty() && h.containsAll(f)) {
                                    }
                                }
                                Set m = hloVar.m();
                                if (m == null) {
                                    Set n = hloVar.n();
                                    if (n == null) {
                                        F0(nloVar2);
                                        break;
                                    }
                                    n.isEmpty();
                                } else {
                                    m.isEmpty();
                                }
                            }
                        }
                    }
                    if (C03) {
                        A0(sloVar.h);
                    }
                    Z0(sloVar);
                }
            } else if (nloVar instanceof oko) {
                oko okoVar = (oko) nloVar;
                b1((kmo) this.d, okoVar);
                if (J()) {
                    Matrix matrix3 = okoVar.n;
                    if (matrix3 != null) {
                        ((Canvas) this.b).concat(matrix3);
                    }
                    r(okoVar, okoVar.h);
                    boolean C04 = C0();
                    G0(okoVar, true);
                    if (C04) {
                        A0(okoVar.h);
                    }
                    Z0(okoVar);
                }
            } else {
                if (nloVar instanceof qko) {
                    qko qkoVar = (qko) nloVar;
                    Canvas canvas2 = (Canvas) this.b;
                    rko rkoVar8 = qkoVar.r;
                    if (rkoVar8 != null && !rkoVar8.h() && (rkoVar = qkoVar.s) != null && !rkoVar.h() && (str = qkoVar.o) != null) {
                        lqm lqmVar2 = qkoVar.n;
                        if (lqmVar2 == null) {
                            lqmVar2 = lqm.d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            } catch (Exception e2) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e2);
                            }
                        }
                        if (bitmap != null) {
                            spi spiVar4 = new spi(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                            b1((kmo) this.d, qkoVar);
                            if (J() && d1()) {
                                Matrix matrix4 = qkoVar.t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                rko rkoVar9 = qkoVar.p;
                                float e3 = rkoVar9 != null ? rkoVar9.e(this) : 0.0f;
                                rko rkoVar10 = qkoVar.q;
                                float f2 = rkoVar10 != null ? rkoVar10.f(this) : 0.0f;
                                float e4 = qkoVar.r.e(this);
                                float e5 = qkoVar.s.e(this);
                                kmo kmoVar3 = (kmo) this.d;
                                kmoVar3.f = new spi(e3, f2, e4, e5);
                                if (!kmoVar3.a.o.booleanValue()) {
                                    spi spiVar5 = ((kmo) this.d).f;
                                    L0(spiVar5.b, spiVar5.c, spiVar5.d, spiVar5.e);
                                }
                                qkoVar.h = ((kmo) this.d).f;
                                Z0(qkoVar);
                                r(qkoVar, qkoVar.h);
                                boolean C05 = C0();
                                c1();
                                canvas2.save();
                                canvas2.concat(q(((kmo) this.d).f, spiVar4, lqmVar2));
                                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(((kmo) this.d).a.X != 3 ? 2 : 0));
                                canvas2.restore();
                                if (C05) {
                                    A0(qkoVar.h);
                                }
                            }
                        }
                    }
                } else if (nloVar instanceof xko) {
                    xko xkoVar = (xko) nloVar;
                    if (xkoVar.o != null) {
                        b1((kmo) this.d, xkoVar);
                        if (J() && d1()) {
                            kmo kmoVar4 = (kmo) this.d;
                            if (kmoVar4.c || kmoVar4.b) {
                                Matrix matrix5 = xkoVar.n;
                                if (matrix5 != null) {
                                    ((Canvas) this.b).concat(matrix5);
                                }
                                Path path = new gmo(xkoVar.o).a;
                                if (xkoVar.h == null) {
                                    xkoVar.h = m(path);
                                }
                                Z0(xkoVar);
                                s(xkoVar);
                                r(xkoVar, xkoVar.h);
                                boolean C06 = C0();
                                kmo kmoVar5 = (kmo) this.d;
                                if (kmoVar5.b) {
                                    int i = kmoVar5.a.D;
                                    path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    K(xkoVar, path);
                                }
                                if (((kmo) this.d).c) {
                                    M(path);
                                }
                                I0(xkoVar);
                                if (C06) {
                                    A0(xkoVar.h);
                                }
                            }
                        }
                    }
                } else if (nloVar instanceof clo) {
                    clo cloVar = (clo) nloVar;
                    rko rkoVar11 = cloVar.q;
                    if (rkoVar11 != null && cloVar.r != null && !rkoVar11.h() && !cloVar.r.h()) {
                        b1((kmo) this.d, cloVar);
                        if (J() && d1()) {
                            Matrix matrix6 = cloVar.n;
                            if (matrix6 != null) {
                                ((Canvas) this.b).concat(matrix6);
                            }
                            Path n0 = n0(cloVar);
                            Z0(cloVar);
                            s(cloVar);
                            r(cloVar, cloVar.h);
                            boolean C07 = C0();
                            if (((kmo) this.d).b) {
                                K(cloVar, n0);
                            }
                            if (((kmo) this.d).c) {
                                M(n0);
                            }
                            if (C07) {
                                A0(cloVar.h);
                            }
                        }
                    }
                } else if (nloVar instanceof gko) {
                    gko gkoVar = (gko) nloVar;
                    rko rkoVar12 = gkoVar.q;
                    if (rkoVar12 != null && !rkoVar12.h()) {
                        b1((kmo) this.d, gkoVar);
                        if (J() && d1()) {
                            Matrix matrix7 = gkoVar.n;
                            if (matrix7 != null) {
                                ((Canvas) this.b).concat(matrix7);
                            }
                            Path j0 = j0(gkoVar);
                            Z0(gkoVar);
                            s(gkoVar);
                            r(gkoVar, gkoVar.h);
                            boolean C08 = C0();
                            if (((kmo) this.d).b) {
                                K(gkoVar, j0);
                            }
                            if (((kmo) this.d).c) {
                                M(j0);
                            }
                            if (C08) {
                                A0(gkoVar.h);
                            }
                        }
                    }
                } else if (nloVar instanceof lko) {
                    lko lkoVar = (lko) nloVar;
                    rko rkoVar13 = lkoVar.q;
                    if (rkoVar13 != null && lkoVar.r != null && !rkoVar13.h() && !lkoVar.r.h()) {
                        b1((kmo) this.d, lkoVar);
                        if (J() && d1()) {
                            Matrix matrix8 = lkoVar.n;
                            if (matrix8 != null) {
                                ((Canvas) this.b).concat(matrix8);
                            }
                            Path k0 = k0(lkoVar);
                            Z0(lkoVar);
                            s(lkoVar);
                            r(lkoVar, lkoVar.h);
                            boolean C09 = C0();
                            if (((kmo) this.d).b) {
                                K(lkoVar, k0);
                            }
                            if (((kmo) this.d).c) {
                                M(k0);
                            }
                            if (C09) {
                                A0(lkoVar.h);
                            }
                        }
                    }
                } else if (nloVar instanceof sko) {
                    sko skoVar = (sko) nloVar;
                    b1((kmo) this.d, skoVar);
                    if (J() && d1() && ((kmo) this.d).c) {
                        Matrix matrix9 = skoVar.n;
                        if (matrix9 != null) {
                            ((Canvas) this.b).concat(matrix9);
                        }
                        rko rkoVar14 = skoVar.o;
                        float e6 = rkoVar14 == null ? 0.0f : rkoVar14.e(this);
                        rko rkoVar15 = skoVar.p;
                        float f3 = rkoVar15 == null ? 0.0f : rkoVar15.f(this);
                        rko rkoVar16 = skoVar.q;
                        float e7 = rkoVar16 == null ? 0.0f : rkoVar16.e(this);
                        rko rkoVar17 = skoVar.r;
                        r3 = rkoVar17 != null ? rkoVar17.f(this) : 0.0f;
                        if (skoVar.h == null) {
                            skoVar.h = new spi(Math.min(e6, e7), Math.min(f3, r3), Math.abs(e7 - e6), Math.abs(r3 - f3));
                        }
                        Path path2 = new Path();
                        path2.moveTo(e6, f3);
                        path2.lineTo(e7, r3);
                        Z0(skoVar);
                        s(skoVar);
                        r(skoVar, skoVar.h);
                        boolean C010 = C0();
                        M(path2);
                        I0(skoVar);
                        if (C010) {
                            A0(skoVar.h);
                        }
                    }
                } else if (nloVar instanceof blo) {
                    blo bloVar = (blo) nloVar;
                    b1((kmo) this.d, bloVar);
                    if (J() && d1()) {
                        kmo kmoVar6 = (kmo) this.d;
                        if (kmoVar6.c || kmoVar6.b) {
                            Matrix matrix10 = bloVar.n;
                            if (matrix10 != null) {
                                ((Canvas) this.b).concat(matrix10);
                            }
                            if (bloVar.o.length >= 2) {
                                Path l0 = l0(bloVar);
                                Z0(bloVar);
                                s(bloVar);
                                r(bloVar, bloVar.h);
                                boolean C011 = C0();
                                if (((kmo) this.d).b) {
                                    K(bloVar, l0);
                                }
                                if (((kmo) this.d).c) {
                                    M(l0);
                                }
                                I0(bloVar);
                                if (C011) {
                                    A0(bloVar.h);
                                }
                            }
                        }
                    }
                } else if (nloVar instanceof alo) {
                    alo aloVar = (alo) nloVar;
                    b1((kmo) this.d, aloVar);
                    if (J() && d1()) {
                        kmo kmoVar7 = (kmo) this.d;
                        if (kmoVar7.c || kmoVar7.b) {
                            Matrix matrix11 = aloVar.n;
                            if (matrix11 != null) {
                                ((Canvas) this.b).concat(matrix11);
                            }
                            if (aloVar.o.length >= 2) {
                                Path l02 = l0(aloVar);
                                Z0(aloVar);
                                int i2 = ((kmo) this.d).a.D;
                                l02.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                s(aloVar);
                                r(aloVar, aloVar.h);
                                boolean C012 = C0();
                                if (((kmo) this.d).b) {
                                    K(aloVar, l02);
                                }
                                if (((kmo) this.d).c) {
                                    M(l02);
                                }
                                I0(aloVar);
                                if (C012) {
                                    A0(aloVar.h);
                                }
                            }
                        }
                    }
                } else if (nloVar instanceof wlo) {
                    wlo wloVar = (wlo) nloVar;
                    b1((kmo) this.d, wloVar);
                    if (J()) {
                        Matrix matrix12 = wloVar.r;
                        if (matrix12 != null) {
                            ((Canvas) this.b).concat(matrix12);
                        }
                        ArrayList arrayList = wloVar.n;
                        float e8 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((rko) wloVar.n.get(0)).e(this);
                        ArrayList arrayList2 = wloVar.o;
                        float f4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((rko) wloVar.o.get(0)).f(this);
                        ArrayList arrayList3 = wloVar.p;
                        float e9 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((rko) wloVar.p.get(0)).e(this);
                        ArrayList arrayList4 = wloVar.q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            r3 = ((rko) wloVar.q.get(0)).f(this);
                        }
                        int b0 = b0();
                        if (b0 != 1) {
                            float n2 = n(wloVar);
                            if (b0 == 2) {
                                n2 /= 2.0f;
                            }
                            e8 -= n2;
                        }
                        if (wloVar.h == null) {
                            jmo jmoVar = new jmo(this, e8, f4);
                            N(wloVar, jmoVar);
                            RectF rectF = (RectF) jmoVar.g;
                            wloVar.h = new spi(rectF.left, rectF.top, rectF.width(), ((RectF) jmoVar.g).height());
                        }
                        Z0(wloVar);
                        s(wloVar);
                        r(wloVar, wloVar.h);
                        boolean C013 = C0();
                        N(wloVar, new imo(this, e8 + e9, f4 + r3));
                        if (C013) {
                            A0(wloVar.h);
                        }
                    }
                }
            }
        }
        Q0();
    }

    @Override // defpackage.kqo
    public ImageView G() {
        return (ImageView) this.g;
    }

    public void G0(ilo iloVar, boolean z) {
        if (z) {
            ((Stack) this.f).push(iloVar);
            ((Stack) this.g).push(((Canvas) this.b).getMatrix());
        }
        Iterator it = iloVar.i.iterator();
        while (it.hasNext()) {
            F0((nlo) it.next());
        }
        if (z) {
            ((Stack) this.f).pop();
            ((Stack) this.g).pop();
        }
    }

    public pjc H(String str, String str2, boolean z, pjc pjcVar) {
        t1f t1fVar = (t1f) this.d;
        if (Intrinsics.d(str, ((frt) ((jyr) this.e).getValue()).c().a) || !((z66) ((jyr) this.f).getValue()).g()) {
            return s0(t1fVar.w(str, str2));
        }
        if (!z) {
            return pjcVar;
        }
        pjc s0 = s0(t1fVar.w(str, str2));
        int i = 2;
        Continuation continuation = null;
        return new bca(new u21(10, new clc(new h0m(pjcVar, 2), new jud(i, 15, continuation)), new clc(new f9l(4, zsd.H0(zsd.X(s0, 1000L), 1)), new jud(i, 16, continuation)), new t81(3, 20, continuation)), 18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (((defpackage.kmo) r12.d).a.o.booleanValue() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        L0(r1, r2, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        r4.reset();
        r4.preScale(r7, r6);
        r0.concat(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H0(tko tkoVar, fmo fmoVar) {
        float f;
        spi spiVar;
        boolean C0;
        float f2;
        float f3;
        float f4;
        Canvas canvas = (Canvas) this.b;
        R0();
        Float f5 = tkoVar.u;
        float f6 = 0.0f;
        if (f5 != null) {
            if (Float.isNaN(f5.floatValue())) {
                float f7 = fmoVar.c;
                if (f7 != 0.0f || fmoVar.d != 0.0f) {
                    f = (float) Math.toDegrees(Math.atan2(fmoVar.d, f7));
                }
            } else {
                f = tkoVar.u.floatValue();
            }
            float d = !tkoVar.p ? 1.0f : ((kmo) this.d).a.f.d();
            this.d = X(tkoVar);
            Matrix matrix = new Matrix();
            matrix.preTranslate(fmoVar.a, fmoVar.b);
            matrix.preRotate(f);
            matrix.preScale(d, d);
            rko rkoVar = tkoVar.q;
            float e = rkoVar == null ? rkoVar.e(this) : 0.0f;
            rko rkoVar2 = tkoVar.r;
            float f8 = rkoVar2 == null ? rkoVar2.f(this) : 0.0f;
            rko rkoVar3 = tkoVar.s;
            float e2 = rkoVar3 == null ? rkoVar3.e(this) : 3.0f;
            rko rkoVar4 = tkoVar.t;
            float f9 = rkoVar4 != null ? rkoVar4.f(this) : 3.0f;
            spiVar = tkoVar.o;
            if (spiVar == null) {
                float f10 = e2 / spiVar.d;
                float f11 = f9 / spiVar.e;
                lqm lqmVar = tkoVar.n;
                if (lqmVar == null) {
                    lqmVar = lqm.d;
                }
                boolean equals = lqmVar.equals(lqm.c);
                kqm kqmVar = lqmVar.a;
                if (!equals) {
                    f10 = lqmVar.b == 2 ? Math.max(f10, f11) : Math.min(f10, f11);
                    f11 = f10;
                }
                matrix.preTranslate((-e) * f10, (-f8) * f11);
                canvas.concat(matrix);
                spi spiVar2 = tkoVar.o;
                float f12 = spiVar2.d * f10;
                float f13 = spiVar2.e * f11;
                int ordinal = kqmVar.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 5) {
                            if (ordinal != 6) {
                                if (ordinal != 8) {
                                    if (ordinal != 9) {
                                        f3 = 0.0f;
                                        switch (kqmVar.ordinal()) {
                                            case 4:
                                            case 5:
                                            case 6:
                                                f4 = (f9 - f13) / 2.0f;
                                                f6 = 0.0f - f4;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                f4 = f9 - f13;
                                                f6 = 0.0f - f4;
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    f2 = e2 - f12;
                    f3 = 0.0f - f2;
                    switch (kqmVar.ordinal()) {
                    }
                }
                f2 = (e2 - f12) / 2.0f;
                f3 = 0.0f - f2;
                switch (kqmVar.ordinal()) {
                }
            } else {
                matrix.preTranslate(-e, -f8);
                canvas.concat(matrix);
                if (!((kmo) this.d).a.o.booleanValue()) {
                    L0(0.0f, 0.0f, e2, f9);
                }
            }
            C0 = C0();
            G0(tkoVar, false);
            if (C0) {
                A0(tkoVar.h);
            }
            Q0();
        }
        f = 0.0f;
        if (!tkoVar.p) {
        }
        this.d = X(tkoVar);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(fmoVar.a, fmoVar.b);
        matrix2.preRotate(f);
        matrix2.preScale(d, d);
        rko rkoVar5 = tkoVar.q;
        if (rkoVar5 == null) {
        }
        rko rkoVar22 = tkoVar.r;
        if (rkoVar22 == null) {
        }
        rko rkoVar32 = tkoVar.s;
        if (rkoVar32 == null) {
        }
        rko rkoVar42 = tkoVar.t;
        if (rkoVar42 != null) {
        }
        spiVar = tkoVar.o;
        if (spiVar == null) {
        }
        C0 = C0();
        G0(tkoVar, false);
        if (C0) {
        }
        Q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(boolean z, spi spiVar, wko wkoVar) {
        float c;
        float f;
        float c2;
        float f2;
        float c3;
        float c4;
        float c5;
        float c6;
        llo H = ((sfm) this.c).H(wkoVar.a);
        if (H == null) {
            O("%s reference '%s' not found", z ? "Fill" : "Stroke", wkoVar.a);
            olo oloVar = wkoVar.b;
            kmo kmoVar = (kmo) this.d;
            if (oloVar != null) {
                N0(kmoVar, z, oloVar);
                return;
            } else if (z) {
                kmoVar.b = false;
                return;
            } else {
                kmoVar.c = false;
                return;
            }
        }
        boolean z2 = H instanceof mlo;
        iko ikoVar = iko.b;
        if (z2) {
            mlo mloVar = (mlo) H;
            String str = mloVar.l;
            if (str != null) {
                T(mloVar, str);
            }
            Boolean bool = mloVar.i;
            Object[] objArr = bool != null && bool.booleanValue();
            kmo kmoVar2 = (kmo) this.d;
            Paint paint = z ? kmoVar2.d : kmoVar2.e;
            if (objArr == true) {
                spi spiVar2 = kmoVar2.g;
                if (spiVar2 == null) {
                    spiVar2 = kmoVar2.f;
                }
                rko rkoVar = mloVar.m;
                c3 = rkoVar != null ? rkoVar.e(this) : 0.0f;
                rko rkoVar2 = mloVar.n;
                c4 = rkoVar2 != null ? rkoVar2.f(this) : 0.0f;
                f2 = 0.0f;
                rko rkoVar3 = mloVar.o;
                c5 = rkoVar3 != null ? rkoVar3.e(this) : spiVar2.d;
                rko rkoVar4 = mloVar.p;
                if (rkoVar4 != null) {
                    c6 = rkoVar4.f(this);
                }
                c6 = f2;
            } else {
                f2 = 0.0f;
                rko rkoVar5 = mloVar.m;
                c3 = rkoVar5 != null ? rkoVar5.c(this, 1.0f) : 0.0f;
                rko rkoVar6 = mloVar.n;
                c4 = rkoVar6 != null ? rkoVar6.c(this, 1.0f) : 0.0f;
                rko rkoVar7 = mloVar.o;
                c5 = rkoVar7 != null ? rkoVar7.c(this, 1.0f) : 1.0f;
                rko rkoVar8 = mloVar.p;
                if (rkoVar8 != null) {
                    c6 = rkoVar8.c(this, 1.0f);
                }
                c6 = f2;
            }
            float f3 = c4;
            float f4 = c5;
            float f5 = c6;
            float f6 = c3;
            R0();
            this.d = X(mloVar);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(spiVar.b, spiVar.c);
                matrix.preScale(spiVar.d, spiVar.e);
            }
            Matrix matrix2 = mloVar.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = mloVar.h.size();
            if (size == 0) {
                Q0();
                kmo kmoVar3 = (kmo) this.d;
                if (z) {
                    kmoVar3.b = false;
                    return;
                } else {
                    kmoVar3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = mloVar.h.iterator();
            int i = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                elo eloVar = (elo) ((nlo) it.next());
                Float f8 = eloVar.h;
                float floatValue = f8 != null ? f8.floatValue() : f2;
                if (i == 0 || floatValue >= f7) {
                    fArr[i] = floatValue;
                    f7 = floatValue;
                } else {
                    fArr[i] = f7;
                }
                R0();
                b1((kmo) this.d, eloVar);
                flo floVar = ((kmo) this.d).a;
                iko ikoVar2 = (iko) floVar.v;
                if (ikoVar2 == null) {
                    ikoVar2 = ikoVar;
                }
                iArr[i] = z(ikoVar2.a, floVar.w.floatValue());
                i++;
                Q0();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                Q0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i2 = mloVar.k;
            if (i2 != 0) {
                if (i2 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i2 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            Q0();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue2 = (int) (((kmo) this.d).a.c.floatValue() * 256.0f);
            paint.setAlpha(floatValue2 >= 0 ? floatValue2 > 255 ? KotlinVersion.MAX_COMPONENT_VALUE : floatValue2 : 0);
            return;
        }
        if (!(H instanceof qlo)) {
            if (H instanceof dlo) {
                dlo dloVar = (dlo) H;
                flo floVar2 = dloVar.e;
                if (z) {
                    if (i0(floVar2, 2147483648L)) {
                        kmo kmoVar4 = (kmo) this.d;
                        flo floVar3 = kmoVar4.a;
                        olo oloVar2 = dloVar.e.z;
                        floVar3.b = oloVar2;
                        kmoVar4.b = oloVar2 != null;
                    }
                    if (i0(dloVar.e, 4294967296L)) {
                        ((kmo) this.d).a.c = dloVar.e.A;
                    }
                    if (i0(dloVar.e, 6442450944L)) {
                        kmo kmoVar5 = (kmo) this.d;
                        N0(kmoVar5, z, kmoVar5.a.b);
                        return;
                    }
                    return;
                }
                if (i0(floVar2, 2147483648L)) {
                    kmo kmoVar6 = (kmo) this.d;
                    flo floVar4 = kmoVar6.a;
                    olo oloVar3 = dloVar.e.z;
                    floVar4.d = oloVar3;
                    kmoVar6.c = oloVar3 != null;
                }
                if (i0(dloVar.e, 4294967296L)) {
                    ((kmo) this.d).a.e = dloVar.e.A;
                }
                if (i0(dloVar.e, 6442450944L)) {
                    kmo kmoVar7 = (kmo) this.d;
                    N0(kmoVar7, z, kmoVar7.a.d);
                    return;
                }
                return;
            }
            return;
        }
        qlo qloVar = (qlo) H;
        String str2 = qloVar.l;
        if (str2 != null) {
            T(qloVar, str2);
        }
        Boolean bool2 = qloVar.i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        kmo kmoVar8 = (kmo) this.d;
        Paint paint2 = z ? kmoVar8.d : kmoVar8.e;
        if (objArr2 == true) {
            rko rkoVar9 = new rko(9, 50.0f);
            rko rkoVar10 = qloVar.m;
            float e = rkoVar10 != null ? rkoVar10.e(this) : rkoVar9.e(this);
            rko rkoVar11 = qloVar.n;
            c = rkoVar11 != null ? rkoVar11.f(this) : rkoVar9.f(this);
            rko rkoVar12 = qloVar.o;
            c2 = rkoVar12 != null ? rkoVar12.b(this) : rkoVar9.b(this);
            f = e;
        } else {
            rko rkoVar13 = qloVar.m;
            float c7 = rkoVar13 != null ? rkoVar13.c(this, 1.0f) : 0.5f;
            rko rkoVar14 = qloVar.n;
            c = rkoVar14 != null ? rkoVar14.c(this, 1.0f) : 0.5f;
            rko rkoVar15 = qloVar.o;
            f = c7;
            c2 = rkoVar15 != null ? rkoVar15.c(this, 1.0f) : 0.5f;
        }
        float f9 = c;
        R0();
        this.d = X(qloVar);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(spiVar.b, spiVar.c);
            matrix3.preScale(spiVar.d, spiVar.e);
        }
        Matrix matrix4 = qloVar.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = qloVar.h.size();
        if (size2 == 0) {
            Q0();
            kmo kmoVar9 = (kmo) this.d;
            if (z) {
                kmoVar9.b = false;
                return;
            } else {
                kmoVar9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = qloVar.h.iterator();
        int i3 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            elo eloVar2 = (elo) ((nlo) it2.next());
            Float f11 = eloVar2.h;
            float floatValue3 = f11 != null ? f11.floatValue() : 0.0f;
            if (i3 == 0 || floatValue3 >= f10) {
                fArr2[i3] = floatValue3;
                f10 = floatValue3;
            } else {
                fArr2[i3] = f10;
            }
            R0();
            b1((kmo) this.d, eloVar2);
            flo floVar5 = ((kmo) this.d).a;
            iko ikoVar3 = (iko) floVar5.v;
            if (ikoVar3 == null) {
                ikoVar3 = ikoVar;
            }
            iArr2[i3] = z(ikoVar3.a, floVar5.w.floatValue());
            i3++;
            Q0();
        }
        if (c2 == 0.0f || size2 == 1) {
            Q0();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i4 = qloVar.k;
        if (i4 != 0) {
            if (i4 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i4 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        Q0();
        RadialGradient radialGradient = new RadialGradient(f, f9, c2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue4 = (int) (((kmo) this.d).a.c.floatValue() * 256.0f);
        paint2.setAlpha(floatValue4 >= 0 ? floatValue4 > 255 ? 255 : floatValue4 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I0(nko nkoVar) {
        tko tkoVar;
        String str;
        tko tkoVar2;
        String str2;
        tko tkoVar3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        int i2;
        flo floVar = ((kmo) this.d).a;
        String str3 = floVar.q;
        if (str3 == null && floVar.r == null && floVar.s == null) {
            return;
        }
        if (str3 != null) {
            llo H = nkoVar.a.H(str3);
            if (H != null) {
                tkoVar = (tko) H;
                str = ((kmo) this.d).a.r;
                if (str != null) {
                    llo H2 = nkoVar.a.H(str);
                    if (H2 != null) {
                        tkoVar2 = (tko) H2;
                        str2 = ((kmo) this.d).a.s;
                        if (str2 != null) {
                            llo H3 = nkoVar.a.H(str2);
                            if (H3 != null) {
                                tkoVar3 = (tko) H3;
                                float f4 = 0.0f;
                                if (!(nkoVar instanceof xko)) {
                                    arrayList = new emo(this, ((xko) nkoVar).o).a;
                                    f2 = 0.0f;
                                    i = 1;
                                } else if (nkoVar instanceof sko) {
                                    sko skoVar = (sko) nkoVar;
                                    rko rkoVar = skoVar.o;
                                    float e = rkoVar != null ? rkoVar.e(this) : 0.0f;
                                    rko rkoVar2 = skoVar.p;
                                    float f5 = rkoVar2 != null ? rkoVar2.f(this) : 0.0f;
                                    rko rkoVar3 = skoVar.q;
                                    float e2 = rkoVar3 != null ? rkoVar3.e(this) : 0.0f;
                                    rko rkoVar4 = skoVar.r;
                                    float f6 = rkoVar4 != null ? rkoVar4.f(this) : 0.0f;
                                    ArrayList arrayList2 = new ArrayList(2);
                                    float f7 = e2 - e;
                                    i = 1;
                                    float f8 = f6 - f5;
                                    arrayList2.add(new fmo(e, f5, f7, f8));
                                    arrayList2.add(new fmo(e2, f6, f7, f8));
                                    f2 = 0.0f;
                                    arrayList = arrayList2;
                                } else {
                                    i = 1;
                                    alo aloVar = (alo) nkoVar;
                                    int length = aloVar.o.length;
                                    if (length < 2) {
                                        arrayList = null;
                                        f2 = 0.0f;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        float[] fArr = aloVar.o;
                                        fmo fmoVar = new fmo(fArr[0], fArr[1], 0.0f, 0.0f);
                                        int i3 = 2;
                                        float f9 = 0.0f;
                                        float f10 = 0.0f;
                                        while (true) {
                                            f = fmoVar.b;
                                            f2 = f4;
                                            f3 = fmoVar.a;
                                            if (i3 >= length) {
                                                break;
                                            }
                                            float[] fArr2 = aloVar.o;
                                            float f11 = fArr2[i3];
                                            float f12 = fArr2[i3 + 1];
                                            fmoVar.a(f11, f12);
                                            arrayList3.add(fmoVar);
                                            fmoVar = new fmo(f11, f12, f11 - f3, f12 - f);
                                            i3 += 2;
                                            f10 = f12;
                                            f9 = f11;
                                            f4 = f2;
                                        }
                                        if (aloVar instanceof blo) {
                                            float[] fArr3 = aloVar.o;
                                            float f13 = fArr3[0];
                                            if (f9 != f13) {
                                                float f14 = fArr3[1];
                                                if (f10 != f14) {
                                                    fmoVar.a(f13, f14);
                                                    arrayList3.add(fmoVar);
                                                    fmo fmoVar2 = new fmo(f13, f14, f13 - f3, f14 - f);
                                                    fmoVar2.b((fmo) arrayList3.get(0));
                                                    arrayList3.add(fmoVar2);
                                                    arrayList3.set(0, fmoVar2);
                                                }
                                            }
                                        } else {
                                            arrayList3.add(fmoVar);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                if (arrayList == null && (size = arrayList.size()) != 0) {
                                    flo floVar2 = ((kmo) this.d).a;
                                    floVar2.s = null;
                                    floVar2.r = null;
                                    floVar2.q = null;
                                    if (tkoVar != null) {
                                        H0(tkoVar, (fmo) arrayList.get(0));
                                    }
                                    if (tkoVar2 != null && arrayList.size() > 2) {
                                        fmo fmoVar3 = (fmo) arrayList.get(0);
                                        fmo fmoVar4 = (fmo) arrayList.get(i);
                                        i2 = 1;
                                        while (i2 < size - 1) {
                                            i2++;
                                            fmo fmoVar5 = (fmo) arrayList.get(i2);
                                            if (fmoVar4.e) {
                                                float f15 = fmoVar4.c;
                                                float f16 = fmoVar4.d;
                                                float f17 = fmoVar4.a;
                                                float f18 = f17 - fmoVar3.a;
                                                float f19 = fmoVar4.b;
                                                float f20 = ((f19 - fmoVar3.b) * f16) + (f18 * f15);
                                                if (f20 == f2) {
                                                    f20 = ((fmoVar5.a - f17) * f15) + ((fmoVar5.b - f19) * f16);
                                                }
                                                if (f20 <= f2 && (f20 != f2 || (f15 <= f2 && f16 < f2))) {
                                                    fmoVar4.c = -f15;
                                                    fmoVar4.d = -f16;
                                                }
                                            }
                                            H0(tkoVar2, fmoVar4);
                                            fmoVar3 = fmoVar4;
                                            fmoVar4 = fmoVar5;
                                        }
                                    }
                                    if (tkoVar3 == null) {
                                        H0(tkoVar3, (fmo) arrayList.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            O("Marker reference '%s' not found", ((kmo) this.d).a.s);
                        }
                        tkoVar3 = null;
                        float f42 = 0.0f;
                        if (!(nkoVar instanceof xko)) {
                        }
                        if (arrayList == null) {
                            return;
                        }
                        flo floVar22 = ((kmo) this.d).a;
                        floVar22.s = null;
                        floVar22.r = null;
                        floVar22.q = null;
                        if (tkoVar != null) {
                        }
                        if (tkoVar2 != null) {
                            fmo fmoVar32 = (fmo) arrayList.get(0);
                            fmo fmoVar42 = (fmo) arrayList.get(i);
                            i2 = 1;
                            while (i2 < size - 1) {
                            }
                        }
                        if (tkoVar3 == null) {
                        }
                    } else {
                        O("Marker reference '%s' not found", ((kmo) this.d).a.r);
                    }
                }
                tkoVar2 = null;
                str2 = ((kmo) this.d).a.s;
                if (str2 != null) {
                }
                tkoVar3 = null;
                float f422 = 0.0f;
                if (!(nkoVar instanceof xko)) {
                }
                if (arrayList == null) {
                }
            } else {
                O("Marker reference '%s' not found", ((kmo) this.d).a.q);
            }
        }
        tkoVar = null;
        str = ((kmo) this.d).a.r;
        if (str != null) {
        }
        tkoVar2 = null;
        str2 = ((kmo) this.d).a.s;
        if (str2 != null) {
        }
        tkoVar3 = null;
        float f4222 = 0.0f;
        if (!(nkoVar instanceof xko)) {
        }
        if (arrayList == null) {
        }
    }

    public boolean J() {
        Boolean bool = ((kmo) this.d).a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void J0(uko ukoVar, spi spiVar) {
        float f;
        float f2;
        Canvas canvas = (Canvas) this.b;
        Boolean bool = ukoVar.n;
        if (bool == null || !bool.booleanValue()) {
            rko rkoVar = ukoVar.p;
            float c = rkoVar != null ? rkoVar.c(this, 1.0f) : 1.2f;
            rko rkoVar2 = ukoVar.q;
            float c2 = rkoVar2 != null ? rkoVar2.c(this, 1.0f) : 1.2f;
            f = c * spiVar.d;
            f2 = c2 * spiVar.e;
        } else {
            rko rkoVar3 = ukoVar.p;
            f = rkoVar3 != null ? rkoVar3.e(this) : spiVar.d;
            rko rkoVar4 = ukoVar.q;
            f2 = rkoVar4 != null ? rkoVar4.f(this) : spiVar.e;
        }
        if (f == 0.0f || f2 == 0.0f) {
            return;
        }
        R0();
        kmo X = X(ukoVar);
        this.d = X;
        X.a.j = Float.valueOf(1.0f);
        boolean C0 = C0();
        canvas.save();
        Boolean bool2 = ukoVar.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(spiVar.b, spiVar.c);
            canvas.scale(spiVar.d, spiVar.e);
        }
        G0(ukoVar, false);
        canvas.restore();
        if (C0) {
            A0(spiVar);
        }
        Q0();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K(klo kloVar, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        boolean z2;
        float floor;
        float d;
        boolean C0;
        float f6;
        float f7;
        Canvas canvas = (Canvas) this.b;
        olo oloVar = ((kmo) this.d).a.b;
        if (oloVar instanceof wko) {
            llo H = ((sfm) this.c).H(((wko) oloVar).a);
            if (H instanceof zko) {
                zko zkoVar = (zko) H;
                Boolean bool = zkoVar.p;
                boolean z3 = bool != null && bool.booleanValue();
                String str = zkoVar.w;
                if (str != null) {
                    V(zkoVar, str);
                }
                rko rkoVar = zkoVar.s;
                if (z3) {
                    f2 = rkoVar != null ? rkoVar.e(this) : 0.0f;
                    rko rkoVar2 = zkoVar.t;
                    f3 = rkoVar2 != null ? rkoVar2.f(this) : 0.0f;
                    rko rkoVar3 = zkoVar.u;
                    f4 = rkoVar3 != null ? rkoVar3.e(this) : 0.0f;
                    rko rkoVar4 = zkoVar.v;
                    f = rkoVar4 != null ? rkoVar4.f(this) : 0.0f;
                } else {
                    float c = rkoVar != null ? rkoVar.c(this, 1.0f) : 0.0f;
                    rko rkoVar5 = zkoVar.t;
                    float c2 = rkoVar5 != null ? rkoVar5.c(this, 1.0f) : 0.0f;
                    rko rkoVar6 = zkoVar.u;
                    float c3 = rkoVar6 != null ? rkoVar6.c(this, 1.0f) : 0.0f;
                    rko rkoVar7 = zkoVar.v;
                    float c4 = rkoVar7 != null ? rkoVar7.c(this, 1.0f) : 0.0f;
                    spi spiVar = kloVar.h;
                    float f8 = spiVar.b;
                    float f9 = spiVar.d;
                    float f10 = (c * f9) + f8;
                    float f11 = spiVar.c;
                    float f12 = spiVar.e;
                    float f13 = c3 * f9;
                    f = c4 * f12;
                    f2 = f10;
                    f3 = (c2 * f12) + f11;
                    f4 = f13;
                }
                if (f4 == 0.0f || f == 0.0f) {
                    return;
                }
                lqm lqmVar = zkoVar.n;
                if (lqmVar == null) {
                    lqmVar = lqm.d;
                }
                R0();
                canvas.clipPath(path);
                kmo kmoVar = new kmo();
                a1(kmoVar, flo.b());
                kmoVar.a.o = Boolean.FALSE;
                Y(zkoVar, kmoVar);
                this.d = kmoVar;
                spi spiVar2 = kloVar.h;
                Matrix matrix = zkoVar.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (zkoVar.r.invert(matrix2)) {
                        spi spiVar3 = kloVar.h;
                        float f14 = spiVar3.b;
                        float f15 = spiVar3.c;
                        float c5 = spiVar3.c();
                        z = true;
                        spi spiVar4 = kloVar.h;
                        z2 = false;
                        float f16 = spiVar4.c;
                        float c6 = spiVar4.c();
                        float d2 = kloVar.h.d();
                        spi spiVar5 = kloVar.h;
                        f5 = f2;
                        float[] fArr = {f14, f15, c5, f16, c6, d2, spiVar5.b, spiVar5.d()};
                        matrix2.mapPoints(fArr);
                        float f17 = fArr[0];
                        float f18 = fArr[1];
                        RectF rectF = new RectF(f17, f18, f17, f18);
                        for (int i = 2; i <= 6; i += 2) {
                            float f19 = fArr[i];
                            if (f19 < rectF.left) {
                                rectF.left = f19;
                            }
                            if (f19 > rectF.right) {
                                rectF.right = f19;
                            }
                            float f20 = fArr[i + 1];
                            if (f20 < rectF.top) {
                                rectF.top = f20;
                            }
                            if (f20 > rectF.bottom) {
                                rectF.bottom = f20;
                            }
                        }
                        float f21 = rectF.left;
                        float f22 = rectF.top;
                        spiVar2 = new spi(f21, f22, rectF.right - f21, rectF.bottom - f22);
                        float floor2 = (((float) Math.floor((spiVar2.b - f5) / f4)) * f4) + f5;
                        float c7 = spiVar2.c();
                        d = spiVar2.d();
                        spi spiVar6 = new spi(0.0f, 0.0f, f4, f);
                        C0 = C0();
                        for (floor = (((float) Math.floor((spiVar2.c - f3) / f)) * f) + f3; floor < d; floor += f) {
                            float f23 = floor2;
                            while (f23 < c7) {
                                spiVar6.b = f23;
                                spiVar6.c = floor;
                                R0();
                                if (((kmo) this.d).a.o.booleanValue()) {
                                    f6 = d;
                                    f7 = floor2;
                                } else {
                                    f6 = d;
                                    f7 = floor2;
                                    L0(spiVar6.b, spiVar6.c, spiVar6.d, spiVar6.e);
                                }
                                spi spiVar7 = zkoVar.o;
                                if (spiVar7 != null) {
                                    canvas.concat(q(spiVar6, spiVar7, lqmVar));
                                } else {
                                    Boolean bool2 = zkoVar.q;
                                    boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                                    canvas.translate(f23, floor);
                                    if (!z4) {
                                        spi spiVar8 = kloVar.h;
                                        canvas.scale(spiVar8.d, spiVar8.e);
                                    }
                                }
                                Iterator it = zkoVar.i.iterator();
                                while (it.hasNext()) {
                                    F0((nlo) it.next());
                                }
                                Q0();
                                f23 += f4;
                                d = f6;
                                floor2 = f7;
                            }
                        }
                        if (C0) {
                            A0(zkoVar.h);
                        }
                        Q0();
                        return;
                    }
                }
                f5 = f2;
                z = true;
                z2 = false;
                float floor22 = (((float) Math.floor((spiVar2.b - f5) / f4)) * f4) + f5;
                float c72 = spiVar2.c();
                d = spiVar2.d();
                spi spiVar62 = new spi(0.0f, 0.0f, f4, f);
                C0 = C0();
                while (floor < d) {
                }
                if (C0) {
                }
                Q0();
                return;
            }
        }
        canvas.drawPath(path, ((kmo) this.d).d);
    }

    public void K0() {
        gs4 gs4Var = (gs4) this.d;
        ReentrantLock reentrantLock = (ReentrantLock) gs4Var.d;
        reentrantLock.lock();
        try {
            rar rarVar = (rar) gs4Var.e;
            Continuation continuation = null;
            if (rarVar != null && rarVar.b()) {
                ssg.a(3, "LeftoverFeedbackReporter", "reportLeftoverFeedback() is already running", null);
            } else {
                ssg.a(3, "LeftoverFeedbackReporter", "reportLeftoverFeedback() start reporting", null);
                gs4Var.e = x97.y((tf6) gs4Var.c, null, null, new bv6(gs4Var, continuation, 25), 3);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.kqo
    public TextView L() {
        return (TextView) this.e;
    }

    public void L0(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        x3n x3nVar = ((kmo) this.d).a.p;
        if (x3nVar != null) {
            f += ((rko) x3nVar.d).e(this);
            f2 += ((rko) ((kmo) this.d).a.p.a).f(this);
            f5 -= ((rko) ((kmo) this.d).a.p.b).e(this);
            f6 -= ((rko) ((kmo) this.d).a.p.c).f(this);
        }
        ((Canvas) this.b).clipRect(f, f2, f5, f6);
    }

    public void M(Path path) {
        kmo kmoVar = (kmo) this.d;
        int i = kmoVar.a.L;
        Canvas canvas = (Canvas) this.b;
        if (i != 2) {
            canvas.drawPath(path, kmoVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((kmo) this.d).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((kmo) this.d).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void M0(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String str4;
        twd twdVar;
        boolean m;
        int i2;
        PackageInfo f;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        aec aecVar = (aec) this.b;
        aecVar.a();
        bundle.putString("gmp_app_id", aecVar.c.b);
        ma maVar = (ma) this.c;
        synchronized (maVar) {
            try {
                if (maVar.a == 0 && (f = maVar.f("com.google.android.gms")) != null) {
                    maVar.a = f.versionCode;
                }
                i = maVar.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((ma) this.c).c());
        ma maVar2 = (ma) this.c;
        synchronized (maVar2) {
            try {
                if (((String) maVar2.d) == null) {
                    maVar2.i();
                }
                str3 = (String) maVar2.d;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        aec aecVar2 = (aec) this.b;
        aecVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(aecVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((kd2) ywf.n(((hec) ((iec) this.g)).d())).a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) ywf.n(((hec) ((iec) this.g)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            twdVar = (twd) ((uzm) this.f).get();
            ht7 ht7Var = (ht7) ((uzm) this.e).get();
            if (twdVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) ywf.n(((hec) ((iec) this.g)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            twdVar = (twd) ((uzm) this.f).get();
            ht7 ht7Var2 = (ht7) ((uzm) this.e).get();
            if (twdVar == null) {
            }
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) ywf.n(((hec) ((iec) this.g)).c()));
        bundle.putString("cliv", "fcm-24.0.0");
        twdVar = (twd) ((uzm) this.f).get();
        ht7 ht7Var22 = (ht7) ((uzm) this.e).get();
        if (twdVar == null || ht7Var22 == null) {
            return;
        }
        um7 um7Var = (um7) twdVar;
        synchronized (um7Var) {
            long currentTimeMillis = System.currentTimeMillis();
            ke2 ke2Var = (ke2) um7Var.a.get();
            synchronized (ke2Var) {
                m = ke2Var.m(currentTimeMillis);
            }
            if (m) {
                synchronized (ke2Var) {
                    String e3 = ke2Var.e(System.currentTimeMillis());
                    ((SharedPreferences) ke2Var.a).edit().putString("last-used-date", e3).commit();
                    ke2Var.k(e3);
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(ouj.D(i2)));
            bundle.putString("Firebase-Client", ht7Var22.a());
        }
    }

    public void N(ylo yloVar, u7g u7gVar) {
        float f;
        float f2;
        float f3;
        int b0;
        if (J()) {
            Iterator it = yloVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                nlo nloVar = (nlo) it.next();
                if (nloVar instanceof bmo) {
                    u7gVar.S(S0(((bmo) nloVar).c, z, !it.hasNext()));
                } else if (u7gVar.F((ylo) nloVar)) {
                    if (nloVar instanceof zlo) {
                        R0();
                        zlo zloVar = (zlo) nloVar;
                        b1((kmo) this.d, zloVar);
                        if (J() && d1()) {
                            llo H = zloVar.a.H(zloVar.n);
                            if (H == null) {
                                O("TextPath reference '%s' not found", zloVar.n);
                            } else {
                                xko xkoVar = (xko) H;
                                gmo gmoVar = new gmo(xkoVar.o);
                                Matrix matrix = xkoVar.n;
                                Path path = gmoVar.a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                rko rkoVar = zloVar.o;
                                r6 = rkoVar != null ? rkoVar.c(this, pathMeasure.getLength()) : 0.0f;
                                int b02 = b0();
                                if (b02 != 1) {
                                    float n = n(zloVar);
                                    if (b02 == 2) {
                                        n /= 2.0f;
                                    }
                                    r6 -= n;
                                }
                                s(zloVar.p);
                                boolean C0 = C0();
                                N(zloVar, new hmo(this, path, r6));
                                if (C0) {
                                    A0(zloVar.h);
                                }
                            }
                        }
                        Q0();
                    } else if (nloVar instanceof vlo) {
                        R0();
                        vlo vloVar = (vlo) nloVar;
                        b1((kmo) this.d, vloVar);
                        if (J()) {
                            ArrayList arrayList = vloVar.n;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = u7gVar instanceof imo;
                            if (z3) {
                                float e = !z2 ? ((imo) u7gVar).c : ((rko) vloVar.n.get(0)).e(this);
                                ArrayList arrayList2 = vloVar.o;
                                f2 = (arrayList2 == null || arrayList2.size() == 0) ? ((imo) u7gVar).d : ((rko) vloVar.o.get(0)).f(this);
                                ArrayList arrayList3 = vloVar.p;
                                f3 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((rko) vloVar.p.get(0)).e(this);
                                ArrayList arrayList4 = vloVar.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    r6 = ((rko) vloVar.q.get(0)).f(this);
                                }
                                float f4 = e;
                                f = r6;
                                r6 = f4;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            if (z2 && (b0 = b0()) != 1) {
                                float n2 = n(vloVar);
                                if (b0 == 2) {
                                    n2 /= 2.0f;
                                }
                                r6 -= n2;
                            }
                            s(vloVar.r);
                            if (z3) {
                                imo imoVar = (imo) u7gVar;
                                imoVar.c = r6 + f3;
                                imoVar.d = f2 + f;
                            }
                            boolean C02 = C0();
                            N(vloVar, u7gVar);
                            if (C02) {
                                A0(vloVar.h);
                            }
                        }
                        Q0();
                    } else if (nloVar instanceof ulo) {
                        R0();
                        ulo uloVar = (ulo) nloVar;
                        b1((kmo) this.d, uloVar);
                        if (J()) {
                            s(uloVar.o);
                            llo H2 = nloVar.a.H(uloVar.n);
                            if (H2 == null || !(H2 instanceof ylo)) {
                                O("Tref reference '%s' not found", uloVar.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                Q((ylo) H2, sb);
                                if (sb.length() > 0) {
                                    u7gVar.S(sb.toString());
                                }
                            }
                        }
                        Q0();
                    }
                }
                z = false;
            }
        }
    }

    public void P(oq oqVar, boolean z, xpt xptVar, Function1 function1) {
        oqVar.getClass();
        a0g.H((Context) this.b, oqVar.F, xptVar != null ? xptVar.c : null, xptVar != null ? xptVar.b : null, z, new ye(xptVar, this, oqVar, function1));
    }

    public Task P0(String str, String str2, Bundle bundle) {
        int i;
        try {
            M0(str, str2, bundle);
            rho rhoVar = (rho) this.d;
            f48 f48Var = f48.d;
            rnj rnjVar = rhoVar.c;
            if (rnjVar.w() < 12000000) {
                return rnjVar.y() != 0 ? rhoVar.a(bundle).f(f48Var, new rjp(rhoVar, bundle)) : ywf.v(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            anx J = anx.J(rhoVar.b);
            synchronized (J) {
                i = J.a;
                J.a = i + 1;
            }
            return J.K(new lkx(i, 1, bundle, 1)).e(f48Var, b3i.l);
        } catch (InterruptedException | ExecutionException e) {
            return ywf.v(e);
        }
    }

    public void Q(ylo yloVar, StringBuilder sb) {
        Iterator it = yloVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            nlo nloVar = (nlo) it.next();
            if (nloVar instanceof ylo) {
                Q((ylo) nloVar, sb);
            } else if (nloVar instanceof bmo) {
                sb.append(S0(((bmo) nloVar).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public void Q0() {
        ((Canvas) this.b).restore();
        this.d = (kmo) ((Stack) this.e).pop();
    }

    @Override // defpackage.nqo
    public TextView R() {
        return (TextView) this.f;
    }

    public void R0() {
        ((Canvas) this.b).save();
        ((Stack) this.e).push((kmo) this.d);
        this.d = new kmo((kmo) this.d);
    }

    public Task S(Task task) {
        return task.e(new gx0(1), new kac(20, this));
    }

    public String S0(String str, boolean z, boolean z2) {
        if (((kmo) this.d).h) {
            return str.replaceAll("[\\n\\t]", StringUtil.SPACE);
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", StringUtil.SPACE);
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", StringUtil.SPACE);
    }

    public g2t V0(TrackVariant trackVariant, int i) {
        if (trackVariant instanceof TrackVariant.Adaptive) {
            return bzf.q(1, trackVariant.getTitle(), trackVariant.getSelected(), i, new wk8(this, i, 7));
        }
        if (trackVariant instanceof TrackVariant.Variant) {
            return bzf.q(2, trackVariant.getTitle(), trackVariant.getSelected(), i, new wxs(trackVariant));
        }
        if (trackVariant instanceof TrackVariant.Disable) {
            String title = trackVariant.getTitle();
            boolean selected = trackVariant.getSelected();
            title.getClass();
            return new g2t(0, title, selected, i, null);
        }
        if (trackVariant instanceof TrackVariant.DownloadVariant ? true : trackVariant instanceof TrackVariant.PreferredTrackVariant) {
            return null;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0317, code lost:
    
        if (r4 == r8) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03f4, code lost:
    
        if (r2 == r8) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0627, code lost:
    
        if (r2 == r8) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0132, code lost:
    
        if (r3 == r8) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        if (r4 == r8) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ff, code lost:
    
        if (r3 == r8) goto L217;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object W0(i4p i4pVar, cg6 cg6Var) {
        z7p z7pVar;
        id1 id1Var;
        jbj jbjVar;
        klu kluVar;
        u51 u51Var;
        int i;
        Object m;
        oq oqVar;
        Object k;
        iwl iwlVar;
        cvl cvlVar;
        Object o;
        c01 c01Var;
        Object m2;
        raj a;
        i4p i4pVar2 = i4pVar;
        jyr jyrVar = (jyr) this.g;
        fu5 fu5Var = (fu5) this.e;
        uu5 uu5Var = fu5Var.b;
        u3g u3gVar = (u3g) this.c;
        if (cg6Var instanceof z7p) {
            z7pVar = (z7p) cg6Var;
            int i2 = z7pVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z7pVar.p = i2 - Integer.MIN_VALUE;
                Object obj = z7pVar.n;
                nm6 nm6Var = nm6.a;
                r12 = null;
                klu kluVar2 = null;
                switch (z7pVar.p) {
                    case 0:
                        qgg.h0(obj);
                        if (i4pVar2 instanceof f3p) {
                            oq oqVar2 = ((f3p) i4pVar2).b;
                            oqVar2.getClass();
                            String w = vz1.w(oqVar2.o);
                            String str = oqVar2.b;
                            String x = etn.x(oqVar2);
                            String str2 = x.length() > 0 ? x : null;
                            String o0 = etn.o0(oqVar2);
                            return new s6p(new ru(oqVar2.i(), w, str, str2, o0.length() > 0 ? o0 : null, oqVar2.g.b()), oqVar2, i4pVar2.a);
                        }
                        if (i4pVar2 instanceof f4p) {
                            oo6 oo6Var = oo6.a;
                            mqs mqsVar = ((f4p) i4pVar2).b;
                            return new v7p(oo6Var.a(mqsVar), mqsVar, i4pVar2.a);
                        }
                        if (i4pVar2 instanceof c4p) {
                            cej cejVar = (cej) jyrVar.getValue();
                            mqs mqsVar2 = ((c4p) i4pVar2).b;
                            a = cejVar.a(mqsVar2, false);
                            return new l7p(a, mqsVar2, i4pVar2.a);
                        }
                        boolean z = i4pVar2 instanceof g3p;
                        id1Var = id1.a;
                        if (!z) {
                            if (!(i4pVar2 instanceof b4p)) {
                                boolean z2 = i4pVar2 instanceof a4p;
                                jbjVar = jbj.a;
                                if (!z2) {
                                    if (i4pVar2 instanceof g4p) {
                                        u1u u1uVar = ((g4p) i4pVar2).b;
                                        String str3 = u1uVar.c;
                                        String str4 = u1uVar.d;
                                        String str5 = u1uVar.f;
                                        euu euuVar = new euu(str3, str4, str5 != null ? new jcv(str5, WebPath$Storage.AVATARS).getPathForSize(wct.s()) : null, c3x.f(u1uVar.e));
                                        np npVar = u1uVar.g;
                                        if (npVar != null) {
                                            op opVar = npVar.b;
                                            String str6 = u1uVar.c;
                                            String pathForSize = new jcv(opVar.a, WebPath$Storage.AVATARS).getPathForSize(wct.s());
                                            String str7 = npVar.a;
                                            Integer b0 = y2x.b0(opVar.b);
                                            if (b0 != null) {
                                                kluVar2 = new klu(str6, str4, pathForSize, str7, b0.intValue(), npVar.c);
                                            }
                                        }
                                        return new x7p(euuVar, u1uVar, kluVar2);
                                    }
                                    if (i4pVar2 instanceof h4p) {
                                        x1u x1uVar = ((h4p) i4pVar2).b;
                                        return new w7p(s7g.p(0, x1uVar), x1uVar, i4pVar2.a);
                                    }
                                    if (i4pVar2 instanceof z3p) {
                                        s26 s26Var = ((z3p) i4pVar2).b;
                                        s26Var.getClass();
                                        h06 h06Var = s26Var.a;
                                        wy5 wy5Var = (wy5) fu5Var.a.b;
                                        wy5Var.getClass();
                                        pw5 P = pcg.P(wy5Var, uu5Var, h06Var, s26Var.b);
                                        String str8 = h06Var.b;
                                        String str9 = h06Var.g;
                                        ZonedDateTime zonedDateTime = h06Var.f;
                                        zonedDateTime.getClass();
                                        return new k7p(new g06(P, str8, str9, ((sld) uu5Var.k).I(zonedDateTime)), s26Var, i4pVar2.a);
                                    }
                                    if (i4pVar2 instanceof u3p) {
                                        oo6 oo6Var2 = oo6.a;
                                        u3p u3pVar = (u3p) i4pVar2;
                                        mqs mqsVar3 = u3pVar.b;
                                        return new f7p(new pzo(oo6Var2.a(mqsVar3), mqsVar3.v0), mqsVar3, i4pVar2.a, u3pVar.c);
                                    }
                                    if (!(i4pVar2 instanceof i3p)) {
                                        if (i4pVar2 instanceof h3p) {
                                            h3p h3pVar = (h3p) i4pVar2;
                                            lt ltVar = h3pVar.b;
                                            ArrayList arrayList = h3pVar.c;
                                            ltVar.getClass();
                                            arrayList.getClass();
                                            u9b u9bVar = ltVar.e;
                                            String e = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
                                            String str10 = e == null ? "" : e;
                                            String str11 = ltVar.c;
                                            String M = xp3.M(arrayList);
                                            ru ruVar = new ru(ltVar.g, str10, str11, M.length() > 0 ? M : null, null, ltVar.d.b());
                                            boolean z3 = h3pVar.d;
                                            gd6 gd6Var = ltVar.f;
                                            return new u6p(new zy2(ruVar, z3, gd6Var != null ? gd6Var.c : true), ltVar, i4pVar2.a, h3pVar.e);
                                        }
                                        if (!(i4pVar2 instanceof o3p)) {
                                            if (i4pVar2 instanceof l3p) {
                                                l3p l3pVar = (l3p) i4pVar2;
                                                us5 us5Var = l3pVar.b;
                                                pw5 a2 = fu5Var.a(us5Var);
                                                String str12 = us5Var.c;
                                                String str13 = us5Var.l;
                                                ZonedDateTime zonedDateTime2 = us5Var.h;
                                                zonedDateTime2.getClass();
                                                return new y6p(new g06(a2, str12, str13, ((sld) uu5Var.k).I(zonedDateTime2)), us5Var, i4pVar2.a, l3pVar.c);
                                            }
                                            if (i4pVar2 instanceof x3p) {
                                                x3p x3pVar = (x3p) i4pVar2;
                                                zsu zsuVar = x3pVar.b;
                                                String str14 = zsuVar.a;
                                                String str15 = zsuVar.b;
                                                jcv jcvVar = zsuVar.c;
                                                String pathForSize2 = jcvVar != null ? jcvVar.getPathForSize(wct.s()) : null;
                                                d85 T = pd.T(zsuVar.g.a);
                                                euu euuVar2 = new euu(str14, str15, pathForSize2, T != null ? T.a : d85.n);
                                                np npVar2 = x3pVar.c;
                                                if (npVar2 != null) {
                                                    op opVar2 = npVar2.b;
                                                    String str16 = zsuVar.a;
                                                    String str17 = zsuVar.b;
                                                    String pathForSize3 = new jcv(opVar2.a, WebPath$Storage.AVATARS).getPathForSize(wct.s());
                                                    String str18 = npVar2.a;
                                                    Integer b02 = y2x.b0(opVar2.b);
                                                    if (b02 != null) {
                                                        kluVar = new klu(str16, str17, pathForSize3, str18, b02.intValue(), npVar2.c);
                                                        List list = zsuVar.f;
                                                        StationId f = StationId.f(zsuVar.e);
                                                        f.getClass();
                                                        return new i7p(euuVar2, kluVar, list, f, i4pVar2.a, x3pVar.d);
                                                    }
                                                }
                                                kluVar = null;
                                                List list2 = zsuVar.f;
                                                StationId f2 = StationId.f(zsuVar.e);
                                                f2.getClass();
                                                return new i7p(euuVar2, kluVar, list2, f2, i4pVar2.a, x3pVar.d);
                                            }
                                            if (i4pVar2 instanceof r3p) {
                                                r3p r3pVar = (r3p) i4pVar2;
                                                lt ltVar2 = r3pVar.b;
                                                u9b u9bVar2 = ltVar2.e;
                                                String e2 = u9bVar2 != null ? u9bVar2.e(wct.s(), WebPath$Storage.AVATARS) : null;
                                                ru ruVar2 = new ru(ltVar2.g, e2 == null ? "" : e2, ltVar2.c, ((Context) this.b).getResources().getString(R.string.artist_last_release), xp3.M(r3pVar.c), ltVar2.d == WarningContent.EXPLICIT);
                                                boolean z4 = r3pVar.d;
                                                gd6 gd6Var2 = ltVar2.f;
                                                return new e7p(new zy2(ruVar2, z4, gd6Var2 != null ? gd6Var2.c : true), ltVar2, i4pVar2.a, r3pVar.e);
                                            }
                                            if (i4pVar2 instanceof v3p) {
                                                ng1 ng1Var = (ng1) this.f;
                                                v3p v3pVar = (v3p) i4pVar2;
                                                kjm kjmVar = v3pVar.b;
                                                kjmVar.getClass();
                                                CoverPath coverPath = kjmVar.e;
                                                String str19 = kjmVar.f;
                                                String w2 = vz1.w(coverPath);
                                                Date date = kjmVar.c;
                                                mg1 mg1Var = ng1Var.a;
                                                String a3 = mg1.a(date);
                                                if (a3.length() == 0) {
                                                    dfi.r(hrg.q("Release date is empty for the album: ", str19, ". This can be fixed"), "ArtistRecentReleaseUiConverter");
                                                }
                                                return new g7p(new cz2(new qtn(w2, str19 == null ? "" : str19, a3, kjmVar.d() == jjm.d ? (String) mg1Var.b.getValue() : null, kjmVar.l, kjmVar.h == WarningContent.EXPLICIT, true), kjmVar.j), kjmVar, i4pVar2.a, v3pVar.c);
                                            }
                                            if (i4pVar2 instanceof p3p) {
                                                p3p p3pVar = (p3p) i4pVar2;
                                                lt ltVar3 = p3pVar.b;
                                                kbj c = jbj.c(ltVar3, null, new Integer(p3pVar.c), null);
                                                gd6 gd6Var3 = ltVar3.f;
                                                return new c7p(new az2(c, gd6Var3 != null ? gd6Var3.c : true), p3pVar.c, p3pVar.b, i4pVar2.a, p3pVar.d);
                                            }
                                            if (i4pVar2 instanceof q3p) {
                                                cej cejVar2 = (cej) jyrVar.getValue();
                                                q3p q3pVar = (q3p) i4pVar2;
                                                mqs mqsVar4 = q3pVar.b;
                                                return new d7p(cejVar2.a(mqsVar4, true), mqsVar4, i4pVar2.a, q3pVar.c);
                                            }
                                            if (i4pVar2 instanceof k3p) {
                                                cej cejVar3 = (cej) jyrVar.getValue();
                                                k3p k3pVar = (k3p) i4pVar2;
                                                mqs mqsVar5 = k3pVar.b;
                                                return new x6p(cejVar3.a(mqsVar5, true), mqsVar5, i4pVar2.a, k3pVar.c);
                                            }
                                            if (!(i4pVar2 instanceof m3p)) {
                                                if (!(i4pVar2 instanceof j3p)) {
                                                    if (i4pVar2 instanceof n3p) {
                                                        n3p n3pVar = (n3p) i4pVar2;
                                                        return new a7p(n3pVar.b, i4pVar2.a, n3pVar.c);
                                                    }
                                                    if (i4pVar2 instanceof w3p) {
                                                        w3p w3pVar = (w3p) i4pVar2;
                                                        x1u x1uVar2 = w3pVar.b;
                                                        return new h7p(s7g.p(0, x1uVar2), x1uVar2, i4pVar2.a, w3pVar.c);
                                                    }
                                                    if (i4pVar2 instanceof t3p) {
                                                        return null;
                                                    }
                                                    if (i4pVar2 instanceof d4p) {
                                                        n7n n7nVar = ((d4p) i4pVar2).b;
                                                        return new p7p(new s7n(n7nVar.a, n7nVar.b), n7nVar);
                                                    }
                                                    b6e.s();
                                                    return null;
                                                }
                                                j3p j3pVar = (j3p) i4pVar2;
                                                ArrayList<u51> arrayList2 = j3pVar.c;
                                                String str20 = j3pVar.b;
                                                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                                                for (u51 u51Var2 : arrayList2) {
                                                    u51Var2.getClass();
                                                    u9b u9bVar3 = u51Var2.c;
                                                    String e3 = u9bVar3 != null ? u9bVar3.e(wct.s(), WebPath$Storage.AVATARS) : null;
                                                    if (e3 == null) {
                                                        e3 = "";
                                                    }
                                                    String str21 = u51Var2.b;
                                                    String C = tt0.C(0);
                                                    dag.A(0, false);
                                                    C.getClass();
                                                    arrayList3.add(new jd1(e3, str21, false, null));
                                                }
                                                str20.getClass();
                                                nnk nnkVar = new nnk();
                                                nnkVar.a = str20;
                                                nnkVar.b = arrayList3;
                                                return new w6p(nnkVar, arrayList2, i4pVar2.a, j3pVar.d);
                                            }
                                            m3p m3pVar = (m3p) i4pVar2;
                                            lt ltVar4 = m3pVar.b;
                                            ArrayList arrayList4 = m3pVar.c;
                                            String str22 = m3pVar.d;
                                            z7pVar.j = i4pVar2;
                                            z7pVar.p = 6;
                                            obj = jbjVar.b(ltVar4, arrayList4, str22, z7pVar);
                                            break;
                                        } else {
                                            iwl iwlVar2 = iwl.a;
                                            o3p o3pVar = (o3p) i4pVar2;
                                            eul eulVar = o3pVar.b;
                                            int i3 = o3pVar.d;
                                            Integer num = new Integer(o3pVar.c);
                                            z7pVar.j = i4pVar2;
                                            z7pVar.p = 5;
                                            obj = ((hwl) iwl.b.getValue()).b(eulVar, i3, num, z7pVar);
                                            break;
                                        }
                                    } else {
                                        i3p i3pVar = (i3p) i4pVar2;
                                        u51Var = i3pVar.b;
                                        i = i3pVar.c;
                                        String str23 = u51Var.a;
                                        z7pVar.j = i4pVar2;
                                        z7pVar.k = id1Var;
                                        z7pVar.l = u51Var;
                                        z7pVar.m = i;
                                        z7pVar.p = 4;
                                        m = ((t3g) u3gVar).m(str23, z7pVar);
                                        break;
                                    }
                                } else {
                                    oqVar = ((a4p) i4pVar2).b;
                                    String str24 = oqVar.a;
                                    z7pVar.j = i4pVar2;
                                    z7pVar.k = jbjVar;
                                    z7pVar.l = oqVar;
                                    z7pVar.p = 3;
                                    k = ((t3g) u3gVar).k(str24, z7pVar);
                                    break;
                                }
                            } else {
                                iwlVar = iwl.a;
                                cvlVar = ((b4p) i4pVar2).b;
                                nvl g = cvlVar.g();
                                z7pVar.j = i4pVar2;
                                z7pVar.k = iwlVar;
                                z7pVar.l = cvlVar;
                                z7pVar.p = 2;
                                o = ((t3g) u3gVar).o(g, z7pVar);
                                break;
                            }
                        } else {
                            c01Var = ((g3p) i4pVar2).b;
                            String str25 = c01Var.a;
                            z7pVar.j = i4pVar2;
                            z7pVar.k = id1Var;
                            z7pVar.l = c01Var;
                            z7pVar.p = 1;
                            m2 = ((t3g) u3gVar).m(str25, z7pVar);
                            break;
                        }
                        return nm6Var;
                    case 1:
                        c01 c01Var2 = (c01) z7pVar.l;
                        id1 id1Var2 = (id1) z7pVar.k;
                        i4p i4pVar3 = z7pVar.j;
                        qgg.h0(obj);
                        id1Var = id1Var2;
                        m2 = obj;
                        c01Var = c01Var2;
                        i4pVar2 = i4pVar3;
                        boolean booleanValue = ((Boolean) m2).booleanValue();
                        id1Var.getClass();
                        c01Var.getClass();
                        String w3 = vz1.w(c01Var.q.a);
                        String str26 = c01Var.b;
                        int i4 = c01Var.g;
                        return new t6p(new jd1(w3, str26, booleanValue, i4 > 0 ? new w3g(tt0.C(i4), dag.A(i4, booleanValue), booleanValue) : null), ((g3p) i4pVar2).b, i4pVar2.a);
                    case 2:
                        cvl cvlVar2 = (cvl) z7pVar.l;
                        iwlVar = (iwl) z7pVar.k;
                        i4p i4pVar4 = z7pVar.j;
                        qgg.h0(obj);
                        cvlVar = cvlVar2;
                        i4pVar2 = i4pVar4;
                        o = obj;
                        boolean booleanValue2 = ((Boolean) o).booleanValue();
                        boolean h2 = ((z66) this.d).h();
                        iwlVar.getClass();
                        cvlVar.getClass();
                        String w4 = vz1.w(op7.c(cvlVar).a);
                        String str27 = cvlVar.b;
                        int i5 = cvlVar.h;
                        return new o7p(new lwl(w4, str27, booleanValue2, i5 > 0 ? new w3g(tt0.C(i5), dag.A(i5, booleanValue2), booleanValue2) : null, rzf.I(h2 ? cvlVar.i : cvlVar.g)), ((b4p) i4pVar2).b, i4pVar2.a);
                    case 3:
                        oq oqVar3 = (oq) z7pVar.l;
                        jbj jbjVar2 = (jbj) z7pVar.k;
                        i4p i4pVar5 = z7pVar.j;
                        qgg.h0(obj);
                        jbjVar = jbjVar2;
                        k = obj;
                        oqVar = oqVar3;
                        i4pVar2 = i4pVar5;
                        boolean booleanValue3 = ((Boolean) k).booleanValue();
                        jbjVar.getClass();
                        return new n7p(jbj.a(oqVar, booleanValue3), ((a4p) i4pVar2).b, i4pVar2.a);
                    case 4:
                        int i6 = z7pVar.m;
                        u51Var = (u51) z7pVar.l;
                        id1 id1Var3 = (id1) z7pVar.k;
                        i4p i4pVar6 = z7pVar.j;
                        qgg.h0(obj);
                        id1Var = id1Var3;
                        m = obj;
                        i = i6;
                        i4pVar2 = i4pVar6;
                        boolean booleanValue4 = ((Boolean) m).booleanValue();
                        id1Var.getClass();
                        u51Var.getClass();
                        u9b u9bVar4 = u51Var.c;
                        String e4 = u9bVar4 != null ? u9bVar4.e(wct.s(), WebPath$Storage.AVATARS) : null;
                        jd1 jd1Var = new jd1(e4 != null ? e4 : "", u51Var.b, booleanValue4, i > 0 ? new w3g(tt0.C(i), dag.A(i, booleanValue4), booleanValue4) : null);
                        i3p i3pVar2 = (i3p) i4pVar2;
                        boolean z5 = i3pVar2.d;
                        u51 u51Var3 = i3pVar2.b;
                        gd6 gd6Var4 = u51Var3.e;
                        return new v6p(new vm7(jd1Var, z5, gd6Var4 != null ? gd6Var4.c : true), u51Var3, i4pVar2.a, ((i3p) i4pVar2).e);
                    case 5:
                        i4pVar2 = z7pVar.j;
                        qgg.h0(obj);
                        o3p o3pVar2 = (o3p) i4pVar2;
                        return new b7p(new bz2((lwl) obj, o3pVar2.e), o3pVar2.b, i4pVar2.a, ((o3p) i4pVar2).f);
                    case 6:
                        i4pVar2 = z7pVar.j;
                        qgg.h0(obj);
                        kbj kbjVar = (kbj) obj;
                        m3p m3pVar2 = (m3p) i4pVar2;
                        gd6 gd6Var5 = m3pVar2.b.f;
                        return new z6p(new az2(kbjVar, gd6Var5 != null ? gd6Var5.c : true), m3pVar2.b, i4pVar2.a, ((m3p) i4pVar2).e);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        z7pVar = new z7p(this, cg6Var);
        Object obj2 = z7pVar.n;
        nm6 nm6Var2 = nm6.a;
        kluVar2 = null;
        klu kluVar22 = null;
        switch (z7pVar.p) {
        }
    }

    public kmo X(llo lloVar) {
        kmo kmoVar = new kmo();
        a1(kmoVar, flo.b());
        Y(lloVar, kmoVar);
        return kmoVar;
    }

    public void X0(mqs mqsVar, xh6 xh6Var) {
        b6v B0;
        b6v b6vVar;
        mqsVar.getClass();
        zus zusVar = zus.b;
        if (xh6Var instanceof sh6) {
            B0 = y5g.u0(((sh6) xh6Var).a);
        } else if (xh6Var instanceof uh6) {
            B0 = y5g.w0(((uh6) xh6Var).a);
        } else {
            if (xh6Var instanceof vh6) {
                k10 k10Var = ((vh6) xh6Var).a;
                i3q i3qVar = i3q.a;
                k10Var.getClass();
                b6vVar = new b6v(new j3q(new xc5(k10Var.h), new n3q(k10Var.d), i3qVar));
                rre.Z(mqsVar, zusVar, b6vVar, new ve(muo.MY_SHELF, zqt.d), (hn5) this.g, (y) this.c, (kxi) this.e, (CardPlaybackScope) this.f, null, null, null, 1792);
            }
            if (!(xh6Var instanceof wh6) && !xh6Var.equals(th6.a)) {
                b6e.s();
                return;
            }
            B0 = y5g.B0(mqsVar, ryt.a);
        }
        b6vVar = B0;
        rre.Z(mqsVar, zusVar, b6vVar, new ve(muo.MY_SHELF, zqt.d), (hn5) this.g, (y) this.c, (kxi) this.e, (CardPlaybackScope) this.f, null, null, null, 1792);
    }

    public void Y(nlo nloVar, kmo kmoVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (nloVar instanceof llo) {
                arrayList.add(0, (llo) nloVar);
            }
            Object obj = nloVar.b;
            if (obj == null) {
                break;
            } else {
                nloVar = (nlo) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b1(kmoVar, (llo) it.next());
        }
        kmo kmoVar2 = (kmo) this.d;
        kmoVar.g = kmoVar2.g;
        kmoVar.f = kmoVar2.f;
    }

    public void Y0(sis sisVar) {
        yde ydeVar;
        x0 x0Var = new x0(4);
        if (((yde) this.c).isEmpty()) {
            h(x0Var, (uvh) this.f, sisVar);
            if (!Objects.equals((uvh) this.g, (uvh) this.f)) {
                h(x0Var, (uvh) this.g, sisVar);
            }
            if (!Objects.equals((uvh) this.e, (uvh) this.f) && !Objects.equals((uvh) this.e, (uvh) this.g)) {
                h(x0Var, (uvh) this.e, sisVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((yde) this.c).size();
                ydeVar = (yde) this.c;
                if (i >= size) {
                    break;
                }
                h(x0Var, (uvh) ydeVar.get(i), sisVar);
                i++;
            }
            if (!ydeVar.contains((uvh) this.e)) {
                h(x0Var, (uvh) this.e, sisVar);
            }
        }
        this.d = x0Var.r();
    }

    @Override // defpackage.nqo
    public TextView Z() {
        return (TextView) this.d;
    }

    public void Z0(klo kloVar) {
        if (kloVar.b == null || kloVar.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.g).peek()).invert(matrix)) {
            spi spiVar = kloVar.h;
            float f = spiVar.b;
            float f2 = spiVar.c;
            float c = spiVar.c();
            spi spiVar2 = kloVar.h;
            float f3 = spiVar2.c;
            float c2 = spiVar2.c();
            float d = kloVar.h.d();
            spi spiVar3 = kloVar.h;
            float[] fArr = {f, f2, c, f3, c2, d, spiVar3.b, spiVar3.d()};
            matrix.preConcat(((Canvas) this.b).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            klo kloVar2 = (klo) ((Stack) this.f).peek();
            spi spiVar4 = kloVar2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (spiVar4 == null) {
                kloVar2.h = new spi(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < spiVar4.b) {
                spiVar4.b = f8;
            }
            if (f9 < spiVar4.c) {
                spiVar4.c = f9;
            }
            if (f8 + f10 > spiVar4.c()) {
                spiVar4.d = (f8 + f10) - spiVar4.b;
            }
            if (f9 + f11 > spiVar4.d()) {
                spiVar4.e = (f9 + f11) - spiVar4.c;
            }
        }
    }

    @Override // defpackage.v33
    public void a() {
        ((kv6) this.b).x0((x33) this.g);
        rar rarVar = (rar) this.f;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.f = null;
    }

    public void a1(kmo kmoVar, flo floVar) {
        if (i0(floVar, 4096L)) {
            kmoVar.a.k = floVar.k;
        }
        if (i0(floVar, 2048L)) {
            kmoVar.a.j = floVar.j;
        }
        boolean i0 = i0(floVar, 1L);
        iko ikoVar = iko.c;
        if (i0) {
            kmoVar.a.b = floVar.b;
            olo oloVar = floVar.b;
            kmoVar.b = (oloVar == null || oloVar == ikoVar) ? false : true;
        }
        if (i0(floVar, 4L)) {
            kmoVar.a.c = floVar.c;
        }
        if (i0(floVar, 6149L)) {
            N0(kmoVar, true, kmoVar.a.b);
        }
        if (i0(floVar, 2L)) {
            kmoVar.a.D = floVar.D;
        }
        if (i0(floVar, 8L)) {
            kmoVar.a.d = floVar.d;
            olo oloVar2 = floVar.d;
            kmoVar.c = (oloVar2 == null || oloVar2 == ikoVar) ? false : true;
        }
        if (i0(floVar, 16L)) {
            kmoVar.a.e = floVar.e;
        }
        if (i0(floVar, 6168L)) {
            N0(kmoVar, false, kmoVar.a.d);
        }
        if (i0(floVar, 34359738368L)) {
            kmoVar.a.L = floVar.L;
        }
        if (i0(floVar, 32L)) {
            flo floVar2 = kmoVar.a;
            rko rkoVar = floVar.f;
            floVar2.f = rkoVar;
            kmoVar.e.setStrokeWidth(rkoVar.b(this));
        }
        if (i0(floVar, 64L)) {
            flo floVar3 = kmoVar.a;
            Paint paint = kmoVar.e;
            floVar3.E = floVar.E;
            int D = ouj.D(floVar.E);
            if (D == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (D == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (D == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (i0(floVar, 128L)) {
            flo floVar4 = kmoVar.a;
            Paint paint2 = kmoVar.e;
            floVar4.F = floVar.F;
            int D2 = ouj.D(floVar.F);
            if (D2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (D2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (D2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (i0(floVar, 256L)) {
            kmoVar.a.g = floVar.g;
            kmoVar.e.setStrokeMiter(floVar.g.floatValue());
        }
        if (i0(floVar, 512L)) {
            kmoVar.a.h = floVar.h;
        }
        if (i0(floVar, 1024L)) {
            kmoVar.a.i = floVar.i;
        }
        Typeface typeface = null;
        if (i0(floVar, 1536L)) {
            flo floVar5 = kmoVar.a;
            Paint paint3 = kmoVar.e;
            rko[] rkoVarArr = floVar5.h;
            if (rkoVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = rkoVarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float b = floVar5.h[i2 % length].b(this);
                    fArr[i2] = b;
                    f += b;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float b2 = floVar5.i.b(this);
                    if (b2 < 0.0f) {
                        b2 = (b2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, b2));
                }
            }
        }
        if (i0(floVar, 16384L)) {
            float textSize = ((kmo) this.d).d.getTextSize();
            kmoVar.a.m = floVar.m;
            kmoVar.d.setTextSize(floVar.m.c(this, textSize));
            kmoVar.e.setTextSize(floVar.m.c(this, textSize));
        }
        if (i0(floVar, 8192L)) {
            kmoVar.a.l = floVar.l;
        }
        if (i0(floVar, 32768L)) {
            if (floVar.n.intValue() == -1 && kmoVar.a.n.intValue() > 100) {
                flo floVar6 = kmoVar.a;
                floVar6.n = Integer.valueOf(floVar6.n.intValue() - 100);
            } else if (floVar.n.intValue() != 1 || kmoVar.a.n.intValue() >= 900) {
                kmoVar.a.n = floVar.n;
            } else {
                flo floVar7 = kmoVar.a;
                floVar7.n = Integer.valueOf(floVar7.n.intValue() + 100);
            }
        }
        if (i0(floVar, 65536L)) {
            kmoVar.a.G = floVar.G;
        }
        if (i0(floVar, 106496L)) {
            flo floVar8 = kmoVar.a;
            ArrayList arrayList = floVar8.l;
            if (arrayList != null && ((sfm) this.c) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typeface = t(floVar8.G, floVar8.n, (String) it.next());
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                typeface = t(floVar8.G, floVar8.n, "serif");
            }
            kmoVar.d.setTypeface(typeface);
            kmoVar.e.setTypeface(typeface);
        }
        if (i0(floVar, 131072L)) {
            flo floVar9 = kmoVar.a;
            Paint paint4 = kmoVar.e;
            Paint paint5 = kmoVar.d;
            floVar9.H = floVar.H;
            paint5.setStrikeThruText(floVar.H == 4);
            paint5.setUnderlineText(floVar.H == 2);
            paint4.setStrikeThruText(floVar.H == 4);
            paint4.setUnderlineText(floVar.H == 2);
        }
        if (i0(floVar, 68719476736L)) {
            kmoVar.a.I = floVar.I;
        }
        if (i0(floVar, 262144L)) {
            kmoVar.a.J = floVar.J;
        }
        if (i0(floVar, 524288L)) {
            kmoVar.a.o = floVar.o;
        }
        if (i0(floVar, 2097152L)) {
            kmoVar.a.q = floVar.q;
        }
        if (i0(floVar, 4194304L)) {
            kmoVar.a.r = floVar.r;
        }
        if (i0(floVar, 8388608L)) {
            kmoVar.a.s = floVar.s;
        }
        if (i0(floVar, 16777216L)) {
            kmoVar.a.t = floVar.t;
        }
        if (i0(floVar, 33554432L)) {
            kmoVar.a.u = floVar.u;
        }
        if (i0(floVar, 1048576L)) {
            kmoVar.a.p = floVar.p;
        }
        if (i0(floVar, 268435456L)) {
            kmoVar.a.x = floVar.x;
        }
        if (i0(floVar, 536870912L)) {
            kmoVar.a.K = floVar.K;
        }
        if (i0(floVar, 1073741824L)) {
            kmoVar.a.y = floVar.y;
        }
        if (i0(floVar, 67108864L)) {
            kmoVar.a.v = floVar.v;
        }
        if (i0(floVar, 134217728L)) {
            kmoVar.a.w = floVar.w;
        }
        if (i0(floVar, 8589934592L)) {
            kmoVar.a.B = floVar.B;
        }
        if (i0(floVar, 17179869184L)) {
            kmoVar.a.C = floVar.C;
        }
        if (i0(floVar, 137438953472L)) {
            kmoVar.a.X = floVar.X;
        }
    }

    public int b0() {
        int i;
        flo floVar = ((kmo) this.d).a;
        return (floVar.I == 1 || (i = floVar.J) == 2) ? floVar.J : i == 1 ? 3 : 1;
    }

    public void b1(kmo kmoVar, llo lloVar) {
        boolean z = lloVar.b == null;
        flo floVar = kmoVar.a;
        Float valueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        floVar.t = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        floVar.o = bool;
        floVar.p = null;
        floVar.x = null;
        floVar.j = valueOf;
        floVar.v = iko.b;
        floVar.w = valueOf;
        floVar.y = null;
        floVar.z = null;
        floVar.A = valueOf;
        floVar.B = null;
        floVar.C = valueOf;
        floVar.L = 1;
        flo floVar2 = lloVar.e;
        if (floVar2 != null) {
            a1(kmoVar, floVar2);
        }
        ArrayList arrayList = ((lo3) ((sfm) this.c).b).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = ((lo3) ((sfm) this.c).b).b.iterator();
            while (it.hasNext()) {
                ko3 ko3Var = (ko3) it.next();
                if (n20.o(ko3Var.a, lloVar)) {
                    a1(kmoVar, ko3Var.b);
                }
            }
        }
        flo floVar3 = lloVar.f;
        if (floVar3 != null) {
            a1(kmoVar, floVar3);
        }
    }

    @Override // defpackage.typ
    public Object c() {
        throw new uej("not used in relay");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r9 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c0(rdg rdgVar, cg6 cg6Var) {
        xou xouVar;
        int i;
        if (cg6Var instanceof xou) {
            xouVar = (xou) cg6Var;
            int i2 = xouVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xouVar.m = i2 - Integer.MIN_VALUE;
                Object obj = xouVar.k;
                Object obj2 = nm6.a;
                i = xouVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    D0(x97.p((tf6) this.f, null, null, new wou(this, null, this, 0), 3));
                    if (rdgVar != null) {
                        rdgVar.g = rdgVar.c.a();
                    }
                    mu7[] mu7VarArr = (mu7[]) ((ConcurrentLinkedQueue) this.g).toArray(new mu7[0]);
                    mu7[] mu7VarArr2 = (mu7[]) Arrays.copyOf(mu7VarArr, mu7VarArr.length);
                    xouVar.j = rdgVar;
                    xouVar.m = 1;
                    obj = ox6.w(mu7VarArr2, xouVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rdgVar = xouVar.j;
                        qgg.h0(obj);
                        List list = (List) obj;
                        if (rdgVar != null) {
                            rdgVar.j = rdgVar.c.a();
                        }
                        return list;
                    }
                    rdgVar = xouVar.j;
                    qgg.h0(obj);
                }
                List list2 = (List) obj;
                if (rdgVar != null) {
                    list2.getClass();
                    rdgVar.i = rdgVar.c.a();
                    rdgVar.h = list2;
                }
                sml smlVar = (sml) this.b;
                xouVar.j = rdgVar;
                xouVar.m = 2;
                obj = smlVar.j(xouVar);
            }
        }
        xouVar = new xou(this, cg6Var);
        Object obj3 = xouVar.k;
        Object obj22 = nm6.a;
        i = xouVar.m;
        if (i != 0) {
        }
        List list22 = (List) obj3;
        if (rdgVar != null) {
        }
        sml smlVar2 = (sml) this.b;
        xouVar.j = rdgVar;
        xouVar.m = 2;
        obj3 = smlVar2.j(xouVar);
    }

    public void c1() {
        int i;
        flo floVar = ((kmo) this.d).a;
        olo oloVar = floVar.B;
        if (oloVar instanceof iko) {
            i = ((iko) oloVar).a;
        } else if (!(oloVar instanceof jko)) {
            return;
        } else {
            i = floVar.k.a;
        }
        Float f = floVar.C;
        if (f != null) {
            i = z(i, f.floatValue());
        }
        ((Canvas) this.b).drawColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d0(String str, rdg rdgVar, cg6 cg6Var) {
        you youVar;
        Object obj;
        nm6 nm6Var;
        int i;
        rdg rdgVar2;
        if (cg6Var instanceof you) {
            youVar = (you) cg6Var;
            int i2 = youVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                youVar.n = i2 - Integer.MIN_VALUE;
                obj = youVar.l;
                nm6Var = nm6.a;
                i = youVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    D0(x97.p((tf6) this.f, null, null, new wou(this, continuation, this, 1), 3));
                    if (rdgVar != null) {
                        rdgVar.g = rdgVar.c.a();
                    }
                    mu7[] mu7VarArr = (mu7[]) ((ConcurrentLinkedQueue) this.g).toArray(new mu7[0]);
                    mu7[] mu7VarArr2 = (mu7[]) Arrays.copyOf(mu7VarArr, mu7VarArr.length);
                    youVar.j = str;
                    youVar.k = rdgVar;
                    youVar.n = 1;
                    obj = ox6.w(mu7VarArr2, youVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rdgVar2 = youVar.k;
                        qgg.h0(obj);
                        List list = (List) obj;
                        if (rdgVar2 != null) {
                            rdgVar2.j = rdgVar2.c.a();
                        }
                        return list;
                    }
                    rdgVar = youVar.k;
                    str = youVar.j;
                    qgg.h0(obj);
                }
                List list2 = (List) obj;
                if (rdgVar != null) {
                    list2.getClass();
                    rdgVar.i = rdgVar.c.a();
                    rdgVar.h = list2;
                }
                sml smlVar = (sml) this.b;
                youVar.j = null;
                youVar.k = rdgVar;
                youVar.n = 2;
                obj = smlVar.k(str, youVar);
                if (obj != nm6Var) {
                    rdgVar2 = rdgVar;
                    List list3 = (List) obj;
                    if (rdgVar2 != null) {
                    }
                    return list3;
                }
                return nm6Var;
            }
        }
        youVar = new you(this, cg6Var);
        obj = youVar.l;
        nm6Var = nm6.a;
        i = youVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        List list22 = (List) obj;
        if (rdgVar != null) {
        }
        sml smlVar2 = (sml) this.b;
        youVar.j = null;
        youVar.k = rdgVar;
        youVar.n = 2;
        obj = smlVar2.k(str, youVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    public boolean d1() {
        Boolean bool = ((kmo) this.d).a.u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.v33
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(v2q v2qVar, Continuation continuation) {
        w33 w33Var;
        int i;
        if (continuation instanceof w33) {
            w33Var = (w33) continuation;
            int i2 = w33Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w33Var.l = i2 - Integer.MIN_VALUE;
                Object obj = w33Var.j;
                nm6 nm6Var = nm6.a;
                i = w33Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mal.a();
                    this.e = v2qVar;
                    boolean z = v2qVar instanceof s2q;
                    rar rarVar = (rar) this.f;
                    if (!z) {
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        this.f = null;
                        kv6 kv6Var = (kv6) this.b;
                        v0t a = kv6Var.Z().a();
                        a.c();
                        a.j(Integer.MAX_VALUE);
                        a.g(false);
                        a.h();
                        w0t b = a.b();
                        if (!b.equals(kv6Var.Z())) {
                            kv6Var.H(b);
                        }
                        return Unit.a;
                    }
                    if (rarVar != null) {
                        w33Var.l = 1;
                        if (saf.C(rarVar, w33Var) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.f = ox6.B((vdr) ((vv1) this.c).a.getValue(), (tf6) this.d, new ri(21, this));
                return Unit.a;
            }
        }
        w33Var = new w33(this, (cg6) continuation);
        Object obj2 = w33Var.j;
        nm6 nm6Var2 = nm6.a;
        i = w33Var.l;
        if (i != 0) {
        }
        this.f = ox6.B((vdr) ((vv1) this.c).a.getValue(), (tf6) this.d, new ri(21, this));
        return Unit.a;
    }

    public String e0(jzs jzsVar) {
        String str = jzsVar.d;
        if (str != null) {
            return str;
        }
        ssg.a(5, "WaveFeedbackOwner", "TrackPlayable must have batchId in wave queue", null);
        mqs mqsVar = jzsVar.a;
        zzp zzpVar = (zzp) this.e;
        mqsVar.getClass();
        return "user-queue-" + mqsVar.d().e() + "-" + new Date(zzpVar.b()).getTime();
    }

    public ColorStateList g0(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return etn.E(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230934) {
            return etn.E(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return C(context, gfs.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return C(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return C(context, gfs.c(context, R.attr.colorAccent));
            }
            if (i == 2131230929 || i == R.drawable.abc_spinner_textfield_background_material) {
                return etn.E(context, R.color.abc_tint_spinner);
            }
            if (j((int[]) this.c, i)) {
                return gfs.d(context, R.attr.colorControlNormal);
            }
            if (j((int[]) this.f, i)) {
                return etn.E(context, R.color.abc_tint_default);
            }
            if (j((int[]) this.g, i)) {
                return etn.E(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return etn.E(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = gfs.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = gfs.b;
            iArr2[0] = gfs.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = gfs.e;
            iArr2[1] = gfs.c(context, R.attr.colorControlActivated);
            iArr[2] = gfs.f;
            iArr2[2] = gfs.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = gfs.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = gfs.e;
            iArr2[1] = gfs.c(context, R.attr.colorControlActivated);
            iArr[2] = gfs.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // defpackage.adu
    public View getRoot() {
        switch (this.a) {
            case 14:
                throw null;
            case 21:
                return (ConstraintLayout) ((mmo) this.b).b;
            case 22:
                return (ConstraintLayout) ((mmo) this.b).b;
            default:
                return (ConstraintLayout) ((mmo) this.b).b;
        }
    }

    public void h(x0 x0Var, uvh uvhVar, sis sisVar) {
        if (uvhVar == null) {
            return;
        }
        if (sisVar.b(uvhVar.a) != -1) {
            x0Var.V(uvhVar, sisVar);
            return;
        }
        sis sisVar2 = (sis) ((cee) this.d).get(uvhVar);
        if (sisVar2 != null) {
            x0Var.V(uvhVar, sisVar2);
        }
    }

    public void i() {
        yp7 yp7Var = (yp7) this.c;
        this.c = new yp7(yp7Var.a, yp7Var.b, yp7Var.c, yp7Var.d, yp7Var.e, yp7Var.f, yp7Var.g, true, yp7Var.i, yp7Var.j, yp7Var.k, yp7Var.l, yp7Var.m, yp7Var.n, yp7Var.o);
    }

    public Path j0(gko gkoVar) {
        rko rkoVar = gkoVar.o;
        float e = rkoVar != null ? rkoVar.e(this) : 0.0f;
        rko rkoVar2 = gkoVar.p;
        float f = rkoVar2 != null ? rkoVar2.f(this) : 0.0f;
        float b = gkoVar.q.b(this);
        float f2 = e - b;
        float f3 = f - b;
        float f4 = e + b;
        float f5 = f + b;
        if (gkoVar.h == null) {
            float f6 = 2.0f * b;
            gkoVar.h = new spi(f2, f3, f6, f6);
        }
        float f7 = b * 0.5522848f;
        Path path = new Path();
        path.moveTo(e, f3);
        float f8 = e + f7;
        float f9 = f - f7;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path.cubicTo(f4, f10, f8, f5, e, f5);
        float f11 = e - f7;
        path.cubicTo(f11, f5, f2, f10, f2, f);
        path.cubicTo(f2, f9, f11, f3, e, f3);
        path.close();
        return path;
    }

    public skn k() {
        Context context = (Context) this.b;
        yp7 yp7Var = (yp7) this.c;
        jyr b = btf.b(new bce(this, 0));
        jyr jyrVar = (jyr) this.d;
        if (jyrVar == null) {
            jyrVar = btf.b(new bce(this, 1));
        }
        arf arfVar = (kme) this.e;
        if (arfVar == null) {
            arfVar = btf.b(grb.C);
        }
        on5 on5Var = (on5) this.f;
        if (on5Var == null) {
            c5b c5bVar = c5b.a;
            on5Var = new on5(c5bVar, c5bVar, c5bVar, c5bVar, c5bVar);
        }
        return new skn(context, yp7Var, b, jyrVar, arfVar, on5Var, (dce) this.g);
    }

    public Path k0(lko lkoVar) {
        rko rkoVar = lkoVar.o;
        float e = rkoVar != null ? rkoVar.e(this) : 0.0f;
        rko rkoVar2 = lkoVar.p;
        float f = rkoVar2 != null ? rkoVar2.f(this) : 0.0f;
        float e2 = lkoVar.q.e(this);
        float f2 = lkoVar.r.f(this);
        float f3 = e - e2;
        float f4 = f - f2;
        float f5 = e + e2;
        float f6 = f + f2;
        if (lkoVar.h == null) {
            lkoVar.h = new spi(f3, f4, e2 * 2.0f, 2.0f * f2);
        }
        float f7 = e2 * 0.5522848f;
        float f8 = f2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(e, f4);
        float f9 = e + f7;
        float f10 = f - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f);
        float f11 = f + f8;
        path.cubicTo(f5, f11, f9, f6, e, f6);
        float f12 = e - f7;
        path.cubicTo(f12, f6, f3, f11, f3, f);
        path.cubicTo(f3, f10, f12, f4, e, f4);
        path.close();
        return path;
    }

    public Path l(klo kloVar, spi spiVar) {
        Path u0;
        llo H = kloVar.a.H(((kmo) this.d).a.x);
        if (H == null) {
            O("ClipPath reference '%s' not found", ((kmo) this.d).a.x);
            return null;
        }
        hko hkoVar = (hko) H;
        ((Stack) this.e).push((kmo) this.d);
        this.d = X(hkoVar);
        Boolean bool = hkoVar.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(spiVar.b, spiVar.c);
            matrix.preScale(spiVar.d, spiVar.e);
        }
        Matrix matrix2 = hkoVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (nlo nloVar : hkoVar.i) {
            if ((nloVar instanceof klo) && (u0 = u0((klo) nloVar, true)) != null) {
                path.op(u0, Path.Op.UNION);
            }
        }
        if (((kmo) this.d).a.x != null) {
            if (hkoVar.h == null) {
                hkoVar.h = m(path);
            }
            Path l = l(hkoVar, hkoVar.h);
            if (l != null) {
                path.op(l, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = (kmo) ((Stack) this.e).pop();
        return path;
    }

    @Override // defpackage.nqo
    public TextView m0() {
        return (TextView) this.g;
    }

    public float n(ylo yloVar) {
        lmo lmoVar = new lmo(this);
        N(yloVar, lmoVar);
        return lmoVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Path n0(clo cloVar) {
        float e;
        float f;
        float min;
        float e2;
        float f2;
        float f3;
        float f4;
        Path path;
        rko rkoVar = cloVar.s;
        if (rkoVar == null && cloVar.t == null) {
            e = 0.0f;
        } else {
            rko rkoVar2 = cloVar.t;
            if (rkoVar == null) {
                e = rkoVar2.f(this);
            } else {
                if (rkoVar2 != null) {
                    e = rkoVar.e(this);
                    f = cloVar.t.f(this);
                    min = Math.min(e, cloVar.q.e(this) / 2.0f);
                    float min2 = Math.min(f, cloVar.r.f(this) / 2.0f);
                    rko rkoVar3 = cloVar.o;
                    e2 = rkoVar3 == null ? rkoVar3.e(this) : 0.0f;
                    rko rkoVar4 = cloVar.p;
                    f2 = rkoVar4 == null ? rkoVar4.f(this) : 0.0f;
                    float e3 = cloVar.q.e(this);
                    float f5 = cloVar.r.f(this);
                    if (cloVar.h == null) {
                        cloVar.h = new spi(e2, f2, e3, f5);
                    }
                    f3 = e3 + e2;
                    f4 = f2 + f5;
                    path = new Path();
                    if (min != 0.0f || min2 == 0.0f) {
                        path.moveTo(e2, f2);
                        path.lineTo(f3, f2);
                        path.lineTo(f3, f4);
                        path.lineTo(e2, f4);
                        path.lineTo(e2, f2);
                    } else {
                        float f6 = min * 0.5522848f;
                        float f7 = 0.5522848f * min2;
                        float f8 = f2 + min2;
                        path.moveTo(e2, f8);
                        float f9 = f8 - f7;
                        float f10 = e2 + min;
                        float f11 = f10 - f6;
                        path.cubicTo(e2, f9, f11, f2, f10, f2);
                        float f12 = f3 - min;
                        path.lineTo(f12, f2);
                        float f13 = f12 + f6;
                        path.cubicTo(f13, f2, f3, f9, f3, f8);
                        float f14 = f4 - min2;
                        path.lineTo(f3, f14);
                        float f15 = f14 + f7;
                        path.cubicTo(f3, f15, f13, f4, f12, f4);
                        path.lineTo(f10, f4);
                        float f16 = e2;
                        path.cubicTo(f11, f4, f16, f15, e2, f14);
                        path.lineTo(f16, f8);
                    }
                    path.close();
                    return path;
                }
                e = rkoVar.e(this);
            }
        }
        f = e;
        min = Math.min(e, cloVar.q.e(this) / 2.0f);
        float min22 = Math.min(f, cloVar.r.f(this) / 2.0f);
        rko rkoVar32 = cloVar.o;
        if (rkoVar32 == null) {
        }
        rko rkoVar42 = cloVar.p;
        if (rkoVar42 == null) {
        }
        float e32 = cloVar.q.e(this);
        float f52 = cloVar.r.f(this);
        if (cloVar.h == null) {
        }
        f3 = e32 + e2;
        f4 = f2 + f52;
        path = new Path();
        if (min != 0.0f) {
        }
        path.moveTo(e2, f2);
        path.lineTo(f3, f2);
        path.lineTo(f3, f4);
        path.lineTo(e2, f4);
        path.lineTo(e2, f2);
        path.close();
        return path;
    }

    @Override // defpackage.kqo, defpackage.wqo
    public TextView o() {
        switch (this.a) {
        }
        return (TextView) this.f;
    }

    @Override // defpackage.wqo
    public TextView o0() {
        return (TextView) this.e;
    }

    @Override // defpackage.typ
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        throw new PlaybackQueueStartValidator$InvalidQueueException(new FailedAssertionException("ynison is not expected to be launched as remote command"), null);
    }

    @Override // defpackage.nqo
    public ImageView p0() {
        return (ImageView) this.e;
    }

    public spi q0(rko rkoVar, rko rkoVar2, rko rkoVar3, rko rkoVar4) {
        float e = rkoVar != null ? rkoVar.e(this) : 0.0f;
        float f = rkoVar2 != null ? rkoVar2.f(this) : 0.0f;
        kmo kmoVar = (kmo) this.d;
        spi spiVar = kmoVar.g;
        if (spiVar == null) {
            spiVar = kmoVar.f;
        }
        return new spi(e, f, rkoVar3 != null ? rkoVar3.e(this) : spiVar.d, rkoVar4 != null ? rkoVar4.f(this) : spiVar.e);
    }

    public void r(klo kloVar, spi spiVar) {
        Path l;
        if (((kmo) this.d).a.x == null || (l = l(kloVar, spiVar)) == null) {
            return;
        }
        ((Canvas) this.b).clipPath(l);
    }

    @Override // defpackage.wqo
    public ProgressBar r0() {
        return (ProgressBar) this.c;
    }

    public void s(klo kloVar) {
        olo oloVar = ((kmo) this.d).a.b;
        if (oloVar instanceof wko) {
            I(true, kloVar.h, (wko) oloVar);
        }
        olo oloVar2 = ((kmo) this.d).a.d;
        if (oloVar2 instanceof wko) {
            I(false, kloVar.h, (wko) oloVar2);
        }
    }

    public pjc s0(yc4 yc4Var) {
        Continuation continuation = null;
        pjc b0 = zsd.b0(new eno(new c5l(this, continuation, 12)));
        return zsd.k0(new ail(3, new u21(10, zsd.a0(yc4Var, new d6h(17, this)), b0, new v42(this, continuation, 13)), this), dm6.b);
    }

    @Override // defpackage.kqo
    public TextInputLayout t0() {
        return (TextInputLayout) this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(v8n v8nVar, cg6 cg6Var) {
        zc0 zc0Var;
        int i;
        Object J;
        if (cg6Var instanceof zc0) {
            zc0Var = (zc0) cg6Var;
            int i2 = zc0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zc0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = zc0Var.j;
                nm6 nm6Var = nm6.a;
                i = zc0Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    fan fanVar = (fan) ((jyr) this.f).getValue();
                    k1l k1lVar = (k1l) ((jyr) this.e).getValue();
                    ad0 ad0Var = new ad0(v8nVar, continuation, 0);
                    zc0Var.l = 1;
                    J = a0g.J(fanVar, k1lVar, uyk.a, ad0Var, zc0Var);
                    if (J == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    J = ((z7o) obj).a;
                }
                if (z7o.a(J) != null) {
                    boolean g = ((z66) ((jyr) this.b).getValue()).g();
                    jyr jyrVar = (jyr) this.c;
                    if (g) {
                        lc0 lc0Var = (lc0) jyrVar.getValue();
                        eth ethVar = (eth) lc0Var.b.getValue();
                        String string = lc0Var.a.getString(R.string.android_auto_unknown_error);
                        string.getClass();
                        ethVar.a(new ulp(string));
                    } else {
                        lc0 lc0Var2 = (lc0) jyrVar.getValue();
                        eth ethVar2 = (eth) lc0Var2.b.getValue();
                        String string2 = lc0Var2.a.getString(R.string.no_connection_text);
                        string2.getClass();
                        ethVar2.a(new ulp(string2));
                    }
                }
                return Unit.a;
            }
        }
        zc0Var = new zc0(this, cg6Var);
        Object obj2 = zc0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = zc0Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (z7o.a(J) != null) {
        }
        return Unit.a;
    }

    public Path u0(klo kloVar, boolean z) {
        Path path;
        Path path2;
        Path l;
        ((Stack) this.e).push((kmo) this.d);
        kmo kmoVar = new kmo((kmo) this.d);
        this.d = kmoVar;
        b1(kmoVar, kloVar);
        if (!J() || !d1()) {
            this.d = (kmo) ((Stack) this.e).pop();
            return null;
        }
        if (kloVar instanceof cmo) {
            if (!z) {
                O("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            cmo cmoVar = (cmo) kloVar;
            llo H = kloVar.a.H(cmoVar.o);
            if (H == null) {
                O("Use reference '%s' not found", cmoVar.o);
                this.d = (kmo) ((Stack) this.e).pop();
                return null;
            }
            if (!(H instanceof klo)) {
                this.d = (kmo) ((Stack) this.e).pop();
                return null;
            }
            path2 = u0((klo) H, false);
            if (path2 != null) {
                if (cmoVar.h == null) {
                    cmoVar.h = m(path2);
                }
                Matrix matrix = cmoVar.n;
                if (matrix != null) {
                    path2.transform(matrix);
                }
                if (((kmo) this.d).a.x != null && (l = l(kloVar, kloVar.h)) != null) {
                    path2.op(l, Path.Op.INTERSECT);
                }
                this.d = (kmo) ((Stack) this.e).pop();
                return path2;
            }
            return null;
        }
        if (kloVar instanceof nko) {
            nko nkoVar = (nko) kloVar;
            if (kloVar instanceof xko) {
                gmo gmoVar = new gmo(((xko) kloVar).o);
                spi spiVar = kloVar.h;
                Path path3 = gmoVar.a;
                if (spiVar == null) {
                    kloVar.h = m(path3);
                }
                path = path3;
            } else {
                path = kloVar instanceof clo ? n0((clo) kloVar) : kloVar instanceof gko ? j0((gko) kloVar) : kloVar instanceof lko ? k0((lko) kloVar) : kloVar instanceof alo ? l0((alo) kloVar) : null;
            }
            if (path != null) {
                if (nkoVar.h == null) {
                    nkoVar.h = m(path);
                }
                Matrix matrix2 = nkoVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((kmo) this.d).a.K;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(kloVar instanceof wlo)) {
            O("Invalid %s element found in clipPath definition", kloVar.o());
            return null;
        }
        wlo wloVar = (wlo) kloVar;
        ArrayList arrayList = wloVar.n;
        float f = 0.0f;
        float e = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((rko) wloVar.n.get(0)).e(this);
        ArrayList arrayList2 = wloVar.o;
        float f2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((rko) wloVar.o.get(0)).f(this);
        ArrayList arrayList3 = wloVar.p;
        float e2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((rko) wloVar.p.get(0)).e(this);
        ArrayList arrayList4 = wloVar.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f = ((rko) wloVar.q.get(0)).f(this);
        }
        if (((kmo) this.d).a.J != 1) {
            float n = n(wloVar);
            if (((kmo) this.d).a.J == 2) {
                n /= 2.0f;
            }
            e -= n;
        }
        if (wloVar.h == null) {
            jmo jmoVar = new jmo(this, e, f2);
            N(wloVar, jmoVar);
            RectF rectF = (RectF) jmoVar.g;
            wloVar.h = new spi(rectF.left, rectF.top, rectF.width(), ((RectF) jmoVar.g).height());
        }
        path = new Path();
        N(wloVar, new jmo(this, e + e2, f2 + f, path));
        Matrix matrix3 = wloVar.r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        int i2 = ((kmo) this.d).a.K;
        path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        path2 = path;
        if (((kmo) this.d).a.x != null) {
            path2.op(l, Path.Op.INTERSECT);
        }
        this.d = (kmo) ((Stack) this.e).pop();
        return path2;
    }

    @Override // defpackage.typ
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        throw new PlaybackQueueStartValidator$InvalidQueueException(new uej("fm is not supported yet"), null);
    }

    public void v0(sfo sfoVar, jzs jzsVar, lln llnVar) {
        r7c xzfVar;
        String str;
        mqs mqsVar = jzsVar.a;
        v80 v80Var = jzsVar.b;
        ssg.a(3, "WaveFeedbackOwner", "Reporting attitude for trackFullId=" + mqsVar.d().e() + ", mode=" + llnVar, null);
        rr5 d = mqsVar.d();
        String e0 = e0(jzsVar);
        int ordinal = llnVar.ordinal();
        if (ordinal == 0) {
            xzfVar = new xzf(new Date(System.currentTimeMillis()), v80Var.a, d, e0);
        } else if (ordinal == 1) {
            xzfVar = new vkt(new Date(System.currentTimeMillis()), v80Var.a, d, e0);
        } else if (ordinal != 2) {
            b6e.s();
            return;
        } else {
            xzfVar = new jit(new Date(System.currentTimeMillis()), v80Var.a, d, e0);
        }
        tf6 tf6Var = (tf6) this.f;
        int ordinal2 = llnVar.ordinal();
        if (ordinal2 == 0) {
            str = "likeAwaitTimeMs";
        } else if (ordinal2 == 1) {
            str = "unlikeAwaitTimeMs";
        } else {
            if (ordinal2 != 2) {
                b6e.s();
                return;
            }
            str = "undislikeAwaitTimeMs";
        }
        D0(x97.p(tf6Var, null, null, new zou(str, this, null, this, sfoVar, xzfVar, 0), 3));
    }

    @Override // defpackage.wqo
    public TextView w() {
        return (TextView) this.g;
    }

    public void w0(sfo sfoVar, String str) {
        str.getClass();
        ssg.a(3, "WaveFeedbackOwner", "Reporting session start for rotorSession=" + sfoVar, null);
        D0(x97.p((tf6) this.f, null, null, new nr3(this, (Continuation) null, str, this, sfoVar, 3), 3));
    }

    @Override // defpackage.typ
    public Object x(StartWaveQueueCommand startWaveQueueCommand, cg6 cg6Var) {
        return x97.V(dm6.b, new r1w(new evj((f5v) this.f, startWaveQueueCommand.getStartRequest().c, startWaveQueueCommand.getStartRequest().a, startWaveQueueCommand.getStartRequest().b, (h4q) ((uol) this.e).j.a.getValue(), startWaveQueueCommand.getPlayWhenReady()), null, 8), cg6Var);
    }

    @Override // defpackage.kqo
    public RecyclerView x0() {
        return (RecyclerView) this.c;
    }

    @Override // defpackage.typ
    public Object y(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand, cg6 cg6Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        y1u y1uVar;
        String str2;
        zzp zzpVar = (zzp) this.b;
        sfn sfnVar = (sfn) this.g;
        List list = startVideoClipRadioQueueCommand.getStartRequest().d;
        Continuation continuation = null;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((y1u) it.next()).b);
            }
        } else {
            arrayList = null;
        }
        List list3 = startVideoClipRadioQueueCommand.getStartRequest().d;
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = new ArrayList(v75.o(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((y1u) it2.next()).c);
            }
        } else {
            arrayList2 = null;
        }
        q9u q9uVar = startVideoClipRadioQueueCommand.getStartRequest().e;
        if (!(q9uVar instanceof o9u)) {
            if (q9uVar instanceof p9u) {
                List list5 = startVideoClipRadioQueueCommand.getStartRequest().d;
                if (list5 != null && (y1uVar = (y1u) CollectionsKt.S(list5, ((p9u) q9uVar).a)) != null) {
                    str2 = y1uVar.a.a;
                }
            } else if (q9uVar != null) {
                b6e.s();
                return null;
            }
            str = null;
            return x97.V(dm6.b, new r1w(new ikl(zzpVar, sfnVar, arrayList, arrayList2, str, startVideoClipRadioQueueCommand.getStartRequest().a.a, startVideoClipRadioQueueCommand.getStartRequest().b, startVideoClipRadioQueueCommand.getStartRequest().c, startVideoClipRadioQueueCommand.getPlayWhenReady()), continuation, 7), cg6Var);
        }
        str2 = ((o9u) q9uVar).a;
        str = str2;
        return x97.V(dm6.b, new r1w(new ikl(zzpVar, sfnVar, arrayList, arrayList2, str, startVideoClipRadioQueueCommand.getStartRequest().a.a, startVideoClipRadioQueueCommand.getStartRequest().b, startVideoClipRadioQueueCommand.getStartRequest().c, startVideoClipRadioQueueCommand.getPlayWhenReady()), continuation, 7), cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y0(sfo sfoVar, jzs jzsVar, v5j v5jVar, cg6 cg6Var) {
        apu apuVar;
        int i;
        boolean z;
        sfo sfoVar2;
        long longValue;
        v80 v80Var;
        rr5 d;
        String e0;
        int ordinal;
        r7c svsVar;
        int ordinal2;
        String str;
        jzs jzsVar2 = jzsVar;
        v5j v5jVar2 = v5jVar;
        if (cg6Var instanceof apu) {
            apuVar = (apu) cg6Var;
            int i2 = apuVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                apuVar.o = i2 - Integer.MIN_VALUE;
                Object obj = apuVar.m;
                nm6 nm6Var = nm6.a;
                i = apuVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveFeedbackOwner", "Reporting track stop for trackFullId=" + jzsVar2.a.d().e() + ", mode=" + v5jVar2, null);
                    int ordinal3 = v5jVar2.ordinal();
                    if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
                        z = true;
                    } else {
                        if (ordinal3 != 3 && ordinal3 != 4 && ordinal3 != 5) {
                            b6e.s();
                            return null;
                        }
                        z = false;
                    }
                    pt7 pt7Var = (pt7) this.c;
                    apuVar.j = sfoVar;
                    apuVar.k = jzsVar2;
                    apuVar.l = v5jVar2;
                    apuVar.o = 1;
                    obj = pt7Var.a(jzsVar2, z, apuVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    sfoVar2 = sfoVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v5j v5jVar3 = apuVar.l;
                    jzs jzsVar3 = apuVar.k;
                    sfo sfoVar3 = apuVar.j;
                    qgg.h0(obj);
                    v5jVar2 = v5jVar3;
                    jzsVar2 = jzsVar3;
                    sfoVar2 = sfoVar3;
                }
                longValue = ((Number) obj).longValue();
                mqs mqsVar = jzsVar2.a;
                v80Var = jzsVar2.b;
                d = mqsVar.d();
                e0 = e0(jzsVar2);
                ordinal = v5jVar2.ordinal();
                if (ordinal != 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    svsVar = new svs(new Date(System.currentTimeMillis()), v80Var.a, d, longValue, jzsVar2.a.e, e0);
                } else if (ordinal == 4) {
                    svsVar = new crq(new Date(System.currentTimeMillis()), v80Var.a, d, longValue, e0);
                } else {
                    if (ordinal != 5) {
                        b6e.s();
                        return null;
                    }
                    svsVar = new k88(new Date(System.currentTimeMillis()), v80Var.a, d, longValue, e0);
                }
                r7c r7cVar = svsVar;
                tf6 tf6Var = (tf6) this.f;
                ordinal2 = v5jVar2.ordinal();
                if (ordinal2 != 0 || ordinal2 == 1) {
                    str = "naturalCompletedAwaitTimeMs";
                } else if (ordinal2 == 2 || ordinal2 == 3) {
                    str = "naturalOtherAwaitTimeMs";
                } else if (ordinal2 == 4) {
                    str = "skipAwaitTimeMs";
                } else {
                    if (ordinal2 != 5) {
                        b6e.s();
                        return null;
                    }
                    str = "dislikeAwaitTimeMs";
                }
                D0(x97.p(tf6Var, null, null, new zou(str, this, null, this, sfoVar2, r7cVar, 1), 3));
                return Unit.a;
            }
        }
        apuVar = new apu(this, cg6Var);
        Object obj2 = apuVar.m;
        nm6 nm6Var2 = nm6.a;
        i = apuVar.o;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        mqs mqsVar2 = jzsVar2.a;
        v80Var = jzsVar2.b;
        d = mqsVar2.d();
        e0 = e0(jzsVar2);
        ordinal = v5jVar2.ordinal();
        if (ordinal != 0) {
        }
        svsVar = new svs(new Date(System.currentTimeMillis()), v80Var.a, d, longValue, jzsVar2.a.e, e0);
        r7c r7cVar2 = svsVar;
        tf6 tf6Var2 = (tf6) this.f;
        ordinal2 = v5jVar2.ordinal();
        if (ordinal2 != 0) {
        }
        str = "naturalCompletedAwaitTimeMs";
        D0(x97.p(tf6Var2, null, null, new zou(str, this, null, this, sfoVar2, r7cVar2, 1), 3));
        return Unit.a;
    }

    public void z0(mqs mqsVar) {
        CardPlaybackScope p = d.p((nrf) this.d);
        hn5 hn5Var = (hn5) this.g;
        k10 k10Var = mqsVar.d;
        String str = k10Var.a;
        String str2 = k10Var.d;
        rre rreVar = tq.a;
        Album$AlbumType d = k10Var.d();
        rreVar.getClass();
        tq Q = rre.Q(d);
        aud audVar = new aud(ouj.t(mqsVar.p));
        k10 k10Var2 = mqsVar.d;
        nyk nykVar = oyk.a;
        hn5Var.startActivity(quj.U(hn5Var, new uq(str, str2, Q, audVar, p.a(oyk.a(k10Var2.a, k10Var2.d)).a(), null, mqsVar, false, rq.a, false), p));
    }

    public mmo(tf6 tf6Var, jyr jyrVar, jyr jyrVar2) {
        this.a = 8;
        tf6Var.getClass();
        jyrVar.getClass();
        jyrVar2.getClass();
        this.b = jyrVar;
        this.c = jyrVar2;
        this.d = ydr.a(new yaa(0, 0, Integer.MAX_VALUE));
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.g = new LinkedHashSet();
        Continuation continuation = null;
        x97.y(tf6Var, null, null, new aba(this, continuation, 0), 3);
        x97.y(tf6Var, null, null, new aba(this, continuation, 1), 3);
    }

    public mmo(paw pawVar, Handler handler) {
        this.a = 26;
        handler.getClass();
        this.b = pawVar;
        this.c = handler;
        vxs vxsVar = new vxs(this);
        this.d = vxsVar;
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        pawVar.I(vxsVar);
        this.g = new yjj();
    }

    public mmo(vqi vqiVar, hjp hjpVar) {
        this.a = 27;
        vqiVar.getClass();
        this.b = hjpVar;
        mm6 r = hld.r(vqiVar, dm6.b.plus(a4g.n()));
        this.c = r;
        oi3 oi3Var = oi3.b;
        this.d = y0q.b(0, 1, oi3Var, 1);
        this.e = y0q.b(0, 1, oi3Var, 1);
        pm6 pm6Var = pm6.a;
        Continuation continuation = null;
        this.f = bg3.i(r, null, 0, null, new vst(this, continuation, 0), 11);
        this.g = bg3.i(r, null, 0, null, new vst(this, continuation, 1), 15);
    }

    public mmo(o oVar, gu1 gu1Var, tot totVar, qdc qdcVar, OkHttpClient okHttpClient) {
        this.a = 4;
        this.b = oVar;
        this.c = gu1Var;
        t requireActivity = oVar.requireActivity();
        requireActivity.getClass();
        this.d = requireActivity;
        x0 x0Var = new x0(oVar);
        this.e = x0Var;
        this.f = new rdk(requireActivity, x0Var, qdcVar, totVar, okHttpClient);
        oVar.getClass();
        nnk nnkVar = new nnk();
        nnkVar.a = oVar;
        this.g = nnkVar;
    }

    public mmo(mmo mmoVar, byte b) {
        this.a = 22;
        this.b = mmoVar;
        this.c = (TextView) mmoVar.f;
        this.d = (TextView) mmoVar.c;
        this.e = (ImageView) mmoVar.e;
        this.f = (TextView) mmoVar.g;
        this.g = (TextView) mmoVar.d;
    }

    public mmo(mmo mmoVar, char c) {
        this.a = 23;
        this.b = mmoVar;
        this.c = (ProgressBar) mmoVar.g;
        this.d = (TextView) mmoVar.c;
        this.e = (TextView) mmoVar.f;
        this.f = (TextView) mmoVar.d;
        this.g = (TextView) mmoVar.e;
    }

    public mmo(kv6 kv6Var, vv1 vv1Var, a aVar) {
        this.a = 5;
        aVar.getClass();
        this.b = kv6Var;
        this.c = vv1Var;
        this.d = gld.e(aVar);
        x33 x33Var = new x33(this);
        this.g = x33Var;
        kv6Var.j0(x33Var);
    }

    public mmo(g1n g1nVar) {
        this.a = 9;
        mn7 mn7Var = dm6.b;
        g1nVar.getClass();
        mn7Var.getClass();
        this.b = g1nVar;
        this.c = mn7Var;
        bdt I = hag.I(av0.class);
        l18 l18Var = l18.b;
        this.d = l18Var.b(I, true);
        this.e = l18Var.b(hag.I(wst.class), true);
        this.f = l18Var.b(hag.I(byb.class), true);
        this.g = new rhp();
    }

    public mmo(mmo mmoVar) {
        this.a = 21;
        this.b = mmoVar;
        this.c = (RecyclerView) mmoVar.d;
        this.d = (TextInputLayout) mmoVar.g;
        this.e = (TextView) mmoVar.f;
        this.f = (TextView) mmoVar.e;
        this.g = (ImageView) mmoVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mmo(AlbumScreenActivity albumScreenActivity, PlaybackScope playbackScope, z5l z5lVar, kxi kxiVar, Function0 function0) {
        this.a = 1;
        albumScreenActivity.getClass();
        playbackScope.getClass();
        this.b = albumScreenActivity;
        this.c = playbackScope;
        this.d = z5lVar;
        this.e = kxiVar;
        this.f = (ezc) function0;
        this.g = l18.b.b(hag.I(e.class), true);
    }

    public mmo(sml smlVar, pt7 pt7Var, gs4 gs4Var, a aVar) {
        this.a = 28;
        aVar.getClass();
        this.b = smlVar;
        this.c = pt7Var;
        this.d = gs4Var;
        this.e = zzp.b;
        this.f = gld.e(aVar);
        this.g = new ConcurrentLinkedQueue();
    }

    public mmo(qnq qnqVar, y yVar, nrf nrfVar, kxi kxiVar) {
        this.a = 6;
        qnqVar.getClass();
        yVar.getClass();
        this.b = qnqVar;
        this.c = yVar;
        this.d = nrfVar;
        this.e = kxiVar;
        this.f = d.p(nrfVar);
        this.g = qnqVar.b;
    }

    public /* synthetic */ mmo(ViewGroup viewGroup, Object obj, View view, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
        this.d = view;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    public mmo(Context context, u3g u3gVar, z66 z66Var, fu5 fu5Var, ng1 ng1Var) {
        this.a = 24;
        z66Var.getClass();
        this.b = context;
        this.c = u3gVar;
        this.d = z66Var;
        this.e = fu5Var;
        this.f = ng1Var;
        this.g = l18.b.b(hag.I(cej.class), true);
    }

    public mmo(PaymentButtonView paymentButtonView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, ImageView imageView2) {
        this.a = 19;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = progressBar;
        this.g = imageView2;
    }

    public mmo(zzp zzpVar, b5d b5dVar, q4d q4dVar, uol uolVar, f5v f5vVar, sfn sfnVar) {
        this.a = 25;
        zzpVar.getClass();
        b5dVar.getClass();
        q4dVar.getClass();
        f5vVar.getClass();
        sfnVar.getClass();
        this.b = zzpVar;
        this.c = b5dVar;
        this.d = q4dVar;
        this.e = uolVar;
        this.f = f5vVar;
        this.g = sfnVar;
    }

    public mmo(Context context) {
        this.a = 11;
        this.b = context.getApplicationContext();
        this.c = i.a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = new dce();
    }

    public mmo(aec aecVar, ma maVar, uzm uzmVar, uzm uzmVar2, iec iecVar) {
        this.a = 10;
        aecVar.a();
        rho rhoVar = new rho(aecVar.a);
        this.b = aecVar;
        this.c = maVar;
        this.d = rhoVar;
        this.e = uzmVar;
        this.f = uzmVar2;
        this.g = iecVar;
    }

    public mmo(ois oisVar) {
        this.a = 7;
        this.b = oisVar;
        ude udeVar = yde.b;
        this.c = qsn.e;
        this.d = vsn.g;
    }

    public mmo(rdl rdlVar, blp blpVar, d8l d8lVar, yde ydeVar, Bundle bundle, qlp qlpVar) {
        this.a = 13;
        this.b = rdlVar;
        this.c = blpVar;
        this.d = d8lVar;
        this.e = ydeVar;
        this.f = bundle == null ? Bundle.EMPTY : bundle;
        this.g = qlpVar;
    }
}
