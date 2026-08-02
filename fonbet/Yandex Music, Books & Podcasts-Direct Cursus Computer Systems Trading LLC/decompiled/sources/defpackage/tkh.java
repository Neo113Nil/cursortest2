package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;

/* loaded from: classes.dex */
public class tkh extends w1g {
    public final MediaController.TransportControls a;

    public tkh(MediaController.TransportControls transportControls) {
        this.a = transportControls;
    }

    public final void T(Bundle bundle, String str) {
        if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
            xq0.x(hrg.q("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        } else {
            this.a.sendCustomAction(str, bundle);
        }
    }

    public void U(float f) {
        if (f == 0.0f) {
            xq0.x("speed must not be zero");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
        T(bundle, "android.support.v4.media.session.action.SET_PLAYBACK_SPEED");
    }
}
