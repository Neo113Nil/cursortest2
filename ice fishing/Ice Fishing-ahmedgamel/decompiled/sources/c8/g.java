package c8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u7.C5087m;
import u7.C5089o;
import u7.C5091q;
import u7.t;
import v7.AbstractC5113d;

/* loaded from: classes2.dex */
public class g implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5822n;

    /* renamed from: u, reason: collision with root package name */
    public int f5823u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f5824v;

    public /* synthetic */ g(int i, Object obj) {
        this.f5822n = i;
        this.f5824v = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5822n) {
            case 0:
                if (this.f5823u > 0) {
                }
                break;
            case 1:
                if (this.f5823u < ((Object[]) this.f5824v).length) {
                }
                break;
            case 2:
                if (this.f5823u < ((byte[]) this.f5824v).length) {
                }
                break;
            case 3:
                if (this.f5823u < ((int[]) this.f5824v).length) {
                }
                break;
            case 4:
                if (this.f5823u < ((long[]) this.f5824v).length) {
                }
                break;
            case 5:
                if (this.f5823u < ((short[]) this.f5824v).length) {
                }
                break;
            default:
                if (this.f5823u < ((AbstractC5113d) this.f5824v).a()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5822n) {
            case 0:
                e eVar = (e) this.f5824v;
                int e9 = eVar.e();
                int i = this.f5823u;
                this.f5823u = i - 1;
                return eVar.i(e9 - i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f5824v;
                    int i4 = this.f5823u;
                    this.f5823u = i4 + 1;
                    return objArr[i4];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f5823u--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 2:
                int i6 = this.f5823u;
                byte[] bArr = (byte[]) this.f5824v;
                if (i6 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5823u));
                }
                this.f5823u = i6 + 1;
                return new C5087m(bArr[i6]);
            case 3:
                int i9 = this.f5823u;
                int[] iArr = (int[]) this.f5824v;
                if (i9 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5823u));
                }
                this.f5823u = i9 + 1;
                return new C5089o(iArr[i9]);
            case 4:
                int i10 = this.f5823u;
                long[] jArr = (long[]) this.f5824v;
                if (i10 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5823u));
                }
                this.f5823u = i10 + 1;
                return new C5091q(jArr[i10]);
            case 5:
                int i11 = this.f5823u;
                short[] sArr = (short[]) this.f5824v;
                if (i11 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5823u));
                }
                this.f5823u = i11 + 1;
                return new t(sArr[i11]);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.f5823u;
                this.f5823u = i12 + 1;
                return ((AbstractC5113d) this.f5824v).get(i12);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5822n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(Object[] array) {
        this.f5822n = 1;
        kotlin.jvm.internal.h.e(array, "array");
        this.f5824v = array;
    }

    public g(e eVar) {
        this.f5822n = 0;
        this.f5824v = eVar;
        this.f5823u = eVar.e();
    }
}
