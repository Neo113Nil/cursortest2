package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final e f1505f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f1506g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f1507h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f1508i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f1509j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ e[] f1510k;

    static {
        e eVar = new e("DESTROYED", 0);
        f1505f = eVar;
        e eVar2 = new e("INITIALIZED", 1);
        f1506g = eVar2;
        e eVar3 = new e("CREATED", 2);
        f1507h = eVar3;
        e eVar4 = new e("STARTED", 3);
        f1508i = eVar4;
        e eVar5 = new e("RESUMED", 4);
        f1509j = eVar5;
        f1510k = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f1510k.clone();
    }
}
