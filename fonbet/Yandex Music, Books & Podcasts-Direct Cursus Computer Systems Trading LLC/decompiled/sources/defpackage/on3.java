package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class on3 implements Serializable {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public transient int b;
    public transient String c;

    static {
        c(new byte[0]);
    }

    public on3(byte[] bArr) {
        this.a = bArr;
    }

    public static on3 a(String str) {
        if (str == null) {
            xq0.x("s == null");
            return null;
        }
        on3 on3Var = new on3(str.getBytes(ne4.b));
        on3Var.c = str;
        return on3Var;
    }

    public static on3 c(byte... bArr) {
        if (bArr != null) {
            return new on3((byte[]) bArr.clone());
        }
        xq0.x("data == null");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            xq0.x(k5r.i(readInt, "byteCount < 0: "));
            return;
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                xq0.v();
                return;
            }
            i += read;
        }
        on3 on3Var = new on3(bArr);
        try {
            Field declaredField = on3.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, on3Var.a);
        } catch (IllegalAccessException unused) {
            wvs.b();
        } catch (NoSuchFieldException unused2) {
            wvs.b();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.a.length);
        objectOutputStream.write(this.a);
    }

    public final String b() {
        byte[] bArr = this.a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof on3) && Arrays.equals(((on3) obj).a, this.a);
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    public final String toString() {
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return "ByteString[size=0]";
        }
        if (bArr.length <= 16) {
            Locale locale = Locale.ENGLISH;
            return "ByteString[size=" + bArr.length + " data=" + b() + "]";
        }
        try {
            Locale locale2 = Locale.ENGLISH;
            return "ByteString[size=" + bArr.length + " md5=" + c(MessageDigest.getInstance("MD5").digest(this.a)).b() + "]";
        } catch (NoSuchAlgorithmException unused) {
            wvs.b();
            return null;
        }
    }
}
