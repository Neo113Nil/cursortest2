package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ymp {
    public static final ymp a;
    public static final ymp b;
    public static final /* synthetic */ ymp[] c;

    static {
        ymp ympVar = new ymp("CRASHLYTICS", 0);
        a = ympVar;
        ymp ympVar2 = new ymp("PERFORMANCE", 1);
        b = ympVar2;
        c = new ymp[]{ympVar, ympVar2, new ymp("MATT_SAYS_HI", 2)};
    }

    public static ymp valueOf(String str) {
        return (ymp) Enum.valueOf(ymp.class, str);
    }

    public static ymp[] values() {
        return (ymp[]) c.clone();
    }
}
