package ru.yandex.taxi.scooters.presentation.common.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bdc;
import defpackage.kdc;
import defpackage.nwy0;
import defpackage.q0h0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR*\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R*\u0010+\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00109\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107¨\u0006:"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/widget/ScootersBatteryChargeViewV3;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateTint", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkdc;", "value", "bodyColor", "Lkdc;", "getBodyColor", "()Lkdc;", "setBodyColor", "(Lkdc;)V", "divisionColor", "getDivisionColor", "setDivisionColor", "activeDivisionsSize", CA20Status.STATUS_USER_I, "getActiveDivisionsSize", "()I", "setActiveDivisionsSize", "(I)V", "Landroid/graphics/drawable/Drawable;", "batteryBodyDrawable", "Landroid/graphics/drawable/Drawable;", "batteryDivisionDrawable", "", "batteryDivisionsXOffset", "F", "batteryDivisionsYOffset", "batteryDivisionsGap", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersBatteryChargeViewV3 extends View implements nwy0 {
    private int activeDivisionsSize;
    private Drawable batteryBodyDrawable;
    private Drawable batteryDivisionDrawable;
    private float batteryDivisionsGap;
    private float batteryDivisionsXOffset;
    private float batteryDivisionsYOffset;
    private kdc bodyColor;
    private kdc divisionColor;

    public ScootersBatteryChargeViewV3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bdc bdcVar = new bdc(xng0.textMinor);
        this.bodyColor = bdcVar;
        this.divisionColor = bdcVar;
        this.activeDivisionsSize = 3;
        this.batteryBodyDrawable = tje.y(q0h0.ic_battery_v3_mask, getContext());
        this.batteryDivisionDrawable = tje.y(q0h0.ic_battery_v3_division, getContext());
        updateTint();
    }

    private final void updateTint() {
        this.batteryBodyDrawable.setTint(s8o.m(this.bodyColor, getContext()));
        this.batteryDivisionDrawable.setTint(s8o.m(this.divisionColor, getContext()));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateTint();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final int getActiveDivisionsSize() {
        return this.activeDivisionsSize;
    }

    public final kdc getBodyColor() {
        return this.bodyColor;
    }

    public final kdc getDivisionColor() {
        return this.divisionColor;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.batteryBodyDrawable.draw(canvas);
        canvas.save();
        canvas.translate(this.batteryDivisionsXOffset, this.batteryDivisionsYOffset);
        int i = this.activeDivisionsSize;
        for (int i2 = 0; i2 < i; i2++) {
            this.batteryDivisionDrawable.draw(canvas);
            canvas.translate(this.batteryDivisionDrawable.getBounds().width() + this.batteryDivisionsGap, 0.0f);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int u = View.MeasureSpec.getMode(widthMeasureSpec) == 0 ? tje.u(22, getContext()) : View.MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(u, Math.min((int) (u * 0.63d), View.MeasureSpec.getSize(heightMeasureSpec)));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.batteryBodyDrawable.setBounds(0, 0, w, h);
        double d = w;
        double d2 = h;
        this.batteryDivisionDrawable.setBounds(0, 0, (int) (0.14d * d), (int) (0.43d * d2));
        this.batteryDivisionsXOffset = (float) (0.18d * d);
        this.batteryDivisionsYOffset = (float) (d2 * 0.28d);
        this.batteryDivisionsGap = (float) (d * 0.05d);
    }

    public final void setActiveDivisionsSize(int i) {
        this.activeDivisionsSize = Math.min(Math.max(0, i), 3);
    }

    public final void setBodyColor(kdc kdcVar) {
        this.bodyColor = kdcVar;
        this.batteryBodyDrawable.setTint(s8o.m(kdcVar, getContext()));
        invalidate();
    }

    public final void setDivisionColor(kdc kdcVar) {
        this.divisionColor = kdcVar;
        this.batteryDivisionDrawable.setTint(s8o.m(kdcVar, getContext()));
        invalidate();
    }

    public ScootersBatteryChargeViewV3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersBatteryChargeViewV3(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScootersBatteryChargeViewV3(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
