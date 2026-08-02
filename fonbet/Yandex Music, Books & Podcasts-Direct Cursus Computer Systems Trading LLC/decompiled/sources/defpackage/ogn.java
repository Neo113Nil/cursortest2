package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ogn implements rgn {
    public final String a;
    public final f7u b;
    public final c0t c;

    public ogn(String str, f7u f7uVar, c0t c0tVar) {
        str.getClass();
        c0tVar.getClass();
        this.a = str;
        this.b = f7uVar;
        this.c = c0tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogn)) {
            return false;
        }
        ogn ognVar = (ogn) obj;
        return Intrinsics.d(this.a, ognVar.a) && this.b.equals(ognVar.b) && Intrinsics.d(this.c, ognVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NothingToPlay(radioSessionId=" + this.a + ", queue=" + this.b + ", analyticsOptions=" + this.c + ")";
    }
}
