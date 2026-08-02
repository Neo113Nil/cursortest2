package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class pmn {
    public static final pmn a;
    public static final pmn b;
    public static final pmn c;
    public static final pmn d;
    public static final pmn e;
    public static final pmn f;
    public static final /* synthetic */ pmn[] g;

    static {
        pmn pmnVar = new pmn("NO_MUSIC_DETECTED", 0);
        a = pmnVar;
        pmn pmnVar2 = new pmn("TRACK_NOT_FOUND", 1);
        b = pmnVar2;
        pmn pmnVar3 = new pmn("NETWORK_ERROR", 2);
        c = pmnVar3;
        pmn pmnVar4 = new pmn("MICROPHONE_ERROR", 3);
        d = pmnVar4;
        pmn pmnVar5 = new pmn("TIMEOUT", 4);
        e = pmnVar5;
        pmn pmnVar6 = new pmn("UNKNOWN", 5);
        f = pmnVar6;
        g = new pmn[]{pmnVar, pmnVar2, pmnVar3, pmnVar4, pmnVar5, pmnVar6};
    }

    public static pmn valueOf(String str) {
        return (pmn) Enum.valueOf(pmn.class, str);
    }

    public static pmn[] values() {
        return (pmn[]) g.clone();
    }
}
