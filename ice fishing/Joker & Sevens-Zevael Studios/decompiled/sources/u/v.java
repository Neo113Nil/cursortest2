package u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: g, reason: collision with root package name */
    public static final v f6645g;

    /* renamed from: h, reason: collision with root package name */
    public static final v f6646h;

    /* renamed from: i, reason: collision with root package name */
    public static final v f6647i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ v[] f6648j;

    static {
        v vVar = new v("PreEnter", 0);
        f6645g = vVar;
        v vVar2 = new v("Visible", 1);
        f6646h = vVar2;
        v vVar3 = new v("PostExit", 2);
        f6647i = vVar3;
        f6648j = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f6648j.clone();
    }
}
