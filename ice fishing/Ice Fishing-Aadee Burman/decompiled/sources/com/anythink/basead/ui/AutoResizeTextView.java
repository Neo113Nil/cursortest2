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
    private static final int f9697a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private static final int f9698b = 5;

    /* renamed from: c, reason: collision with root package name */
    private TextPaint f9699c;

    /* renamed from: d, reason: collision with root package name */
    private float f9700d;

    /* renamed from: e, reason: collision with root package name */
    private float f9701e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9702f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9703g;

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9700d = 1.0f;
        this.f9701e = 0.0f;
        this.f9702f = false;
        this.f9703g = false;
        a();
    }

    private void a() {
        this.f9699c = new TextPaint();
    }

    private void b() {
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.f9703g = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.f9699c.setTextSize(textSize);
            int measureText = (int) this.f9699c.measureText(text, 0, text.length());
            int height2 = new StaticLayout(text, this.f9699c, width, Layout.Alignment.ALIGN_NORMAL, this.f9700d, this.f9701e, true).getHeight();
            if (measureText < width && height2 < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.f9703g = false;
        this.f9702f = false;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f9703g) {
            return;
        }
        if (!this.f9702f) {
            super.onDraw(canvas);
            return;
        }
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.f9703g = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.f9699c.setTextSize(textSize);
            int measureText = (int) this.f9699c.measureText(text, 0, text.length());
            int height2 = new StaticLayout(text, this.f9699c, width, Layout.Alignment.ALIGN_NORMAL, this.f9700d, this.f9701e, true).getHeight();
            if (measureText < width && height2 < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.f9703g = false;
        this.f9702f = false;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        this.f9702f = true;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i6, int i9) {
        super.onTextChanged(charSequence, i, i6, i9);
        this.f9702f = true;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f3, float f9) {
        super.setLineSpacing(f3, f9);
        this.f9700d = f9;
        this.f9701e = f3;
    }

    private int a(CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, this.f9699c, i, Layout.Alignment.ALIGN_NORMAL, this.f9700d, this.f9701e, true).getHeight();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9700d = 1.0f;
        this.f9701e = 0.0f;
        this.f9702f = false;
        this.f9703g = false;
        a();
    }

    public AutoResizeTextView(Context context) {
        super(context);
        this.f9700d = 1.0f;
        this.f9701e = 0.0f;
        this.f9702f = false;
        this.f9703g = false;
        a();
    }
}
