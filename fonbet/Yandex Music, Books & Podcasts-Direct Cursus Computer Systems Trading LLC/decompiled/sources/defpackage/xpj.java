package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class xpj {
    public static final xpj a;
    public static final /* synthetic */ xpj[] b;

    /* JADX INFO: Fake field, exist only in values array */
    xpj EF0;

    static {
        xpj xpjVar = new xpj("SKIP", 0);
        xpj xpjVar2 = new xpj("TERMINATE", 1);
        a = xpjVar2;
        b = new xpj[]{xpjVar, xpjVar2};
    }

    public static xpj valueOf(String str) {
        return (xpj) Enum.valueOf(xpj.class, str);
    }

    public static xpj[] values() {
        return (xpj[]) b.clone();
    }
}
