package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.ybsdk.widgets.common.MoneyInputEditView;

/* loaded from: classes12.dex */
public final class t7z0 {
    public final dj9 a = new dj9(MoneyInputEditView.DEFAULT_VALUE, '9');
    public final Paint b;

    public t7z0(Context context, int i) {
        Paint paint = new Paint();
        int[] iArr = up11.a;
        paint.setTypeface(eja1.w(3, 0));
        paint.setTextSize(context.getResources().getDimensionPixelSize(mrg0.component_text_size_caption));
        this.b = paint;
    }
}
