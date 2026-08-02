package defpackage;

/* loaded from: classes.dex */
public final class jmk extends f7 {
    public final hmk c;
    public int d;
    public z9t e;
    public int f;

    public jmk(hmk hmkVar, int i) {
        super(i, hmkVar.h);
        this.c = hmkVar;
        this.d = hmkVar.q();
        this.f = -1;
        b();
    }

    public final void a() {
        if (this.d == this.c.q()) {
            return;
        }
        xq0.i();
    }

    @Override // defpackage.f7, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.a;
        hmk hmkVar = this.c;
        hmkVar.add(i, obj);
        this.a++;
        this.b = hmkVar.f();
        this.d = hmkVar.q();
        this.f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        hmk hmkVar = this.c;
        Object[] objArr = hmkVar.f;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (hmkVar.h - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (hmkVar.d / 5) + 1;
        z9t z9tVar = this.e;
        if (z9tVar == null) {
            this.e = new z9t(objArr, i2, i, i3);
            return;
        }
        z9tVar.a = i2;
        z9tVar.b = i;
        z9tVar.c = i3;
        if (z9tVar.d.length < i3) {
            z9tVar.d = new Object[i3];
        }
        z9tVar.d[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        z9tVar.e = r6;
        z9tVar.b(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            wvs.n();
            return null;
        }
        int i = this.a;
        this.f = i;
        z9t z9tVar = this.e;
        hmk hmkVar = this.c;
        if (z9tVar == null) {
            Object[] objArr = hmkVar.g;
            this.a = i + 1;
            return objArr[i];
        }
        if (z9tVar.hasNext()) {
            this.a++;
            return z9tVar.next();
        }
        Object[] objArr2 = hmkVar.g;
        int i2 = this.a;
        this.a = i2 + 1;
        return objArr2[i2 - z9tVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            wvs.n();
            return null;
        }
        int i = this.a;
        this.f = i - 1;
        z9t z9tVar = this.e;
        hmk hmkVar = this.c;
        if (z9tVar == null) {
            Object[] objArr = hmkVar.g;
            int i2 = i - 1;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = z9tVar.b;
        if (i <= i3) {
            this.a = i - 1;
            return z9tVar.previous();
        }
        Object[] objArr2 = hmkVar.g;
        int i4 = i - 1;
        this.a = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.f7, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.f;
        if (i == -1) {
            e7o.n();
            return;
        }
        hmk hmkVar = this.c;
        hmkVar.a(i);
        int i2 = this.f;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = hmkVar.f();
        this.d = hmkVar.q();
        this.f = -1;
        b();
    }

    @Override // defpackage.f7, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.f;
        if (i == -1) {
            e7o.n();
            return;
        }
        hmk hmkVar = this.c;
        hmkVar.set(i, obj);
        this.d = hmkVar.q();
        b();
    }
}
