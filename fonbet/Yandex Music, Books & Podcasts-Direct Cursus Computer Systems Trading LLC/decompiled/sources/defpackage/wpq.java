package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wpq {
    public static final wpq a;
    public static final wpq b;
    public static final /* synthetic */ wpq[] c;

    static {
        wpq wpqVar = new wpq("ONLINE", 0);
        a = wpqVar;
        wpq wpqVar2 = new wpq("OFFLINE", 1);
        b = wpqVar2;
        c = new wpq[]{wpqVar, wpqVar2};
    }

    public static wpq valueOf(String str) {
        return (wpq) Enum.valueOf(wpq.class, str);
    }

    public static wpq[] values() {
        return (wpq[]) c.clone();
    }
}
