package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class lhi {
    public static final lhi a;
    public static final lhi b;
    public static final lhi c;
    public static final /* synthetic */ lhi[] d;

    static {
        lhi lhiVar = new lhi("DRAFT", 0);
        a = lhiVar;
        lhi lhiVar2 = new lhi("ENABLED", 1);
        b = lhiVar2;
        lhi lhiVar3 = new lhi("DISABLED", 2);
        c = lhiVar3;
        d = new lhi[]{lhiVar, lhiVar2, lhiVar3};
    }

    public static lhi valueOf(String str) {
        return (lhi) Enum.valueOf(lhi.class, str);
    }

    public static lhi[] values() {
        return (lhi[]) d.clone();
    }
}
