package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fhl {
    public static final fhl a;
    public static final fhl b;
    public static final fhl c;
    public static final fhl d;
    public static final fhl e;
    public static final fhl f;
    public static final /* synthetic */ fhl[] g;

    static {
        fhl fhlVar = new fhl("WAVE_QUEUE", 0);
        a = fhlVar;
        fhl fhlVar2 = new fhl("GENERATIVE_QUEUE", 1);
        b = fhlVar2;
        fhl fhlVar3 = new fhl("FM_RADIO_QUEUE", 2);
        c = fhlVar3;
        fhl fhlVar4 = new fhl("VIDEO_WAVE_QUEUE", 3);
        d = fhlVar4;
        fhl fhlVar5 = new fhl("LOCAL_TRACKS_QUEUE", 4);
        e = fhlVar5;
        fhl fhlVar6 = new fhl("TYPE_NOT_SET", 5);
        f = fhlVar6;
        g = new fhl[]{fhlVar, fhlVar2, fhlVar3, fhlVar4, fhlVar5, fhlVar6};
    }

    public static fhl valueOf(String str) {
        return (fhl) Enum.valueOf(fhl.class, str);
    }

    public static fhl[] values() {
        return (fhl[]) g.clone();
    }
}
