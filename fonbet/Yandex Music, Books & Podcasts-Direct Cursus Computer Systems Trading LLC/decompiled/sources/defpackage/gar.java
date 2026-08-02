package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gar {
    public static final gar a;
    public static final gar b;
    public static final /* synthetic */ gar[] c;

    static {
        gar garVar = new gar("DrawOver", 0);
        a = garVar;
        gar garVar2 = new gar("DrawUnder", 1);
        b = garVar2;
        c = new gar[]{garVar, garVar2};
    }

    public static gar valueOf(String str) {
        return (gar) Enum.valueOf(gar.class, str);
    }

    public static gar[] values() {
        return (gar[]) c.clone();
    }
}
