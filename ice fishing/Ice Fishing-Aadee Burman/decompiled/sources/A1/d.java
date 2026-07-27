package A1;

import B1.n;
import B1.p;
import B1.y;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import s1.EnumC4966a;
import s1.g;
import s1.h;
import s1.i;

/* loaded from: classes.dex */
public final class d implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final y f11a = y.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f12b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC4966a f14d;

    /* renamed from: e, reason: collision with root package name */
    public final n f15e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16f;

    /* renamed from: g, reason: collision with root package name */
    public final i f17g;

    public d(int i, int i6, h hVar) {
        this.f12b = i;
        this.f13c = i6;
        this.f14d = (EnumC4966a) hVar.c(p.f145f);
        this.f15e = (n) hVar.c(n.f142g);
        g gVar = p.i;
        this.f16f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f17g = (i) hVar.c(p.f146g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        ColorSpace.Named unused;
        if (this.f11a.c(this.f12b, this.f13c, this.f16f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f14d == EnumC4966a.f40444u) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new c());
        size = imageInfo.getSize();
        int i = this.f12b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i6 = this.f13c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = size.getHeight();
        }
        float b9 = this.f15e.b(size.getWidth(), size.getHeight(), i, i6);
        int round = Math.round(size.getWidth() * b9);
        int round2 = Math.round(size.getHeight() * b9);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b9);
        }
        imageDecoder.setTargetSize(round, round2);
        i iVar = this.f17g;
        if (iVar != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 28) {
                if (i9 >= 26) {
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (iVar == i.f40455n) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named);
                        imageDecoder.setTargetColorSpace(colorSpace2);
                    }
                }
            }
            named = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}
