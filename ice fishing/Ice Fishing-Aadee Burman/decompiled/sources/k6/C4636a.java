package k6;

import n6.AbstractC4759a;
import n6.C4760b;
import n6.C4763e;
import n6.InterfaceC4766h;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4636a implements InterfaceC4766h {

    /* renamed from: f, reason: collision with root package name */
    public static final C4636a f38674f = new C4636a("00000000000000000000000000000000", "0000000000000000", C4763e.f39496d, AbstractC4759a.f39492a, false);

    /* renamed from: a, reason: collision with root package name */
    public final String f38675a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38676b;

    /* renamed from: c, reason: collision with root package name */
    public final C4763e f38677c;

    /* renamed from: d, reason: collision with root package name */
    public final C4760b f38678d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38679e;

    public C4636a(String str, String str2, C4763e c4763e, C4760b c4760b, boolean z3) {
        this.f38675a = str;
        this.f38676b = str2;
        if (c4763e == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f38677c = c4763e;
        if (c4760b == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f38678d = c4760b;
        this.f38679e = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4636a)) {
            return false;
        }
        C4636a c4636a = (C4636a) obj;
        return this.f38675a.equals(c4636a.f38675a) && this.f38676b.equals(c4636a.f38676b) && this.f38677c.equals(c4636a.f38677c) && this.f38678d.equals(c4636a.f38678d) && this.f38679e == c4636a.f38679e;
    }

    public final int hashCode() {
        return ((((((((((this.f38675a.hashCode() ^ 1000003) * 1000003) ^ this.f38676b.hashCode()) * 1000003) ^ this.f38677c.hashCode()) * 1000003) ^ this.f38678d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (this.f38679e ? 1231 : 1237);
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=" + this.f38675a + ", spanId=" + this.f38676b + ", traceFlags=" + this.f38677c + ", traceState=" + this.f38678d + ", remote=false, valid=" + this.f38679e + "}";
    }
}
