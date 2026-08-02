package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class isl {
    public static final isl a;
    public static final isl b;
    public static final /* synthetic */ isl[] c;

    static {
        isl islVar = new isl("Local", 0);
        a = islVar;
        isl islVar2 = new isl("Remote", 1);
        b = islVar2;
        c = new isl[]{islVar, islVar2};
    }

    public static isl valueOf(String str) {
        return (isl) Enum.valueOf(isl.class, str);
    }

    public static isl[] values() {
        return (isl[]) c.clone();
    }
}
