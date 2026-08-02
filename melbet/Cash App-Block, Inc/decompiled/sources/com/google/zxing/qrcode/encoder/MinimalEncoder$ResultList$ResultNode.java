package com.google.zxing.qrcode.encoder;

import com.google.common.base.Splitter;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.Mode;
import com.miteksystems.misnap.camera.a.n;

/* loaded from: classes4.dex */
public final class MinimalEncoder$ResultList$ResultNode {
    public final int characterLength;
    public final int charsetEncoderIndex;
    public final int fromPosition;
    public final Mode mode;
    public final /* synthetic */ n this$1;

    public MinimalEncoder$ResultList$ResultNode(n nVar, Mode mode, int i, int i2, int i3) {
        this.this$1 = nVar;
        this.mode = mode;
        this.fromPosition = i;
        this.charsetEncoderIndex = i2;
        this.characterLength = i3;
    }

    public final int getCharacterCountIndicator() {
        Mode mode = this.mode;
        Mode mode2 = Mode.BYTE;
        int i = this.characterLength;
        if (mode != mode2) {
            return i;
        }
        Splitter splitter = (Splitter) this.this$1.c;
        ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) splitter.strategy;
        String str = (String) splitter.trimmer;
        int i2 = this.fromPosition;
        return str.substring(i2, i + i2).getBytes(eCIEncoderSet.encoders[this.charsetEncoderIndex].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Mode mode = this.mode;
        sb.append(mode);
        sb.append('(');
        Splitter splitter = (Splitter) this.this$1.c;
        if (mode == Mode.ECI) {
            ECIEncoderSet eCIEncoderSet = (ECIEncoderSet) splitter.strategy;
            sb.append(eCIEncoderSet.encoders[this.charsetEncoderIndex].charset().displayName());
        } else {
            String str = (String) splitter.trimmer;
            int i = this.characterLength;
            int i2 = this.fromPosition;
            String substring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < substring.length(); i3++) {
                if (substring.charAt(i3) < ' ' || substring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(substring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
