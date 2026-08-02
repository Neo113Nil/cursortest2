package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* loaded from: classes.dex */
public final class kmo {
    public final flo a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public spi f;
    public spi g;
    public boolean h;

    public kmo(kmo kmoVar) {
        this.b = kmoVar.b;
        this.c = kmoVar.c;
        this.d = new Paint(kmoVar.d);
        this.e = new Paint(kmoVar.e);
        spi spiVar = kmoVar.f;
        if (spiVar != null) {
            this.f = new spi(spiVar);
        }
        spi spiVar2 = kmoVar.g;
        if (spiVar2 != null) {
            this.g = new spi(spiVar2);
        }
        this.h = kmoVar.h;
        try {
            this.a = (flo) kmoVar.a.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.a = flo.b();
        }
    }

    public kmo() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = flo.b();
    }
}
