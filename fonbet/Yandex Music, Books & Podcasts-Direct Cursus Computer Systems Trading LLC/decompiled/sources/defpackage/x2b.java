package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class x2b extends uqr {
    public CharSequence j;
    public boolean k;
    public TextUtils.TruncateAt l;
    public boolean m;
    public CharSequence n;
    public CharSequence o;
    public boolean p;
    public int q;
    public int r;
    public CharSequence s;
    public float t;
    public boolean u;
    public final z0j v;

    public x2b(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CharSequence charSequence = "…";
        this.j = "…";
        this.l = TextUtils.TruncateAt.END;
        this.q = -1;
        this.r = -1;
        this.t = -1.0f;
        this.v = new z0j(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xdn.b, i, 0);
            try {
                CharSequence text = obtainStyledAttributes.getText(0);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        p(this.j);
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.n = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence charSequence) {
        this.p = true;
        super.setText(charSequence);
        this.p = false;
    }

    public final boolean getAutoEllipsize() {
        return this.k;
    }

    public final CharSequence getDisplayText() {
        return this.o;
    }

    @NotNull
    public final kqa getDrawingPassOverrideStrategy$div_release() {
        return (kqa) this.v.d;
    }

    @NotNull
    public final CharSequence getEllipsis() {
        return this.j;
    }

    public final TextUtils.TruncateAt getEllipsisLocation() {
        return this.l;
    }

    public final CharSequence getEllipsizedText() {
        return this.n;
    }

    public final int getLastMeasuredHeight() {
        return this.r;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    @NotNull
    public CharSequence getText() {
        CharSequence charSequence = this.n;
        if (charSequence != null) {
            return charSequence;
        }
        CharSequence charSequence2 = this.s;
        return charSequence2 == null ? "" : charSequence2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z0j z0jVar = this.v;
        if (z0jVar.b && ((gzj) z0jVar.e) == null) {
            z0jVar.e = new gzj(new oqj(new k5(9, z0jVar)), (kqa) z0jVar.d);
            ((x2b) z0jVar.c).getViewTreeObserver().addOnPreDrawListener((gzj) z0jVar.e);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z0j z0jVar = this.v;
        if (((gzj) z0jVar.e) != null) {
            ((x2b) z0jVar.c).getViewTreeObserver().removeOnPreDrawListener((gzj) z0jVar.e);
            z0jVar.e = null;
        }
    }

    @Override // defpackage.uqr, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int i3;
        int measuredWidth;
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i4 = this.q;
        int i5 = this.r;
        if (measuredWidth2 != i4 || measuredHeight != i5) {
            this.u = true;
        }
        if (this.u) {
            CharSequence charSequence2 = this.n;
            boolean z = getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE || Intrinsics.d(this.j, "…");
            if (this.n != null || !z) {
                CharSequence charSequence3 = this.s;
                if (z) {
                    if (charSequence3 != null) {
                        this.m = !charSequence3.equals(charSequence2);
                    } else {
                        charSequence3 = null;
                    }
                    setEllipsizedText(charSequence3);
                } else {
                    if (charSequence3 != null && charSequence3.length() != 0) {
                        CharSequence charSequence4 = this.j;
                        if (charSequence3.length() == 0 || getMaxLines() == 0 || (measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) <= 0) {
                            charSequence = charSequence4;
                            i3 = 0;
                        } else {
                            StaticLayout staticLayout = (Build.VERSION.SDK_INT < 26 || getHyphenationFrequency() == 0) ? new StaticLayout(charSequence3, getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true) : StaticLayout.Builder.obtain(charSequence3, 0, charSequence3.length(), getPaint(), measuredWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
                            int lineCount = staticLayout.getLineCount();
                            float lineWidth = staticLayout.getLineWidth(lineCount - 1);
                            if (lineCount < getMaxLines() || (lineCount == getMaxLines() && lineWidth <= measuredWidth)) {
                                charSequence = charSequence4;
                                this.m = true;
                                i3 = charSequence3.length();
                            } else {
                                if (this.t == -1.0f) {
                                    charSequence = charSequence4;
                                    this.t = new StaticLayout(charSequence, getPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true).getLineWidth(0);
                                } else {
                                    charSequence = charSequence4;
                                }
                                this.m = true;
                                float f = measuredWidth - this.t;
                                i3 = staticLayout.getOffsetForHorizontal(getMaxLines() - 1, f);
                                while (staticLayout.getPrimaryHorizontal(i3) > f && i3 > 0) {
                                    i3--;
                                }
                                if (i3 > 0 && Character.isHighSurrogate(charSequence3.charAt(i3 - 1))) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 > 0) {
                            if (i3 != charSequence3.length()) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence3, 0, i3);
                                spannableStringBuilder.append(charSequence);
                                charSequence3 = spannableStringBuilder;
                            }
                            setEllipsizedText(charSequence3);
                        }
                    }
                    charSequence3 = null;
                    setEllipsizedText(charSequence3);
                }
            }
            this.u = false;
            CharSequence charSequence5 = this.n;
            if (charSequence5 != null) {
                if ((this.m ? charSequence5 : null) != null) {
                    super.onMeasure(i, i2);
                }
            }
        }
        this.q = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.u = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.p) {
            return;
        }
        this.s = charSequence;
        requestLayout();
        this.u = true;
    }

    public final void p(CharSequence charSequence) {
        if (getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE) {
            super.setEllipsize(null);
        } else if (Intrinsics.d(charSequence, "…")) {
            super.setEllipsize(this.l);
        } else {
            super.setEllipsize(null);
            this.u = true;
            this.t = -1.0f;
            this.m = false;
        }
        requestLayout();
    }

    public final void setAutoEllipsize(boolean z) {
        this.k = z;
        this.v.b = z;
    }

    public final void setDrawingPassOverrideStrategy$div_release(@NotNull kqa kqaVar) {
        this.v.d = kqaVar;
    }

    public final void setEllipsis(@NotNull CharSequence charSequence) {
        p(charSequence);
        this.j = charSequence;
    }

    public final void setEllipsisLocation(TextUtils.TruncateAt truncateAt) {
        this.l = truncateAt;
        if (truncateAt == null) {
            setAutoEllipsize(false);
        }
        p(this.j);
    }

    public final void setInternalTextChange(boolean z) {
        this.p = z;
    }

    public final void setLastMeasuredHeight(int i) {
        this.r = i;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i == getMaxLines()) {
            return;
        }
        super.setMaxLines(i);
        p(this.j);
        this.u = true;
        this.t = -1.0f;
        this.m = false;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.o = charSequence;
        super.setText(charSequence, bufferType);
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    public static /* synthetic */ void getDisplayText$annotations() {
    }

    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public x2b(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ x2b(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public x2b(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
