package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gde {
    public static final gde a;
    public static final gde b;
    public static final gde c;
    public static final /* synthetic */ gde[] d;

    static {
        gde gdeVar = new gde("STACK", 0);
        a = gdeVar;
        gde gdeVar2 = new gde("RADIAL", 1);
        b = gdeVar2;
        gde gdeVar3 = new gde("SINGLE", 2);
        c = gdeVar3;
        d = new gde[]{gdeVar, gdeVar2, gdeVar3};
    }

    public static gde valueOf(String str) {
        return (gde) Enum.valueOf(gde.class, str);
    }

    public static gde[] values() {
        return (gde[]) d.clone();
    }
}
