package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* loaded from: classes7.dex */
public final class ss71 implements zq81 {
    public static final /* synthetic */ kgx[] c = {qha1.a(ss71.class, "preview", "getPreview()Landroid/widget/ImageView;"), qha1.a(ss71.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;")};
    public final r581 a;
    public final r581 b;

    public ss71(ImageView imageView, ProgressBar progressBar) {
        this.a = new r581(imageView);
        this.b = new r581(progressBar);
    }

    @Override // defpackage.zq81
    public final void d(Drawable drawable) {
        r581 r581Var = this.b;
        kgx[] kgxVarArr = c;
        if (drawable == null) {
            kgx kgxVar = kgxVarArr[1];
            ProgressBar progressBar = (ProgressBar) r581Var.a.get();
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        kgx kgxVar2 = kgxVarArr[0];
        ImageView imageView = (ImageView) this.a.a.get();
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        kgx kgxVar3 = kgxVarArr[1];
        ProgressBar progressBar2 = (ProgressBar) r581Var.a.get();
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
    }
}
