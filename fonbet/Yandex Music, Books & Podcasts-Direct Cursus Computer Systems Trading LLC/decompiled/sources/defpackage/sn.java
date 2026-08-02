package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class sn implements f10 {
    public static final sn a;
    public static final sn b;
    public static final sn c;
    public static final sn d;
    public static final sn e;
    public static final sn f;
    public static final /* synthetic */ sn[] g;

    static {
        sn snVar = new sn("Like", 0);
        a = snVar;
        sn snVar2 = new sn("UnLike", 1);
        b = snVar2;
        sn snVar3 = new sn("GoToAlbum", 2);
        c = snVar3;
        sn snVar4 = new sn("Cache", 3);
        d = snVar4;
        sn snVar5 = new sn("CancelCache", 4);
        e = snVar5;
        sn snVar6 = new sn("UnCache", 5);
        f = snVar6;
        g = new sn[]{snVar, snVar2, snVar3, snVar4, snVar5, snVar6};
    }

    public static sn valueOf(String str) {
        return (sn) Enum.valueOf(sn.class, str);
    }

    public static sn[] values() {
        return (sn[]) g.clone();
    }
}
