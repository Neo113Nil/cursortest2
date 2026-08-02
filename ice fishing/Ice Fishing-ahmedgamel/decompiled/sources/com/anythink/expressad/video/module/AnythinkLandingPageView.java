package com.anythink.expressad.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.video.signal.factory.b;

/* loaded from: classes.dex */
public class AnythinkLandingPageView extends AnythinkH5EndCardView {

    public static final class a implements com.anythink.core.express.web.a {
        private a() {
        }

        @Override // com.anythink.core.express.web.a
        public final boolean a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            y.a(t.b().g(), str);
            return true;
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    public AnythinkLandingPageView(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        d dVar = this.f22229b;
        if (dVar != null) {
            return dVar.af();
        }
        return null;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        byte b9 = 0;
        if (this.f22233f) {
            this.f22326s.setFilter(new a(b9));
        }
        super.preLoadData(bVar);
        setVisibility(0);
        setCloseVisible(0);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        try {
            h.a();
            com.anythink.core.express.d.a.a((WebView) this.f22326s, "webviewshow", "");
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public AnythinkLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
