package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ik {
    public static final ik MdtA4re8;
    public static final ik NCTxEWno;
    public static final ik P7K7Inc8;
    public static final ik VgvYg0wo;
    public static final /* synthetic */ ik[] b2ZJblxo;
    public static final ik wxUZMvaN;

    static {
        ik ikVar = new ik("ON_CONFIGURE", 0);
        NCTxEWno = ikVar;
        ik ikVar2 = new ik("ON_CREATE", 1);
        MdtA4re8 = ikVar2;
        ik ikVar3 = new ik("ON_UPGRADE", 2);
        wxUZMvaN = ikVar3;
        ik ikVar4 = new ik("ON_DOWNGRADE", 3);
        VgvYg0wo = ikVar4;
        ik ikVar5 = new ik("ON_OPEN", 4);
        P7K7Inc8 = ikVar5;
        b2ZJblxo = new ik[]{ikVar, ikVar2, ikVar3, ikVar4, ikVar5};
    }

    public static ik valueOf(String str) {
        return (ik) Enum.valueOf(ik.class, str);
    }

    public static ik[] values() {
        return (ik[]) b2ZJblxo.clone();
    }
}
