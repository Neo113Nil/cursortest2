package j1;

import android.graphics.Color;
import android.graphics.Matrix;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4597a {

    /* renamed from: a, reason: collision with root package name */
    public float f38296a;

    /* renamed from: b, reason: collision with root package name */
    public float f38297b;

    /* renamed from: c, reason: collision with root package name */
    public float f38298c;

    /* renamed from: d, reason: collision with root package name */
    public int f38299d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f38300e = null;

    public C4597a(C4597a c4597a) {
        this.f38296a = 0.0f;
        this.f38297b = 0.0f;
        this.f38298c = 0.0f;
        this.f38299d = 0;
        this.f38296a = c4597a.f38296a;
        this.f38297b = c4597a.f38297b;
        this.f38298c = c4597a.f38298c;
        this.f38299d = c4597a.f38299d;
    }

    public final void a(int i, Y0.a aVar) {
        int alpha = Color.alpha(this.f38299d);
        int c9 = AbstractC4603g.c(i);
        Matrix matrix = j.f38350a;
        int i6 = (int) ((((alpha / 255.0f) * c9) / 255.0f) * 255.0f);
        if (i6 <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(this.f38296a, Float.MIN_VALUE), this.f38297b, this.f38298c, Color.argb(i6, Color.red(this.f38299d), Color.green(this.f38299d), Color.blue(this.f38299d)));
        }
    }

    public final void b(int i) {
        this.f38299d = Color.argb(Math.round((AbstractC4603g.c(i) * Color.alpha(this.f38299d)) / 255.0f), Color.red(this.f38299d), Color.green(this.f38299d), Color.blue(this.f38299d));
    }

    public final void c(Matrix matrix) {
        if (this.f38300e == null) {
            this.f38300e = new float[2];
        }
        float[] fArr = this.f38300e;
        fArr[0] = this.f38297b;
        fArr[1] = this.f38298c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f38300e;
        this.f38297b = fArr2[0];
        this.f38298c = fArr2[1];
        this.f38296a = matrix.mapRadius(this.f38296a);
    }
}
