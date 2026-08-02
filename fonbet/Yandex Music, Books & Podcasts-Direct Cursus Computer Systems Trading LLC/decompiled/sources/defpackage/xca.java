package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xca {
    public static final xca a;
    public static final xca b;
    public static final xca c;
    public static final /* synthetic */ xca[] d;

    static {
        xca xcaVar = new xca("DOWNLOADED_DATE", 0);
        a = xcaVar;
        xca xcaVar2 = new xca("ARTISTS", 1);
        b = xcaVar2;
        xca xcaVar3 = new xca("ALPHABET", 2);
        c = xcaVar3;
        d = new xca[]{xcaVar, xcaVar2, xcaVar3};
    }

    public static xca valueOf(String str) {
        return (xca) Enum.valueOf(xca.class, str);
    }

    public static xca[] values() {
        return (xca[]) d.clone();
    }
}
