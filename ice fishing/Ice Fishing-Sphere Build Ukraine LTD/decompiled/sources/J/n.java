package J;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f452b;

    /* renamed from: c, reason: collision with root package name */
    public final long f453c;

    /* renamed from: d, reason: collision with root package name */
    public final long f454d;

    public n(int i2, int i3, long j2, long j3) {
        this.f451a = i2;
        this.f452b = i3;
        this.f453c = j2;
        this.f454d = j3;
    }

    public static n a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            n nVar = new n(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f451a);
            dataOutputStream.writeInt(this.f452b);
            dataOutputStream.writeLong(this.f453c);
            dataOutputStream.writeLong(this.f454d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f452b == nVar.f452b && this.f453c == nVar.f453c && this.f451a == nVar.f451a && this.f454d == nVar.f454d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f452b), Long.valueOf(this.f453c), Integer.valueOf(this.f451a), Long.valueOf(this.f454d));
    }
}
