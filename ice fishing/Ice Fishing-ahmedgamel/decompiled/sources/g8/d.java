package g8;

/* loaded from: classes2.dex */
public final class d extends L3.h {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f37712v;

    public d(G1.a aVar, boolean z3) {
        super(aVar);
        this.f37712v = z3;
    }

    @Override // L3.h
    public final void o(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        if (this.f37712v) {
            super.o(value);
        } else {
            l(value);
        }
    }
}
