package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class crp {
    public static final crp a;
    public static final crp b;
    public static final crp c;
    public static final /* synthetic */ crp[] d;

    static {
        crp crpVar = new crp("ReadyToDownload", 0);
        a = crpVar;
        crp crpVar2 = new crp("InProgress", 1);
        b = crpVar2;
        crp crpVar3 = new crp("Downloaded", 2);
        c = crpVar3;
        d = new crp[]{crpVar, crpVar2, crpVar3};
    }

    public static crp valueOf(String str) {
        return (crp) Enum.valueOf(crp.class, str);
    }

    public static crp[] values() {
        return (crp[]) d.clone();
    }
}
