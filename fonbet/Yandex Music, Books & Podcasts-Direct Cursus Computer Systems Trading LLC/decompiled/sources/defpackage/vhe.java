package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class vhe {
    public static final vhe a;
    public static final vhe b;
    public static final vhe c;
    public static final vhe d;
    public static final vhe e;
    public static final vhe f;
    public static final /* synthetic */ vhe[] g;

    static {
        vhe vheVar = new vhe("UNINITIALIZED", 0);
        a = vheVar;
        vhe vheVar2 = new vhe("INITIALIZED", 1);
        b = vheVar2;
        vhe vheVar3 = new vhe("PREFIX_DELIVERED", 2);
        c = vheVar3;
        vhe vheVar4 = new vhe("ALL_MESSAGES_DELIVERED", 3);
        d = vheVar4;
        vhe vheVar5 = new vhe("SUFFIX_DELIVERED", 4);
        e = vheVar5;
        vhe vheVar6 = new vhe("CLOSED", 5);
        f = vheVar6;
        g = new vhe[]{vheVar, vheVar2, vheVar3, vheVar4, vheVar5, vheVar6};
    }

    public static vhe valueOf(String str) {
        return (vhe) Enum.valueOf(vhe.class, str);
    }

    public static vhe[] values() {
        return (vhe[]) g.clone();
    }
}
