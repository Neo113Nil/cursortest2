package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class med {
    public static final med a;
    public static final med b;
    public static final /* synthetic */ med[] c;

    static {
        med medVar = new med("HOLDING", 0);
        a = medVar;
        med medVar2 = new med("AUTO_CONNECT", 1);
        b = medVar2;
        c = new med[]{medVar, medVar2};
    }

    public static med valueOf(String str) {
        return (med) Enum.valueOf(med.class, str);
    }

    public static med[] values() {
        return (med[]) c.clone();
    }
}
