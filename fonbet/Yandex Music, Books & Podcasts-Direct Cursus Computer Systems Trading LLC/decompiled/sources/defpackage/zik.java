package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zik {
    public static final zik a;
    public static final zik b;
    public static final zik c;
    public static final /* synthetic */ zik[] d;

    static {
        zik zikVar = new zik("InitialLoading", 0);
        a = zikVar;
        zik zikVar2 = new zik("PlusPaywall", 1);
        b = zikVar2;
        zik zikVar3 = new zik("UserInfoUpdate", 2);
        c = zikVar3;
        d = new zik[]{zikVar, zikVar2, zikVar3};
    }

    public static zik valueOf(String str) {
        return (zik) Enum.valueOf(zik.class, str);
    }

    public static zik[] values() {
        return (zik[]) d.clone();
    }
}
