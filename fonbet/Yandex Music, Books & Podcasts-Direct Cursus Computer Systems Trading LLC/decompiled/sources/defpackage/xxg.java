package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xxg {
    public static final xxg a;
    public static final xxg b;
    public static final xxg c;
    public static final xxg d;
    public static final xxg e;
    public static final xxg f;
    public static final /* synthetic */ xxg[] g;

    static {
        xxg xxgVar = new xxg("SET_ANIMATION", 0);
        a = xxgVar;
        xxg xxgVar2 = new xxg("SET_PROGRESS", 1);
        b = xxgVar2;
        xxg xxgVar3 = new xxg("SET_REPEAT_MODE", 2);
        c = xxgVar3;
        xxg xxgVar4 = new xxg("SET_REPEAT_COUNT", 3);
        d = xxgVar4;
        xxg xxgVar5 = new xxg("SET_IMAGE_ASSETS", 4);
        e = xxgVar5;
        xxg xxgVar6 = new xxg("PLAY_OPTION", 5);
        f = xxgVar6;
        g = new xxg[]{xxgVar, xxgVar2, xxgVar3, xxgVar4, xxgVar5, xxgVar6};
    }

    public static xxg valueOf(String str) {
        return (xxg) Enum.valueOf(xxg.class, str);
    }

    public static xxg[] values() {
        return (xxg[]) g.clone();
    }
}
