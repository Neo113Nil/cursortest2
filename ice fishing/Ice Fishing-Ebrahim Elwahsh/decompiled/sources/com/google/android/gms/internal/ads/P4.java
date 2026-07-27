package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class P4 {

    /* renamed from: a, reason: collision with root package name */
    public long f26834a;

    /* renamed from: b, reason: collision with root package name */
    public long f26835b;

    /* renamed from: c, reason: collision with root package name */
    public long f26836c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26837d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f26838e;

    public /* synthetic */ P4(ByteBuffer byteBuffer, long j9, long j10, long j11, ByteBuffer byteBuffer2) {
        this.f26837d = byteBuffer;
        this.f26834a = j9;
        this.f26835b = j10;
        this.f26836c = j11;
        this.f26838e = byteBuffer2;
    }

    public P4(AudioTrack audioTrack) {
        this.f26837d = audioTrack;
        this.f26838e = new AudioTimestamp();
    }
}
