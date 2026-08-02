package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zsr {
    public static final zsr a;
    public static final zsr b;
    public static final zsr c;
    public static final zsr d;
    public static final zsr e;
    public static final /* synthetic */ zsr[] f;

    static {
        zsr zsrVar = new zsr("END", 0);
        a = zsrVar;
        zsr zsrVar2 = new zsr("ROLLBACK", 1);
        b = zsrVar2;
        zsr zsrVar3 = new zsr("BEGIN_EXCLUSIVE", 2);
        c = zsrVar3;
        zsr zsrVar4 = new zsr("BEGIN_IMMEDIATE", 3);
        d = zsrVar4;
        zsr zsrVar5 = new zsr("BEGIN_DEFERRED", 4);
        e = zsrVar5;
        f = new zsr[]{zsrVar, zsrVar2, zsrVar3, zsrVar4, zsrVar5};
    }

    public static zsr valueOf(String str) {
        return (zsr) Enum.valueOf(zsr.class, str);
    }

    public static zsr[] values() {
        return (zsr[]) f.clone();
    }
}
