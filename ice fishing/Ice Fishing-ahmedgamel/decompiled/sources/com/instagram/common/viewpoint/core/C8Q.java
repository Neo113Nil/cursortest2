package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.8Q, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8Q {
    public static final AudioAttributes A00 = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i, int i6) {
        for (int i9 = 8; i9 > 0; i9--) {
            AudioFormat.Builder sampleRate = new AudioFormat.Builder().setEncoding(i).setSampleRate(i6);
            int channelCount = C5C.A01(i9);
            AudioFormat audioFormat = sampleRate.setChannelMask(channelCount).build();
            if (AudioTrack.isDirectPlaybackSupported(audioFormat, A00)) {
                return i9;
            }
        }
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public static int[] A01() {
        AbstractC2292oX abstractC2292oX;
        C2K A01 = BP.A01();
        abstractC2292oX = C8R.A06;
        C4C it = abstractC2292oX.keySet().iterator();
        while (it.hasNext()) {
            int encoding = ((Integer) it.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(encoding).setSampleRate(48000).build(), A00)) {
                A01.A04(Integer.valueOf(encoding));
            }
        }
        A01.A04(2);
        return AbstractC0784As.A0B(A01.A05());
    }
}
