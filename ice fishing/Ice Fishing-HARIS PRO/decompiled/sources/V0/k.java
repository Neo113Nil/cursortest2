package V0;

import O.K;
import a.AbstractC0078a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public final class k extends q {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1280f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1281g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f1282h;
    public final ViewOnClickListenerC0050a i;
    public final ViewOnFocusChangeListenerC0051b j;

    /* renamed from: k, reason: collision with root package name */
    public final Q.a f1283k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1284l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1285m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1286n;

    /* renamed from: o, reason: collision with root package name */
    public long f1287o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1288p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1289q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1290r;

    public k(p pVar) {
        super(pVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0050a(i, this);
        this.j = new ViewOnFocusChangeListenerC0051b(this, i);
        this.f1283k = new Q.a(this);
        this.f1287o = Long.MAX_VALUE;
        this.f1280f = AbstractC0078a.W(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = AbstractC0078a.W(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f1281g = AbstractC0078a.X(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0360a.f4480a);
    }

    @Override // V0.q
    public final void a() {
        if (this.f1288p.isTouchExplorationEnabled() && R.j.M(this.f1282h) && !this.f1321d.hasFocus()) {
            this.f1282h.dismissDropDown();
        }
        this.f1282h.post(new D.a(6, this));
    }

    @Override // V0.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // V0.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // V0.q
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // V0.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // V0.q
    public final Q.a h() {
        return this.f1283k;
    }

    @Override // V0.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // V0.q
    public final boolean j() {
        return this.f1284l;
    }

    @Override // V0.q
    public final boolean l() {
        return this.f1286n;
    }

    @Override // V0.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1282h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: V0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = k.this;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f1287o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f1285m = false;
                    }
                    kVar.u();
                    kVar.f1285m = true;
                    kVar.f1287o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f1282h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: V0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f1285m = true;
                kVar.f1287o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.f1282h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1318a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!R.j.M(editText) && this.f1288p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = K.f747a;
            this.f1321d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // V0.q
    public final void n(P.f fVar) {
        if (!R.j.M(this.f1282h)) {
            fVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // V0.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1288p.isEnabled() || R.j.M(this.f1282h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1286n && !this.f1282h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f1285m = true;
            this.f1287o = System.currentTimeMillis();
        }
    }

    @Override // V0.q
    public final void r() {
        int i = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f2111C0, 1.0f);
        TimeInterpolator timeInterpolator = this.f1281g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1280f);
        ofFloat.addUpdateListener(new D0.b(i, this));
        this.f1290r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.f2111C0);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new D0.b(i, this));
        this.f1289q = ofFloat2;
        ofFloat2.addListener(new B0.c(4, this));
        this.f1288p = (AccessibilityManager) this.f1320c.getSystemService("accessibility");
    }

    @Override // V0.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f1282h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1282h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f1286n != z2) {
            this.f1286n = z2;
            this.f1290r.cancel();
            this.f1289q.start();
        }
    }

    public final void u() {
        if (this.f1282h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1287o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1285m = false;
        }
        if (this.f1285m) {
            this.f1285m = false;
            return;
        }
        t(!this.f1286n);
        if (!this.f1286n) {
            this.f1282h.dismissDropDown();
        } else {
            this.f1282h.requestFocus();
            this.f1282h.showDropDown();
        }
    }
}
