package com.anythink.core.api;

/* loaded from: classes.dex */
public interface ATCustomVideo {
    String getVideoUrl();

    void reportVideoAutoStart();

    void reportVideoBreak(long j6);

    void reportVideoContinue(long j6);

    void reportVideoError(long j6, int i, int i6);

    void reportVideoFinish();

    void reportVideoPause(long j6);

    void reportVideoStart();

    void reportVideoStartError(int i, int i6);
}
