package defpackage;

import androidx.media3.exoplayer.mediacodec.RecoverType;

/* loaded from: classes10.dex */
public final class z9c {
    public static final z9c c = new z9c(0, RecoverType.DEFAULT);
    public final int a;
    public final RecoverType b;

    public z9c(int i, RecoverType recoverType) {
        this.a = i;
        this.b = recoverType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9c)) {
            return false;
        }
        z9c z9cVar = (z9c) obj;
        return this.a == z9cVar.a && this.b == z9cVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CodecErrorRecoverOptions(maxRecoverAttempts=" + this.a + ", recoverType=" + this.b + ')';
    }
}
