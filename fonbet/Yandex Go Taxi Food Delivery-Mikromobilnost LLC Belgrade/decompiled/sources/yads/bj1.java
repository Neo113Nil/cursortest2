package yads;

import android.media.MediaCodec;
import defpackage.aq61;
import defpackage.rf71;

/* loaded from: classes7.dex */
public class bj1 extends sa0 {
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bj1(IllegalStateException illegalStateException, aq61 aq61Var) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String str = null;
        sb.append(aq61Var == null ? null : aq61Var.a);
        if (rf71.a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.b = str;
    }
}
