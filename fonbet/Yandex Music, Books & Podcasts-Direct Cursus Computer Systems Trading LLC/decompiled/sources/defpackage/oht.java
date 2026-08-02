package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class oht {
    public static final oht a;
    public static final oht b;
    public static final oht c;
    public static final /* synthetic */ oht[] d;

    static {
        oht ohtVar = new oht("SYSTEM", 0);
        a = ohtVar;
        oht ohtVar2 = new oht("LIGHT", 1);
        b = ohtVar2;
        oht ohtVar3 = new oht("DARK", 2);
        c = ohtVar3;
        d = new oht[]{ohtVar, ohtVar2, ohtVar3};
    }

    public static oht valueOf(String str) {
        return (oht) Enum.valueOf(oht.class, str);
    }

    public static oht[] values() {
        return (oht[]) d.clone();
    }
}
