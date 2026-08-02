package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yur {
    public static final yur a;
    public static final yur b;
    public static final /* synthetic */ yur[] c;

    static {
        yur yurVar = new yur("Forward", 0);
        a = yurVar;
        yur yurVar2 = new yur("Backward", 1);
        b = yurVar2;
        c = new yur[]{yurVar, yurVar2};
    }

    public static yur valueOf(String str) {
        return (yur) Enum.valueOf(yur.class, str);
    }

    public static yur[] values() {
        return (yur[]) c.clone();
    }
}
