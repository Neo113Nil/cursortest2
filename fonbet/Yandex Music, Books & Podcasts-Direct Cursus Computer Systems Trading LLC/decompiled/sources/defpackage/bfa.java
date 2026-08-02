package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bfa {
    public static final bfa a;
    public static final bfa b;
    public static final bfa c;
    public static final /* synthetic */ bfa[] d;

    static {
        bfa bfaVar = new bfa("DOWNLOADED_DATE", 0);
        a = bfaVar;
        bfa bfaVar2 = new bfa("ALPHABET", 1);
        b = bfaVar2;
        bfa bfaVar3 = new bfa("PODCASTS", 2);
        c = bfaVar3;
        d = new bfa[]{bfaVar, bfaVar2, bfaVar3};
    }

    public static bfa valueOf(String str) {
        return (bfa) Enum.valueOf(bfa.class, str);
    }

    public static bfa[] values() {
        return (bfa[]) d.clone();
    }
}
