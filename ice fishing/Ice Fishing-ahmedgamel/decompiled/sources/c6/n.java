package c6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: u, reason: collision with root package name */
    public static final n f5794u;

    /* renamed from: v, reason: collision with root package name */
    public static final n f5795v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ n[] f5796w;

    /* renamed from: n, reason: collision with root package name */
    public final String f5797n;

    static {
        n nVar = new n("PROTO_2", 0, "proto2");
        f5794u = nVar;
        n nVar2 = new n("PROTO_3", 1, "proto3");
        f5795v = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f5796w = nVarArr;
        X2.a.h(nVarArr);
    }

    public n(String str, int i, String str2) {
        this.f5797n = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f5796w.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5797n;
    }
}
