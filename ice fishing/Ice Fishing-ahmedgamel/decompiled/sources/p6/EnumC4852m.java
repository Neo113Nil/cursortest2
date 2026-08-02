package p6;

import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4852m implements InterfaceC4841b {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4852m f39843n;

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f39844u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f39845v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC4852m[] f39846w;

    static {
        EnumC4852m enumC4852m = new EnumC4852m("INSTANCE", 0);
        f39843n = enumC4852m;
        f39846w = new EnumC4852m[]{enumC4852m};
        f39844u = Logger.getLogger(EnumC4852m.class.getName());
        f39845v = new ThreadLocal();
    }

    public static EnumC4852m valueOf(String str) {
        return (EnumC4852m) Enum.valueOf(EnumC4852m.class, str);
    }

    public static EnumC4852m[] values() {
        return (EnumC4852m[]) f39846w.clone();
    }

    @Override // p6.InterfaceC4841b
    public final C4840a j() {
        return (C4840a) f39845v.get();
    }

    @Override // p6.InterfaceC4841b
    public final InterfaceC4845f k(C4840a c4840a) {
        EnumC4850k enumC4850k = EnumC4850k.f39837n;
        C4840a j6 = j();
        if (c4840a == j6) {
            return enumC4850k;
        }
        f39845v.set(c4840a);
        return new C4851l(this, j6, c4840a);
    }
}
