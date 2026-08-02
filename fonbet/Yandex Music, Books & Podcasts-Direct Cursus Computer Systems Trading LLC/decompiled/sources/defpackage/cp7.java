package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* loaded from: classes.dex */
public final class cp7 implements ImageDecoder$OnHeaderDecodedListener {
    public final osd a = osd.a();
    public final int b;
    public final int c;
    public final vf7 d;
    public final wla e;
    public final boolean f;
    public final qmm g;

    public cp7(int i, int i2, pwj pwjVar) {
        this.b = i;
        this.c = i2;
        this.d = (vf7) pwjVar.c(zla.f);
        this.e = (wla) pwjVar.c(wla.g);
        cvj cvjVar = zla.i;
        this.f = pwjVar.c(cvjVar) != null && ((Boolean) pwjVar.c(cvjVar)).booleanValue();
        this.g = (qmm) pwjVar.c(zla.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        if (this.a.b(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == vf7.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new bp7());
        Size size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.e.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(size.getHeight() * b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
        }
        imageDecoder.setTargetSize(round, round2);
        qmm qmmVar = this.g;
        if (qmmVar != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((qmmVar == qmm.a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i3 >= 26) {
                named = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            }
        }
    }
}
