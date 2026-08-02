package androidx.media3.decoder;

import android.media.MediaCodec;
import app.cash.zipline.CallResult;

/* loaded from: classes3.dex */
public final class CryptoInfo {
    public int clearBlocks;
    public int encryptedBlocks;
    public final MediaCodec.CryptoInfo frameworkCryptoInfo;
    public byte[] iv;
    public byte[] key;
    public int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;
    public final CallResult patternHolder;

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.frameworkCryptoInfo = cryptoInfo;
        CallResult callResult = new CallResult();
        callResult.result = cryptoInfo;
        callResult.serviceNames = new MediaCodec.CryptoInfo.Pattern(0, 0);
        this.patternHolder = callResult;
    }
}
