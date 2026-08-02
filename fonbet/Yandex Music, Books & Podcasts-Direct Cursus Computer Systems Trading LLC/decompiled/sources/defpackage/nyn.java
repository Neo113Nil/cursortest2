package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nyn {
    public static final nyn a;
    public static final nyn b;
    public static final nyn c;
    public static final /* synthetic */ nyn[] d;

    static {
        nyn nynVar = new nyn("None", 0);
        a = nynVar;
        nyn nynVar2 = new nyn("One", 1);
        b = nynVar2;
        nyn nynVar3 = new nyn("All", 2);
        c = nynVar3;
        d = new nyn[]{nynVar, nynVar2, nynVar3};
    }

    public static nyn valueOf(String str) {
        return (nyn) Enum.valueOf(nyn.class, str);
    }

    public static nyn[] values() {
        return (nyn[]) d.clone();
    }
}
