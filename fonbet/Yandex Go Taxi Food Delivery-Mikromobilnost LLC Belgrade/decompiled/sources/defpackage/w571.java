package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class w571 implements ul81 {
    public static MediaCodec b(si81 si81Var) {
        si81Var.a.getClass();
        String str = si81Var.a.a;
        dda1.i("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        dda1.h();
        return createByCodecName;
    }

    @Override // defpackage.ul81
    public final ss81 a(si81 si81Var) {
        MediaCodec mediaCodec;
        Throwable e;
        try {
            mediaCodec = b(si81Var);
        } catch (IOException | RuntimeException e2) {
            mediaCodec = null;
            e = e2;
        }
        try {
            dda1.i("configureCodec");
            mediaCodec.configure(si81Var.b, si81Var.d, (MediaCrypto) null, 0);
            dda1.h();
            dda1.i("startCodec");
            mediaCodec.start();
            dda1.h();
            return new mj31(mediaCodec);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
