package q0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f5714i;

    /* renamed from: j, reason: collision with root package name */
    public final j f5715j;

    public g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        this.f5714i = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f5715j = new j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f5715j;
        if (jVar.hasNext()) {
            this.f5696g++;
            return jVar.next();
        }
        int i10 = this.f5696g;
        this.f5696g = i10 + 1;
        return this.f5714i[i10 - jVar.f5697h];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5696g;
        j jVar = this.f5715j;
        int i11 = jVar.f5697h;
        if (i10 <= i11) {
            this.f5696g = i10 - 1;
            return jVar.previous();
        }
        int i12 = i10 - 1;
        this.f5696g = i12;
        return this.f5714i[i12 - i11];
    }
}
