package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class plj {
    public static final plj a;
    public static final plj b;
    public static final plj c;
    public static final /* synthetic */ plj[] d;

    static {
        plj pljVar = new plj("NONE", 0);
        a = pljVar;
        plj pljVar2 = new plj("SHUFFLE", 1);
        b = pljVar2;
        plj pljVar3 = new plj("ML", 2);
        c = pljVar3;
        d = new plj[]{pljVar, pljVar2, pljVar3};
    }

    public static plj valueOf(String str) {
        return (plj) Enum.valueOf(plj.class, str);
    }

    public static plj[] values() {
        return (plj[]) d.clone();
    }
}
