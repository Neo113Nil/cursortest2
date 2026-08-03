package yc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: g, reason: collision with root package name */
    public static final z f8921g;

    /* renamed from: h, reason: collision with root package name */
    public static final z f8922h;

    /* renamed from: i, reason: collision with root package name */
    public static final z f8923i;

    /* renamed from: j, reason: collision with root package name */
    public static final z f8924j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ z[] f8925k;

    static {
        z zVar = new z("DEFAULT", 0);
        f8921g = zVar;
        z zVar2 = new z("LAZY", 1);
        f8922h = zVar2;
        z zVar3 = new z("ATOMIC", 2);
        f8923i = zVar3;
        z zVar4 = new z("UNDISPATCHED", 3);
        f8924j = zVar4;
        f8925k = new z[]{zVar, zVar2, zVar3, zVar4};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f8925k.clone();
    }
}
