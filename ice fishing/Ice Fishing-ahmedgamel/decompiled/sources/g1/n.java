package g1;

import D.x;
import Z0.v;
import b1.InterfaceC0519c;
import b1.r;
import f1.C4515a;
import h1.AbstractC4563a;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37642a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37643b;

    /* renamed from: c, reason: collision with root package name */
    public final C4515a f37644c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37645d;

    public n(String str, int i, C4515a c4515a, boolean z6) {
        this.f37642a = str;
        this.f37643b = i;
        this.f37644c = c4515a;
        this.f37645d = z6;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new r(vVar, abstractC4563a, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f37642a);
        sb.append(", index=");
        return x.n(sb, this.f37643b, '}');
    }
}
