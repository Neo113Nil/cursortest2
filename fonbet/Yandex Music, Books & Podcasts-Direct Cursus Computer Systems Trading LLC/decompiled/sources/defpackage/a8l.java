package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class a8l {
    public static final a8l a;
    public static final a8l b;
    public static final a8l c;
    public static final a8l d;
    public static final /* synthetic */ a8l[] e;

    static {
        a8l a8lVar = new a8l("IDLE", 0);
        a = a8lVar;
        a8l a8lVar2 = new a8l("LAUNCHING", 1);
        b = a8lVar2;
        a8l a8lVar3 = new a8l("PLAYING", 2);
        c = a8lVar3;
        a8l a8lVar4 = new a8l("PAUSED", 3);
        d = a8lVar4;
        e = new a8l[]{a8lVar, a8lVar2, a8lVar3, a8lVar4};
    }

    public static a8l valueOf(String str) {
        return (a8l) Enum.valueOf(a8l.class, str);
    }

    public static a8l[] values() {
        return (a8l[]) e.clone();
    }
}
