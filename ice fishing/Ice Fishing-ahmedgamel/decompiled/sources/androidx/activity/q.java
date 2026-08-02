package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.InterfaceC0507v;
import com.IceFishing.LiveIceFishing.C5248R;
import x0.C5180c;
import x0.C5181d;
import x0.InterfaceC5182e;

/* loaded from: classes.dex */
public class q extends Dialog implements InterfaceC0507v, InterfaceC5182e {

    /* renamed from: n, reason: collision with root package name */
    public C0509x f4429n;

    /* renamed from: u, reason: collision with root package name */
    public final C5181d f4430u;

    /* renamed from: v, reason: collision with root package name */
    public final G f4431v;

    public q(Context context, int i) {
        super(context, i);
        this.f4430u = new C5181d(this);
        this.f4431v = new G(new A3.p(12, this));
    }

    public static void a(q qVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.h.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window!!.decorView");
        decorView.setTag(C5248R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.h.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.h.d(decorView2, "window!!.decorView");
        decorView2.setTag(C5248R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.h.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.h.d(decorView3, "window!!.decorView");
        decorView3.setTag(C5248R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0507v
    public final AbstractC0502p getLifecycle() {
        C0509x c0509x = this.f4429n;
        if (c0509x != null) {
            return c0509x;
        }
        C0509x c0509x2 = new C0509x(this);
        this.f4429n = c0509x2;
        return c0509x2;
    }

    @Override // x0.InterfaceC5182e
    public final C5180c getSavedStateRegistry() {
        return this.f4430u.f41812b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f4431v.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.h.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            G g9 = this.f4431v;
            g9.f4395e = onBackInvokedDispatcher;
            g9.d(g9.f4397g);
        }
        this.f4430u.b(bundle);
        C0509x c0509x = this.f4429n;
        if (c0509x == null) {
            c0509x = new C0509x(this);
            this.f4429n = c0509x;
        }
        c0509x.e(EnumC0500n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.h.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f4430u.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0509x c0509x = this.f4429n;
        if (c0509x == null) {
            c0509x = new C0509x(this);
            this.f4429n = c0509x;
        }
        c0509x.e(EnumC0500n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0509x c0509x = this.f4429n;
        if (c0509x == null) {
            c0509x = new C0509x(this);
            this.f4429n = c0509x;
        }
        c0509x.e(EnumC0500n.ON_DESTROY);
        this.f4429n = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
