package defpackage;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class z291 implements jv81 {
    @Override // defpackage.jv81
    public final Drawable a(Context context, byte[] bArr) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(ByteBuffer.wrap(bArr)));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            ((AnimatedImageDrawable) decodeDrawable).start();
        }
        return decodeDrawable;
    }
}
