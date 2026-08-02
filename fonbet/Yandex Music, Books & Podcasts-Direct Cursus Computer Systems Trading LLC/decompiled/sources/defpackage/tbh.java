package defpackage;

/* loaded from: classes3.dex */
public final class tbh {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbh)) {
            return false;
        }
        tbh tbhVar = (tbh) obj;
        return Float.compare(this.a, tbhVar.a) == 0 && Float.compare(this.b, tbhVar.b) == 0 && Float.compare(this.c, tbhVar.c) == 0 && Float.compare(this.d, tbhVar.d) == 0 && Float.compare(this.e, tbhVar.e) == 0 && Float.compare(this.f, tbhVar.f) == 0 && Float.compare(this.g, tbhVar.g) == 0 && Float.compare(this.h, tbhVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Particle(cx=");
        sb.append(this.a);
        sb.append(", cy=");
        sb.append(this.b);
        sb.append(", radius=");
        sb.append(this.c);
        sb.append(", vx=");
        sb.append(this.d);
        sb.append(", vy=");
        sb.append(this.e);
        sb.append(", angularVel=");
        sb.append(this.f);
        sb.append(", lifetimeMs=");
        sb.append(this.g);
        sb.append(", ageMs=");
        return ouj.p(sb, this.h, ')');
    }
}
