package m;

import l.InterfaceC4670B;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4720G extends AbstractViewOnTouchListenerC4759s0 {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ L f39271C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ O f39272D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4720G(O o9, O o10, L l9) {
        super(o10);
        this.f39272D = o9;
        this.f39271C = l9;
    }

    @Override // m.AbstractViewOnTouchListenerC4759s0
    public final InterfaceC4670B b() {
        return this.f39271C;
    }

    @Override // m.AbstractViewOnTouchListenerC4759s0
    public final boolean c() {
        O o9 = this.f39272D;
        if (o9.getInternalPopup().a()) {
            return true;
        }
        o9.f39318y.j(o9.getTextDirection(), o9.getTextAlignment());
        return true;
    }
}
