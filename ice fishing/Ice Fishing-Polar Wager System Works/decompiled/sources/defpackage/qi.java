package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qi {
    public static final /* synthetic */ defpackage.qi[] AARZUJiTa;
    public static final defpackage.qi adDC3e2L;
    public static final defpackage.qi xiZrDbcSW0;

    static {
        defpackage.qi qiVar = new defpackage.qi("VIEW_APPEAR", 0);
        adDC3e2L = qiVar;
        defpackage.qi qiVar2 = new defpackage.qi("VIEW_DISAPPEAR", 1);
        xiZrDbcSW0 = qiVar2;
        AARZUJiTa = new defpackage.qi[]{qiVar, qiVar2};
    }

    public static defpackage.qi valueOf(java.lang.String str) {
        return (defpackage.qi) java.lang.Enum.valueOf(defpackage.qi.class, str);
    }

    public static defpackage.qi[] values() {
        return (defpackage.qi[]) AARZUJiTa.clone();
    }
}
