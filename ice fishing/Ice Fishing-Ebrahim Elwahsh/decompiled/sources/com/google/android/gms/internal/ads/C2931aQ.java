package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.aQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2931aQ extends GN {

    /* renamed from: n, reason: collision with root package name */
    public final int f29206n;

    public C2931aQ(IllegalStateException illegalStateException, C2986bQ c2986bQ) {
        super("Decoder failed: ".concat(String.valueOf(c2986bQ == null ? null : c2986bQ.f29490a)), illegalStateException);
        boolean z8 = illegalStateException instanceof MediaCodec.CodecException;
        if (z8) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f29206n = z8 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
