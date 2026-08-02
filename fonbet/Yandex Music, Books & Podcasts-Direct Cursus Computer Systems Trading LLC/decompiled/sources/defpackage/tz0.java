package defpackage;

import java.util.RandomAccess;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class tz0 extends a implements RandomAccess {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tz0(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (!(obj instanceof Byte)) {
                    return false;
                }
                byte byteValue = ((Number) obj).byteValue();
                byte[] bArr = (byte[]) this.c;
                int length = bArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                    } else if (byteValue != bArr[i]) {
                        i++;
                    }
                }
                return i >= 0;
            default:
                if (obj instanceof Integer) {
                    return xz0.t((int[]) this.c, ((Number) obj).intValue());
                }
                return false;
        }
    }

    @Override // defpackage.w5
    public final int f() {
        switch (this.b) {
            case 0:
                return ((byte[]) this.c).length;
            default:
                return ((int[]) this.c).length;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.b) {
            case 0:
                return Byte.valueOf(((byte[]) this.c)[i]);
            default:
                return Integer.valueOf(((int[]) this.c)[i]);
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public final int indexOf(Object obj) {
        switch (this.b) {
            case 0:
                if (!(obj instanceof Byte)) {
                    return -1;
                }
                byte byteValue = ((Number) obj).byteValue();
                byte[] bArr = (byte[]) this.c;
                int length = bArr.length;
                for (int i = 0; i < length; i++) {
                    if (byteValue == bArr[i]) {
                        return i;
                    }
                }
                return -1;
            default:
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                return xz0.F((int[]) this.c, ((Number) obj).intValue());
        }
    }

    @Override // defpackage.w5, java.util.Collection
    public final boolean isEmpty() {
        switch (this.b) {
            case 0:
                if (((byte[]) this.c).length == 0) {
                }
                break;
            default:
                if (((int[]) this.c).length == 0) {
                }
                break;
        }
        return false;
    }

    @Override // kotlin.collections.a, java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof Byte) {
                    byte byteValue = ((Number) obj).byteValue();
                    byte[] bArr = (byte[]) this.c;
                    int length = bArr.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i = length - 1;
                            if (byteValue == bArr[length]) {
                                break;
                            } else if (i < 0) {
                                break;
                            } else {
                                length = i;
                            }
                        }
                    }
                }
                break;
            default:
                if (obj instanceof Integer) {
                    int intValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) this.c;
                    int length2 = iArr.length - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i2 = length2 - 1;
                            if (intValue == iArr[length2]) {
                                break;
                            } else if (i2 < 0) {
                                break;
                            } else {
                                length2 = i2;
                            }
                        }
                    }
                }
                break;
        }
        return -1;
    }
}
