package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

/* loaded from: classes3.dex */
public final class ubh extends xhm {
    public final zdg a;
    public final d89 b;
    public final ArrayList c = new ArrayList();
    public final Paint d;
    public float e;
    public float f;
    public boolean g;
    public long h;

    public ubh(zdg zdgVar, d89 d89Var) {
        this.a = zdgVar;
        this.b = d89Var;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.d = paint;
        this.e = -1.0f;
        this.f = -1.0f;
    }

    @Override // defpackage.xhm
    public final int a(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i, i2);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        d89 d89Var;
        float f2;
        ArrayList arrayList;
        Resources resources;
        DisplayMetrics displayMetrics;
        q8k particlesTicker$div_release;
        q8k particlesTicker$div_release2;
        float measureText = paint.measureText(charSequence, i, i2);
        float f3 = i5 - i3;
        zdg zdgVar = this.a;
        boolean z = zdgVar instanceof sbh;
        Paint paint2 = this.d;
        if (z) {
            paint2.setColor(((sbh) zdgVar).b);
            canvas.drawRect(f, i3, f + measureText, i5, paint2);
            this.g = false;
            return;
        }
        if (zdgVar instanceof rbh) {
            float f4 = this.e;
            d89 d89Var2 = this.b;
            ArrayList arrayList2 = this.c;
            if (measureText == f4 && f3 == this.f && !arrayList2.isEmpty()) {
                f2 = measureText;
                d89Var = d89Var2;
                arrayList = arrayList2;
            } else {
                rbh rbhVar = (rbh) zdgVar;
                float f5 = rbhVar.c;
                this.e = measureText;
                this.f = f3;
                arrayList2.clear();
                d89Var = d89Var2;
                this.h = ((i2 * 19349663) ^ (i * 73856093)) ^ eeh.b(1000.0f * f5);
                Random random = new Random(this.h);
                float max = Math.max(1.0f, rbhVar.f);
                f2 = measureText;
                double d = 3;
                arrayList = arrayList2;
                float f6 = 3.1415927f;
                float pow = ((float) Math.pow(max, 2)) * 3.1415927f * ((((float) Math.pow(1.5f, d)) - ((float) Math.pow(0.7f, d))) / 2.4f);
                float f7 = pow > 0.0f ? (f2 * f3) / pow : 0.0f;
                if (f5 >= 1.0f) {
                    f5 = 0.99f;
                } else if (f5 <= 0.0f) {
                    f5 = 0.0f;
                }
                int d2 = yhn.d(eeh.b(f7 * f5), 1, 800);
                float f8 = (d89Var == null || (resources = d89Var.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 1.0f : displayMetrics.density;
                float f9 = 2.0f * f8;
                float f10 = (f8 * 9.0f) - f9;
                int i6 = 0;
                while (i6 < d2) {
                    float nextFloat = ((random.nextFloat() * 0.8f) + 0.7f) * max;
                    float f11 = f6;
                    float f12 = f3;
                    float nextFloat2 = (random.nextFloat() * f10) + f9;
                    Random random2 = random;
                    float f13 = max;
                    double nextFloat3 = ((float) (random.nextFloat() * 6.283185307179586d)) - f11;
                    float cos = ((float) Math.cos(nextFloat3)) * nextFloat2;
                    int i7 = d2;
                    float sin = ((float) Math.sin(nextFloat3)) * nextFloat2;
                    float nextFloat4 = (random2.nextFloat() - 0.5f) * 0.5f;
                    float nextFloat5 = (random2.nextFloat() * 6000.0f) + 6000.0f;
                    float nextFloat6 = random2.nextFloat() * nextFloat5 * 0.5f;
                    zdg zdgVar2 = zdgVar;
                    float f14 = f10;
                    float nextFloat7 = random2.nextFloat() * f2;
                    float f15 = f9;
                    float nextFloat8 = random2.nextFloat() * f12;
                    tbh tbhVar = new tbh();
                    tbhVar.a = nextFloat7;
                    tbhVar.b = nextFloat8;
                    tbhVar.c = nextFloat;
                    tbhVar.d = cos;
                    tbhVar.e = sin;
                    tbhVar.f = nextFloat4;
                    tbhVar.g = nextFloat5;
                    tbhVar.h = nextFloat6;
                    arrayList.add(tbhVar);
                    i6++;
                    f6 = f11;
                    random = random2;
                    max = f13;
                    f3 = f12;
                    zdgVar = zdgVar2;
                    d2 = i7;
                    f10 = f14;
                    f9 = f15;
                }
            }
            float f16 = f3;
            rbh rbhVar2 = (rbh) zdgVar;
            paint2.setColor(rbhVar2.b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tbh tbhVar2 = (tbh) it.next();
                float f17 = tbhVar2.a;
                float f18 = tbhVar2.c;
                float c = yhn.c(f17, f18, f2 - f18);
                float f19 = tbhVar2.b;
                float f20 = tbhVar2.c;
                canvas.drawCircle(f + c, i3 + yhn.c(f19, f20, f16 - f20), tbhVar2.c, paint2);
            }
            if (rbhVar2.d) {
                this.g = true;
                if (d89Var == null || (particlesTicker$div_release = d89Var.getParticlesTicker$div_release()) == null) {
                    return;
                }
                particlesTicker$div_release.c.add(this);
                particlesTicker$div_release.a();
                return;
            }
            this.g = false;
            if (d89Var == null || (particlesTicker$div_release2 = d89Var.getParticlesTicker$div_release()) == null) {
                return;
            }
            LinkedHashSet linkedHashSet = particlesTicker$div_release2.c;
            linkedHashSet.remove(this);
            if (linkedHashSet.isEmpty()) {
                particlesTicker$div_release2.b();
            }
        }
    }
}
