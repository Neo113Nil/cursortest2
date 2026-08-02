package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public class CloseImageView extends ImageView implements b {

    /* renamed from: a, reason: collision with root package name */
    private final String f10766a;

    /* renamed from: b, reason: collision with root package name */
    private float f10767b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f10768c;

    /* renamed from: d, reason: collision with root package name */
    private float f10769d;

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10766a = getClass().getSimpleName();
        this.f10767b = 1.0f;
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        float f2 = this.f10767b;
        if (f2 > 1.0f) {
            am.a(this, f2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.f10767b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f10768c) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.ui.b
    public void setClickAreaScaleFactor(float f2) {
        this.f10767b = f2;
        if (f2 <= 0.0f) {
            this.f10767b = 1.0f;
        }
        float f9 = this.f10767b;
        if (f9 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseImageView.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseImageView.this.f10768c = new Rect();
                    CloseImageView closeImageView = CloseImageView.this;
                    closeImageView.getHitRect(closeImageView.f10768c);
                    int width = ((int) ((CloseImageView.this.f10767b - 1.0f) * CloseImageView.this.f10768c.width())) / 2;
                    int height = ((int) ((CloseImageView.this.f10767b - 1.0f) * CloseImageView.this.f10768c.height())) / 2;
                    CloseImageView.this.f10768c.top -= height;
                    CloseImageView.this.f10768c.bottom += height;
                    CloseImageView.this.f10768c.left -= width;
                    CloseImageView.this.f10768c.right += width;
                }
            });
        } else if (f9 > 1.0f) {
            am.a(this, f9);
        }
    }

    @Override // com.anythink.basead.ui.b
    public void setClickViewAlpha(double d9) {
        if (this.f10769d < 1.0f && d9 >= 0.0d && d9 <= 1.0d) {
            float f2 = (float) d9;
            try {
                this.f10769d = f2;
                setAlpha(f2);
            } catch (Throwable unused) {
            }
        }
    }
}
