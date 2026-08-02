package D1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import x1.InterfaceC5183a;

/* renamed from: D1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299d implements w1.w, w1.t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f538n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f539u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f540v;

    public C0299d(Bitmap bitmap, InterfaceC5183a interfaceC5183a) {
        P1.g.c(bitmap, "Bitmap must not be null");
        this.f539u = bitmap;
        P1.g.c(interfaceC5183a, "BitmapPool must not be null");
        this.f540v = interfaceC5183a;
    }

    public static C0299d d(Bitmap bitmap, InterfaceC5183a interfaceC5183a) {
        if (bitmap == null) {
            return null;
        }
        return new C0299d(bitmap, interfaceC5183a);
    }

    @Override // w1.w
    public final void a() {
        switch (this.f538n) {
            case 0:
                ((InterfaceC5183a) this.f540v).b((Bitmap) this.f539u);
                break;
            default:
                ((w1.w) this.f540v).a();
                break;
        }
    }

    @Override // w1.w
    public final int b() {
        switch (this.f538n) {
            case 0:
                return P1.p.c((Bitmap) this.f539u);
            default:
                return ((w1.w) this.f540v).b();
        }
    }

    @Override // w1.w
    public final Class c() {
        switch (this.f538n) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // w1.w
    public final Object get() {
        switch (this.f538n) {
            case 0:
                return (Bitmap) this.f539u;
            default:
                return new BitmapDrawable((Resources) this.f539u, (Bitmap) ((w1.w) this.f540v).get());
        }
    }

    @Override // w1.t
    public final void initialize() {
        switch (this.f538n) {
            case 0:
                ((Bitmap) this.f539u).prepareToDraw();
                break;
            default:
                w1.w wVar = (w1.w) this.f540v;
                if (wVar instanceof w1.t) {
                    ((w1.t) wVar).initialize();
                    break;
                }
                break;
        }
    }

    public C0299d(Resources resources, w1.w wVar) {
        P1.g.c(resources, "Argument must not be null");
        this.f539u = resources;
        P1.g.c(wVar, "Argument must not be null");
        this.f540v = wVar;
    }
}
