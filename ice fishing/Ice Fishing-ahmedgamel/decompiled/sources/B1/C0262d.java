package B1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import v1.InterfaceC5104a;

/* renamed from: B1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262d implements u1.x, u1.u {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f124n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f125u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f126v;

    public C0262d(Bitmap bitmap, InterfaceC5104a interfaceC5104a) {
        N1.g.c(bitmap, "Bitmap must not be null");
        this.f125u = bitmap;
        N1.g.c(interfaceC5104a, "BitmapPool must not be null");
        this.f126v = interfaceC5104a;
    }

    public static C0262d b(Bitmap bitmap, InterfaceC5104a interfaceC5104a) {
        if (bitmap == null) {
            return null;
        }
        return new C0262d(bitmap, interfaceC5104a);
    }

    @Override // u1.x
    public final void a() {
        switch (this.f124n) {
            case 0:
                ((InterfaceC5104a) this.f126v).d((Bitmap) this.f125u);
                break;
            default:
                ((u1.x) this.f126v).a();
                break;
        }
    }

    @Override // u1.x
    public final int c() {
        switch (this.f124n) {
            case 0:
                return N1.p.c((Bitmap) this.f125u);
            default:
                return ((u1.x) this.f126v).c();
        }
    }

    @Override // u1.x
    public final Class d() {
        switch (this.f124n) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // u1.x
    public final Object get() {
        switch (this.f124n) {
            case 0:
                return (Bitmap) this.f125u;
            default:
                return new BitmapDrawable((Resources) this.f125u, (Bitmap) ((u1.x) this.f126v).get());
        }
    }

    @Override // u1.u
    public final void initialize() {
        switch (this.f124n) {
            case 0:
                ((Bitmap) this.f125u).prepareToDraw();
                break;
            default:
                u1.x xVar = (u1.x) this.f126v;
                if (xVar instanceof u1.u) {
                    ((u1.u) xVar).initialize();
                    break;
                }
                break;
        }
    }

    public C0262d(Resources resources, u1.x xVar) {
        N1.g.c(resources, "Argument must not be null");
        this.f125u = resources;
        N1.g.c(xVar, "Argument must not be null");
        this.f126v = xVar;
    }
}
