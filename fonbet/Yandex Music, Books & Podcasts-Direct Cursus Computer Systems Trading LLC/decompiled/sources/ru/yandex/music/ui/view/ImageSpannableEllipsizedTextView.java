package ru.yandex.music.ui.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.xqn;
import defpackage.xz0;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.ui.view.ImageSpannableEllipsizedTextView;

/* loaded from: classes6.dex */
public final class ImageSpannableEllipsizedTextView extends AppCompatTextView {
    public static final /* synthetic */ int h = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSpannableEllipsizedTextView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getWidth() <= 0 || i3 == getWidth()) {
            return;
        }
        setText(getText());
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        final xqn xqnVar = new xqn();
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, getPaint(), (getWidth() - getPaddingRight()) - getPaddingLeft(), TextUtils.TruncateAt.END, false, new TextUtils.EllipsizeCallback() { // from class: vce
            @Override // android.text.TextUtils.EllipsizeCallback
            public final void ellipsized(int i, int i2) {
                int i3 = ImageSpannableEllipsizedTextView.h;
                xqn.this.a = Integer.valueOf(i);
            }
        });
        Integer num = (Integer) xqnVar.a;
        if (num != null) {
            int intValue = num.intValue();
            if ((ellipsize instanceof SpannableStringBuilder) && (charSequence instanceof SpannableStringBuilder)) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                Object[] spans = spannableStringBuilder.getSpans(intValue, intValue, ForegroundColorSpan.class);
                spans.getClass();
                ForegroundColorSpan foregroundColorSpan = (ForegroundColorSpan) xz0.z(spans);
                if (foregroundColorSpan != null) {
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) ellipsize;
                    spannableStringBuilder2.setSpan(foregroundColorSpan, spannableStringBuilder.getSpanStart(foregroundColorSpan), spannableStringBuilder2.length(), 18);
                }
            }
        }
        super.setText(ellipsize, bufferType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSpannableEllipsizedTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSpannableEllipsizedTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
