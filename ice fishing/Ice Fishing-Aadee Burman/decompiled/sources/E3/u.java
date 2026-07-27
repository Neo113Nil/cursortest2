package E3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f827a;

    /* renamed from: b, reason: collision with root package name */
    public float f828b;

    /* renamed from: c, reason: collision with root package name */
    public float f829c;

    /* renamed from: d, reason: collision with root package name */
    public float f830d;

    /* renamed from: e, reason: collision with root package name */
    public float f831e;

    /* renamed from: f, reason: collision with root package name */
    public Object f832f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Object f833g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public void a(float f3) {
        float f9 = this.f830d;
        if (f9 == f3) {
            return;
        }
        float f10 = ((f3 - f9) + 360.0f) % 360.0f;
        if (f10 > 180.0f) {
            return;
        }
        float f11 = this.f828b;
        float f12 = this.f829c;
        q qVar = new q(f11, f12, f11, f12);
        qVar.f820f = this.f830d;
        qVar.f821g = f10;
        ((ArrayList) this.f833g).add(new o(qVar));
        this.f830d = f3;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f832f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) arrayList.get(i)).a(matrix, path);
        }
    }

    public void c(float f3, float f9) {
        r rVar = new r();
        rVar.f822b = f3;
        rVar.f823c = f9;
        ((ArrayList) this.f832f).add(rVar);
        p pVar = new p(rVar, this.f828b, this.f829c);
        float b9 = pVar.b() + 270.0f;
        float b10 = pVar.b() + 270.0f;
        a(b9);
        ((ArrayList) this.f833g).add(pVar);
        this.f830d = b10;
        this.f828b = f3;
        this.f829c = f9;
    }

    public void d(float f3, float f9, float f10) {
        this.f827a = f3;
        this.f828b = 0.0f;
        this.f829c = f3;
        this.f830d = f9;
        this.f831e = (f9 + f10) % 360.0f;
        ((ArrayList) this.f832f).clear();
        ((ArrayList) this.f833g).clear();
    }
}
