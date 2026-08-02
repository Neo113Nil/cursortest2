package ru.yandex.taxi.widget.due_timetable.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.eja1;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.tje;
import defpackage.up11;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0019¢\u0006\u0004\b'\u0010%J\u0015\u0010(\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b(\u0010\u0018J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u000bH\u0014¢\u0006\u0004\b*\u0010\u000eJ/\u0010/\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010;\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010<\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010#\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010MR\u0016\u0010&\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010MR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010N¨\u0006O"}, d2 = {"Lru/yandex/taxi/widget/due_timetable/adapter/DueTimetableUnavailableSlotView;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "Lzy11;", "drawBar", "(Landroid/graphics/Canvas;)V", "drawTopText", "drawLabel", "width", "height", "updateBarPath", "(II)V", "", "selected", "updateBarSelection", "(Z)V", "", "label", "labelWidth", "Landroid/text/TextPaint;", "labelPaint", "Landroid/text/StaticLayout;", "createStaticLayout", "(Ljava/lang/String;ILandroid/text/TextPaint;)Landroid/text/StaticLayout;", "applyThemeColors", "()V", "topText", "setTopText", "(Ljava/lang/String;)V", "barLabel", "setBarLabel", "setBarSelected", "canvas", "onDraw", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "horizontalOffset", "F", "barBottomOffset", "topTextBottomOffset", "barHeight", "barCornerRadius", "topTextPaint", "Landroid/text/TextPaint;", "Landroid/graphics/Paint;", "barPaint", "Landroid/graphics/Paint;", "", "barCorners", "[F", "Landroid/graphics/Path;", "barPath", "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "barRect", "Landroid/graphics/RectF;", "Landroid/graphics/Rect;", "labelBoundsRect", "Landroid/graphics/Rect;", "Ljava/lang/String;", "Z", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DueTimetableUnavailableSlotView extends View implements nwy0 {
    public static final int $stable = 8;
    private final float barBottomOffset;
    private final float barCornerRadius;
    private final float[] barCorners;
    private final float barHeight;
    private String barLabel;
    private final Paint barPaint;
    private final Path barPath;
    private final RectF barRect;
    private final float horizontalOffset;
    private final Rect labelBoundsRect;
    private final TextPaint labelPaint;
    private boolean selected;
    private String topText;
    private final float topTextBottomOffset;
    private final TextPaint topTextPaint;

    public DueTimetableUnavailableSlotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.horizontalOffset = tje.x(context, 2.0f);
        this.barBottomOffset = tje.x(context, 32.0f);
        this.topTextBottomOffset = tje.x(context, 12.0f);
        this.barHeight = tje.x(context, 4.0f);
        float x = tje.x(context, 4.0f);
        this.barCornerRadius = x;
        TextPaint textPaint = new TextPaint();
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setTextSize(tje.r(mrg0.component_text_size_caption, getContext()));
        int[] iArr = up11.a;
        textPaint.setTypeface(eja1.w(3, 0));
        this.topTextPaint = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextAlign(align);
        textPaint2.setTextSize(tje.r(mrg0.component_text_size_caption, getContext()));
        textPaint2.setTypeface(eja1.w(3, 0));
        this.labelPaint = textPaint2;
        this.barPaint = new Paint(1);
        this.barCorners = new float[]{x, x, x, x, 0.0f, 0.0f, 0.0f, 0.0f};
        this.barPath = new Path();
        this.barRect = new RectF();
        this.labelBoundsRect = new Rect();
        this.topText = "";
        this.barLabel = "";
        applyThemeColors();
    }

    private final void applyThemeColors() {
        Paint paint = this.barPaint;
        int t = qje.t(xng0.bgInvert, getContext());
        paint.setColor(Color.argb((int) (Color.alpha(t) * 0.5f), Color.red(t), Color.green(t), Color.blue(t)));
        this.topTextPaint.setColor(qje.t(xng0.textMinor, getContext()));
        updateBarSelection(this.selected);
    }

    private final StaticLayout createStaticLayout(String label, int labelWidth, TextPaint labelPaint) {
        return StaticLayout.Builder.obtain(label, 0, label.length(), labelPaint, labelWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).build();
    }

    private final void drawBar(Canvas canvas) {
        canvas.drawPath(this.barPath, this.barPaint);
    }

    private final void drawLabel(Canvas canvas) {
        TextPaint textPaint = this.labelPaint;
        String str = this.barLabel;
        textPaint.getTextBounds(str, 0, str.length(), this.labelBoundsRect);
        canvas.drawText(this.barLabel, (canvas.getWidth() / 2.0f) - this.labelBoundsRect.left, (canvas.getHeight() - (this.barBottomOffset / 2.0f)) + (((this.labelPaint.descent() - this.labelPaint.ascent()) / 2.0f) - this.labelPaint.descent()), this.labelPaint);
    }

    private final void drawTopText(Canvas canvas) {
        StaticLayout createStaticLayout = createStaticLayout(this.topText, canvas.getWidth(), this.topTextPaint);
        float height = ((canvas.getHeight() - this.barBottomOffset) - this.topTextBottomOffset) - createStaticLayout.getHeight();
        int save = canvas.save();
        canvas.translate(canvas.getWidth() / 2.0f, height);
        try {
            createStaticLayout.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    private final void updateBarPath(int width, int height) {
        float f = height - this.barBottomOffset;
        RectF rectF = this.barRect;
        float f2 = this.horizontalOffset;
        rectF.set(f2, f - this.barHeight, width - f2, f);
        this.barPath.reset();
        this.barPath.addRoundRect(this.barRect, this.barCorners, Path.Direction.CW);
    }

    private final void updateBarSelection(boolean selected) {
        this.labelPaint.setColor(selected ? qje.t(xng0.textMain, getContext()) : qje.t(xng0.textMinor, getContext()));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyThemeColors();
        invalidate();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBar(canvas);
        drawTopText(canvas);
        drawLabel(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateBarPath(w, h);
    }

    public final void setBarLabel(String barLabel) {
        this.barLabel = barLabel;
        invalidate();
    }

    public final void setBarSelected(boolean selected) {
        this.selected = selected;
        setSelected(selected);
        updateBarSelection(selected);
        invalidate();
    }

    public final void setTopText(String topText) {
        this.topText = topText;
        invalidate();
    }

    public DueTimetableUnavailableSlotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DueTimetableUnavailableSlotView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DueTimetableUnavailableSlotView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
