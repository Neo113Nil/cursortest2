package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class exb {
    public static final exb a;
    public static final exb b;
    public static final /* synthetic */ exb[] c;

    static {
        exb exbVar = new exb("Inited", 0);
        a = exbVar;
        exb exbVar2 = new exb("Updated", 1);
        b = exbVar2;
        c = new exb[]{exbVar, exbVar2};
    }

    public static exb valueOf(String str) {
        return (exb) Enum.valueOf(exb.class, str);
    }

    public static exb[] values() {
        return (exb[]) c.clone();
    }
}
