package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class xup {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public xup() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        tup tupVar = new tup(f, f2, f3, f4);
        tupVar.f = f5;
        tupVar.g = f6;
        this.f.add(tupVar);
        rup rupVar = new rup(tupVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        b(f5);
        this.g.add(rupVar);
        this.d = f8;
        double d = f7;
        this.b = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.c = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    public final void b(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        tup tupVar = new tup(f4, f5, f4, f5);
        tupVar.f = this.d;
        tupVar.g = f3;
        this.g.add(new rup(tupVar));
        this.d = f;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((vup) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        uup uupVar = new uup();
        uupVar.b = f;
        uupVar.c = f2;
        this.f.add(uupVar);
        sup supVar = new sup(uupVar, this.b, this.c);
        float b = supVar.b() + 270.0f;
        float b2 = supVar.b() + 270.0f;
        b(b);
        this.g.add(supVar);
        this.d = b2;
        this.b = f;
        this.c = f2;
    }

    public final void e(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
