package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wfh {
    public static final wfh a;
    public static final wfh b;
    public static final /* synthetic */ wfh[] c;

    static {
        wfh wfhVar = new wfh("Min", 0);
        a = wfhVar;
        wfh wfhVar2 = new wfh("Max", 1);
        b = wfhVar2;
        c = new wfh[]{wfhVar, wfhVar2};
    }

    public static wfh valueOf(String str) {
        return (wfh) Enum.valueOf(wfh.class, str);
    }

    public static wfh[] values() {
        return (wfh[]) c.clone();
    }
}
