package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nek {
    public static final nek a;
    public static final nek b;
    public static final nek c;
    public static final nek d;
    public static final /* synthetic */ nek[] e;

    static {
        nek nekVar = new nek("NETWORK", 0);
        a = nekVar;
        nek nekVar2 = new nek("NATIVE", 1);
        b = nekVar2;
        nek nekVar3 = new nek("STORE", 2);
        c = nekVar3;
        nek nekVar4 = new nek("OTHER", 3);
        d = nekVar4;
        e = new nek[]{nekVar, nekVar2, nekVar3, nekVar4};
    }

    public static nek valueOf(String str) {
        return (nek) Enum.valueOf(nek.class, str);
    }

    public static nek[] values() {
        return (nek[]) e.clone();
    }
}
