package defpackage;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class wtq0 implements b891 {
    public long a;
    public long b;
    public final Object c;

    public /* synthetic */ wtq0(Object obj, long j, long j2) {
        this.c = obj;
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.b891
    public void a(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = ((FileChannel) this.c).map(FileChannel.MapMode.READ_ONLY, this.a + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    public String d() {
        return (String) this.c;
    }

    public void e(long j, long j2) {
        long j3 = this.a + j;
        this.a = j3;
        long j4 = this.b;
        if (j4 < 0 || j3 - j4 > 102400 || j3 == j2) {
            this.b = j3;
            ((gjf0) this.c).f(j3, j2);
        }
    }

    @Override // defpackage.b891
    public long zza() {
        return this.b;
    }

    public wtq0(gjf0 gjf0Var) {
        this.b = -1L;
        this.c = gjf0Var;
    }
}
