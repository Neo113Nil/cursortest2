package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nk {
    public static final defpackage.nk AARZUJiTa;
    public static final /* synthetic */ defpackage.nk[] EXtogiMhuM;
    public static final defpackage.nk adDC3e2L;
    public static final defpackage.nk xiZrDbcSW0;

    static {
        defpackage.nk nkVar = new defpackage.nk("None", 0);
        adDC3e2L = nkVar;
        defpackage.nk nkVar2 = new defpackage.nk("Cancelled", 1);
        xiZrDbcSW0 = nkVar2;
        defpackage.nk nkVar3 = new defpackage.nk("Redirected", 2);
        AARZUJiTa = nkVar3;
        EXtogiMhuM = new defpackage.nk[]{nkVar, nkVar2, nkVar3, new defpackage.nk("RedirectCancelled", 3)};
    }

    public static defpackage.nk valueOf(java.lang.String str) {
        return (defpackage.nk) java.lang.Enum.valueOf(defpackage.nk.class, str);
    }

    public static defpackage.nk[] values() {
        return (defpackage.nk[]) EXtogiMhuM.clone();
    }
}
