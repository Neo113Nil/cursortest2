package l6;

import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4706m implements InterfaceC4695b {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4706m f39076n;

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f39077u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f39078v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC4706m[] f39079w;

    static {
        EnumC4706m enumC4706m = new EnumC4706m("INSTANCE", 0);
        f39076n = enumC4706m;
        f39079w = new EnumC4706m[]{enumC4706m};
        f39077u = Logger.getLogger(EnumC4706m.class.getName());
        f39078v = new ThreadLocal();
    }

    public static EnumC4706m valueOf(String str) {
        return (EnumC4706m) Enum.valueOf(EnumC4706m.class, str);
    }

    public static EnumC4706m[] values() {
        return (EnumC4706m[]) f39079w.clone();
    }

    @Override // l6.InterfaceC4695b
    public final C4694a j() {
        return (C4694a) f39078v.get();
    }

    @Override // l6.InterfaceC4695b
    public final InterfaceC4699f k(C4694a c4694a) {
        EnumC4704k enumC4704k = EnumC4704k.f39070n;
        C4694a j9 = j();
        if (c4694a == j9) {
            return enumC4704k;
        }
        f39078v.set(c4694a);
        return new C4705l(this, j9, c4694a);
    }
}
