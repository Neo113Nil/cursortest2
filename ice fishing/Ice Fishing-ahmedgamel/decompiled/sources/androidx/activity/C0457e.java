package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.InterfaceC0505t;
import androidx.lifecycle.InterfaceC0507v;
import x0.C5180c;

/* renamed from: androidx.activity.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0457e implements InterfaceC0505t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4411n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4412u;

    public /* synthetic */ C0457e(int i, Object obj) {
        this.f4411n = i;
        this.f4412u = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        Window window;
        View peekDecorView;
        switch (this.f4411n) {
            case 0:
                if (enumC0500n == EnumC0500n.ON_STOP && (window = ((p) this.f4412u).getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                p.b((p) this.f4412u, interfaceC0507v, enumC0500n);
                break;
            default:
                C5180c this$0 = (C5180c) this.f4412u;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                if (enumC0500n != EnumC0500n.ON_START) {
                    if (enumC0500n == EnumC0500n.ON_STOP) {
                        this$0.f41810f = false;
                        break;
                    }
                } else {
                    this$0.f41810f = true;
                    break;
                }
                break;
        }
    }
}
