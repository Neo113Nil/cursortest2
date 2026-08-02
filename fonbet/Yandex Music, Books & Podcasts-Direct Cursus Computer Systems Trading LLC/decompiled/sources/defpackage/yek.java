package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yek {
    public static final yek a;
    public static final yek b;
    public static final yek c;
    public static final yek d;
    public static final yek e;
    public static final yek f;
    public static final /* synthetic */ yek[] g;

    static {
        yek yekVar = new yek("failedChallengeUnknown", 0);
        a = yekVar;
        yek yekVar2 = new yek("failedChallengeNoTriesLeft", 1);
        b = yekVar2;
        yek yekVar3 = new yek("needToUnbingSbpToken", 2);
        c = yekVar3;
        yek yekVar4 = new yek("sbpTokenBindingDuplicate", 3);
        d = yekVar4;
        yek yekVar5 = new yek("warning", 4);
        e = yekVar5;
        yek yekVar6 = new yek("payment_failed_but_new_attempt_allowed", 5);
        f = yekVar6;
        g = new yek[]{yekVar, yekVar2, yekVar3, yekVar4, yekVar5, yekVar6};
    }

    public static yek valueOf(String str) {
        return (yek) Enum.valueOf(yek.class, str);
    }

    public static yek[] values() {
        return (yek[]) g.clone();
    }
}
