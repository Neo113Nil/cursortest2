package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kb0 {
    public static final k00 MdtA4re8;
    public static final kb0 P7K7Inc8;
    public static final kb0 Qr9iLBAD;
    public static final kb0 VgvYg0wo;
    public static final kb0 b2ZJblxo;
    public static final /* synthetic */ bg eVhOlqcC;
    public static final /* synthetic */ kb0[] jb9XjC4I;
    public static final kb0 wxUZMvaN;
    public final String NCTxEWno;

    static {
        kb0 kb0Var = new kb0(0, "CALM", "calm");
        wxUZMvaN = kb0Var;
        kb0 kb0Var2 = new kb0(1, "BOLD", "bold");
        VgvYg0wo = kb0Var2;
        kb0 kb0Var3 = new kb0(2, "FRESH", "fresh");
        P7K7Inc8 = kb0Var3;
        kb0 kb0Var4 = new kb0(3, "COZY", "cozy");
        b2ZJblxo = kb0Var4;
        kb0 kb0Var5 = new kb0(4, "INTENSE", "intense");
        Qr9iLBAD = kb0Var5;
        kb0[] kb0VarArr = {kb0Var, kb0Var2, kb0Var3, kb0Var4, kb0Var5};
        jb9XjC4I = kb0VarArr;
        eVhOlqcC = new bg(kb0VarArr);
        MdtA4re8 = new k00(12);
    }

    public kb0(int i, String str, String str2) {
        this.NCTxEWno = str2;
    }

    public static kb0 valueOf(String str) {
        return (kb0) Enum.valueOf(kb0.class, str);
    }

    public static kb0[] values() {
        return (kb0[]) jb9XjC4I.clone();
    }
}
