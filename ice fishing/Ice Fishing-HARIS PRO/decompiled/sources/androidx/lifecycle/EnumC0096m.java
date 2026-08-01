package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0096m {
    private static final /* synthetic */ EnumC0096m[] $VALUES;
    public static final C0094k Companion;
    public static final EnumC0096m ON_ANY;
    public static final EnumC0096m ON_CREATE;
    public static final EnumC0096m ON_DESTROY;
    public static final EnumC0096m ON_PAUSE;
    public static final EnumC0096m ON_RESUME;
    public static final EnumC0096m ON_START;
    public static final EnumC0096m ON_STOP;

    static {
        EnumC0096m enumC0096m = new EnumC0096m("ON_CREATE", 0);
        ON_CREATE = enumC0096m;
        EnumC0096m enumC0096m2 = new EnumC0096m("ON_START", 1);
        ON_START = enumC0096m2;
        EnumC0096m enumC0096m3 = new EnumC0096m("ON_RESUME", 2);
        ON_RESUME = enumC0096m3;
        EnumC0096m enumC0096m4 = new EnumC0096m("ON_PAUSE", 3);
        ON_PAUSE = enumC0096m4;
        EnumC0096m enumC0096m5 = new EnumC0096m("ON_STOP", 4);
        ON_STOP = enumC0096m5;
        EnumC0096m enumC0096m6 = new EnumC0096m("ON_DESTROY", 5);
        ON_DESTROY = enumC0096m6;
        EnumC0096m enumC0096m7 = new EnumC0096m("ON_ANY", 6);
        ON_ANY = enumC0096m7;
        $VALUES = new EnumC0096m[]{enumC0096m, enumC0096m2, enumC0096m3, enumC0096m4, enumC0096m5, enumC0096m6, enumC0096m7};
        Companion = new C0094k();
    }

    public static EnumC0096m valueOf(String str) {
        return (EnumC0096m) Enum.valueOf(EnumC0096m.class, str);
    }

    public static EnumC0096m[] values() {
        return (EnumC0096m[]) $VALUES.clone();
    }

    public final EnumC0097n a() {
        switch (AbstractC0095l.f2037a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0097n.f2040c;
            case 3:
            case 4:
                return EnumC0097n.f2041d;
            case 5:
                return EnumC0097n.e;
            case 6:
                return EnumC0097n.f2038a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
