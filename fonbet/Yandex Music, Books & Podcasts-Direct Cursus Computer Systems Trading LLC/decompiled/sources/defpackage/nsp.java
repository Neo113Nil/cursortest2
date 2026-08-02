package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nsp {
    public static final nsp a;
    public static final nsp b;
    public static final nsp c;
    public static final nsp d;
    public static final /* synthetic */ nsp[] e;

    static {
        nsp nspVar = new nsp("Disabled", 0);
        a = nspVar;
        nsp nspVar2 = new nsp("Unavailable", 1);
        b = nspVar2;
        nsp nspVar3 = new nsp("On", 2);
        c = nspVar3;
        nsp nspVar4 = new nsp("Off", 3);
        d = nspVar4;
        e = new nsp[]{nspVar, nspVar2, nspVar3, nspVar4};
    }

    public static nsp valueOf(String str) {
        return (nsp) Enum.valueOf(nsp.class, str);
    }

    public static nsp[] values() {
        return (nsp[]) e.clone();
    }
}
