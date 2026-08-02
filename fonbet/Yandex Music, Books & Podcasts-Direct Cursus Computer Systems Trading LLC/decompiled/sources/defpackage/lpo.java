package defpackage;

/* loaded from: classes4.dex */
public enum lpo {
    Correct("correct"),
    Incorrect("incorrect");

    public final String a;

    lpo(String str) {
        this.a = str;
    }

    public final boolean a() {
        return this == Correct;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
