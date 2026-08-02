package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ebq implements gbq {
    public final s9p a;
    public final String b;
    public final String c;

    public ebq(s9p s9pVar, String str) {
        s9pVar.getClass();
        str.getClass();
        this.a = s9pVar;
        this.b = str;
        this.c = o8g.Q(s9pVar.a());
    }

    @Override // defpackage.gbq
    public final s9p d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebq)) {
            return false;
        }
        ebq ebqVar = (ebq) obj;
        return Intrinsics.d(this.a, ebqVar.a) && Intrinsics.d(this.b, ebqVar.b);
    }

    @Override // defpackage.aaq
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithActiveSessionId(seeds=" + this.a + ", sessionId=" + this.b + ")";
    }
}
