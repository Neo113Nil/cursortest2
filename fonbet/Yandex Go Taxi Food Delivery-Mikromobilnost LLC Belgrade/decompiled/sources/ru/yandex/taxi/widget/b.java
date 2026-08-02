package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import defpackage.lq0;
import defpackage.ngd0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class b {
    public final TextView a;
    public final TextPaint b;
    public final float c;
    public int d;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public ArrayList k;
    public final int e = Integer.MAX_VALUE;
    public final TextWatcher l = new TextWatcher() { // from class: ru.yandex.taxi.widget.AutofitHelper$AutofitTextWatcher
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
            b.this.a();
        }
    };
    public final View.OnLayoutChangeListener m = new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.widget.AutofitHelper$AutofitOnLayoutChangeListener
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            b.this.a();
        }
    };

    public b(TextView textView) {
        this.a = textView;
        this.b = new TextPaint();
        float f = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.b = new TextPaint();
        float textSize = textView.getTextSize();
        if (this.c != textSize) {
            this.c = textSize;
        }
        this.d = textView.getTransformationMethod() instanceof SingleLineTransformationMethod ? 1 : textView.getMaxLines();
        this.f = f * 8.0f;
        this.g = this.c;
        this.h = 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        if (r7 < r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (new android.text.StaticLayout(r12, r13, r14, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() > r5) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        float f = this.f;
        float f2 = this.g;
        int i2 = this.d;
        float f3 = this.h;
        if (i2 > 0 && i2 != Integer.MAX_VALUE) {
            TextView textView = this.a;
            int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
            if (width > 0) {
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null) {
                    text = transformationMethod.getTransformation(text, textView);
                }
                CharSequence charSequence = text;
                Context context = textView.getContext();
                Resources.getSystem();
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                TextPaint paint = textView.getPaint();
                TextPaint textPaint = this.b;
                textPaint.set(paint);
                textPaint.setTextSize(f2);
                if (i2 != 1 || textPaint.measureText(charSequence, 0, charSequence.length()) <= width) {
                    textPaint.setTextSize(TypedValue.applyDimension(0, f2, displayMetrics));
                }
                f2 = ngd0.q(charSequence, textPaint, width, i2, 0.0f, f2, f3, displayMetrics);
                if (this.j) {
                    int height = (textView.getHeight() - textView.getPaddingTop()) - textView.getPaddingTop();
                    int i3 = this.e;
                    if (i3 > 0) {
                        height = Math.min(i3, height);
                    }
                    if (height > 0) {
                        textPaint.setTextSize(f2);
                        i = 0;
                        float height2 = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getHeight();
                        while (height2 > height) {
                            f2 -= 1.0f;
                            if (f2 <= f || f2 <= 0.0f) {
                                break;
                            }
                            textPaint.setTextSize(f2);
                            float height3 = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getHeight();
                            if (Float.compare(height3, height2) == 0) {
                                break;
                            } else {
                                height2 = height3;
                            }
                        }
                    } else {
                        if (f2 >= f) {
                            f = f2;
                        }
                        textView.setTextSize(0, f);
                    }
                } else {
                    i = 0;
                }
                f = f2;
                textView.setTextSize(i, f);
            }
        }
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lq0) it.next()).a();
        }
    }

    public final void b(boolean z) {
        if (this.i != z) {
            this.i = z;
            View.OnLayoutChangeListener onLayoutChangeListener = this.m;
            TextWatcher textWatcher = this.l;
            TextView textView = this.a;
            if (z) {
                textView.addTextChangedListener(textWatcher);
                textView.addOnLayoutChangeListener(onLayoutChangeListener);
                a();
            } else {
                textView.removeTextChangedListener(textWatcher);
                textView.removeOnLayoutChangeListener(onLayoutChangeListener);
                textView.setTextSize(0, this.c);
            }
        }
    }

    public final void c(boolean z) {
        this.j = z;
        b(this.i);
    }

    public final void d(float f, int i) {
        Context context = this.a.getContext();
        Resources.getSystem();
        float applyDimension = TypedValue.applyDimension(i, f, context.getResources().getDisplayMetrics());
        if (applyDimension == this.f) {
            return;
        }
        this.f = applyDimension;
        a();
    }
}
