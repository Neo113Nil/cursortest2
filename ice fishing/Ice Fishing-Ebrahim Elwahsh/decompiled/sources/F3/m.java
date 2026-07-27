package F3;

import D.RunnableC0281a;
import O.X;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.icefishing.icefishingliveapp.C5284R;
import j3.AbstractC4596a;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class m extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1042e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1043f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1044g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f1045h;
    public final ViewOnClickListenerC0307a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0308b f1046j;

    /* renamed from: k, reason: collision with root package name */
    public final l f1047k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1048l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1049m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1050n;

    /* renamed from: o, reason: collision with root package name */
    public long f1051o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1052p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1053q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1054r;

    public m(r rVar) {
        super(rVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0307a(i, this);
        this.f1046j = new ViewOnFocusChangeListenerC0308b(this, i);
        this.f1047k = new l(0, this);
        this.f1051o = Long.MAX_VALUE;
        this.f1043f = K3.b.y(rVar.getContext(), C5284R.attr.motionDurationShort3, 67);
        this.f1042e = K3.b.y(rVar.getContext(), C5284R.attr.motionDurationShort3, 50);
        this.f1044g = K3.b.z(rVar.getContext(), C5284R.attr.motionEasingLinearInterpolator, AbstractC4596a.f38541a);
    }

    @Override // F3.s
    public final void a() {
        if (this.f1052p.isTouchExplorationEnabled() && W2.e.l(this.f1045h) && !this.f1087d.hasFocus()) {
            this.f1045h.dismissDropDown();
        }
        this.f1045h.post(new RunnableC0281a(3, this));
    }

    @Override // F3.s
    public final int c() {
        return C5284R.string.exposed_dropdown_menu_content_description;
    }

    @Override // F3.s
    public final int d() {
        return C5284R.drawable.mtrl_dropdown_arrow;
    }

    @Override // F3.s
    public final View.OnFocusChangeListener e() {
        return this.f1046j;
    }

    @Override // F3.s
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // F3.s
    public final l h() {
        return this.f1047k;
    }

    @Override // F3.s
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // F3.s
    public final boolean j() {
        return this.f1048l;
    }

    @Override // F3.s
    public final boolean l() {
        return this.f1050n;
    }

    @Override // F3.s
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1045h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: F3.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                m mVar = m.this;
                mVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - mVar.f1051o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        mVar.f1049m = false;
                    }
                    mVar.u();
                    mVar.f1049m = true;
                    mVar.f1051o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f1045h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: F3.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                m mVar = m.this;
                mVar.f1049m = true;
                mVar.f1051o = System.currentTimeMillis();
                mVar.t(false);
            }
        });
        this.f1045h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1084a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!W2.e.l(editText) && this.f1052p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = X.f2240a;
            this.f1087d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // F3.s
    public final void n(P.k kVar) {
        if (!W2.e.l(this.f1045h)) {
            kVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? kVar.f2675a.isShowingHintText() : kVar.e(4)) {
            kVar.k(null);
        }
    }

    @Override // F3.s
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1052p.isEnabled() || W2.e.l(this.f1045h)) {
            return;
        }
        boolean z8 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1050n && !this.f1045h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z8) {
            u();
            this.f1049m = true;
            this.f1051o = System.currentTimeMillis();
        }
    }

    @Override // F3.s
    public final void r() {
        int i = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1044g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1043f);
        ofFloat.addUpdateListener(new i(i, this));
        this.f1054r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f1042e);
        ofFloat2.addUpdateListener(new i(i, this));
        this.f1053q = ofFloat2;
        ofFloat2.addListener(new D0.k(2, this));
        this.f1052p = (AccessibilityManager) this.f1086c.getSystemService("accessibility");
    }

    @Override // F3.s
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f1045h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1045h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z8) {
        if (this.f1050n != z8) {
            this.f1050n = z8;
            this.f1054r.cancel();
            this.f1053q.start();
        }
    }

    public final void u() {
        if (this.f1045h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1051o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1049m = false;
        }
        if (this.f1049m) {
            this.f1049m = false;
            return;
        }
        t(!this.f1050n);
        if (!this.f1050n) {
            this.f1045h.dismissDropDown();
        } else {
            this.f1045h.requestFocus();
            this.f1045h.showDropDown();
        }
    }
}
