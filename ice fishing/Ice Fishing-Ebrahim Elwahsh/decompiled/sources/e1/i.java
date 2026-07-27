package e1;

import X0.v;
import d1.C4455a;
import d1.C4456b;
import f1.AbstractC4490a;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37278a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f37279b;

    /* renamed from: c, reason: collision with root package name */
    public final C4456b f37280c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37281d;

    /* renamed from: e, reason: collision with root package name */
    public final d1.e f37282e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f37283f;

    public i(String str, C4456b c4456b, C4456b c4456b2, d1.d dVar, boolean z8) {
        this.f37279b = str;
        this.f37280c = c4456b;
        this.f37282e = c4456b2;
        this.f37283f = dVar;
        this.f37281d = z8;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        switch (this.f37278a) {
            case 0:
                return new Z0.o(vVar, abstractC4490a, this);
            default:
                return new Z0.p(vVar, abstractC4490a, this);
        }
    }

    public String toString() {
        switch (this.f37278a) {
            case 0:
                return "RectangleShape{position=" + this.f37282e + ", size=" + ((C4455a) this.f37283f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, d1.e eVar, C4455a c4455a, C4456b c4456b, boolean z8) {
        this.f37279b = str;
        this.f37282e = eVar;
        this.f37283f = c4455a;
        this.f37280c = c4456b;
        this.f37281d = z8;
    }
}
