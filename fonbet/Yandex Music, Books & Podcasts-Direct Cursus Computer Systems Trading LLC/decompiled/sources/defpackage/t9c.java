package defpackage;

/* loaded from: classes.dex */
public enum t9c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String a;

    t9c(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
