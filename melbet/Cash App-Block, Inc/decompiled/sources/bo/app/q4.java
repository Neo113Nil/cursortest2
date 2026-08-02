package bo.app;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;

/* loaded from: classes3.dex */
public final class q4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ BrazeViewBounds a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ Bitmap c;

    public q4(BrazeViewBounds brazeViewBounds, ImageView imageView, Bitmap bitmap) {
        this.a = brazeViewBounds;
        this.b = imageView;
        this.c = bitmap;
    }

    public static final void a(Bitmap bitmap, ImageView imageView) {
        BrazeImageUtils.resizeImageViewToBitmapDimensions(bitmap, imageView);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        if (this.a == BrazeViewBounds.BASE_CARD_VIEW) {
            ImageView imageView = this.b;
            imageView.post(new q4$$ExternalSyntheticLambda0(0, this.c, imageView));
        }
        view.removeOnLayoutChangeListener(this);
    }
}
