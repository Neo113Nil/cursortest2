package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import yads.jk3;

/* loaded from: classes7.dex */
public final class qs71 implements ku71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ qs71(ImageView imageView, int i) {
        this.a = i;
        this.b = imageView;
    }

    private final void a(jk3 jk3Var) {
    }

    private final void b(jk3 jk3Var) {
    }

    @Override // defpackage.wf81
    public final void j(jk3 jk3Var) {
        int i = this.a;
    }

    @Override // defpackage.ku71
    public final void r(gr71 gr71Var, boolean z) {
        int i = this.a;
        ImageView imageView = this.b;
        switch (i) {
            case 0:
                Bitmap bitmap = gr71Var.a;
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                    break;
                }
                break;
            default:
                Bitmap bitmap2 = gr71Var.a;
                if (bitmap2 != null) {
                    imageView.setImageBitmap(bitmap2);
                    break;
                }
                break;
        }
    }
}
