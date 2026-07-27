package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.g.d.c;

/* loaded from: classes.dex */
public class ATImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22489a = "at-widget-imageview";

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f22490b;

    /* renamed from: c, reason: collision with root package name */
    private String f22491c;

    /* renamed from: com.anythink.expressad.widget.ATImageView$1, reason: invalid class name */
    public class AnonymousClass1 implements c {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            ATImageView.this.setImageBitmap(bitmap);
        }
    }

    public ATImageView(Context context) {
        super(context);
        this.f22490b = null;
    }

    private void a() {
        if (getContext() != null) {
            b.a(getContext()).a(this.f22491c, new AnonymousClass1());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            Bitmap bitmap = this.f22490b;
            if (bitmap == null || !bitmap.isRecycled()) {
                super.onDraw(canvas);
            } else if (getContext() != null) {
                b.a(getContext()).a(this.f22491c, new AnonymousClass1());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f22490b = bitmap;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.setImageBitmap(bitmap);
        } else {
            this.f22490b = null;
            super.setImageBitmap(null);
        }
    }

    public void setImageUrl(String str) {
        this.f22491c = str;
    }

    public ATImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22490b = null;
    }

    public ATImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22490b = null;
    }
}
