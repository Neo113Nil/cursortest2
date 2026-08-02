package defpackage;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.view.View;
import java.util.List;

/* loaded from: classes3.dex */
public final class qo8 extends h29 {
    public final /* synthetic */ gc8 j;
    public final /* synthetic */ ro8 k;
    public final /* synthetic */ uso l;
    public final /* synthetic */ View m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo8(gc8 gc8Var, ro8 ro8Var, uso usoVar, View view, float f) {
        super(gc8Var);
        this.j = gc8Var;
        this.k = ro8Var;
        this.l = usoVar;
        this.m = view;
        this.n = f;
    }

    @Override // defpackage.er2
    public final void i0(Bitmap bitmap, t33 t33Var) {
        ro8 ro8Var = this.k;
        List list = ro8Var.g;
        uso usoVar = this.l;
        if (list != null && !list.isEmpty()) {
            ild.q(this.j, ro8Var.f, bitmap, this.m, ro8Var.g, new yf0(usoVar, bitmap, this.n));
            return;
        }
        usoVar.e = bitmap;
        usoVar.f = null;
        usoVar.g = null;
        usoVar.j = true;
        usoVar.invalidateSelf();
    }

    @Override // defpackage.er2
    public final void j0(Drawable drawable, t33 t33Var) {
        uso usoVar = this.l;
        usoVar.g = drawable;
        usoVar.e = null;
        usoVar.f = null;
        usoVar.j = true;
        usoVar.invalidateSelf();
    }

    @Override // defpackage.er2
    public final void k0(PictureDrawable pictureDrawable, t33 t33Var) {
        List list;
        ro8 ro8Var = this.k;
        if (ro8Var.a != 1.0d || ((list = ro8Var.g) != null && !list.isEmpty())) {
            i0(vq2.N(pictureDrawable, 0, 0, 7), t33Var);
            return;
        }
        Picture picture = pictureDrawable.getPicture();
        uso usoVar = this.l;
        usoVar.f = picture;
        usoVar.e = null;
        usoVar.g = null;
        usoVar.j = true;
        usoVar.invalidateSelf();
    }
}
