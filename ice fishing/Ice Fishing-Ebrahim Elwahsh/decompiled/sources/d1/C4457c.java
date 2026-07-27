package d1;

import a1.AbstractC0421e;
import a1.o;
import java.util.List;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4457c implements e {

    /* renamed from: n, reason: collision with root package name */
    public final C4456b f37185n;

    /* renamed from: u, reason: collision with root package name */
    public final C4456b f37186u;

    public C4457c(C4456b c4456b, C4456b c4456b2) {
        this.f37185n = c4456b;
        this.f37186u = c4456b2;
    }

    @Override // d1.e
    public final AbstractC0421e a() {
        return new o(this.f37185n.a(), this.f37186u.a());
    }

    @Override // d1.e
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // d1.e
    public final boolean c() {
        return this.f37185n.c() && this.f37186u.c();
    }
}
