package defpackage;

import com.lightside.cookies.android.views.VerticalSeekView;

/* loaded from: classes11.dex */
public final class xf31 {
    public final float a;
    public final /* synthetic */ VerticalSeekView b;

    public xf31(VerticalSeekView verticalSeekView) {
        float position;
        this.b = verticalSeekView;
        position = verticalSeekView.getPosition();
        this.a = position;
        verticalSeekView.getSeekListener();
    }

    public final void a(float f) {
        VerticalSeekView verticalSeekView = this.b;
        verticalSeekView.setPosition(1.0f - (((Number) y6i0.h(Float.valueOf(f - verticalSeekView.getPaddingTop()), new r5c(0.0f, verticalSeekView.getHeight() - (verticalSeekView.getPaddingBottom() + verticalSeekView.getPaddingTop())))).floatValue() / (verticalSeekView.getHeight() - (verticalSeekView.getPaddingBottom() + verticalSeekView.getPaddingTop()))));
        verticalSeekView.getSeekListener();
    }
}
