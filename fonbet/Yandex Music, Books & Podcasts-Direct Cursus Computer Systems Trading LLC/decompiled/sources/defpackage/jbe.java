package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jbe implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ xqn a;
    public final /* synthetic */ nbe b;
    public final /* synthetic */ tqn c;

    public jbe(xqn xqnVar, nbe nbeVar, tqn tqnVar) {
        this.a = xqnVar;
        this.b = nbeVar;
        this.c = tqnVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        this.a.a = imageDecoder;
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        rwj rwjVar = this.b.b;
        lmq lmqVar = rwjVar.d;
        nso nsoVar = rwjVar.e;
        lmq lmqVar2 = lmq.c;
        int x = Intrinsics.d(lmqVar, lmqVar2) ? width : woe.x(lmqVar.a, nsoVar);
        rwj rwjVar2 = this.b.b;
        lmq lmqVar3 = rwjVar2.d;
        int x2 = Intrinsics.d(lmqVar3, lmqVar2) ? height : woe.x(lmqVar3.b, rwjVar2.e);
        if (width > 0 && height > 0 && (width != x || height != x2)) {
            double s = vnj.s(width, height, x, x2, this.b.b.e);
            boolean z = s < 1.0d;
            this.c.a = z;
            if (z || !this.b.b.f) {
                imageDecoder.setTargetSize(eeh.a(width * s), eeh.a(s * height));
            }
        }
        rwj rwjVar3 = this.b.b;
        imageDecoder.setAllocator(woe.o(rwjVar3.b) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!rwjVar3.g ? 1 : 0);
        ColorSpace colorSpace = rwjVar3.c;
        if (colorSpace != null) {
            imageDecoder.setTargetColorSpace(colorSpace);
        }
        imageDecoder.setUnpremultipliedRequired(!rwjVar3.h);
        if (rwjVar3.l.a("coil#animated_transformation") == null) {
            imageDecoder.setPostProcessor(null);
        } else {
            l1j.f();
        }
    }
}
