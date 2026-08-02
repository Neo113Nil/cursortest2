package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ptb {
    public static final ptb a;
    public static final ptb b;
    public static final /* synthetic */ ptb[] c;

    static {
        ptb ptbVar = new ptb("Skeleton", 0);
        a = ptbVar;
        ptb ptbVar2 = new ptb("Queue", 1);
        b = ptbVar2;
        c = new ptb[]{ptbVar, ptbVar2};
    }

    public static ptb valueOf(String str) {
        return (ptb) Enum.valueOf(ptb.class, str);
    }

    public static ptb[] values() {
        return (ptb[]) c.clone();
    }
}
