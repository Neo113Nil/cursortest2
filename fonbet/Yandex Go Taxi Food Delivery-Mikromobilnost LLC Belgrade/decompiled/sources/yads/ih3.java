package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ih3 {
    public static final ih3 b;
    public static final /* synthetic */ ih3[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ih3 EF0;

    static {
        ih3 ih3Var = new ih3("FIT_XY", 0);
        ih3 ih3Var2 = new ih3("FIT_CENTER", 1);
        b = ih3Var2;
        c = new ih3[]{ih3Var, ih3Var2, new ih3("CENTER_CROP", 2)};
    }

    public static ih3 valueOf(String str) {
        return (ih3) Enum.valueOf(ih3.class, str);
    }

    public static ih3[] values() {
        return (ih3[]) c.clone();
    }
}
