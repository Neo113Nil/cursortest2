package ru.yandex.music.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.y2b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class EllipsizingTextView extends AppCompatTextView {
    public boolean h;
    public boolean i;
    public CharSequence j;
    public CharSequence k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizingTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.k = "...";
    }

    @NotNull
    public final CharSequence getEllipsisText() {
        return this.k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int W;
        canvas.getClass();
        if (this.h) {
            super.setEllipsize(null);
            CharSequence charSequence = this.j;
            if (charSequence != null) {
                if (getMaxLines() != -1) {
                    StaticLayout p = p(charSequence);
                    if (p.getLineCount() > getMaxLines()) {
                        String obj = charSequence.subSequence(0, p.getLineEnd(getMaxLines() - 1)).toString();
                        int length = obj.length() - 1;
                        int i = 0;
                        boolean z = false;
                        while (i <= length) {
                            boolean z2 = Intrinsics.e(obj.charAt(!z ? i : length), 32) <= 0;
                            if (z) {
                                if (!z2) {
                                    break;
                                } else {
                                    length--;
                                }
                            } else if (z2) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                        String obj2 = obj.subSequence(i, length + 1).toString();
                        while (true) {
                            SpannableStringBuilder append = new SpannableStringBuilder(obj2).append(this.k);
                            append.getClass();
                            if (p(append).getLineCount() <= getMaxLines() || (W = StringsKt.W(obj2, ' ', 0, 6)) == -1) {
                                break;
                            } else {
                                obj2 = obj2.subSequence(0, W).toString();
                            }
                        }
                        charSequence = new SpannableStringBuilder(obj2).append(this.k);
                        charSequence.getClass();
                    }
                }
                if (!charSequence.equals(getText())) {
                    this.i = true;
                    try {
                        setText(charSequence);
                    } finally {
                        this.i = false;
                    }
                }
                this.h = false;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y2b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y2b y2bVar = (y2b) parcelable;
        this.i = y2bVar.a;
        this.j = y2bVar.b;
        super.onRestoreInstanceState(y2bVar.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new y2b(this.i, this.j, super.onSaveInstanceState());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.i) {
            return;
        }
        this.j = charSequence;
        this.h = true;
    }

    public final StaticLayout p(CharSequence charSequence) {
        return new StaticLayout(charSequence, getPaint(), ((getWidth() == 0 ? 800 : getWidth()) - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), false);
    }

    public final void setEllipsisText(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        this.k = charSequence;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setEllipsize(@NotNull TextUtils.TruncateAt truncateAt) {
        truncateAt.getClass();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.h = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizingTextView(@NotNull Context context) {
        super(context);
        context.getClass();
        this.k = "...";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizingTextView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        this.k = "...";
    }
}
