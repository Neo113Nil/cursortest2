package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: g, reason: collision with root package name */
    public static final p f1603g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f1604h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f1605i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f1606j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p[] f1607k;

    static {
        p pVar = new p("Active", 0);
        f1603g = pVar;
        p pVar2 = new p("ActiveParent", 1);
        f1604h = pVar2;
        p pVar3 = new p("Captured", 2);
        f1605i = pVar3;
        p pVar4 = new p("Inactive", 3);
        f1606j = pVar4;
        f1607k = new p[]{pVar, pVar2, pVar3, pVar4};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f1607k.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                throw new ac.d();
            }
        }
        return true;
    }
}
