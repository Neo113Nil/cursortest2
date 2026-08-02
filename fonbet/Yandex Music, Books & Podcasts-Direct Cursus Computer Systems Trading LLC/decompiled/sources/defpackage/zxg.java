package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zxg {
    public static final zxg a;
    public static final /* synthetic */ zxg[] b;

    static {
        zxg zxgVar = new zxg("Immediately", 0);
        a = zxgVar;
        b = new zxg[]{zxgVar, new zxg("OnIterationFinish", 1)};
    }

    public static zxg valueOf(String str) {
        return (zxg) Enum.valueOf(zxg.class, str);
    }

    public static zxg[] values() {
        return (zxg[]) b.clone();
    }
}
