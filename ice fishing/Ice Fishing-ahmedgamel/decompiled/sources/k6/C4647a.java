package k6;

import n6.AbstractC4775a;
import n6.C4776b;
import n6.C4779e;
import n6.InterfaceC4782h;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4647a implements InterfaceC4782h {

    /* renamed from: f, reason: collision with root package name */
    public static final C4647a f38601f = new C4647a("00000000000000000000000000000000", "0000000000000000", C4779e.f39663d, AbstractC4775a.f39659a, false);

    /* renamed from: a, reason: collision with root package name */
    public final String f38602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38603b;

    /* renamed from: c, reason: collision with root package name */
    public final C4779e f38604c;

    /* renamed from: d, reason: collision with root package name */
    public final C4776b f38605d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38606e;

    public C4647a(String str, String str2, C4779e c4779e, C4776b c4776b, boolean z6) {
        this.f38602a = str;
        this.f38603b = str2;
        if (c4779e == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f38604c = c4779e;
        if (c4776b == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f38605d = c4776b;
        this.f38606e = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4647a)) {
            return false;
        }
        C4647a c4647a = (C4647a) obj;
        return this.f38602a.equals(c4647a.f38602a) && this.f38603b.equals(c4647a.f38603b) && this.f38604c.equals(c4647a.f38604c) && this.f38605d.equals(c4647a.f38605d) && this.f38606e == c4647a.f38606e;
    }

    public final int hashCode() {
        return ((((((((((this.f38602a.hashCode() ^ 1000003) * 1000003) ^ this.f38603b.hashCode()) * 1000003) ^ this.f38604c.hashCode()) * 1000003) ^ this.f38605d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (this.f38606e ? 1231 : 1237);
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=" + this.f38602a + ", spanId=" + this.f38603b + ", traceFlags=" + this.f38604c + ", traceState=" + this.f38605d + ", remote=false, valid=" + this.f38606e + "}";
    }
}
