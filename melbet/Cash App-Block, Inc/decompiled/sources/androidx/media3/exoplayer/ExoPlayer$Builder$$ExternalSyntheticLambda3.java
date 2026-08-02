package androidx.media3.exoplayer;

import android.util.Base64;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import com.google.common.base.Supplier;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda3 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return new DefaultLoadControl();
            case 1:
                byte[] bArr = new byte[12];
                DefaultPlaybackSessionManager.RANDOM.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    OptionalProvider$$ExternalSyntheticLambda0.m(e);
                    return null;
                }
        }
    }
}
