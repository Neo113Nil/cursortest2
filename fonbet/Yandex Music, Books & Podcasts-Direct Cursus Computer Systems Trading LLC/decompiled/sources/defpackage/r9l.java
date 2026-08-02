package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r9l {
    public static final r9l a;
    public static final r9l b;
    public static final r9l c;
    public static final /* synthetic */ r9l[] d;

    static {
        r9l r9lVar = new r9l("Initial", 0);
        a = r9lVar;
        r9l r9lVar2 = new r9l("Loaded", 1);
        b = r9lVar2;
        r9l r9lVar3 = new r9l("Started", 2);
        c = r9lVar3;
        d = new r9l[]{r9lVar, r9lVar2, r9lVar3};
    }

    public static r9l valueOf(String str) {
        return (r9l) Enum.valueOf(r9l.class, str);
    }

    public static r9l[] values() {
        return (r9l[]) d.clone();
    }
}
