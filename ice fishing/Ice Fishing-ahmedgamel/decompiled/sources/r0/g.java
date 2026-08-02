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
    public final int f40134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40135b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40136c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40137d;

    public g(long j6, long j9, int i, int i4) {
        this.f40134a = i;
        this.f40135b = i4;
        this.f40136c = j6;
        this.f40137d = j9;
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
            dataOutputStream.writeInt(this.f40134a);
            dataOutputStream.writeInt(this.f40135b);
            dataOutputStream.writeLong(this.f40136c);
            dataOutputStream.writeLong(this.f40137d);
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
            if (this.f40135b == gVar.f40135b && this.f40136c == gVar.f40136c && this.f40134a == gVar.f40134a && this.f40137d == gVar.f40137d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40135b), Long.valueOf(this.f40136c), Integer.valueOf(this.f40134a), Long.valueOf(this.f40137d));
    }
}
