package com.instagram.common.viewpoint.core;

import com.anythink.basead.b.b.j;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/NoOpMediaCodecPoolTracker;", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker;", "<init>", "()V", "reportCodecCreated", "", "creatingEvent", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$CreatingEvent;", "codecInstanceId", "", "reportCodecReleasing", "source", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$Source;", "reportCodecReleased", "reportCodecAcquiredFromPool", "isVideo", "", "codecName", "", "reportCodecReturnedToPool", "Companion", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = j.f6602W)
/* renamed from: com.facebook.ads.redexgen.X.CD, reason: from Kotlin metadata */
/* loaded from: assets/audience_network/classes2.dex */
public final class NoOpMediaCodecPoolTracker extends MediaCodecPoolTracker {
    public static byte[] A00;
    public static final C2024jc A01;
    public static final NoOpMediaCodecPoolTracker A02;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{36, 40, 35, 34, 36, 9, 38, 42, 34, 9, 24, 15, 11, 30, 3, 4, 13, 47, 28, 15, 4, 30, 84, 72, 82, 85, 68, 66};
    }

    static {
        A01();
        A01 = new C2024jc(null);
        A02 = new NoOpMediaCodecPoolTracker();
    }

    @Override // com.instagram.common.viewpoint.core.MediaCodecPoolTracker
    public final void A06(C2011jJ c2011jJ, int i) {
        C2434qY.A09(c2011jJ, A00(9, 13, 123));
    }

    @Override // com.instagram.common.viewpoint.core.MediaCodecPoolTracker
    public final void A07(EnumC2013jL enumC2013jL, int i) {
        C2434qY.A09(enumC2013jL, A00(22, 6, 54));
    }

    @Override // com.instagram.common.viewpoint.core.MediaCodecPoolTracker
    public final void A08(EnumC2013jL enumC2013jL, int i) {
        C2434qY.A09(enumC2013jL, A00(22, 6, 54));
    }

    @Override // com.instagram.common.viewpoint.core.MediaCodecPoolTracker
    public final void A09(EnumC2013jL enumC2013jL, int i) {
        C2434qY.A09(enumC2013jL, A00(22, 6, 54));
    }

    @Override // com.instagram.common.viewpoint.core.MediaCodecPoolTracker
    public final void A0A(boolean z6, String str, EnumC2013jL enumC2013jL, int i) {
        C2434qY.A09(str, A00(0, 9, 86));
        C2434qY.A09(enumC2013jL, A00(22, 6, 54));
    }
}
