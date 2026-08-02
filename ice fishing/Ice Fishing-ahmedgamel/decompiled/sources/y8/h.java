package y8;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import v7.AbstractC5118i;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public class h implements Serializable, Comparable {

    /* renamed from: w, reason: collision with root package name */
    public static final h f41925w = new h(new byte[0]);

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f41926n;

    /* renamed from: u, reason: collision with root package name */
    public transient int f41927u;

    /* renamed from: v, reason: collision with root package name */
    public transient String f41928v;

    public h(byte[] data) {
        kotlin.jvm.internal.h.e(data, "data");
        this.f41926n = data;
    }

    public int a() {
        return this.f41926n.length;
    }

    public String c() {
        byte[] bArr = this.f41926n;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b9 : bArr) {
            int i4 = i + 1;
            char[] cArr2 = z8.b.f42246a;
            cArr[i] = cArr2[(b9 >> 4) & 15];
            i += 2;
            cArr[i4] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h other = (h) obj;
        kotlin.jvm.internal.h.e(other, "other");
        int a9 = a();
        int a10 = other.a();
        int min = Math.min(a9, a10);
        for (int i = 0; i < min; i++) {
            int e9 = e(i) & 255;
            int e10 = other.e(i) & 255;
            if (e9 != e10) {
                return e9 < e10 ? -1 : 1;
            }
        }
        if (a9 == a10) {
            return 0;
        }
        return a9 < a10 ? -1 : 1;
    }

    public byte[] d() {
        return this.f41926n;
    }

    public byte e(int i) {
        return this.f41926n[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int a9 = hVar.a();
            byte[] bArr = this.f41926n;
            if (a9 == bArr.length && hVar.f(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i, int i4, int i6, byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f41926n;
        return i <= bArr.length - i6 && i4 >= 0 && i4 <= other.length - i6 && b.a(bArr, i, other, i4, i6);
    }

    public boolean g(h other, int i) {
        kotlin.jvm.internal.h.e(other, "other");
        return other.f(0, 0, i, this.f41926n);
    }

    public String h(Charset charset) {
        kotlin.jvm.internal.h.e(charset, "charset");
        return new String(this.f41926n, charset);
    }

    public int hashCode() {
        int i = this.f41927u;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f41926n);
        this.f41927u = hashCode;
        return hashCode;
    }

    public h i(int i, int i4) {
        if (i4 == -1234567890) {
            i4 = a();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f41926n;
        if (i4 > bArr.length) {
            throw new IllegalArgumentException(D.x.n(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i4 - i >= 0) {
            return (i == 0 && i4 == bArr.length) ? this : new h(AbstractC5118i.w(bArr, i, i4));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public h j() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f41926n;
            if (i >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i];
            if (b9 >= 65 && b9 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                copyOf[i] = (byte) (b9 + 32);
                for (int i4 = i + 1; i4 < copyOf.length; i4++) {
                    byte b10 = copyOf[i4];
                    if (b10 >= 65 && b10 <= 90) {
                        copyOf[i4] = (byte) (b10 + 32);
                    }
                }
                return new h(copyOf);
            }
            i++;
        }
    }

    public byte[] k() {
        byte[] bArr = this.f41926n;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final String l() {
        String str = this.f41928v;
        if (str != null) {
            return str;
        }
        byte[] d9 = d();
        kotlin.jvm.internal.h.e(d9, "<this>");
        String str2 = new String(d9, Q7.a.f2701a);
        this.f41928v = str2;
        return str2;
    }

    public void m(e buffer, int i) {
        kotlin.jvm.internal.h.e(buffer, "buffer");
        buffer.V(this.f41926n, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ee, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0128, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012c, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ce, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x016b, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0172, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0164, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a2, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a5, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a8, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0138, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ab, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008e, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007d, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r6 == 64) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b9;
        int i;
        byte[] bArr = this.f41926n;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i4 = 0;
        int i6 = 0;
        int i9 = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            byte b10 = bArr[i4];
            if (b10 >= 0) {
                int i10 = i9 + 1;
                if (i9 == 64) {
                    break;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (Byte.MAX_VALUE <= b10 && b10 < 160))) || b10 == 65533) {
                    break;
                }
                i6 += b10 < 65536 ? 1 : 2;
                i4++;
                while (true) {
                    i9 = i10;
                    if (i4 < length && (b9 = bArr[i4]) >= 0) {
                        i4++;
                        i10 = i9 + 1;
                        if (i9 == 64) {
                            break loop0;
                        }
                        if ((b9 != 10 && b9 != 13 && ((b9 >= 0 && b9 < 32) || (Byte.MAX_VALUE <= b9 && b9 < 160))) || b9 == 65533) {
                            break loop0;
                        }
                        i6 += b9 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b10 >> 5) == -2) {
                int i11 = i4 + 1;
                if (length > i11) {
                    byte b11 = bArr[i11];
                    if ((b11 & 192) == 128) {
                        int i12 = (b11 ^ com.anythink.core.common.s.a.c.f17103a) ^ (b10 << 6);
                        if (i12 >= 128) {
                            i = i9 + 1;
                            if (i9 == 64) {
                                break;
                            }
                            if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                break;
                            }
                            i6 += i12 < 65536 ? 1 : 2;
                            i4 += 2;
                            i9 = i;
                        }
                    }
                }
            } else if ((b10 >> 4) == -2) {
                int i13 = i4 + 2;
                if (length > i13) {
                    byte b12 = bArr[i4 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i13];
                        if ((b13 & 192) == 128) {
                            int i14 = ((b13 ^ com.anythink.core.common.s.a.c.f17103a) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i14 >= 2048) {
                                if (55296 > i14 || i14 >= 57344) {
                                    i = i9 + 1;
                                    if (i9 == 64) {
                                        break;
                                    }
                                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                        break;
                                    }
                                    i6 += i14 < 65536 ? 1 : 2;
                                    i4 += 3;
                                    i9 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b10 >> 3) == -2) {
                int i15 = i4 + 3;
                if (length > i15) {
                    byte b14 = bArr[i4 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i4 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i15];
                            if ((b16 & 192) == 128) {
                                int i16 = (((b16 ^ com.anythink.core.common.s.a.c.f17103a) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i16 <= 1114111) {
                                    if (55296 > i16 || i16 >= 57344) {
                                        if (i16 >= 65536) {
                                            i = i9 + 1;
                                            if (i9 == 64) {
                                                break;
                                            }
                                            if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                                break;
                                            }
                                            i6 += i16 < 65536 ? 1 : 2;
                                            i4 += 4;
                                            i9 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i6 != -1) {
            String l9 = l();
            String substring = l9.substring(0, i6);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
            String f02 = Q7.q.f0(Q7.q.f0(Q7.q.f0(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i6 >= l9.length()) {
                return AbstractC5128c.b(']', "[text=", f02);
            }
            return "[size=" + bArr.length + " text=" + f02 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(D.x.n(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new h(AbstractC5118i.w(bArr, 0, 64))).c());
        sb.append("…]");
        return sb.toString();
    }
}
