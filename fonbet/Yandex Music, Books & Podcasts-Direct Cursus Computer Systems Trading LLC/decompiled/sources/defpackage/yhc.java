package defpackage;

/* loaded from: classes5.dex */
public enum yhc {
    DEBUG("🔵"),
    INFO("🟢"),
    WARNING("🟡"),
    ERROR("🟠"),
    FAULT("🔴");

    public final String a;

    yhc(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return ouj.n(this.a, name());
    }
}
