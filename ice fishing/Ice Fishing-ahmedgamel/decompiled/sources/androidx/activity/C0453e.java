package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.InterfaceC0501t;
import androidx.lifecycle.InterfaceC0503v;
import x0.C5181c;

/* renamed from: androidx.activity.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0453e implements InterfaceC0501t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4443n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4444u;

    public /* synthetic */ C0453e(int i, Object obj) {
        this.f4443n = i;
        this.f4444u = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        Window window;
        View peekDecorView;
        switch (this.f4443n) {
            case 0:
                if (enumC0496n == EnumC0496n.ON_STOP && (window = ((p) this.f4444u).getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                p.b((p) this.f4444u, interfaceC0503v, enumC0496n);
                break;
            default:
                C5181c this$0 = (C5181c) this.f4444u;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                if (enumC0496n != EnumC0496n.ON_START) {
                    if (enumC0496n == EnumC0496n.ON_STOP) {
                        this$0.f41755f = false;
                        break;
                    }
                } else {
                    this$0.f41755f = true;
                    break;
                }
                break;
        }
    }
}
