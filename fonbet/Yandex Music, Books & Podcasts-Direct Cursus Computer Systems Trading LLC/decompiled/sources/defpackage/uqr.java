package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class uqr extends AppCompatTextView implements agc {
    public final zfc h;
    public boolean i;

    public /* synthetic */ uqr(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.h.c;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.h.b;
    }

    public int getFixedLineHeight() {
        return this.h.d;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(getLineCount(), getMaxLines());
        zfc zfcVar = this.h;
        int i3 = zfcVar.d;
        TextView textView = zfcVar.a;
        if (i3 != -1 && !tyf.A(i2)) {
            int paddingBottom = textView.getPaddingBottom() + textView.getPaddingTop() + c9g.N(textView, min) + (min >= textView.getLineCount() ? zfcVar.b + zfcVar.c : 0);
            int minimumHeight = textView.getMinimumHeight();
            if (paddingBottom < minimumHeight) {
                paddingBottom = minimumHeight;
            }
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        u79 u79Var = layoutParams instanceof u79 ? (u79) layoutParams : null;
        if (u79Var != null && this.i && ((ViewGroup.MarginLayoutParams) u79Var).width == -3 && u79Var.h != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float f = 0.0f;
            for (int i4 = 0; i4 < lineCount; i4++) {
                f = Math.max(f, getLayout().getLineWidth(i4));
            }
            int ceil = (int) Math.ceil(f + getCompoundPaddingRight() + getCompoundPaddingLeft());
            if (ceil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(ceil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // defpackage.agc
    public void setFixedLineHeight(int i) {
        zfc zfcVar = this.h;
        if (zfcVar.d == i) {
            return;
        }
        zfcVar.d = i;
        zfcVar.a(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        zfc zfcVar = this.h;
        zfcVar.a(zfcVar.d);
    }

    public final void setTightenWidth(boolean z) {
        boolean z2 = this.i;
        this.i = z;
        if (z2 != z) {
            requestLayout();
        }
    }

    public uqr(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public uqr(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public uqr(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new zfc(this);
    }
}
