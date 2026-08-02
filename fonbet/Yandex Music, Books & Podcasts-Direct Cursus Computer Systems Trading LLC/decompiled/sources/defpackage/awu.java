package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class awu {
    public static final awu a;
    public static final /* synthetic */ awu[] b;

    static {
        awu awuVar = new awu("FallBackToBeginning", 0);
        a = awuVar;
        b = new awu[]{awuVar};
    }

    public static awu valueOf(String str) {
        return (awu) Enum.valueOf(awu.class, str);
    }

    public static awu[] values() {
        return (awu[]) b.clone();
    }
}
