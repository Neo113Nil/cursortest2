package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class tf {
    public static final tf b;
    public static final tf c;
    public static final tf d;
    public static final /* synthetic */ tf[] e;

    static {
        tf tfVar = new tf("UNKNOWN", 0);
        b = tfVar;
        tf tfVar2 = new tf("NETWORK", 1);
        c = tfVar2;
        tf tfVar3 = new tf("INVALID_RESPONSE", 2);
        d = tfVar3;
        e = new tf[]{tfVar, tfVar2, tfVar3};
    }

    public static tf valueOf(String str) {
        return (tf) Enum.valueOf(tf.class, str);
    }

    public static tf[] values() {
        return (tf[]) e.clone();
    }
}
