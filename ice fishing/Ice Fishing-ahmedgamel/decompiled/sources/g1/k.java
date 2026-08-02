package g1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f37630a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f37631b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37632c;

    public k(PointF pointF, boolean z6, List list) {
        this.f37631b = pointF;
        this.f37632c = z6;
        this.f37630a = new ArrayList(list);
    }

    public final void a(float f2, float f9) {
        if (this.f37631b == null) {
            this.f37631b = new PointF();
        }
        this.f37631b.set(f2, f9);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f37630a.size() + "closed=" + this.f37632c + '}';
    }

    public k() {
        this.f37630a = new ArrayList();
    }
}
