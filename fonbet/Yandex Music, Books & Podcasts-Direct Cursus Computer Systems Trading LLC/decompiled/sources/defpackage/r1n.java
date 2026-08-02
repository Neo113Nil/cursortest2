package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r1n {
    public static final r1n a;
    public static final r1n b;
    public static final /* synthetic */ r1n[] c;

    static {
        r1n r1nVar = new r1n("Player", 0);
        a = r1nVar;
        r1n r1nVar2 = new r1n("Menu", 1);
        b = r1nVar2;
        c = new r1n[]{r1nVar, r1nVar2};
    }

    public static r1n valueOf(String str) {
        return (r1n) Enum.valueOf(r1n.class, str);
    }

    public static r1n[] values() {
        return (r1n[]) c.clone();
    }
}
