package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cci {
    public static final cci a;
    public static final cci b;
    public static final cci c;
    public static final /* synthetic */ cci[] d;

    static {
        cci cciVar = new cci("Hidden", 0);
        a = cciVar;
        cci cciVar2 = new cci("Expanded", 1);
        b = cciVar2;
        cci cciVar3 = new cci("HalfExpanded", 2);
        c = cciVar3;
        d = new cci[]{cciVar, cciVar2, cciVar3};
    }

    public static cci valueOf(String str) {
        return (cci) Enum.valueOf(cci.class, str);
    }

    public static cci[] values() {
        return (cci[]) d.clone();
    }
}
