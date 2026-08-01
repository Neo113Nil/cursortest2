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
    private final String f9980a;

    /* renamed from: b, reason: collision with root package name */
    private float f9981b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f9982c;

    /* renamed from: d, reason: collision with root package name */
    private float f9983d;

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9980a = getClass().getSimpleName();
        this.f9981b = 1.0f;
    }

    @Override // android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        float f3 = this.f9981b;
        if (f3 > 1.0f) {
            am.a(this, f3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.f9981b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f9982c) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.ui.b
    public void setClickAreaScaleFactor(float f3) {
        this.f9981b = f3;
        if (f3 <= 0.0f) {
            this.f9981b = 1.0f;
        }
        float f9 = this.f9981b;
        if (f9 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseImageView.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseImageView.this.f9982c = new Rect();
                    CloseImageView closeImageView = CloseImageView.this;
                    closeImageView.getHitRect(closeImageView.f9982c);
                    int width = ((int) ((CloseImageView.this.f9981b - 1.0f) * CloseImageView.this.f9982c.width())) / 2;
                    int height = ((int) ((CloseImageView.this.f9981b - 1.0f) * CloseImageView.this.f9982c.height())) / 2;
                    CloseImageView.this.f9982c.top -= height;
                    CloseImageView.this.f9982c.bottom += height;
                    CloseImageView.this.f9982c.left -= width;
                    CloseImageView.this.f9982c.right += width;
                }
            });
        } else if (f9 > 1.0f) {
            am.a(this, f9);
        }
    }

    @Override // com.anythink.basead.ui.b
    public void setClickViewAlpha(double d2) {
        if (this.f9983d < 1.0f && d2 >= 0.0d && d2 <= 1.0d) {
            float f3 = (float) d2;
            try {
                this.f9983d = f3;
                setAlpha(f3);
            } catch (Throwable unused) {
            }
        }
    }
}
