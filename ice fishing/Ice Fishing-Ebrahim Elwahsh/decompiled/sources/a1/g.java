package a1;

import C3.u;
import X0.G;

/* loaded from: classes.dex */
public final class g extends S0.s {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ S0.s f4310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(S0.s sVar) {
        super(13);
        this.f4310w = sVar;
    }

    @Override // S0.s
    public final Object g(u uVar) {
        Float f6 = (Float) ((G) this.f4310w.f2953v);
        if (f6 == null) {
            return null;
        }
        return Float.valueOf(f6.floatValue() * 2.55f);
    }
}
