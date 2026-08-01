package m;

import l.InterfaceC0214C;

/* loaded from: classes.dex */
public final class I extends AbstractViewOnTouchListenerC0282u0 {
    public final /* synthetic */ N j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q f3833k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q2, Q q3, N n2) {
        super(q3);
        this.f3833k = q2;
        this.j = n2;
    }

    @Override // m.AbstractViewOnTouchListenerC0282u0
    public final InterfaceC0214C b() {
        return this.j;
    }

    @Override // m.AbstractViewOnTouchListenerC0282u0
    public final boolean c() {
        Q q2 = this.f3833k;
        if (q2.getInternalPopup().a()) {
            return true;
        }
        q2.f3872f.h(q2.getTextDirection(), q2.getTextAlignment());
        return true;
    }
}
