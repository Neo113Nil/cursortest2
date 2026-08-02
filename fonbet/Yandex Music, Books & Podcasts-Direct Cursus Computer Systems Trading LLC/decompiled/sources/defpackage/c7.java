package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public class c7 implements Iterator, j9f {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public c7(pdb pdbVar) {
        this.a = 2;
        this.c = pdbVar;
        this.b = pdbVar.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((a) this.c).f()) {
                }
                break;
            case 1:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            case 2:
                if (this.b > 0) {
                }
                break;
            case 3:
                if (((q4r) this.c).c > this.b) {
                }
                break;
            case 4:
                if (this.b < ((byte[]) this.c).length) {
                }
                break;
            case 5:
                if (this.b < ((int[]) this.c).length) {
                }
                break;
            case 6:
                if (this.b < ((long[]) this.c).length) {
                }
                break;
            case 7:
                if (this.b < ((short[]) this.c).length) {
                }
                break;
            default:
                if (this.b < ((ViewGroup) this.c).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    wvs.n();
                    break;
                } else {
                    a aVar = (a) this.c;
                    int i = this.b;
                    this.b = i + 1;
                    break;
                }
            case 1:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i2 = this.b;
                    this.b = i2 + 1;
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    wvs.h(e.getMessage());
                    return null;
                }
            case 2:
                pdb pdbVar = (pdb) this.c;
                int i3 = pdbVar.c;
                int i4 = this.b;
                this.b = i4 - 1;
                break;
            case 3:
                q4r q4rVar = (q4r) this.c;
                int i5 = this.b;
                this.b = i5 + 1;
                break;
            case 4:
                int i6 = this.b;
                byte[] bArr = (byte[]) this.c;
                if (i6 >= bArr.length) {
                    wvs.h(String.valueOf(i6));
                    break;
                } else {
                    this.b = i6 + 1;
                    break;
                }
            case 5:
                int i7 = this.b;
                int[] iArr = (int[]) this.c;
                if (i7 >= iArr.length) {
                    wvs.h(String.valueOf(i7));
                    break;
                } else {
                    this.b = i7 + 1;
                    break;
                }
            case 6:
                int i8 = this.b;
                long[] jArr = (long[]) this.c;
                if (i8 >= jArr.length) {
                    wvs.h(String.valueOf(i8));
                    break;
                } else {
                    this.b = i8 + 1;
                    break;
                }
            case 7:
                int i9 = this.b;
                short[] sArr = (short[]) this.c;
                if (i9 >= sArr.length) {
                    wvs.h(String.valueOf(i9));
                    break;
                } else {
                    this.b = i9 + 1;
                    break;
                }
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i10 = this.b;
                this.b = i10 + 1;
                View childAt = viewGroup.getChildAt(i10);
                if (childAt == null) {
                    rj7.m();
                    break;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
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
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.b - 1;
                this.b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public c7(Object[] objArr) {
        this.a = 1;
        objArr.getClass();
        this.c = objArr;
    }

    public /* synthetic */ c7(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }
}
