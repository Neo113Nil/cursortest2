package defpackage;

/* loaded from: classes5.dex */
public enum gro {
    correct("correct"),
    incorrect("incorrect");

    public final String a;

    gro(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
