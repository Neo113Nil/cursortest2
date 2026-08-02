package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class nrr {
    public static final nrr a;
    public static final nrr b;
    public static final nrr c;
    public static final /* synthetic */ nrr[] d;

    static {
        nrr nrrVar = new nrr("SUCCESS", 0);
        a = nrrVar;
        nrr nrrVar2 = new nrr("FAILED", 1);
        b = nrrVar2;
        nrr nrrVar3 = new nrr("IN_PROGRESS", 2);
        c = nrrVar3;
        d = new nrr[]{nrrVar, nrrVar2, nrrVar3};
    }

    public static nrr valueOf(String str) {
        return (nrr) Enum.valueOf(nrr.class, str);
    }

    public static nrr[] values() {
        return (nrr[]) d.clone();
    }
}
