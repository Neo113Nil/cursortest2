package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ovu {
    public static final ovu a;
    public static final ovu b;
    public static final ovu c;
    public static final /* synthetic */ ovu[] d;

    static {
        ovu ovuVar = new ovu("SetPrev", 0);
        a = ovuVar;
        ovu ovuVar2 = new ovu("Replay", 1);
        b = ovuVar2;
        ovu ovuVar3 = new ovu("NotSet", 2);
        c = ovuVar3;
        d = new ovu[]{ovuVar, ovuVar2, ovuVar3};
    }

    public static ovu valueOf(String str) {
        return (ovu) Enum.valueOf(ovu.class, str);
    }

    public static ovu[] values() {
        return (ovu[]) d.clone();
    }
}
