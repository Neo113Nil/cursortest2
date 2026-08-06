package N;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1135a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1136b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1137c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1138d;

    public k(int i2, int i3, long j2, long j3) {
        this.f1135a = i2;
        this.f1136b = i3;
        this.f1137c = j2;
        this.f1138d = j3;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
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
            dataOutputStream.writeInt(this.f1135a);
            dataOutputStream.writeInt(this.f1136b);
            dataOutputStream.writeLong(this.f1137c);
            dataOutputStream.writeLong(this.f1138d);
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
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1136b == kVar.f1136b && this.f1137c == kVar.f1137c && this.f1135a == kVar.f1135a && this.f1138d == kVar.f1138d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1136b), Long.valueOf(this.f1137c), Integer.valueOf(this.f1135a), Long.valueOf(this.f1138d));
    }
}
