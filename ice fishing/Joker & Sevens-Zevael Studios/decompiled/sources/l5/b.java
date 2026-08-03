package l5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f4159g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f4160h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f4161i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f4162j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b[] f4163k;

    static {
        b bVar = new b("Push", 0);
        f4159g = bVar;
        b bVar2 = new b("Replace", 1);
        f4160h = bVar2;
        b bVar3 = new b("Pop", 2);
        f4161i = bVar3;
        b bVar4 = new b("Idle", 3);
        f4162j = bVar4;
        f4163k = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4163k.clone();
    }
}
