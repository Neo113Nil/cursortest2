package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class kbq {
    public static final kbq a;
    public static final kbq b;
    public static final kbq c;
    public static final /* synthetic */ kbq[] d;

    static {
        kbq kbqVar = new kbq("START", 0);
        a = kbqVar;
        kbq kbqVar2 = new kbq("STOP", 1);
        b = kbqVar2;
        kbq kbqVar3 = new kbq("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = kbqVar3;
        d = new kbq[]{kbqVar, kbqVar2, kbqVar3};
    }

    public static kbq valueOf(String str) {
        return (kbq) Enum.valueOf(kbq.class, str);
    }

    public static kbq[] values() {
        return (kbq[]) d.clone();
    }
}
