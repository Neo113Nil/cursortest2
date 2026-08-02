package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;

/* loaded from: classes11.dex */
public final class qdl extends osk {
    public final /* synthetic */ TabTitlesLayoutView c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdl(TabTitlesLayoutView tabTitlesLayoutView, int i, int i2, Div2View div2View) {
        super(div2View);
        this.c = tabTitlesLayoutView;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.osk, defpackage.btk
    public final void d(Throwable th) {
        super.d(th);
        this.c.setTabDelimiter(null, 0, 0);
    }

    @Override // defpackage.k25
    public final void i(Bitmap bitmap, BitmapSource bitmapSource) {
        this.c.setTabDelimiter(bitmap, this.d, this.e);
    }

    @Override // defpackage.k25
    public final void j(Drawable drawable, BitmapSource bitmapSource) {
        i(ffx.d0(drawable, 0, 0, 7), bitmapSource);
    }
}
