package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class lln implements mln {
    public static final lln a;
    public static final lln b;
    public static final lln c;
    public static final /* synthetic */ lln[] d;

    static {
        lln llnVar = new lln("Like", 0);
        a = llnVar;
        lln llnVar2 = new lln("UndoLike", 1);
        b = llnVar2;
        lln llnVar3 = new lln("UndoDislike", 2);
        c = llnVar3;
        d = new lln[]{llnVar, llnVar2, llnVar3};
    }

    public static lln valueOf(String str) {
        return (lln) Enum.valueOf(lln.class, str);
    }

    public static lln[] values() {
        return (lln[]) d.clone();
    }
}
