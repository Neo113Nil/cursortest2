package q0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5700i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final Object f5701j;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f5701j = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5700i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f5701j;
                int i10 = this.f5696g;
                this.f5696g = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f5696g++;
                return this.f5701j;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5700i) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f5701j;
                int i10 = this.f5696g - 1;
                this.f5696g = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f5696g--;
                return this.f5701j;
        }
    }

    public d(int i10, Object obj) {
        super(i10, 1);
        this.f5701j = obj;
    }
}
