package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zmn {
    public static final zmn a;
    public static final zmn b;
    public static final zmn c;
    public static final zmn d;
    public static final zmn e;
    public static final zmn f;
    public static final /* synthetic */ zmn[] g;

    static {
        zmn zmnVar = new zmn("ShutDown", 0);
        a = zmnVar;
        zmn zmnVar2 = new zmn("ShuttingDown", 1);
        b = zmnVar2;
        zmn zmnVar3 = new zmn("Inactive", 2);
        c = zmnVar3;
        zmn zmnVar4 = new zmn("InactivePendingWork", 3);
        d = zmnVar4;
        zmn zmnVar5 = new zmn("Idle", 4);
        e = zmnVar5;
        zmn zmnVar6 = new zmn("PendingWork", 5);
        f = zmnVar6;
        g = new zmn[]{zmnVar, zmnVar2, zmnVar3, zmnVar4, zmnVar5, zmnVar6};
    }

    public static zmn valueOf(String str) {
        return (zmn) Enum.valueOf(zmn.class, str);
    }

    public static zmn[] values() {
        return (zmn[]) g.clone();
    }
}
