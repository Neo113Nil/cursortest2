package g1;

import Z0.v;
import b1.InterfaceC0519c;
import b1.q;
import f1.C4516b;
import h1.AbstractC4563a;

/* loaded from: classes.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final C4516b f37629a;

    public j(String str, C4516b c4516b) {
        this.f37629a = c4516b;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new q(vVar, abstractC4563a, this);
    }
}
