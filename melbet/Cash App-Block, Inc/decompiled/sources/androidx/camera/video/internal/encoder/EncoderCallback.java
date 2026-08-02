package androidx.camera.video.internal.encoder;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public interface EncoderCallback {
    public static final Transition.AnonymousClass1 EMPTY = new Transition.AnonymousClass1();

    void onEncodeError(EncodeException encodeException);

    void onEncodeStop();

    void onEncodedData(EncodedData encodedData);

    void onOutputConfigUpdate(StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1);
}
