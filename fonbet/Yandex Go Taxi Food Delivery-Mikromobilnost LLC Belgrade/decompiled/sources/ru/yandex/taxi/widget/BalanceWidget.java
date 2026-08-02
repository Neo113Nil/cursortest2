package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.agh0;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.mam;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.p4u0;
import defpackage.po4;
import defpackage.qo4;
import defpackage.tje;
import defpackage.zh2;
import defpackage.zrh0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\rR\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/yandex/taxi/widget/BalanceWidget;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setForeground", "()V", "", "Lzh2;", "Landroid/graphics/Canvas;", "canvas", "render", "(Ljava/util/List;Landroid/graphics/Canvas;)V", "Lpo4;", "newState", "", "animate", "updateState", "(Lpo4;Z)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/View;", "expandedContentView", "setExpandedContent", "(Landroid/view/View;)V", "removeExpandedContent", "Lqo4;", "binding", "Lqo4;", "Lru/yandex/taxi/widget/BalanceBarView;", "balanceBarView", "Lru/yandex/taxi/widget/BalanceBarView;", "Lp4u0;", "holder", "Lp4u0;", "value", "isExpandedContentVisible", "()Z", "setExpandedContentVisible", "(Z)V", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalanceWidget extends FrameLayout implements nwy0 {
    public static final int $stable = 8;
    private final BalanceBarView balanceBarView;
    private final qo4 binding;
    private final p4u0 holder;

    public BalanceWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(zrh0.balance_widget_view, this);
        int i2 = agh0.balanceBarView;
        BalanceBarView balanceBarView = (BalanceBarView) cma1.O(i2, this);
        if (balanceBarView != null) {
            i2 = agh0.expandedContent;
            LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
            if (linearLayout != null) {
                this.binding = new qo4(this, balanceBarView, linearLayout);
                this.balanceBarView = balanceBarView;
                p4u0 p4u0Var = new p4u0(this, balanceBarView);
                this.holder = p4u0Var;
                setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                p4u0Var.e();
                setForeground();
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void render(List<zh2> list, Canvas canvas) {
        for (zh2 zh2Var : list) {
            canvas.save();
            canvas.translate(zh2Var.d, 0.0f);
            Drawable drawable = zh2Var.a;
            int i = (int) zh2Var.g;
            ColorDrawable colorDrawable = mam.a;
            if (i > 0) {
                drawable.setAlpha(i);
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    private final void setForeground() {
        setForeground(tje.y(f1h0.bg_balance_widget, getContext()));
    }

    public static /* synthetic */ void updateState$default(BalanceWidget balanceWidget, po4 po4Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        balanceWidget.updateState(po4Var, z);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setForeground();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Throwable th;
        p4u0 p4u0Var = this.holder;
        float f = p4u0Var.w;
        float f2 = p4u0Var.z;
        int save = canvas.save();
        canvas.clipRect(0.0f, 0.0f, f, f2);
        try {
            canvas.save();
            p4u0 p4u0Var2 = this.holder;
            int width = canvas.getWidth();
            boolean z = p4u0Var2.b;
            float f3 = p4u0Var2.I;
            if (z) {
                try {
                    f3 = (width + f3) - p4u0Var2.F;
                } catch (Throwable th2) {
                    th = th2;
                    canvas2 = canvas;
                    canvas2.restoreToCount(save);
                    throw th;
                }
            }
            p4u0 p4u0Var3 = this.holder;
            canvas.translate(f3, ((p4u0Var3.s - this.balanceBarView.getHeight()) / 2.0f) + p4u0Var3.p);
            this.balanceBarView.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(this.binding.b.getX(), this.binding.b.getY());
            canvas2 = canvas;
            try {
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.binding.b.getMeasuredWidth(), this.binding.b.getMeasuredHeight(), (int) (this.holder.E * 255.0f));
                this.binding.b.draw(canvas2);
                canvas2.restore();
                canvas2.restoreToCount(save);
                this.holder.b();
            } catch (Throwable th3) {
                th = th3;
                th = th;
                canvas2.restoreToCount(save);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
    }

    public final boolean isExpandedContentVisible() {
        return this.binding.b.getVisibility() == 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.holder.c();
        po4 po4Var = (po4) this.holder.d;
        canvas.save();
        p4u0 p4u0Var = this.holder;
        int i = (int) p4u0Var.w;
        int i2 = (int) p4u0Var.z;
        Drawable drawable = po4Var.a;
        Rect rect = p4u0Var.t;
        ColorDrawable colorDrawable = mam.a;
        drawable.setBounds(-rect.left, -rect.top, rect.right + i, i2 + rect.bottom);
        canvas.translate(this.holder.b ? getWidth() - i : 0.0f, 0.0f);
        po4Var.a.draw(canvas);
        canvas.restore();
        canvas.save();
        float width = this.holder.b ? getWidth() : 0.0f;
        p4u0 p4u0Var2 = this.holder;
        canvas.translate(width, (p4u0Var2.s / 2.0f) + p4u0Var2.p);
        render(this.holder.n.a, canvas);
        render(this.holder.o.a, canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        BalanceBarView balanceBarView = this.balanceBarView;
        p4u0 p4u0Var = this.holder;
        int width = getWidth();
        boolean z = p4u0Var.b;
        float f = p4u0Var.I;
        if (z) {
            f = (width + f) - p4u0Var.F;
        }
        int i = (int) f;
        p4u0 p4u0Var2 = this.holder;
        int height = (int) (((p4u0Var2.s - this.balanceBarView.getHeight()) / 2.0f) + p4u0Var2.p);
        balanceBarView.layout(i, height, balanceBarView.getMeasuredWidth() + i, balanceBarView.getMeasuredHeight() + height);
        LinearLayout linearLayout = this.binding.b;
        p4u0 p4u0Var3 = this.holder;
        linearLayout.layout(0, r0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight() + r0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.balanceBarView.measure(View.MeasureSpec.makeMeasureSpec(this.holder.F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.holder.r, 1073741824));
        if (this.binding.b.getVisibility() != 8) {
            this.binding.b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            p4u0 p4u0Var = this.holder;
            float measuredWidth = this.binding.b.getMeasuredWidth();
            float measuredHeight = this.binding.b.getMeasuredHeight();
            p4u0Var.B = measuredWidth;
            p4u0Var.h();
            p4u0Var.A = measuredHeight;
            p4u0Var.y = (p4u0Var.p * 2) + p4u0Var.s + measuredHeight;
        } else {
            p4u0 p4u0Var2 = this.holder;
            p4u0Var2.B = 0.0f;
            p4u0Var2.h();
            p4u0Var2.A = 0.0f;
            p4u0Var2.y = (p4u0Var2.p * 2) + p4u0Var2.s + 0.0f;
        }
        p4u0 p4u0Var3 = this.holder;
        setMeasuredDimension((int) p4u0Var3.v, (int) p4u0Var3.y);
    }

    public final void removeExpandedContent() {
        this.binding.b.removeAllViews();
    }

    public final void setExpandedContent(View expandedContentView) {
        removeExpandedContent();
        this.binding.b.addView(expandedContentView);
    }

    public final void setExpandedContentVisible(boolean z) {
        this.binding.b.setVisibility(z ? 0 : 8);
    }

    public final void updateState(po4 newState, boolean animate) {
        this.holder.g(newState, animate, false);
    }

    public BalanceWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BalanceWidget(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BalanceWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
