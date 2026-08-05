package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ s3(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        t1 t1Var;
        int i9 = this.qoPGr6Ce;
        int i10 = 2;
        Object obj = this.NCTxEWno;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new d3vfVszL(i10, carouselLayoutManager));
                    break;
                }
                break;
            default:
                q2 q2Var = (q2) obj;
                View view2 = q2Var.KlHjfFWx;
                ImageView imageView = q2Var.I5GHvsYW;
                if (imageView.getVisibility() == 0 && (t1Var = q2Var.g2aRJUAd) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    t1Var.setBounds(rect);
                    t1Var.jb9XjC4I(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q2Var.amk52bBQ.getLayoutParams();
                int i11 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i12 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z2 = true;
                if (q2Var.ESscZ9M1 == 1 && q2Var.ZyZthT5G == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (q2Var.ZyZthT5G != -2 || view2.getMeasuredWidth() == i11) {
                        z = false;
                    } else {
                        layoutParams2.width = Math.max(i11, Math.min(q2Var.N8VPGzVC, q2Var.getMeasuredWidth() - (q2Var.gmkaJpmS * 2)));
                        z = true;
                    }
                    if (view2.getMeasuredHeight() < i12) {
                        layoutParams2.height = i12;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        view2.setLayoutParams(layoutParams2);
                        break;
                    }
                }
                break;
        }
    }
}
