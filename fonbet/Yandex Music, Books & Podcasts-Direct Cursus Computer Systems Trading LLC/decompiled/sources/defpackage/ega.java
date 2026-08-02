package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ega {
    public final uga a;
    public final String b;

    public ega(uga ugaVar, String str) {
        str.getClass();
        this.a = ugaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ega)) {
            return false;
        }
        ega egaVar = (ega) obj;
        return this.a.equals(egaVar.a) && Intrinsics.d(this.b, egaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadedPlaylistId(user=" + this.a + ", kind=" + this.b + ")";
    }
}
