package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1780fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z3, int i);

    void AK1(int i);

    void AK6(EnumC1727et enumC1727et, int i);

    void AKF(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC1727et getStartReason();

    EnumC1782fm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z3);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z3);

    void setRequestedVolume(float f3);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC1783fn interfaceC1783fn);

    void setup(Uri uri);
}
