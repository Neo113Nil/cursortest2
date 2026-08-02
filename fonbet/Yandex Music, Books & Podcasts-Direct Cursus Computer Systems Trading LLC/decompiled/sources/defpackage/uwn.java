package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.KotlinVersion;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class uwn {
    public static final Object a = btf.a(bwf.c, new trn(19));
    public static final ThreadLocal b = new ThreadLocal();

    public static final RenderEffect a(RenderEffect renderEffect, RenderEffect renderEffect2, BlendMode blendMode, long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L && !enj.c(j, 0L)) {
            renderEffect2 = RenderEffect.createOffsetEffect(enj.e(j), enj.f(j), renderEffect2);
            renderEffect2.getClass();
        }
        RenderEffect createBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffect, renderEffect2, blendMode);
        createBlendModeEffect.getClass();
        return createBlendModeEffect;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v18, types: [arf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fi0 b(htd htdVar, twn twnVar) {
        RenderEffect createBlurEffect;
        Shader shader;
        Object obj;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        float f = twnVar.a;
        ynn ynnVar = twnVar.d;
        float f2 = 0;
        if (Float.compare(f, f2) < 0) {
            xq0.x("blurRadius needs to be equal or greater than 0.dp");
            return null;
        }
        if (Float.compare(f, f2) <= 0) {
            createBlurEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
        } else {
            try {
                float n0 = ((jx7) men.t(htdVar, es5.h)).n0(f);
                createBlurEffect = RenderEffect.createBlurEffect(n0, n0, Shader.TileMode.CLAMP);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(hrg.q("Error whilst calling RenderEffect.createBlurEffect. This is likely because this device does not support a blur radius of ", cma.b(f), "dp"), e);
            }
        }
        createBlurEffect.getClass();
        Context context = (Context) men.t(htdVar, AndroidCompositionLocals_androidKt.b);
        float f3 = twnVar.b;
        if (f3 >= 0.005f) {
            int d = yhn.d(eeh.b(f3 * KotlinVersion.MAX_COMPONENT_VALUE), 0, KotlinVersion.MAX_COMPONENT_VALUE);
            ?? r4 = a;
            pp3 pp3Var = (pp3) ((ajq) r4.getValue()).b.get(Integer.valueOf(d));
            if (pp3Var != null) {
                pp3Var.b = System.currentTimeMillis();
                obj = pp3Var.a;
            } else {
                obj = null;
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null || bitmap.isRecycled()) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.haze_noise);
                decodeResource.getClass();
                ThreadLocal threadLocal = b;
                Object obj2 = threadLocal.get();
                if (obj2 == null) {
                    obj2 = new Paint();
                    threadLocal.set(obj2);
                }
                Paint paint = (Paint) obj2;
                paint.reset();
                paint.setAlpha(d);
                bitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
                bitmap.getClass();
                new Canvas(bitmap).drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                ((ajq) r4.getValue()).a(Integer.valueOf(d), bitmap);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            RenderEffect createShaderEffect = RenderEffect.createShaderEffect(new BitmapShader(bitmap, tileMode, tileMode));
            createShaderEffect.getClass();
            createBlurEffect = RenderEffect.createBlendModeEffect(createShaderEffect, createBlurEffect, BlendMode.DST_ATOP);
            createBlurEffect.getClass();
        }
        for (std stdVar : twnVar.c) {
            boolean a2 = stdVar.a();
            int i = stdVar.b;
            if (a2) {
                ai3 ai3Var = stdVar.c;
                if (ai3Var != null) {
                    long e2 = ynnVar.e();
                    if (ai3Var instanceof ltp) {
                        shader = ((ltp) ai3Var).b(e2);
                        if (shader == null) {
                            RenderEffect createShaderEffect2 = RenderEffect.createShaderEffect(shader);
                            createShaderEffect2.getClass();
                            createBlurEffect = a(createBlurEffect, createShaderEffect2, mi.N(i), ynnVar.f());
                        } else {
                            long j = stdVar.a;
                            if (d85.d(j) >= 0.005f) {
                                createBlurEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(c3x.U(j), mi.N(i)), createBlurEffect);
                                createBlurEffect.getClass();
                            }
                        }
                    }
                }
                shader = null;
                if (shader == null) {
                }
            }
        }
        ai3 ai3Var2 = twnVar.e;
        BlendMode blendMode = BlendMode.DST_IN;
        if (ai3Var2 != null) {
            Shader b2 = ai3Var2 instanceof ltp ? ((ltp) ai3Var2).b(ynnVar.e()) : null;
            if (b2 != null) {
                RenderEffect createShaderEffect3 = RenderEffect.createShaderEffect(b2);
                createShaderEffect3.getClass();
                createBlurEffect = a(createBlurEffect, createShaderEffect3, blendMode, ynnVar.f());
            }
        }
        return new fi0(createBlurEffect);
    }
}
