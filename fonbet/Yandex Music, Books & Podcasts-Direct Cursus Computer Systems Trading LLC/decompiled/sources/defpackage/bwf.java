package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class bwf {
    public static final bwf a;
    public static final bwf b;
    public static final bwf c;
    public static final /* synthetic */ bwf[] d;

    static {
        bwf bwfVar = new bwf("SYNCHRONIZED", 0);
        a = bwfVar;
        bwf bwfVar2 = new bwf("PUBLICATION", 1);
        b = bwfVar2;
        bwf bwfVar3 = new bwf("NONE", 2);
        c = bwfVar3;
        d = new bwf[]{bwfVar, bwfVar2, bwfVar3};
    }

    public static bwf valueOf(String str) {
        return (bwf) Enum.valueOf(bwf.class, str);
    }

    public static bwf[] values() {
        return (bwf[]) d.clone();
    }
}
