package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.signal.factory.IJSFactory;

/* loaded from: classes.dex */
public final class c extends d {
    private IJSFactory ai;

    public c(IJSFactory iJSFactory, com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.videocommon.c.c cVar, com.anythink.expressad.videocommon.b.c cVar2, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i, boolean z8) {
        super(dVar, cVar2, cVar, str, str2, aVar, i, z8);
        this.ai = iJSFactory;
        if (iJSFactory == null) {
            this.Y = false;
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.d, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        if (this.Y) {
            if (i != 8) {
                if (i == 105) {
                    this.ai.getJSNotifyProxy().a(3, obj.toString());
                    i = -1;
                } else if (i == 107) {
                    this.ai.getJSContainerModule().showVideoClickView(-1);
                    this.ai.getJSVideoModule().setCover(false);
                    this.ai.getJSVideoModule().videoOperate(1);
                } else if (i == 112) {
                    this.ai.getJSVideoModule().setCover(true);
                    this.ai.getJSVideoModule().videoOperate(2);
                } else if (i == 115) {
                    com.anythink.expressad.video.signal.j jSVideoModule = this.ai.getJSVideoModule();
                    this.ai.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (this.ai.getJSContainerModule().showAlertWebView()) {
                this.ai.getJSVideoModule().alertWebViewShowed();
            } else {
                this.ai.getJSVideoModule().showAlertView();
            }
        }
        super.a(i, obj);
    }
}
