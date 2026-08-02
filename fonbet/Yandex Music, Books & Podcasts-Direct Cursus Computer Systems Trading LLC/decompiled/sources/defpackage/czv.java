package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class czv {
    public static final czv a;
    public static final czv b;
    public static final czv c;
    public static final /* synthetic */ czv[] d;

    static {
        czv czvVar = new czv("ZOOM_IN", 0);
        a = czvVar;
        czv czvVar2 = new czv("ZOOM_OUT", 1);
        b = czvVar2;
        czv czvVar3 = new czv("NONE", 2);
        c = czvVar3;
        d = new czv[]{czvVar, czvVar2, czvVar3};
    }

    public static czv valueOf(String str) {
        return (czv) Enum.valueOf(czv.class, str);
    }

    public static czv[] values() {
        return (czv[]) d.clone();
    }
}
