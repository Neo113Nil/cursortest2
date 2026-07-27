package com.giderosmobile.android.player;

import android.media.MediaPlayer;

/* compiled from: GGMediaPlayerManager.java */
/* loaded from: classes.dex */
class OnCompletionListener implements MediaPlayer.OnCompletionListener {
    long backgroundChannel_;
    GGMediaPlayerManager manager_;

    public OnCompletionListener(GGMediaPlayerManager gGMediaPlayerManager, long j) {
        this.manager_ = gGMediaPlayerManager;
        this.backgroundChannel_ = j;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.manager_.onCompletion(this.backgroundChannel_);
    }
}
