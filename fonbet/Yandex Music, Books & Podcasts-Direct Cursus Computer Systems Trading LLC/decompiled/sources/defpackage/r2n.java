package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r2n {
    public static final r2n a;
    public static final r2n b;
    public static final /* synthetic */ r2n[] c;

    static {
        r2n r2nVar = new r2n("GRADIENT", 0);
        a = r2nVar;
        r2n r2nVar2 = new r2n("GRAY", 1);
        b = r2nVar2;
        c = new r2n[]{r2nVar, r2nVar2, new r2n("TEXT", 2)};
    }

    public static r2n valueOf(String str) {
        return (r2n) Enum.valueOf(r2n.class, str);
    }

    public static r2n[] values() {
        return (r2n[]) c.clone();
    }
}
