package e1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f37154a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f37155b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37156c;

    public k(PointF pointF, boolean z3, List list) {
        this.f37155b = pointF;
        this.f37156c = z3;
        this.f37154a = new ArrayList(list);
    }

    public final void a(float f3, float f9) {
        if (this.f37155b == null) {
            this.f37155b = new PointF();
        }
        this.f37155b.set(f3, f9);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f37154a.size() + "closed=" + this.f37156c + '}';
    }

    public k() {
        this.f37154a = new ArrayList();
    }
}
