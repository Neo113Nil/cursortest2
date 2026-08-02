package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bel implements eel {
    public final String a;
    public final long b;

    public bel(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.eel
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bel)) {
            return false;
        }
        bel belVar = (bel) obj;
        return Intrinsics.d(this.a, belVar.a) && this.b == belVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q = k.q("Common(trackId=", this.b, this.a, ", timestampMs=");
        q.append(")");
        return q.toString();
    }

    @Override // defpackage.eel
    public final String u() {
        return this.a;
    }
}
