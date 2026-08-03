package qd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    public static final m6.i f5870h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f5871i;

    /* renamed from: j, reason: collision with root package name */
    public static final l f5872j;

    /* renamed from: k, reason: collision with root package name */
    public static final l f5873k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ l[] f5874l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ic.b f5875m;

    /* renamed from: g, reason: collision with root package name */
    public final String f5876g;

    static {
        l lVar = new l("TIME_SLOW", 0, "time_slow");
        f5871i = lVar;
        l lVar2 = new l("ERROR_SHIELD", 1, "error_shield");
        f5872j = lVar2;
        l lVar3 = new l("JOKER_MAGNET", 2, "joker_magnet");
        f5873k = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f5874l = lVarArr;
        f5875m = new ic.b(lVarArr);
        f5870h = new m6.i(14);
    }

    public l(String str, int i10, String str2) {
        this.f5876g = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f5874l.clone();
    }
}
