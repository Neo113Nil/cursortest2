package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class sgn {
    public static final sgn a;
    public static final sgn b;
    public static final sgn c;
    public static final /* synthetic */ sgn[] d;

    static {
        sgn sgnVar = new sgn("PENDING", 0);
        a = sgnVar;
        sgn sgnVar2 = new sgn("EMITTED", 1);
        b = sgnVar2;
        sgn sgnVar3 = new sgn("SKIPPED", 2);
        c = sgnVar3;
        d = new sgn[]{sgnVar, sgnVar2, sgnVar3};
    }

    public static sgn valueOf(String str) {
        return (sgn) Enum.valueOf(sgn.class, str);
    }

    public static sgn[] values() {
        return (sgn[]) d.clone();
    }
}
