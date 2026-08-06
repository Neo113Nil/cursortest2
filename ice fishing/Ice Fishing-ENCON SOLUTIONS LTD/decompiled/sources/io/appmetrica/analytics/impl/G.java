package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f4400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4401b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4402c;

    public G(int i2, int i3, int i4) {
        this.f4400a = i2;
        this.f4401b = i3;
        this.f4402c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g2 = (G) obj;
        return this.f4400a == g2.f4400a && this.f4401b == g2.f4401b && this.f4402c == g2.f4402c;
    }

    public final int hashCode() {
        return K7.a(this.f4402c) + ((K7.a(this.f4401b) + (K7.a(this.f4400a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f4400a) + ", canTrackHoaid=" + H.a(this.f4401b) + ", canTrackYandexAdvId=" + H.a(this.f4402c) + ')';
    }
}
