package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: a, reason: collision with root package name */
    private Activity f22596a;

    /* renamed from: e, reason: collision with root package name */
    private AnythinkBTContainer f22597e;

    public i(Activity activity, AnythinkBTContainer anythinkBTContainer) {
        this.f22596a = activity;
        this.f22597e = anythinkBTContainer;
    }

    @Override // com.anythink.expressad.video.signal.a.b, com.anythink.expressad.video.signal.d
    public final void click(int i, String str) {
        super.click(i, str);
        AnythinkBTContainer anythinkBTContainer = this.f22597e;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.click(i, str);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.b, com.anythink.expressad.video.signal.d
    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        AnythinkBTContainer anythinkBTContainer = this.f22597e;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.handlerH5Exception(i, str);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.b, com.anythink.expressad.video.signal.b
    public final void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        AnythinkBTContainer anythinkBTContainer = this.f22597e;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.reactDeveloper(obj, str);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.b, com.anythink.expressad.video.signal.b
    public final void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
        AnythinkBTContainer anythinkBTContainer = this.f22597e;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.reportUrls(obj, str);
        } else {
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.b(obj, str);
        }
    }
}
