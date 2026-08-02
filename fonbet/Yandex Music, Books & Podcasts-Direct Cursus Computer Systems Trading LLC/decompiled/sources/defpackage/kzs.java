package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kzs {
    public final String a;
    public final int b;

    public kzs(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzs)) {
            return false;
        }
        kzs kzsVar = (kzs) obj;
        return Intrinsics.d(this.a, kzsVar.a) && this.b == kzsVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackPlaybackSpeed(albumId=" + this.a + ", playbackSpeed=" + this.b + ")";
    }
}
