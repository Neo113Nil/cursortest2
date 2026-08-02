package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nmu {
    public static final nmu a;
    public static final nmu b;
    public static final nmu c;
    public static final /* synthetic */ nmu[] d;

    static {
        nmu nmuVar = new nmu("NONE", 0);
        a = nmuVar;
        nmu nmuVar2 = new nmu("DEFAULT", 1);
        b = nmuVar2;
        nmu nmuVar3 = new nmu("CIRCLE", 2);
        c = nmuVar3;
        d = new nmu[]{nmuVar, nmuVar2, nmuVar3};
    }

    public static nmu valueOf(String str) {
        return (nmu) Enum.valueOf(nmu.class, str);
    }

    public static nmu[] values() {
        return (nmu[]) d.clone();
    }
}
