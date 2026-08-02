package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n3d {
    public static final n3d a;
    public static final n3d b;
    public static final n3d c;
    public static final n3d d;
    public static final n3d e;
    public static final n3d f;
    public static final n3d g;
    public static final /* synthetic */ n3d[] h;

    static {
        n3d n3dVar = new n3d("GET_MEMOIZED_IS_INITIALIZED", 0);
        a = n3dVar;
        n3d n3dVar2 = new n3d("SET_MEMOIZED_IS_INITIALIZED", 1);
        b = n3dVar2;
        n3d n3dVar3 = new n3d("BUILD_MESSAGE_INFO", 2);
        c = n3dVar3;
        n3d n3dVar4 = new n3d("NEW_MUTABLE_INSTANCE", 3);
        d = n3dVar4;
        n3d n3dVar5 = new n3d("NEW_BUILDER", 4);
        e = n3dVar5;
        n3d n3dVar6 = new n3d("GET_DEFAULT_INSTANCE", 5);
        f = n3dVar6;
        n3d n3dVar7 = new n3d("GET_PARSER", 6);
        g = n3dVar7;
        h = new n3d[]{n3dVar, n3dVar2, n3dVar3, n3dVar4, n3dVar5, n3dVar6, n3dVar7};
    }

    public static n3d valueOf(String str) {
        return (n3d) Enum.valueOf(n3d.class, str);
    }

    public static n3d[] values() {
        return (n3d[]) h.clone();
    }
}
