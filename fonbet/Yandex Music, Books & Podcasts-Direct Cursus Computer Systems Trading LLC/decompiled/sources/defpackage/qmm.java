package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qmm {
    public static final qmm a;
    public static final /* synthetic */ qmm[] b;

    /* JADX INFO: Fake field, exist only in values array */
    qmm EF0;

    static {
        qmm qmmVar = new qmm("SRGB", 0);
        qmm qmmVar2 = new qmm("DISPLAY_P3", 1);
        a = qmmVar2;
        b = new qmm[]{qmmVar, qmmVar2};
    }

    public static qmm valueOf(String str) {
        return (qmm) Enum.valueOf(qmm.class, str);
    }

    public static qmm[] values() {
        return (qmm[]) b.clone();
    }
}
