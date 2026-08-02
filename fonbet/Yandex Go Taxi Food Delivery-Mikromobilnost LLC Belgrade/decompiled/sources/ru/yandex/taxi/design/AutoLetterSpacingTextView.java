package ru.yandex.taxi.design;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import defpackage.or3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/design/AutoLetterSpacingTextView;", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "", "originalTitleLetterSpacing", "F", "Companion", "or3", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class AutoLetterSpacingTextView extends ShimmeringRobotoTextView {
    public static final or3 Companion = new or3();
    public static final float LETTER_SPACING_FOR_LONG_TITLE = -0.01f;
    private final float originalTitleLetterSpacing;

    public /* synthetic */ AutoLetterSpacingTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        if (lineCount == 0 || layout == null) {
            return;
        }
        int ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        float letterSpacing = getLetterSpacing();
        if (ellipsisCount > 0) {
            setLetterSpacing(-0.01f);
        } else {
            setLetterSpacing(this.originalTitleLetterSpacing);
        }
        if (letterSpacing == getLetterSpacing()) {
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public AutoLetterSpacingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AutoLetterSpacingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.originalTitleLetterSpacing = getLetterSpacing();
    }

    public AutoLetterSpacingTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
