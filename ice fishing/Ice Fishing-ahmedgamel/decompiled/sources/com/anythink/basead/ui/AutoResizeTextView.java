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
    private static final int f10483a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private static final int f10484b = 5;

    /* renamed from: c, reason: collision with root package name */
    private TextPaint f10485c;

    /* renamed from: d, reason: collision with root package name */
    private float f10486d;

    /* renamed from: e, reason: collision with root package name */
    private float f10487e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10488f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10489g;

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10486d = 1.0f;
        this.f10487e = 0.0f;
        this.f10488f = false;
        this.f10489g = false;
        a();
    }

    private void a() {
        this.f10485c = new TextPaint();
    }

    private void b() {
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.f10489g = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.f10485c.setTextSize(textSize);
            int measureText = (int) this.f10485c.measureText(text, 0, text.length());
            int height2 = new StaticLayout(text, this.f10485c, width, Layout.Alignment.ALIGN_NORMAL, this.f10486d, this.f10487e, true).getHeight();
            if (measureText < width && height2 < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.f10489g = false;
        this.f10488f = false;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f10489g) {
            return;
        }
        if (!this.f10488f) {
            super.onDraw(canvas);
            return;
        }
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.f10489g = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.f10485c.setTextSize(textSize);
            int measureText = (int) this.f10485c.measureText(text, 0, text.length());
            int height2 = new StaticLayout(text, this.f10485c, width, Layout.Alignment.ALIGN_NORMAL, this.f10486d, this.f10487e, true).getHeight();
            if (measureText < width && height2 < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.f10489g = false;
        this.f10488f = false;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        this.f10488f = true;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        super.onTextChanged(charSequence, i, i4, i6);
        this.f10488f = true;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f2, float f9) {
        super.setLineSpacing(f2, f9);
        this.f10486d = f9;
        this.f10487e = f2;
    }

    private int a(CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, this.f10485c, i, Layout.Alignment.ALIGN_NORMAL, this.f10486d, this.f10487e, true).getHeight();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10486d = 1.0f;
        this.f10487e = 0.0f;
        this.f10488f = false;
        this.f10489g = false;
        a();
    }

    public AutoResizeTextView(Context context) {
        super(context);
        this.f10486d = 1.0f;
        this.f10487e = 0.0f;
        this.f10488f = false;
        this.f10489g = false;
        a();
    }
}
