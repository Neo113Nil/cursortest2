package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fbq implements gbq {
    public final s9p a;
    public final String b;
    public final String c;

    public fbq(s9p s9pVar, String str) {
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
        if (!(obj instanceof fbq)) {
            return false;
        }
        fbq fbqVar = (fbq) obj;
        return Intrinsics.d(this.a, fbqVar.a) && Intrinsics.d(this.b, fbqVar.b);
    }

    @Override // defpackage.aaq
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithPassiveSessionId(seeds=" + this.a + ", sessionId=" + this.b + ")";
    }
}
