package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bik {
    public static final bik a;
    public static final bik b;
    public static final bik c;
    public static final bik d;
    public static final /* synthetic */ bik[] e;

    static {
        bik bikVar = new bik("SUPPORT", 0);
        a = bikVar;
        bik bikVar2 = new bik("RESTORE", 1);
        b = bikVar2;
        bik bikVar3 = new bik("LOGOUT", 2);
        c = bikVar3;
        bik bikVar4 = new bik("PROMO_CODE", 3);
        d = bikVar4;
        e = new bik[]{bikVar, bikVar2, bikVar3, bikVar4};
    }

    public static bik valueOf(String str) {
        return (bik) Enum.valueOf(bik.class, str);
    }

    public static bik[] values() {
        return (bik[]) e.clone();
    }
}
