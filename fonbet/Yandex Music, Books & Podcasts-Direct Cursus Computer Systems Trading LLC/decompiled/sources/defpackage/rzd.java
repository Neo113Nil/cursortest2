package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rzd {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final yde l;
    public final yde m;
    public final yde n;

    public rzd(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, qsn qsnVar) {
        vq1.v((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = yde.v(arrayList2);
        this.m = yde.v(arrayList3);
        this.n = yde.v(qsnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzd)) {
            return false;
        }
        rzd rzdVar = (rzd) obj;
        return this.d == rzdVar.d && this.e == rzdVar.e && this.f == rzdVar.f && this.g == rzdVar.g && this.i == rzdVar.i && this.j == rzdVar.j && this.k == rzdVar.k && Objects.equals(this.a, rzdVar.a) && Objects.equals(this.b, rzdVar.b) && Objects.equals(this.c, rzdVar.c) && Objects.equals(this.h, rzdVar.h) && Objects.equals(this.l, rzdVar.l) && Objects.equals(this.m, rzdVar.m) && Objects.equals(this.n, rzdVar.n);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n);
    }
}
