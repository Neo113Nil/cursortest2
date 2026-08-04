package com.gamericefishpro.space.na;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.gamericefishpro.space.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends q {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final a i;
    public final b j;
    public final l k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.gamericefishpro.space.na.l] */
    public m(p pVar) {
        super(pVar);
        int i = 1;
        this.i = new a(this, i);
        this.j = new b(this, i);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.gamericefishpro.space.na.l
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                m mVar = this.d;
                AutoCompleteTextView autoCompleteTextView = mVar.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                mVar.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = com.gamericefishpro.space.a.a.B(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = com.gamericefishpro.space.a.a.B(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = com.gamericefishpro.space.a.a.C(pVar.getContext(), R.attr.motionEasingLinearInterpolator, com.gamericefishpro.space.t9.a.a);
    }

    @Override // com.gamericefishpro.space.na.q
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new com.appsflyer.a(13, this));
    }

    @Override // com.gamericefishpro.space.na.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.gamericefishpro.space.na.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.gamericefishpro.space.na.q
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.gamericefishpro.space.na.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.na.q
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // com.gamericefishpro.space.na.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // com.gamericefishpro.space.na.q
    public final boolean k() {
        return this.n;
    }

    @Override // com.gamericefishpro.space.na.q
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.gamericefishpro.space.na.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    m mVar = this.d;
                    long j = jUptimeMillis - mVar.o;
                    if (j < 0 || j > 300) {
                        mVar.m = false;
                    }
                    mVar.t();
                    mVar.m = true;
                    mVar.o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.gamericefishpro.space.na.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                m mVar = this.a;
                mVar.m = true;
                mVar.o = SystemClock.uptimeMillis();
                mVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.gamericefishpro.space.na.q
    public final void m(com.gamericefishpro.space.e4.h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        if (this.h.getInputType() == 0) {
            hVar.i(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // com.gamericefishpro.space.na.q
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // com.gamericefishpro.space.na.q
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        int i = 0;
        valueAnimatorOfFloat.addUpdateListener(new i(i, this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new i(i, this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new com.gamericefishpro.space.i6.i(2, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // com.gamericefishpro.space.na.q
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
