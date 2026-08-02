package g1;

import Z0.v;
import b1.InterfaceC0519c;
import f1.C4515a;
import f1.C4516b;
import h1.AbstractC4563a;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37623a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f37624b;

    /* renamed from: c, reason: collision with root package name */
    public final C4516b f37625c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37626d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.e f37627e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f37628f;

    public i(String str, C4516b c4516b, C4516b c4516b2, f1.d dVar, boolean z6) {
        this.f37624b = str;
        this.f37625c = c4516b;
        this.f37627e = c4516b2;
        this.f37628f = dVar;
        this.f37626d = z6;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        switch (this.f37623a) {
            case 0:
                return new b1.o(vVar, abstractC4563a, this);
            default:
                return new b1.p(vVar, abstractC4563a, this);
        }
    }

    public String toString() {
        switch (this.f37623a) {
            case 0:
                return "RectangleShape{position=" + this.f37627e + ", size=" + ((C4515a) this.f37628f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, f1.e eVar, C4515a c4515a, C4516b c4516b, boolean z6) {
        this.f37624b = str;
        this.f37627e = eVar;
        this.f37628f = c4515a;
        this.f37625c = c4516b;
        this.f37626d = z6;
    }
}
