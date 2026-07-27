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
    public final int f445a;

    /* renamed from: b, reason: collision with root package name */
    public final int f446b;

    /* renamed from: c, reason: collision with root package name */
    public final long f447c;

    /* renamed from: d, reason: collision with root package name */
    public final long f448d;

    public n(int i2, int i3, long j2, long j3) {
        this.f445a = i2;
        this.f446b = i3;
        this.f447c = j2;
        this.f448d = j3;
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
            dataOutputStream.writeInt(this.f445a);
            dataOutputStream.writeInt(this.f446b);
            dataOutputStream.writeLong(this.f447c);
            dataOutputStream.writeLong(this.f448d);
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
        return this.f446b == nVar.f446b && this.f447c == nVar.f447c && this.f445a == nVar.f445a && this.f448d == nVar.f448d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f446b), Long.valueOf(this.f447c), Integer.valueOf(this.f445a), Long.valueOf(this.f448d));
    }
}
