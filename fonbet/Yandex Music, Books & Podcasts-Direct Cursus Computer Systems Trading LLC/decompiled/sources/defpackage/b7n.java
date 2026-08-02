package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b7n {
    public static final b7n a;
    public static final b7n b;
    public static final b7n c;
    public static final /* synthetic */ b7n[] d;

    static {
        b7n b7nVar = new b7n("Select", 0);
        a = b7nVar;
        b7n b7nVar2 = new b7n("InsertMview", 1);
        b = b7nVar2;
        b7n b7nVar3 = new b7n("Other", 2);
        c = b7nVar3;
        d = new b7n[]{b7nVar, b7nVar2, b7nVar3};
    }

    public static b7n valueOf(String str) {
        return (b7n) Enum.valueOf(b7n.class, str);
    }

    public static b7n[] values() {
        return (b7n[]) d.clone();
    }
}
