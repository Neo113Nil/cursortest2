package androidx.activity;

import D.RunnableC0282a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.InterfaceC0503v;
import com.icefishing.icefishinglive2.C5275R;
import x0.C5181c;
import x0.C5182d;
import x0.InterfaceC5183e;

/* loaded from: classes.dex */
public class q extends Dialog implements InterfaceC0503v, InterfaceC5183e {

    /* renamed from: n, reason: collision with root package name */
    public C0505x f4461n;

    /* renamed from: u, reason: collision with root package name */
    public final C5182d f4462u;

    /* renamed from: v, reason: collision with root package name */
    public final G f4463v;

    public q(Context context, int i) {
        super(context, i);
        this.f4462u = new C5182d(this);
        this.f4463v = new G(new RunnableC0282a(11, this));
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
        decorView.setTag(C5275R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.h.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.h.d(decorView2, "window!!.decorView");
        decorView2.setTag(C5275R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.h.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.h.d(decorView3, "window!!.decorView");
        decorView3.setTag(C5275R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0503v
    public final AbstractC0498p getLifecycle() {
        C0505x c0505x = this.f4461n;
        if (c0505x != null) {
            return c0505x;
        }
        C0505x c0505x2 = new C0505x(this);
        this.f4461n = c0505x2;
        return c0505x2;
    }

    @Override // x0.InterfaceC5183e
    public final C5181c getSavedStateRegistry() {
        return this.f4462u.f41754b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f4463v.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.h.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            G g4 = this.f4463v;
            g4.f4427e = onBackInvokedDispatcher;
            g4.d(g4.f4429g);
        }
        this.f4462u.b(bundle);
        C0505x c0505x = this.f4461n;
        if (c0505x == null) {
            c0505x = new C0505x(this);
            this.f4461n = c0505x;
        }
        c0505x.e(EnumC0496n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.h.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f4462u.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0505x c0505x = this.f4461n;
        if (c0505x == null) {
            c0505x = new C0505x(this);
            this.f4461n = c0505x;
        }
        c0505x.e(EnumC0496n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0505x c0505x = this.f4461n;
        if (c0505x == null) {
            c0505x = new C0505x(this);
            this.f4461n = c0505x;
        }
        c0505x.e(EnumC0496n.ON_DESTROY);
        this.f4461n = null;
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
