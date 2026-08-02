package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class wra extends g7b {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final ol i;
    public final cx3 j;
    public final gb k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public wra(a7b a7bVar) {
        super(a7bVar);
        this.i = new ol(14, this);
        this.j = new cx3(9, this);
        this.k = new gb(2, this);
        this.o = Long.MAX_VALUE;
        this.f = szf.p0(a7bVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = szf.p0(a7bVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = szf.q0(a7bVar.getContext(), R.attr.motionEasingLinearInterpolator, wm0.a);
    }

    @Override // defpackage.g7b
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new sr7(9, this));
    }

    @Override // defpackage.g7b
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.g7b
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.g7b
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.g7b
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.g7b
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.g7b
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.g7b
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.g7b
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            wvs.p("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new de8(2, this));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: vra
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                wra wraVar = wra.this;
                wraVar.m = true;
                wraVar.o = SystemClock.uptimeMillis();
                wraVar.s(false);
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

    @Override // defpackage.g7b
    public final void m(vb vbVar) {
        if (this.h.getInputType() == 0) {
            vbVar.n(Spinner.class.getName());
        }
        if (vbVar.h()) {
            vbVar.t(null);
        }
    }

    @Override // defpackage.g7b
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

    @Override // defpackage.g7b
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new hr2(6, this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new hr2(6, this));
        this.q = ofFloat2;
        ofFloat2.addListener(new le(4, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.g7b
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
        long uptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
