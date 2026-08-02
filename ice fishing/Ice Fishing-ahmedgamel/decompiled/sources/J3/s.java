package J3;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1527a;

    /* renamed from: b, reason: collision with root package name */
    public final r f1528b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1529c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1530d;

    public s(r rVar) {
        this.f1527a = rVar.f1520n;
        this.f1528b = rVar;
        this.f1529c = rVar.getContext();
        this.f1530d = rVar.f1526z;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public l h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof m;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f1528b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(P.k kVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z6) {
    }
}
