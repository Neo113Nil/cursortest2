package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import defpackage.do4;
import defpackage.dv4;
import defpackage.eo4;
import defpackage.mam;
import defpackage.tje;
import defpackage.usg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J7\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/yandex/taxi/widget/BalanceBarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldv4;", "newState", "", "animate", "Lzy11;", "updateState", "(Ldv4;Z)V", "getSuggestedMinimumWidth", "()I", "getSuggestedMinimumHeight", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/RectF;", "horizontalLineRect", "Landroid/graphics/RectF;", "verticalLineRect", "Ldo4;", "holder", "Ldo4;", "Companion", "eo4", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalanceBarView extends View {
    public static final int $stable = 8;
    public static final long DEFAULT_ANIMATION = 300;
    private final do4 holder;
    private final RectF horizontalLineRect;
    private final RectF verticalLineRect;
    public static final eo4 Companion = new eo4();
    private static final PathInterpolator DEFAULT_INTERPOLATOR = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);

    public BalanceBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int r = tje.r(usg0.balance_bar_horizontal_line_size, getContext());
        ColorDrawable colorDrawable = mam.a;
        this.horizontalLineRect = new RectF(0.0f, 0.0f, 0.0f, r);
        this.verticalLineRect = new RectF(0.0f, 0.0f, tje.r(usg0.balance_bar_vertical_line_width, getContext()), tje.r(usg0.balance_bar_vertical_line_height, getContext()));
        do4 do4Var = new do4(this);
        this.holder = do4Var;
        do4Var.h = 300L;
        do4Var.i = DEFAULT_INTERPOLATOR;
        do4Var.e();
    }

    public static /* synthetic */ void updateState$default(BalanceBarView balanceBarView, dv4 dv4Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        balanceBarView.updateState(dv4Var, z);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.holder.l);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.holder.l);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.holder.c();
        float height = this.horizontalLineRect.height();
        canvas.drawRoundRect(this.horizontalLineRect, height, height, this.holder.t);
        do4 do4Var = this.holder;
        if (((dv4) do4Var.d).d) {
            canvas.drawRoundRect(this.verticalLineRect, height, height, do4Var.t);
        }
        canvas.save();
        do4 do4Var2 = this.holder;
        int width = getWidth();
        float width2 = do4Var2.q.width();
        canvas.translate(((width - width2) * do4Var2.n.d) + (width2 / 2.0f), getHeight() / 2.0f);
        do4 do4Var3 = this.holder;
        canvas.drawOval(do4Var3.q, do4Var3.t);
        do4 do4Var4 = this.holder;
        float f = do4Var4.n.g;
        float f2 = 255.0f - f;
        Drawable drawable = do4Var4.o;
        if (drawable != null) {
            int i = (int) f2;
            ColorDrawable colorDrawable = mam.a;
            if (i > 0) {
                drawable.setAlpha(i);
                drawable.draw(canvas);
            }
        }
        Drawable drawable2 = this.holder.p;
        if (drawable2 != null) {
            int i2 = (int) f;
            ColorDrawable colorDrawable2 = mam.a;
            if (i2 > 0) {
                drawable2.setAlpha(i2);
                drawable2.draw(canvas);
            }
        }
        canvas.restore();
        this.holder.b();
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.horizontalLineRect.offsetTo(0.0f, (getHeight() - this.horizontalLineRect.height()) / 2.0f);
        this.horizontalLineRect.right = getWidth();
        this.verticalLineRect.offsetTo((getWidth() - this.verticalLineRect.width()) / 2.0f, (getHeight() - this.verticalLineRect.height()) / 2.0f);
    }

    public final void updateState(dv4 newState, boolean animate) {
        this.holder.g(newState, animate, false);
    }

    public BalanceBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BalanceBarView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BalanceBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
