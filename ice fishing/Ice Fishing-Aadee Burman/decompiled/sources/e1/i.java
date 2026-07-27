package e1;

import X0.v;
import d1.C4443a;
import d1.C4444b;
import f1.AbstractC4498a;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37147a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f37148b;

    /* renamed from: c, reason: collision with root package name */
    public final C4444b f37149c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37150d;

    /* renamed from: e, reason: collision with root package name */
    public final d1.f f37151e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f37152f;

    public i(String str, C4444b c4444b, C4444b c4444b2, d1.e eVar, boolean z3) {
        this.f37148b = str;
        this.f37149c = c4444b;
        this.f37151e = c4444b2;
        this.f37152f = eVar;
        this.f37150d = z3;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4498a abstractC4498a) {
        switch (this.f37147a) {
            case 0:
                return new Z0.o(vVar, abstractC4498a, this);
            default:
                return new Z0.p(vVar, abstractC4498a, this);
        }
    }

    public String toString() {
        switch (this.f37147a) {
            case 0:
                return "RectangleShape{position=" + this.f37151e + ", size=" + ((C4443a) this.f37152f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, d1.f fVar, C4443a c4443a, C4444b c4444b, boolean z3) {
        this.f37148b = str;
        this.f37151e = fVar;
        this.f37152f = c4443a;
        this.f37149c = c4444b;
        this.f37150d = z3;
    }
}
