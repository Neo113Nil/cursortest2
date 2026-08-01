package V0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1318a;

    /* renamed from: b, reason: collision with root package name */
    public final p f1319b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1320c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1321d;

    public q(p pVar) {
        this.f1318a = pVar.f1299a;
        this.f1319b = pVar;
        this.f1320c = pVar.getContext();
        this.f1321d = pVar.f1304g;
    }

    public void a() {
    }

    public void b() {
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

    public Q.a h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(P.f fVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z2) {
    }

    public final void q() {
        this.f1319b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
