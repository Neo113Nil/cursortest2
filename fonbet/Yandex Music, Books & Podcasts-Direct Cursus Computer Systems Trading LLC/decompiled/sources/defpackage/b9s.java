package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b9s {
    public static final b9s a;
    public static final b9s b;
    public static final b9s c;
    public static final b9s d;
    public static final b9s e;
    public static final b9s f;
    public static final b9s g;
    public static final /* synthetic */ b9s[] h;

    static {
        b9s b9sVar = new b9s("ALL", 0);
        a = b9sVar;
        b9s b9sVar2 = new b9s("UPSALE", 1);
        b9s b9sVar3 = new b9s("WHATS_NEW", 2);
        b9s b9sVar4 = new b9s("LANDING_ARTISTS_WIZARD", 3);
        b = b9sVar4;
        b9s b9sVar5 = new b9s("GDPR", 4);
        c = b9sVar5;
        b9s b9sVar6 = new b9s("LIKE_DIALOG", 5);
        d = b9sVar6;
        b9s b9sVar7 = new b9s("SEARCH_LYRICS_DIALOG", 6);
        b9s b9sVar8 = new b9s("LANDING_WAVE_ONBOARDING_POPUP", 7);
        e = b9sVar8;
        b9s b9sVar9 = new b9s("EXPANDED_PLAYER_TIMER_ONBOARDING", 8);
        b9s b9sVar10 = new b9s("ARTIST_SCREEN_ARTIST_PICK_POPUP", 9);
        f = b9sVar10;
        b9s b9sVar11 = new b9s("ARTISTS_TOP_ONBOARDING", 10);
        g = b9sVar11;
        h = new b9s[]{b9sVar, b9sVar2, b9sVar3, b9sVar4, b9sVar5, b9sVar6, b9sVar7, b9sVar8, b9sVar9, b9sVar10, b9sVar11, new b9s("CONCERT_TAB_ONBOARDING", 11), new b9s("NONE", 12)};
    }

    public static b9s valueOf(String str) {
        return (b9s) Enum.valueOf(b9s.class, str);
    }

    public static b9s[] values() {
        return (b9s[]) h.clone();
    }
}
