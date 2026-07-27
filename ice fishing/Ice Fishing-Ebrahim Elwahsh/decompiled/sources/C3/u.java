package C3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f474a;

    /* renamed from: b, reason: collision with root package name */
    public float f475b;

    /* renamed from: c, reason: collision with root package name */
    public float f476c;

    /* renamed from: d, reason: collision with root package name */
    public float f477d;

    /* renamed from: e, reason: collision with root package name */
    public float f478e;

    /* renamed from: f, reason: collision with root package name */
    public Object f479f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Object f480g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public void a(float f6) {
        float f9 = this.f477d;
        if (f9 == f6) {
            return;
        }
        float f10 = ((f6 - f9) + 360.0f) % 360.0f;
        if (f10 > 180.0f) {
            return;
        }
        float f11 = this.f475b;
        float f12 = this.f476c;
        q qVar = new q(f11, f12, f11, f12);
        qVar.f467f = this.f477d;
        qVar.f468g = f10;
        ((ArrayList) this.f480g).add(new o(qVar));
        this.f477d = f6;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f479f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public void c(float f6, float f9) {
        r rVar = new r();
        rVar.f469b = f6;
        rVar.f470c = f9;
        ((ArrayList) this.f479f).add(rVar);
        p pVar = new p(rVar, this.f475b, this.f476c);
        float b9 = pVar.b() + 270.0f;
        float b10 = pVar.b() + 270.0f;
        a(b9);
        ((ArrayList) this.f480g).add(pVar);
        this.f477d = b10;
        this.f475b = f6;
        this.f476c = f9;
    }

    public void d(float f6, float f9, float f10) {
        this.f474a = f6;
        this.f475b = 0.0f;
        this.f476c = f6;
        this.f477d = f9;
        this.f478e = (f9 + f10) % 360.0f;
        ((ArrayList) this.f479f).clear();
        ((ArrayList) this.f480g).clear();
    }
}
