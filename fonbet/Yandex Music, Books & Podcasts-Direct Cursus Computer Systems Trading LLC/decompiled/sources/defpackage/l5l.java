package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l5l {
    public final String a;
    public final int b;

    public l5l(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5l)) {
            return false;
        }
        l5l l5lVar = (l5l) obj;
        return Intrinsics.d(this.a, l5lVar.a) && this.b == l5lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaybackSpeedDbRow(albumId=" + this.a + ", playbackSpeed=" + this.b + ")";
    }
}
