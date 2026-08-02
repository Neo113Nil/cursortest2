package defpackage;

import android.graphics.RectF;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wbf {
    public final int a;
    public final int b;
    public final RectF c;
    public final float d;
    public final float e;
    public final float f;
    public final boolean g;

    public wbf(int i, int i2, RectF rectF, float f, float f2, float f3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = rectF;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbf)) {
            return false;
        }
        wbf wbfVar = (wbf) obj;
        return this.a == wbfVar.a && this.b == wbfVar.b && this.c.equals(wbfVar.c) && Float.compare(this.d, wbfVar.d) == 0 && Float.compare(this.e, wbfVar.e) == 0 && Float.compare(this.f, wbfVar.f) == 0 && this.g == wbfVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + g8e.c(this.f, g8e.c(this.e, g8e.c(this.d, (this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "CropInfo(viewWidth=", ", viewHeight=", ", lensBounds=");
        s.append(this.c);
        s.append(", imageScale=");
        s.append(this.d);
        s.append(", imageOffsetX=");
        vfc.x(s, this.e, ", imageOffsetY=", this.f, ", useFitScale=");
        return x4e.i(s, this.g, Extension.C_BRAKE);
    }
}
