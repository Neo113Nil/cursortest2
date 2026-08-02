package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class cik {
    public static final cik a;
    public static final cik b;
    public static final cik c;
    public static final /* synthetic */ cik[] d;

    static {
        cik cikVar = new cik("Fallback", 0);
        a = cikVar;
        cik cikVar2 = new cik("Close", 1);
        b = cikVar2;
        cik cikVar3 = new cik("Navigate", 2);
        c = cikVar3;
        d = new cik[]{cikVar, cikVar2, cikVar3};
    }

    public static cik valueOf(String str) {
        return (cik) Enum.valueOf(cik.class, str);
    }

    public static cik[] values() {
        return (cik[]) d.clone();
    }
}
