package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class zhd {
    public static final zhd a;
    public static final zhd b;
    public static final zhd c;
    public static final zhd d;
    public static final /* synthetic */ zhd[] e;

    static {
        zhd zhdVar = new zhd("REFRESHED", 0);
        a = zhdVar;
        zhd zhdVar2 = new zhd("NOTHING_CHANGED", 1);
        b = zhdVar2;
        zhd zhdVar3 = new zhd("SKIP_DUPLICATED", 2);
        c = zhdVar3;
        zhd zhdVar4 = new zhd("CANCELLED", 3);
        d = zhdVar4;
        e = new zhd[]{zhdVar, zhdVar2, zhdVar3, zhdVar4};
    }

    public static zhd valueOf(String str) {
        return (zhd) Enum.valueOf(zhd.class, str);
    }

    public static zhd[] values() {
        return (zhd[]) e.clone();
    }
}
