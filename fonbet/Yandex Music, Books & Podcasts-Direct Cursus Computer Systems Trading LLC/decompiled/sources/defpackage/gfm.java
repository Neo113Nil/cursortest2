package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gfm {
    public static final gfm a;
    public static final gfm b;
    public static final gfm c;
    public static final /* synthetic */ gfm[] d;

    static {
        gfm gfmVar = new gfm("Initial", 0);
        a = gfmVar;
        gfm gfmVar2 = new gfm("Main", 1);
        b = gfmVar2;
        gfm gfmVar3 = new gfm("Final", 2);
        c = gfmVar3;
        d = new gfm[]{gfmVar, gfmVar2, gfmVar3};
    }

    public static gfm valueOf(String str) {
        return (gfm) Enum.valueOf(gfm.class, str);
    }

    public static gfm[] values() {
        return (gfm[]) d.clone();
    }
}
