package com.anythink.basead.ui;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.basead.ui.guidetoclickv2.d;

/* loaded from: classes.dex */
public class OwnNativeATView extends FrameLayout implements com.anythink.basead.ui.guidetoclickv2.c {

    /* renamed from: a, reason: collision with root package name */
    d f10159a;

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.basead.ui.f.c f10160b;

    /* renamed from: c, reason: collision with root package name */
    private a f10161c;

    public interface a {
        void a();

        void b();
    }

    public OwnNativeATView(Context context) {
        super(context);
    }

    private boolean a(MotionEvent motionEvent) {
        synchronized (this) {
            try {
                d dVar = this.f10159a;
                if (dVar != null) {
                    if (dVar.a(motionEvent)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    private void b() {
        a aVar = this.f10161c;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.anythink.basead.ui.f.c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            com.anythink.basead.ui.f.c cVar2 = this.f10160b;
            if (cVar2 != null) {
                cVar2.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        } else if ((action == 1 || action == 3) && (cVar = this.f10160b) != null) {
            cVar.b((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.anythink.basead.d.a getAdClickRecord(int i) {
        com.anythink.basead.ui.f.c cVar = this.f10160b;
        if (cVar != null) {
            return cVar.a(i);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z3) {
        super.onVisibilityAggregated(z3);
        if (z3) {
            a();
        } else {
            b();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (Build.VERSION.SDK_INT < 28) {
            if (z3) {
                a();
            } else {
                b();
            }
        }
    }

    public void releaseAllCallback() {
        this.f10159a = null;
        this.f10160b = null;
        this.f10161c = null;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.c
    public void setCallback(d dVar) {
        synchronized (this) {
            this.f10159a = dVar;
        }
    }

    public void setClickRecordHelper(com.anythink.basead.ui.f.c cVar) {
        this.f10160b = cVar;
    }

    public void setLifeCallback(a aVar) {
        this.f10161c = aVar;
    }

    public OwnNativeATView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OwnNativeATView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a() {
        a aVar = this.f10161c;
        if (aVar != null) {
            aVar.a();
        }
    }
}
