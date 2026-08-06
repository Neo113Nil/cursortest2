package o0;

import java.util.Arrays;
import n0.InterfaceC0988b;
import p0.AbstractC1021r;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8244a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.e f8245b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0988b f8246c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8247d;

    public C0997a(x0.e eVar, InterfaceC0988b interfaceC0988b, String str) {
        this.f8245b = eVar;
        this.f8246c = interfaceC0988b;
        this.f8247d = str;
        this.f8244a = Arrays.hashCode(new Object[]{eVar, interfaceC0988b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0997a)) {
            return false;
        }
        C0997a c0997a = (C0997a) obj;
        return AbstractC1021r.e(this.f8245b, c0997a.f8245b) && AbstractC1021r.e(this.f8246c, c0997a.f8246c) && AbstractC1021r.e(this.f8247d, c0997a.f8247d);
    }

    public final int hashCode() {
        return this.f8244a;
    }
}
