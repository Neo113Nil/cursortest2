package defpackage;

import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r29 extends h29 {
    public final /* synthetic */ int j = 1;
    public final e23 k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public r29(e23 e23Var, tq9 tq9Var, uce uceVar, SpannableStringBuilder spannableStringBuilder, Function1 function1) {
        super(e23Var.a);
        this.k = e23Var;
        this.l = tq9Var;
        this.m = uceVar;
        this.n = spannableStringBuilder;
        this.o = function1;
    }

    @Override // defpackage.h29, defpackage.n7w
    public void U(Throwable th) {
        switch (this.j) {
            case 0:
                super.U(th);
                ((i39) this.m).setImageUrl$div_release(null);
                break;
            default:
                super.U(th);
                break;
        }
    }

    @Override // defpackage.er2
    public void h0(Drawable drawable, t33 t33Var) {
        switch (this.j) {
            case 1:
                if (!(drawable instanceof PictureDrawable)) {
                    j0(drawable, t33Var);
                    break;
                } else {
                    k0((PictureDrawable) drawable, t33Var);
                    break;
                }
            default:
                super.h0(drawable, t33Var);
                break;
        }
    }

    @Override // defpackage.er2
    public final void i0(Bitmap bitmap, t33 t33Var) {
        switch (this.j) {
            case 0:
                v29 v29Var = (v29) this.l;
                i39 i39Var = (i39) this.m;
                i29 i29Var = (i29) this.n;
                v29Var.L(i39Var, this.k, bitmap, i29Var.N, i29Var.t);
                i39 i39Var2 = (i39) this.m;
                xzb xzbVar = (xzb) this.o;
                v29.G(v29Var, i39Var2, i29Var, xzbVar, t33Var);
                i39Var2.n();
                szb szbVar = i29Var.P;
                v29.M(i39Var2, szbVar != null ? (Integer) szbVar.a(xzbVar) : null, (ip8) i29Var.Q.a(xzbVar));
                i39Var2.invalidate();
                break;
            default:
                j0(new BitmapDrawable(this.k.a.getResources(), bitmap), t33Var);
                break;
        }
    }

    @Override // defpackage.er2
    public final void j0(Drawable drawable, t33 t33Var) {
        switch (this.j) {
            case 0:
                v29 v29Var = (v29) this.l;
                i39 i39Var = (i39) this.m;
                v29.H(v29Var, i39Var, this.k.a, drawable);
                v29.G(v29Var, i39Var, (i29) this.n, (xzb) this.o, t33Var);
                i39Var.n();
                i39Var.invalidate();
                break;
            default:
                xzb xzbVar = this.k.b;
                tq9 tq9Var = (tq9) this.l;
                szb szbVar = tq9Var.g;
                if (szbVar != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(((Number) szbVar.a(xzbVar)).intValue(), vq1.k0((ip8) tq9Var.h.a(xzbVar))));
                }
                l0(drawable);
                break;
        }
    }

    @Override // defpackage.er2
    public final void k0(PictureDrawable pictureDrawable, t33 t33Var) {
        List list;
        switch (this.j) {
            case 0:
                i29 i29Var = (i29) this.n;
                if (i29Var.P != null || ((list = i29Var.t) != null && !list.isEmpty())) {
                    i0(vq2.N(pictureDrawable, 0, 0, 7), t33Var);
                    break;
                } else {
                    super.k0(pictureDrawable, t33Var);
                    break;
                }
                break;
            default:
                if (((tq9) this.l).g != null) {
                    i0(vq2.N(pictureDrawable, 0, 0, 7), t33Var);
                    break;
                } else {
                    l0(pictureDrawable);
                    break;
                }
        }
    }

    public void l0(Drawable drawable) {
        uce uceVar = (uce) this.m;
        if (!Intrinsics.d(uceVar.f, drawable)) {
            uceVar.f = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, uceVar.a, uceVar.b);
            }
            uceVar.g.setEmpty();
        }
        Function1 function1 = (Function1) this.o;
        if (function1 != null) {
            function1.invoke((SpannableStringBuilder) this.n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r29(v29 v29Var, i39 i39Var, e23 e23Var, i29 i29Var, xzb xzbVar, gc8 gc8Var) {
        super(gc8Var);
        this.l = v29Var;
        this.m = i39Var;
        this.k = e23Var;
        this.n = i29Var;
        this.o = xzbVar;
    }
}
