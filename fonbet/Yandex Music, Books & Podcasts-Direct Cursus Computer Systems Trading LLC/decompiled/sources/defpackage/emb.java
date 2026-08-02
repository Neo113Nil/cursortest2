package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class emb {
    public static final /* synthetic */ emb[] a = {new emb("PersonalResults", 0), new emb("ArtistPersonalResults", 1), new emb("PodcastResults", 2), new emb("PromoStories", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    emb EF5;

    public static emb valueOf(String str) {
        return (emb) Enum.valueOf(emb.class, str);
    }

    public static emb[] values() {
        return (emb[]) a.clone();
    }
}
