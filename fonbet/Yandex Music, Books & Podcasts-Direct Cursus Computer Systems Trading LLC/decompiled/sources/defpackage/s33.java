package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class s33 implements k2o, gme {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public s33(r33 r33Var, Bitmap bitmap) {
        w1g.s(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        w1g.s(r33Var, "BitmapPool must not be null");
        this.c = r33Var;
    }

    public static s33 b(r33 r33Var, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new s33(r33Var, bitmap);
    }

    @Override // defpackage.gme
    public final void a() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                k2o k2oVar = (k2o) this.c;
                if (k2oVar instanceof gme) {
                    ((gme) k2oVar).a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.k2o
    public final int f() {
        switch (this.a) {
            case 0:
                return xut.c((Bitmap) this.b);
            default:
                return ((k2o) this.c).f();
        }
    }

    @Override // defpackage.k2o
    public final void g() {
        switch (this.a) {
            case 0:
                ((r33) this.c).o((Bitmap) this.b);
                break;
            default:
                ((k2o) this.c).g();
                break;
        }
    }

    @Override // defpackage.k2o
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((k2o) this.c).get());
        }
    }

    @Override // defpackage.k2o
    public final Class h() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public s33(Resources resources, k2o k2oVar) {
        w1g.s(resources, "Argument must not be null");
        this.b = resources;
        w1g.s(k2oVar, "Argument must not be null");
        this.c = k2oVar;
    }
}
