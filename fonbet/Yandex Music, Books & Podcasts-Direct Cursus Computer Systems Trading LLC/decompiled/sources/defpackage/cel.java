package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cel implements ael {
    public final String a;
    public final String b;
    public final long c;

    public cel(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.eel
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ael
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cel)) {
            return false;
        }
        cel celVar = (cel) obj;
        return Intrinsics.d(this.a, celVar.a) && Intrinsics.d(this.b, celVar.b) && this.c == celVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return hrg.m(this.c, ")", f1d.m("Concert(trackId=", this.a, ", artistId=", this.b, ", timestampMs="));
    }

    @Override // defpackage.eel
    public final String u() {
        return this.a;
    }
}
