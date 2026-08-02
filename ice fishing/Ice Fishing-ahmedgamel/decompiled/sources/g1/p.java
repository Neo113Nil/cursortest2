package g1;

import Z0.v;
import b1.InterfaceC0519c;
import b1.t;
import f1.C4516b;
import h1.AbstractC4563a;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37655a;

    /* renamed from: b, reason: collision with root package name */
    public final C4516b f37656b;

    /* renamed from: c, reason: collision with root package name */
    public final C4516b f37657c;

    /* renamed from: d, reason: collision with root package name */
    public final C4516b f37658d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37659e;

    public p(String str, int i, C4516b c4516b, C4516b c4516b2, C4516b c4516b3, boolean z6) {
        this.f37655a = i;
        this.f37656b = c4516b;
        this.f37657c = c4516b2;
        this.f37658d = c4516b3;
        this.f37659e = z6;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new t(abstractC4563a, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f37656b + ", end: " + this.f37657c + ", offset: " + this.f37658d + "}";
    }
}
