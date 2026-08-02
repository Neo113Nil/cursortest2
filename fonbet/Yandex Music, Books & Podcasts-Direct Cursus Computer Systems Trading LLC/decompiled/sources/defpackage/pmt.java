package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class pmt {
    public static final pmt a;
    public static final pmt b;
    public static final pmt c;
    public static final /* synthetic */ pmt[] d;

    static {
        pmt pmtVar = new pmt("EXTERNAL", 0);
        a = pmtVar;
        pmt pmtVar2 = new pmt("PAUSE", 1);
        b = pmtVar2;
        pmt pmtVar3 = new pmt("FORCE_PAUSE", 2);
        c = pmtVar3;
        d = new pmt[]{pmtVar, pmtVar2, pmtVar3};
    }

    public static pmt valueOf(String str) {
        return (pmt) Enum.valueOf(pmt.class, str);
    }

    public static pmt[] values() {
        return (pmt[]) d.clone();
    }
}
