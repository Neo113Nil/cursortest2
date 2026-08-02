package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y5v implements a6v {
    public final List a;
    public final long b;
    public final long c;
    public final long d;

    public y5v(List list, long j) {
        list.getClass();
        this.a = list;
        this.b = j;
        long j2 = d85.f;
        this.c = j2;
        this.d = d85.b(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14);
    }

    @Override // defpackage.a6v
    public final long a() {
        return this.d;
    }

    @Override // defpackage.a6v
    public final long b() {
        return this.c;
    }

    @Override // defpackage.a6v
    public final List c() {
        return this.a;
    }

    @Override // defpackage.a6v
    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5v)) {
            return false;
        }
        y5v y5vVar = (y5v) obj;
        return Intrinsics.d(this.a, y5vVar.a) && d85.c(this.b, y5vVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "Default(gradient=" + this.a + ", wordsButtonColor=" + d85.i(this.b) + ")";
    }
}
