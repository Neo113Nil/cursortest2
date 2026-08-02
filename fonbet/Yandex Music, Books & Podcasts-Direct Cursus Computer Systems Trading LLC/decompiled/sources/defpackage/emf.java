package defpackage;

/* loaded from: classes5.dex */
public enum emf {
    En("en"),
    Ru("ru"),
    Uk("uk"),
    Tr("tr"),
    /* JADX INFO: Fake field, exist only in values array */
    Be("be"),
    /* JADX INFO: Fake field, exist only in values array */
    Uz("uz"),
    Other("other");

    public final String a;

    emf(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
