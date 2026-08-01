package h;

import O.InterfaceC0034j;
import a.AbstractC0078a;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.DialogC0114j;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public class D extends DialogC0114j implements InterfaceC0169j {

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflaterFactory2C0159B f3130d;
    public final C e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.e = new InterfaceC0034j() { // from class: h.C
            @Override // O.InterfaceC0034j
            public final boolean e(KeyEvent keyEvent) {
                return D.this.h(keyEvent);
            }
        };
        p f2 = f();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0159B) f2).f3099T = i;
        f2.c();
    }

    @Override // b.DialogC0114j, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) f();
        layoutInflaterFactory2C0159B.v();
        ((ViewGroup) layoutInflaterFactory2C0159B.f3081A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0159B.f3115m.a(layoutInflaterFactory2C0159B.f3114l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0078a.v(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final p f() {
        if (this.f3130d == null) {
            n nVar = p.f3223a;
            this.f3130d = new LayoutInflaterFactory2C0159B(getContext(), getWindow(), this, this);
        }
        return this.f3130d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) f();
        layoutInflaterFactory2C0159B.v();
        return layoutInflaterFactory2C0159B.f3114l.findViewById(i);
    }

    public final void g() {
        androidx.lifecycle.L.f(getWindow().getDecorView(), this);
        h0.f.z(getWindow().getDecorView(), this);
        R.j.h0(getWindow().getDecorView(), this);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) f();
        if (layoutInflaterFactory2C0159B.f3117o != null) {
            layoutInflaterFactory2C0159B.z();
            layoutInflaterFactory2C0159B.f3117o.getClass();
            layoutInflaterFactory2C0159B.A(0);
        }
    }

    @Override // b.DialogC0114j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    @Override // b.DialogC0114j, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) f();
        layoutInflaterFactory2C0159B.z();
        M m2 = layoutInflaterFactory2C0159B.f3117o;
        if (m2 != null) {
            m2.f3172t = false;
            k.j jVar = m2.f3171s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // b.DialogC0114j, android.app.Dialog
    public void setContentView(int i) {
        g();
        f().g(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().j(charSequence);
    }

    @Override // b.DialogC0114j, android.app.Dialog
    public void setContentView(View view) {
        g();
        f().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().j(getContext().getString(i));
    }

    @Override // b.DialogC0114j, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        f().i(view, layoutParams);
    }
}
