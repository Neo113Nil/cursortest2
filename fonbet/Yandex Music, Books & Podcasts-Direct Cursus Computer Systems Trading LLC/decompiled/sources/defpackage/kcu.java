package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class kcu {
    public static final kcu a;
    public static final kcu b;
    public static final kcu c;
    public static final /* synthetic */ kcu[] d;

    static {
        kcu kcuVar = new kcu("None", 0);
        a = kcuVar;
        kcu kcuVar2 = new kcu("Visible", 1);
        b = kcuVar2;
        kcu kcuVar3 = new kcu("Loading", 2);
        c = kcuVar3;
        d = new kcu[]{kcuVar, kcuVar2, kcuVar3};
    }

    public static kcu valueOf(String str) {
        return (kcu) Enum.valueOf(kcu.class, str);
    }

    public static kcu[] values() {
        return (kcu[]) d.clone();
    }
}
