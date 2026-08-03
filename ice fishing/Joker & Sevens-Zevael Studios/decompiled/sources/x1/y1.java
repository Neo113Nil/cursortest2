package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: g, reason: collision with root package name */
    public static final y1 f8218g;

    /* renamed from: h, reason: collision with root package name */
    public static final y1 f8219h;

    /* renamed from: i, reason: collision with root package name */
    public static final y1 f8220i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ y1[] f8221j;

    static {
        y1 y1Var = new y1("ContinueTraversal", 0);
        f8218g = y1Var;
        y1 y1Var2 = new y1("SkipSubtreeAndContinueTraversal", 1);
        f8219h = y1Var2;
        y1 y1Var3 = new y1("CancelTraversal", 2);
        f8220i = y1Var3;
        f8221j = new y1[]{y1Var, y1Var2, y1Var3};
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) f8221j.clone();
    }
}
