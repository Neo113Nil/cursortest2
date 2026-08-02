package E6;

import com.anythink.basead.exoplayer.h.o;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f897a;

    /* renamed from: b, reason: collision with root package name */
    public final long f898b;

    /* renamed from: c, reason: collision with root package name */
    public final long f899c;

    public a(long j6, long j9, long j10) {
        this.f897a = j6;
        this.f898b = j9;
        this.f899c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f897a == aVar.f897a && this.f898b == aVar.f898b && this.f899c == aVar.f899c;
    }

    public final int hashCode() {
        long j6 = this.f897a;
        long j9 = this.f898b;
        int i = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f899c;
        return ((((i ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ o.f8528d) * 1000003) ^ 10485760;
    }

    public final String toString() {
        return "FileStorageConfiguration{maxFileAgeForWriteMillis=" + this.f897a + ", minFileAgeForReadMillis=" + this.f898b + ", maxFileAgeForReadMillis=" + this.f899c + ", maxFileSize=1048576, maxFolderSize=10485760}";
    }
}
