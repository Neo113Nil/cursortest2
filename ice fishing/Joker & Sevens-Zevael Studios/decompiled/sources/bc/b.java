package bc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class b implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1047g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f1048h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1049i;

    public b(Object[] objArr) {
        pc.j.e(objArr, "array");
        this.f1049i = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1047g) {
            case 0:
                if (this.f1048h < ((e) this.f1049i).a()) {
                }
                break;
            default:
                if (this.f1048h < ((Object[]) this.f1049i).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1047g) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                e eVar = (e) this.f1049i;
                int i10 = this.f1048h;
                this.f1048h = i10 + 1;
                return eVar.get(i10);
            default:
                try {
                    Object[] objArr = (Object[]) this.f1049i;
                    int i11 = this.f1048h;
                    this.f1048h = i11 + 1;
                    return objArr[i11];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f1048h--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1047g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(e eVar) {
        this.f1049i = eVar;
    }
}
