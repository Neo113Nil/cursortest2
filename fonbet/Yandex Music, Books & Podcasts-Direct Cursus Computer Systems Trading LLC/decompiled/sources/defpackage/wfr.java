package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class wfr {
    public static final ybl b;
    public static final /* synthetic */ wfr[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        wfr[] wfrVarArr = {new wfr("SMALL", 0, "SMALL"), new wfr("MEDIUM", 1, "MEDIUM"), new wfr("LARGE", 2, "LARGE")};
        c = wfrVarArr;
        d = new rdb(wfrVarArr);
        b = new ybl();
    }

    public wfr(String str, int i, String str2) {
        this.a = str2;
    }

    public static wfr valueOf(String str) {
        return (wfr) Enum.valueOf(wfr.class, str);
    }

    public static wfr[] values() {
        return (wfr[]) c.clone();
    }
}
