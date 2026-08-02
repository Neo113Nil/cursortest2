package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class dfa {
    public static final dfa a;
    public static final dfa b;
    public static final /* synthetic */ dfa[] c;

    static {
        dfa dfaVar = new dfa("DOWNLOADED_DATE", 0);
        a = dfaVar;
        dfa dfaVar2 = new dfa("ALPHABET", 1);
        b = dfaVar2;
        c = new dfa[]{dfaVar, dfaVar2};
    }

    public static dfa valueOf(String str) {
        return (dfa) Enum.valueOf(dfa.class, str);
    }

    public static dfa[] values() {
        return (dfa[]) c.clone();
    }
}
