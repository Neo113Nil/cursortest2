package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class io {
    public static final io MdtA4re8;
    public static final io NCTxEWno;
    public static final /* synthetic */ io[] wxUZMvaN;

    /* JADX INFO: Fake field, exist only in values array */
    io EF0;

    static {
        io ioVar = new io("SYNCHRONIZED", 0);
        io ioVar2 = new io("PUBLICATION", 1);
        NCTxEWno = ioVar2;
        io ioVar3 = new io("NONE", 2);
        MdtA4re8 = ioVar3;
        wxUZMvaN = new io[]{ioVar, ioVar2, ioVar3};
    }

    public static io valueOf(String str) {
        return (io) Enum.valueOf(io.class, str);
    }

    public static io[] values() {
        return (io[]) wxUZMvaN.clone();
    }
}
