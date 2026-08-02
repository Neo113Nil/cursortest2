package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ogo {
    public static final ogo a;
    public static final ogo b;
    public static final ogo c;
    public static final ogo d;
    public static final /* synthetic */ ogo[] e;

    static {
        ogo ogoVar = new ogo("TopStart", 0);
        a = ogoVar;
        ogo ogoVar2 = new ogo("TopEnd", 1);
        b = ogoVar2;
        ogo ogoVar3 = new ogo("BottomStart", 2);
        c = ogoVar3;
        ogo ogoVar4 = new ogo("BottomEnd", 3);
        d = ogoVar4;
        e = new ogo[]{ogoVar, ogoVar2, ogoVar3, ogoVar4};
    }

    public static ogo valueOf(String str) {
        return (ogo) Enum.valueOf(ogo.class, str);
    }

    public static ogo[] values() {
        return (ogo[]) e.clone();
    }
}
