package ru.yandex.taxi.plus.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c29;
import defpackage.e4i0;
import defpackage.fes0;
import defpackage.gsg0;
import defpackage.tqg0;
import defpackage.vh4;
import defpackage.xyt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J%\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u00020\u0006H\u0004¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\u0006H\u0004¢\u0006\u0004\b.\u0010\u001eR\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00106R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0016\u0010:\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00106¨\u0006>"}, d2 = {"Lru/yandex/taxi/plus/badge/CashbackBackgroundView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyAttributes", "(Landroid/util/AttributeSet;I)V", "Lvh4;", "createBackgroundDrawer", "()Lvh4;", "widthMeasureSpec", "computeDesiredWidth", "(I)I", "heightMeasureSpec", "computeDesiredHeight", "", "colors", "", "pos", "", "angle", "setGradientSettings", "([I[FF)V", "gradientOvalHeight", "()I", "gradientOvalCornerRadius", "", "isDrawShadow", "setIsDrawShadow", "(Z)V", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "doChildDraw", "ovalTop", "ovalHeight", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "backgroundPainter", "Lvh4;", "Z", UrbanAdsBottomSheetFragment.CORNER_RADIUS, CA20Status.STATUS_USER_I, "ovalStackOffset", "ovalInitialOffset", "ovalBounceOffset", "shadowRadius", "F", "shadowColor", "smallShadowColor", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CashbackBackgroundView extends View {
    private vh4 backgroundPainter;
    private final int cornerRadius;
    private int gradientOvalHeight;
    private boolean isDrawShadow;
    private int ovalBounceOffset;
    private int ovalHeight;
    private int ovalInitialOffset;
    private int ovalStackOffset;
    private final Paint paint;
    private int shadowColor;
    private float shadowRadius;
    private final int smallShadowColor;

    public CashbackBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint();
        this.isDrawShadow = true;
        this.cornerRadius = getResources().getDimensionPixelSize(gsg0.cashback_oval_corner_radius);
        this.ovalHeight = getResources().getDimensionPixelSize(gsg0.cashback_oval_height);
        this.gradientOvalHeight = (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics());
        this.ovalStackOffset = getResources().getDimensionPixelOffset(gsg0.cashback_ovals_distance);
        this.ovalBounceOffset = getResources().getDimensionPixelOffset(gsg0.cashback_oval_bounce_offset);
        this.shadowRadius = getResources().getDimension(gsg0.cashback_gradient_shadow_radius);
        this.smallShadowColor = context.getColor(tqg0.cashback_small_shadow_color);
        applyAttributes(attributeSet, i);
        this.backgroundPainter = createBackgroundDrawer();
        invalidate();
    }

    private final void applyAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, e4i0.CashbackBackgroundView, defStyleAttr, 0);
        try {
            this.ovalHeight = obtainStyledAttributes.getDimensionPixelSize(e4i0.CashbackBackgroundView_ovalHeight, this.ovalHeight);
            this.ovalStackOffset = obtainStyledAttributes.getDimensionPixelOffset(e4i0.CashbackBackgroundView_stackOffset, this.ovalStackOffset);
            this.ovalInitialOffset = obtainStyledAttributes.getDimensionPixelOffset(e4i0.CashbackBackgroundView_initialOffset, this.ovalInitialOffset);
            this.ovalBounceOffset = obtainStyledAttributes.getDimensionPixelOffset(e4i0.CashbackBackgroundView_bounceOffset, this.ovalBounceOffset);
            this.gradientOvalHeight = obtainStyledAttributes.getDimensionPixelSize(e4i0.CashbackBackgroundView_gradientOvalHeight, this.gradientOvalHeight);
            this.shadowRadius = obtainStyledAttributes.getDimension(e4i0.CashbackBackgroundView_shadowRadius, this.shadowRadius);
            this.shadowColor = obtainStyledAttributes.getColor(e4i0.CashbackBackgroundView_shadowColor, getContext().getColor(tqg0.cashback_shadow_color));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final int computeDesiredHeight(int heightMeasureSpec) {
        return View.resolveSize(View.MeasureSpec.getSize(heightMeasureSpec), heightMeasureSpec);
    }

    private final int computeDesiredWidth(int widthMeasureSpec) {
        return View.resolveSize(View.MeasureSpec.getSize(widthMeasureSpec), widthMeasureSpec);
    }

    private final vh4 createBackgroundDrawer() {
        return new xyt(this.paint, new c29(0, this), true, this.isDrawShadow, this.gradientOvalHeight, this.cornerRadius, this.shadowRadius, this.shadowColor, this.smallShadowColor);
    }

    public void doChildDraw(Canvas canvas) {
    }

    /* renamed from: gradientOvalCornerRadius, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: gradientOvalHeight, reason: from getter */
    public final int getGradientOvalHeight() {
        return this.gradientOvalHeight;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.backgroundPainter.getClass();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        this.backgroundPainter.draw(canvas);
        canvas.restore();
        doChildDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(computeDesiredWidth(widthMeasureSpec), computeDesiredHeight(heightMeasureSpec));
    }

    public final int ovalHeight() {
        return this.backgroundPainter.b();
    }

    public final int ovalTop() {
        return this.backgroundPainter.a();
    }

    public final void setGradientSettings(int[] colors, float[] pos, float angle) {
        vh4 vh4Var = this.backgroundPainter;
        if (vh4Var instanceof xyt) {
            ((xyt) vh4Var).j = new fes0(colors, pos, angle);
            invalidate();
        }
    }

    public final void setIsDrawShadow(boolean isDrawShadow) {
        this.isDrawShadow = isDrawShadow;
        this.backgroundPainter = createBackgroundDrawer();
        invalidate();
    }

    public CashbackBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CashbackBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CashbackBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
