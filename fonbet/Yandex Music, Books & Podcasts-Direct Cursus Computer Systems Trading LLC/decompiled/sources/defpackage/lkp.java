package defpackage;

/* loaded from: classes5.dex */
public enum lkp {
    success("success"),
    failed("failed"),
    canceled("canceled"),
    dismissed("dismissed");

    public final String a;

    lkp(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
