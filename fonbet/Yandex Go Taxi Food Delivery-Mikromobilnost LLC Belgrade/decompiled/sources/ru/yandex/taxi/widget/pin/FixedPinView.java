package ru.yandex.taxi.widget.pin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.BlendModeCompat;
import com.yandex.runtime.image.ImageProvider;
import defpackage.c0h0;
import defpackage.mrg0;
import defpackage.ooc;
import defpackage.tje;
import defpackage.xrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&¨\u0006+"}, d2 = {"Lru/yandex/taxi/widget/pin/FixedPinView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Lzy11;", "setIntrinsicSizeAndCenter", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Canvas;", "canvas", "drawShadow", "(Landroid/graphics/Canvas;)V", "Lcom/yandex/runtime/image/ImageProvider;", "imageProviderForCurrentState", "()Lcom/yandex/runtime/image/ImageProvider;", "setIcon", "pinColor", "setPinColor", "(I)V", "onDraw", "tailDrawable", "Landroid/graphics/drawable/Drawable;", "pinCircleDrawable", "pinIconDrawable", "Lru/yandex/taxi/widget/pin/OvalShadowShape;", "shadowShape", "Lru/yandex/taxi/widget/pin/OvalShadowShape;", "Landroid/graphics/drawable/ShapeDrawable;", "pinShadowDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "shadowRadius", CA20Status.STATUS_USER_I, "shadowHeight", "tailOffset", "pinImageWidth", "pinImageHeight", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FixedPinView extends View {
    private final Drawable pinCircleDrawable;
    private int pinColor;
    private Drawable pinIconDrawable;
    private final int pinImageHeight;
    private final int pinImageWidth;
    private final ShapeDrawable pinShadowDrawable;
    private final int shadowHeight;
    private final int shadowRadius;
    private final OvalShadowShape shadowShape;
    private final Drawable tailDrawable;
    private final int tailOffset;

    public FixedPinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable y = tje.y(c0h0.ic_fixed_pin_tail, getContext());
        this.tailDrawable = y;
        Drawable y2 = tje.y(c0h0.fixed_pin_circle, getContext());
        this.pinCircleDrawable = y2;
        OvalShadowShape ovalShadowShape = new OvalShadowShape();
        this.shadowShape = ovalShadowShape;
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShadowShape);
        this.pinShadowDrawable = shapeDrawable;
        int r = tje.r(xrg0.fixed_pin_shadow_radius, getContext());
        this.shadowRadius = r;
        this.shadowHeight = tje.r(mrg0.go_design_s_space, getContext());
        this.tailOffset = tje.u(1, getContext());
        this.pinImageWidth = tje.r(xrg0.fixed_pin_width, getContext());
        this.pinImageHeight = tje.r(xrg0.fixed_pin_image_height, getContext());
        shapeDrawable.setBounds(-r, -r, r, r);
        setIntrinsicSizeAndCenter(y2);
        setIntrinsicSizeAndCenter(y);
    }

    private final void drawShadow(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() - (this.shadowHeight / 2.0f);
        canvas.translate(width, height);
        canvas.save();
        canvas.scale(1.0f, 0.25f);
        OvalShadowShape ovalShadowShape = this.shadowShape;
        int i = this.shadowRadius;
        ovalShadowShape.updateRadialGradient(i, i * 0.5f);
        this.pinShadowDrawable.setAlpha(25);
        this.pinShadowDrawable.draw(canvas);
        canvas.restore();
        canvas.translate(-width, -height);
    }

    private final void setIntrinsicSizeAndCenter(Drawable drawable) {
        drawable.setBounds((-drawable.getIntrinsicWidth()) / 2, (-drawable.getIntrinsicHeight()) / 2, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
    }

    public final ImageProvider imageProviderForCurrentState() {
        Bitmap createBitmap = Bitmap.createBitmap(this.pinImageWidth, this.pinImageHeight, Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        return ImageProvider.fromBitmap(createBitmap);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawShadow(canvas);
        float width = getWidth() / 2.0f;
        float intrinsicHeight = this.pinCircleDrawable.getIntrinsicHeight() / 2.0f;
        canvas.translate(width, intrinsicHeight);
        Drawable drawable = this.pinCircleDrawable;
        int i = this.pinColor;
        BlendModeCompat blendModeCompat = BlendModeCompat.SRC_ATOP;
        drawable.setColorFilter(ooc.k(i, blendModeCompat));
        this.pinCircleDrawable.draw(canvas);
        Drawable drawable2 = this.pinIconDrawable;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        canvas.translate(-width, -intrinsicHeight);
        canvas.translate(getWidth() / 2.0f, ((this.tailDrawable.getIntrinsicHeight() / 2.0f) + (intrinsicHeight * 2.0f)) - this.tailOffset);
        this.tailDrawable.setColorFilter(ooc.k(this.pinColor, blendModeCompat));
        this.tailDrawable.draw(canvas);
    }

    public final void setIcon(Drawable drawable) {
        this.pinIconDrawable = drawable;
        setIntrinsicSizeAndCenter(drawable);
    }

    public final void setPinColor(int pinColor) {
        this.pinColor = pinColor;
    }

    public FixedPinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FixedPinView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FixedPinView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
