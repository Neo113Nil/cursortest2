package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ihv {
    public static final ihv a;
    public static final ihv b;
    public static final /* synthetic */ ihv[] c;

    static {
        ihv ihvVar = new ihv("HORIZONTAL", 0);
        a = ihvVar;
        ihv ihvVar2 = new ihv("VERTICAL", 1);
        b = ihvVar2;
        c = new ihv[]{ihvVar, ihvVar2};
    }

    public static ihv valueOf(String str) {
        return (ihv) Enum.valueOf(ihv.class, str);
    }

    public static ihv[] values() {
        return (ihv[]) c.clone();
    }
}
