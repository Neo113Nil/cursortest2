package f1;

import c1.AbstractC0545e;
import c1.o;
import java.util.List;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4517c implements e {

    /* renamed from: n, reason: collision with root package name */
    public final C4516b f37425n;

    /* renamed from: u, reason: collision with root package name */
    public final C4516b f37426u;

    public C4517c(C4516b c4516b, C4516b c4516b2) {
        this.f37425n = c4516b;
        this.f37426u = c4516b2;
    }

    @Override // f1.e
    public final AbstractC0545e a() {
        return new o(this.f37425n.a(), this.f37426u.a());
    }

    @Override // f1.e
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // f1.e
    public final boolean c() {
        return this.f37425n.c() && this.f37426u.c();
    }
}
