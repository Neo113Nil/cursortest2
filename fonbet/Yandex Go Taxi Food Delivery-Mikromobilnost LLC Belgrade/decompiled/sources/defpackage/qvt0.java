package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import com.adjust.sdk.Constants;
import com.ybsdk.core.design.spoiler.SpoilerEffect;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qvt0 {
    public static qvt0 l;
    public Bitmap b;
    public Bitmap c;
    public Bitmap d;
    public Canvas e;
    public Paint f;
    public long g;
    public ArrayList h;
    public boolean i;
    public final int j;
    public final ike a = bvf0.a(cvw.U(jl40.a(), uyj.a));
    public final float k = Resources.getSystem().getDisplayMetrics().density;

    public qvt0(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int min = (int) Math.min(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) * 0.5f, 100.0f);
        this.j = min;
        if (min < a(80)) {
            this.j = a(80);
        }
    }

    public final int a(int i) {
        return m810.b(i * this.k);
    }

    public final Paint b(Context context) {
        float[] fArr;
        if (this.b == null) {
            Bitmap.Config config = Bitmap.Config.ALPHA_8;
            int i = this.j;
            this.b = Bitmap.createBitmap(i, i, config);
            this.e = new Canvas(this.b);
            this.f = new Paint();
            this.h = new ArrayList(100);
            Paint paint = this.f;
            Bitmap bitmap = this.b;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            int i2 = (int) (i / 10.0f);
            int a = (int) ((i / a(Constants.MINIMAL_ERROR_STATUS_CODE)) * 60.0f);
            for (int i3 = 0; i3 < 10; i3++) {
                for (int i4 = 0; i4 < 10; i4++) {
                    SpoilerEffect spoilerEffect = new SpoilerEffect(context);
                    int i5 = i2 * i3;
                    int i6 = i2 * i4;
                    spoilerEffect.setBounds(i5, i6 - a(5), a(3) + i5 + i2, a(5) + i6 + i2);
                    spoilerEffect.setDrawPoints(true);
                    SpoilerEffect.Companion.getClass();
                    fArr = SpoilerEffect.ALPHAS;
                    int length = fArr.length;
                    float[][] fArr2 = new float[length][];
                    for (int i7 = 0; i7 < length; i7++) {
                        fArr2[i7] = new float[a * 2];
                    }
                    spoilerEffect.setParticlePoints(fArr2);
                    spoilerEffect.setMaxParticlesCount(a);
                    spoilerEffect.setColor(-1);
                    this.h.add(spoilerEffect);
                }
            }
            for (int i8 = 0; i8 < 10; i8++) {
                for (int i9 = 0; i9 < 10; i9++) {
                    ((SpoilerEffect) this.h.get((i8 * 10) + i9)).draw(this.e);
                }
            }
            Paint paint2 = this.f;
            Bitmap bitmap2 = this.b;
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            paint2.setShader(new BitmapShader(bitmap2, tileMode2, tileMode2));
            this.g = System.currentTimeMillis();
        }
        return this.f;
    }
}
