package defpackage;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class lih extends og7 {
    public final mih a;
    public final String b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lih(RuntimeException runtimeException, mih mihVar) {
        super(r0.toString(), runtimeException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(mihVar == null ? null : mihVar.a);
        this.a = mihVar;
        boolean z = runtimeException instanceof MediaCodec.CodecException;
        String diagnosticInfo = z ? ((MediaCodec.CodecException) runtimeException).getDiagnosticInfo() : null;
        this.b = diagnosticInfo;
        this.c = dvt.a >= 23 ? z ? ((MediaCodec.CodecException) runtimeException).getErrorCode() : 0 : dvt.E(diagnosticInfo);
    }
}
