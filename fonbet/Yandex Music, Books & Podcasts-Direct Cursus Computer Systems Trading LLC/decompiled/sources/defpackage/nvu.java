package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class nvu {
    public static final nvu a;
    public static final nvu b;
    public static final nvu c;
    public static final nvu d;
    public static final nvu e;
    public static final /* synthetic */ nvu[] f;

    static {
        nvu nvuVar = new nvu("SetNext", 0);
        a = nvuVar;
        nvu nvuVar2 = new nvu("Replay", 1);
        b = nvuVar2;
        nvu nvuVar3 = new nvu("ShouldFallBackToBeginning", 2);
        c = nvuVar3;
        nvu nvuVar4 = new nvu("SetLoadingRecommendations", 3);
        d = nvuVar4;
        nvu nvuVar5 = new nvu("NotSet", 4);
        e = nvuVar5;
        f = new nvu[]{nvuVar, nvuVar2, nvuVar3, nvuVar4, nvuVar5};
    }

    public static nvu valueOf(String str) {
        return (nvu) Enum.valueOf(nvu.class, str);
    }

    public static nvu[] values() {
        return (nvu[]) f.clone();
    }
}
