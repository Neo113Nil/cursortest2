package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class fmr {
    public static final fmr a;
    public static final fmr b;
    public static final fmr c;
    public static final /* synthetic */ fmr[] d;

    static {
        fmr fmrVar = new fmr("NO_CONNECTION", 0);
        a = fmrVar;
        fmr fmrVar2 = new fmr("NO_AUTH", 1);
        b = fmrVar2;
        fmr fmrVar3 = new fmr("URL_FAIL", 2);
        c = fmrVar3;
        d = new fmr[]{fmrVar, fmrVar2, fmrVar3};
    }

    public static fmr valueOf(String str) {
        return (fmr) Enum.valueOf(fmr.class, str);
    }

    public static fmr[] values() {
        return (fmr[]) d.clone();
    }
}
