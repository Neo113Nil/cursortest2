package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class y4n {
    public static final u4n m = new u4n(1);
    public static final u4n n = new u4n(2);
    public static final u4n o = new u4n(3);
    public static final u4n p = new u4n(4);
    public static final u4n q = new u4n(5);
    public static final u4n r = new u4n(6);
    public static final u4n s = new u4n(7);
    public static final u4n t = new u4n(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final mor e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;

    public y4n(Object obj, mor morVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = morVar;
        if (morVar == q || morVar == r || morVar == s) {
            this.j = 0.1f;
            return;
        }
        if (morVar == t) {
            this.j = 0.00390625f;
        } else if (morVar == o || morVar == p) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
    }

    public final void a(w4n w4nVar) {
        ArrayList arrayList = this.k;
        if (arrayList.contains(w4nVar)) {
            return;
        }
        arrayList.add(w4nVar);
    }

    public final void b(x4n x4nVar) {
        if (this.f) {
            w511.x("Error: Update listeners must be added beforethe animation.");
            return;
        }
        ArrayList arrayList = this.l;
        if (arrayList.contains(x4nVar)) {
            return;
        }
        arrayList.add(x4nVar);
    }

    public abstract void c();

    public final void d(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f = false;
        yh2.b().d(this);
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((w4n) arrayList.get(i)).a(this, z, this.b, this.a);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f) {
        if (f > 0.0f) {
            this.j = f;
        } else {
            ny61.g("Minimum visible change must be positive.");
        }
    }

    public final void f(float f) {
        ArrayList arrayList;
        this.e.b(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((x4n) arrayList.get(i)).d(this.b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void g(float f) {
        this.b = f;
        this.c = true;
    }

    public abstract void h();

    public y4n(sor sorVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new v4n(sorVar);
        this.j = 1.0f;
    }
}
