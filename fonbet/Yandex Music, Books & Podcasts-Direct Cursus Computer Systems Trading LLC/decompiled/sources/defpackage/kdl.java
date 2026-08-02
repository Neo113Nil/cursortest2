package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class kdl {
    public static final kdl a;
    public static final kdl b;
    public static final /* synthetic */ kdl[] c;

    static {
        kdl kdlVar = new kdl("BackSkipToBeginning", 0);
        a = kdlVar;
        kdl kdlVar2 = new kdl("Other", 1);
        b = kdlVar2;
        c = new kdl[]{kdlVar, kdlVar2};
    }

    public static kdl valueOf(String str) {
        return (kdl) Enum.valueOf(kdl.class, str);
    }

    public static kdl[] values() {
        return (kdl[]) c.clone();
    }
}
