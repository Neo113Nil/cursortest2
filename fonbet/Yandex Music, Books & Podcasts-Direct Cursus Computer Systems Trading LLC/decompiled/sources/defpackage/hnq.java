package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class hnq {
    public static final hnq a;
    public static final hnq b;
    public static final /* synthetic */ hnq[] c;

    static {
        hnq hnqVar = new hnq("DEFAULT", 0);
        a = hnqVar;
        hnq hnqVar2 = new hnq("WITHOUT_EMPTY_BLOCKS_ERROR", 1);
        b = hnqVar2;
        c = new hnq[]{hnqVar, hnqVar2};
    }

    public static hnq valueOf(String str) {
        return (hnq) Enum.valueOf(hnq.class, str);
    }

    public static hnq[] values() {
        return (hnq[]) c.clone();
    }
}
