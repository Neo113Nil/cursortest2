package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nso {
    public static final nso a;
    public static final nso b;
    public static final /* synthetic */ nso[] c;

    static {
        nso nsoVar = new nso("FILL", 0);
        a = nsoVar;
        nso nsoVar2 = new nso("FIT", 1);
        b = nsoVar2;
        c = new nso[]{nsoVar, nsoVar2};
    }

    public static nso valueOf(String str) {
        return (nso) Enum.valueOf(nso.class, str);
    }

    public static nso[] values() {
        return (nso[]) c.clone();
    }
}
