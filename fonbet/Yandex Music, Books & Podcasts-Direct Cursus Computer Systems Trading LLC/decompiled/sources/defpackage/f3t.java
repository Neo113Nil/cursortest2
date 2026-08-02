package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class f3t {
    public final vcu a;
    public final sy1 b;
    public final zpr c;
    public final jg7 d;
    public final jg7 e;

    public f3t(vcu vcuVar, sy1 sy1Var, zpr zprVar, jg7 jg7Var, jg7 jg7Var2) {
        this.a = vcuVar;
        this.b = sy1Var;
        this.c = zprVar;
        this.d = jg7Var;
        this.e = jg7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3t)) {
            return false;
        }
        f3t f3tVar = (f3t) obj;
        return Intrinsics.d(this.a, f3tVar.a) && Intrinsics.d(this.b, f3tVar.b) && Intrinsics.d(this.c, f3tVar.c) && Intrinsics.d(this.d, f3tVar.d) && Intrinsics.d(this.e, f3tVar.e);
    }

    public final int hashCode() {
        vcu vcuVar = this.a;
        int hashCode = (vcuVar == null ? 0 : vcuVar.hashCode()) * 31;
        sy1 sy1Var = this.b;
        int hashCode2 = (hashCode + (sy1Var == null ? 0 : sy1Var.hashCode())) * 31;
        zpr zprVar = this.c;
        int hashCode3 = (hashCode2 + (zprVar == null ? 0 : zprVar.hashCode())) * 31;
        jg7 jg7Var = this.d;
        int hashCode4 = (hashCode3 + (jg7Var == null ? 0 : jg7Var.hashCode())) * 31;
        jg7 jg7Var2 = this.e;
        return hashCode4 + (jg7Var2 != null ? jg7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "TracksAndDecoders(videoTrackData=" + this.a + ", audioTrackData=" + this.b + ", subtitlesTrackData=" + this.c + ", videoDecoderData=" + this.d + ", audioDecoderData=" + this.e + ')';
    }
}
