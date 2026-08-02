package com.anythink.expressad.atsignalcommon.mraid;

import com.anythink.expressad.foundation.d.d;

/* loaded from: classes.dex */
public interface IMraidSignalCommunication {
    void close();

    void expand(String str, boolean z6);

    d getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z6);
}
