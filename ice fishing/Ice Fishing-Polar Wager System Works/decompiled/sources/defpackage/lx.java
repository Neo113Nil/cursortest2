package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lx {
    public static final defpackage.lx adDC3e2L;
    public static final /* synthetic */ defpackage.lx[] xiZrDbcSW0;

    /* JADX INFO: Fake field, exist only in values array */
    defpackage.lx EF0;

    static {
        defpackage.lx lxVar = new defpackage.lx("Visible", 0);
        defpackage.lx lxVar2 = new defpackage.lx("Clip", 1);
        adDC3e2L = lxVar2;
        xiZrDbcSW0 = new defpackage.lx[]{lxVar, lxVar2, new defpackage.lx("ExpandIndicator", 2), new defpackage.lx("ExpandOrCollapseIndicator", 3)};
    }

    public static defpackage.lx valueOf(java.lang.String str) {
        return (defpackage.lx) java.lang.Enum.valueOf(defpackage.lx.class, str);
    }

    public static defpackage.lx[] values() {
        return (defpackage.lx[]) xiZrDbcSW0.clone();
    }
}
