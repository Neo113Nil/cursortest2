package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class AutoResizeTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9854a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private static final int f9855b = 5;

    /* renamed from: c, reason: collision with root package name */
    private TextPaint f9856c;

    /* renamed from: d, reason: collision with root package name */
    private float f9857d;

    /* renamed from: e, reason: collision with root package name */
    private float f9858e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9859f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9860g;

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9857d = 1.0f;
        this.f9858e = 0.0f;
        this.f9859f = false;
        this.f9860g = false;
        a();
    }

    private void a() {
        this.f9856c = new TextPaint();
    }

    private void b() {
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.f9860g = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.f9856c.setTextSize(textSize);
            int measureText = (int) this.f9856c.measureText(text, 0, text.length());
            int height2 = new StaticLayout(text, this.f9856c, width, Layout.Alignment.ALIGN_NORMAL, this.f9857d, this.f9858e, true).getHeight();
            if (measureText < width && height2 < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.f9860g = false;
        this.f9859f = false;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f9860g) {
            return;
        }
        if (!this.f9859f) {
            super.onDraw(canvas);
            return;
        }
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.f9860g = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.f9856c.setTextSize(textSize);
            int measureText = (int) this.f9856c.measureText(text, 0, text.length());
            int height2 = new StaticLayout(text, this.f9856c, width, Layout.Alignment.ALIGN_NORMAL, this.f9857d, this.f9858e, true).getHeight();
            if (measureText < width && height2 < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.f9860g = false;
        this.f9859f = false;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        this.f9859f = true;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i9) {
        super.onTextChanged(charSequence, i, i4, i9);
        this.f9859f = true;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f6, float f9) {
        super.setLineSpacing(f6, f9);
        this.f9857d = f9;
        this.f9858e = f6;
    }

    private int a(CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, this.f9856c, i, Layout.Alignment.ALIGN_NORMAL, this.f9857d, this.f9858e, true).getHeight();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9857d = 1.0f;
        this.f9858e = 0.0f;
        this.f9859f = false;
        this.f9860g = false;
        a();
    }

    public AutoResizeTextView(Context context) {
        super(context);
        this.f9857d = 1.0f;
        this.f9858e = 0.0f;
        this.f9859f = false;
        this.f9860g = false;
        a();
    }
}
