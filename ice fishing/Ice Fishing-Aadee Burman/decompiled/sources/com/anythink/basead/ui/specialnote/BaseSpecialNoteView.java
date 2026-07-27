package com.anythink.basead.ui.specialnote;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.a.c;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public abstract class BaseSpecialNoteView extends LinearLayout {
    public static final long SEPECIAL_NOTE_INTERVAL_TIME = 500;

    /* renamed from: a, reason: collision with root package name */
    final String f11287a;

    /* renamed from: b, reason: collision with root package name */
    final long f11288b;

    /* renamed from: c, reason: collision with root package name */
    final int f11289c;

    /* renamed from: d, reason: collision with root package name */
    long f11290d;

    /* renamed from: e, reason: collision with root package name */
    long f11291e;

    /* renamed from: f, reason: collision with root package name */
    long f11292f;

    /* renamed from: g, reason: collision with root package name */
    long f11293g;

    /* renamed from: h, reason: collision with root package name */
    a f11294h;
    Runnable i;

    /* renamed from: j, reason: collision with root package name */
    c f11295j;

    /* renamed from: k, reason: collision with root package name */
    f.b f11296k;

    /* renamed from: l, reason: collision with root package name */
    TextView f11297l;

    /* renamed from: m, reason: collision with root package name */
    TextView f11298m;

    /* renamed from: n, reason: collision with root package name */
    String f11299n;

    /* renamed from: o, reason: collision with root package name */
    private View f11300o;

    /* renamed from: p, reason: collision with root package name */
    private int f11301p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11302q;

    /* renamed from: com.anythink.basead.ui.specialnote.BaseSpecialNoteView$4, reason: invalid class name */
    public class AnonymousClass4 extends com.anythink.core.common.v.a.a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
        public final int getImpressionMinPercentageViewed() {
            return 50;
        }

        @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
        public final void recordImpression(View view) {
            BaseSpecialNoteView.this.e();
        }
    }

    public interface a {
        void a(int i);
    }

    public BaseSpecialNoteView(Context context) {
        super(context);
        this.f11287a = getClass().getSimpleName();
        this.f11288b = 500L;
        this.f11289c = 50;
        this.f11299n = "";
        this.f11302q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f11294h == null) {
            return;
        }
        postDelayed(this.i, 500L);
    }

    private void f() {
        View view = this.f11300o;
        if (view == null) {
            return;
        }
        this.f11295j.a(view, new AnonymousClass4());
    }

    private void g() {
        if (getWindowVisibility() == 0) {
            if (j()) {
                long j6 = this.f11291e;
                if (j6 > 0) {
                    this.f11291e = j6 - 500;
                } else {
                    long j9 = this.f11293g;
                    if (j9 > 0) {
                        this.f11293g = j9 - 500;
                    }
                }
                h();
                e();
                return;
            }
        } else if (d()) {
            k();
        }
        View view = this.f11300o;
        if (view != null) {
            this.f11295j.a(view, new AnonymousClass4());
        }
    }

    private void h() {
        if (this.f11291e > 0) {
            if (getVisibility() == 0) {
                setVisibility(4);
                return;
            }
            return;
        }
        long j6 = this.f11293g;
        if (j6 <= 0) {
            i();
            return;
        }
        this.f11297l.setText(Html.fromHtml(String.format(this.f11299n, Integer.valueOf(((int) (j6 / 1000)) + 1))));
        if (getVisibility() != 0) {
            this.f11302q = true;
            c();
        }
    }

    private void i() {
        if (this.f11300o == null) {
            return;
        }
        int i = this.f11301p;
        a aVar = this.f11294h;
        if (aVar != null) {
            aVar.a(i);
        }
        release();
    }

    private boolean j() {
        View view = this.f11300o;
        if (view != null && view.getParent() != null) {
            Object parent = this.f11300o.getParent();
            if (parent instanceof View) {
                return this.f11296k.a((View) parent, this.f11300o, 50, 0);
            }
        }
        return false;
    }

    private void k() {
        this.f11291e = this.f11290d;
        this.f11293g = this.f11292f;
        setVisibility(4);
        this.f11302q = false;
    }

    public void a() {
        this.f11299n = getContext().getString(q.a(t.b().g(), "myoffer_special_note_delay_click", k.f19636g));
    }

    public abstract void b();

    public void c() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseSpecialNoteView.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                BaseSpecialNoteView.this.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                BaseSpecialNoteView.this.setAlpha(((Float) ofFloat.getAnimatedValue()).floatValue());
                BaseSpecialNoteView.this.setVisibility(0);
            }
        });
        ofFloat.start();
    }

    public abstract boolean d();

    public boolean hasBeenShow() {
        return this.f11302q;
    }

    public void initSetting(View view, int i, a aVar, long j6, long j9) {
        this.f11301p = i;
        a();
        b();
        setVisibility(4);
        this.f11295j = com.anythink.basead.b.k.a().b();
        this.f11296k = com.anythink.basead.b.k.a().c();
        this.f11300o = view;
        this.f11294h = aVar;
        this.f11290d = j6;
        this.f11292f = j9;
        this.f11291e = j6;
        this.f11293g = j9;
        this.i = new Runnable() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseSpecialNoteView.a(BaseSpecialNoteView.this);
            }
        };
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        TextView textView = this.f11298m;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseSpecialNoteView.this.release();
                }
            });
        }
        TextView textView2 = this.f11297l;
        if (textView2 != null) {
            textView2.setText(Html.fromHtml(String.format(this.f11299n, Integer.valueOf(((int) (this.f11293g / 1000)) + 1))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pause();
    }

    public void pause() {
        setVisibility(4);
        Runnable runnable = this.i;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        View view = this.f11300o;
        if (view != null) {
            this.f11295j.a(view);
        }
    }

    public void release() {
        if (this.f11294h != null) {
            pause();
            this.f11294h = null;
            this.f11300o = null;
        }
    }

    public void reset(int i, long j6, long j9) {
        this.f11301p = i;
        this.f11290d = j6;
        this.f11292f = j9;
        k();
    }

    public void resume() {
        if (j()) {
            h();
        }
        e();
    }

    public static /* synthetic */ void a(BaseSpecialNoteView baseSpecialNoteView) {
        if (baseSpecialNoteView.getWindowVisibility() == 0) {
            if (baseSpecialNoteView.j()) {
                long j6 = baseSpecialNoteView.f11291e;
                if (j6 > 0) {
                    baseSpecialNoteView.f11291e = j6 - 500;
                } else {
                    long j9 = baseSpecialNoteView.f11293g;
                    if (j9 > 0) {
                        baseSpecialNoteView.f11293g = j9 - 500;
                    }
                }
                baseSpecialNoteView.h();
                baseSpecialNoteView.e();
                return;
            }
        } else if (baseSpecialNoteView.d()) {
            baseSpecialNoteView.k();
        }
        View view = baseSpecialNoteView.f11300o;
        if (view != null) {
            baseSpecialNoteView.f11295j.a(view, baseSpecialNoteView.new AnonymousClass4());
        }
    }

    public BaseSpecialNoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11287a = getClass().getSimpleName();
        this.f11288b = 500L;
        this.f11289c = 50;
        this.f11299n = "";
        this.f11302q = false;
    }
}
