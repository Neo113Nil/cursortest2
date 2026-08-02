package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v9t {
    public static final v9t a;
    public static final v9t b;
    public static final v9t c;
    public static final /* synthetic */ v9t[] d;

    static {
        v9t v9tVar = new v9t("ContinueTraversal", 0);
        a = v9tVar;
        v9t v9tVar2 = new v9t("SkipSubtreeAndContinueTraversal", 1);
        b = v9tVar2;
        v9t v9tVar3 = new v9t("CancelTraversal", 2);
        c = v9tVar3;
        d = new v9t[]{v9tVar, v9tVar2, v9tVar3};
    }

    public static v9t valueOf(String str) {
        return (v9t) Enum.valueOf(v9t.class, str);
    }

    public static v9t[] values() {
        return (v9t[]) d.clone();
    }
}
