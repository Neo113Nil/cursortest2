package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yyn {
    public static final yyn a;
    public static final yyn b;
    public static final /* synthetic */ yyn[] c;

    static {
        yyn yynVar = new yyn("BackSkipToBeginning", 0);
        a = yynVar;
        yyn yynVar2 = new yyn("Other", 1);
        b = yynVar2;
        c = new yyn[]{yynVar, yynVar2};
    }

    public static yyn valueOf(String str) {
        return (yyn) Enum.valueOf(yyn.class, str);
    }

    public static yyn[] values() {
        return (yyn[]) c.clone();
    }
}
