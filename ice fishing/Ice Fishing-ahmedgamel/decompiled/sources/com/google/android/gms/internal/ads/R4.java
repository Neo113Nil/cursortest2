package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class R4 {

    /* renamed from: a, reason: collision with root package name */
    public long f27923a;

    /* renamed from: b, reason: collision with root package name */
    public long f27924b;

    /* renamed from: c, reason: collision with root package name */
    public long f27925c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27926d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f27927e;

    public /* synthetic */ R4(ByteBuffer byteBuffer, long j6, long j9, long j10, ByteBuffer byteBuffer2) {
        this.f27926d = byteBuffer;
        this.f27923a = j6;
        this.f27924b = j9;
        this.f27925c = j10;
        this.f27927e = byteBuffer2;
    }

    public R4(AudioTrack audioTrack) {
        this.f27926d = audioTrack;
        this.f27927e = new AudioTimestamp();
    }
}
