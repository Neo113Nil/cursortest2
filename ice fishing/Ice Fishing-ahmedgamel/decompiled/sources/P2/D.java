package P2;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class D extends u {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376f f2425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractC0376f abstractC0376f, int i, Bundle bundle) {
        super(abstractC0376f, i, bundle);
        Objects.requireNonNull(abstractC0376f);
        this.f2425g = abstractC0376f;
    }

    @Override // P2.u
    public final boolean a() {
        this.f2425g.f2461H.a(M2.b.f1828y);
        return true;
    }

    @Override // P2.u
    public final void b(M2.b bVar) {
        AbstractC0376f abstractC0376f = this.f2425g;
        abstractC0376f.getClass();
        abstractC0376f.f2461H.a(bVar);
        abstractC0376f.f2477w = bVar.f1830u;
        abstractC0376f.f2478x = System.currentTimeMillis();
    }
}
