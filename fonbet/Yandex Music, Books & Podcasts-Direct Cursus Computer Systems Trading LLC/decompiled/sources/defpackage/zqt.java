package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zqt {
    public static final zqt a;
    public static final zqt b;
    public static final zqt c;
    public static final zqt d;
    public static final /* synthetic */ zqt[] e;

    /* JADX INFO: Fake field, exist only in values array */
    zqt EF0;

    static {
        zqt zqtVar = new zqt("CHART", 0);
        zqt zqtVar2 = new zqt("PLAYER", 1);
        a = zqtVar2;
        zqt zqtVar3 = new zqt("PLAYLIST", 2);
        b = zqtVar3;
        zqt zqtVar4 = new zqt("SEARCH", 3);
        c = zqtVar4;
        zqt zqtVar5 = new zqt("COMMON", 4);
        d = zqtVar5;
        e = new zqt[]{zqtVar, zqtVar2, zqtVar3, zqtVar4, zqtVar5};
    }

    public static zqt valueOf(String str) {
        return (zqt) Enum.valueOf(zqt.class, str);
    }

    public static zqt[] values() {
        return (zqt[]) e.clone();
    }
}
