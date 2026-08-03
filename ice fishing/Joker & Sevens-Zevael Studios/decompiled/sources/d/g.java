package d;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.lifecycle.s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f1490g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f1491h;

    public /* synthetic */ g(y yVar, o oVar) {
        this.f1490g = yVar;
        this.f1491h = oVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_CREATE) {
            OnBackInvokedDispatcher a6 = k.a(this.f1491h);
            y yVar = this.f1490g;
            yVar.f1554e = a6;
            yVar.c(yVar.f1556g);
        }
    }
}
