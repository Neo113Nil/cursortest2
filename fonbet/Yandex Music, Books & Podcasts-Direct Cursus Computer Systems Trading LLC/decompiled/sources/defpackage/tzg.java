package defpackage;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class tzg implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ uzg a;

    public tzg(uzg uzgVar) {
        this.a = uzgVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.a.b.getClass();
        return bundle;
    }
}
