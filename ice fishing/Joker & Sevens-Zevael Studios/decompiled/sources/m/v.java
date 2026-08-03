package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class v extends TextView implements l3.b {

    /* renamed from: g, reason: collision with root package name */
    public final n f4486g;

    /* renamed from: h, reason: collision with root package name */
    public final u f4487h;

    /* renamed from: i, reason: collision with root package name */
    public final x4.c f4488i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4489j;

    /* renamed from: k, reason: collision with root package name */
    public Future f4490k;

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4486g;
        if (nVar != null) {
            nVar.a();
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l3.b.f4131b) {
            return super.getAutoSizeMaxTextSize();
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            return Math.round(uVar.f4473i.f4501e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l3.b.f4131b) {
            return super.getAutoSizeMinTextSize();
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            return Math.round(uVar.f4473i.f4500d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l3.b.f4131b) {
            return super.getAutoSizeStepGranularity();
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            return Math.round(uVar.f4473i.f4499c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l3.b.f4131b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        u uVar = this.f4487h;
        return uVar != null ? uVar.f4473i.f4502f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (l3.b.f4131b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            return uVar.f4473i.f4497a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        l1 l1Var;
        n nVar = this.f4486g;
        if (nVar == null || (l1Var = (l1) nVar.f4392e) == null) {
            return null;
        }
        return l1Var.f4380a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l1 l1Var;
        n nVar = this.f4486g;
        if (nVar == null || (l1Var = (l1) nVar.f4392e) == null) {
            return null;
        }
        return l1Var.f4381b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        l1 l1Var = this.f4487h.f4472h;
        if (l1Var != null) {
            return l1Var.f4380a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        l1 l1Var = this.f4487h.f4472h;
        if (l1Var != null) {
            return l1Var.f4381b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f4490k;
        if (future != null) {
            try {
                this.f4490k = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                v6.a.G(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x4.c cVar;
        if (Build.VERSION.SDK_INT >= 28 || (cVar = this.f4488i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) cVar.f8291h;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((v) cVar.f8290g).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public f3.a getTextMetricsParamsCompat() {
        return v6.a.G(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4487h.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i10 >= 30) {
                a2.c.g(editorInfo, text);
            } else {
                text.getClass();
                if (i10 >= 30) {
                    a2.c.g(editorInfo, text);
                } else {
                    int i11 = editorInfo.initialSelStart;
                    int i12 = editorInfo.initialSelEnd;
                    int i13 = i11 > i12 ? i12 : i11;
                    if (i11 <= i12) {
                        i11 = i12;
                    }
                    int length = text.length();
                    if (i13 < 0 || i11 > length) {
                        i7.b.D(editorInfo, null, 0, 0);
                    } else {
                        int i14 = editorInfo.inputType & 4095;
                        if (i14 == 129 || i14 == 225 || i14 == 18) {
                            i7.b.D(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            i7.b.D(editorInfo, text, i13, i11);
                        } else {
                            int i15 = i11 - i13;
                            int i16 = i15 > 1024 ? 0 : i15;
                            int i17 = 2048 - i16;
                            int min = Math.min(text.length() - i11, i17 - Math.min(i13, (int) (i17 * 0.8d)));
                            int min2 = Math.min(i13, i17 - min);
                            int i18 = i13 - min2;
                            if (Character.isLowSurrogate(text.charAt(i18))) {
                                i18++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                                min--;
                            }
                            int i19 = min2 + i16;
                            i7.b.D(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + min2), text.subSequence(i11, min + i11)) : text.subSequence(i18, i19 + min + i18), min2, i19);
                        }
                    }
                }
            }
        }
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        u uVar = this.f4487h;
        if (uVar == null || l3.b.f4131b) {
            return;
        }
        uVar.f4473i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future future = this.f4490k;
        if (future != null) {
            try {
                this.f4490k = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                v6.a.G(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        u uVar = this.f4487h;
        if (uVar == null || l3.b.f4131b) {
            return;
        }
        z zVar = uVar.f4473i;
        if (zVar.f4497a != 0) {
            zVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (l3.b.f4131b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            z zVar = uVar.f4473i;
            DisplayMetrics displayMetrics = zVar.f4506j.getResources().getDisplayMetrics();
            zVar.i(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (zVar.g()) {
                zVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (l3.b.f4131b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            z zVar = uVar.f4473i;
            zVar.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = zVar.f4506j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                zVar.f4502f = z.b(iArr2);
                if (!zVar.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                zVar.f4503g = false;
            }
            if (zVar.g()) {
                zVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (l3.b.f4131b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            z zVar = uVar.f4473i;
            if (i10 == 0) {
                zVar.f4497a = 0;
                zVar.f4500d = -1.0f;
                zVar.f4501e = -1.0f;
                zVar.f4499c = -1.0f;
                zVar.f4502f = new int[0];
                zVar.f4498b = false;
                return;
            }
            if (i10 != 1) {
                zVar.getClass();
                throw new IllegalArgumentException(a4.d.g("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = zVar.f4506j.getResources().getDisplayMetrics();
            zVar.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (zVar.g()) {
                zVar.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4486g;
        if (nVar != null) {
            nVar.f4388a = -1;
            nVar.d(null);
            nVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f4486g;
        if (nVar != null) {
            nVar.c(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u uVar = this.f4487h;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u uVar = this.f4487h;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u uVar = this.f4487h;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u uVar = this.f4487h;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT <= 27 && !(callback instanceof l3.j) && callback != null) {
            callback = new l3.j(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            v6.a.S(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            v6.a.T(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(f3.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        v6.a.G(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4486g;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4486g;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        u uVar = this.f4487h;
        if (uVar.f4472h == null) {
            uVar.f4472h = new l1();
        }
        l1 l1Var = uVar.f4472h;
        l1Var.f4380a = colorStateList;
        l1Var.f4383d = colorStateList != null;
        uVar.f4466b = l1Var;
        uVar.f4467c = l1Var;
        uVar.f4468d = l1Var;
        uVar.f4469e = l1Var;
        uVar.f4470f = l1Var;
        uVar.f4471g = l1Var;
        uVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u uVar = this.f4487h;
        if (uVar.f4472h == null) {
            uVar.f4472h = new l1();
        }
        l1 l1Var = uVar.f4472h;
        l1Var.f4381b = mode;
        l1Var.f4382c = mode != null;
        uVar.f4466b = l1Var;
        uVar.f4467c = l1Var;
        uVar.f4468d = l1Var;
        uVar.f4469e = l1Var;
        uVar.f4470f = l1Var;
        uVar.f4471g = l1Var;
        uVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        u uVar = this.f4487h;
        if (uVar != null) {
            uVar.e(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x4.c cVar;
        if (Build.VERSION.SDK_INT >= 28 || (cVar = this.f4488i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            cVar.f8291h = textClassifier;
        }
    }

    public void setTextFuture(Future<f3.b> future) {
        this.f4490k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(f3.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f2309b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(aVar.f2308a);
        setBreakStrategy(aVar.f2310c);
        setHyphenationFrequency(aVar.f2311d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10 = l3.b.f4131b;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        u uVar = this.f4487h;
        if (uVar != null) {
            z zVar = uVar.f4473i;
            if (z10 || zVar.f4497a != 0) {
                return;
            }
            zVar.f(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.f4489j) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            v6.a aVar = a3.d.f199a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i10);
        }
        this.f4489j = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f4489j = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        k1.a(context);
        this.f4489j = false;
        j1.a(this, getContext());
        n nVar = new n(this);
        this.f4486g = nVar;
        nVar.b(attributeSet, i10);
        u uVar = new u(this);
        this.f4487h = uVar;
        uVar.d(attributeSet, i10);
        uVar.b();
        x4.c cVar = new x4.c();
        cVar.f8290g = this;
        this.f4488i = cVar;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? j.a.a(context, i10) : null, i11 != 0 ? j.a.a(context, i11) : null, i12 != 0 ? j.a.a(context, i12) : null, i13 != 0 ? j.a.a(context, i13) : null);
        u uVar = this.f4487h;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? j.a.a(context, i10) : null, i11 != 0 ? j.a.a(context, i11) : null, i12 != 0 ? j.a.a(context, i12) : null, i13 != 0 ? j.a.a(context, i13) : null);
        u uVar = this.f4487h;
        if (uVar != null) {
            uVar.b();
        }
    }
}
