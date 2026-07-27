package E6;

import com.anythink.basead.exoplayer.h.o;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f834a;

    /* renamed from: b, reason: collision with root package name */
    public final long f835b;

    /* renamed from: c, reason: collision with root package name */
    public final long f836c;

    public a(long j6, long j9, long j10) {
        this.f834a = j6;
        this.f835b = j9;
        this.f836c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f834a == aVar.f834a && this.f835b == aVar.f835b && this.f836c == aVar.f836c;
    }

    public final int hashCode() {
        long j6 = this.f834a;
        long j9 = this.f835b;
        int i = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f836c;
        return ((((i ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ o.f7742d) * 1000003) ^ 10485760;
    }

    public final String toString() {
        return "FileStorageConfiguration{maxFileAgeForWriteMillis=" + this.f834a + ", minFileAgeForReadMillis=" + this.f835b + ", maxFileAgeForReadMillis=" + this.f836c + ", maxFileSize=1048576, maxFolderSize=10485760}";
    }
}
