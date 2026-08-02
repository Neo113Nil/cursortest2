package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class w46 {
    public static final w46 a;
    public static final /* synthetic */ w46[] b;

    static {
        w46 w46Var = new w46("SEND", 0);
        a = w46Var;
        b = new w46[]{w46Var};
    }

    public static w46 valueOf(String str) {
        return (w46) Enum.valueOf(w46.class, str);
    }

    public static w46[] values() {
        return (w46[]) b.clone();
    }
}
