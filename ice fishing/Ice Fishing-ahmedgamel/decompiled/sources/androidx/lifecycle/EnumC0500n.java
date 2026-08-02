package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0500n {
    private static final /* synthetic */ EnumC0500n[] $VALUES;
    public static final C0498l Companion;
    public static final EnumC0500n ON_ANY;
    public static final EnumC0500n ON_CREATE;
    public static final EnumC0500n ON_DESTROY;
    public static final EnumC0500n ON_PAUSE;
    public static final EnumC0500n ON_RESUME;
    public static final EnumC0500n ON_START;
    public static final EnumC0500n ON_STOP;

    static {
        EnumC0500n enumC0500n = new EnumC0500n("ON_CREATE", 0);
        ON_CREATE = enumC0500n;
        EnumC0500n enumC0500n2 = new EnumC0500n("ON_START", 1);
        ON_START = enumC0500n2;
        EnumC0500n enumC0500n3 = new EnumC0500n("ON_RESUME", 2);
        ON_RESUME = enumC0500n3;
        EnumC0500n enumC0500n4 = new EnumC0500n("ON_PAUSE", 3);
        ON_PAUSE = enumC0500n4;
        EnumC0500n enumC0500n5 = new EnumC0500n("ON_STOP", 4);
        ON_STOP = enumC0500n5;
        EnumC0500n enumC0500n6 = new EnumC0500n("ON_DESTROY", 5);
        ON_DESTROY = enumC0500n6;
        EnumC0500n enumC0500n7 = new EnumC0500n("ON_ANY", 6);
        ON_ANY = enumC0500n7;
        $VALUES = new EnumC0500n[]{enumC0500n, enumC0500n2, enumC0500n3, enumC0500n4, enumC0500n5, enumC0500n6, enumC0500n7};
        Companion = new C0498l();
    }

    public static EnumC0500n valueOf(String str) {
        return (EnumC0500n) Enum.valueOf(EnumC0500n.class, str);
    }

    public static EnumC0500n[] values() {
        return (EnumC0500n[]) $VALUES.clone();
    }

    public final EnumC0501o a() {
        switch (AbstractC0499m.f5130a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0501o.f5133v;
            case 3:
            case 4:
                return EnumC0501o.f5134w;
            case 5:
                return EnumC0501o.f5135x;
            case 6:
                return EnumC0501o.f5131n;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
