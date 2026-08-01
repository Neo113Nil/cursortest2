package B1;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class D implements u1.x {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f105n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f106u;

    public /* synthetic */ D(int i, Object obj) {
        this.f105n = i;
        this.f106u = obj;
    }

    @Override // u1.x
    public final void a() {
        switch (this.f105n) {
            case 2:
                ((AnimatedImageDrawable) this.f106u).stop();
                ((AnimatedImageDrawable) this.f106u).clearAnimationCallbacks();
                break;
        }
    }

    @Override // u1.x
    public final int c() {
        int intrinsicWidth;
        int intrinsicHeight;
        switch (this.f105n) {
            case 0:
                return N1.p.c((Bitmap) this.f106u);
            case 1:
                return ((byte[]) this.f106u).length;
            case 2:
                intrinsicWidth = ((AnimatedImageDrawable) this.f106u).getIntrinsicWidth();
                intrinsicHeight = ((AnimatedImageDrawable) this.f106u).getIntrinsicHeight();
                return N1.p.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            default:
                return 1;
        }
    }

    @Override // u1.x
    public final Class d() {
        switch (this.f105n) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f106u).getClass();
        }
    }

    @Override // u1.x
    public final Object get() {
        switch (this.f105n) {
            case 0:
                return (Bitmap) this.f106u;
            case 1:
                return (byte[]) this.f106u;
            case 2:
                return (AnimatedImageDrawable) this.f106u;
            default:
                return (File) this.f106u;
        }
    }

    public D(byte[] bArr) {
        this.f105n = 1;
        N1.g.c(bArr, "Argument must not be null");
        this.f106u = bArr;
    }

    public D(File file) {
        this.f105n = 3;
        N1.g.c(file, "Argument must not be null");
        this.f106u = file;
    }

    private final void b() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
