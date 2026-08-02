package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cfa {
    public static final cfa a;
    public static final cfa b;
    public static final /* synthetic */ cfa[] c;

    static {
        cfa cfaVar = new cfa("DOWNLOADED_DATE", 0);
        a = cfaVar;
        cfa cfaVar2 = new cfa("ALPHABET", 1);
        b = cfaVar2;
        c = new cfa[]{cfaVar, cfaVar2};
    }

    public static cfa valueOf(String str) {
        return (cfa) Enum.valueOf(cfa.class, str);
    }

    public static cfa[] values() {
        return (cfa[]) c.clone();
    }
}
