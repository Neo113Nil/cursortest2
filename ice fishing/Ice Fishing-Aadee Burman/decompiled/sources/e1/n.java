package e1;

import D.y;
import X0.v;
import Z0.r;
import d1.C4443a;
import f1.AbstractC4498a;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37166a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37167b;

    /* renamed from: c, reason: collision with root package name */
    public final C4443a f37168c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37169d;

    public n(String str, int i, C4443a c4443a, boolean z3) {
        this.f37166a = str;
        this.f37167b = i;
        this.f37168c = c4443a;
        this.f37169d = z3;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        return new r(vVar, abstractC4498a, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f37166a);
        sb.append(", index=");
        return y.q(sb, this.f37167b, '}');
    }
}
