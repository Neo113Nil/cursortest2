package ru.yandex.taxi.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.tje;
import defpackage.xw31;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/yandex/taxi/shadow/ShadowWrapperImpl;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "refreshShadowOffsets", "()V", "Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "(Landroid/view/View;)Landroid/graphics/Rect;", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "view", "paddings", "wrapView", "(Landroid/view/View;Landroid/graphics/Rect;)V", "", "Landroid/graphics/drawable/Drawable;", "shadows", "setShadows", "(Ljava/util/List;)V", "getView", "()Landroid/view/View;", "padding", CA20Status.STATUS_USER_I, "Ljava/util/List;", "shadowsPaddings", "Landroid/graphics/Rect;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ShadowWrapperImpl extends FrameLayout {
    private final int padding;
    private List<? extends Drawable> shadows;
    private Rect shadowsPaddings;

    public ShadowWrapperImpl(Context context) {
        super(context);
        int x = (int) tje.x(getContext(), 24.0f);
        this.padding = x;
        this.shadows = EmptyList.a;
        xw31.G(x, this);
    }

    private final Rect rect(View view) {
        Rect rect = xw31.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int i2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        int i3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        return new Rect(i, i2, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin : 0));
    }

    private final void refreshShadowOffsets() {
        Rect rect = new Rect();
        if (getChildCount() > 0) {
            Rect rect2 = rect(getChildAt(0));
            Rect rect3 = this.shadowsPaddings;
            if (rect3 == null) {
                rect3 = new Rect();
            }
            for (Drawable drawable : this.shadows) {
                int i = rect2.left - rect.left;
                int i2 = this.padding;
                drawable.setBounds((i + i2) - rect3.left, ((rect2.top - rect.top) + i2) - rect3.top, ((rect2.right + rect.right) + i2) - rect3.right, ((rect2.bottom + rect.bottom) + i2) - rect3.bottom);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Iterator<T> it = this.shadows.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).draw(canvas);
        }
        super.draw(canvas);
    }

    public View getView() {
        return (!this.shadows.isEmpty() || getChildCount() <= 0) ? this : getChildAt(0);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        refreshShadowOffsets();
    }

    public void setShadows(List<? extends Drawable> shadows) {
        this.shadows = shadows;
        refreshShadowOffsets();
        invalidate();
    }

    public void wrapView(View view, Rect paddings) {
        if (getChildCount() > 0) {
            removeAllViews();
        }
        this.shadowsPaddings = paddings;
        addView(view);
        refreshShadowOffsets();
        invalidate();
    }
}
