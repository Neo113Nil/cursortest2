package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q9l {
    public static final q9l a;
    public static final q9l b;
    public static final q9l c;
    public static final q9l d;
    public static final /* synthetic */ q9l[] e;

    static {
        q9l q9lVar = new q9l("Initial", 0);
        a = q9lVar;
        q9l q9lVar2 = new q9l("Loaded", 1);
        b = q9lVar2;
        q9l q9lVar3 = new q9l("Shown", 2);
        c = q9lVar3;
        q9l q9lVar4 = new q9l("Started", 3);
        d = q9lVar4;
        e = new q9l[]{q9lVar, q9lVar2, q9lVar3, q9lVar4};
    }

    public static q9l valueOf(String str) {
        return (q9l) Enum.valueOf(q9l.class, str);
    }

    public static q9l[] values() {
        return (q9l[]) e.clone();
    }
}
