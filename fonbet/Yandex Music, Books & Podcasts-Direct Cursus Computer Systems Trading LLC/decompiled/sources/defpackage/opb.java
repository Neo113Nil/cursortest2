package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class opb {
    public static final opb a;
    public static final opb b;
    public static final opb c;
    public static final opb d;
    public static final /* synthetic */ opb[] e;

    static {
        opb opbVar = new opb("REPLACE", 0);
        a = opbVar;
        opb opbVar2 = new opb("KEEP", 1);
        b = opbVar2;
        opb opbVar3 = new opb("APPEND", 2);
        c = opbVar3;
        opb opbVar4 = new opb("APPEND_OR_REPLACE", 3);
        d = opbVar4;
        e = new opb[]{opbVar, opbVar2, opbVar3, opbVar4};
    }

    public static opb valueOf(String str) {
        return (opb) Enum.valueOf(opb.class, str);
    }

    public static opb[] values() {
        return (opb[]) e.clone();
    }
}
