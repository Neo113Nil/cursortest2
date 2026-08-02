package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yzi {
    public static final yzi a;
    public static final yzi b;
    public static final yzi c;
    public static final yzi d;
    public static final /* synthetic */ yzi[] e;

    static {
        yzi yziVar = new yzi("WIFI", 0);
        a = yziVar;
        yzi yziVar2 = new yzi("MOBILE", 1);
        b = yziVar2;
        yzi yziVar3 = new yzi("OTHER", 2);
        c = yziVar3;
        yzi yziVar4 = new yzi("NONE", 3);
        d = yziVar4;
        e = new yzi[]{yziVar, yziVar2, yziVar3, yziVar4};
    }

    public static yzi valueOf(String str) {
        return (yzi) Enum.valueOf(yzi.class, str);
    }

    public static yzi[] values() {
        return (yzi[]) e.clone();
    }
}
