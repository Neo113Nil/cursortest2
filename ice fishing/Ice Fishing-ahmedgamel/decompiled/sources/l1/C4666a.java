package l1;

import a1.C0428a;
import android.graphics.Color;
import android.graphics.Matrix;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4666a {

    /* renamed from: a, reason: collision with root package name */
    public float f38808a;

    /* renamed from: b, reason: collision with root package name */
    public float f38809b;

    /* renamed from: c, reason: collision with root package name */
    public float f38810c;

    /* renamed from: d, reason: collision with root package name */
    public int f38811d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f38812e = null;

    public C4666a(C4666a c4666a) {
        this.f38808a = 0.0f;
        this.f38809b = 0.0f;
        this.f38810c = 0.0f;
        this.f38811d = 0;
        this.f38808a = c4666a.f38808a;
        this.f38809b = c4666a.f38809b;
        this.f38810c = c4666a.f38810c;
        this.f38811d = c4666a.f38811d;
    }

    public final void a(int i, C0428a c0428a) {
        int alpha = Color.alpha(this.f38811d);
        int c9 = AbstractC4672g.c(i);
        Matrix matrix = i.f38862a;
        int i4 = (int) ((((alpha / 255.0f) * c9) / 255.0f) * 255.0f);
        if (i4 <= 0) {
            c0428a.clearShadowLayer();
        } else {
            c0428a.setShadowLayer(Math.max(this.f38808a, Float.MIN_VALUE), this.f38809b, this.f38810c, Color.argb(i4, Color.red(this.f38811d), Color.green(this.f38811d), Color.blue(this.f38811d)));
        }
    }

    public final void b(int i) {
        this.f38811d = Color.argb(Math.round((AbstractC4672g.c(i) * Color.alpha(this.f38811d)) / 255.0f), Color.red(this.f38811d), Color.green(this.f38811d), Color.blue(this.f38811d));
    }

    public final void c(Matrix matrix) {
        if (this.f38812e == null) {
            this.f38812e = new float[2];
        }
        float[] fArr = this.f38812e;
        fArr[0] = this.f38809b;
        fArr[1] = this.f38810c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f38812e;
        this.f38809b = fArr2[0];
        this.f38810c = fArr2[1];
        this.f38808a = matrix.mapRadius(this.f38808a);
    }
}
