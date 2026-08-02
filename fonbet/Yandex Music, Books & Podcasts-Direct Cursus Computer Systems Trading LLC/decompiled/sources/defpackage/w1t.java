package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w1t {
    public static final w1t a;
    public static final w1t b;
    public static final /* synthetic */ w1t[] c;

    static {
        w1t w1tVar = new w1t("COVER", 0);
        a = w1tVar;
        w1t w1tVar2 = new w1t("ALBUM", 1);
        b = w1tVar2;
        c = new w1t[]{w1tVar, w1tVar2};
    }

    public static w1t valueOf(String str) {
        return (w1t) Enum.valueOf(w1t.class, str);
    }

    public static w1t[] values() {
        return (w1t[]) c.clone();
    }
}
