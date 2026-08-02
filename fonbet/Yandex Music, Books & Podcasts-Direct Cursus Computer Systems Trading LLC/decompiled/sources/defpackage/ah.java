package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ah {
    public static final ah a;
    public static final ah b;
    public static final ah c;
    public static final ah d;
    public static final ah e;
    public static final ah f;
    public static final ah g;
    public static final ah h;
    public static final /* synthetic */ ah[] i;

    static {
        ah ahVar = new ah("Play", 0);
        a = ahVar;
        ah ahVar2 = new ah("Pause", 1);
        b = ahVar2;
        ah ahVar3 = new ah("Like", 2);
        c = ahVar3;
        ah ahVar4 = new ah("Next", 3);
        d = ahVar4;
        ah ahVar5 = new ah("Previous", 4);
        e = ahVar5;
        ah ahVar6 = new ah("EnterFullscreenMode", 5);
        f = ahVar6;
        ah ahVar7 = new ah("ExitFullscreenMode", 6);
        g = ahVar7;
        ah ahVar8 = new ah("Glow", 7);
        h = ahVar8;
        i = new ah[]{ahVar, ahVar2, ahVar3, ahVar4, ahVar5, ahVar6, ahVar7, ahVar8};
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) i.clone();
    }
}
