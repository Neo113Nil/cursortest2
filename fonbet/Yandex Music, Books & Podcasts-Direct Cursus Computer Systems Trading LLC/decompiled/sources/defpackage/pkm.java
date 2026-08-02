package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class pkm {
    public static final pkm a;
    public static final pkm b;
    public static final /* synthetic */ pkm[] c;

    static {
        pkm pkmVar = new pkm("SUBSCRIBE", 0);
        a = pkmVar;
        pkm pkmVar2 = new pkm("UNSUBSCRIBE", 1);
        b = pkmVar2;
        c = new pkm[]{pkmVar, pkmVar2};
    }

    public static pkm valueOf(String str) {
        return (pkm) Enum.valueOf(pkm.class, str);
    }

    public static pkm[] values() {
        return (pkm[]) c.clone();
    }
}
