package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class lq {
    public static final ofc a;
    public static final lq b;
    public static final /* synthetic */ lq[] c;

    static {
        lq lqVar = new lq("PODCAST", 0);
        b = lqVar;
        c = new lq[]{lqVar};
        a = new ofc(13);
    }

    public static lq valueOf(String str) {
        return (lq) Enum.valueOf(lq.class, str);
    }

    public static lq[] values() {
        return (lq[]) c.clone();
    }
}
