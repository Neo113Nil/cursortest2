package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;

/* loaded from: classes3.dex */
public final class fw1 {
    public final fkn a;

    public fw1(Context context) {
        dq7 dq7Var = ca8.a;
        this.a = zsd.F0(zsd.I(new k3(context, this, null, 20)), gld.e(j5h.a), new hdr(0L, Long.MAX_VALUE), q5b.a);
    }

    public static final nx1 a(fw1 fw1Var, AudioDeviceInfo audioDeviceInfo) {
        if (!audioDeviceInfo.isSink()) {
            return null;
        }
        int type = audioDeviceInfo.getType();
        if (type != 3 && type != 4) {
            if (type != 8) {
                if (type != 19) {
                    if (type != 27) {
                        if (type == 11 || type == 12 || type == 22) {
                            return new lx1(audioDeviceInfo.getProductName().toString());
                        }
                        if (type != 23) {
                            return null;
                        }
                    }
                }
            }
            return new jx1(audioDeviceInfo.getProductName().toString());
        }
        return ogp.b;
    }
}
