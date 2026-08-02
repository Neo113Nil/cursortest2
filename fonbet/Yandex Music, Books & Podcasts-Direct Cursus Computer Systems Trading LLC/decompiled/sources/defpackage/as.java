package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class as {
    public static final as a;
    public static final as b;
    public static final /* synthetic */ as[] c;

    static {
        as asVar = new as("Local", 0);
        a = asVar;
        as asVar2 = new as("Remote", 1);
        b = asVar2;
        c = new as[]{asVar, asVar2};
    }

    public static as valueOf(String str) {
        return (as) Enum.valueOf(as.class, str);
    }

    public static as[] values() {
        return (as[]) c.clone();
    }
}
