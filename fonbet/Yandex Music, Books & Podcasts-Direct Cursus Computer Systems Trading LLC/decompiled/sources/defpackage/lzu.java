package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class lzu implements l7q {
    public final String a;
    public final oyu b;

    public lzu(String str, oyu oyuVar) {
        oyuVar.getClass();
        this.a = str;
        this.b = oyuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzu)) {
            return false;
        }
        lzu lzuVar = (lzu) obj;
        return Intrinsics.d(this.a, lzuVar.a) && Intrinsics.d(this.b, lzuVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "WaveQueueStartInfo(initialDescription=" + this.a + ", contentStartId=" + this.b + ")";
    }
}
