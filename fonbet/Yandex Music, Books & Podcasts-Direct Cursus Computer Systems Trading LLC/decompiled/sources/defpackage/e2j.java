package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class e2j {
    public static final e2j a;
    public static final e2j b;
    public static final /* synthetic */ e2j[] c;

    static {
        e2j e2jVar = new e2j("RECEIVED", 0);
        a = e2jVar;
        e2j e2jVar2 = new e2j("TRANSMITTED", 1);
        b = e2jVar2;
        c = new e2j[]{e2jVar, e2jVar2};
    }

    public static e2j valueOf(String str) {
        return (e2j) Enum.valueOf(e2j.class, str);
    }

    public static e2j[] values() {
        return (e2j[]) c.clone();
    }
}
