package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class po {
    public static final po MdtA4re8;
    public static final po NCTxEWno;
    public static final po P7K7Inc8;
    public static final po VgvYg0wo;
    public static final /* synthetic */ po[] b2ZJblxo;
    public static final po wxUZMvaN;

    static {
        po poVar = new po("DESTROYED", 0);
        NCTxEWno = poVar;
        po poVar2 = new po("INITIALIZED", 1);
        MdtA4re8 = poVar2;
        po poVar3 = new po("CREATED", 2);
        wxUZMvaN = poVar3;
        po poVar4 = new po("STARTED", 3);
        VgvYg0wo = poVar4;
        po poVar5 = new po("RESUMED", 4);
        P7K7Inc8 = poVar5;
        b2ZJblxo = new po[]{poVar, poVar2, poVar3, poVar4, poVar5};
    }

    public static po valueOf(String str) {
        return (po) Enum.valueOf(po.class, str);
    }

    public static po[] values() {
        return (po[]) b2ZJblxo.clone();
    }
}
