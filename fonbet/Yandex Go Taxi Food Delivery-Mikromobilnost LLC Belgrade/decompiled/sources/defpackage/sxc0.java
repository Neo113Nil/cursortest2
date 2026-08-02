package defpackage;

import androidx.media3.common.VideoFrameProcessingException;

/* loaded from: classes10.dex */
public final class sxc0 {
    public final rxc0 a;

    public sxc0(rxc0 rxc0Var) {
        this.a = rxc0Var;
    }

    public final void a() {
        try {
            ((sxc0) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(rxc0.class).newInstance(this.a)).a();
        } catch (Exception e) {
            if (!(e instanceof VideoFrameProcessingException)) {
                throw new VideoFrameProcessingException(e);
            }
            int i = VideoFrameProcessingException.a;
        }
    }
}
