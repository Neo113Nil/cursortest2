package defpackage;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class tl31 extends x3 implements rl31 {
    public static final sl31 w = new sl31();
    public final MediaCodecInfo.VideoCapabilities c;

    public tl31(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.c = videoCapabilities;
    }

    @Override // defpackage.rl31
    public final Range B0(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // defpackage.rl31
    public final int Hc() {
        return this.c.getWidthAlignment();
    }

    @Override // defpackage.rl31
    public final Range N3(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // defpackage.rl31
    public final boolean Nb(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    @Override // defpackage.rl31
    public final Range Q2() {
        return this.c.getBitrateRange();
    }

    @Override // defpackage.rl31
    public final int a8() {
        return this.c.getHeightAlignment();
    }

    @Override // defpackage.rl31
    public final boolean p6() {
        return true;
    }

    @Override // defpackage.rl31
    public final Range q4() {
        return this.c.getSupportedWidths();
    }

    @Override // defpackage.rl31
    public final Range s5() {
        return this.c.getSupportedHeights();
    }
}
