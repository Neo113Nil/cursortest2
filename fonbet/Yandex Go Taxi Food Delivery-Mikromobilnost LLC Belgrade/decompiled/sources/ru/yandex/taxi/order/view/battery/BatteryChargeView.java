package ru.yandex.taxi.order.view.battery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import defpackage.f1h0;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.u8b1;
import defpackage.xng0;
import defpackage.xqg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/order/view/battery/BatteryChargeView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateView", "()V", "setPercentText", "getChargeColor", "()I", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "backgroundRectPaint", "Landroid/graphics/Paint;", "chargeRectPaint", "Landroid/graphics/Bitmap;", "maskBitmap", "Landroid/graphics/Bitmap;", "maskPaint", "value", "chargePercent", CA20Status.STATUS_USER_I, "getChargePercent", "setChargePercent", "(I)V", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BatteryChargeView extends RobotoTextView {
    public static final int $stable = 8;
    private final Paint backgroundRectPaint;
    private int chargePercent;
    private final Paint chargeRectPaint;
    private final Bitmap maskBitmap;
    private final Paint maskPaint;

    public BatteryChargeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayerType(2, null);
        Paint paint = new Paint();
        paint.setColor(qje.t(xng0.controlMinor, context));
        paint.setAntiAlias(true);
        this.backgroundRectPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(xqg0.charge_color_green));
        paint2.setAntiAlias(true);
        this.chargeRectPaint = paint2;
        this.maskBitmap = u8b1.h(f1h0.ic_battery_mask, context).extractAlpha();
        Paint paint3 = new Paint();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.maskPaint = paint3;
        this.chargePercent = 50;
    }

    private final int getChargeColor() {
        Context context = getContext();
        int i = this.chargePercent;
        return context.getColor(i <= 5 ? xqg0.charge_color_red : i <= 30 ? xqg0.charge_color_orange : xqg0.charge_color_green);
    }

    private final void setPercentText() {
        setText(getContext().getString(kyh0.battery_percent_template, Integer.valueOf(this.chargePercent)));
    }

    private final void updateView() {
        this.chargeRectPaint.setColor(getChargeColor());
        setPercentText();
        invalidate();
    }

    public final int getChargePercent() {
        return this.chargePercent;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.backgroundRectPaint);
        canvas.drawRect(0.0f, 0.0f, (getWidth() / 100.0f) * this.chargePercent, getHeight(), this.chargeRectPaint);
        super.onDraw(canvas);
        canvas.drawBitmap(this.maskBitmap, 0.0f, 0.0f, this.maskPaint);
    }

    public final void setChargePercent(int i) {
        if (i > 100 || i < 0) {
            ny61.g("Value must be between 0 and 100");
        } else {
            this.chargePercent = i;
            updateView();
        }
    }

    public BatteryChargeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BatteryChargeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BatteryChargeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
