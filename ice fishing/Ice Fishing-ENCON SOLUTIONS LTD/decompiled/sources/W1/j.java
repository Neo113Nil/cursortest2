package W1;

import a.AbstractC0083a;
import i1.AbstractC0251h;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final j f1876d = new j(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1877a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f1878b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f1879c;

    public j(byte[] data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f1877a = data;
    }

    public int a() {
        return this.f1877a.length;
    }

    public String b() {
        byte[] bArr = this.f1877a;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = X1.b.f1919a;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f1877a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        j other = (j) obj;
        kotlin.jvm.internal.i.e(other, "other");
        int a2 = a();
        int a3 = other.a();
        int min = Math.min(a2, a3);
        for (int i2 = 0; i2 < min; i2++) {
            int d2 = d(i2) & 255;
            int d3 = other.d(i2) & 255;
            if (d2 == d3) {
            }
        }
        if (a2 == a3) {
            return 0;
        }
    }

    public byte d(int i2) {
        return this.f1877a[i2];
    }

    public boolean e(int i2, byte[] other, int i3, int i4) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i2 >= 0) {
            byte[] bArr = this.f1877a;
            if (i2 <= bArr.length - i4 && i3 >= 0 && i3 <= other.length - i4 && AbstractC0083a.c(i2, i3, i4, bArr, other)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int a2 = jVar.a();
            byte[] bArr = this.f1877a;
            if (a2 == bArr.length && jVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(j other, int i2) {
        kotlin.jvm.internal.i.e(other, "other");
        return other.e(0, this.f1877a, 0, i2);
    }

    public j g() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f1877a;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.i.d(copyOf, "copyOf(this, size)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b3 = copyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        copyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new j(copyOf);
            }
            i2++;
        }
    }

    public final String h() {
        String str = this.f1879c;
        if (str != null) {
            return str;
        }
        byte[] c2 = c();
        kotlin.jvm.internal.i.e(c2, "<this>");
        String str2 = new String(c2, z1.a.f8620a);
        this.f1879c = str2;
        return str2;
    }

    public int hashCode() {
        int i2 = this.f1878b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.f1877a);
        this.f1878b = hashCode;
        return hashCode;
    }

    public void i(g buffer, int i2) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        buffer.s(this.f1877a, 0, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0120, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0163, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x015c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x019e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a1, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b2;
        int i2;
        byte[] bArr = this.f1877a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                int i6 = i5 + 1;
                if (i5 == 64) {
                    break;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (Byte.MAX_VALUE <= b3 && b3 < 160))) || b3 == 65533) {
                    break;
                }
                i4 += b3 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && (b2 = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i5 + 1;
                        if (i5 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i4 += b2 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b3 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length > i7) {
                    byte b4 = bArr[i7];
                    if ((b4 & 192) == 128) {
                        int i8 = (b4 ^ 3968) ^ (b3 << 6);
                        if (i8 >= 128) {
                            i2 = i5 + 1;
                            if (i5 == 64) {
                                break;
                            }
                            if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                break;
                            }
                            i4 += i8 < 65536 ? 1 : 2;
                            i3 += 2;
                            i5 = i2;
                        }
                    }
                }
            } else if ((b3 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length > i9) {
                    byte b5 = bArr[i3 + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i9];
                        if ((b6 & 192) == 128) {
                            int i10 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b3 << 12);
                            if (i10 >= 2048) {
                                if (55296 > i10 || i10 >= 57344) {
                                    i2 = i5 + 1;
                                    if (i5 == 64) {
                                        break;
                                    }
                                    if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                        break;
                                    }
                                    i4 += i10 < 65536 ? 1 : 2;
                                    i3 += 3;
                                    i5 = i2;
                                }
                            }
                        }
                    }
                }
            } else if ((b3 >> 3) == -2) {
                int i11 = i3 + 3;
                if (length > i11) {
                    byte b7 = bArr[i3 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i3 + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i11];
                            if ((b9 & 192) == 128) {
                                int i12 = (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12)) ^ (b3 << 18);
                                if (i12 <= 1114111) {
                                    if (55296 > i12 || i12 >= 57344) {
                                        if (i12 >= 65536) {
                                            i2 = i5 + 1;
                                            if (i5 == 64) {
                                                break;
                                            }
                                            if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                                break;
                                            }
                                            i4 += i12 < 65536 ? 1 : 2;
                                            i3 += 4;
                                            i5 = i2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i4 != -1) {
            String h2 = h();
            String substring = h2.substring(0, i4);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String P2 = z1.o.P(z1.o.P(z1.o.P(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i4 >= h2.length()) {
                return "[text=" + P2 + ']';
            }
            return "[size=" + bArr.length + " text=" + P2 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new j(AbstractC0251h.O(bArr, 0, 64))).b());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
