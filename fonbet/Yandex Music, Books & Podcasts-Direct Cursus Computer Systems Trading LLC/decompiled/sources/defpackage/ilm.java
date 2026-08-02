package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ilm {
    public static final ilm a;
    public static final ilm b;
    public static final ilm c;
    public static final /* synthetic */ ilm[] d;

    static {
        ilm ilmVar = new ilm("EXACT", 0);
        a = ilmVar;
        ilm ilmVar2 = new ilm("INEXACT", 1);
        b = ilmVar2;
        ilm ilmVar3 = new ilm("AUTOMATIC", 2);
        c = ilmVar3;
        d = new ilm[]{ilmVar, ilmVar2, ilmVar3};
    }

    public static ilm valueOf(String str) {
        return (ilm) Enum.valueOf(ilm.class, str);
    }

    public static ilm[] values() {
        return (ilm[]) d.clone();
    }
}
