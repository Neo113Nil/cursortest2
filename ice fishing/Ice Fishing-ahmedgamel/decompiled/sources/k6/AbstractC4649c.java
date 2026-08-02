package k6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;

/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4649c {

    /* renamed from: n, reason: collision with root package name */
    public final Object[] f38609n;

    /* renamed from: u, reason: collision with root package name */
    public int f38610u;

    public AbstractC4649c(Object[] objArr) {
        this.f38609n = objArr;
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
        int i6 = ((i4 + i) / 4) * 2;
        c(objArr2, i, i6, objArr, comparator);
        c(objArr2, i6, i4, objArr, comparator);
        int i9 = i;
        int i10 = i6;
        while (i < i4) {
            if (i9 < i6 - 1) {
                if (i10 < i4 - 1) {
                    Object obj = objArr[i9];
                    Object obj2 = objArr[i10];
                }
                objArr2[i] = objArr[i9];
                objArr2[i + 1] = objArr[i9 + 1];
                i9 += 2;
                i += 2;
            }
            objArr2[i] = objArr[i10];
            objArr2[i + 1] = objArr[i10 + 1];
            i10 += 2;
            i += 2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC4649c) {
            return Arrays.equals(this.f38609n, ((AbstractC4649c) obj).f38609n);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.f38609n;
            if (i >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i], objArr[i + 1]);
            i += 2;
        }
    }

    public final int hashCode() {
        int i = this.f38610u;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f38609n) ^ 1000003;
        this.f38610u = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f38609n.length == 0;
    }

    public final int size() {
        return this.f38609n.length / 2;
    }

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.f38609n;
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
    public AbstractC4649c(Object[] objArr, Comparator comparator) {
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
                        int i6 = i + 1;
                        objArr[i] = obj2;
                        i += 2;
                        objArr[i6] = obj3;
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
