package i1;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4584a {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: n, reason: collision with root package name */
    public final String f38150n;

    EnumC4584a(String str) {
        this.f38150n = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f38150n;
    }
}
