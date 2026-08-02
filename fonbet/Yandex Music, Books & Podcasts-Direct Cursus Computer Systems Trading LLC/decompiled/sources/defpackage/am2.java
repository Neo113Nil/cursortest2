package defpackage;

/* loaded from: classes5.dex */
public enum am2 {
    INSTALLED("installed"),
    OTHER("other"),
    UNKNOWN("unknown");

    public final String a;

    am2(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
