package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wre {
    public static final wre a;
    public static final wre b;
    public static final wre c;
    public static final wre d;
    public static final /* synthetic */ wre[] e;

    static {
        wre wreVar = new wre("Tap", 0);
        a = wreVar;
        wre wreVar2 = new wre("LongTap", 1);
        b = wreVar2;
        wre wreVar3 = new wre("DoubleTap", 2);
        c = wreVar3;
        wre wreVar4 = new wre("Pan", 3);
        wre wreVar5 = new wre("Swipe", 4);
        d = wreVar5;
        e = new wre[]{wreVar, wreVar2, wreVar3, wreVar4, wreVar5};
    }

    public static wre valueOf(String str) {
        return (wre) Enum.valueOf(wre.class, str);
    }

    public static wre[] values() {
        return (wre[]) e.clone();
    }
}
