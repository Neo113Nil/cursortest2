package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public enum of {
    ALBUM(R.string.dialog_action_radio_album, "MyVibeAction.ALBUM"),
    PLAYLIST(R.string.dialog_action_radio_playlist, "MyVibeAction.PLAYLIST"),
    ARTIST(R.string.dialog_action_radio_artist, "MyVibeAction.ARTIST");

    public final int a;
    public final String b;

    of(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
