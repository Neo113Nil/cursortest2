package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w3n {
    public static final vpl c;
    public static final w3n d;
    public static final w3n e;
    public static final w3n f;
    public static final /* synthetic */ w3n[] g;
    public static final /* synthetic */ rdb h;
    public final String a;
    public final float b;

    static {
        w3n w3nVar = new w3n("PAYMENT_CANCEL", 0, "payment_cancel", 1.0f);
        d = w3nVar;
        w3n w3nVar2 = new w3n("PAYMENT_FAILURE", 1, "payment_failure", 2.0f);
        e = w3nVar2;
        w3n w3nVar3 = new w3n("PAYMENT_SUCCESS", 2, "payment_success", 3.0f);
        f = w3nVar3;
        w3n[] w3nVarArr = {w3nVar, w3nVar2, w3nVar3};
        g = w3nVarArr;
        h = new rdb(w3nVarArr);
        c = new vpl();
    }

    public w3n(String str, int i, String str2, float f2) {
        this.a = str2;
        this.b = f2;
    }

    public static w3n valueOf(String str) {
        return (w3n) Enum.valueOf(w3n.class, str);
    }

    public static w3n[] values() {
        return (w3n[]) g.clone();
    }
}
