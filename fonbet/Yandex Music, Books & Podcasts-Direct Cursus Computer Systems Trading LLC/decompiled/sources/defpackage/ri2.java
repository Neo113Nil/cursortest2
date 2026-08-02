package defpackage;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class ri2 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public ri2(BackEvent backEvent) {
        backEvent.getClass();
        float B = sb.B(backEvent);
        float C = sb.C(backEvent);
        float v = sb.v(backEvent);
        int A = sb.A(backEvent);
        this.a = B;
        this.b = C;
        this.c = v;
        this.d = A;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return vz1.r(sb, this.d, '}');
    }
}
