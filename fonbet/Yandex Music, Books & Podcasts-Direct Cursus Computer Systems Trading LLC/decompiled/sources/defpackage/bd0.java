package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bd0 {
    public static final /* synthetic */ bd0[] a = {new bd0("OFFLINE_TAB", 0), new bd0("TABS", 1), new bd0("MY_VIBE", 2), new bd0("NEW_RELEASES", 3), new bd0("WAVES", 4), new bd0("SETS_BY_WAVES", 5), new bd0("COLLECTION_WAVE", 6), new bd0("COLLECTION_FAVOURITE_PLAYLIST", 7), new bd0("COLLECTION_SECTIONS", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    bd0 EF5;

    public static bd0 valueOf(String str) {
        return (bd0) Enum.valueOf(bd0.class, str);
    }

    public static bd0[] values() {
        return (bd0[]) a.clone();
    }
}
