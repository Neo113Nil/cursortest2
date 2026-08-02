package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b8k {
    public static final b8k a;
    public static final b8k b;
    public static final b8k c;
    public static final b8k d;
    public static final b8k e;
    public static final b8k f;
    public static final /* synthetic */ b8k[] g;

    static {
        b8k b8kVar = new b8k("MISSING_TEMPLATE", 0);
        a = b8kVar;
        b8k b8kVar2 = new b8k("MISSING_VALUE", 1);
        b = b8kVar2;
        b8k b8kVar3 = new b8k("MISSING_VARIABLE", 2);
        c = b8kVar3;
        b8k b8kVar4 = new b8k("TYPE_MISMATCH", 3);
        d = b8kVar4;
        b8k b8kVar5 = new b8k("INVALID_VALUE", 4);
        e = b8kVar5;
        b8k b8kVar6 = new b8k("DEPENDENCY_FAILED", 5);
        f = b8kVar6;
        g = new b8k[]{b8kVar, b8kVar2, b8kVar3, b8kVar4, b8kVar5, b8kVar6};
    }

    public static b8k valueOf(String str) {
        return (b8k) Enum.valueOf(b8k.class, str);
    }

    public static b8k[] values() {
        return (b8k[]) g.clone();
    }
}
