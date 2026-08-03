package qd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final f f5842g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f5843h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f5844i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ f[] f5845j;

    static {
        f fVar = new f("TARGET_SEVEN", 0);
        f5842g = fVar;
        f fVar2 = new f("TARGET_JOKER", 1);
        f5843h = fVar2;
        f fVar3 = new f("NON_TARGET", 2);
        f5844i = fVar3;
        f5845j = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f5845j.clone();
    }
}
