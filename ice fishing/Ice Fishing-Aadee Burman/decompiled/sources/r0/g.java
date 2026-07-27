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
    public final int f40320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40321b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40322c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40323d;

    public g(long j6, long j9, int i, int i6) {
        this.f40320a = i;
        this.f40321b = i6;
        this.f40322c = j6;
        this.f40323d = j9;
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
            dataOutputStream.writeInt(this.f40320a);
            dataOutputStream.writeInt(this.f40321b);
            dataOutputStream.writeLong(this.f40322c);
            dataOutputStream.writeLong(this.f40323d);
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
            if (this.f40321b == gVar.f40321b && this.f40322c == gVar.f40322c && this.f40320a == gVar.f40320a && this.f40323d == gVar.f40323d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40321b), Long.valueOf(this.f40322c), Integer.valueOf(this.f40320a), Long.valueOf(this.f40323d));
    }
}
