package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class emo implements yko {
    public final ArrayList a;
    public float b;
    public float c;
    public fmo d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public emo(mmo mmoVar, ah3 ah3Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (ah3Var == null) {
            return;
        }
        ah3Var.q(this);
        if (this.h) {
            this.d.b((fmo) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        fmo fmoVar = this.d;
        if (fmoVar != null) {
            arrayList.add(fmoVar);
        }
    }

    @Override // defpackage.yko
    public final void a(float f, float f2, float f3, float f4) {
        this.d.a(f, f2);
        this.a.add(this.d);
        this.d = new fmo(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }

    @Override // defpackage.yko
    public final void close() {
        this.a.add(this.d);
        g(this.b, this.c);
        this.h = true;
    }

    @Override // defpackage.yko
    public final void d(float f, float f2) {
        boolean z = this.h;
        ArrayList arrayList = this.a;
        if (z) {
            this.d.b((fmo) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        fmo fmoVar = this.d;
        if (fmoVar != null) {
            arrayList.add(fmoVar);
        }
        this.b = f;
        this.c = f2;
        this.d = new fmo(f, f2, 0.0f, 0.0f);
        this.g = arrayList.size();
    }

    @Override // defpackage.yko
    public final void e(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new fmo(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // defpackage.yko
    public final void f(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        fmo fmoVar = this.d;
        mmo.b(fmoVar.a, fmoVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // defpackage.yko
    public final void g(float f, float f2) {
        this.d.a(f, f2);
        this.a.add(this.d);
        fmo fmoVar = this.d;
        this.d = new fmo(f, f2, f - fmoVar.a, f2 - fmoVar.b);
        this.h = false;
    }
}
