package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class dhv {
    public static final dhv a;
    public static final dhv b;
    public static final dhv c;
    public static final /* synthetic */ dhv[] d;

    static {
        dhv dhvVar = new dhv("INTENT_IS_NOT_FROM_WHATSAPP", 0);
        a = dhvVar;
        dhv dhvVar2 = new dhv("OTP_CODE_NOT_RECEIVED", 1);
        b = dhvVar2;
        dhv dhvVar3 = new dhv("GENERIC_EXCEPTION", 2);
        c = dhvVar3;
        d = new dhv[]{dhvVar, dhvVar2, dhvVar3};
    }

    public static dhv valueOf(String str) {
        return (dhv) Enum.valueOf(dhv.class, str);
    }

    public static dhv[] values() {
        return (dhv[]) d.clone();
    }
}
