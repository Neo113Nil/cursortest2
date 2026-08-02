package ru.yandex.taxi.summary.requirements.list.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bdc;
import defpackage.efj0;
import defpackage.eja1;
import defpackage.isg0;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.up11;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/yandex/taxi/summary/requirements/list/ui/RequirementCounterView;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "spec", "size", "makeMeasureSpec", "(II)I", "Lefj0;", ClidProvider.STATE, "Lzy11;", "render", "(Lefj0;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lefj0;", "Lbdc;", "bgColor", "Lbdc;", "textColor", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "textPaint", CA20Status.STATUS_USER_I, "horizontalPaddings", "Landroid/graphics/Rect;", "textBounds", "Landroid/graphics/Rect;", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementCounterView extends View implements nwy0 {
    public static final int $stable = 8;
    private final bdc bgColor;
    private final int horizontalPaddings;
    private final Paint paint;
    private final int size;
    private efj0 state;
    private final Rect textBounds;
    private final bdc textColor;
    private final Paint textPaint;

    public RequirementCounterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bdc bdcVar = new bdc(xng0.controlMain);
        this.bgColor = bdcVar;
        bdc bdcVar2 = new bdc(xng0.textOnControl);
        this.textColor = bdcVar2;
        Paint paint = new Paint(1);
        paint.setColor(s8o.m(bdcVar, context));
        this.paint = paint;
        Paint paint2 = new Paint(1);
        int[] iArr = up11.a;
        paint2.setTypeface(eja1.w(3, 0));
        paint2.setTextSize(tje.r(mrg0.component_text_size_body, getContext()));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(s8o.m(bdcVar2, context));
        this.textPaint = paint2;
        this.size = tje.r(isg0.requirement_counter_size, getContext());
        this.horizontalPaddings = tje.u(8, getContext());
        this.textBounds = new Rect();
    }

    private final int makeMeasureSpec(int spec, int size) {
        return View.MeasureSpec.getMode(spec) != 1073741824 ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : spec;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.paint.setColor(s8o.m(this.bgColor, getContext()));
        this.textPaint.setColor(s8o.m(this.textColor, getContext()));
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        efj0 efj0Var = this.state;
        if (efj0Var == null) {
            return;
        }
        float f = this.size / 2.0f;
        canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), this.size, f, f, this.paint);
        canvas.drawText(efj0Var.a, getMeasuredWidth() / 2.0f, f + (this.textBounds.height() / 2), this.textPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        efj0 efj0Var = this.state;
        if (efj0Var == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            this.textBounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            Paint paint = this.textPaint;
            String str = efj0Var.a;
            paint.getTextBounds(str, 0, str.length(), this.textBounds);
            setMeasuredDimension(makeMeasureSpec(widthMeasureSpec, Math.max(this.textBounds.width() + this.horizontalPaddings, this.size)), makeMeasureSpec(heightMeasureSpec, this.size));
        }
    }

    public final void render(efj0 state) {
        this.state = state;
        requestLayout();
    }

    public RequirementCounterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RequirementCounterView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RequirementCounterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
