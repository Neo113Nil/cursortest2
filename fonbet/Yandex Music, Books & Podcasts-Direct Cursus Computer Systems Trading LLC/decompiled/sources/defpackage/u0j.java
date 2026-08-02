package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u0j {
    public static final u0j a;
    public static final u0j b;
    public static final /* synthetic */ u0j[] c;

    static {
        u0j u0jVar = new u0j("OFFLINE", 0);
        a = u0jVar;
        u0j u0jVar2 = new u0j("ONLINE", 1);
        b = u0jVar2;
        c = new u0j[]{u0jVar, u0jVar2};
    }

    public static u0j valueOf(String str) {
        return (u0j) Enum.valueOf(u0j.class, str);
    }

    public static u0j[] values() {
        return (u0j[]) c.clone();
    }
}
