package defpackage;

/* loaded from: classes3.dex */
public enum gkb {
    Album("album"),
    Artist("artist"),
    Playlist("playlist"),
    Track("track"),
    Auth("auth"),
    PodcastTab("podcast_tab"),
    /* JADX INFO: Fake field, exist only in values array */
    PodcastTabTrigger("podcast_tab_trigger"),
    /* JADX INFO: Fake field, exist only in values array */
    AudiobookTab("audiobook_tab"),
    KidsTab("kids_tab"),
    Deeplink("deeplink"),
    /* JADX INFO: Fake field, exist only in values array */
    PreTrial("pre_trial"),
    Debug("debug"),
    Push("push"),
    Unknown("unknown");

    public final String a;

    gkb(String str) {
        this.a = str;
    }
}
