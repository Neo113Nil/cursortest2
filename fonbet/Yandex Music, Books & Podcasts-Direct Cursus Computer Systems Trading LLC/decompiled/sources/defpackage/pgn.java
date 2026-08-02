package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pgn implements rgn {
    public final String a;
    public final f7u b;
    public final c0t c;
    public final b3l d;

    public pgn(String str, f7u f7uVar, c0t c0tVar, b3l b3lVar) {
        str.getClass();
        c0tVar.getClass();
        this.a = str;
        this.b = f7uVar;
        this.c = c0tVar;
        this.d = b3lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgn)) {
            return false;
        }
        pgn pgnVar = (pgn) obj;
        return Intrinsics.d(this.a, pgnVar.a) && this.b.equals(pgnVar.b) && Intrinsics.d(this.c, pgnVar.c) && this.d.equals(pgnVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Ready(radioSessionId=" + this.a + ", queue=" + this.b + ", analyticsOptions=" + this.c + ", action=" + this.d + ")";
    }
}
