package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.anythink.basead.ui.a.a.d;
import com.anythink.basead.ui.a.a.e;
import com.anythink.basead.ui.a.a.f;

/* loaded from: classes.dex */
public class ScanningAnimButton extends Button {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.basead.ui.a.b f11027a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f11028b;

    /* renamed from: c, reason: collision with root package name */
    private int f11029c;

    public ScanningAnimButton(Context context) {
        this(context, null);
    }

    private void a() {
        setGravity(17);
    }

    private void b() {
        com.anythink.basead.ui.a.b bVar = this.f11027a;
        if (bVar != null) {
            bVar.b();
        }
    }

    private void c() {
        com.anythink.basead.ui.a.b bVar = this.f11027a;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f11029c;
        if (i != 0) {
            startAnimation(i);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.anythink.basead.ui.a.b bVar = this.f11027a;
        if (bVar != null) {
            bVar.a(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        com.anythink.basead.ui.a.b bVar = this.f11027a;
        if (bVar != null) {
            bVar.a(getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        com.anythink.basead.ui.a.b bVar = this.f11027a;
        if (bVar != null) {
            bVar.a(i, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            com.anythink.basead.ui.a.b bVar = this.f11027a;
            if (bVar != null) {
                bVar.c();
                return;
            }
            return;
        }
        com.anythink.basead.ui.a.b bVar2 = this.f11027a;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    public void startAnimation(int i) {
        this.f11029c = i;
        if (this.f11028b) {
            return;
        }
        this.f11028b = true;
        com.anythink.basead.ui.a.b bVar = this.f11027a;
        if (bVar != null) {
            bVar.d();
        }
        com.anythink.basead.ui.a.b eVar = i != 2 ? i != 3 ? i != 4 ? i != 5 ? new e(this) : new com.anythink.basead.ui.a.a.b(this) : new com.anythink.basead.ui.a.a.c(this) : new d(this) : new f(this);
        this.f11027a = eVar;
        eVar.a();
    }

    public void stopAnimation() {
        com.anythink.basead.ui.a.b bVar = this.f11027a;
        if (bVar != null) {
            bVar.d();
        }
        this.f11028b = false;
    }

    public ScanningAnimButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScanningAnimButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11029c = 0;
        setGravity(17);
    }
}
