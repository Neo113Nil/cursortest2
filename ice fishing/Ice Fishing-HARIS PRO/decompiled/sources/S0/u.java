package S0;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f1140a;

    /* renamed from: b, reason: collision with root package name */
    public float f1141b;

    /* renamed from: c, reason: collision with root package name */
    public float f1142c;

    /* renamed from: d, reason: collision with root package name */
    public float f1143d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1144f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1145g = new ArrayList();

    public u() {
        d(RecyclerView.f2111C0, 270.0f, RecyclerView.f2111C0);
    }

    public final void a(float f2) {
        float f3 = this.f1143d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f1141b;
        float f6 = this.f1142c;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f1133f = this.f1143d;
        qVar.f1134g = f4;
        this.f1145g.add(new o(qVar));
        this.f1143d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1144f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f1135b = f2;
        rVar.f1136c = f3;
        this.f1144f.add(rVar);
        p pVar = new p(rVar, this.f1141b, this.f1142c);
        float b2 = pVar.b() + 270.0f;
        float b3 = pVar.b() + 270.0f;
        a(b2);
        this.f1145g.add(pVar);
        this.f1143d = b3;
        this.f1141b = f2;
        this.f1142c = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f1140a = f2;
        this.f1141b = RecyclerView.f2111C0;
        this.f1142c = f2;
        this.f1143d = f3;
        this.e = (f3 + f4) % 360.0f;
        this.f1144f.clear();
        this.f1145g.clear();
    }
}
