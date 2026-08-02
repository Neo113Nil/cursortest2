package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class qcd implements k2o, gme {
    public final Drawable a;
    public final /* synthetic */ int b;

    public qcd(Drawable drawable, int i) {
        this.b = i;
        w1g.s(drawable, "Argument must not be null");
        this.a = drawable;
    }

    @Override // defpackage.gme
    public void a() {
        switch (this.b) {
            case 0:
                ((vcd) ((pcd) this.a).a.b).l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.a;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof pcd) {
                        ((vcd) ((pcd) drawable).a.b).l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.k2o
    public final int f() {
        switch (this.b) {
            case 0:
                vcd vcdVar = (vcd) ((pcd) this.a).a.b;
                abr abrVar = vcdVar.a;
                return (abrVar.j.length * 4) + abrVar.d.limit() + abrVar.i.length + vcdVar.n;
            default:
                Drawable drawable = this.a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // defpackage.k2o
    public final void g() {
        z98 z98Var;
        z98 z98Var2;
        z98 z98Var3;
        switch (this.b) {
            case 0:
                pcd pcdVar = (pcd) this.a;
                pcdVar.stop();
                pcdVar.d = true;
                vcd vcdVar = (vcd) pcdVar.a.b;
                b1o b1oVar = vcdVar.d;
                vcdVar.c.clear();
                Bitmap bitmap = vcdVar.l;
                if (bitmap != null) {
                    vcdVar.e.o(bitmap);
                    vcdVar.l = null;
                }
                vcdVar.f = false;
                tcd tcdVar = vcdVar.i;
                if (tcdVar != null) {
                    b1oVar.j(tcdVar);
                    vcdVar.i = null;
                }
                tcd tcdVar2 = vcdVar.k;
                if (tcdVar2 != null) {
                    b1oVar.j(tcdVar2);
                    vcdVar.k = null;
                }
                tcd tcdVar3 = vcdVar.m;
                if (tcdVar3 != null) {
                    b1oVar.j(tcdVar3);
                    vcdVar.m = null;
                }
                abr abrVar = vcdVar.a;
                jtc jtcVar = abrVar.c;
                abrVar.l = null;
                byte[] bArr = abrVar.i;
                if (bArr != null && (z98Var3 = (z98) jtcVar.b) != null) {
                    z98Var3.l(bArr);
                }
                int[] iArr = abrVar.j;
                if (iArr != null && (z98Var2 = (z98) jtcVar.b) != null) {
                    z98Var2.l(iArr);
                }
                Bitmap bitmap2 = abrVar.m;
                if (bitmap2 != null) {
                    ((r33) jtcVar.a).o(bitmap2);
                }
                abrVar.m = null;
                abrVar.d = null;
                abrVar.s = null;
                byte[] bArr2 = abrVar.e;
                if (bArr2 != null && (z98Var = (z98) jtcVar.b) != null) {
                    z98Var.l(bArr2);
                }
                vcdVar.j = true;
                break;
        }
    }

    @Override // defpackage.k2o
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // defpackage.k2o
    public final Class h() {
        switch (this.b) {
            case 0:
                return pcd.class;
            default:
                return this.a.getClass();
        }
    }

    private final void b() {
    }
}
