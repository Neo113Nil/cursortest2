package com.anythink.core.api;

/* loaded from: classes.dex */
public interface ATCustomVideo {
    String getVideoUrl();

    void reportVideoAutoStart();

    void reportVideoBreak(long j9);

    void reportVideoContinue(long j9);

    void reportVideoError(long j9, int i, int i4);

    void reportVideoFinish();

    void reportVideoPause(long j9);

    void reportVideoStart();

    void reportVideoStartError(int i, int i4);
}
