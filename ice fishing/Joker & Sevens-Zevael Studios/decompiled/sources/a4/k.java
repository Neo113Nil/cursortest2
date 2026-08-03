package a4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f249a;

    /* renamed from: b, reason: collision with root package name */
    public final int f250b;

    /* renamed from: c, reason: collision with root package name */
    public final long f251c;

    /* renamed from: d, reason: collision with root package name */
    public final long f252d;

    public k(int i10, int i11, long j3, long j6) {
        this.f249a = i10;
        this.f250b = i11;
        this.f251c = j3;
        this.f252d = j6;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f249a);
            dataOutputStream.writeInt(this.f250b);
            dataOutputStream.writeLong(this.f251c);
            dataOutputStream.writeLong(this.f252d);
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
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f250b == kVar.f250b && this.f251c == kVar.f251c && this.f249a == kVar.f249a && this.f252d == kVar.f252d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f250b), Long.valueOf(this.f251c), Integer.valueOf(this.f249a), Long.valueOf(this.f252d));
    }
}
