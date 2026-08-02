package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class emg {
    public static final emg a;
    public static final emg b;
    public static final /* synthetic */ emg[] c;

    static {
        emg emgVar = new emg("LOGIN", 0);
        a = emgVar;
        emg emgVar2 = new emg("LOGIN_BUTTON", 1);
        b = emgVar2;
        c = new emg[]{emgVar, emgVar2};
    }

    public static emg valueOf(String str) {
        return (emg) Enum.valueOf(emg.class, str);
    }

    public static emg[] values() {
        return (emg[]) c.clone();
    }
}
