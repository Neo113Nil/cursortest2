package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kqm {
    public static final kqm a;
    public static final kqm b;
    public static final kqm c;
    public static final kqm d;
    public static final kqm e;
    public static final kqm f;
    public static final kqm g;
    public static final kqm h;
    public static final kqm i;
    public static final kqm j;
    public static final /* synthetic */ kqm[] k;

    static {
        kqm kqmVar = new kqm("none", 0);
        a = kqmVar;
        kqm kqmVar2 = new kqm("xMinYMin", 1);
        b = kqmVar2;
        kqm kqmVar3 = new kqm("xMidYMin", 2);
        c = kqmVar3;
        kqm kqmVar4 = new kqm("xMaxYMin", 3);
        d = kqmVar4;
        kqm kqmVar5 = new kqm("xMinYMid", 4);
        e = kqmVar5;
        kqm kqmVar6 = new kqm("xMidYMid", 5);
        f = kqmVar6;
        kqm kqmVar7 = new kqm("xMaxYMid", 6);
        g = kqmVar7;
        kqm kqmVar8 = new kqm("xMinYMax", 7);
        h = kqmVar8;
        kqm kqmVar9 = new kqm("xMidYMax", 8);
        i = kqmVar9;
        kqm kqmVar10 = new kqm("xMaxYMax", 9);
        j = kqmVar10;
        k = new kqm[]{kqmVar, kqmVar2, kqmVar3, kqmVar4, kqmVar5, kqmVar6, kqmVar7, kqmVar8, kqmVar9, kqmVar10};
    }

    public static kqm valueOf(String str) {
        return (kqm) Enum.valueOf(kqm.class, str);
    }

    public static kqm[] values() {
        return (kqm[]) k.clone();
    }
}
