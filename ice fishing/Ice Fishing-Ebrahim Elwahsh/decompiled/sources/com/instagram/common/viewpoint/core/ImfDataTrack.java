package com.instagram.common.viewpoint.core;

import com.anythink.basead.b.b.j;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\r\u000eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack;", "", "mTrackName", "", "mStartTime", "", "mEndTime", "mStickerTrackType", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;", "mSegmentMetadata", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$SegmentMetadata;", "<init>", "(Ljava/lang/String;JJLcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$SegmentMetadata;)V", "StickerTrackType", "SegmentMetadata", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = j.f5973W)
/* renamed from: com.facebook.ads.redexgen.X.j8, reason: from Kotlin metadata */
/* loaded from: assets/audience_network/classes2.dex */
public final class ImfDataTrack {
    public static byte[] A05;
    public final long A00;
    public final long A01;
    public final C1980j6 A02;
    public final C1981j7 A03;
    public final String A04;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{72, 118, c.f16475b, 66, 72, c.f16475b, 75, 81, 104, c.f16475b, 81, 68, 65, 68, 81, 68, 92, 98, 69, 88, 82, 90, 84, 67, 101, 67, 80, 82, 90, 101, 72, 65, 84, 29, 36, 2, 17, 19, 27, 62, 17, 29, 21};
    }

    public ImfDataTrack(String str, long j9, long j10, C1981j7 c1981j7, C1980j6 c1980j6) {
        C2413qY.A09(str, A00(33, 10, 89));
        C2413qY.A09(c1981j7, A00(16, 17, 24));
        C2413qY.A09(c1980j6, A00(0, 16, 12));
        this.A04 = str;
        this.A01 = j9;
        this.A00 = j10;
        this.A03 = c1981j7;
        this.A02 = c1980j6;
    }
}
