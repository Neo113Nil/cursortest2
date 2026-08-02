package app.cash.redwood.lazylayout.view;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class SizeOnlyPlaceholder extends View {
    public final View original;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeOnlyPlaceholder(View view, Context context) {
        super(context);
        context.getClass();
        this.original = view;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.original;
        setMeasuredDimension(view.getWidth(), view.getHeight());
    }
}
