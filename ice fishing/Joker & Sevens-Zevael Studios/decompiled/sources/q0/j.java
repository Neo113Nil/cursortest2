package q0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: i, reason: collision with root package name */
    public int f5722i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f5723j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5724k;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f5722i = i12;
        Object[] objArr2 = new Object[i12];
        this.f5723j = objArr2;
        ?? r5 = i10 == i11 ? 1 : 0;
        this.f5724k = r5;
        objArr2[0] = objArr;
        b(i10 - r5, 1);
    }

    public final Object a() {
        int i10 = this.f5696g & 31;
        Object obj = this.f5723j[this.f5722i - 1];
        pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f5722i - i11) * 5;
        while (i11 < this.f5722i) {
            Object[] objArr = this.f5723j;
            Object obj = objArr[i11 - 1];
            pc.j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[v6.a.I(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (v6.a.I(this.f5696g, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(this.f5696g, ((this.f5722i - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a6 = a();
        int i10 = this.f5696g + 1;
        this.f5696g = i10;
        if (i10 == this.f5697h) {
            this.f5724k = true;
            return a6;
        }
        c(0);
        return a6;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f5696g--;
        if (this.f5724k) {
            this.f5724k = false;
            return a();
        }
        c(31);
        return a();
    }
}
