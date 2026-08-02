package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Locale;
import ru.yandex.taxi.preorder.source.points.StopPointsProvider$StopPointPlace;

/* loaded from: classes6.dex */
public final class ugu0 implements sgu0 {
    public final a0j a;
    public final xg20 b;
    public final LinkedHashMap c;

    public ugu0(z6h z6hVar, zuj0 zuj0Var) {
        z6hVar.getClass();
        this.a = new a0j(zuj0Var);
        this.b = new xg20(zuj0Var);
        this.c = new LinkedHashMap();
    }

    public final Bitmap a(int i) {
        return b(i, "", false, StopPointsProvider$StopPointPlace.VIEW);
    }

    public final Bitmap b(int i, String str, boolean z, StopPointsProvider$StopPointPlace stopPointsProvider$StopPointPlace) {
        Bitmap bitmap;
        Bitmap bitmap2;
        tgu0 tgu0Var = new tgu0(i, str, z, stopPointsProvider$StopPointPlace);
        LinkedHashMap linkedHashMap = this.c;
        WeakReference weakReference = (WeakReference) linkedHashMap.get(tgu0Var);
        if (weakReference != null && (bitmap2 = (Bitmap) weakReference.get()) != null) {
            return bitmap2;
        }
        if (i == -1) {
            a0j a0jVar = this.a;
            int c = ((avj0) ((zuj0) a0jVar.c)).c(xrg0.destination_circle_size);
            int i2 = a0jVar.a;
            float f = i2;
            RectF rectF = new RectF(0.0f, 0.0f, f, f);
            float f2 = c;
            float f3 = (f - f2) / 2.0f;
            float f4 = f2 + f3;
            RectF rectF2 = new RectF(f3, f3, f4, f4);
            bitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            Paint paint = (Paint) a0jVar.d;
            int i3 = a0jVar.b;
            if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
                String upperCase = str.toUpperCase(Locale.US);
                if (upperCase.charAt(0) != '#') {
                    try {
                        i3 = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                try {
                    i3 = Color.parseColor(upperCase);
                } catch (IllegalArgumentException e) {
                    xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
                }
            }
            paint.setColor(i3);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawOval(rectF, paint);
            canvas.drawOval(rectF2, (Paint) a0jVar.e);
        } else {
            xg20 xg20Var = this.b;
            int i4 = xg20Var.d;
            Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
            float f5 = i4;
            RectF rectF3 = new RectF(0.0f, 0.0f, f5, f5);
            float f6 = rectF3.left;
            float f7 = xg20Var.e;
            RectF rectF4 = new RectF(f6 + f7, rectF3.top + f7, rectF3.right - f7, rectF3.bottom - f7);
            Canvas canvas2 = new Canvas(createBitmap);
            TextPaint textPaint = xg20Var.c;
            float descent = ((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent();
            canvas2.drawOval(rectF3, xg20Var.b);
            Paint paint2 = xg20Var.a;
            int i5 = xg20Var.f;
            if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
                String upperCase2 = str.toUpperCase(Locale.US);
                if (upperCase2.charAt(0) != '#') {
                    try {
                        i5 = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase2));
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                try {
                    i5 = Color.parseColor(upperCase2);
                } catch (IllegalArgumentException e2) {
                    xby.d.k(e2, "Parsing color error, color = ".concat(upperCase2));
                }
            }
            paint2.setColor(i5);
            canvas2.drawOval(rectF4, paint2);
            canvas2.drawText(String.valueOf(i), rectF3.centerX(), rectF3.centerY() + descent, textPaint);
            bitmap = createBitmap;
        }
        linkedHashMap.put(tgu0Var, new WeakReference(bitmap));
        return bitmap;
    }
}
