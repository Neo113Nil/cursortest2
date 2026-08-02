package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: n, reason: collision with root package name */
    public static final k f41872n;

    /* renamed from: u, reason: collision with root package name */
    public static final k f41873u;

    /* renamed from: v, reason: collision with root package name */
    public static final k f41874v;

    /* renamed from: w, reason: collision with root package name */
    public static final k f41875w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ k[] f41876x;

    static {
        k kVar = new k("SUCCESS", 0);
        f41872n = kVar;
        k kVar2 = new k("PERMANENT_FAILURE", 1);
        f41873u = kVar2;
        k kVar3 = new k("RETRIABLE_FAILURE", 2);
        f41874v = kVar3;
        k kVar4 = new k("BUFFERED", 3);
        f41875w = kVar4;
        f41876x = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k[] values() {
        return (k[]) f41876x.clone();
    }
}
