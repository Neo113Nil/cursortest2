package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import com.yandex.div.legacy.view.DivView;
import com.yandex.images.utils.ScaleMode;

/* loaded from: classes11.dex */
public final class wok extends l9y {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Resources d;
    public final /* synthetic */ TextView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wok(DivView divView, int i, int i2, Resources resources, TextView textView) {
        super(divView);
        this.b = i;
        this.c = i2;
        this.d = resources;
        this.e = textView;
    }

    @Override // defpackage.k9v
    public final void e(ad7 ad7Var) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.d, s0z0.b(ad7Var.a, this.b, this.c, 0, null, ScaleMode.CENTER_CROP));
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        this.e.setCompoundDrawables(bitmapDrawable, null, null, null);
    }
}
