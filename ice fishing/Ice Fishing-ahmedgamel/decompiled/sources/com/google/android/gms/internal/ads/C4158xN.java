package com.google.android.gms.internal.ads;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.xN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4158xN {

    /* renamed from: a, reason: collision with root package name */
    public int f34993a;

    /* renamed from: b, reason: collision with root package name */
    public int f34994b;

    /* renamed from: c, reason: collision with root package name */
    public int f34995c;

    /* renamed from: d, reason: collision with root package name */
    public int f34996d;

    /* renamed from: e, reason: collision with root package name */
    public int f34997e;

    /* renamed from: f, reason: collision with root package name */
    public int f34998f;

    /* renamed from: g, reason: collision with root package name */
    public int f34999g;

    /* renamed from: h, reason: collision with root package name */
    public int f35000h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f35001j;

    /* renamed from: k, reason: collision with root package name */
    public long f35002k;

    /* renamed from: l, reason: collision with root package name */
    public int f35003l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i = this.f34993a;
        int i6 = this.f34994b;
        int i9 = this.f34995c;
        int i10 = this.f34996d;
        int i11 = this.f34997e;
        int i12 = this.f34998f;
        int i13 = this.f34999g;
        int i14 = this.f35000h;
        int i15 = this.i;
        int i16 = this.f35001j;
        long j6 = this.f35002k;
        int i17 = this.f35003l;
        String str = AbstractC3159eu.f29993a;
        Locale locale = Locale.US;
        StringBuilder h9 = AbstractC4404f.h(i, i6, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        h9.append(i9);
        h9.append("\n skippedInputBuffers=");
        h9.append(i10);
        h9.append("\n renderedOutputBuffers=");
        h9.append(i11);
        h9.append("\n skippedOutputBuffers=");
        h9.append(i12);
        h9.append("\n droppedBuffers=");
        h9.append(i13);
        h9.append("\n droppedInputBuffers=");
        h9.append(i14);
        h9.append("\n maxConsecutiveDroppedBuffers=");
        h9.append(i15);
        h9.append("\n droppedToKeyframeEvents=");
        h9.append(i16);
        h9.append("\n totalVideoFrameProcessingOffsetUs=");
        h9.append(j6);
        h9.append("\n videoFrameProcessingOffsetCount=");
        h9.append(i17);
        h9.append("\n}");
        return h9.toString();
    }
}
