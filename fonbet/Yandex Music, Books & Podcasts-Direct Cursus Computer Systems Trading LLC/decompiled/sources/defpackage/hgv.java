package defpackage;

/* loaded from: classes5.dex */
public enum hgv {
    FORM_3DS("form_3ds"),
    /* JADX INFO: Fake field, exist only in values array */
    CREDIT("credit"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMON("common");

    public final String a;

    hgv(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
