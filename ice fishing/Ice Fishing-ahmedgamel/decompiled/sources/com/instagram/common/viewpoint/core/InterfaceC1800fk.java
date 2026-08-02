package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1800fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z6, int i);

    void AK1(int i);

    void AK6(EnumC1747et enumC1747et, int i);

    void AKF(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC1747et getStartReason();

    EnumC1802fm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z6);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z6);

    void setRequestedVolume(float f2);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC1803fn interfaceC1803fn);

    void setup(Uri uri);
}
