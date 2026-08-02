package ru.yandex.taxi.order.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import defpackage.z4m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/order/view/DotsView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "", "dotsPattern", "setDotsPattern", "(Ljava/lang/String;)V", "Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "Ljava/lang/StringBuilder;", "Companion", "z4m", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DotsView extends RobotoTextView {
    public static final int $stable = 8;
    public static final z4m Companion = new z4m();
    private static final String DEFAULT_DOTS_PATTERN = " .";
    private final StringBuilder builder;
    private String dotsPattern;

    public DotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.dotsPattern = DEFAULT_DOTS_PATTERN;
        this.builder = new StringBuilder(32);
        setImportantForAccessibility(2);
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int max = Math.max(getMeasuredWidth(), getMinWidth());
        TextPaint paint = getPaint();
        String str = this.dotsPattern;
        int i = 0;
        int measureText = (int) (max / paint.measureText(str, 0, str.length()));
        int length = this.dotsPattern.length() * measureText;
        this.builder.setLength(0);
        this.builder.ensureCapacity(length);
        while (true) {
            StringBuilder sb = this.builder;
            if (i >= measureText) {
                setText(sb.toString());
                return;
            } else {
                sb.append(this.dotsPattern);
                i++;
            }
        }
    }

    public final void setDotsPattern(String dotsPattern) {
        this.dotsPattern = dotsPattern;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DotsView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DotsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
