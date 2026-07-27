package p8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4856b {

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC4856b f39813A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ EnumC4856b[] f39814B;

    /* renamed from: u, reason: collision with root package name */
    public static final C f39815u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC4856b f39816v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC4856b f39817w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC4856b f39818x;

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC4856b f39819y;

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC4856b f39820z;

    /* renamed from: n, reason: collision with root package name */
    public final int f39821n;

    static {
        EnumC4856b enumC4856b = new EnumC4856b("NO_ERROR", 0, 0);
        f39816v = enumC4856b;
        EnumC4856b enumC4856b2 = new EnumC4856b("PROTOCOL_ERROR", 1, 1);
        f39817w = enumC4856b2;
        EnumC4856b enumC4856b3 = new EnumC4856b("INTERNAL_ERROR", 2, 2);
        f39818x = enumC4856b3;
        EnumC4856b enumC4856b4 = new EnumC4856b("FLOW_CONTROL_ERROR", 3, 3);
        f39819y = enumC4856b4;
        EnumC4856b enumC4856b5 = new EnumC4856b("SETTINGS_TIMEOUT", 4, 4);
        EnumC4856b enumC4856b6 = new EnumC4856b("STREAM_CLOSED", 5, 5);
        EnumC4856b enumC4856b7 = new EnumC4856b("FRAME_SIZE_ERROR", 6, 6);
        EnumC4856b enumC4856b8 = new EnumC4856b("REFUSED_STREAM", 7, 7);
        f39820z = enumC4856b8;
        EnumC4856b enumC4856b9 = new EnumC4856b("CANCEL", 8, 8);
        f39813A = enumC4856b9;
        EnumC4856b[] enumC4856bArr = {enumC4856b, enumC4856b2, enumC4856b3, enumC4856b4, enumC4856b5, enumC4856b6, enumC4856b7, enumC4856b8, enumC4856b9, new EnumC4856b("COMPRESSION_ERROR", 9, 9), new EnumC4856b("CONNECT_ERROR", 10, 10), new EnumC4856b("ENHANCE_YOUR_CALM", 11, 11), new EnumC4856b("INADEQUATE_SECURITY", 12, 12), new EnumC4856b("HTTP_1_1_REQUIRED", 13, 13)};
        f39814B = enumC4856bArr;
        com.bumptech.glide.e.b(enumC4856bArr);
        f39815u = new C();
    }

    public EnumC4856b(String str, int i, int i6) {
        this.f39821n = i6;
    }

    public static EnumC4856b valueOf(String str) {
        return (EnumC4856b) Enum.valueOf(EnumC4856b.class, str);
    }

    public static EnumC4856b[] values() {
        return (EnumC4856b[]) f39814B.clone();
    }
}
