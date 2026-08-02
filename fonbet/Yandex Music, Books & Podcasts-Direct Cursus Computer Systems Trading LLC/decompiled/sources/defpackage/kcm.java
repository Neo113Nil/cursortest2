package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kcm {
    public static final kcm a;
    public static final kcm b;
    public static final kcm c;
    public static final /* synthetic */ kcm[] d;

    static {
        kcm kcmVar = new kcm("DATE", 0);
        a = kcmVar;
        kcm kcmVar2 = new kcm("ALPHABET", 1);
        b = kcmVar2;
        kcm kcmVar3 = new kcm("RECENTLY_UPDATED", 2);
        c = kcmVar3;
        d = new kcm[]{kcmVar, kcmVar2, kcmVar3};
    }

    public static kcm valueOf(String str) {
        return (kcm) Enum.valueOf(kcm.class, str);
    }

    public static kcm[] values() {
        return (kcm[]) d.clone();
    }
}
