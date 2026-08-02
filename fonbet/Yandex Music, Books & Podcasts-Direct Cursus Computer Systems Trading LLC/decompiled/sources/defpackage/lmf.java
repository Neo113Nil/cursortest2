package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lmf {
    public static final lmf a;
    public static final lmf b;
    public static final /* synthetic */ lmf[] c;

    static {
        lmf lmfVar = new lmf("Header", 0);
        a = lmfVar;
        lmf lmfVar2 = new lmf("ExpandedPlayer", 1);
        b = lmfVar2;
        c = new lmf[]{lmfVar, lmfVar2};
    }

    public static lmf valueOf(String str) {
        return (lmf) Enum.valueOf(lmf.class, str);
    }

    public static lmf[] values() {
        return (lmf[]) c.clone();
    }
}
