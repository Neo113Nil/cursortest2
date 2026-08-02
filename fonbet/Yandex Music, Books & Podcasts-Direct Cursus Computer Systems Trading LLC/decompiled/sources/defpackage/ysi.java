package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ysi {
    public static final ysi a;
    public static final ysi b;
    public static final /* synthetic */ ysi[] c;

    static {
        ysi ysiVar = new ysi("HISTORY", 0);
        a = ysiVar;
        ysi ysiVar2 = new ysi("LIKES", 1);
        b = ysiVar2;
        c = new ysi[]{ysiVar, ysiVar2};
    }

    public static ysi valueOf(String str) {
        return (ysi) Enum.valueOf(ysi.class, str);
    }

    public static ysi[] values() {
        return (ysi[]) c.clone();
    }
}
