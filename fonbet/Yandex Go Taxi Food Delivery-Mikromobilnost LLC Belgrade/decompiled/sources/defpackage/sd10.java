package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class sd10 {
    public static void a(MediaFormat mediaFormat, kfc kfcVar) {
        if (kfcVar != null) {
            b(mediaFormat, "color-transfer", kfcVar.c);
            b(mediaFormat, "color-standard", kfcVar.a);
            b(mediaFormat, "color-range", kfcVar.b);
            byte[] bArr = kfcVar.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void b(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void c(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(oyr.i(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
