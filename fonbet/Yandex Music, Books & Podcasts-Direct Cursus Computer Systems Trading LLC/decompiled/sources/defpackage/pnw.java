package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pnw implements l7q {
    public final String a;
    public final f5q b;

    public pnw(String str, f5q f5qVar) {
        str.getClass();
        f5qVar.getClass();
        this.a = str;
        this.b = f5qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnw)) {
            return false;
        }
        pnw pnwVar = (pnw) obj;
        return Intrinsics.d(this.a, pnwVar.a) && Intrinsics.d(this.b, pnwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YnisonQueueStartInfo(initialDescription=" + this.a + ", playbackEntity=" + this.b + ")";
    }
}
