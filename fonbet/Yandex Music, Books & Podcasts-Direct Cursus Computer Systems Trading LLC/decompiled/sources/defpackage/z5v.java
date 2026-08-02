package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z5v implements a6v {
    public final long a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;

    public z5v(long j, long j2, List list) {
        list.getClass();
        this.a = j;
        this.b = list;
        this.c = j2;
        this.d = j;
        this.e = j;
    }

    @Override // defpackage.a6v
    public final long a() {
        return this.e;
    }

    @Override // defpackage.a6v
    public final long b() {
        return this.d;
    }

    @Override // defpackage.a6v
    public final List c() {
        return this.b;
    }

    @Override // defpackage.a6v
    public final long d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5v)) {
            return false;
        }
        z5v z5vVar = (z5v) obj;
        return d85.c(this.a, z5vVar.a) && Intrinsics.d(this.b, z5vVar.b) && d85.c(this.c, z5vVar.c);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.c) + k5r.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String i = d85.i(this.a);
        return su4.o(ouj.v("Static(color=", i, ", gradient=", ", wordsButtonColor=", this.b), d85.i(this.c), ")");
    }
}
