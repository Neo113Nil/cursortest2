package defpackage;

import ru.yandex.taxi.jobs.request.NetworkType;

/* loaded from: classes5.dex */
public final class w4j0 {
    public final String a;
    public final long b;
    public final r8x c;
    public final i4u d;
    public final NetworkType e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final boolean j;
    public final String k;
    public final boolean l;

    public w4j0(String str, long j, r8x r8xVar, i4u i4uVar, NetworkType networkType, boolean z, boolean z2, long j2, String str2, int i) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? new r8x() : r8xVar, (i & 8) != 0 ? null : i4uVar, (i & 16) != 0 ? NetworkType.CONNECTED : networkType, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0, (i & 256) != 0 ? 0L : j2, (i & 512) == 0, (i & 1024) != 0 ? str : str2, false);
    }

    public final boolean a() {
        return this.l;
    }

    public final String b() {
        return this.k;
    }

    public final boolean c() {
        return this.h;
    }

    public w4j0(String str, long j, r8x r8xVar, i4u i4uVar, NetworkType networkType, boolean z, boolean z2, boolean z3, long j2, boolean z4, String str2, boolean z5) {
        this.a = str;
        this.b = j;
        this.c = r8xVar;
        this.d = i4uVar;
        this.e = networkType;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = j2;
        this.j = z4;
        this.k = str2;
        this.l = z5;
    }
}
