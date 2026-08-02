package ru.yandex.music.network.response.exception;

import defpackage.dl6;

/* loaded from: classes6.dex */
public class PlaylistException extends Exception implements dl6 {
    private static final long serialVersionUID = -6870714775299757729L;
    private PlaylistError mPlaylistError;

    public PlaylistException(PlaylistError playlistError, Throwable th) {
        super(playlistError.getName(), th);
        this.mPlaylistError = playlistError;
    }

    @Override // defpackage.dl6
    public PlaylistException createCopy() {
        return new PlaylistException(this.mPlaylistError, this);
    }

    public PlaylistError getPlaylistError() {
        return this.mPlaylistError;
    }
}
