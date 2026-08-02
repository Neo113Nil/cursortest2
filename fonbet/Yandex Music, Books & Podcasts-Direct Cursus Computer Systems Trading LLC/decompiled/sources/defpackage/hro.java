package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class hro {
    public static final hro a;
    public static final hro b;
    public static final hro c;
    public static final /* synthetic */ hro[] d;

    static {
        hro hroVar = new hro("None", 0);
        a = hroVar;
        hro hroVar2 = new hro("Installed", 1);
        b = hroVar2;
        hro hroVar3 = new hro("Full", 2);
        c = hroVar3;
        d = new hro[]{hroVar, hroVar2, hroVar3};
    }

    public static hro valueOf(String str) {
        return (hro) Enum.valueOf(hro.class, str);
    }

    public static hro[] values() {
        return (hro[]) d.clone();
    }
}
