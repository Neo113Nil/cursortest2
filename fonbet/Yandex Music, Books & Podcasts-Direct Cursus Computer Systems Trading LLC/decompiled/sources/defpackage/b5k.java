package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b5k {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public b5k(int i, int i2) {
        this.a = Color.red(i);
        this.b = Color.green(i);
        this.c = Color.blue(i);
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i = this.d;
        int g = aa5.g(-1, 4.5f, i);
        int g2 = aa5.g(-1, 3.0f, i);
        if (g != -1 && g2 != -1) {
            this.h = aa5.l(-1, g);
            this.g = aa5.l(-1, g2);
            this.f = true;
            return;
        }
        int g3 = aa5.g(-16777216, 4.5f, i);
        int g4 = aa5.g(-16777216, 3.0f, i);
        if (g3 == -1 || g4 == -1) {
            this.h = g != -1 ? aa5.l(-1, g) : aa5.l(-16777216, g3);
            this.g = g2 != -1 ? aa5.l(-1, g2) : aa5.l(-16777216, g4);
            this.f = true;
        } else {
            this.h = aa5.l(-16777216, g3);
            this.g = aa5.l(-16777216, g4);
            this.f = true;
        }
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        aa5.b(this.a, this.b, this.c, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b5k.class == obj.getClass()) {
            b5k b5kVar = (b5k) obj;
            if (this.e == b5kVar.e && this.d == b5kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(b5k.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
