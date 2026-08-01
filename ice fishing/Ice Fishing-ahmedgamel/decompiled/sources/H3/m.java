package H3;

import D.RunnableC0282a;
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
import com.icefishing.icefishingbigwin.C5275R;
import java.util.WeakHashMap;
import l3.AbstractC4661a;

/* loaded from: classes2.dex */
public final class m extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1129e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1130f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1131g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f1132h;
    public final ViewOnClickListenerC0308a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0309b f1133j;

    /* renamed from: k, reason: collision with root package name */
    public final l f1134k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1135l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1136m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1137n;

    /* renamed from: o, reason: collision with root package name */
    public long f1138o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1139p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1140q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1141r;

    public m(r rVar) {
        super(rVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0308a(i, this);
        this.f1133j = new ViewOnFocusChangeListenerC0309b(this, i);
        this.f1134k = new l(0, this);
        this.f1138o = Long.MAX_VALUE;
        this.f1130f = t8.g.D(rVar.getContext(), C5275R.attr.motionDurationShort3, 67);
        this.f1129e = t8.g.D(rVar.getContext(), C5275R.attr.motionDurationShort3, 50);
        this.f1131g = t8.g.E(rVar.getContext(), C5275R.attr.motionEasingLinearInterpolator, AbstractC4661a.f38903a);
    }

    @Override // H3.s
    public final void a() {
        if (this.f1139p.isTouchExplorationEnabled() && d6.c.j(this.f1132h) && !this.f1174d.hasFocus()) {
            this.f1132h.dismissDropDown();
        }
        this.f1132h.post(new RunnableC0282a(3, this));
    }

    @Override // H3.s
    public final int c() {
        return C5275R.string.exposed_dropdown_menu_content_description;
    }

    @Override // H3.s
    public final int d() {
        return C5275R.drawable.mtrl_dropdown_arrow;
    }

    @Override // H3.s
    public final View.OnFocusChangeListener e() {
        return this.f1133j;
    }

    @Override // H3.s
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // H3.s
    public final l h() {
        return this.f1134k;
    }

    @Override // H3.s
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // H3.s
    public final boolean j() {
        return this.f1135l;
    }

    @Override // H3.s
    public final boolean l() {
        return this.f1137n;
    }

    @Override // H3.s
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1132h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: H3.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                m mVar = m.this;
                mVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - mVar.f1138o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        mVar.f1136m = false;
                    }
                    mVar.u();
                    mVar.f1136m = true;
                    mVar.f1138o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f1132h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: H3.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                m mVar = m.this;
                mVar.f1136m = true;
                mVar.f1138o = System.currentTimeMillis();
                mVar.t(false);
            }
        });
        this.f1132h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1171a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!d6.c.j(editText) && this.f1139p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = X.f2054a;
            this.f1174d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // H3.s
    public final void n(P.k kVar) {
        if (!d6.c.j(this.f1132h)) {
            kVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? kVar.f2409a.isShowingHintText() : kVar.e(4)) {
            kVar.k(null);
        }
    }

    @Override // H3.s
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1139p.isEnabled() || d6.c.j(this.f1132h)) {
            return;
        }
        boolean z3 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1137n && !this.f1132h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z3) {
            u();
            this.f1136m = true;
            this.f1138o = System.currentTimeMillis();
        }
    }

    @Override // H3.s
    public final void r() {
        int i = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1131g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1130f);
        ofFloat.addUpdateListener(new i(i, this));
        this.f1141r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f1129e);
        ofFloat2.addUpdateListener(new i(i, this));
        this.f1140q = ofFloat2;
        ofFloat2.addListener(new D0.k(2, this));
        this.f1139p = (AccessibilityManager) this.f1173c.getSystemService("accessibility");
    }

    @Override // H3.s
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f1132h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1132h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z3) {
        if (this.f1137n != z3) {
            this.f1137n = z3;
            this.f1141r.cancel();
            this.f1140q.start();
        }
    }

    public final void u() {
        if (this.f1132h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1138o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1136m = false;
        }
        if (this.f1136m) {
            this.f1136m = false;
            return;
        }
        t(!this.f1137n);
        if (!this.f1137n) {
            this.f1132h.dismissDropDown();
        } else {
            this.f1132h.requestFocus();
            this.f1132h.showDropDown();
        }
    }
}
