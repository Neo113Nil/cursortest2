package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_common.zziv;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class xzv {
    public volatile Bitmap a;
    public volatile ByteBuffer b;
    public volatile lm71 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Matrix h;

    public xzv(ByteBuffer byteBuffer, int i, int i2, int i3) {
        cvw.l(byteBuffer);
        this.b = byteBuffer;
        cvw.d("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
        byteBuffer.rewind();
        this.d = i;
        this.e = i2;
        b(i3);
        this.f = i3;
        this.g = 17;
        this.h = null;
    }

    public static void b(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        cvw.d("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
    }

    public static xzv c(Image image, int i, Matrix matrix) {
        int limit;
        xzv xzvVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cvw.m(image, "Please provide a valid image");
        b(i);
        cvw.d("Only JPEG and YUV_420_888 are supported now", image.getFormat() == 256 || image.getFormat() == 35);
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            cvw.d("Only JPEG is supported now", image.getFormat() == 256);
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                ny61.g("Unexpected image format, JPEG should have exactly 1 image plane");
                return null;
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            xzvVar = new xzv(i4b1.h(decodeByteArray, i, decodeByteArray.getWidth(), decodeByteArray.getHeight()));
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            xzv xzvVar2 = new xzv(image, image.getWidth(), image.getHeight(), i, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
            xzvVar = xzvVar2;
        }
        o1b1.d().a(new t1b1(image.getFormat(), 5, limit, image.getHeight(), image.getWidth(), SystemClock.elapsedRealtime() - elapsedRealtime, i), zziv.INPUT_IMAGE_CONSTRUCTION);
        return xzvVar;
    }

    public final Image.Plane[] a() {
        if (this.c == null) {
            return null;
        }
        return ((Image) this.c.b).getPlanes();
    }

    public xzv(Image image, int i, int i2, int i3, Matrix matrix) {
        cvw.l(image);
        this.c = new lm71(21, image);
        this.d = i;
        this.e = i2;
        b(i3);
        this.f = i3;
        this.g = 35;
        this.h = matrix;
    }

    public xzv(Bitmap bitmap) {
        cvw.l(bitmap);
        this.a = bitmap;
        this.d = bitmap.getWidth();
        this.e = bitmap.getHeight();
        b(0);
        this.f = 0;
        this.g = -1;
        this.h = null;
    }
}
