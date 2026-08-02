package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class xku {
    public static final xku a;
    public static final xku b;
    public static final xku c;
    public static final /* synthetic */ xku[] d;

    static {
        xku xkuVar = new xku("MIX", 0);
        a = xkuVar;
        xku xkuVar2 = new xku("DEFAULT", 1);
        b = xkuVar2;
        xku xkuVar3 = new xku("Q2V", 2);
        c = xkuVar3;
        d = new xku[]{xkuVar, xkuVar2, xkuVar3};
    }

    public static xku valueOf(String str) {
        return (xku) Enum.valueOf(xku.class, str);
    }

    public static xku[] values() {
        return (xku[]) d.clone();
    }
}
