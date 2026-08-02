package g1;

import Z0.v;
import b1.InterfaceC0519c;
import f1.C4515a;
import h1.AbstractC4563a;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37580a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.e f37581b;

    /* renamed from: c, reason: collision with root package name */
    public final C4515a f37582c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37583d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37584e;

    public a(String str, f1.e eVar, C4515a c4515a, boolean z6, boolean z9) {
        this.f37580a = str;
        this.f37581b = eVar;
        this.f37582c = c4515a;
        this.f37583d = z6;
        this.f37584e = z9;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new b1.f(vVar, abstractC4563a, this);
    }
}
