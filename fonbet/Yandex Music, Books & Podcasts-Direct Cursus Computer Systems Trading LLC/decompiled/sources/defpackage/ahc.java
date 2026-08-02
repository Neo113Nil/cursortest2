package defpackage;

/* loaded from: classes5.dex */
public enum ahc {
    global("global"),
    experiment("experiment");

    public final String a;

    ahc(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
