package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public final class ys2 extends ek0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ys2(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // defpackage.ek0
    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                zs2 zs2Var = (zs2) this.c;
                zs2Var.setIndeterminate(false);
                zs2Var.a(zs2Var.b, zs2Var.c);
                break;
            case 1:
                zs2 zs2Var2 = (zs2) this.c;
                if (!zs2Var2.g) {
                    zs2Var2.setVisibility(zs2Var2.h);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((fdh) this.c).o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ek0
    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                fdh fdhVar = (fdh) this.c;
                ColorStateList colorStateList = fdhVar.o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(fdhVar.s, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }
}
