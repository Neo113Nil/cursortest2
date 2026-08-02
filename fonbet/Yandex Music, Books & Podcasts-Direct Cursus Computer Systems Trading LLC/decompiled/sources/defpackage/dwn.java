package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class dwn {
    public static final dwn a;
    public static final dwn b;
    public static final /* synthetic */ dwn[] c;

    static {
        dwn dwnVar = new dwn("Removed", 0);
        a = dwnVar;
        dwn dwnVar2 = new dwn("Settled", 1);
        b = dwnVar2;
        c = new dwn[]{dwnVar, dwnVar2};
    }

    public static dwn valueOf(String str) {
        return (dwn) Enum.valueOf(dwn.class, str);
    }

    public static dwn[] values() {
        return (dwn[]) c.clone();
    }
}
