package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class lzv {
    public static final lzv a;
    public static final lzv b;
    public static final lzv c;
    public static final lzv d;
    public static final /* synthetic */ lzv[] e;

    static {
        lzv lzvVar = new lzv("UP", 0);
        a = lzvVar;
        lzv lzvVar2 = new lzv("DOWN", 1);
        b = lzvVar2;
        lzv lzvVar3 = new lzv("LEFT", 2);
        c = lzvVar3;
        lzv lzvVar4 = new lzv("RIGHT", 3);
        d = lzvVar4;
        e = new lzv[]{lzvVar, lzvVar2, lzvVar3, lzvVar4};
    }

    public static lzv valueOf(String str) {
        return (lzv) Enum.valueOf(lzv.class, str);
    }

    public static lzv[] values() {
        return (lzv[]) e.clone();
    }
}
