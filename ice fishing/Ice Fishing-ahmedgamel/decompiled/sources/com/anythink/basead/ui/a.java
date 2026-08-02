package com.anythink.basead.ui;

import android.view.View;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.component.a;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.anythink.basead.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC0050a {
        void onProgressUpdate(long j6, long j9);

        void onVideoAdComplete();

        void onVideoAdStartPlay(long j6);

        void onVideoError(String str, String str2);
    }

    void destroyPlayerView(int i);

    long getVideoCurrentPosition();

    void initPlayerView(w wVar, x xVar, a.InterfaceC0056a interfaceC0056a, e eVar);

    void pauseVideo();

    void resumeVideo();

    void setATImproveClickViewController(com.anythink.basead.ui.improveclick.a aVar);

    void setAutoPlay(String str);

    void setIsMuted(boolean z6);

    void setPlayerOnClickListener(View.OnClickListener onClickListener);

    void setVideoListener(InterfaceC0050a interfaceC0050a);
}
