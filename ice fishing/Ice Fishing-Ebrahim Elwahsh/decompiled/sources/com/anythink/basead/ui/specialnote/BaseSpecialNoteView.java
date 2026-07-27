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
    final String f11444a;

    /* renamed from: b, reason: collision with root package name */
    final long f11445b;

    /* renamed from: c, reason: collision with root package name */
    final int f11446c;

    /* renamed from: d, reason: collision with root package name */
    long f11447d;

    /* renamed from: e, reason: collision with root package name */
    long f11448e;

    /* renamed from: f, reason: collision with root package name */
    long f11449f;

    /* renamed from: g, reason: collision with root package name */
    long f11450g;

    /* renamed from: h, reason: collision with root package name */
    a f11451h;
    Runnable i;

    /* renamed from: j, reason: collision with root package name */
    c f11452j;

    /* renamed from: k, reason: collision with root package name */
    f.b f11453k;

    /* renamed from: l, reason: collision with root package name */
    TextView f11454l;

    /* renamed from: m, reason: collision with root package name */
    TextView f11455m;

    /* renamed from: n, reason: collision with root package name */
    String f11456n;

    /* renamed from: o, reason: collision with root package name */
    private View f11457o;

    /* renamed from: p, reason: collision with root package name */
    private int f11458p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11459q;

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
        this.f11444a = getClass().getSimpleName();
        this.f11445b = 500L;
        this.f11446c = 50;
        this.f11456n = "";
        this.f11459q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f11451h == null) {
            return;
        }
        postDelayed(this.i, 500L);
    }

    private void f() {
        View view = this.f11457o;
        if (view == null) {
            return;
        }
        this.f11452j.a(view, new AnonymousClass4());
    }

    private void g() {
        if (getWindowVisibility() == 0) {
            if (j()) {
                long j9 = this.f11448e;
                if (j9 > 0) {
                    this.f11448e = j9 - 500;
                } else {
                    long j10 = this.f11450g;
                    if (j10 > 0) {
                        this.f11450g = j10 - 500;
                    }
                }
                h();
                e();
                return;
            }
        } else if (d()) {
            k();
        }
        View view = this.f11457o;
        if (view != null) {
            this.f11452j.a(view, new AnonymousClass4());
        }
    }

    private void h() {
        if (this.f11448e > 0) {
            if (getVisibility() == 0) {
                setVisibility(4);
                return;
            }
            return;
        }
        long j9 = this.f11450g;
        if (j9 <= 0) {
            i();
            return;
        }
        this.f11454l.setText(Html.fromHtml(String.format(this.f11456n, Integer.valueOf(((int) (j9 / 1000)) + 1))));
        if (getVisibility() != 0) {
            this.f11459q = true;
            c();
        }
    }

    private void i() {
        if (this.f11457o == null) {
            return;
        }
        int i = this.f11458p;
        a aVar = this.f11451h;
        if (aVar != null) {
            aVar.a(i);
        }
        release();
    }

    private boolean j() {
        View view = this.f11457o;
        if (view != null && view.getParent() != null) {
            Object parent = this.f11457o.getParent();
            if (parent instanceof View) {
                return this.f11453k.a((View) parent, this.f11457o, 50, 0);
            }
        }
        return false;
    }

    private void k() {
        this.f11448e = this.f11447d;
        this.f11450g = this.f11449f;
        setVisibility(4);
        this.f11459q = false;
    }

    public void a() {
        this.f11456n = getContext().getString(q.a(t.b().g(), "myoffer_special_note_delay_click", k.f19794g));
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
        return this.f11459q;
    }

    public void initSetting(View view, int i, a aVar, long j9, long j10) {
        this.f11458p = i;
        a();
        b();
        setVisibility(4);
        this.f11452j = com.anythink.basead.b.k.a().b();
        this.f11453k = com.anythink.basead.b.k.a().c();
        this.f11457o = view;
        this.f11451h = aVar;
        this.f11447d = j9;
        this.f11449f = j10;
        this.f11448e = j9;
        this.f11450g = j10;
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
        TextView textView = this.f11455m;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.specialnote.BaseSpecialNoteView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseSpecialNoteView.this.release();
                }
            });
        }
        TextView textView2 = this.f11454l;
        if (textView2 != null) {
            textView2.setText(Html.fromHtml(String.format(this.f11456n, Integer.valueOf(((int) (this.f11450g / 1000)) + 1))));
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
        View view = this.f11457o;
        if (view != null) {
            this.f11452j.a(view);
        }
    }

    public void release() {
        if (this.f11451h != null) {
            pause();
            this.f11451h = null;
            this.f11457o = null;
        }
    }

    public void reset(int i, long j9, long j10) {
        this.f11458p = i;
        this.f11447d = j9;
        this.f11449f = j10;
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
                long j9 = baseSpecialNoteView.f11448e;
                if (j9 > 0) {
                    baseSpecialNoteView.f11448e = j9 - 500;
                } else {
                    long j10 = baseSpecialNoteView.f11450g;
                    if (j10 > 0) {
                        baseSpecialNoteView.f11450g = j10 - 500;
                    }
                }
                baseSpecialNoteView.h();
                baseSpecialNoteView.e();
                return;
            }
        } else if (baseSpecialNoteView.d()) {
            baseSpecialNoteView.k();
        }
        View view = baseSpecialNoteView.f11457o;
        if (view != null) {
            baseSpecialNoteView.f11452j.a(view, baseSpecialNoteView.new AnonymousClass4());
        }
    }

    public BaseSpecialNoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11444a = getClass().getSimpleName();
        this.f11445b = 500L;
        this.f11446c = 50;
        this.f11456n = "";
        this.f11459q = false;
    }
}
