package g2;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4525b {

    /* renamed from: a, reason: collision with root package name */
    public final long f37634a;

    /* renamed from: b, reason: collision with root package name */
    public final Z1.i f37635b;

    /* renamed from: c, reason: collision with root package name */
    public final Z1.h f37636c;

    public C4525b(long j6, Z1.i iVar, Z1.h hVar) {
        this.f37634a = j6;
        this.f37635b = iVar;
        this.f37636c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4525b) {
            C4525b c4525b = (C4525b) obj;
            if (this.f37634a == c4525b.f37634a && this.f37635b.equals(c4525b.f37635b) && this.f37636c.equals(c4525b.f37636c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f37634a;
        return ((((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f37635b.hashCode()) * 1000003) ^ this.f37636c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f37634a + ", transportContext=" + this.f37635b + ", event=" + this.f37636c + "}";
    }
}
