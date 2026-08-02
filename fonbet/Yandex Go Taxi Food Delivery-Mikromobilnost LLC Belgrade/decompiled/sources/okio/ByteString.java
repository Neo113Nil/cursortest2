package okio;

import defpackage.a;
import defpackage.bb1;
import defpackage.cvu0;
import defpackage.f73;
import defpackage.j;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.uza;
import defpackage.w511;
import defpackage.xvz;
import defpackage.yp6;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "", Constants.KEY_DATA, "[B", "g", "()[B", "cvw", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString c = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    public transient int a;
    public transient String b;
    private final byte[] data;

    public ByteString(byte[] bArr) {
        this.data = bArr;
    }

    public static int k(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        return byteString.j(0, byteString2.l());
    }

    private final void readObject(ObjectInputStream in) throws IOException {
        int readInt = in.readInt();
        if (readInt < 0) {
            w511.f(oyr.i(readInt, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = in.read(bArr, i, readInt - i);
            if (read == -1) {
                ny61.b();
                return;
            }
            i += read;
        }
        ByteString byteString = new ByteString(bArr);
        Field declaredField = ByteString.class.getDeclaredField(Constants.KEY_DATA);
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static ByteString t(int i, int i2, int i3, ByteString byteString) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = j.b;
        }
        return byteString.s(i, i2);
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    public String a() {
        byte[] bArr = this.data;
        byte[] bArr2 = a.a;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & PKIBody._CCP) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & PKIBody._CCP) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, uza.a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ByteString byteString) {
        int h = h();
        int h2 = byteString.h();
        int min = Math.min(h, h2);
        for (int i = 0; i < min; i++) {
            int m = m(i) & 255;
            int m2 = byteString.m(i) & 255;
            if (m != m2) {
                return m < m2 ? -1 : 1;
            }
        }
        if (h == h2) {
            return 0;
        }
        return h < h2 ? -1 : 1;
    }

    public void c(int i, int i2, int i3, byte[] bArr) {
        f73.e(this.data, i2, i, bArr, i3 + i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int h = byteString.h();
            byte[] bArr = this.data;
            if (h == bArr.length && byteString.p(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public ByteString f(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, h());
        return new ByteString(messageDigest.digest());
    }

    /* renamed from: g, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public int h() {
        return this.data.length;
    }

    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.a = hashCode;
        return hashCode;
    }

    public String i() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = bb1.b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & PKIBody._CCP];
        }
        return new String(cArr);
    }

    public int j(int i, byte[] bArr) {
        int length = this.data.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!j.a(this.data, max, 0, bArr, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] l() {
        return this.data;
    }

    public byte m(int i) {
        return this.data[i];
    }

    public int n(int i, byte[] bArr) {
        if (i == j.b) {
            i = h();
        }
        for (int min = Math.min(i, this.data.length - bArr.length); -1 < min; min--) {
            if (j.a(this.data, min, 0, bArr, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean p(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.data;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && j.a(bArr2, i, i2, bArr, i3);
    }

    public boolean q(ByteString byteString, int i, int i2) {
        return byteString.p(0, i, i2, this.data);
    }

    public String r(Charset charset) {
        return new String(this.data, charset);
    }

    public ByteString s(int i, int i2) {
        if (i2 == j.b) {
            i2 = h();
        }
        if (i < 0) {
            ny61.g("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.data;
        if (i2 > bArr.length) {
            w511.f(oyr.s(new StringBuilder("endIndex > length("), this.data.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new ByteString(f73.m(i, i2, bArr));
        }
        ny61.g("endIndex < beginIndex");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        ByteString byteString = this;
        byte[] bArr = byteString.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & DerValue.TAG_PRIVATE) == 128) {
                        int i7 = (b3 ^ DerValue.TAG_CONTEXT) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & DerValue.TAG_PRIVATE) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & DerValue.TAG_PRIVATE) == 128) {
                            int i9 = ((b5 ^ DerValue.TAG_CONTEXT) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & DerValue.TAG_PRIVATE) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & DerValue.TAG_PRIVATE) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & DerValue.TAG_PRIVATE) == 128) {
                                int i11 = (((b8 ^ DerValue.TAG_CONTEXT) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String w = byteString.w();
            String v = cvu0.v(cvu0.v(cvu0.v(w.substring(0, i3), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            return i3 < w.length() ? xvz.h(byteString.data.length, " text=", v, "…]", new StringBuilder("[size=")) : unr0.l(']', "[text=", v);
        }
        if (byteString.data.length <= 64) {
            return "[hex=" + byteString.i() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(byteString.data.length);
        sb.append(" hex=");
        int h = 64 == j.b ? byteString.h() : 64;
        byte[] bArr2 = byteString.data;
        if (h > bArr2.length) {
            w511.f(oyr.s(new StringBuilder("endIndex > length("), byteString.data.length, ')'));
            return null;
        }
        if (h < 0) {
            ny61.g("endIndex < beginIndex");
            return null;
        }
        if (h != bArr2.length) {
            byteString = new ByteString(f73.m(0, h, bArr2));
        }
        sb.append(byteString.i());
        sb.append("…]");
        return sb.toString();
    }

    public ByteString u() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + BlobHeaderStructure.BLOB_VERSION);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + BlobHeaderStructure.BLOB_VERSION);
                    }
                }
                return new ByteString(copyOf);
            }
            i++;
        }
    }

    public byte[] v() {
        byte[] bArr = this.data;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String w() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String str2 = new String(l(), uza.a);
        this.b = str2;
        return str2;
    }

    public void x(yp6 yp6Var, int i) {
        yp6Var.write(this.data, 0, i);
    }
}
