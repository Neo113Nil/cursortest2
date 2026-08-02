package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class zbt {
    public static final zbt a;
    public static final zbt b;
    public static final zbt c;
    public static final /* synthetic */ zbt[] d;

    static {
        zbt zbtVar = new zbt("Samsung", 0);
        a = zbtVar;
        zbt zbtVar2 = new zbt("Lg", 1);
        b = zbtVar2;
        zbt zbtVar3 = new zbt("AndroidTv", 2);
        c = zbtVar3;
        d = new zbt[]{zbtVar, zbtVar2, zbtVar3};
    }

    public static zbt valueOf(String str) {
        return (zbt) Enum.valueOf(zbt.class, str);
    }

    public static zbt[] values() {
        return (zbt[]) d.clone();
    }
}
