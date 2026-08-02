package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class pgp {
    public static final pgp a;
    public static final pgp b;
    public static final pgp c;
    public static final pgp d;
    public static final /* synthetic */ pgp[] e;

    static {
        pgp pgpVar = new pgp("And", 0);
        a = pgpVar;
        pgp pgpVar2 = new pgp("Or", 1);
        b = pgpVar2;
        pgp pgpVar3 = new pgp("Single", 2);
        c = pgpVar3;
        pgp pgpVar4 = new pgp("Comma", 3);
        d = pgpVar4;
        e = new pgp[]{pgpVar, pgpVar2, pgpVar3, pgpVar4};
    }

    public static pgp valueOf(String str) {
        return (pgp) Enum.valueOf(pgp.class, str);
    }

    public static pgp[] values() {
        return (pgp[]) e.clone();
    }
}
