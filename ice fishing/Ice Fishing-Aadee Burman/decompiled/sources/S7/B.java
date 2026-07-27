package S7;

import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public class B extends AbstractC0383a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2912w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(InterfaceC5272i interfaceC5272i, boolean z3, int i) {
        super(interfaceC5272i, z3);
        this.f2912w = i;
    }

    @Override // S7.h0
    public boolean D(Throwable th) {
        switch (this.f2912w) {
            case 1:
                AbstractC0406y.l(th, this.f2942v);
                return true;
            default:
                return super.D(th);
        }
    }
}
