package R2;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class D extends u {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0380f f2746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractC0380f abstractC0380f, int i, Bundle bundle) {
        super(abstractC0380f, i, bundle);
        Objects.requireNonNull(abstractC0380f);
        this.f2746g = abstractC0380f;
    }

    @Override // R2.u
    public final boolean a() {
        this.f2746g.f2782H.a(O2.b.f2254y);
        return true;
    }

    @Override // R2.u
    public final void b(O2.b bVar) {
        AbstractC0380f abstractC0380f = this.f2746g;
        abstractC0380f.getClass();
        abstractC0380f.f2782H.a(bVar);
        abstractC0380f.f2798w = bVar.f2256u;
        abstractC0380f.f2799x = System.currentTimeMillis();
    }
}
