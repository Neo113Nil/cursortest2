package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sh {
    public static final sh AvO7iQsrTN;
    public static final sh EljAMC1QTz;
    public static final sh OOA6hdeuvCS;
    public static final sh encWxUiV2;
    public static final /* synthetic */ sh[] mOu10nynGul;

    static {
        sh shVar = new sh("DEFAULT", 0);
        OOA6hdeuvCS = shVar;
        sh shVar2 = new sh("LAZY", 1);
        EljAMC1QTz = shVar2;
        sh shVar3 = new sh("ATOMIC", 2);
        AvO7iQsrTN = shVar3;
        sh shVar4 = new sh("UNDISPATCHED", 3);
        encWxUiV2 = shVar4;
        mOu10nynGul = new sh[]{shVar, shVar2, shVar3, shVar4};
    }

    public static sh valueOf(String str) {
        return (sh) Enum.valueOf(sh.class, str);
    }

    public static sh[] values() {
        return (sh[]) mOu10nynGul.clone();
    }
}
