package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ujf {
    public static final b2c a;
    public static final ujf b;
    public static final ujf c;
    public static final /* synthetic */ ujf[] d;

    static {
        ujf ujfVar = new ujf("DEFAULT", 0);
        b = ujfVar;
        ujf ujfVar2 = new ujf("WRAP_CONTENT", 1);
        c = ujfVar2;
        d = new ujf[]{ujfVar, ujfVar2};
        a = new b2c();
    }

    public static ujf valueOf(String str) {
        return (ujf) Enum.valueOf(ujf.class, str);
    }

    public static ujf[] values() {
        return (ujf[]) d.clone();
    }
}
