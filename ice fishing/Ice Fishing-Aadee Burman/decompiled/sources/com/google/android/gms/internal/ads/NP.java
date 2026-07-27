package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public class NP extends AbstractC3888sN {

    /* renamed from: n, reason: collision with root package name */
    public final int f26489n;

    public NP(IllegalStateException illegalStateException, OP op) {
        super("Decoder failed: ".concat(String.valueOf(op == null ? null : op.f26604a)), illegalStateException);
        boolean z3 = illegalStateException instanceof MediaCodec.CodecException;
        if (z3) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f26489n = z3 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
