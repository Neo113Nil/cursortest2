package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0506n {
    private static final /* synthetic */ EnumC0506n[] $VALUES;
    public static final C0504l Companion;
    public static final EnumC0506n ON_ANY;
    public static final EnumC0506n ON_CREATE;
    public static final EnumC0506n ON_DESTROY;
    public static final EnumC0506n ON_PAUSE;
    public static final EnumC0506n ON_RESUME;
    public static final EnumC0506n ON_START;
    public static final EnumC0506n ON_STOP;

    static {
        EnumC0506n enumC0506n = new EnumC0506n("ON_CREATE", 0);
        ON_CREATE = enumC0506n;
        EnumC0506n enumC0506n2 = new EnumC0506n("ON_START", 1);
        ON_START = enumC0506n2;
        EnumC0506n enumC0506n3 = new EnumC0506n("ON_RESUME", 2);
        ON_RESUME = enumC0506n3;
        EnumC0506n enumC0506n4 = new EnumC0506n("ON_PAUSE", 3);
        ON_PAUSE = enumC0506n4;
        EnumC0506n enumC0506n5 = new EnumC0506n("ON_STOP", 4);
        ON_STOP = enumC0506n5;
        EnumC0506n enumC0506n6 = new EnumC0506n("ON_DESTROY", 5);
        ON_DESTROY = enumC0506n6;
        EnumC0506n enumC0506n7 = new EnumC0506n("ON_ANY", 6);
        ON_ANY = enumC0506n7;
        $VALUES = new EnumC0506n[]{enumC0506n, enumC0506n2, enumC0506n3, enumC0506n4, enumC0506n5, enumC0506n6, enumC0506n7};
        Companion = new C0504l();
    }

    public static EnumC0506n valueOf(String str) {
        return (EnumC0506n) Enum.valueOf(EnumC0506n.class, str);
    }

    public static EnumC0506n[] values() {
        return (EnumC0506n[]) $VALUES.clone();
    }

    public final EnumC0507o a() {
        switch (AbstractC0505m.f5275a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0507o.f5278v;
            case 3:
            case 4:
                return EnumC0507o.f5279w;
            case 5:
                return EnumC0507o.f5280x;
            case 6:
                return EnumC0507o.f5276n;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
