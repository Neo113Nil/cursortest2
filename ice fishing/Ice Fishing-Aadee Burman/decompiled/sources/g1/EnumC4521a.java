package g1;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4521a {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: n, reason: collision with root package name */
    public final String f37622n;

    EnumC4521a(String str) {
        this.f37622n = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37622n;
    }
}
