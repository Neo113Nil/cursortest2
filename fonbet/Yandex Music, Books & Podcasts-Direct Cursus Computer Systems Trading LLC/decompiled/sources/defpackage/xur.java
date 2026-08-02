package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xur {
    public static final xur a;
    public static final xur b;
    public static final /* synthetic */ xur[] c;

    static {
        xur xurVar = new xur("Forward", 0);
        a = xurVar;
        xur xurVar2 = new xur("Backward", 1);
        b = xurVar2;
        c = new xur[]{xurVar, xurVar2};
    }

    public static xur valueOf(String str) {
        return (xur) Enum.valueOf(xur.class, str);
    }

    public static xur[] values() {
        return (xur[]) c.clone();
    }
}
