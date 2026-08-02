package yads;

import defpackage.oaa1;
import defpackage.w4a1;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class bl2 extends w31 {
    private static final long serialVersionUID = 0;
    public static final bl2 z = new bl2(0, null, new Object[0]);
    public final transient Object w;
    public final transient Object[] x;
    public final transient int y;

    public bl2(int i, Object obj, Object[] objArr) {
        this.w = obj;
        this.x = objArr;
        this.y = i;
    }

    public static IllegalArgumentException c(int i, Object obj, Object obj2, Object[] objArr) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i] + "=" + objArr[i ^ 1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d9, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bl2 f(int i, Object[] objArr) {
        byte[] bArr;
        if (i == 0) {
            return z;
        }
        Object obj = null;
        int i2 = 0;
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new bl2(1, null, objArr);
        }
        oaa1.i(i, objArr.length >> 1);
        int k = y31.k(i);
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
        } else {
            int i3 = k - 1;
            if (k <= 128) {
                bArr = new byte[k];
                Arrays.fill(bArr, (byte) -1);
                while (i2 < i) {
                    int i4 = i2 * 2;
                    Object obj2 = objArr[i4];
                    Objects.requireNonNull(obj2);
                    Object obj3 = objArr[i4 ^ 1];
                    Objects.requireNonNull(obj3);
                    int a = w4a1.a(obj2.hashCode());
                    while (true) {
                        int i5 = a & i3;
                        int i6 = bArr[i5] & 255;
                        if (i6 == 255) {
                            break;
                        }
                        if (obj2.equals(objArr[i6])) {
                            throw c(i6, obj2, obj3, objArr);
                        }
                        a = i5 + 1;
                    }
                }
            } else if (k <= 32768) {
                bArr = new short[k];
                Arrays.fill(bArr, (short) -1);
                while (i2 < i) {
                    int i7 = i2 * 2;
                    Object obj4 = objArr[i7];
                    Objects.requireNonNull(obj4);
                    Object obj5 = objArr[i7 ^ 1];
                    Objects.requireNonNull(obj5);
                    int a2 = w4a1.a(obj4.hashCode());
                    while (true) {
                        int i8 = a2 & i3;
                        int i9 = bArr[i8] & 65535;
                        if (i9 == 65535) {
                            break;
                        }
                        if (obj4.equals(objArr[i9])) {
                            throw c(i9, obj4, obj5, objArr);
                        }
                        a2 = i8 + 1;
                    }
                }
            } else {
                bArr = new int[k];
                Arrays.fill((int[]) bArr, -1);
                while (i2 < i) {
                    int i10 = i2 * 2;
                    Object obj6 = objArr[i10];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr[i10 ^ 1];
                    Objects.requireNonNull(obj7);
                    int a3 = w4a1.a(obj6.hashCode());
                    while (true) {
                        int i11 = a3 & i3;
                        ?? r8 = bArr[i11];
                        if (r8 == -1) {
                            break;
                        }
                        if (obj6.equals(objArr[r8])) {
                            throw c(r8, obj6, obj7, objArr);
                        }
                        a3 = i11 + 1;
                    }
                }
            }
            obj = bArr;
        }
        return new bl2(i, obj, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009d A[RETURN] */
    @Override // yads.w31, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.x;
            if (this.y == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.w;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int a = w4a1.a(obj.hashCode());
                        while (true) {
                            int i = a & length;
                            int i2 = bArr[i] & 255;
                            if (i2 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i2])) {
                                obj2 = objArr[i2 ^ 1];
                                break;
                            }
                            a = i + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a2 = w4a1.a(obj.hashCode());
                        while (true) {
                            int i3 = a2 & length2;
                            int i4 = sArr[i3] & 65535;
                            if (i4 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i4])) {
                                obj2 = objArr[i4 ^ 1];
                                break;
                            }
                            a2 = i3 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a3 = w4a1.a(obj.hashCode());
                        while (true) {
                            int i5 = a3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            a3 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.y;
    }
}
