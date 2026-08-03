package q0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: i, reason: collision with root package name */
    public final f f5716i;

    /* renamed from: j, reason: collision with root package name */
    public int f5717j;

    /* renamed from: k, reason: collision with root package name */
    public j f5718k;

    /* renamed from: l, reason: collision with root package name */
    public int f5719l;

    public h(f fVar, int i10) {
        super(i10, fVar.f5713n);
        this.f5716i = fVar;
        this.f5717j = fVar.f();
        this.f5719l = -1;
        b();
    }

    public final void a() {
        if (this.f5717j != this.f5716i.f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // q0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f5696g;
        f fVar = this.f5716i;
        fVar.add(i10, obj);
        this.f5696g++;
        this.f5697h = fVar.a();
        this.f5717j = fVar.f();
        this.f5719l = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f5716i;
        Object[] objArr = fVar.f5711l;
        if (objArr == null) {
            this.f5718k = null;
            return;
        }
        int i10 = (fVar.f5713n - 1) & (-32);
        int i11 = this.f5696g;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f5709j / 5) + 1;
        j jVar = this.f5718k;
        if (jVar == null) {
            this.f5718k = new j(objArr, i11, i10, i12);
            return;
        }
        jVar.f5696g = i11;
        jVar.f5697h = i10;
        jVar.f5722i = i12;
        if (jVar.f5723j.length < i12) {
            jVar.f5723j = new Object[i12];
        }
        jVar.f5723j[0] = objArr;
        ?? r62 = i11 == i10 ? 1 : 0;
        jVar.f5724k = r62;
        jVar.b(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5696g;
        this.f5719l = i10;
        j jVar = this.f5718k;
        f fVar = this.f5716i;
        if (jVar == null) {
            Object[] objArr = fVar.f5712m;
            this.f5696g = i10 + 1;
            return objArr[i10];
        }
        if (jVar.hasNext()) {
            this.f5696g++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f5712m;
        int i11 = this.f5696g;
        this.f5696g = i11 + 1;
        return objArr2[i11 - jVar.f5697h];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5696g;
        this.f5719l = i10 - 1;
        j jVar = this.f5718k;
        f fVar = this.f5716i;
        if (jVar == null) {
            Object[] objArr = fVar.f5712m;
            int i11 = i10 - 1;
            this.f5696g = i11;
            return objArr[i11];
        }
        int i12 = jVar.f5697h;
        if (i10 <= i12) {
            this.f5696g = i10 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f5712m;
        int i13 = i10 - 1;
        this.f5696g = i13;
        return objArr2[i13 - i12];
    }

    @Override // q0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f5719l;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f5716i;
        fVar.b(i10);
        int i11 = this.f5719l;
        if (i11 < this.f5696g) {
            this.f5696g = i11;
        }
        this.f5697h = fVar.a();
        this.f5717j = fVar.f();
        this.f5719l = -1;
        b();
    }

    @Override // q0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f5719l;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f5716i;
        fVar.set(i10, obj);
        this.f5717j = fVar.f();
        b();
    }
}
