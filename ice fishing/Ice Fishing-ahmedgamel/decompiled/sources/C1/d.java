package C1;

import D1.n;
import D1.p;
import D1.x;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import u1.EnumC5062a;
import u1.g;
import u1.h;
import u1.i;

/* loaded from: classes.dex */
public final class d implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final x f310a = x.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f311b;

    /* renamed from: c, reason: collision with root package name */
    public final int f312c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC5062a f313d;

    /* renamed from: e, reason: collision with root package name */
    public final n f314e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f315f;

    /* renamed from: g, reason: collision with root package name */
    public final i f316g;

    public d(int i, int i4, h hVar) {
        this.f311b = i;
        this.f312c = i4;
        this.f313d = (EnumC5062a) hVar.c(p.f559f);
        this.f314e = (n) hVar.c(n.f556g);
        g gVar = p.i;
        this.f315f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f316g = (i) hVar.c(p.f560g);
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
        if (this.f310a.c(this.f311b, this.f312c, this.f315f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f313d == EnumC5062a.f41001u) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new c());
        size = imageInfo.getSize();
        int i = this.f311b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i4 = this.f312c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = size.getHeight();
        }
        float b9 = this.f314e.b(size.getWidth(), size.getHeight(), i, i4);
        int round = Math.round(size.getWidth() * b9);
        int round2 = Math.round(size.getHeight() * b9);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b9);
        }
        imageDecoder.setTargetSize(round, round2);
        i iVar = this.f316g;
        if (iVar != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 28) {
                if (i6 >= 26) {
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (iVar == i.f41012n) {
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
