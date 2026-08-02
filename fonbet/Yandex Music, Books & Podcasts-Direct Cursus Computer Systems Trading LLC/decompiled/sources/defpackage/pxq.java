package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class pxq {
    public static final pxq a;
    public static final pxq b;
    public static final pxq c;
    public static final pxq d;
    public static final pxq e;
    public static final pxq f;
    public static final /* synthetic */ pxq[] g;

    static {
        pxq pxqVar = new pxq("Cover", 0);
        a = pxqVar;
        pxq pxqVar2 = new pxq("TopCover", 1);
        b = pxqVar2;
        pxq pxqVar3 = new pxq("Title", 2);
        c = pxqVar3;
        pxq pxqVar4 = new pxq("PageIndicator", 3);
        d = pxqVar4;
        pxq pxqVar5 = new pxq("Description", 4);
        e = pxqVar5;
        pxq pxqVar6 = new pxq("Buttons", 5);
        f = pxqVar6;
        g = new pxq[]{pxqVar, pxqVar2, pxqVar3, pxqVar4, pxqVar5, pxqVar6};
    }

    public static pxq valueOf(String str) {
        return (pxq) Enum.valueOf(pxq.class, str);
    }

    public static pxq[] values() {
        return (pxq[]) g.clone();
    }
}
