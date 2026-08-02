package defpackage;

import android.graphics.PointF;

/* loaded from: classes11.dex */
public final class s7p {
    public final int a;
    public final PointF b;

    public s7p(int i, PointF pointF) {
        this.a = i;
        this.b = pointF;
    }

    public final String toString() {
        p891 p891Var = new p891("FaceLandmark", 11);
        p891Var.f(this.a, "type");
        p891Var.j(this.b, "position");
        return p891Var.toString();
    }
}
