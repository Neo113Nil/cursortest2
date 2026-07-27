package com.anythink.basead.mixad.b;

import android.view.View;
import com.anythink.basead.ui.thirdparty.ThirdPartyNativeTemplateView;
import com.anythink.core.api.ATNativeAdInfo;

/* loaded from: classes.dex */
public final class e extends a implements com.anythink.core.common.l.c.a.d {

    /* renamed from: b, reason: collision with root package name */
    View f9660b;

    /* renamed from: c, reason: collision with root package name */
    ATNativeAdInfo.AdPrepareInfo f9661c;

    @Override // com.anythink.core.common.l.c.a.d
    public final View a() {
        com.anythink.core.common.l.e.a.a aVar = this.f9658a;
        if (aVar != null && this.f9660b == null) {
            View view = (View) aVar.a();
            this.f9660b = view;
            if (view instanceof ThirdPartyNativeTemplateView) {
                this.f9661c = ((ThirdPartyNativeTemplateView) view).getAdPrepareInfo();
            }
        }
        return this.f9660b;
    }

    @Override // com.anythink.core.common.l.c.a.d
    public final ATNativeAdInfo.AdPrepareInfo b() {
        return this.f9661c;
    }
}
