package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h2l {
    public static final h2l a;
    public static final h2l b;
    public static final /* synthetic */ h2l[] c;

    static {
        h2l h2lVar = new h2l("Forward", 0);
        a = h2lVar;
        h2l h2lVar2 = new h2l("Backward", 1);
        b = h2lVar2;
        c = new h2l[]{h2lVar, h2lVar2};
    }

    public static h2l valueOf(String str) {
        return (h2l) Enum.valueOf(h2l.class, str);
    }

    public static h2l[] values() {
        return (h2l[]) c.clone();
    }
}
