package b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0101s;
import androidx.lifecycle.L;
import l0.C0233d;
import l0.InterfaceC0234e;

/* renamed from: b.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0114j extends Dialog implements InterfaceC0101s, v, InterfaceC0234e {

    /* renamed from: a, reason: collision with root package name */
    public C0103u f2295a;

    /* renamed from: b, reason: collision with root package name */
    public final C0115k f2296b;

    /* renamed from: c, reason: collision with root package name */
    public final u f2297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0114j(Context context, int i) {
        super(context, i);
        D1.i.e(context, "context");
        this.f2296b = new C0115k(this);
        this.f2297c = new u(new D.a(12, this));
    }

    public static void a(DialogC0114j dialogC0114j) {
        D1.i.e(dialogC0114j, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D1.i.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // l0.InterfaceC0234e
    public final C0233d b() {
        return (C0233d) this.f2296b.f2300c;
    }

    public final C0103u c() {
        C0103u c0103u = this.f2295a;
        if (c0103u != null) {
            return c0103u;
        }
        C0103u c0103u2 = new C0103u(this);
        this.f2295a = c0103u2;
        return c0103u2;
    }

    @Override // androidx.lifecycle.InterfaceC0101s
    public final C0103u d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        D1.i.b(window);
        View decorView = window.getDecorView();
        D1.i.d(decorView, "window!!.decorView");
        L.f(decorView, this);
        Window window2 = getWindow();
        D1.i.b(window2);
        View decorView2 = window2.getDecorView();
        D1.i.d(decorView2, "window!!.decorView");
        R.j.h0(decorView2, this);
        Window window3 = getWindow();
        D1.i.b(window3);
        View decorView3 = window3.getDecorView();
        D1.i.d(decorView3, "window!!.decorView");
        h0.f.z(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f2297c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            D1.i.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            u uVar = this.f2297c;
            uVar.getClass();
            uVar.e = onBackInvokedDispatcher;
            uVar.c(uVar.f2325g);
        }
        this.f2296b.b(bundle);
        c().d(EnumC0096m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        D1.i.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f2296b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        c().d(EnumC0096m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(EnumC0096m.ON_DESTROY);
        this.f2295a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        D1.i.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D1.i.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
