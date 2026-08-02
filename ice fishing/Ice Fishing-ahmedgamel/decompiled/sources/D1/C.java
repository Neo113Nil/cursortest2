package D1;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class C implements w1.w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f519n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f520u;

    public /* synthetic */ C(int i, Object obj) {
        this.f519n = i;
        this.f520u = obj;
    }

    @Override // w1.w
    public final void a() {
        switch (this.f519n) {
            case 2:
                ((AnimatedImageDrawable) this.f520u).stop();
                ((AnimatedImageDrawable) this.f520u).clearAnimationCallbacks();
                break;
        }
    }

    @Override // w1.w
    public final int b() {
        int intrinsicWidth;
        int intrinsicHeight;
        switch (this.f519n) {
            case 0:
                return P1.p.c((Bitmap) this.f520u);
            case 1:
                return ((byte[]) this.f520u).length;
            case 2:
                intrinsicWidth = ((AnimatedImageDrawable) this.f520u).getIntrinsicWidth();
                intrinsicHeight = ((AnimatedImageDrawable) this.f520u).getIntrinsicHeight();
                return P1.p.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            default:
                return 1;
        }
    }

    @Override // w1.w
    public final Class c() {
        switch (this.f519n) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f520u).getClass();
        }
    }

    @Override // w1.w
    public final Object get() {
        switch (this.f519n) {
            case 0:
                return (Bitmap) this.f520u;
            case 1:
                return (byte[]) this.f520u;
            case 2:
                return (AnimatedImageDrawable) this.f520u;
            default:
                return (File) this.f520u;
        }
    }

    public C(byte[] bArr) {
        this.f519n = 1;
        P1.g.c(bArr, "Argument must not be null");
        this.f520u = bArr;
    }

    public C(File file) {
        this.f519n = 3;
        P1.g.c(file, "Argument must not be null");
        this.f520u = file;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
