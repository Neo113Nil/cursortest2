package J3;

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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import n3.AbstractC4770a;

/* loaded from: classes2.dex */
public final class m extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1485e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1486f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1487g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f1488h;
    public final ViewOnClickListenerC0317a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0318b f1489j;

    /* renamed from: k, reason: collision with root package name */
    public final l f1490k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1491l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1492m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1493n;

    /* renamed from: o, reason: collision with root package name */
    public long f1494o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1495p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1496q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1497r;

    public m(r rVar) {
        super(rVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0317a(i, this);
        this.f1489j = new ViewOnFocusChangeListenerC0318b(this, i);
        this.f1490k = new l(0, this);
        this.f1494o = Long.MAX_VALUE;
        this.f1486f = N3.C.R(rVar.getContext(), C5248R.attr.motionDurationShort3, 67);
        this.f1485e = N3.C.R(rVar.getContext(), C5248R.attr.motionDurationShort3, 50);
        this.f1487g = N3.C.S(rVar.getContext(), C5248R.attr.motionEasingLinearInterpolator, AbstractC4770a.f39641a);
    }

    @Override // J3.s
    public final void a() {
        if (this.f1495p.isTouchExplorationEnabled() && com.bumptech.glide.e.e(this.f1488h) && !this.f1530d.hasFocus()) {
            this.f1488h.dismissDropDown();
        }
        this.f1488h.post(new A3.p(5, this));
    }

    @Override // J3.s
    public final int c() {
        return C5248R.string.exposed_dropdown_menu_content_description;
    }

    @Override // J3.s
    public final int d() {
        return C5248R.drawable.mtrl_dropdown_arrow;
    }

    @Override // J3.s
    public final View.OnFocusChangeListener e() {
        return this.f1489j;
    }

    @Override // J3.s
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // J3.s
    public final l h() {
        return this.f1490k;
    }

    @Override // J3.s
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // J3.s
    public final boolean j() {
        return this.f1491l;
    }

    @Override // J3.s
    public final boolean l() {
        return this.f1493n;
    }

    @Override // J3.s
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1488h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: J3.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                m mVar = m.this;
                mVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - mVar.f1494o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        mVar.f1492m = false;
                    }
                    mVar.u();
                    mVar.f1492m = true;
                    mVar.f1494o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f1488h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: J3.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                m mVar = m.this;
                mVar.f1492m = true;
                mVar.f1494o = System.currentTimeMillis();
                mVar.t(false);
            }
        });
        this.f1488h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1527a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!com.bumptech.glide.e.e(editText) && this.f1495p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = X.f2142a;
            this.f1530d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // J3.s
    public final void n(P.k kVar) {
        if (!com.bumptech.glide.e.e(this.f1488h)) {
            kVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? kVar.f2340a.isShowingHintText() : kVar.e(4)) {
            kVar.k(null);
        }
    }

    @Override // J3.s
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1495p.isEnabled() || com.bumptech.glide.e.e(this.f1488h)) {
            return;
        }
        boolean z6 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1493n && !this.f1488h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z6) {
            u();
            this.f1492m = true;
            this.f1494o = System.currentTimeMillis();
        }
    }

    @Override // J3.s
    public final void r() {
        int i = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1487g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1486f);
        ofFloat.addUpdateListener(new i(i, this));
        this.f1497r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f1485e);
        ofFloat2.addUpdateListener(new i(i, this));
        this.f1496q = ofFloat2;
        ofFloat2.addListener(new D0.k(2, this));
        this.f1495p = (AccessibilityManager) this.f1529c.getSystemService("accessibility");
    }

    @Override // J3.s
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f1488h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1488h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z6) {
        if (this.f1493n != z6) {
            this.f1493n = z6;
            this.f1497r.cancel();
            this.f1496q.start();
        }
    }

    public final void u() {
        if (this.f1488h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1494o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1492m = false;
        }
        if (this.f1492m) {
            this.f1492m = false;
            return;
        }
        t(!this.f1493n);
        if (!this.f1493n) {
            this.f1488h.dismissDropDown();
        } else {
            this.f1488h.requestFocus();
            this.f1488h.showDropDown();
        }
    }
}
