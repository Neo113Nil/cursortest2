package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.xN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4181xN {

    /* renamed from: a, reason: collision with root package name */
    public int f35774a;

    /* renamed from: b, reason: collision with root package name */
    public int f35775b;

    /* renamed from: c, reason: collision with root package name */
    public int f35776c;

    /* renamed from: d, reason: collision with root package name */
    public int f35777d;

    /* renamed from: e, reason: collision with root package name */
    public int f35778e;

    /* renamed from: f, reason: collision with root package name */
    public int f35779f;

    /* renamed from: g, reason: collision with root package name */
    public int f35780g;

    /* renamed from: h, reason: collision with root package name */
    public int f35781h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f35782j;

    /* renamed from: k, reason: collision with root package name */
    public long f35783k;

    /* renamed from: l, reason: collision with root package name */
    public int f35784l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i = this.f35774a;
        int i4 = this.f35775b;
        int i6 = this.f35776c;
        int i9 = this.f35777d;
        int i10 = this.f35778e;
        int i11 = this.f35779f;
        int i12 = this.f35780g;
        int i13 = this.f35781h;
        int i14 = this.i;
        int i15 = this.f35782j;
        long j6 = this.f35783k;
        int i16 = this.f35784l;
        String str = AbstractC3182eu.f30782a;
        Locale locale = Locale.US;
        StringBuilder j9 = Wv.j(i, i4, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        j9.append(i6);
        j9.append("\n skippedInputBuffers=");
        j9.append(i9);
        j9.append("\n renderedOutputBuffers=");
        j9.append(i10);
        j9.append("\n skippedOutputBuffers=");
        j9.append(i11);
        j9.append("\n droppedBuffers=");
        j9.append(i12);
        j9.append("\n droppedInputBuffers=");
        j9.append(i13);
        j9.append("\n maxConsecutiveDroppedBuffers=");
        j9.append(i14);
        j9.append("\n droppedToKeyframeEvents=");
        j9.append(i15);
        j9.append("\n totalVideoFrameProcessingOffsetUs=");
        j9.append(j6);
        j9.append("\n videoFrameProcessingOffsetCount=");
        j9.append(i16);
        j9.append("\n}");
        return j9.toString();
    }
}
