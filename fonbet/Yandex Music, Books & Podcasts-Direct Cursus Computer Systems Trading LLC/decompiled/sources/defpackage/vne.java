package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vne {
    public static final vne a;
    public static final vne b;
    public static final vne c;
    public static final /* synthetic */ vne[] d;

    static {
        vne vneVar = new vne("Focused", 0);
        a = vneVar;
        vne vneVar2 = new vne("UnfocusedEmpty", 1);
        b = vneVar2;
        vne vneVar3 = new vne("UnfocusedNotEmpty", 2);
        c = vneVar3;
        d = new vne[]{vneVar, vneVar2, vneVar3};
    }

    public static vne valueOf(String str) {
        return (vne) Enum.valueOf(vne.class, str);
    }

    public static vne[] values() {
        return (vne[]) d.clone();
    }
}
