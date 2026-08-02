package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w5t {
    public static final w5t a;
    public static final w5t b;
    public static final /* synthetic */ w5t[] c;

    static {
        w5t w5tVar = new w5t("WITH_COVER", 0);
        a = w5tVar;
        w5t w5tVar2 = new w5t("WITH_POSITION", 1);
        b = w5tVar2;
        c = new w5t[]{w5tVar, w5tVar2};
    }

    public static w5t valueOf(String str) {
        return (w5t) Enum.valueOf(w5t.class, str);
    }

    public static w5t[] values() {
        return (w5t[]) c.clone();
    }
}
