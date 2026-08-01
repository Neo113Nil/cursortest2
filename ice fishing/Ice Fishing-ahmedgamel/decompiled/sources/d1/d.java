package d1;

import a1.AbstractC0428e;
import a1.o;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: n, reason: collision with root package name */
    public final C4444b f37023n;

    /* renamed from: u, reason: collision with root package name */
    public final C4444b f37024u;

    public d(C4444b c4444b, C4444b c4444b2) {
        this.f37023n = c4444b;
        this.f37024u = c4444b2;
    }

    @Override // d1.f
    public final AbstractC0428e a() {
        return new o(this.f37023n.a(), this.f37024u.a());
    }

    @Override // d1.f
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // d1.f
    public final boolean c() {
        return this.f37023n.c() && this.f37024u.c();
    }
}
