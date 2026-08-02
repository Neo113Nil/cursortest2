package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i8j {
    public static final i8j a;
    public static final i8j b;
    public static final /* synthetic */ i8j[] c;

    static {
        i8j i8jVar = new i8j("Min", 0);
        a = i8jVar;
        i8j i8jVar2 = new i8j("Max", 1);
        b = i8jVar2;
        c = new i8j[]{i8jVar, i8jVar2};
    }

    public static i8j valueOf(String str) {
        return (i8j) Enum.valueOf(i8j.class, str);
    }

    public static i8j[] values() {
        return (i8j[]) c.clone();
    }
}
