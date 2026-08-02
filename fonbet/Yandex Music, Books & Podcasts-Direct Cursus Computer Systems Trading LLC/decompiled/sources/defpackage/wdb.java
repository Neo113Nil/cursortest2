package defpackage;

/* loaded from: classes3.dex */
public enum wdb {
    DEVELOPMENT("development"),
    TESTING("testing"),
    PRESTABLE("prestable"),
    PRODUCTION("production"),
    PREPRODUCTION("pre-production");

    public final String a;

    wdb(String str) {
        this.a = str;
    }
}
