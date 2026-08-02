package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public class OP extends AbstractC3911sN {

    /* renamed from: n, reason: collision with root package name */
    public final int f27386n;

    public OP(IllegalStateException illegalStateException, PP pp) {
        super("Decoder failed: ".concat(String.valueOf(pp == null ? null : pp.f27597a)), illegalStateException);
        boolean z6 = illegalStateException instanceof MediaCodec.CodecException;
        if (z6) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f27386n = z6 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
