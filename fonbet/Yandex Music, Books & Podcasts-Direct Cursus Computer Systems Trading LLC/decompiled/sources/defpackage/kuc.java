package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kuc {
    public static final kuc a;
    public static final kuc b;
    public static final kuc c;
    public static final kuc d;
    public static final kuc e;
    public static final kuc f;
    public static final kuc g;
    public static final kuc h;
    public static final kuc i;
    public static final /* synthetic */ kuc[] j;

    static {
        kuc kucVar = new kuc("PENALTY_LOG", 0);
        a = kucVar;
        kuc kucVar2 = new kuc("PENALTY_DEATH", 1);
        b = kucVar2;
        kuc kucVar3 = new kuc("DETECT_FRAGMENT_REUSE", 2);
        c = kucVar3;
        kuc kucVar4 = new kuc("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = kucVar4;
        kuc kucVar5 = new kuc("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = kucVar5;
        kuc kucVar6 = new kuc("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = kucVar6;
        kuc kucVar7 = new kuc("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = kucVar7;
        kuc kucVar8 = new kuc("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = kucVar8;
        kuc kucVar9 = new kuc("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = kucVar9;
        j = new kuc[]{kucVar, kucVar2, kucVar3, kucVar4, kucVar5, kucVar6, kucVar7, kucVar8, kucVar9};
    }

    public static kuc valueOf(String str) {
        return (kuc) Enum.valueOf(kuc.class, str);
    }

    public static kuc[] values() {
        return (kuc[]) j.clone();
    }
}
