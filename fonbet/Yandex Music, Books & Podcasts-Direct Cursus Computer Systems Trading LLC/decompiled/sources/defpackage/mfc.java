package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class mfc {
    public static final mfc a;
    public static final mfc b;
    public static final mfc c;
    public static final /* synthetic */ mfc[] d;

    static {
        mfc mfcVar = new mfc("Enabled", 0);
        a = mfcVar;
        mfc mfcVar2 = new mfc("Default", 1);
        b = mfcVar2;
        mfc mfcVar3 = new mfc("EarlyProvidingAnchors", 2);
        c = mfcVar3;
        d = new mfc[]{mfcVar, mfcVar2, mfcVar3};
    }

    public static mfc valueOf(String str) {
        return (mfc) Enum.valueOf(mfc.class, str);
    }

    public static mfc[] values() {
        return (mfc[]) d.clone();
    }
}
