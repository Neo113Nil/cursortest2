package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkClickMiniCardView;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private AnythinkClickMiniCardView f21922a;

    public g(AnythinkClickMiniCardView anythinkClickMiniCardView, com.anythink.expressad.video.module.a.a aVar) {
        super(aVar);
        this.f21922a = anythinkClickMiniCardView;
    }

    @Override // com.anythink.expressad.video.module.a.a.i, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        boolean z8 = false;
        switch (i) {
            case 100:
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21922a;
                if (anythinkClickMiniCardView != null) {
                    anythinkClickMiniCardView.webviewshow();
                    AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f21922a;
                    anythinkClickMiniCardView2.onSelfConfigurationChanged(anythinkClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z8 = true;
                break;
            case 103:
                i = 107;
                break;
        }
        if (z8) {
            return;
        }
        super.a(i, obj);
    }
}
