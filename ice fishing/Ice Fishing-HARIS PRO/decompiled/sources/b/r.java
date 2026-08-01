package b;

import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0100q;
import androidx.lifecycle.InterfaceC0101s;

/* loaded from: classes.dex */
public final class r implements InterfaceC0100q, InterfaceC0107c {

    /* renamed from: a, reason: collision with root package name */
    public final C0103u f2314a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0116l f2315b;

    /* renamed from: c, reason: collision with root package name */
    public s f2316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f2317d;

    public r(u uVar, C0103u c0103u, AbstractC0116l abstractC0116l) {
        D1.i.e(abstractC0116l, "onBackPressedCallback");
        this.f2317d = uVar;
        this.f2314a = c0103u;
        this.f2315b = abstractC0116l;
        c0103u.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0100q
    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
        if (enumC0096m != EnumC0096m.ON_START) {
            if (enumC0096m != EnumC0096m.ON_STOP) {
                if (enumC0096m == EnumC0096m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                s sVar = this.f2316c;
                if (sVar != null) {
                    sVar.cancel();
                    return;
                }
                return;
            }
        }
        u uVar = this.f2317d;
        uVar.getClass();
        AbstractC0116l abstractC0116l = this.f2315b;
        D1.i.e(abstractC0116l, "onBackPressedCallback");
        uVar.f2321b.addLast(abstractC0116l);
        s sVar2 = new s(uVar, abstractC0116l);
        abstractC0116l.f2302b.add(sVar2);
        uVar.d();
        abstractC0116l.f2303c = new t(0, uVar, u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.f2316c = sVar2;
    }

    @Override // b.InterfaceC0107c
    public final void cancel() {
        this.f2314a.f(this);
        this.f2315b.f2302b.remove(this);
        s sVar = this.f2316c;
        if (sVar != null) {
            sVar.cancel();
        }
        this.f2316c = null;
    }
}
