package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sjj {
    public static final sjj a;
    public static final sjj b;
    public static final sjj c;
    public static final /* synthetic */ sjj[] d;

    static {
        sjj sjjVar = new sjj("NO_OP", 0);
        a = sjjVar;
        sjj sjjVar2 = new sjj("ADD", 1);
        b = sjjVar2;
        sjj sjjVar3 = new sjj("REMOVE", 2);
        c = sjjVar3;
        d = new sjj[]{sjjVar, sjjVar2, sjjVar3};
    }

    public static sjj valueOf(String str) {
        return (sjj) Enum.valueOf(sjj.class, str);
    }

    public static sjj[] values() {
        return (sjj[]) d.clone();
    }
}
