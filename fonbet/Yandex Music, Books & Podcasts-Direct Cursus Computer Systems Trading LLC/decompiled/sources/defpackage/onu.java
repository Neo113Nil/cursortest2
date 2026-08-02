package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class onu {
    public static final onu a;
    public static final onu b;
    public static final onu c;
    public static final /* synthetic */ onu[] d;

    static {
        onu onuVar = new onu("FULL", 0);
        a = onuVar;
        onu onuVar2 = new onu("COMPACT", 1);
        b = onuVar2;
        onu onuVar3 = new onu("EMPTY", 2);
        c = onuVar3;
        d = new onu[]{onuVar, onuVar2, onuVar3};
    }

    public static onu valueOf(String str) {
        return (onu) Enum.valueOf(onu.class, str);
    }

    public static onu[] values() {
        return (onu[]) d.clone();
    }
}
