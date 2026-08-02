package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class icw {
    public final String a;
    public final int b;
    public final String c;

    public icw(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icw)) {
            return false;
        }
        icw icwVar = (icw) obj;
        return Intrinsics.d(this.a, icwVar.a) && this.b == icwVar.b && Intrinsics.d(this.c, icwVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int a = f1d.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.l(this.b, "PlayableInQueue(playableId=", this.a, ", playableIndex=", ", sessionId="), this.c, ")");
    }
}
