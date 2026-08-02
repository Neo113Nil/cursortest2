package com.miteksystems.misnap.workflow.view;

import android.media.MediaPlayer;

/* loaded from: classes4.dex */
public final /* synthetic */ class SuccessView$$ExternalSyntheticLambda1 implements MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = SuccessView.$r8$clinit;
        mediaPlayer.release();
    }
}
