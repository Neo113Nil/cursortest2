package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ofd extends pfd {
    public final u1q a;
    public final String b;
    public final long c;

    public ofd(u1q u1qVar, String str, long j) {
        u1qVar.getClass();
        this.a = u1qVar;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofd)) {
            return false;
        }
        ofd ofdVar = (ofd) obj;
        return Intrinsics.d(this.a, ofdVar.a) && Intrinsics.d(this.b, ofdVar.b) && this.c == ofdVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Radio(radio=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", progressMs=");
        return hrg.m(this.c, ")", sb);
    }
}
