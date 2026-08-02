package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class lxs {
    public static final lxs a;
    public static final lxs b;
    public static final lxs c;
    public static final /* synthetic */ lxs[] d;

    static {
        lxs lxsVar = new lxs("Unknown", 0);
        a = lxsVar;
        lxs lxsVar2 = new lxs("LikedTrack", 1);
        b = lxsVar2;
        lxs lxsVar3 = new lxs("DislikedTrack", 2);
        c = lxsVar3;
        d = new lxs[]{lxsVar, lxsVar2, lxsVar3};
    }

    public static lxs valueOf(String str) {
        return (lxs) Enum.valueOf(lxs.class, str);
    }

    public static lxs[] values() {
        return (lxs[]) d.clone();
    }
}
