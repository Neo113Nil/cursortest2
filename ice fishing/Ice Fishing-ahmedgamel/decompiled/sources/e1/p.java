package e1;

import X0.v;
import Z0.t;
import d1.C4444b;
import f1.AbstractC4498a;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37179a;

    /* renamed from: b, reason: collision with root package name */
    public final C4444b f37180b;

    /* renamed from: c, reason: collision with root package name */
    public final C4444b f37181c;

    /* renamed from: d, reason: collision with root package name */
    public final C4444b f37182d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37183e;

    public p(String str, int i, C4444b c4444b, C4444b c4444b2, C4444b c4444b3, boolean z3) {
        this.f37179a = i;
        this.f37180b = c4444b;
        this.f37181c = c4444b2;
        this.f37182d = c4444b3;
        this.f37183e = z3;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        return new t(abstractC4498a, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f37180b + ", end: " + this.f37181c + ", offset: " + this.f37182d + "}";
    }
}
