package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vik {
    public static final vik a;
    public static final vik b;
    public static final vik c;
    public static final vik d;
    public static final vik e;
    public static final vik f;
    public static final /* synthetic */ vik[] g;

    static {
        vik vikVar = new vik("ALBUM", 0);
        a = vikVar;
        vik vikVar2 = new vik("ARTIST", 1);
        vik vikVar3 = new vik("PLAYLIST", 2);
        b = vikVar3;
        vik vikVar4 = new vik("TRACK", 3);
        c = vikVar4;
        vik vikVar5 = new vik("MAIN", 4);
        d = vikVar5;
        vik vikVar6 = new vik("PODCAST_TAB", 5);
        vik vikVar7 = new vik("KIDS_TAB", 6);
        vik vikVar8 = new vik("DEEPLINK", 7);
        e = vikVar8;
        vik vikVar9 = new vik("DEBUG", 8);
        vik vikVar10 = new vik("PUSH", 9);
        vik vikVar11 = new vik("UNKNOWN", 10);
        f = vikVar11;
        g = new vik[]{vikVar, vikVar2, vikVar3, vikVar4, vikVar5, vikVar6, vikVar7, vikVar8, vikVar9, vikVar10, vikVar11};
    }

    public static vik valueOf(String str) {
        return (vik) Enum.valueOf(vik.class, str);
    }

    public static vik[] values() {
        return (vik[]) g.clone();
    }
}
