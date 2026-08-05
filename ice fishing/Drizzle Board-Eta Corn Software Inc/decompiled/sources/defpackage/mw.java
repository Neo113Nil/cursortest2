package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mw {
    public static final mw MdtA4re8;
    public static final mw NCTxEWno;
    public static final /* synthetic */ mw[] VgvYg0wo;
    public static final mw wxUZMvaN;

    static {
        mw mwVar = new mw("NO_OP", 0);
        NCTxEWno = mwVar;
        mw mwVar2 = new mw("ADD", 1);
        MdtA4re8 = mwVar2;
        mw mwVar3 = new mw("REMOVE", 2);
        wxUZMvaN = mwVar3;
        VgvYg0wo = new mw[]{mwVar, mwVar2, mwVar3};
    }

    public static mw valueOf(String str) {
        return (mw) Enum.valueOf(mw.class, str);
    }

    public static mw[] values() {
        return (mw[]) VgvYg0wo.clone();
    }
}
