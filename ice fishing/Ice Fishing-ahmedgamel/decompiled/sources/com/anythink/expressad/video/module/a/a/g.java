package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkClickMiniCardView;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private AnythinkClickMiniCardView f22551a;

    public g(AnythinkClickMiniCardView anythinkClickMiniCardView, com.anythink.expressad.video.module.a.a aVar) {
        super(aVar);
        this.f22551a = anythinkClickMiniCardView;
    }

    @Override // com.anythink.expressad.video.module.a.a.i, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        boolean z6 = false;
        switch (i) {
            case 100:
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22551a;
                if (anythinkClickMiniCardView != null) {
                    anythinkClickMiniCardView.webviewshow();
                    AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f22551a;
                    anythinkClickMiniCardView2.onSelfConfigurationChanged(anythinkClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z6 = true;
                break;
            case 103:
                i = 107;
                break;
        }
        if (z6) {
            return;
        }
        super.a(i, obj);
    }
}
