package defpackage;

import androidx.camera.video.internal.encoder.InvalidConfigException;

/* loaded from: classes10.dex */
public final /* synthetic */ class sl31 {
    public static rl31 a(String str) {
        try {
            return ul31.a(new tl31(cac.a(str), str), null);
        } catch (InvalidConfigException unused) {
            sgb1.g(5, "VideoEncoderInfoImpl");
            return null;
        }
    }
}
