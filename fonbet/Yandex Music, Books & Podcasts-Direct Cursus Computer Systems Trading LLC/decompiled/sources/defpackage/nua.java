package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class nua {
    public static final nua a;
    public static final nua b;
    public static final /* synthetic */ nua[] c;

    static {
        nua nuaVar = new nua("NORMAL", 0);
        a = nuaVar;
        nua nuaVar2 = new nua("REDUCED", 1);
        b = nuaVar2;
        c = new nua[]{nuaVar, nuaVar2};
    }

    public static nua valueOf(String str) {
        return (nua) Enum.valueOf(nua.class, str);
    }

    public static nua[] values() {
        return (nua[]) c.clone();
    }
}
