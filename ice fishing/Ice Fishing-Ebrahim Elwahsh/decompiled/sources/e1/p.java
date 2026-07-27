package e1;

import X0.v;
import Z0.t;
import d1.C4456b;
import f1.AbstractC4490a;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37310a;

    /* renamed from: b, reason: collision with root package name */
    public final C4456b f37311b;

    /* renamed from: c, reason: collision with root package name */
    public final C4456b f37312c;

    /* renamed from: d, reason: collision with root package name */
    public final C4456b f37313d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37314e;

    public p(String str, int i, C4456b c4456b, C4456b c4456b2, C4456b c4456b3, boolean z8) {
        this.f37310a = i;
        this.f37311b = c4456b;
        this.f37312c = c4456b2;
        this.f37313d = c4456b3;
        this.f37314e = z8;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        return new t(abstractC4490a, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f37311b + ", end: " + this.f37312c + ", offset: " + this.f37313d + "}";
    }
}
