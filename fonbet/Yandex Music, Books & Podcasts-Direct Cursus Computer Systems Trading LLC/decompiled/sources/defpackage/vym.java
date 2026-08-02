package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vym {
    public static final vym a;
    public static final /* synthetic */ vym[] b;

    static {
        vym vymVar = new vym("DEFAULT", 0);
        a = vymVar;
        b = new vym[]{vymVar, new vym("SIGNED", 1), new vym("FIXED", 2)};
    }

    public static vym valueOf(String str) {
        return (vym) Enum.valueOf(vym.class, str);
    }

    public static vym[] values() {
        return (vym[]) b.clone();
    }
}
