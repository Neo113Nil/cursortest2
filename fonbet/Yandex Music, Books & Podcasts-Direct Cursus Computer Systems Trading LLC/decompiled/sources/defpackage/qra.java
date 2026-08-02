package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class qra {
    public float a;
    public float b;
    public float c;
    public int d;
    public float[] e = null;

    public qra(qra qraVar) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
        this.a = qraVar.a;
        this.b = qraVar.b;
        this.c = qraVar.c;
        this.d = qraVar.d;
    }

    public final void a(int i, pif pifVar) {
        int alpha = Color.alpha(this.d);
        int c = y5i.c(i);
        Matrix matrix = rvt.a;
        int i2 = (int) ((((alpha / 255.0f) * c) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            pifVar.clearShadowLayer();
        } else {
            pifVar.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((y5i.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }
}
