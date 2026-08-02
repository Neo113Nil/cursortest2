package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yun {
    public static final yun a;
    public static final /* synthetic */ yun[] b;

    static {
        yun yunVar = new yun("LAUNCH_INITIAL_REFRESH", 0);
        a = yunVar;
        b = new yun[]{yunVar, new yun("SKIP_INITIAL_REFRESH", 1)};
    }

    public static yun valueOf(String str) {
        return (yun) Enum.valueOf(yun.class, str);
    }

    public static yun[] values() {
        return (yun[]) b.clone();
    }
}
