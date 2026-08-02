package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class mp7 {
    public static final mp7 a;
    public static final mp7 b;
    public static final mp7 c;
    public static final /* synthetic */ mp7[] d;

    static {
        mp7 mp7Var = new mp7("READY", 0);
        a = mp7Var;
        mp7 mp7Var2 = new mp7("WILL_FLUSH", 1);
        b = mp7Var2;
        mp7 mp7Var3 = new mp7("FLUSHED", 2);
        c = mp7Var3;
        d = new mp7[]{mp7Var, mp7Var2, mp7Var3};
    }

    public static mp7 valueOf(String str) {
        return (mp7) Enum.valueOf(mp7.class, str);
    }

    public static mp7[] values() {
        return (mp7[]) d.clone();
    }
}
