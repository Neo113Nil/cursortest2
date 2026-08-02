package G3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f1169a;

    /* renamed from: b, reason: collision with root package name */
    public float f1170b;

    /* renamed from: c, reason: collision with root package name */
    public float f1171c;

    /* renamed from: d, reason: collision with root package name */
    public float f1172d;

    /* renamed from: e, reason: collision with root package name */
    public float f1173e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1174f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Object f1175g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public void a(float f2) {
        float f9 = this.f1172d;
        if (f9 == f2) {
            return;
        }
        float f10 = ((f2 - f9) + 360.0f) % 360.0f;
        if (f10 > 180.0f) {
            return;
        }
        float f11 = this.f1170b;
        float f12 = this.f1171c;
        q qVar = new q(f11, f12, f11, f12);
        qVar.f1162f = this.f1172d;
        qVar.f1163g = f10;
        ((ArrayList) this.f1175g).add(new o(qVar));
        this.f1172d = f2;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f1174f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public void c(float f2, float f9) {
        r rVar = new r();
        rVar.f1164b = f2;
        rVar.f1165c = f9;
        ((ArrayList) this.f1174f).add(rVar);
        p pVar = new p(rVar, this.f1170b, this.f1171c);
        float b9 = pVar.b() + 270.0f;
        float b10 = pVar.b() + 270.0f;
        a(b9);
        ((ArrayList) this.f1175g).add(pVar);
        this.f1172d = b10;
        this.f1170b = f2;
        this.f1171c = f9;
    }

    public void d(float f2, float f9, float f10) {
        this.f1169a = f2;
        this.f1170b = 0.0f;
        this.f1171c = f2;
        this.f1172d = f9;
        this.f1173e = (f9 + f10) % 360.0f;
        ((ArrayList) this.f1174f).clear();
        ((ArrayList) this.f1175g).clear();
    }
}
