package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yo3 implements ewn {
    public static final yo3 a;
    public static final /* synthetic */ yo3[] b;

    static {
        yo3 yo3Var = new yo3("INSTANCE", 0);
        a = yo3Var;
        b = new yo3[]{yo3Var};
    }

    public static yo3 valueOf(String str) {
        return (yo3) Enum.valueOf(yo3.class, str);
    }

    public static yo3[] values() {
        return (yo3[]) b.clone();
    }

    @Override // defpackage.ewn
    public final void a(fwn fwnVar) {
    }
}
