package defpackage;

import java.io.File;

/* loaded from: classes10.dex */
public final class r64 {
    public final long a;
    public final long b;
    public final File c;

    public r64(long j, long j2, File file) {
        this.a = j;
        this.b = j2;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r64)) {
            return false;
        }
        r64 r64Var = (r64) obj;
        return this.a == r64Var.a && this.b == r64Var.b && this.c.equals(r64Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * (-721379959));
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.a + ", durationLimitMillis=" + this.b + ", location=null, file=" + this.c + "}";
    }
}
