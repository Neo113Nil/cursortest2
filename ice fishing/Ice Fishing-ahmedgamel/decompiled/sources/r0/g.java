package r0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f40323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40324b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40325c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40326d;

    public g(long j6, long j9, int i, int i6) {
        this.f40323a = i;
        this.f40324b = i6;
        this.f40325c = j6;
        this.f40326d = j9;
    }

    public static g a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readLong(), dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt());
            dataInputStream.close();
            return gVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f40323a);
            dataOutputStream.writeInt(this.f40324b);
            dataOutputStream.writeLong(this.f40325c);
            dataOutputStream.writeLong(this.f40326d);
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
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f40324b == gVar.f40324b && this.f40325c == gVar.f40325c && this.f40323a == gVar.f40323a && this.f40326d == gVar.f40326d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40324b), Long.valueOf(this.f40325c), Integer.valueOf(this.f40323a), Long.valueOf(this.f40326d));
    }
}
