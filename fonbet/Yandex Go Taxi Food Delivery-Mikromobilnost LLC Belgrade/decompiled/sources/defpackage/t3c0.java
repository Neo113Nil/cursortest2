package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes3.dex */
public final class t3c0 extends RecyclerView.d {
    public final Context a;
    public boolean b;
    public Integer c;
    public final Paint w;

    public t3c0(Context context) {
        this.a = context;
        Paint paint = new Paint();
        paint.setColor(rje.a(context, ung0.ybColor_fill_default_50));
        paint.setStyle(Paint.Style.FILL);
        this.w = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        Integer num = this.c;
        if (num == null || !this.b) {
            return;
        }
        float d = rje.d(iwg0.ybsdk_card_radius_account_cell, this.a);
        x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(num.intValue());
        if ((findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.a : null) != null) {
            canvas.drawRoundRect(r11.getLeft(), r11.getTop(), r11.getRight(), r11.getBottom(), d, d, this.w);
        }
    }
}
