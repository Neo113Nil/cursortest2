package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.g4i0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/widget/StrikableTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "style", "Lzy11;", "setTiltStyle", "(I)V", "Lru/yandex/taxi/widget/StrikableTextView$StrikeStyle;", "setStyle", "(Lru/yandex/taxi/widget/StrikableTextView$StrikeStyle;)V", "", "lineWidth", "setLineWidth", "(F)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/widget/StrikableTextView$StrikeStyle;", "Landroid/graphics/Paint;", "strikePaint", "Landroid/graphics/Paint;", "StrikeStyle", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StrikableTextView extends RobotoTextView {
    public static final int $stable = 8;
    private final Paint strikePaint;
    private StrikeStyle style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/widget/StrikableTextView$StrikeStyle;", "", "NO_TILT", "LEFT_TILT", "RIGHT_TILT", "STRAIGHT", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class StrikeStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StrikeStyle[] $VALUES;
        public static final StrikeStyle LEFT_TILT;
        public static final StrikeStyle NO_TILT;
        public static final StrikeStyle RIGHT_TILT;
        public static final StrikeStyle STRAIGHT;

        static {
            StrikeStyle strikeStyle = new StrikeStyle("NO_TILT", 0);
            NO_TILT = strikeStyle;
            StrikeStyle strikeStyle2 = new StrikeStyle("LEFT_TILT", 1);
            LEFT_TILT = strikeStyle2;
            StrikeStyle strikeStyle3 = new StrikeStyle("RIGHT_TILT", 2);
            RIGHT_TILT = strikeStyle3;
            StrikeStyle strikeStyle4 = new StrikeStyle("STRAIGHT", 3);
            STRAIGHT = strikeStyle4;
            StrikeStyle[] strikeStyleArr = {strikeStyle, strikeStyle2, strikeStyle3, strikeStyle4};
            $VALUES = strikeStyleArr;
            $ENTRIES = kotlin.enums.a.a(strikeStyleArr);
        }

        public static StrikeStyle valueOf(String str) {
            return (StrikeStyle) Enum.valueOf(StrikeStyle.class, str);
        }

        public static StrikeStyle[] values() {
            return (StrikeStyle[]) $VALUES.clone();
        }
    }

    public StrikableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.style = StrikeStyle.NO_TILT;
        Paint paint = new Paint(1);
        this.strikePaint = paint;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g4i0.StrikableTextView, 0, 0);
        try {
            paint.setStrokeWidth(obtainStyledAttributes.getFloat(g4i0.StrikableTextView_lineWidth, 1.0f));
            setTiltStyle(obtainStyledAttributes.getInt(g4i0.StrikableTextView_strike, 0));
            obtainStyledAttributes.recycle();
            paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
            paint.setStyle(Paint.Style.FILL);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setTiltStyle(int style) {
        if (style == 1) {
            setStyle(StrikeStyle.LEFT_TILT);
            return;
        }
        if (style == 2) {
            setStyle(StrikeStyle.RIGHT_TILT);
        } else if (style != 3) {
            setStyle(StrikeStyle.NO_TILT);
        } else {
            setStyle(StrikeStyle.STRAIGHT);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.style == StrikeStyle.RIGHT_TILT) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), getHeight(), this.strikePaint);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        if (this.style == StrikeStyle.LEFT_TILT) {
            canvas2.drawLine(0.0f, getHeight(), getWidth(), 0.0f, this.strikePaint);
        }
        if (this.style == StrikeStyle.STRAIGHT) {
            canvas2.drawLine(0.0f, getHeight() / 2.0f, getWidth(), getHeight() / 2.0f, this.strikePaint);
        }
    }

    public final void setLineWidth(float lineWidth) {
        this.strikePaint.setStrokeWidth(lineWidth);
        invalidate();
    }

    public final void setStyle(StrikeStyle style) {
        this.style = style;
        invalidate();
    }

    public StrikableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StrikableTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ StrikableTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
