package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u0l {
    public static final u0l a;
    public static final u0l b;
    public static final /* synthetic */ u0l[] c;

    static {
        u0l u0lVar = new u0l("Muted", 0);
        a = u0lVar;
        u0l u0lVar2 = new u0l("Unmuted", 1);
        b = u0lVar2;
        c = new u0l[]{u0lVar, u0lVar2};
    }

    public static u0l valueOf(String str) {
        return (u0l) Enum.valueOf(u0l.class, str);
    }

    public static u0l[] values() {
        return (u0l[]) c.clone();
    }
}
