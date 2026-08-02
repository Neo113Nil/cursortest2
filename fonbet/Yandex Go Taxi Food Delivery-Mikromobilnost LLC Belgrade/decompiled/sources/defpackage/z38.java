package defpackage;

import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;

/* loaded from: classes10.dex */
public final class z38 {
    public final ImageWriter b;
    public final tis0 c;
    public final Surface e;
    public final boolean f;
    public final boolean g;
    public final Object a = new Object();
    public boolean d = false;
    public long h = -1;

    public z38(Surface surface, Size size, boolean z) {
        this.g = z;
        boolean z2 = ubj.a.b(CaptureOutputSurfaceOccupiedQuirk.class) != null || z;
        this.f = z2;
        if (!z2) {
            this.e = surface;
            this.c = null;
            this.b = null;
        } else {
            sgb1.g(3, "CaptureOutputSurface");
            tis0 a = c5b1.a(size.getWidth(), size.getHeight(), 35, 2);
            this.c = a;
            this.e = a.getSurface();
            this.b = ImageWriter.newInstance(surface, 2, 35);
            a.u(new m6(29, this), geb1.b());
        }
    }
}
