package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nep {
    public static final nep a;
    public static final nep b;
    public static final nep c;
    public static final /* synthetic */ nep[] d;

    static {
        nep nepVar = new nep("Left", 0);
        a = nepVar;
        nep nepVar2 = new nep("Middle", 1);
        b = nepVar2;
        nep nepVar3 = new nep("Right", 2);
        c = nepVar3;
        d = new nep[]{nepVar, nepVar2, nepVar3};
    }

    public static nep valueOf(String str) {
        return (nep) Enum.valueOf(nep.class, str);
    }

    public static nep[] values() {
        return (nep[]) d.clone();
    }
}
