package com.google.zxing.qrcode.encoder;

import com.google.common.base.Splitter;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

/* loaded from: classes4.dex */
public final class MinimalEncoder$Edge {
    public final int cachedTotalSize;
    public final int characterLength;
    public final int charsetEncoderIndex;
    public final int fromPosition;
    public final Mode mode;
    public final MinimalEncoder$Edge previous;

    public MinimalEncoder$Edge(Splitter splitter, Mode mode, int i, int i2, int i3, MinimalEncoder$Edge minimalEncoder$Edge, Version version) {
        this.mode = mode;
        this.fromPosition = i;
        Mode mode2 = Mode.BYTE;
        int i4 = (mode == mode2 || minimalEncoder$Edge == null) ? i2 : minimalEncoder$Edge.charsetEncoderIndex;
        this.charsetEncoderIndex = i4;
        this.characterLength = i3;
        this.previous = minimalEncoder$Edge;
        boolean z = false;
        int i5 = minimalEncoder$Edge != null ? minimalEncoder$Edge.cachedTotalSize : 0;
        if ((mode == mode2 && minimalEncoder$Edge == null && i4 != 0) || (minimalEncoder$Edge != null && i4 != minimalEncoder$Edge.charsetEncoderIndex)) {
            z = true;
        }
        i5 = (minimalEncoder$Edge == null || mode != minimalEncoder$Edge.mode || z) ? i5 + mode.getCharacterCountBits(version) + 4 : i5;
        int ordinal = mode.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i5 += i3 != 1 ? 11 : 6;
            } else if (ordinal == 4) {
                i5 += ((String) splitter.trimmer).substring(i, i3 + i).getBytes(((ECIEncoderSet) splitter.strategy).encoders[i2].charset()).length * 8;
                if (z) {
                    i5 += 12;
                }
            } else if (ordinal == 6) {
                i5 += 13;
            }
        } else {
            i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.cachedTotalSize = i5;
    }
}
