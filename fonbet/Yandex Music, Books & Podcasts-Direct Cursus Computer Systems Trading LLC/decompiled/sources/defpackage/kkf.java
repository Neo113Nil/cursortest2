package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kkf {
    public static final kkf a;
    public static final kkf b;
    public static final kkf c;
    public static final /* synthetic */ kkf[] d;

    static {
        kkf kkfVar = new kkf("PRESS", 0);
        a = kkfVar;
        kkf kkfVar2 = new kkf("RELEASE", 1);
        b = kkfVar2;
        kkf kkfVar3 = new kkf("CANCEL", 2);
        c = kkfVar3;
        d = new kkf[]{kkfVar, kkfVar2, kkfVar3};
    }

    public static kkf valueOf(String str) {
        return (kkf) Enum.valueOf(kkf.class, str);
    }

    public static kkf[] values() {
        return (kkf[]) d.clone();
    }
}
