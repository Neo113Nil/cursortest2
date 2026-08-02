package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class buo {
    public static final buo a;
    public static final buo b;
    public static final /* synthetic */ buo[] c;

    static {
        buo buoVar = new buo("APPS_FLYER", 0);
        a = buoVar;
        buo buoVar2 = new buo("NONE", 1);
        b = buoVar2;
        c = new buo[]{buoVar, buoVar2};
    }

    public static buo valueOf(String str) {
        return (buo) Enum.valueOf(buo.class, str);
    }

    public static buo[] values() {
        return (buo[]) c.clone();
    }
}
