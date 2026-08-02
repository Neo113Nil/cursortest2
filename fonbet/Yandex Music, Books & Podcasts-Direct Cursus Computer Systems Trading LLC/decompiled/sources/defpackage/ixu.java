package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ixu {
    public static final ixu a;
    public static final ixu b;
    public static final ixu c;
    public static final /* synthetic */ ixu[] d;

    static {
        ixu ixuVar = new ixu("Disabled", 0);
        a = ixuVar;
        ixu ixuVar2 = new ixu("Enabled", 1);
        b = ixuVar2;
        ixu ixuVar3 = new ixu("ForceEnabled", 2);
        c = ixuVar3;
        d = new ixu[]{ixuVar, ixuVar2, ixuVar3};
    }

    public static ixu valueOf(String str) {
        return (ixu) Enum.valueOf(ixu.class, str);
    }

    public static ixu[] values() {
        return (ixu[]) d.clone();
    }
}
