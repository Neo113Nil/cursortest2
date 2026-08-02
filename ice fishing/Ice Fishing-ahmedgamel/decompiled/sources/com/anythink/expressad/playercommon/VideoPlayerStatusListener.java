package com.anythink.expressad.playercommon;

/* loaded from: classes.dex */
public interface VideoPlayerStatusListener {
    void onBufferingEnd();

    void onBufferingStart(String str);

    void onPlayCompleted();

    void onPlayError(String str);

    void onPlayProgress(int i, int i4);

    void onPlayProgressMS(int i, int i4);

    void onPlaySetDataSourceError(String str);

    void onPlayStarted(int i);

    void onVideoDownloadResume();
}
