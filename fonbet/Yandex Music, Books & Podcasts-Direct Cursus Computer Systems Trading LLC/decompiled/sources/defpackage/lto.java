package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lto {
    public static final lto a;
    public static final lto b;
    public static final lto c;
    public static final /* synthetic */ lto[] d;

    static {
        lto ltoVar = new lto("NETWORK_UNMETERED", 0);
        a = ltoVar;
        lto ltoVar2 = new lto("DEVICE_IDLE", 1);
        b = ltoVar2;
        lto ltoVar3 = new lto("DEVICE_CHARGING", 2);
        c = ltoVar3;
        d = new lto[]{ltoVar, ltoVar2, ltoVar3};
    }

    public static lto valueOf(String str) {
        return (lto) Enum.valueOf(lto.class, str);
    }

    public static lto[] values() {
        return (lto[]) d.clone();
    }
}
