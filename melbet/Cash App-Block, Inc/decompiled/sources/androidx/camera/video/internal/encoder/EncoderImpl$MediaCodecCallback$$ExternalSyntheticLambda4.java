package androidx.camera.video.internal.encoder;

/* loaded from: classes3.dex */
public final /* synthetic */ class EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EncoderCallback f$0;

    public /* synthetic */ EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4(EncoderCallback encoderCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = encoderCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        EncoderCallback encoderCallback = this.f$0;
        switch (i) {
            case 0:
                encoderCallback.getClass();
                break;
            default:
                encoderCallback.onEncodeStop();
                break;
        }
    }
}
