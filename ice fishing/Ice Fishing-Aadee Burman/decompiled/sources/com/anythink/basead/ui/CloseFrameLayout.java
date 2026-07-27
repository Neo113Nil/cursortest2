package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public class CloseFrameLayout extends FrameLayout implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9968a = "CloseFrameLayout";

    /* renamed from: b, reason: collision with root package name */
    private float f9969b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f9970c;

    /* renamed from: d, reason: collision with root package name */
    private float f9971d;

    public CloseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9969b = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        float f3 = this.f9969b;
        if (f3 > 1.0f) {
            am.a(this, f3);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.f9969b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f9970c) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.ui.b
    public void setClickAreaScaleFactor(float f3) {
        this.f9969b = f3;
        if (f3 <= 0.0f) {
            this.f9969b = 1.0f;
        }
        float f9 = this.f9969b;
        if (f9 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseFrameLayout.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseFrameLayout.this.f9970c = new Rect();
                    CloseFrameLayout closeFrameLayout = CloseFrameLayout.this;
                    closeFrameLayout.getHitRect(closeFrameLayout.f9970c);
                    int width = ((int) ((CloseFrameLayout.this.f9969b - 1.0f) * CloseFrameLayout.this.f9970c.width())) / 2;
                    int height = ((int) ((CloseFrameLayout.this.f9969b - 1.0f) * CloseFrameLayout.this.f9970c.height())) / 2;
                    CloseFrameLayout.this.f9970c.top -= height;
                    CloseFrameLayout.this.f9970c.bottom += height;
                    CloseFrameLayout.this.f9970c.left -= width;
                    CloseFrameLayout.this.f9970c.right += width;
                }
            });
        } else if (f9 > 1.0f) {
            am.a(this, f9);
        }
    }

    @Override // com.anythink.basead.ui.b
    public void setClickViewAlpha(double d2) {
        if (this.f9971d < 1.0f && d2 >= 0.0d && d2 <= 1.0d) {
            float f3 = (float) d2;
            try {
                this.f9971d = f3;
                setAlpha(f3);
            } catch (Throwable unused) {
            }
        }
    }
}
