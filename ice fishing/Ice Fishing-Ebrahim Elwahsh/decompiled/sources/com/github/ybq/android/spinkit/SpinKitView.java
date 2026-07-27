package com.github.ybq.android.spinkit;

import R1.a;
import U1.e;
import V1.b;
import V1.c;
import V1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.icefishing.icefishingliveapp.C5284R;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public class SpinKitView extends ProgressBar {

    /* renamed from: n, reason: collision with root package name */
    public int f23684n;

    /* renamed from: u, reason: collision with root package name */
    public e f23685u;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.SpinKitViewStyle, C5284R.style.SpinKitView);
        e dVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2793a, C5284R.attr.SpinKitViewStyle, C5284R.style.SpinKitView);
        int i = AbstractC5088e.e(15)[obtainStyledAttributes.getInt(1, 0)];
        this.f23684n = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        switch (AbstractC5088e.d(i)) {
            case 0:
                dVar = new d(2);
                break;
            case 1:
                dVar = new b(2);
                break;
            case 2:
                dVar = new b(8);
                break;
            case 3:
                dVar = new b(7);
                break;
            case 4:
                dVar = new V1.a(4);
                break;
            case 5:
                dVar = new b(0);
                break;
            case 6:
                dVar = new b(6);
                break;
            case 7:
                dVar = new c(0);
                break;
            case 8:
                dVar = new b(1);
                break;
            case 9:
                dVar = new c(1);
                break;
            case 10:
                dVar = new b(3);
                break;
            case 11:
                dVar = new V1.a(5, false);
                break;
            case 12:
                dVar = new b(4);
                break;
            case 13:
                dVar = new V1.e();
                break;
            case 14:
                dVar = new b(5);
                break;
            default:
                dVar = null;
                break;
        }
        dVar.e(this.f23684n);
        setIndeterminateDrawable(dVar);
        setIndeterminate(true);
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i) {
        e eVar;
        super.onScreenStateChanged(i);
        if (i != 0 || (eVar = this.f23685u) == null) {
            return;
        }
        eVar.stop();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8 && this.f23685u != null && getVisibility() == 0) {
            this.f23685u.start();
        }
    }

    public void setColor(int i) {
        this.f23684n = i;
        e eVar = this.f23685u;
        if (eVar != null) {
            eVar.e(i);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (!(drawable instanceof e)) {
            throw new IllegalArgumentException("this d must be instanceof Sprite");
        }
        setIndeterminateDrawable((e) drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof e) {
            ((e) drawable).stop();
        }
    }

    @Override // android.widget.ProgressBar
    public e getIndeterminateDrawable() {
        return this.f23685u;
    }

    public void setIndeterminateDrawable(e eVar) {
        super.setIndeterminateDrawable((Drawable) eVar);
        this.f23685u = eVar;
        if (eVar.c() == 0) {
            this.f23685u.e(this.f23684n);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f23685u.start();
        }
    }
}
