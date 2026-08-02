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
    private static final String f10754a = "CloseFrameLayout";

    /* renamed from: b, reason: collision with root package name */
    private float f10755b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f10756c;

    /* renamed from: d, reason: collision with root package name */
    private float f10757d;

    public CloseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10755b = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        float f2 = this.f10755b;
        if (f2 > 1.0f) {
            am.a(this, f2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.f10755b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f10756c) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.ui.b
    public void setClickAreaScaleFactor(float f2) {
        this.f10755b = f2;
        if (f2 <= 0.0f) {
            this.f10755b = 1.0f;
        }
        float f9 = this.f10755b;
        if (f9 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseFrameLayout.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseFrameLayout.this.f10756c = new Rect();
                    CloseFrameLayout closeFrameLayout = CloseFrameLayout.this;
                    closeFrameLayout.getHitRect(closeFrameLayout.f10756c);
                    int width = ((int) ((CloseFrameLayout.this.f10755b - 1.0f) * CloseFrameLayout.this.f10756c.width())) / 2;
                    int height = ((int) ((CloseFrameLayout.this.f10755b - 1.0f) * CloseFrameLayout.this.f10756c.height())) / 2;
                    CloseFrameLayout.this.f10756c.top -= height;
                    CloseFrameLayout.this.f10756c.bottom += height;
                    CloseFrameLayout.this.f10756c.left -= width;
                    CloseFrameLayout.this.f10756c.right += width;
                }
            });
        } else if (f9 > 1.0f) {
            am.a(this, f9);
        }
    }

    @Override // com.anythink.basead.ui.b
    public void setClickViewAlpha(double d9) {
        if (this.f10757d < 1.0f && d9 >= 0.0d && d9 <= 1.0d) {
            float f2 = (float) d9;
            try {
                this.f10757d = f2;
                setAlpha(f2);
            } catch (Throwable unused) {
            }
        }
    }
}
