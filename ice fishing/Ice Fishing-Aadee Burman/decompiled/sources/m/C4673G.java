package m;

import l.InterfaceC4641C;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4673G extends AbstractViewOnTouchListenerC4711s0 {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ L f39004C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ O f39005D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4673G(O o6, O o9, L l9) {
        super(o9);
        this.f39005D = o6;
        this.f39004C = l9;
    }

    @Override // m.AbstractViewOnTouchListenerC4711s0
    public final InterfaceC4641C b() {
        return this.f39004C;
    }

    @Override // m.AbstractViewOnTouchListenerC4711s0
    public final boolean c() {
        O o6 = this.f39005D;
        if (o6.getInternalPopup().a()) {
            return true;
        }
        o6.f39051y.j(o6.getTextDirection(), o6.getTextAlignment());
        return true;
    }
}
