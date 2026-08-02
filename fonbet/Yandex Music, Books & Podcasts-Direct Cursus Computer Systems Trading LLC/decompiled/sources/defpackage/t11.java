package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t11 {
    public static final /* synthetic */ t11[] a = {new t11("UPCOMING_RELEASE", 0), new t11("LAST_RELEASE", 1), new t11("POPULAR_TRACKS", 2), new t11("FAMILIAR_YOU", 3), new t11("CONCERTS", 4), new t11("ABOUT", 5), new t11("PICK", 6), new t11("WAVE", 7), new t11("CLIPS", 8), new t11("DONATION", 9), new t11("BANDLINK_SCANNER", 10), new t11("DOWNLOADED_TRACKS", 11), new t11("DOWNLOADED_ALBUMS", 12), new t11("CONNECTIVITY_INFO_OFFLINE", 13), new t11("ARTIST_SIMILAR_ENTITIES", 14)};

    /* JADX INFO: Fake field, exist only in values array */
    t11 EF5;

    public static t11 valueOf(String str) {
        return (t11) Enum.valueOf(t11.class, str);
    }

    public static t11[] values() {
        return (t11[]) a.clone();
    }
}
