package com.anythink.basead.ui;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.g.j;
import com.anythink.basead.ui.f.e;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public abstract class BaseBannerATView extends BaseATView {

    /* renamed from: A, reason: collision with root package name */
    private e f9813A;
    public final String TAG;

    /* renamed from: a, reason: collision with root package name */
    protected com.anythink.basead.g.a f9814a;

    /* renamed from: b, reason: collision with root package name */
    protected CloseImageView f9815b;

    /* renamed from: c, reason: collision with root package name */
    View f9816c;

    /* renamed from: d, reason: collision with root package name */
    protected com.anythink.basead.ui.f.a f9817d;

    /* renamed from: com.anythink.basead.ui.BaseBannerATView$1, reason: invalid class name */
    public class AnonymousClass1 implements com.anythink.basead.ui.d.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.ui.d.a
        public final void a(int i, int i6) {
            BaseBannerATView.this.a(i, i6);
        }
    }

    public BaseBannerATView(Context context) {
        super(context);
        this.TAG = getClass().getSimpleName();
    }

    private boolean d() {
        if (this.f9816c == null) {
            this.f9816c = findViewById(q.a(getContext(), "myoffer_guide2click_container", "id"));
        }
        View view = this.f9816c;
        return view != null && view.getVisibility() == 0;
    }

    public void b() {
        a(this.f9735f.f14168o.ab() < 0 ? 100 : this.f9735f.f14168o.ab(), new Runnable() { // from class: com.anythink.basead.ui.BaseBannerATView.2
            @Override // java.lang.Runnable
            public final void run() {
                BaseBannerATView.this.j();
            }
        });
    }

    public void c() {
        this.f9815b.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.basead.ui.BaseBannerATView.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                com.anythink.basead.g.a aVar;
                if (motionEvent.getAction() != 0 || (aVar = BaseBannerATView.this.f9814a) == null) {
                    return true;
                }
                aVar.onAdClosed();
                return true;
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void f() {
        com.anythink.basead.g.a aVar = this.f9814a;
        if (aVar != null) {
            aVar.onAdShow(new j());
        }
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e eVar;
        return (d() || (eVar = this.f9813A) == null) ? super.onInterceptTouchEvent(motionEvent) : eVar.a(motionEvent);
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e eVar;
        return (d() || (eVar = this.f9813A) == null) ? super.onTouchEvent(motionEvent) : eVar.a(this, motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z3) {
        super.onVisibilityAggregated(z3);
        if (z3) {
            a(110);
        } else {
            a(111);
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
                a(110);
            } else {
                a(111);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final RelativeLayout.LayoutParams q() {
        int measuredHeight = getMeasuredHeight() - q.a(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, measuredHeight, 0, 0);
        return layoutParams;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final int r() {
        return 4;
    }

    private void a(x xVar, w wVar) {
        if (xVar != null) {
            if (wVar == null || !wVar.c()) {
                y yVar = xVar.f14168o;
                if (yVar != null && yVar.as()) {
                    e eVar = new e();
                    this.f9813A = eVar;
                    eVar.a(true).a(new AnonymousClass1());
                } else {
                    e eVar2 = this.f9813A;
                    if (eVar2 != null) {
                        eVar2.a(false);
                    }
                }
            }
        }
    }

    public BaseBannerATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar);
        this.TAG = getClass().getSimpleName();
        this.f9814a = aVar;
        if (xVar != null) {
            if (wVar == null || !wVar.c()) {
                y yVar = xVar.f14168o;
                if (yVar != null && yVar.as()) {
                    e eVar = new e();
                    this.f9813A = eVar;
                    eVar.a(true).a(new AnonymousClass1());
                } else {
                    e eVar2 = this.f9813A;
                    if (eVar2 != null) {
                        eVar2.a(false);
                    }
                }
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(j jVar) {
        com.anythink.basead.g.a aVar = this.f9814a;
        if (aVar != null) {
            aVar.onAdClick(jVar);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(int i, int i6) {
        super.a(i, i6);
        a((b) this.f9815b, true);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(boolean z3) {
        com.anythink.basead.g.a aVar = this.f9814a;
        if (aVar != null) {
            aVar.onDeeplinkCallback(z3);
        }
    }
}
