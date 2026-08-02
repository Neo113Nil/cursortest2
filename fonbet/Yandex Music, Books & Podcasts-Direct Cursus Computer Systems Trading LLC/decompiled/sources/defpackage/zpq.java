package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zpq {
    public static final zpq a;
    public static final zpq b;
    public static final /* synthetic */ zpq[] c;

    static {
        zpq zpqVar = new zpq("NETWORK", 0);
        a = zpqVar;
        zpq zpqVar2 = new zpq("NOT_FOUND", 1);
        b = zpqVar2;
        c = new zpq[]{zpqVar, zpqVar2};
    }

    public static zpq valueOf(String str) {
        return (zpq) Enum.valueOf(zpq.class, str);
    }

    public static zpq[] values() {
        return (zpq[]) c.clone();
    }
}
