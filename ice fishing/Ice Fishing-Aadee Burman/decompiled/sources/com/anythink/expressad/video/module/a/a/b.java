package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;

/* loaded from: classes.dex */
public final class b extends d {
    private AnythinkVideoView ai;
    private AnythinkContainerView aj;

    public b(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.videocommon.c.c cVar, com.anythink.expressad.videocommon.b.c cVar2, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i, boolean z3) {
        super(dVar, cVar2, cVar, str, str2, aVar, i, z3);
        this.ai = anythinkVideoView;
        this.aj = anythinkContainerView;
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.Y = false;
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.d, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        if (this.Y) {
            if (i == 8) {
                AnythinkContainerView anythinkContainerView = this.aj;
                if (anythinkContainerView == null) {
                    AnythinkVideoView anythinkVideoView = this.ai;
                    if (anythinkVideoView != null) {
                        anythinkVideoView.showAlertView();
                    }
                } else if (anythinkContainerView.showAlertWebView()) {
                    AnythinkVideoView anythinkVideoView2 = this.ai;
                    if (anythinkVideoView2 != null) {
                        anythinkVideoView2.alertWebViewShowed();
                    }
                } else {
                    AnythinkVideoView anythinkVideoView3 = this.ai;
                    if (anythinkVideoView3 != null) {
                        anythinkVideoView3.showAlertView();
                    }
                }
            } else if (i == 107) {
                this.aj.showVideoClickView(-1);
                this.ai.setCover(false);
                this.ai.videoOperate(1);
            } else if (i == 112) {
                this.ai.setCover(true);
                this.ai.videoOperate(2);
            } else if (i == 115) {
                this.aj.resizeMiniCard(this.ai.getBorderViewWidth(), this.ai.getBorderViewHeight(), this.ai.getBorderViewRadius());
            }
        }
        super.a(i, obj);
    }
}
