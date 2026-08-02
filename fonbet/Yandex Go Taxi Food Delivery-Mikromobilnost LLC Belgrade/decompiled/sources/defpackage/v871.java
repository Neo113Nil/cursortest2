package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public final class v871 extends ia71 {
    public static final /* synthetic */ int f = 0;
    public final no6 c;
    public final aj31 d;
    public final br71 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v871(ImageView imageView, v881 v881Var, d881 d881Var) {
        super(imageView);
        no6 no6Var = new no6(imageView.getContext(), new w7o(d881Var), v881Var);
        aj31 aj31Var = new aj31(21, v881Var);
        br71 br71Var = new br71();
        this.c = no6Var;
        this.d = aj31Var;
        this.e = br71Var;
    }

    @Override // defpackage.ia71
    public final void a(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        imageView.removeOnLayoutChangeListener(this.e.d);
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        imageView.setOnTouchListener(null);
        imageView.setSelected(false);
    }

    @Override // defpackage.ia71
    public final boolean c(View view, Object obj) {
        cu81 cu81Var = (cu81) obj;
        Drawable drawable = ((ImageView) view).getDrawable();
        aj31 aj31Var = this.d;
        Bitmap a = ((v881) aj31Var.b).a(cu81Var);
        if (a == null) {
            v881 v881Var = (v881) aj31Var.b;
            v881Var.getClass();
            String str = cu81Var.g;
            m581 m581Var = str != null ? new m581(str, new vn61(cu81Var.a, cu81Var.b)) : null;
            a = m581Var != null ? (Bitmap) v881Var.c.get(m581Var) : null;
        }
        if (drawable == null || a == null) {
            return false;
        }
        return (drawable instanceof BitmapDrawable ? new lj81() : new ip81()).a(drawable, a);
    }

    @Override // defpackage.ia71
    public final void e(View view, Object obj) {
        cu81 cu81Var = (cu81) obj;
        this.c.a(cu81Var, new gs51(6, this, cu81Var));
    }
}
