package c8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u7.C5095m;
import u7.C5097o;
import u7.C5099q;
import u7.t;
import v7.AbstractC5123d;

/* loaded from: classes2.dex */
public class g implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5646n;

    /* renamed from: u, reason: collision with root package name */
    public int f5647u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f5648v;

    public /* synthetic */ g(int i, Object obj) {
        this.f5646n = i;
        this.f5648v = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5646n) {
            case 0:
                if (this.f5647u > 0) {
                }
                break;
            case 1:
                if (this.f5647u < ((Object[]) this.f5648v).length) {
                }
                break;
            case 2:
                if (this.f5647u < ((byte[]) this.f5648v).length) {
                }
                break;
            case 3:
                if (this.f5647u < ((int[]) this.f5648v).length) {
                }
                break;
            case 4:
                if (this.f5647u < ((long[]) this.f5648v).length) {
                }
                break;
            case 5:
                if (this.f5647u < ((short[]) this.f5648v).length) {
                }
                break;
            default:
                if (this.f5647u < ((AbstractC5123d) this.f5648v).a()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5646n) {
            case 0:
                e eVar = (e) this.f5648v;
                int e9 = eVar.e();
                int i = this.f5647u;
                this.f5647u = i - 1;
                return eVar.i(e9 - i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f5648v;
                    int i6 = this.f5647u;
                    this.f5647u = i6 + 1;
                    return objArr[i6];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f5647u--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 2:
                int i9 = this.f5647u;
                byte[] bArr = (byte[]) this.f5648v;
                if (i9 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5647u));
                }
                this.f5647u = i9 + 1;
                return new C5095m(bArr[i9]);
            case 3:
                int i10 = this.f5647u;
                int[] iArr = (int[]) this.f5648v;
                if (i10 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5647u));
                }
                this.f5647u = i10 + 1;
                return new C5097o(iArr[i10]);
            case 4:
                int i11 = this.f5647u;
                long[] jArr = (long[]) this.f5648v;
                if (i11 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5647u));
                }
                this.f5647u = i11 + 1;
                return new C5099q(jArr[i11]);
            case 5:
                int i12 = this.f5647u;
                short[] sArr = (short[]) this.f5648v;
                if (i12 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f5647u));
                }
                this.f5647u = i12 + 1;
                return new t(sArr[i12]);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i13 = this.f5647u;
                this.f5647u = i13 + 1;
                return ((AbstractC5123d) this.f5648v).get(i13);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5646n) {
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
        this.f5646n = 1;
        kotlin.jvm.internal.h.e(array, "array");
        this.f5648v = array;
    }

    public g(e eVar) {
        this.f5646n = 0;
        this.f5648v = eVar;
        this.f5647u = eVar.e();
    }
}
