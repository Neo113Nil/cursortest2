package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ite {
    public static final ite a;
    public static final ite b;
    public static final ite c;
    public static final /* synthetic */ ite[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ite EF0;

    static {
        ite iteVar = new ite("CT_UNKNOWN", 0);
        ite iteVar2 = new ite("CT_INFO", 1);
        a = iteVar2;
        ite iteVar3 = new ite("CT_WARNING", 2);
        b = iteVar3;
        ite iteVar4 = new ite("CT_ERROR", 3);
        c = iteVar4;
        d = new ite[]{iteVar, iteVar2, iteVar3, iteVar4};
    }

    public static ite valueOf(String str) {
        return (ite) Enum.valueOf(ite.class, str);
    }

    public static ite[] values() {
        return (ite[]) d.clone();
    }
}
