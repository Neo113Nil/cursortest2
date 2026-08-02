package defpackage;

import android.media.MediaCodec;

/* loaded from: classes10.dex */
public final class tcf {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b;

    public tcf(int i, MediaCodec.CryptoInfo cryptoInfo) {
        switch (i) {
            case 1:
                this.a = cryptoInfo;
                this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
                break;
            default:
                this.a = cryptoInfo;
                this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
                break;
        }
    }
}
