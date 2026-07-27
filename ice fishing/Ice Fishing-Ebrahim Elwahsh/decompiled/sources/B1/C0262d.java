package B1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import v1.InterfaceC5117a;

/* renamed from: B1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262d implements u1.x, u1.t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f90n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f91u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f92v;

    public C0262d(Bitmap bitmap, InterfaceC5117a interfaceC5117a) {
        N1.g.c(bitmap, "Bitmap must not be null");
        this.f91u = bitmap;
        N1.g.c(interfaceC5117a, "BitmapPool must not be null");
        this.f92v = interfaceC5117a;
    }

    public static C0262d b(Bitmap bitmap, InterfaceC5117a interfaceC5117a) {
        if (bitmap == null) {
            return null;
        }
        return new C0262d(bitmap, interfaceC5117a);
    }

    @Override // u1.x
    public final void a() {
        switch (this.f90n) {
            case 0:
                ((InterfaceC5117a) this.f92v).d((Bitmap) this.f91u);
                break;
            default:
                ((u1.x) this.f92v).a();
                break;
        }
    }

    @Override // u1.x
    public final int c() {
        switch (this.f90n) {
            case 0:
                return N1.p.c((Bitmap) this.f91u);
            default:
                return ((u1.x) this.f92v).c();
        }
    }

    @Override // u1.x
    public final Class d() {
        switch (this.f90n) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // u1.x
    public final Object get() {
        switch (this.f90n) {
            case 0:
                return (Bitmap) this.f91u;
            default:
                return new BitmapDrawable((Resources) this.f91u, (Bitmap) ((u1.x) this.f92v).get());
        }
    }

    @Override // u1.t
    public final void initialize() {
        switch (this.f90n) {
            case 0:
                ((Bitmap) this.f91u).prepareToDraw();
                break;
            default:
                u1.x xVar = (u1.x) this.f92v;
                if (xVar instanceof u1.t) {
                    ((u1.t) xVar).initialize();
                    break;
                }
                break;
        }
    }

    public C0262d(Resources resources, u1.x xVar) {
        N1.g.c(resources, "Argument must not be null");
        this.f91u = resources;
        N1.g.c(xVar, "Argument must not be null");
        this.f92v = xVar;
    }
}
