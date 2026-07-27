package K7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ n[] f1667n;

    static {
        n[] nVarArr = {new n("PUBLIC", 0), new n("PROTECTED", 1), new n("INTERNAL", 2), new n("PRIVATE", 3)};
        f1667n = nVarArr;
        W2.e.d(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f1667n.clone();
    }
}
