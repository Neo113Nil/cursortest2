package u1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: n, reason: collision with root package name */
    public static final i f41012n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ i[] f41013u;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("SRGB", 0);
        i iVar2 = new i("DISPLAY_P3", 1);
        f41012n = iVar2;
        f41013u = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f41013u.clone();
    }
}
