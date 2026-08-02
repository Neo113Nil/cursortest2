package defpackage;

/* loaded from: classes4.dex */
public enum vgb {
    Network("Network"),
    Storage("Storage"),
    Corrupted("Corrupted"),
    CacheOnlyExpected("CacheOnlyExpected"),
    UnknownIo("UnknownIo"),
    Unknown("Unknown");

    public final String a;

    vgb(String str) {
        this.a = str;
    }
}
