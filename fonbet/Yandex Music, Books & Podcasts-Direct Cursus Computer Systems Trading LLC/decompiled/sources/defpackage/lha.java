package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lha {
    public static final lha a;
    public static final lha b;
    public static final /* synthetic */ lha[] c;

    static {
        lha lhaVar = new lha("DOWNLOADED_DATE", 0);
        a = lhaVar;
        lha lhaVar2 = new lha("ALPHABET", 1);
        b = lhaVar2;
        c = new lha[]{lhaVar, lhaVar2};
    }

    public static lha valueOf(String str) {
        return (lha) Enum.valueOf(lha.class, str);
    }

    public static lha[] values() {
        return (lha[]) c.clone();
    }
}
