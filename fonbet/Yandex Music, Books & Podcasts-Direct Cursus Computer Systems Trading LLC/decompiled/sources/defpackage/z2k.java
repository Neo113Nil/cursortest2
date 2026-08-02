package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z2k {
    public static final z2k a;
    public static final z2k b;
    public static final z2k c;
    public static final /* synthetic */ z2k[] d;

    static {
        z2k z2kVar = new z2k("Crop", 0);
        a = z2kVar;
        z2k z2kVar2 = new z2k("HorizontalMargins", 1);
        b = z2kVar2;
        z2k z2kVar3 = new z2k("VerticalMargins", 2);
        c = z2kVar3;
        d = new z2k[]{z2kVar, z2kVar2, z2kVar3};
    }

    public static z2k valueOf(String str) {
        return (z2k) Enum.valueOf(z2k.class, str);
    }

    public static z2k[] values() {
        return (z2k[]) d.clone();
    }
}
