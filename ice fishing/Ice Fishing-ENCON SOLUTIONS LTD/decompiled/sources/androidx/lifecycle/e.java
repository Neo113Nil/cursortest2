package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2465a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f2466b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f2467c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f2468d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f2469e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e[] f2470f;

    static {
        e eVar = new e("DESTROYED", 0);
        f2465a = eVar;
        e eVar2 = new e("INITIALIZED", 1);
        f2466b = eVar2;
        e eVar3 = new e("CREATED", 2);
        f2467c = eVar3;
        e eVar4 = new e("STARTED", 3);
        f2468d = eVar4;
        e eVar5 = new e("RESUMED", 4);
        f2469e = eVar5;
        f2470f = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2470f.clone();
    }
}
