package i2;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4588b {

    /* renamed from: a, reason: collision with root package name */
    public final long f38161a;

    /* renamed from: b, reason: collision with root package name */
    public final b2.i f38162b;

    /* renamed from: c, reason: collision with root package name */
    public final b2.h f38163c;

    public C4588b(long j6, b2.i iVar, b2.h hVar) {
        this.f38161a = j6;
        this.f38162b = iVar;
        this.f38163c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4588b) {
            C4588b c4588b = (C4588b) obj;
            if (this.f38161a == c4588b.f38161a && this.f38162b.equals(c4588b.f38162b) && this.f38163c.equals(c4588b.f38163c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f38161a;
        return ((((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f38162b.hashCode()) * 1000003) ^ this.f38163c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f38161a + ", transportContext=" + this.f38162b + ", event=" + this.f38163c + "}";
    }
}
