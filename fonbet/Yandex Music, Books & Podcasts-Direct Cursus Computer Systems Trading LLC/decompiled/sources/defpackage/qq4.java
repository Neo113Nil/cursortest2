package defpackage;

import androidx.media3.exoplayer.mediacodec.RecoverType;

/* loaded from: classes.dex */
public final class qq4 {
    public static final qq4 c = new qq4(0, RecoverType.DEFAULT);
    public final int a;
    public final RecoverType b;

    public qq4(int i, RecoverType recoverType) {
        recoverType.getClass();
        this.a = i;
        this.b = recoverType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq4)) {
            return false;
        }
        qq4 qq4Var = (qq4) obj;
        return this.a == qq4Var.a && this.b == qq4Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CodecErrorRecoverOptions(maxRecoverAttempts=" + this.a + ", recoverType=" + this.b + ')';
    }
}
