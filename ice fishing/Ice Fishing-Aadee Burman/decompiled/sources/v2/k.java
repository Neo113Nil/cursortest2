package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: n, reason: collision with root package name */
    public static final k f41415n;

    /* renamed from: u, reason: collision with root package name */
    public static final k f41416u;

    /* renamed from: v, reason: collision with root package name */
    public static final k f41417v;

    /* renamed from: w, reason: collision with root package name */
    public static final k f41418w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ k[] f41419x;

    static {
        k kVar = new k("SUCCESS", 0);
        f41415n = kVar;
        k kVar2 = new k("PERMANENT_FAILURE", 1);
        f41416u = kVar2;
        k kVar3 = new k("RETRIABLE_FAILURE", 2);
        f41417v = kVar3;
        k kVar4 = new k("BUFFERED", 3);
        f41418w = kVar4;
        f41419x = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k[] values() {
        return (k[]) f41419x.clone();
    }
}
