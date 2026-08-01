package i0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3297b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3298c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3299d;

    public i(int i, int i2, long j, long j2) {
        this.f3296a = i;
        this.f3297b = i2;
        this.f3298c = j;
        this.f3299d = j2;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
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
            dataOutputStream.writeInt(this.f3296a);
            dataOutputStream.writeInt(this.f3297b);
            dataOutputStream.writeLong(this.f3298c);
            dataOutputStream.writeLong(this.f3299d);
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
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3297b == iVar.f3297b && this.f3298c == iVar.f3298c && this.f3296a == iVar.f3296a && this.f3299d == iVar.f3299d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3297b), Long.valueOf(this.f3298c), Integer.valueOf(this.f3296a), Long.valueOf(this.f3299d));
    }
}
