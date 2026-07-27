package com.anythink.core.common.n.c;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f16015a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final f f16016b = a(new byte[0]);

    /* renamed from: f, reason: collision with root package name */
    private static final long f16017f = 1;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f16018c;

    /* renamed from: d, reason: collision with root package name */
    transient int f16019d;

    /* renamed from: e, reason: collision with root package name */
    transient String f16020e;

    public f(byte[] bArr) {
        this.f16018c = bArr;
    }

    public static f a(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private f n() {
        return d("SHA-512");
    }

    public String b() {
        return b.a(this.f16018c);
    }

    public f c() {
        return d("MD5");
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(f fVar) {
        f fVar2 = fVar;
        int j9 = j();
        int j10 = fVar2.j();
        int min = Math.min(j9, j10);
        for (int i = 0; i < min; i++) {
            int b9 = b(i) & 255;
            int b10 = fVar2.b(i) & 255;
            if (b9 != b10) {
                return b9 < b10 ? -1 : 1;
            }
        }
        if (j9 == j10) {
            return 0;
        }
        return j9 < j10 ? -1 : 1;
    }

    public f d() {
        return d("SHA-1");
    }

    public f e() {
        return d("SHA-256");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int j9 = fVar.j();
            byte[] bArr = this.f16018c;
            if (j9 == bArr.length && fVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return b.b(this.f16018c);
    }

    public String g() {
        byte[] bArr = this.f16018c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b9 : bArr) {
            int i4 = i + 1;
            char[] cArr2 = f16015a;
            cArr[i] = cArr2[(b9 >> 4) & 15];
            i += 2;
            cArr[i4] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public f h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f16018c;
            if (i >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i];
            if (b9 >= 65 && b9 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b9 + 32);
                for (int i4 = i + 1; i4 < bArr2.length; i4++) {
                    byte b10 = bArr2[i4];
                    if (b10 >= 65 && b10 <= 90) {
                        bArr2[i4] = (byte) (b10 + 32);
                    }
                }
                return new f(bArr2);
            }
            i++;
        }
    }

    public int hashCode() {
        int i = this.f16019d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f16018c);
        this.f16019d = hashCode;
        return hashCode;
    }

    public f i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f16018c;
            if (i >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i];
            if (b9 >= 97 && b9 <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b9 - 32);
                for (int i4 = i + 1; i4 < bArr2.length; i4++) {
                    byte b10 = bArr2[i4];
                    if (b10 >= 97 && b10 <= 122) {
                        bArr2[i4] = (byte) (b10 - 32);
                    }
                }
                return new f(bArr2);
            }
            i++;
        }
    }

    public int j() {
        return this.f16018c.length;
    }

    public byte[] k() {
        return (byte[]) this.f16018c.clone();
    }

    public byte[] l() {
        return this.f16018c;
    }

    public ByteBuffer m() {
        return ByteBuffer.wrap(this.f16018c).asReadOnlyBuffer();
    }

    public String toString() {
        if (this.f16018c.length == 0) {
            return "[size=0]";
        }
        String a9 = a();
        int length = a9.length();
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i >= length) {
                i = a9.length();
                break;
            }
            if (i4 == 64) {
                break;
            }
            int codePointAt = a9.codePointAt(i);
            if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i4++;
                i += Character.charCount(codePointAt);
            }
        }
        i = -1;
        if (i != -1) {
            String replace = a9.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i >= a9.length()) {
                return D.y.k("[text=", replace, "]");
            }
            return "[size=" + this.f16018c.length + " text=" + replace + "…]";
        }
        if (this.f16018c.length <= 64) {
            return "[hex=" + g() + "]";
        }
        return "[size=" + this.f16018c.length + " hex=" + a(0, 64).g() + "…]";
    }

    public static f c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            bArr[i] = (byte) ((a(str.charAt(i4)) << 4) + a(str.charAt(i4 + 1)));
        }
        return a(bArr);
    }

    private f d(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f16018c));
        } catch (NoSuchAlgorithmException e6) {
            throw new AssertionError(e6);
        }
    }

    private boolean e(f fVar) {
        return a(j() - fVar.j(), fVar, 0, fVar.j());
    }

    private int f(f fVar) {
        return a(fVar.l(), 0);
    }

    public f b(f fVar) {
        return a("HmacSHA256", fVar);
    }

    private static f a(byte[] bArr, int i, int i4) {
        if (bArr != null) {
            y.a(bArr.length, i, i4);
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i, bArr2, 0, i4);
            return new f(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f b(String str) {
        if (str != null) {
            byte[] a9 = b.a(str);
            if (a9 != null) {
                return new f(a9);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    private int e(byte[] bArr) {
        return b(bArr, j());
    }

    private f d(f fVar) {
        return a("HmacSHA512", fVar);
    }

    private static int e(String str) {
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i < length) {
            if (i4 == 64) {
                return i;
            }
            int codePointAt = str.codePointAt(i);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i4++;
            i += Character.charCount(codePointAt);
        }
        return str.length();
    }

    private int d(byte[] bArr) {
        return a(bArr, 0);
    }

    private int g(f fVar) {
        return b(fVar.l(), j());
    }

    public byte b(int i) {
        return this.f16018c[i];
    }

    private boolean b(byte[] bArr) {
        return a(0, bArr, 0, bArr.length);
    }

    private static f a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new f(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    private int b(f fVar, int i) {
        return b(fVar.l(), i);
    }

    private int h(f fVar) {
        int j9 = j();
        int j10 = fVar.j();
        int min = Math.min(j9, j10);
        for (int i = 0; i < min; i++) {
            int b9 = b(i) & 255;
            int b10 = fVar.b(i) & 255;
            if (b9 != b10) {
                return b9 < b10 ? -1 : 1;
            }
        }
        if (j9 == j10) {
            return 0;
        }
        return j9 < j10 ? -1 : 1;
    }

    public int b(byte[] bArr, int i) {
        for (int min = Math.min(i, this.f16018c.length - bArr.length); min >= 0; min--) {
            if (y.a(this.f16018c, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public final boolean c(f fVar) {
        return a(0, fVar, 0, fVar.j());
    }

    private boolean c(byte[] bArr) {
        return a(j() - bArr.length, bArr, 0, bArr.length);
    }

    public static f a(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(y.f16087a));
            fVar.f16020e = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static f a(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new f(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String a() {
        String str = this.f16020e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f16018c, y.f16087a);
        this.f16020e = str2;
        return str2;
    }

    public String a(Charset charset) {
        if (charset != null) {
            return new String(this.f16018c, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public f a(f fVar) {
        return a("HmacSHA1", fVar);
    }

    private f a(String str, f fVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(fVar.k(), str));
            return a(mac.doFinal(this.f16018c));
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        } catch (NoSuchAlgorithmException e9) {
            throw new AssertionError(e9);
        }
    }

    private static int a(char c4) {
        if (c4 >= '0' && c4 <= '9') {
            return c4 - '0';
        }
        if (c4 >= 'a' && c4 <= 'f') {
            return c4 - 'W';
        }
        if (c4 < 'A' || c4 > 'F') {
            throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c4)));
        }
        return c4 - '7';
    }

    private static f a(InputStream inputStream, int i) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i >= 0) {
            byte[] bArr = new byte[i];
            int i4 = 0;
            while (i4 < i) {
                int read = inputStream.read(bArr, i4, i - i4);
                if (read == -1) {
                    throw new EOFException();
                }
                i4 += read;
            }
            return new f(bArr);
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i)));
    }

    public f a(int i) {
        return a(i, this.f16018c.length);
    }

    public f a(int i, int i4) {
        if (i >= 0) {
            byte[] bArr = this.f16018c;
            if (i4 > bArr.length) {
                throw new IllegalArgumentException(AbstractC5051n.e(this.f16018c.length, ")", new StringBuilder("endIndex > length(")));
            }
            int i9 = i4 - i;
            if (i9 >= 0) {
                if (i == 0 && i4 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i9];
                System.arraycopy(bArr, i, bArr2, 0, i9);
                return new f(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public void a(OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.write(this.f16018c);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public void a(c cVar) {
        byte[] bArr = this.f16018c;
        cVar.c(bArr, 0, bArr.length);
    }

    public boolean a(int i, f fVar, int i4, int i9) {
        return fVar.a(0, this.f16018c, i, i9);
    }

    public boolean a(int i, byte[] bArr, int i4, int i9) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f16018c;
        return i <= bArr2.length - i9 && i4 >= 0 && i4 <= bArr.length - i9 && y.a(bArr2, i, bArr, i4, i9);
    }

    private int a(f fVar, int i) {
        return a(fVar.l(), i);
    }

    public int a(byte[] bArr, int i) {
        int length = this.f16018c.length - bArr.length;
        for (int max = Math.max(i, 0); max <= length; max++) {
            if (y.a(this.f16018c, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    private void a(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read == -1) {
                    throw new EOFException();
                }
                i += read;
            }
            f fVar = new f(bArr);
            try {
                Field declaredField = f.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                declaredField.set(this, fVar.f16018c);
                return;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
                throw new AssertionError();
            }
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(readInt)));
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f16018c.length);
        objectOutputStream.write(this.f16018c);
    }
}
