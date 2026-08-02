package S7;

import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public class B extends AbstractC0387a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2995w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(InterfaceC5245i interfaceC5245i, boolean z6, int i) {
        super(interfaceC5245i, z6);
        this.f2995w = i;
    }

    @Override // S7.h0
    public boolean D(Throwable th) {
        switch (this.f2995w) {
            case 1:
                AbstractC0410y.l(th, this.f3025v);
                return true;
            default:
                return super.D(th);
        }
    }
}
