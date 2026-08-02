package coil3.request;

/* loaded from: classes.dex */
public enum CachePolicy {
    ENABLED("ENABLED", 0),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("READ_ONLY", 1),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("WRITE_ONLY", 2),
    DISABLED("DISABLED", 3);

    public final boolean readEnabled;
    public final boolean writeEnabled;

    CachePolicy(String str, int i) {
        this.readEnabled = r1;
        this.writeEnabled = r2;
    }
}
