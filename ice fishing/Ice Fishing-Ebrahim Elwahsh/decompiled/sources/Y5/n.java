package Y5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: u, reason: collision with root package name */
    public static final n f4023u;

    /* renamed from: v, reason: collision with root package name */
    public static final n f4024v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ n[] f4025w;

    /* renamed from: n, reason: collision with root package name */
    public final String f4026n;

    static {
        n nVar = new n("PROTO_2", 0, "proto2");
        f4023u = nVar;
        n nVar2 = new n("PROTO_3", 1, "proto3");
        f4024v = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f4025w = nVarArr;
        W2.e.d(nVarArr);
    }

    public n(String str, int i, String str2) {
        this.f4026n = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f4025w.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4026n;
    }
}
