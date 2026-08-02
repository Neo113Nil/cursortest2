package m;

import l.InterfaceC4652C;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4685G extends AbstractViewOnTouchListenerC4724s0 {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ L f39072C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ O f39073D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4685G(O o4, O o6, L l9) {
        super(o6);
        this.f39073D = o4;
        this.f39072C = l9;
    }

    @Override // m.AbstractViewOnTouchListenerC4724s0
    public final InterfaceC4652C b() {
        return this.f39072C;
    }

    @Override // m.AbstractViewOnTouchListenerC4724s0
    public final boolean c() {
        O o4 = this.f39073D;
        if (o4.getInternalPopup().a()) {
            return true;
        }
        o4.f39119y.j(o4.getTextDirection(), o4.getTextAlignment());
        return true;
    }
}
