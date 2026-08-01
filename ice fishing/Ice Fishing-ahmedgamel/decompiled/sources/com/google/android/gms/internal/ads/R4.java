package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class R4 {

    /* renamed from: a, reason: collision with root package name */
    public long f27167a;

    /* renamed from: b, reason: collision with root package name */
    public long f27168b;

    /* renamed from: c, reason: collision with root package name */
    public long f27169c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27170d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f27171e;

    public /* synthetic */ R4(ByteBuffer byteBuffer, long j6, long j9, long j10, ByteBuffer byteBuffer2) {
        this.f27170d = byteBuffer;
        this.f27167a = j6;
        this.f27168b = j9;
        this.f27169c = j10;
        this.f27171e = byteBuffer2;
    }

    public R4(AudioTrack audioTrack) {
        this.f27170d = audioTrack;
        this.f27171e = new AudioTimestamp();
    }
}
