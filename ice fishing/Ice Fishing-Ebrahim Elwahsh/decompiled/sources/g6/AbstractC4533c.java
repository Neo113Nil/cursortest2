package g6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4533c {

    /* renamed from: n, reason: collision with root package name */
    public final Object[] f37928n;

    /* renamed from: u, reason: collision with root package name */
    public int f37929u;

    public AbstractC4533c(Object[] objArr) {
        this.f37928n = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if ((r3 == null ? r4 == null ? 0 : -1 : r4 == null ? 1 : r9.compare(r3, r4)) <= 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Object[] objArr, int i, int i4, Object[] objArr2, Comparator comparator) {
        if (i4 - i <= 2) {
            return;
        }
        int i9 = ((i4 + i) / 4) * 2;
        c(objArr2, i, i9, objArr, comparator);
        c(objArr2, i9, i4, objArr, comparator);
        int i10 = i;
        int i11 = i9;
        while (i < i4) {
            if (i10 < i9 - 1) {
                if (i11 < i4 - 1) {
                    Object obj = objArr[i10];
                    Object obj2 = objArr[i11];
                }
                objArr2[i] = objArr[i10];
                objArr2[i + 1] = objArr[i10 + 1];
                i10 += 2;
                i += 2;
            }
            objArr2[i] = objArr[i11];
            objArr2[i + 1] = objArr[i11 + 1];
            i11 += 2;
            i += 2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC4533c) {
            return Arrays.equals(this.f37928n, ((AbstractC4533c) obj).f37928n);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.f37928n;
            if (i >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i], objArr[i + 1]);
            i += 2;
        }
    }

    public final int hashCode() {
        int i = this.f37929u;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f37928n) ^ 1000003;
        this.f37929u = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f37928n.length == 0;
    }

    public final int size() {
        return this.f37928n.length / 2;
    }

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.f37928n;
            if (i >= objArr.length) {
                break;
            }
            Object obj2 = objArr[i + 1];
            if (obj2 instanceof String) {
                obj = "\"" + ((String) obj2) + '\"';
            } else {
                obj = obj2.toString();
            }
            sb.append(objArr[i]);
            sb.append("=");
            sb.append(obj);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4533c(Object[] objArr, Comparator comparator) {
        this(objArr);
        d.a("You must provide an even number of key/value pair arguments.", objArr.length % 2 == 0);
        if (objArr.length != 0) {
            Object[] objArr2 = new Object[objArr.length];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            c(objArr2, 0, objArr.length, objArr, comparator);
            Object obj = null;
            int i = 0;
            for (int i4 = 0; i4 < objArr.length; i4 += 2) {
                Object obj2 = objArr[i4];
                Object obj3 = objArr[i4 + 1];
                if (obj2 != null) {
                    if (obj != null && comparator.compare(obj2, obj) == 0) {
                        i -= 2;
                    }
                    if (obj3 == null) {
                        obj = null;
                    } else {
                        int i9 = i + 1;
                        objArr[i] = obj2;
                        i += 2;
                        objArr[i9] = obj3;
                        obj = obj2;
                    }
                }
            }
            if (objArr.length != i) {
                Object[] objArr3 = new Object[i];
                System.arraycopy(objArr, 0, objArr3, 0, i);
                objArr = objArr3;
            }
        }
    }
}
